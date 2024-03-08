package org.example.bai_tap_ss1_bai_2.controllers;

import org.example.bai_tap_ss1_bai_2.services.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryService {
    @Autowired
    private IDictionaryService dictionaryService;

    @GetMapping("/dictionary")
    public String dictionary() {
        return "/display";
    }

    @PostMapping("/message")
    public String dictionaryShow(@RequestParam String vocabulary, Model model) {
        String result = dictionaryService.result(vocabulary);
        if (result == null) {
            model.addAttribute("message", "Từ này không có trong từ điển");
        } else {
            model.addAttribute(" result", "Tu tren có nghĩa là" + result);

        }
        return "/display";
    }
}
