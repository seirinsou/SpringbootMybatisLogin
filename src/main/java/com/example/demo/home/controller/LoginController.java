package com.example.demo.home.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.home.service.LoginService;
import com.example.demo.home.model.AddInformation;
import com.example.demo.home.model.User;

@Controller("LoginController")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }
    //ユーザー登録
    @RequestMapping("/homepage")
    public String homepage(Model model, @ModelAttribute User user) {
        User userLog = loginService.queryByUserName(user.getUserName());
        if (userLog != null) {
            if (userLog.getPassword().equals(user.getPassword())) {
                System.out.println(userLog.toString());
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
    //查询
    @RequestMapping("/search")
    public String displayList(Model model,
            @ModelAttribute User user,AddInformation addinformation) {
        if((String) model.asMap().get("message")!=null) {
            model.addAttribute("message",(String) model.asMap().get("message"));
        }
        List<AddInformation> informationList = loginService.findAllByName(addinformation.getName());
        model.addAttribute("informationList", informationList);
        model.addAttribute("user",user);
        
        return "homepage";
    }
    //改
    @RequestMapping("/update")
    public String updateInformation(Model model,RedirectAttributes attributes,AddInformation addInformation,User user){
        return "update";
    }
    @RequestMapping("/toupinfor")
    public String toupinfor(Model model,RedirectAttributes attributes,AddInformation addInformation,User user){
        loginService.update(addInformation);
        attributes.addFlashAttribute("message", "情報更新完了");
        attributes.addFlashAttribute("user",user);
        return "redirect:/search";
    }
    //削除
    @RequestMapping("/deleinfor")
    public String deleInfor(Model model,@ModelAttribute User user, String name) {
        loginService.delete(name);
        model.addAttribute("user",user);
        return "homepage";
    }


}
