package com.uucoding.gof23.creational.singleton.destroy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举单例测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  22:34
 */
public class EnumSingletonClient {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance1 = EnumSingleton.getInstance();
        // 反射
        Constructor constructor = EnumSingleton.class.getDeclaredConstructor();
        // 设置可见
        constructor.setAccessible(true);
        EnumSingleton reflectSingleton = (EnumSingleton) constructor.newInstance();
        System.out.println(reflectSingleton == instance1); // false
    }
}
