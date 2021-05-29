package com.example.demo.user.mapper;

import org.springframework.stereotype.Repository;

import com.example.demo.user.model.RegisterUserDTO;

@Repository
public interface RegisterMapper {

    public int add(RegisterUserDTO registerDTO);
}
