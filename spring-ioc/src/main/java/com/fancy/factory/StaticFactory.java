package com.fancy.factory;

import com.fancy.dao.impl.UserDaoImpl;

/**
 * 静态工厂实例化对象
 */
public class StaticFactory {

    public static Object getBean(){
        return new UserDaoImpl();
    }

}
