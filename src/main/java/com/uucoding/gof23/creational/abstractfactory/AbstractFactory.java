package com.uucoding.gof23.creational.abstractfactory;

/**
 * 产品族抽象工厂
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/14  21:11
 */
public abstract class AbstractFactory {

    /**
     * 创建Article抽象方法
     * @return
     */
    public abstract Article createArticle();

    /**
     * 创建Project抽象方法
     * @return
     */
    public abstract Project createProject();
}
