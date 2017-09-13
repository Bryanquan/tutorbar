package com.service;

import com.core.page.Pagination;
import com.model.Admin;

import java.util.List;

public interface AdminManager {
    List<Admin> list();

    Admin getId(Integer id);

    Admin getId(String id);

    Admin getByUsername(String username);

    void add(Admin admin);

    void update(Admin admin);

    void delete(Admin admin);

    Pagination<Admin> pagination(Pagination<Admin> pagination);

}
