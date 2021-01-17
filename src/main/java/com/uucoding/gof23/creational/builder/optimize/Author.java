package com.uucoding.gof23.creational.builder.optimize;

/**
 * 作者
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  15:25
 */
public class Author {

    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .setName("java")
                .setBaseKnowledge("继承、封装、多态")
                .setStudyTarget("System.out.println(\"hello word\");")
                .build();
        System.out.println(book);
    }
}
