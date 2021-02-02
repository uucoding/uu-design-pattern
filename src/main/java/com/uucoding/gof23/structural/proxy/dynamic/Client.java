package com.uucoding.gof23.structural.proxy.dynamic;

import com.uucoding.gof23.structural.proxy.ITicket;
import com.uucoding.gof23.structural.proxy.TicketOffice;

/**
 * 动态代理客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:44
 */
public class Client {

    public static void main(String[] args) {
        ITicket iTicket = (ITicket) new DynamicProxyTicketOffice(new TicketOffice()).getProxy();
        iTicket.sale();
    }
}
