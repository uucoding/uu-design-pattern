package com.uucoding.gof23.creational.singleton;

/**
 * 普通方法（懒汉式）
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:46
 */
public class LazySingleton {
    private static LazySingleton INSTANCE = null;
    private LazySingleton(){
        System.out.println("启动。。。");
    }

    /**
     * 多线程会导致INSTANCE多次实例化
     * @return
     */
    public static LazySingleton getInstance() {
        System.out.println("调用");
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
