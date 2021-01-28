package com.uucoding.gof23.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 联系人工厂
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/27  08:24
 */
public class ContactsFactory {

    public final static Map<String, Contacts> CONTACTS_MAP = new HashMap<>();

    public static Contacts  getContacts(String name) {
        Contacts contacts = CONTACTS_MAP.get(name);
        if (contacts == null) {
            System.out.println("创建与 [" + name + "] 新的对话");
            contacts = new Friend(name);
            CONTACTS_MAP.put(name, contacts);
        }
        return contacts;
    }
}
