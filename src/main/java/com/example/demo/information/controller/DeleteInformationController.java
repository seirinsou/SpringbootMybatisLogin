package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.information.model.SearchInformationDTO;
import com.example.demo.information.service.InformationService;

@Controller("DeleteInformationController")
public class DeleteInformationController {
    
    @Autowired
    InformationService informationService;
    
    @RequestMapping("todelete")
    public String updateInformationCheck(Model model,RedirectAttributes attributes,SearchInformationDTO searchinfor){
        model.addAttribute("searchinfor", searchinfor);
        return "deleteCheck";
    }
    
    @RequestMapping("/deleinfor")
    public String deleInfor(Model model,@ModelAttribute SearchInformationDTO searchinfor, Integer idx) {
        informationService.delete(idx);
        model.addAttribute("user",searchinfor);
        return "redirect:/search";
    }


}
