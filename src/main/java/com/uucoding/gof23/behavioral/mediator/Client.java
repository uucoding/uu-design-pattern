package com.uucoding.gof23.behavioral.mediator;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/4  21:57
 */
public class Client {

    public static void main(String[] args) {
        OneHouse oneHouse = new OneHouse();
        TwoHouse twoHouse = new TwoHouse();

        HouseMediator houseMediator = new HouseMediator(oneHouse, twoHouse);

        houseMediator.rentOutHouse("one");
        houseMediator.rentOutHouse("two");
    }
}
