package com.uucoding.gof23.creational.prototype;

import java.util.Date;

/**
 * 简单clone演示
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  23:26
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author();
        Date date = new Date();
        author.setNickname("author");
        author.setBirthday(new Date());
        Book book1 = new Book("java", author, date);
        Book book2 = (Book)book1.clone();
        book1.setName("node");
        // TODO 修改作者名称，再来看看数据 （book2被同步修改了）
        book1.getAuthor().setNickname("modify author");
        System.out.println(book1);
        System.out.println(book2);
    }
}
