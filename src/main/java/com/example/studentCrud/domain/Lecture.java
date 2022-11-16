/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ACER
 */
@Entity
public class Lecture {
    
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long lecid;
    private String lecturename;
    private String email;
    private int number;

    
    public Lecture(){
        super();
    }

    public Lecture(Long lecid, String lecturetname, String email, int number) {
        this.lecid = lecid;
        this.lecturename = lecturename;
        this.email = email;
        this.number = number;
    }
    
    
    /**/

    public Long getLecid() {
        return lecid;
    }

    public void setLecid(Long lecid) {
        this.lecid = lecid;
    }

    public String getLecturename() {
        return lecturename;
    }

    public void setLecturename(String lecturename) {
        this.lecturename = lecturename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
