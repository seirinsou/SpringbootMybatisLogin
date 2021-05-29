package com.example.demo.information.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.information.model.SaveInformationDTO;
import com.example.demo.information.model.SearchInformationDTO;

@Repository
public interface InformationMapper {

    public int add(SaveInformationDTO InforDTO);
    
    public List<SearchInformationDTO> findAllByName(String name);
    
    public List<SearchInformationDTO> findAllByIdx(Integer idx);
    
    public int update(SearchInformationDTO searchinfor);
    
    public int delete(Integer idx);

}
