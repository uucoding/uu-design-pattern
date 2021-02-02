package com.uucoding.gof23.behavioral.template;

/**
 * 王者荣耀
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/2  21:47
 */
public class WangZheGame extends Game {
    @Override
    protected void open() {
        System.out.println("打开王者荣耀");
    }

    @Override
    protected void start() {
        System.out.println("开始排位");
    }

    @Override
    protected void end() {
        System.out.println("结束游戏");
    }
}
