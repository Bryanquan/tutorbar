package com.dao;

import com.core.page.Pagination;
import com.model.Course;

import java.util.List;

public interface CourseDao {
    List<Course> findAll();

    Course findByCourseName(String courseName);

    Course findOne(String id);

    Course findOne(Integer id);

    Integer getCourseAmount();

    List<Course> pagenation(Pagination<Course> pagination);

    void add(Course entity);

    void delete(Course entity);

    void update(Course entity);

    void save(Course entity);
}
