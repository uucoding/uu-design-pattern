package com.uucoding.gof23.structural.bridge;

/**
 * 蓝墨水
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/31  15:07
 */
public class BlueInk implements Ink{


    @Override
    public void  write(String content) {
        System.out.println("蘸蓝色的墨水写：" + content);
    }
}
