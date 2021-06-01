package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.demo.information.model.UpdateInformationInDTO;
import com.example.demo.information.model.UpdateInformationOutDTO;
import com.example.demo.information.service.UpdateInformationService;

@Controller("UpdateInformationController")
public class UpdateInformationController {
    
    @Autowired
    UpdateInformationService updateInformationService;
    
    @RequestMapping("/update")
    public String updateInformation(Model model,@ModelAttribute UpdateInformationInDTO updateInforIn){
        UpdateInformationOutDTO updateInforOut = updateInformationService.findAllByIdx(updateInforIn.getIdx());
        model.addAttribute("updateInforOut", updateInforOut);
        return "update";
    }
    @RequestMapping("/toupdateCheck")
    public String updateInformationCheck(Model model,@ModelAttribute UpdateInformationInDTO updateInforIn){
        model.addAttribute("updateInforIn", updateInforIn);
        return "updateCheck";
    }
    @RequestMapping("/toupinfor")
    public String toupinfor(Model model,RedirectAttributes attributes,UpdateInformationInDTO updateInforIn){
        updateInformationService.update(updateInforIn);
        attributes.addFlashAttribute("message", "情報更新完了");
        attributes.addFlashAttribute("user",updateInforIn);
        return "redirect:/search";
    }

}
