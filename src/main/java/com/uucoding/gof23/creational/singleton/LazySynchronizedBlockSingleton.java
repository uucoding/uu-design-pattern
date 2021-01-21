package com.uucoding.gof23.creational.singleton;

/**
 * 同步代码块（懒汉式）
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:46
 */
public class LazySynchronizedBlockSingleton {
    private static LazySynchronizedBlockSingleton INSTANCE = null;
    private LazySynchronizedBlockSingleton(){
        System.out.println("启动。。。");
    }
    /**
     * 通过只锁创建的部分，也是线程不安全的
     * @return
     */
    public static LazySynchronizedBlockSingleton getInstance() {
        System.out.println("调用");
        if (INSTANCE == null) {
             // 可能多个线程会同时进入这一行，也会导致多次创建
            synchronized(LazySynchronizedBlockSingleton.class) {
                INSTANCE = new LazySynchronizedBlockSingleton();
            }
        }
        return INSTANCE;
    }
}
