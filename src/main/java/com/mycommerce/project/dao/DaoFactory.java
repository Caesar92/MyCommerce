
package com.mycommerce.project.dao;


import com.mycommerce.project.dao.base.AdminDao;
import com.mycommerce.project.dao.base.CategoryDao;
import com.mycommerce.project.dao.base.ProductDao;
import com.mycommerce.project.dao.base.UserDao;

public final class DaoFactory {

    private DaoFactory() {
    }

    public static ProductDao getProductDao() {
        return new MemoryProductDao();
    }
    public static CategoryDao getCategoryDao() {return  new MemoryCategoryDao();}
    public static AdminDao getAdminDao() {return  new MemoryAdminDao();}
    public static UserDao getUserDao() {return  new MemoryUserDao();}
}
