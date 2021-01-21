package com.uucoding.gof23.creational.singleton.destroy;

/**
 * 枚举单例
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  22:34
 */
public enum EnumSingleton {
    INSTANCE;
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
