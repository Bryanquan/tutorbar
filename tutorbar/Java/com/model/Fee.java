package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fee")
public class Fee {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer level;

    private Integer grade;

    private Integer teacher_level;

    private Integer fee_level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getTeacher_level() {
        return teacher_level;
    }

    public void setTeacher_level(Integer teacher_level) {
        this.teacher_level = teacher_level;
    }

    public Integer getFee_level() {
        return fee_level;
    }

    public void setFee_level(Integer fee_level) {
        this.fee_level = fee_level;
    }

    public Fee() {

    }
}
