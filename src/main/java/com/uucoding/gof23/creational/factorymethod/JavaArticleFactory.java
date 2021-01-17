package com.uucoding.gof23.creational.factorymethod;

/**
 * Java文章工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  21:11
 */
public class JavaArticleFactory extends ArticleFactory {
    @Override
    public Article createArticle() {
        return new JavaArticle();
    }
}
