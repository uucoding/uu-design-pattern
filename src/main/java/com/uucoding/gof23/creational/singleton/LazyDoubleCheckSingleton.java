package com.uucoding.gof23.creational.singleton;

/**
 * 双重检查（懒汉式）
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  21:38
 */
public class LazyDoubleCheckSingleton {
    // volatile保证不会重排序
    private volatile static LazyDoubleCheckSingleton INSTANCE = null;
    private LazyDoubleCheckSingleton(){
        System.out.println("启动。。。");
    }
    /**
     * 锁内 锁外 双重检查，线程安全，线程安全
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance() {
        System.out.println("调用");
        if (INSTANCE == null) {// 标记点：A
            // 可能多个线程会同时进入这一行，也会导致多次创建
            synchronized(LazySynchronizedBlockSingleton.class) {
                if (INSTANCE == null) {
                    // new 对象的时候实际上经历了三步
                    // 1、 new 一个空对象
                    // 2、 调用类的构造方法，给空对象初始化相关值
                    // 3、 将对象赋值给变量引用（这里对象就已经不为空了）
                    // 如果2、3两步发生重排序，那么可能会导致其他线程在`代码中的【标记点A】`的位置得到的空对象（对象存在，但是对象的相关值未初始化）
                    INSTANCE = new LazyDoubleCheckSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
