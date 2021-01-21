package com.uucoding.gof23.creational.singleton.destroy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  21:15
 */
public class ReflectSingletonClient {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ReflectSingleton instance1 = ReflectSingleton.getInstance();
        ReflectSingleton instance2 = ReflectSingleton.getInstance();
        System.out.println(instance1 == instance2);// true
        // 反射
        Constructor constructor = ReflectSingleton.class.getDeclaredConstructor();
        // 设置可见
        constructor.setAccessible(true);
        ReflectSingleton reflectSingleton = (ReflectSingleton)constructor.newInstance();
        System.out.println(reflectSingleton == instance1); // false
    }
}
