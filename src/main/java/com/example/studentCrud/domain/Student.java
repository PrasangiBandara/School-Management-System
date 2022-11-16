/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.studentCrud.domain;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

/**
 *
 * @author Acer
 */
@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    @Column (name = "studentname")
    @NotEmpty (message = "Student name cannot be empty!")

    private String studentname;
    
    @Column (name = "course")
    @NotEmpty (message = "Course name cannot be empty!")
    private String course;
    
    private int credit;
    
    
    @ManyToMany
    @JoinTable(name = "Subject", joinColumns = @JoinColumn(name = "subname"),
     inverseJoinColumns = @JoinColumn(name = "subid"))
    private List<Subject> subject;

    
    public Student(){
        super();
    }

    public Student(Long id, String studentname, String course, int credit) {
        this.id = id;
        this.studentname = studentname;
        this.course = course;
        this.credit = credit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
}
