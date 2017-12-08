package com.action;

import com.service.CourseManager;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.annotation.Resource;

@Namespace(value = "course")
@Results({@Result(name = "list", location = "/Mannager/Admin/admin_list.jsp"),
        @Result(name = "failure", location = "/Mannager/Admin/failure.jsp")})
public class courseAction {
    @Resource
    private CourseManager courseManager;

    @Action(value = "/course_list")
    public String list() {
        System.out.println(courseManager.list());
        System.out.println(courseManager.getCourseAmount());
        System.out.println("course");
        return "list";
    }
}
