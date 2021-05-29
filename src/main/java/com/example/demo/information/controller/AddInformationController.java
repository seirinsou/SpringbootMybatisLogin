package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.information.model.SaveInformationDTO;
import com.example.demo.information.service.InformationService;

@Controller("AddInformationController")
public class AddInformationController {
    
    @Autowired
    InformationService informationService;
    
    @RequestMapping("/addInformation")
    public String addInformation(Model model) {
        return "addInformation";
    }
    @RequestMapping("/tocheckInformation")
    public String checkInformation(Model model, @ModelAttribute SaveInformationDTO inforDTO) {
        model.addAttribute("addinfor", inforDTO);
        return "checkInformation";
    }
    
    @RequestMapping("/tosaveInformation")
    public String saveInformation(Model model,
             RedirectAttributes attributes,
            @ModelAttribute SaveInformationDTO inforDTO) {
        int add = informationService.add(inforDTO);
        model.addAttribute("addinfor", inforDTO);
        attributes.addFlashAttribute("message", "数据保存成功");
        return "saveInformation";
    }
}
