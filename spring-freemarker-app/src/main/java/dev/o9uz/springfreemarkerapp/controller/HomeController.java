package dev.o9uz.springfreemarkerapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "world");
        return "hello";
    }
}
