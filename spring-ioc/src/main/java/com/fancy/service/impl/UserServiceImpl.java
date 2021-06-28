package com.fancy.service.impl;

import com.fancy.dao.UserDao;
import com.fancy.service.UserService;

public class UserServiceImpl implements UserService {

    // service层调用Dao层 需要注入Dao 使用set方式注入 配置
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    // 构造方法注入
    public UserServiceImpl(){

    }
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }

}
