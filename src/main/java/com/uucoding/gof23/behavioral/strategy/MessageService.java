package com.uucoding.gof23.behavioral.strategy;

/**
 * 消息服务，使用发送策略
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/21  19:48
 */
public class MessageService {

    private SendStrategy sendStrategy;

    public MessageService(SendStrategy sendStrategy) {
        this.sendStrategy = sendStrategy;
    }

    public void send() {
        sendStrategy.send();
    }
}
