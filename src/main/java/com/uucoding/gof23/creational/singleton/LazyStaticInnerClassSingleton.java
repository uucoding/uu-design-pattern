package com.uucoding.gof23.creational.singleton;

/**
 * 静态内部类（懒汉式）
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:46
 */
public class LazyStaticInnerClassSingleton {
    private LazyStaticInnerClassSingleton(){
        System.out.println("启动。。。");
    }
    /**
     * 加载的时候，JVM不会初始化这类，只有当有线程第一次调用{@link LazyStaticInnerClassSingleton#getInstance()}才会初始化一次
     */
    private static class InnerSingleton {
        private final static LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
    public static LazyStaticInnerClassSingleton getInstance() {
        System.out.println("调用");
        return InnerSingleton.INSTANCE;
    }
}
