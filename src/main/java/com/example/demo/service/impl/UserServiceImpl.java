package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> queryAll() {
		return userMapper.queryAll();
	}

	@Override
	public int add(User user) {
		return userMapper.add(user);
	}

	@Override
	public User queryByUserName(String userName) {
		return userMapper.queryByUserName(userName);
	}
}
