package com.mycommerce.project.model;

import com.mycommerce.project.dao.DaoFactory;
import com.mycommerce.project.dao.base.CategoryDao;

public class Admin extends Person{

    public Admin(String name, boolean isValid) {
        super(name, isValid);
    }

    public void validAccount(Person p){
        p.setIsValid(true);
    }

    public void addCategory(Category c){
        CategoryDao categoryDao = DaoFactory.getCategoryDao();
        categoryDao.add(c);
    }

    public void removeCategory(Category c){
        CategoryDao categoryDao = DaoFactory.getCategoryDao();
        categoryDao.remove(c);
    }

    public void editCategory(Category c){
        CategoryDao categoryDao = DaoFactory.getCategoryDao();
        categoryDao.update(c);
    }
}
