package com.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Teacher {

    @Id
    @GeneratedValue
    private Integer tid;

    /**
     * the name of key
     */
    @OneToOne
    @JoinColumn(name = "sid",unique = true)
    private School school;

    /**
     * one has many reference
     */
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "sid")
    private Set<Subject> subject;

    private String name;
    private String sex;
    private String schoolteaching;
    private String description;
    private Date   last_logintime;
    private String address;
    private Integer logintimes;
    private String major;
    private String phone;
    private Date   birthday;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchoolteaching() {
        return schoolteaching;
    }

    public void setSchoolteaching(String schoolteaching) {
        this.schoolteaching = schoolteaching;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLast_logintime() {
        return last_logintime;
    }

    public void setLast_logintime(Date last_logintime) {
        this.last_logintime = last_logintime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public School getSchool() {
        return school;
    }


    public void setSchool(School school) {
        this.school = school;
    }

    public Date getBirthday() {

        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Set<Subject> getSubject() {
        return subject;
    }

    public void setSubject(Set<Subject> subject) {
        this.subject = subject;
    }

    public Teacher(School school, String name, String sex,
                   String schoolteaching, String description,
                   Date last_logintime, String address,
                   Integer logintimes, String major,
                   String phone, Date birthday) {
                    this.school = school;
                    this.name = name;
                    this.sex = sex;
                    this.schoolteaching = schoolteaching;
                    this.description = description;
                    this.last_logintime = last_logintime;
                    this.address = address;
                    this.logintimes = logintimes;
                    this.major = major;
                    this.phone = phone;
                    this.birthday = birthday;
    }

    public Teacher(School school, String name) {
        this.school = school;
        this.name = name;
    }

    public Teacher(School school, String name, String address, String major, String phone, Date birthday) {

        this.school = school;
        this.name = name;
        this.address = address;
        this.major = major;
        this.phone = phone;
        this.birthday = birthday;
    }

    public Teacher() {
    }
}
