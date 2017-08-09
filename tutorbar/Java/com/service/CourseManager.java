package com.service;
import com.model.Course;
import java.util.List;
public interface CourseManager {
    List<Course> list();
    
    Course getById(String id);

    Course getById(Integer id);

    Integer getCourseAmount();

    void add(Course courseentity);

    void delete(Course courseentity);

    void update(Course courseentity);
}
