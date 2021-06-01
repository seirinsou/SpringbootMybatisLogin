package com.example.demo.information.mapper;

import org.springframework.stereotype.Repository;
import com.example.demo.information.model.UpdateInformationInDTO;
import com.example.demo.information.model.UpdateInformationOutDTO;

@Repository
public interface UpdateInformationMapper {
    
    public UpdateInformationOutDTO findAllByIdx(Integer idx);
    
    public int update(UpdateInformationInDTO updateInforIn);

}
