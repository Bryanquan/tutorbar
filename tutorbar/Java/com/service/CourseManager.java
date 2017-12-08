package com.service;
import com.model.Course;
import java.util.List;
public interface CourseManager {
    List<Course> findAll();
    
    Course findOne(String id);

    Course findOne(Integer id);

    Integer getCourseAmount();

    void add(Course courseentity);

    void delete(Course courseentity);

    void update(Course courseentity);
}
