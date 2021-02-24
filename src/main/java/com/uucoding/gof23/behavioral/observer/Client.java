package com.uucoding.gof23.behavioral.observer;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/24  23:05
 */
public class Client {

    public static void main(String[] args) {
        Goods goods = new Goods("小米手机", 200);
        User uu = new User("uu");
        User coding = new User("coding");

        goods.addObserver(coding);
        goods.addObserver(uu);
        goods.setNowPrice(50);
    }
}
