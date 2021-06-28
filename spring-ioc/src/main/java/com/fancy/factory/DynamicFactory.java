package com.fancy.factory;

import com.fancy.dao.impl.UserDaoImpl;

/**
 * 实例工厂实例化对象
 */
public class DynamicFactory {

    public Object getBean(){
        return new UserDaoImpl();
    }

}
