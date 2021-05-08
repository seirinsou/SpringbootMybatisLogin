package com.example.demo.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
//@Validated
public class LoginController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String init(@ModelAttribute User user) {
		return "login";
	}

	@PostMapping("/form")
	public String login(@ModelAttribute @Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> list = result.getAllErrors();
			String sum = "";
			for (ObjectError i : list) {
				sum = sum + i.getCode() + ":" + i.getDefaultMessage() + "<br>" ;
			}
			user.setMessage(sum);
			return "login";
		}
		User us = userService.findUser(user);
		if (us != null) {
			return "top";
		}
		user.setMessage("用户名或密码错误！");
		return "login";

	}

}
