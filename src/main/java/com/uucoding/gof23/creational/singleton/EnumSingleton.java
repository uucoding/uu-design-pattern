package com.uucoding.gof23.creational.singleton;

/**
 * 枚举(饿汉式)
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/19  22:21
 */
public enum EnumSingleton {
    INSTANCE;
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public EnumSingleton getInstance() {
        return INSTANCE;
    }
}
