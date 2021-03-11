package com.uucoding.gof23.behavioral.mediator;

/**
 * 房屋中介
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/3  08:07
 */
public class HouseMediator implements Mediator {

    private OneHouse oneHouse;

    private TwoHouse twoHouse;

    public HouseMediator(OneHouse oneHouse, TwoHouse twoHouse) {
        this.oneHouse = oneHouse;
        this.twoHouse = twoHouse;
    }

    @Override
    public void rentOutHouse(String type) {
        if (type.equals("one")) {
            oneHouse.rentOut();
        } else if (type.equals("two")) {
            twoHouse.rentOut();
        }
    }
}
