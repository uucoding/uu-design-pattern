package com.uucoding.gof23.structural.flyweight;

/**
 * 测试客户端
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/27  08:29
 */
public class Client {

    public static void main(String[] args) {
        Contacts contacts = ContactsFactory.getContacts("张三");
        contacts.chat();
        Contacts contacts2 = ContactsFactory.getContacts("张三");
        contacts2.chat();
    }
}
