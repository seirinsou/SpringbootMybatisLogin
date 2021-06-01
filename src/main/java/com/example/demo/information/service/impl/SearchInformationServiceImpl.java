package com.example.demo.information.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.information.mapper.SearchInformationMapper;
import com.example.demo.information.model.SearchInformationOutDTO;
import com.example.demo.information.service.SearchInformationService;

@Service("SearchInformationService")
public class SearchInformationServiceImpl implements SearchInformationService {

    @Autowired
    SearchInformationMapper searchInformationMapper;

    @Override
    public List<SearchInformationOutDTO> findAllByName(String name) {
        return searchInformationMapper.findAllByName(name);
    }

}
