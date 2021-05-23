package com.example.demo.add.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.add.mapper.AddInformationMapper;
import com.example.demo.add.service.AddInformationService;
import com.example.demo.model.AddInformation;

@Service
public class AddInformationServiceImpl implements AddInformationService{

        @Autowired
        AddInformationMapper addInformationMapper;

        @Override
        @Transactional
        public int add(AddInformation addinfor) {
            return addInformationMapper.add(addinfor);
        }

}
