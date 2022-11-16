/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author ACER
 */
@Entity
public class Subject {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long subid;
    private String subname;
    private int credit;
    private String lecname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subid")
    private Lecture proDetail;

    public Lecture getProDetail() {
        return proDetail;
    }
    
    
    public void setProDetail(Lecture proDetail) {
        this.proDetail = proDetail;
    }
    
    
    public Subject(){
        super();
    }

    public Subject(Long subid, String subname, int credit, String lecname) {
        this.subid = subid;
        this.subname = subname;
        this.credit = credit;
        this.lecname = lecname;
    }

    public Long getSubid() {
        return subid;
    }

    public void setSubid(Long subid) {
        this.subid = subid;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getLecname() {
        return lecname;
    }

    public void setLecname(String lecname) {
        this.lecname = lecname;
    }
    
    
    
}
