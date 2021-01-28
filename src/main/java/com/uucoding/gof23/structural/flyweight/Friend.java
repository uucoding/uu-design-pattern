package com.uucoding.gof23.structural.flyweight;

/**
 * 好友
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/27  08:22
 */
public class Friend implements Contacts {

    /**
     * 分类（内部状态：共享）
     */
    private String type = "QQ";

    /**
     * 姓名（外部状态：变化）
     */
    private String name;

    public Friend(String name) {
        this.name = name;
    }

    @Override
    public void chat() {
        System.out.println("chat with "+ name);
    }
}
