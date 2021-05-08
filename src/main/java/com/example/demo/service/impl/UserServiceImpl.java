package com.example.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User login(User user ) {
		return userMapper.login(user.getUserName(), user.getPassword());
	}

	@Override
	public User findUser(User user) {
		return userMapper.login(user.getUserName(), user.getPassword());
	}
	

}
