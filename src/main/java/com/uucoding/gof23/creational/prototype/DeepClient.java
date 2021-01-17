package com.uucoding.gof23.creational.prototype;

import java.util.Date;

/**
 * 深拷贝 演示
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  23:43
 */
public class DeepClient {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAuthor author = new DeepAuthor();
        author.setNickname("author");
        author.setBirthday(new Date());
        DeepBook book1 = new DeepBook("java", author, new Date());
        DeepBook book2 = (DeepBook)book1.clone();
        // 修改值
        book1.setName("node");
        book1.getPublishDate().setTime(888888888888L);
        book1.getAuthor().setNickname("author 1");
        // 这里也要手动设置deepAuthor的Date类型的clone
        book1.getAuthor().getBirthday().setTime(888888888888L);
        System.out.println(book1);
        System.out.println(book2);
    }
}
