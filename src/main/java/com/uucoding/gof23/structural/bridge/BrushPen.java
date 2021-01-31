package com.uucoding.gof23.structural.bridge;

/**
 * 毛笔抽象类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/31  15:05
 */
public abstract class BrushPen {
    // 要使用的墨水
    protected Ink ink;

    public BrushPen(Ink ink) {
        this.ink = ink;
    }

    /**
     * 写字
     * @param content
     */
    protected abstract void write(String content);
}
