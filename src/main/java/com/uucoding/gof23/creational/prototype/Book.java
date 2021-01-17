package com.uucoding.gof23.creational.prototype;

import java.util.Date;

/**
 * book
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  23:20
 */
public class Book implements Cloneable {

    /**
     * 名称
     */
    private String name;

    /**
     * 作者
     */
    private Author author;

    /**
     * 出版日期
     */
    private Date publishDate;

    public Book(String name, Author author, Date publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    /**
     * 实现clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", publishDate=" + publishDate +
                '}';
    }
}
