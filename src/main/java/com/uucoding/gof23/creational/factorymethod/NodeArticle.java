package com.uucoding.gof23.creational.factorymethod;

/**
 * node文章
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/12  21:09
 */
public class NodeArticle implements Article {

    @Override
    public String type() {
        return "Node";
    }
}
