package com.uucoding.gof23.behavioral.template;

/**
 * 游戏接口
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/2  21:44
 */
public abstract class Game {

    /**
     * 玩游戏
     */
    public final void play() {
        open();
        start();
        end();
    }

    /**
     * 打开游戏
     */
    protected abstract void open();

    /**
     * 开始游戏
     */
    protected abstract void start();

    /**
     * 结束游戏
     */
    protected abstract void end();
}
