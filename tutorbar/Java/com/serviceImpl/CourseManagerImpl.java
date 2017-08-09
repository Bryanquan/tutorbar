package com.serviceImpl;
import com.dao.CourseDao;
import com.model.Course;
import com.service.CourseManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class CourseManagerImpl implements CourseManager{
    @Resource
    private CourseDao courseDao;

    public Course getById(String id) {
        return courseDao.getById(id);
    }

    public Course getById(Integer id) {
        return courseDao.getById(id);
    }

    public Integer getCourseAmount() {
        return courseDao.getCourseAmount();
    }

    public void add(Course courseentity) {
        courseDao.add(courseentity);
    }

    public void delete(Course courseentity) {
        courseDao.delete(courseentity);
    }

    public void update(Course courseentity) {
        courseDao.update(courseentity);
    }

    public List<Course> list() {
        return courseDao.list();
    }
}
