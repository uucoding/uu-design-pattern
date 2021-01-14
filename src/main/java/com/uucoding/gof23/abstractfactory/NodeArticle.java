package com.uucoding.gof23.abstractfactory;

/**
 * node文章
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/14  21:09
 */
public class NodeArticle implements Article {

    @Override
    public String type() {
        return "NodeArticle";
    }
}
