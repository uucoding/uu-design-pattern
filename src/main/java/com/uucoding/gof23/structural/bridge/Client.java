package com.uucoding.gof23.structural.bridge;

/**
 * 客户端调用
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/31  15:27
 */
public class Client {

    public static void main(String[] args) {
        Ink blueInk = new BlueInk();
        BrushPen smallBrushPen = new SmallBrushPen(blueInk);
        smallBrushPen.write("测试1");

        Ink blackInk = new BlackInk();
        BrushPen bigBrushPen = new BigBrushPen(blackInk);
        bigBrushPen.write("测试2");
    }
}
