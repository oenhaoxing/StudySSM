package com.fancy.service.impl;

import com.fancy.dao.UserDao;
import com.fancy.entity.User;
import com.fancy.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

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

    // 注入普通属性
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    // 注入集合
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties prop;

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public void save() {
        userDao.save();
    }

    @Override
    public void show() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
        System.out.println("=======================");
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(prop);
    }

}
