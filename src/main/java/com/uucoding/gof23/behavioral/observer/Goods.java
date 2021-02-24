package com.uucoding.gof23.behavioral.observer;

import java.util.Observable;

/**
 * 商品被观察者
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/24  22:55
 */
public class Goods extends Observable {

    private String name;
    /**
     * 初始价格
     */
    private double initPrice;

    private double nowPrice;

    public Goods(String name, double initPrice) {
        this.name = name;
        this.initPrice = initPrice;
        this.nowPrice = initPrice;
    }

    /**
     * 更新价格，如果价格低于初始价格，那么通知
     * @param price
     */
    public void setNowPrice(double price) {
        this.nowPrice = price;
        if (initPrice - price > 0) {
            this.setChanged();
            this.notifyObservers(price);
        }
    }

    public String getName() {
        return name;
    }

    public double getInitPrice() {
        return initPrice;
    }

    public double getNowPrice() {
        return nowPrice;
    }
}
