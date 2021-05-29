package com.example.demo.information.service;

import java.util.List;

import com.example.demo.information.model.SaveInformationDTO;
import com.example.demo.information.model.SearchInformationDTO;

public interface InformationService {

    public int add(SaveInformationDTO InforDTO);
    
    public List<SearchInformationDTO> findAllByName(String name);
    
    public List<SearchInformationDTO> findAllByIdx(Integer idx);
    
    public int update(SearchInformationDTO searchinfor);
    
    public int delete(Integer idx);

}
