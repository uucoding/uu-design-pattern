package com.uucoding.gof23.structural.bridge;

/**
 * 大号毛笔
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/31  15:05
 */
public class BigBrushPen extends BrushPen{

    public BigBrushPen(Ink ink) {
        super(ink);
    }

    @Override
    protected void write(String content) {
        System.out.print("使用大号毛笔 ");
        ink.write(content);
    }
}
