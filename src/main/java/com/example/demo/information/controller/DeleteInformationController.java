package com.example.demo.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.information.model.DeleteInformationOutDTO;
import com.example.demo.information.service.DeleteInformationService;

@Controller("DeleteInformationController")
public class DeleteInformationController {
    
    @Autowired
    DeleteInformationService deleteInformationService;
    
    @RequestMapping("delete")
    public String toDeleteCheck(Model model,@ModelAttribute DeleteInformationOutDTO delInfor){
        DeleteInformationOutDTO delInfor1 = deleteInformationService.findByIdx(delInfor.getIdx());
        model.addAttribute("delInfor", delInfor);
        return "deleteCheck";
    }
    
    @RequestMapping("/deleinfor")
    public String deleteInformation(Model model,@ModelAttribute DeleteInformationOutDTO delInfor, Integer idx) {
        deleteInformationService.delete(idx);
        model.addAttribute("user",delInfor);
        return "redirect:/search";
    }


}
