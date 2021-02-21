package com.uucoding.gof23.behavioral.strategy;

/**
 * 微信发送策略
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/21  19:44
 */
public class SendWx implements SendStrategy {

    @Override
    public void send() {
        System.out.println("使用微信发送信息");
    }
}
