package com.example.demo.information.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.information.model.SearchInformationDTO;
import com.example.demo.information.service.InformationService;

@Controller("UpdateInformationController")
public class UpdateInformationController {
    
    @Autowired
    InformationService informationService;
    
    @RequestMapping("/update")
    public String updateInformation(Model model,@ModelAttribute SearchInformationDTO searchinfor){
        List<SearchInformationDTO> informationList = informationService.findAllByIdx(searchinfor.getIdx());
        model.addAttribute("informationList", informationList);
        model.addAttribute("searchinfor", searchinfor);
        return "update";
    }
    @RequestMapping("/toupdateCheck")
    public String updateInformationCheck(Model model,@ModelAttribute SearchInformationDTO searchinfor){
        model.addAttribute("searchinfor", searchinfor);
        return "updateCheck";
    }
    @RequestMapping("/toupinfor")
    public String toupinfor(Model model,RedirectAttributes attributes,SearchInformationDTO searchinfor){
        informationService.update(searchinfor);
        attributes.addFlashAttribute("message", "情報更新完了");
        attributes.addFlashAttribute("user",searchinfor);
        return "redirect:/search";
    }

}
