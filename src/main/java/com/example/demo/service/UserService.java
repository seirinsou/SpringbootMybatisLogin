package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	public List<User> queryAll();

	public int add(User user);

	public User queryByUserName(String userName);

}
