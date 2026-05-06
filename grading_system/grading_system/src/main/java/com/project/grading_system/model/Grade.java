package com.project.grading_system.model;
import com.nimbusds.oauth2.sdk.id.Subject;

import jakarta.persistence.*;

@Entity
@Table(name="grades")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)

    private Student student;
    @ManyToOne
    @JoinColumn(name = "subject_id",nullable = false)

    private Subject subject;
    @Column(nullable=false)
    private Double marks;
    
    public Grade(){}

    public Long getid(){return id;}
    
    public void setId(Long id){
        this.id=id;}
      
         public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public Subject getSubject() { return subject; }
    public void setSubject(Subject subject) { this.subject = subject; }

    public Double getMarks() { return marks; }
    public void setMarks(Double marks) { this.marks = marks; }
}
