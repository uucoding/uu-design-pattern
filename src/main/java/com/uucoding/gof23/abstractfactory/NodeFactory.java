package com.uucoding.gof23.abstractfactory;

/**
 * Node工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/14  21:11
 */
public class NodeFactory extends AbstractFactory {

    @Override
    public Article createArticle() {
        return new NodeArticle();
    }

    @Override
    public Project createProject() {
        return new NodeProject();
    }
}
