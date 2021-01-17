package com.uucoding.gof23.creational.factorymethod;

/**
 * 客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  21:14
 */
public class Client {
    public static void main(String[] args) {
        Article javaArticle = new JavaArticleFactory().createArticle();
        Article article = new NodeArticleFactory().createArticle();
        System.out.println(article.type());
    }
}
