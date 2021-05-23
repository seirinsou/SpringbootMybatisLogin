package com.example.demo.register.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;
import com.example.demo.register.service.RegisterService;

@Controller
public class RegisterController {
    @Autowired
    RegisterService registerService;

@RequestMapping("/Register")
    public String register(Model model) {
        return "register";
    }

    @RequestMapping("/toRegister")
    public String toRegister(Model model, @ModelAttribute User user) {

        int add = registerService.add(user);
        System.out.println("插入数据成功");
        model.addAttribute("message", "注册成功，请登录");
        return "login";
    }
}