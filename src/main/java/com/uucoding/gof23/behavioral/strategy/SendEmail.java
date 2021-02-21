package com.uucoding.gof23.behavioral.strategy;

/**
 * 邮件发送策略
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/21  19:44
 */
public class SendEmail implements SendStrategy {

    @Override
    public void send() {
        System.out.println("使用email发送信息");
    }
}
