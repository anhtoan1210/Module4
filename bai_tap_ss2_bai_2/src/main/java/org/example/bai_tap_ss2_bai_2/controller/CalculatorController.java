package org.example.bai_tap_ss2_bai_2.controller;

import org.example.bai_tap_ss2_bai_2.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService calculatorService;

    @GetMapping("/home-calculator")
    public String home() {
        return "home-calculator";
    }

    @GetMapping("/total")
    public String total(@RequestParam(value = "firstNumber", required = false) int firstNumber,
                        @RequestParam(value = "firstNumber", required = false) int secondNumber,
                        @RequestParam(value = "firstNumber", required = false) int allowable,
                        Model model) {
        double result = calculatorService.total(firstNumber, secondNumber, String.valueOf(allowable));
        model.addAttribute("firstNum", firstNumber);
        model.addAttribute("secondNum", secondNumber);
        model.addAttribute("result", result);
        return "home-calculator";
    }
}
