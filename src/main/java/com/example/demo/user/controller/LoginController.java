package com.example.demo.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.user.model.UserLoginDTO;
import com.example.demo.user.service.LoginService;

@Controller("LoginController")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    //ユーザー登録
    @RequestMapping("/doLogin")
    public String homepage(Model model, @ModelAttribute UserLoginDTO userDTO, HttpServletRequest request) {
        String userId = request.getParameter("userName");
        UserLoginDTO userLog = loginService.queryByUserName(userDTO.getUserName());
        if (userLog != null) {
            if (userLog.getPassword().equals(userDTO.getPassword())) {
                System.out.println(userLog.toString());
                HttpSession session = request.getSession();
                session.setAttribute("userId",userId);
                model.addAttribute("message", "登陆成功");
                return "redirect:/search";
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
