package com.uucoding.gof23.simplefactory;

/**
 * 文章工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/11  21:11
 */
public class ArticleFactory {

    /**
     * 获取文章
     * @param type
     * @return
     */
    public static Article getArticle(String type) {
        Article article = null;
        switch (type) {
            case "java":
                article = new JavaArticle();
                break;
            case "node":
                article = new NodeArticle();
        }
        return article;
    }
}
