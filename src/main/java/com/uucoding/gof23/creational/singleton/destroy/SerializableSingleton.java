package com.uucoding.gof23.creational.singleton.destroy;

import java.io.Serializable;

/**
 * 序列化单例
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  21:53
 */
public class SerializableSingleton implements Serializable {
    private final static SerializableSingleton INSTANCE = new SerializableSingleton();
    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    /**
     * 优化
     * @return
     */
    public Object readResolve(){
        return INSTANCE;
    }
}
