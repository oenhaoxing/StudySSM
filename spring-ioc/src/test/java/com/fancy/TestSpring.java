package com.fancy;

import com.fancy.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void test(){
        ApplicationContext app = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao = (UserDao)app.getBean("userDao");
        userDao.save();
        // 手动关闭spring容器 ClassPathXmlApplicationContext
        // app.close();
    }
}
