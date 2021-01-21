package com.uucoding.gof23.creational.singleton.destroy;

import java.io.*;

/**
 * 序列化测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/20  21:53
 */
public class SerializableSingletonClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializableSingleton instance = SerializableSingleton.getInstance();
        // 序列化到文件中
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serializableSingleton.txt"));
        objectOutputStream.writeObject(instance);
        // 反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("serializableSingleton.txt")));
        SerializableSingleton instance2 = (SerializableSingleton) objectInputStream.readObject();
        System.out.println(instance == instance2); // false
    }
}
