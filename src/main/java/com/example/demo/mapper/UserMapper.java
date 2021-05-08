package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Mapper
@Repository
public interface UserMapper {
	User login(@Param("user_name") String username, @Param("password") String password);
}
