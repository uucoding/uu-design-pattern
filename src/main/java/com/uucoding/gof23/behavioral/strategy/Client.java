package com.uucoding.gof23.behavioral.strategy;

import java.util.Comparator;

/**
 * 客户端
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/21  19:46
 */
public class Client {

    public static void main(String[] args) {
        // send by email
        MessageService messageService = new MessageService(new SendEmail());
        messageService.send();

        // send by wx
        MessageService messageService2 = new MessageService(new SendWx());
        messageService2.send();
    }
}
