package com.serviceImpl;

import com.core.page.Pagination;
import com.dao.AdminDao;
import com.model.Admin;
import com.service.AdminManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class AdminManagerImpl implements AdminManager {
    @Resource
    private AdminDao adminDao;

    public List<Admin> list() {
        return adminDao.list();
    }

    public Admin getId(Integer id) {
        return adminDao.getId(id);
    }

    public Admin getId(String id) {
        return adminDao.getId(id);
    }

    public Admin getByUsername(String username) {
        return adminDao.getByUsername(username);
    }

    public void add(Admin entity) {
        adminDao.add(entity);
    }

    public void update(Admin entity) {
        adminDao.update(entity);
    }

    public void delete(Admin entity) {
        adminDao.delete(entity);
    }


    public Pagination<Admin> pagination(Pagination<Admin> pagination) {
        List<Admin> items = adminDao.pagination(pagination);
        pagination.setTotalItemCount(items.size());
        pagination.setItems(items);
        return pagination;
    }
}
