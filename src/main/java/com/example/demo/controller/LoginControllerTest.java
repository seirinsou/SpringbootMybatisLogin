package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/test")
public class LoginControllerTest {

	// 自动装载Getter和Setter
	@Autowired
	private UserService userService;

	@RequestMapping("/findUser")
	public List<User> findAll(@ModelAttribute User user) {
		List<User> findUser = new ArrayList<>();
		findUser.add(userService.findUser(user));
		return findUser;
	}

}
