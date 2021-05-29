package com.example.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.user.model.RegisterUserDTO;
import com.example.demo.user.service.RegisterService;

@Controller("RegisterController")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @RequestMapping("/register")
    public String register(Model model) {
        return "register";
    }

    @RequestMapping("/toRegister")
    public String toRegister(Model model, RedirectAttributes attributes,@ModelAttribute RegisterUserDTO registerDTO) {
        int add = registerService.add(registerDTO);
        System.out.println("插入数据成功");
        attributes.addFlashAttribute("message", "注册成功，请登录");
        return "redirect:/login";
    }
}