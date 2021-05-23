package com.example.demo.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.home.service.LoginService;
import com.example.demo.model.User;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/Homepage")
    public String homepage(Model model, @ModelAttribute User user) {
        User user1 = loginService.queryByUserName(user.getUserName());
        if (user1 != null) {
            if (user1.getPassword().equals(user.getPassword())) {
                System.out.println(user1.toString());
                model.addAttribute("message", "登陆成功");
                return "homepage";
            } else {
                model.addAttribute("message", "密码不正确");
                return "login";
            }
        } else {
            model.addAttribute("message", "该用户不存在，请先注册");
            return "login";
        }
    }

}
