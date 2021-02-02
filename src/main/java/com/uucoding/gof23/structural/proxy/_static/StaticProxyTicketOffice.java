package com.uucoding.gof23.structural.proxy._static;

import com.uucoding.gof23.structural.proxy.ITicket;
import com.uucoding.gof23.structural.proxy.TicketOffice;

/**
 * 静态代理类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:39
 */
public class StaticProxyTicketOffice implements ITicket {

    private TicketOffice ticketOffice;

    /**
     * 代理卖票
     */
    @Override
    public void sale() {
        before();
        ticketOffice = new TicketOffice();
        ticketOffice.sale();
        after();
    }

    /**
     * 买票之前的操作
     */
    private void before() {
        System.out.println("静态代理： 找黄牛帮忙，去买票");
    }

    /**
     * 买票之后的操作
     */
    private void after() {
        System.out.println("静态代理： 买到票，拿票！");
    }
}
