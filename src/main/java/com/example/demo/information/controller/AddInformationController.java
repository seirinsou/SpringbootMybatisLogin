package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.information.model.AddInformationInDTO;
import com.example.demo.information.service.AddInformationService;

@Controller("AddInformationController")
public class AddInformationController {
    
    @Autowired
    AddInformationService addInformationService;
    
    @RequestMapping("/addInformation")
    public String addInformation(Model model) {
        return "addInformation";
    }
    @RequestMapping("/tocheckInformation")
    public String checkInformation(Model model, @ModelAttribute AddInformationInDTO addInforIn) {
        model.addAttribute("addInforIn", addInforIn);
        return "checkInformation";
    }
    
    @RequestMapping("/tosaveInformation")
    public String saveInformation(Model model,
             RedirectAttributes attributes,
            @ModelAttribute AddInformationInDTO addInforIn) {
        int add = addInformationService.add(addInforIn);
        model.addAttribute("addInforIn", addInforIn);
        attributes.addFlashAttribute("message", "数据保存成功");
        return "saveInformation";
    }
}
