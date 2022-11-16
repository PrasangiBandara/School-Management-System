/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.controller;

import com.example.studentCrud.domain.Lecture;
import com.example.studentCrud.service.LectureService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ACER
 */
@Controller
public class LectureController {
    
      @Autowired
    private LectureService service;
 
    @GetMapping("/lecture")
    public String viewLecturePage(Model model) {
        List<Lecture> listlecture = service.listAll();
        model.addAttribute("listlecture", listlecture);
        System.out.print("Get / ");
        return "indexlec";
    }
 
    @GetMapping("/newLecture")
    public String add(Model model) {
        model.addAttribute("lecture", new Lecture());
        return "newlec";
    }
 
    @RequestMapping(value = "/saveLecture", method = RequestMethod.POST)
    public String saveLecture(@ModelAttribute("lecture") Lecture lct) {
        service.saveLecture(lct);
        return "redirect:/lecture";       
    }
 
    @RequestMapping("/editLecture/{lecid}")
    public ModelAndView showEditLecturePage(@PathVariable(name = "lecid") int lecid) {
        ModelAndView mav = new ModelAndView("newlec");
        Lecture lct = service.getLecture(lecid);
        mav.addObject("lecture", lct);
        return mav;
        
    }
    
    
    @RequestMapping("/deleteLecture/{lecid}")
    public String deleteLecture(@PathVariable(name = "lecid") int lecid) {
        service.deleteLecture(lecid);
        return "redirect:/lecture";
        
    }
    
}
