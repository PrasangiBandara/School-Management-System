/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.service;

import com.example.studentCrud.domain.Subject;
import com.example.studentCrud.repository.SubjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ACER
 */
@Service
public class SubjectService {
    
    @Autowired
    private SubjectRepository repo;
    
    public List<Subject> listAll(){
        return repo.findAll();
    }
    
    public void deleteSubject(long subid){
        repo.deleteById(subid);
    }
    
}
