/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.service;

import com.example.studentCrud.domain.Student;
import com.example.studentCrud.repository.StudentRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentRepository repo;
    
    public List<Student> listAll(){
        return repo.findAll();
    }
    
    public void save(Student std){
        repo.save(std);
    }
    
    public Student get(long id){
        return repo.findById(id).get();
    }
    
    public void delete(long id){
        repo.deleteById(id);
    }
    
}
