package com.example.demo.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.information.mapper.AddInformationMapper;
import com.example.demo.information.model.AddInformationInDTO;
import com.example.demo.information.service.AddInformationService;

@Service("AddInformationService")
public class AddInformationServiceImpl implements AddInformationService {

    @Autowired
    AddInformationMapper addInformationMapper;

    @Override
    @Transactional
    public int add(AddInformationInDTO addInforIn) {
        return addInformationMapper.add(addInforIn);
    }

}
