package com.fancy.dao.impl;

import com.fancy.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("创建UserDao....");
    }

    @Override
    public void save() {
        System.out.println("保存用户....");
    }

    public void init(){
        System.out.println("初始化....");
    }

    public void destroy(){
        System.out.println("销毁....");
    }

}
