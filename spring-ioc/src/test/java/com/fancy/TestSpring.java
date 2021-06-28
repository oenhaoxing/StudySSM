package com.fancy;

import com.fancy.dao.UserDao;
import com.fancy.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testUserDao(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao)app.getBean("userDao");
        userDao.save();
        // 手动关闭spring容器 ClassPathXmlApplicationContext
        // app.close();
    }

    @Test
    public void testUserService(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService)app.getBean("userService");
        userService.save();
    }
}
