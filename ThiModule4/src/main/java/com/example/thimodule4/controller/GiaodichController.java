package com.example.thimodule4.controller;

import com.example.thimodule4.model.Giaodich;
import com.example.thimodule4.model.GiaodichDto;
import com.example.thimodule4.model.Khachhang;
import com.example.thimodule4.service.IGiaodichService;
import com.example.thimodule4.service.IKhachhangService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/giaodich")
public class GiaodichController {
    @Autowired
    private IGiaodichService giaodichService;
    @Autowired
    private IKhachhangService khachhangService;
    @GetMapping("")
    public String showList(Model model, @RequestParam(required = false) String name, @RequestParam(required = false) Integer khachhang , @RequestParam(required = false, defaultValue = "0")int page) {
        Pageable pageable = PageRequest.of(page,2);
        Page<Giaodich> list;
        if(name != null ){
            list = giaodichService.search(pageable,name,khachhang);
        }else {
            list = giaodichService.hienThi(pageable);
        }
        model.addAttribute("list",list);
        model.addAttribute("listKhachhang",khachhangService.hienThi());
        model.addAttribute("name",name);
        model.addAttribute("khachhang",khachhang);
        return "list";
    }

    @GetMapping("/create")
    public String themMoi(Model model){
        List<Khachhang> listKhachhang = khachhangService.hienThi();
        model.addAttribute("listKhachhang", listKhachhang);
        model.addAttribute("giaodich", new Giaodich());
        return "create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("giaodich") GiaodichDto giaodichDto, BindingResult bindingResult, Model model) {
        new GiaodichDto().validate(giaodichDto,bindingResult);
        if (bindingResult.hasErrors()){
            model.addAttribute("listKhachhang",khachhangService.hienThi());
            return "create";
        }
        Giaodich giaodich = new Giaodich();
        BeanUtils.copyProperties(giaodichDto,giaodich);
        giaodichService.themMoi(giaodich);
        return "redirect:/giaodich";
    }
}
