package com.example.demo.information.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.information.mapper.InformationMapper;
import com.example.demo.information.model.SaveInformationDTO;
import com.example.demo.information.model.SearchInformationDTO;
import com.example.demo.information.service.InformationService;

@Service("InformationService")
public class InformationServiceImpl implements InformationService {

    @Autowired
    InformationMapper informationMapper;

    @Override
    @Transactional
    public int add(SaveInformationDTO InforDTO) {
        return informationMapper.add(InforDTO);
    }
    
    @Override
    public List<SearchInformationDTO> findAllByName(String name) {
        return informationMapper.findAllByName(name);
    }
    @Override
    public List<SearchInformationDTO> findAllByIdx(Integer idx){
        return informationMapper.findAllByIdx(idx);
    }
    @Override
    public int update(SearchInformationDTO searchinfor) {
        return informationMapper.update(searchinfor);
    }
    @Override
    public int delete(Integer idx) {
        return informationMapper.delete(idx);
    }

}