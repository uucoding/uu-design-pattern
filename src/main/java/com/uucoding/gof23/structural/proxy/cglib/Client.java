package com.uucoding.gof23.structural.proxy.cglib;

import com.uucoding.gof23.structural.proxy.TicketOffice;

/**
 * cglib代理客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:44
 */
public class Client {

    public static void main(String[] args) {
        TicketOffice ticketOffice = (TicketOffice) new CglibProxyTicketOffice().getProxy(new TicketOffice());
        ticketOffice.sale();
    }
}
