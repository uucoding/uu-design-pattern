package com.uucoding.gof23.behavioral.template;

/**
 * 吃鸡游戏
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/2  21:48
 */
public class ChiJiGame extends Game {
    @Override
    protected void open() {
        System.out.println("打开绝地求生");
    }

    @Override
    protected void start() {
        System.out.println("开始游戏");
    }

    @Override
    protected void end() {
        System.out.println("结束游戏！");
    }
}
