package com.uucoding.gof23.creational.simplefactory;

/**
 * 客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/11  21:14
 */
public class Client {
    public static void main(String[] args) {
        Article article = ArticleFactory.getArticle("java");
        // Article article = ArticleFactory.getArticle("node");
        if (article != null) {
            System.out.println(article.type());
        }
        // 反射优化
        Article article1 = ArticleReflectFactory.getArticle(Article.class);
        if (article1 != null) {
            System.out.println(article1.type());
        }
    }
}
