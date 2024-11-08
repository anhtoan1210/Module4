package org.example.demo_thi.controller;

import jakarta.validation.Valid;
import org.example.demo_thi.dto.DuAnDto;
import org.example.demo_thi.model.DoanhNghiep;
import org.example.demo_thi.model.DuAn;
import org.example.demo_thi.service.IDoanhNghiepService;
import org.example.demo_thi.service.IDuAnService;
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
@RequestMapping("/duAns")

public class DuAnController {
    @Autowired
    private IDoanhNghiepService doanhNghiepService;

    @Autowired
    private IDuAnService duAnService;

    @GetMapping("")
    public String showDuAn(Model model, @PageableDefault(page = 0, size = 1) Pageable pageable,
                           @RequestParam(required = false, defaultValue = "", name = "name") String name) {
        Page<DuAn> duAns = duAnService.findByName(pageable,name);
        model.addAttribute("duAns", duAns);
        model.addAttribute("name", name);
        return "list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("duAnDto", new DuAnDto());
        model.addAttribute("doanhNghiep", doanhNghiepService.findAll());
        return "create";
    }

    @PostMapping("/create")
    public String createDuAn(@Valid @ModelAttribute DuAnDto duAnDto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        new DuAnDto().validate(duAnDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("doanhNghiep", doanhNghiepService.findAll());
            return "create";
        }
        DuAn duAn = new DuAn();
        DoanhNghiep doanhNghiep = new DoanhNghiep();
        doanhNghiep.setId(1);
        duAn.setDoanhNghiep(doanhNghiep);
        BeanUtils.copyProperties(duAnDto, duAn);

        duAnService.save(duAn);
        redirectAttributes.addFlashAttribute("mess", "them moi thanh cong");
        return "redirect:/duAnS";
    }
}
