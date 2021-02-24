package com.uucoding.gof23.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 用户 观察者
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/24  22:56
 */
public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Goods goods = (Goods) o;
        System.out.println(name + "你好，你关注的商品 " + goods.getName() +" 降价啦！原价:"+ goods.getInitPrice() +" 现价: " + goods.getNowPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
