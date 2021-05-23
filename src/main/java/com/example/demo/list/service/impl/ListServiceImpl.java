package com.example.demo.list.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.list.mapper.ListMapper;
import com.example.demo.list.service.ListService;
import com.example.demo.model.AddInformation;

@Service
public class ListServiceImpl implements ListService {

    @Autowired
    ListMapper listMapper;

    @Override
    public List<AddInformation> queryAll() {
        return listMapper.queryAll();
    }
}