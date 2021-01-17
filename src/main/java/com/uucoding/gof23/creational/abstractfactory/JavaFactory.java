package com.uucoding.gof23.creational.abstractfactory;

/**
 * Java工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/14  21:11
 */
public class JavaFactory extends AbstractFactory {
    @Override
    public Article createArticle() {
        return new JavaArticle();
    }

    @Override
    public Project createProject() {
        return new JavaProject();
    }
}
