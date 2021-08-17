package com.uucoding.gof23.behavioral.visitor;

/**
 * 访问者的业务接口
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:13
 */
public interface Manager {

    /**
     * 查看程序员
     * @param itEmployee
     */
    void visit(ITEmployee itEmployee);

    /**
     * 查看产品
     * @param itEmployee
     */
    void visit(ProductEmployee itEmployee);
}
