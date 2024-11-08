package org.example.demo_2.controller;

import jakarta.validation.Valid;
import org.example.demo_2.dto.GiaoDichDto;
import org.example.demo_2.model.GiaoDich;
import org.example.demo_2.service.IGiaoDichService;
import org.example.demo_2.service.IKhachHangService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/giaoDichs")

public class GiaoDichController {
    @Autowired
    private IGiaoDichService giaoDichService;
    @Autowired
    private IKhachHangService khachHangService;

    @GetMapping("")
    public String showGiaoDich(Model model, @PageableDefault(page = 0, size = 1) Pageable pageable,
                               @RequestParam(required = false, defaultValue = "", name = "name") String name) {
        Page<GiaoDich> giaoDichs = giaoDichService.findByName(pageable,name);
        model.addAttribute("giaoDichs", giaoDichs);
        model.addAttribute("name", name);

        return "list";
    }


    @GetMapping("/create")

    public String showCreateGiaoDich(Model model) {
        model.addAttribute("giaoDichDto", new GiaoDichDto());
        model.addAttribute("khachHang", khachHangService.fiAll());
        return "create";
    }

    @PostMapping("/create")
    public String createGiaoDich(@Valid @ModelAttribute GiaoDichDto giaoDichDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        new GiaoDichDto().validate(giaoDichDto,bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("khachHang", khachHangService.fiAll());
            return "create";
        }
        GiaoDich giaoDich = new GiaoDich();
        BeanUtils.copyProperties(giaoDichDto,giaoDich);
        giaoDichService.save(giaoDich);
        redirectAttributes.addFlashAttribute("mess","them moi thanh cong");
        return "redirect:/giaoDichs";

    }

    @PostMapping("/delete")
    public String delete(@RequestParam Integer id, RedirectAttributes redirectAttributes) {
        GiaoDich giaoDich = giaoDichService.findById(id);
        giaoDichService.delete(giaoDich);
        redirectAttributes.addAttribute("mess", "xoa thanh cong");
        return "redirect:/giaoDichs";
    }

}
