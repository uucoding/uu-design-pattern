package com.uucoding.gof23.creational.builder;

/**
 * 作者
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  14:27
 */
public class Author {

    public static void main(String[] args) {
        BookBuilder bookBuilder = new ActualBookBuilder();
        Publisher publisher = new Publisher(bookBuilder);
        // 写一本Java书，并让帮助发布
        Book java = publisher.publish("java", "继承、封装、多态", "System.out.println(\"hello word\");");

        System.out.println(java.toString());
    }
}
