/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.controller;

import com.example.studentCrud.domain.Subject;
import com.example.studentCrud.service.SubjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ACER
 */
@Controller
public class SubjectController {
    
    @Autowired
    private SubjectService service;
 
    @GetMapping("/indexsub")
    public String viewSubjectPage(Model model) {
        List<Subject> listsubject = service.listAll();
        model.addAttribute("listsubject", listsubject);
        return "indexsub";
    }
 
    @RequestMapping("/deleteSubject/{subid}")
    public String deleteExistingSubject(@PathVariable(name = "subid") int subid) {
        service.deleteSubject(subid);
        return "redirect:/indexsub";
    }
    
}
