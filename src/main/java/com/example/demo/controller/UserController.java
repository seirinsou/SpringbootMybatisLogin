package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/toLogin")
	 public String toLogin() {
	  return "login";
	 }
	 
	 @RequestMapping("/loginSuccess")
	 public String loginSuccess(Model model, User user) {

	  User user1 = userService.queryByUserName(user.getUserName());
	  if (user1 != null) {
	   if (user1.getPassword().equals(user.getPassword())) {
	    System.out.println(user1.toString());
	    return "success";
	   } else {
	    model.addAttribute("data", "密码不正确");
	    return "login";
	   }
	 
	  } else {
	   model.addAttribute("data", "该用户不存在，请先注册");
	   return "login";
	  }
	 }
	 
	 @RequestMapping("/toRegister")
	 public String toRegister() {
	  return "register";
	 }
	 
	 @RequestMapping("/toRegisterSuccess")
	 public String toRegisterSuccess(Model model,User user) {

	  int add = userService.add(user);
	  System.out.println("插入数据成功");
	  model.addAttribute("data","注册成功，请登录");
	  return "login";
	 
	 }
	}