package com.dao;

import com.core.page.Pagination;
import com.model.Admin;

import java.util.List;
public interface AdminDao {
    List<Admin> list();

    Admin getId(Integer id);

    Admin getId(String id);

    Admin getByUsername(String username);

    void add(Admin entity);

    void update(Admin entity);

    void delete(Admin entity);

    void save(Admin entity);

    List<Admin> pagination(Pagination<Admin> pagiNation);

}
