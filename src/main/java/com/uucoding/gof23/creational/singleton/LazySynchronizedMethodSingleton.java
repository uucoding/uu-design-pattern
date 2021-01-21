package com.uucoding.gof23.creational.singleton;

/**
 * 同步方法（懒汉式）
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:46
 */
public class LazySynchronizedMethodSingleton {
    private static LazySynchronizedMethodSingleton INSTANCE = null;
    private LazySynchronizedMethodSingleton(){
        System.out.println("启动。。。");
    }

    /**
     * 每次只允许一个线程访问
     * @return
     */
    public static synchronized LazySynchronizedMethodSingleton getInstance() {
        System.out.println("调用");
        if (INSTANCE == null) {
            INSTANCE = new LazySynchronizedMethodSingleton();
        }
        return INSTANCE;
    }
}
