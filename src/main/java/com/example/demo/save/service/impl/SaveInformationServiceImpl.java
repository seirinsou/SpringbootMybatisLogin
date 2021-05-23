package com.example.demo.save.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.AddInformation;
import com.example.demo.save.mapper.SaveInformationMapper;
import com.example.demo.save.service.SaveInformationService;

@Service
public class SaveInformationServiceImpl implements SaveInformationService {

    @Autowired
    SaveInformationMapper saveInformationMapper;

    @Override
    @Transactional
    public int add(AddInformation addinfor) {
        return saveInformationMapper.add(addinfor);
    }
}