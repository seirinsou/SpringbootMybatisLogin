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
    public String toDeleteCheck(Model model,@ModelAttribute DeleteInformationInDTO delInforIn){
        DeleteInformationOutDTO delInforOut = deleteInformationService.findByIdx(delInforIn.getIdx());
        model.addAttribute("delInforOut", delInforOut);
        return "deleteCheck";
    }
    
    @RequestMapping("/deleinfor")
    public String deleteInformation(Model model,@ModelAttribute DeleteInformationInDTO delInforIn, Integer idx) {
        deleteInformationService.delete(idx);
        model.addAttribute("user",delInforIn);
        return "redirect:/search";
    }


}
