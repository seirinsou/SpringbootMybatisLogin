package com.example.demo.information.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.information.mapper.DeleteInformationMapper;
import com.example.demo.information.model.DeleteInformationOutDTO;
import com.example.demo.information.service.DeleteInformationService;

@Service("DeleteInformationService")
public class DeleteInformationServiceImpl implements DeleteInformationService {

    @Autowired
    DeleteInformationMapper deleteInformationMapper;

    @Override
    public DeleteInformationOutDTO findByIdx(Integer idx) {
        return deleteInformationMapper.findByIdx(idx);
    }

    @Override
    public int delete(Integer idx) {
        return deleteInformationMapper.delete(idx);
    }

}
