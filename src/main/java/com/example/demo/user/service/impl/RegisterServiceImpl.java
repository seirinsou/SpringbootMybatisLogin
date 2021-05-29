package com.example.demo.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.user.mapper.RegisterMapper;
import com.example.demo.user.model.RegisterUserDTO;
import com.example.demo.user.service.RegisterService;

@Service("RegisterService")
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    RegisterMapper registerMapper;

    @Override
    @Transactional
    public int add(RegisterUserDTO registerDTO) {
        return registerMapper.add(registerDTO);
    }

}
