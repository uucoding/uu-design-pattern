package com.uucoding.gof23.creational.factorymethod;

/**
 * 文章抽象工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  21:11
 */
public abstract class ArticleFactory {

    /**
     * 创建文章抽象方法
     * @return
     */
    public abstract Article createArticle();
}
