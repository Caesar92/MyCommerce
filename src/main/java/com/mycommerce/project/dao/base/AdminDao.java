package com.mycommerce.project.dao.base;

import com.mycommerce.project.model.Admin;

public interface AdminDao extends GenericDao<Admin, Long> {

    Admin findByName(String name);
}
