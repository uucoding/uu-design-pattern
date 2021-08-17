package com.uucoding.gof23.behavioral.visitor;

/**
 * 测试
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/17  08:19
 */
public class Client {

    public static void main(String[] args) {
        CTO cto = new CTO();
        CFO cfo = new CFO();
        ITEmployee itEmployee = new ITEmployee("zhangsan", "优秀", 10000);
        itEmployee.accept(cto);
        itEmployee.accept(cfo);

        ProductEmployee productEmployee = new ProductEmployee("lisi", "良好", 1);
        productEmployee.accept(cto);
        productEmployee.accept(cfo);
    }
}
