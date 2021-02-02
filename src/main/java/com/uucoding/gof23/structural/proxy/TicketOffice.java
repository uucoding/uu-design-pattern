package com.uucoding.gof23.structural.proxy;

/**
 * 售票大厅
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:35
 */
public class TicketOffice implements ITicket{
    @Override
    public void sale() {
        System.out.println("售票大厅卖票");
    }
}
