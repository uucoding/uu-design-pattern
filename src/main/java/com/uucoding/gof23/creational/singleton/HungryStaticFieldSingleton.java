package com.uucoding.gof23.creational.singleton;

/**
 * 静态变量（饿汉式）
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:33
 */
public class HungryStaticFieldSingleton {
    private final static HungryStaticFieldSingleton INSTANCE = new HungryStaticFieldSingleton();
    private HungryStaticFieldSingleton(){
        System.out.println("先启动。。。");
    }
    public static HungryStaticFieldSingleton getInstance() {
        System.out.println("调用");
        return INSTANCE;
    }
}
