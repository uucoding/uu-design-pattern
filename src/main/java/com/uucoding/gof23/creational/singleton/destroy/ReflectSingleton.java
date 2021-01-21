package com.uucoding.gof23.creational.singleton.destroy;

/**
 * 反射破坏
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  21:15
 */
public class ReflectSingleton {

    private final static ReflectSingleton INSTANCE = new ReflectSingleton();
    private ReflectSingleton() {}

    public static ReflectSingleton getInstance() {
        return INSTANCE;
    }
}
