package com.uucoding.gof23.structural.bridge;

/**
 * 小号毛笔
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/31  15:05
 */
public class SmallBrushPen extends BrushPen{

    public SmallBrushPen(Ink ink) {
        super(ink);
    }

    @Override
    protected void write(String content) {
        System.out.print("使用小号毛笔 ");
        ink.write(content);
    }
}
