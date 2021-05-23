package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.User;

@Controller
@Validated
public class HomeController {

    @GetMapping("/form")
    private String login(@ModelAttribute User user) {
        return "login";
    }

    @PostMapping("/form")
    private String top(@Valid @ModelAttribute User user) {
        return "top";
    }
}