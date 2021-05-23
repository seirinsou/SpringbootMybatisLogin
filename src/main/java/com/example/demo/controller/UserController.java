package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.AddInformation;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/Homepage")
    public String homepage(Model model, @ModelAttribute User user) {

        User user1 = userService.queryByUserName(user.getUserName());
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

    @RequestMapping("/list")
    public String displayList(Model model) {
        List<AddInformation> informationList = userService.queryAll();
        model.addAttribute("informationList", informationList);
        return "list";
    }

    @RequestMapping("/Register")
    public String register(Model model) {
        return "register";
    }

    @RequestMapping("/toRegister")
    public String toRegister(Model model, @ModelAttribute User user) {

        int add = userService.add(user);
        System.out.println("插入数据成功");
        model.addAttribute("message", "注册成功，请登录");
        return "login";
    }

    @RequestMapping("/addInformation")
    public String addInformation(Model model) {
        return "addInformation";
    }

    @RequestMapping("/checkInformation")
    public String checkInformation(Model model, @ModelAttribute AddInformation addinfor) {
        model.addAttribute("addinfor", addinfor);
        return "checkInformation";
    }

    @RequestMapping("/saveInformation")
    public String saveInformation(Model model, @ModelAttribute AddInformation addinfor) {
        int add1 = userService.add1(addinfor);
        model.addAttribute("addinfor", addinfor);
        model.addAttribute("message", "数据保存成功");
        return "saveInformation";
    }
}