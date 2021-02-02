package com.uucoding.gof23.structural.proxy._static;

/**
 * 静态代理客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:44
 */
public class Client {

    public static void main(String[] args) {
        StaticProxyTicketOffice staticProxyTicketOffice = new StaticProxyTicketOffice();
        staticProxyTicketOffice.sale();
    }
}
