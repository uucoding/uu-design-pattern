package com.uucoding.gof23.behavioral.mediator;

/**
 * 一室一厅
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/4  21:47
 */
public class OneHouse extends House {
    @Override
    public void rentOut() {
        System.out.println("一室一厅出租！");
    }
}
