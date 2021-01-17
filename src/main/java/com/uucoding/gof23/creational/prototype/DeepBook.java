package com.uucoding.gof23.creational.prototype;

import java.util.Date;

/**
 * 深拷贝 book
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  23:20
 */
public class DeepBook implements Cloneable {

    /**
     * 名称
     */
    private String name;

    /**
     * 作者
     */
    private DeepAuthor author;

    /**
     * 出版日期
     */
    private Date publishDate;

    public DeepBook(String name, DeepAuthor author, Date publishDate) {
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
        DeepBook deepBook = (DeepBook)super.clone();
        deepBook.publishDate = (Date) deepBook.publishDate.clone();
        deepBook.author  = (DeepAuthor) deepBook.author.clone();
        return deepBook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepAuthor getAuthor() {
        return author;
    }

    public void setAuthor(DeepAuthor author) {
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
