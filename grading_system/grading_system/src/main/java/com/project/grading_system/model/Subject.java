package com.project.grading_system.model; //
import jakarta.persistence.*; //to import jakarta library. It is a library in java

@Entity // entity is a class that denotes the database table
@Table(name="subjects") // to decide the name of table
public class Subject{
    @Id //import ID = It is a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //To generate id
    private Long id; //id should be private = it cannot be accesible outside the class
    @Column(nullable = false) 
    private String subjectname;
    @Column(nullable = false, unique = true)
    private String subjectcode;
    public Subject(){}
    public Long getId(){ //to get id
        return id; // id got
    }
    public void setId(Long id){ //to set id
this.id=id; // to call id
    }
    public String getSubjectname(){
        return subjectname;
    }
    public void setSubjectname(String subjectname){
        this.subjectname=subjectname;
    }
    public String getSubjectcode(){
        return subjectcode;
    }
    public void setSubjectcode(String subjectcode){
this.subjectcode=subjectcode;
    }
    
}
