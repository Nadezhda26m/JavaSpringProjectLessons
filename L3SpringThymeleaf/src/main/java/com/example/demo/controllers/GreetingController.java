package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GreetingController {

    @RequestMapping
    public String home() {
        return "index";
    }

    @GetMapping("/greetingJS")
    public String greetingJS(Model model) {
        return "greetingJS";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        model.addAttribute("message", "Привет, Thymeleaf!");
        return "greeting";
    }
}


