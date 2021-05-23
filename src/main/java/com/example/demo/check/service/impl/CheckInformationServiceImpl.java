package com.example.demo.check.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.check.mapper.CheckInformationMapper;
import com.example.demo.check.service.CheckInformationService;
import com.example.demo.model.AddInformation;

@Service
public class CheckInformationServiceImpl implements CheckInformationService {

    @Autowired
    CheckInformationMapper checkInformationMapper;

    @Override
    @Transactional
    public int add(AddInformation addinfor) {
        return checkInformationMapper.add(addinfor);
    }

}
