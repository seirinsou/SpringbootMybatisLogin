package com.example.demo.register.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.register.model.User;

@Repository
public interface RegisterMapper {

    public int add(User user);
}
