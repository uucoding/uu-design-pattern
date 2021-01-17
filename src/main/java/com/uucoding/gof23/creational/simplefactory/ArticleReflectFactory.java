package com.uucoding.gof23.creational.simplefactory;

/**
 * 文章反射工厂
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  19:06
 */
public class ArticleReflectFactory {
    /**
     * 获取文章
     * @param clazz
     * @return
     */
    public static Article getArticle(Class<? extends Article> clazz) {
        Article article = null;
        try {
            article = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return article;
    }
}
