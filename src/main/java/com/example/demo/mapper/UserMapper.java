package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Mapper
@Repository
public interface UserMapper {
	public List<User> queryAll();
	 
	 public int add(User user);

	 public User queryByUserName(String userName);
}
