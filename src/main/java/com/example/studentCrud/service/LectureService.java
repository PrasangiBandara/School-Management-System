/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.service;

import com.example.studentCrud.domain.Lecture;
import com.example.studentCrud.repository.LectureRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class LectureService {
    
    @Autowired
    private LectureRepository repo;
    
    public List<Lecture> listAll(){
        return repo.findAll();
    }
    
    public void saveLecture(Lecture lct){
        repo.save(lct);
    }
    
    public Lecture getLecture(long lecid){
        return repo.findById(lecid).get();
    }
    
    public void deleteLecture(long lecid){
        repo.deleteById(lecid);
    }
   
    
}
