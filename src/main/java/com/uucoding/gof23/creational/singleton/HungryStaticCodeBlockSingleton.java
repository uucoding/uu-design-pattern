package com.uucoding.gof23.creational.singleton;

/**
 * 静态代码块（饿汉式）
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  19:33
 */
public class HungryStaticCodeBlockSingleton {
    private final static HungryStaticCodeBlockSingleton INSTANCE;
    // 静态代码块初始化
    static {
        INSTANCE = new HungryStaticCodeBlockSingleton();
    }
    private HungryStaticCodeBlockSingleton(){
        System.out.println("先启动。。。");
    }
    public static HungryStaticCodeBlockSingleton getInstance() {
        System.out.println("调用");
        return INSTANCE;
    }
}
