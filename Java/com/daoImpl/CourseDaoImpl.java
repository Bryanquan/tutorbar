package com.daoImpl;

import com.core.page.Pagination;
import com.dao.CourseDao;
import com.model.Course;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

import static com.util.CommonUtil.cast;

@Repository
public class CourseDaoImpl implements CourseDao {

    @Resource
    private SessionFactory sessionFactory;

    public List<Course> list() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Course ";
        Query query = session.createQuery(hql);
        return query.list();
    }

    public Course getById(String id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = (Course) session.get(Course.class, id);
        return course;
    }

    public Course getById(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Course course = (Course) session.get(Course.class, id);
        return course;
    }

    public Integer getCourseAmount() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "select count(*) from Course";
        Query query = session.createQuery(hql);

        Integer amount = ((Number) query.uniqueResult()).intValue();
        return amount;
    }

    public List<Course> pagenation(Pagination<Course> pagination) {
        Integer start = pagination.getStart();
        Integer pageSize = pagination.getPageSize();
        String hql = "From Course";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(hql);
        query.setFirstResult(start);
        query.setMaxResults(pageSize);
        return query.list();
    }

    public void add(Course course) {
        Session session = sessionFactory.getCurrentSession();
        session.save(course);
    }

    public void delete(Course course) {
        Session session = sessionFactory.getCurrentSession();
        Course entity = (Course) session.get(Course.class, course.getId());
        session.delete(entity);
    }

    public void update(Course course) {
        Session session = sessionFactory.getCurrentSession();
        Course entity = (Course) session.get(Course.class, course.getId());
        session.update(entity);
    }

    public Course findByCourseName(String courseName) {
        Session session = sessionFactory.getCurrentSession();
        Course course = cast(session.get(Course.class, courseName));
        return course;
    }

    public Course findOne(String id) {
        Session session = sessionFactory.getCurrentSession();
        Course entity = cast(session.get(Course.class, Integer.valueOf(id)));
        return entity;
    }

    public Course findOne(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        Course entity = cast(session.get(Course.class, id));
        return entity;
    }

    public List<Course> findAll() {
        Session session = sessionFactory.getCurrentSession();
        String hql = "FROM Course ";
        Query query = session.createQuery(hql);
        return query.list();
    }

    public void save(Course entity) {
        Session session = sessionFactory.getCurrentSession();
        session.save(entity);
    }
}
