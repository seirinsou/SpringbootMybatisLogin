package com.example.demo.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.information.mapper.UpdateInformationMapper;
import com.example.demo.information.model.UpdateInformationInDTO;
import com.example.demo.information.model.UpdateInformationOutDTO;
import com.example.demo.information.service.UpdateInformationService;

@Service("UpdateInformationService")
public class UpdateInformationServiceImpl implements UpdateInformationService {

    @Autowired
    UpdateInformationMapper updateInformationMapper;

    @Override
    public UpdateInformationOutDTO findAllByIdx(Integer idx){
        return updateInformationMapper.findAllByIdx(idx);
    }
    @Override
    public int update(UpdateInformationInDTO updateInforIn) {
        UpdateInformationOutDTO updateInforOutDTO = findAllByIdx(updateInforIn.getIdx());
        updateInforOutDTO.setName(updateInforIn.getName());
        updateInforOutDTO.setAddress(updateInforIn.getAddress());
        updateInforOutDTO.setApplicationDate(updateInforIn.getApplicationDate());
        updateInforOutDTO.setBornDate(updateInforIn.getBornDate());
        updateInforOutDTO.setManager(updateInforIn.getManager());
        updateInforOutDTO.setNetPlan(updateInforIn.getNetPlan());
        updateInforOutDTO.setNetType(updateInforIn.getNetType());
        updateInforOutDTO.setNotes(updateInforIn.getNotes());
        updateInforOutDTO.setPhoneNumber(updateInforIn.getPhoneNumber());
        updateInforOutDTO.setPostcode(updateInforIn.getPostcode());
        updateInforOutDTO.setSex(updateInforIn.getSex());
        return updateInformationMapper.update(updateInforIn);
    }

}