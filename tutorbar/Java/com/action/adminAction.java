package com.action;

import com.service.AdminManager;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.annotation.Resource;

@Namespace(value = "admin")
@Results({@Result(name = "admin_list", location = "/Mannager/Admin/admin_list.jsp"),
        @Result(name = "failure", location = "/Mannager/Admin/failure.jsp")})
public class adminAction {
    @Resource
    private AdminManager adminManager;

    @Action(value = "/admin_list")
    public String list() {
        return "admin_list";
    }
}
