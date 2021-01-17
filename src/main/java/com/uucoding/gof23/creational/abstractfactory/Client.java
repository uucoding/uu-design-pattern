package com.uucoding.gof23.creational.abstractfactory;

/**
 * 客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/14  21:14
 */
public class Client {
    public static void main(String[] args) {
        // 生产Java相关产品
        AbstractFactory javaFactory = new JavaFactory();
        Article javaArticle = javaFactory.createArticle();
        Project javaProject = javaFactory.createProject();
        System.out.println(javaArticle.type());
        System.out.println(javaProject.type());
        // 生产Java相关产品
        AbstractFactory nodeFactory = new NodeFactory();
        Article nodeArticle = nodeFactory.createArticle();
        Project nodeProject = nodeFactory.createProject();
        System.out.println(nodeArticle.type());
        System.out.println(nodeProject.type());
    }
}
