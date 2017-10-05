package com.model;
import javax.persistence.*;
@Entity
@Table(name = "course")
public class Course
{
    @Id
    @GeneratedValue
    private Integer id;
    private String c_name;
    private String c_fee;
    private String c_grade;

    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public String getC_grade() {
        return c_grade;
    }

    public void setC_grade(String c_grade) {
        this.c_grade = c_grade;
    }
    public String getC_fee()
    {
        return c_fee;
    }

    public void setC_fee(String c_fee)
    {
        this.c_fee = c_fee;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Course()
    {

    }
    public Course(String c_name, String c_grade, String c_fee) {
        this.c_name = c_name;
        this.c_grade = c_grade;
        this.c_fee = c_fee;
    }
}
