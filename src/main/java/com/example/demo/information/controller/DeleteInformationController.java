package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.information.model.DeleteInformationInDTO;
import com.example.demo.information.model.DeleteInformationOutDTO;
import com.example.demo.information.service.DeleteInformationService;

@Controller("DeleteInformationController")
public class DeleteInformationController {
    
    @Autowired
    DeleteInformationService deleteInformationService;
    
    @RequestMapping("delete")
    public String toDeleteCheck(Model model,@ModelAttribute DeleteInformationOutDTO delInforOut, DeleteInformationInDTO delInforIn){
        DeleteInformationOutDTO delInforOutDTO = deleteInformationService.findByIdx(delInforOut.getIdx());
        delInforIn.setIdx(delInforOutDTO.getIdx());
        delInforIn.setName(delInforOutDTO.getName());
        delInforIn.setSex(delInforOutDTO.getSex());
        delInforIn.setPhoneNumber(delInforOutDTO.getPhoneNumber());
        delInforIn.setApplicationDate(delInforOutDTO.getApplicationDate());
        delInforIn.setBornDate(delInforOutDTO.getBornDate());
        delInforIn.setAddress(delInforOutDTO.getAddress());
        delInforIn.setManager(delInforOutDTO.getManager());
        delInforIn.setNetPlan(delInforOutDTO.getNetPlan());
        delInforIn.setNetType(delInforOutDTO.getNetType());
        delInforIn.setNotes(delInforOutDTO.getNotes());
        delInforIn.setPostcode(delInforOutDTO.getPostcode());
        model.addAttribute("delInforOut", delInforIn);
        return "deleteCheck";
    }
    
    @RequestMapping("/deleinfor")
    public String deleteInformation(Model model,@ModelAttribute DeleteInformationInDTO delInforIn, Integer idx) {
        deleteInformationService.delete(idx);
        model.addAttribute("user",delInforIn);
        return "redirect:/search";
    }


}
