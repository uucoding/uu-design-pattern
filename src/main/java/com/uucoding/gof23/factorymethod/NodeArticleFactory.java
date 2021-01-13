package com.uucoding.gof23.factorymethod;

/**
 * Node文章工厂
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  21:11
 */
public class NodeArticleFactory extends ArticleFactory {

    @Override
    public Article createArticle() {
        return new NodeArticle();
    }
}
