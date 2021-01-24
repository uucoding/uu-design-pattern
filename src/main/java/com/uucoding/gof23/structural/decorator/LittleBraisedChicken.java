package com.uucoding.gof23.structural.decorator;

/**
 * 小份黄焖鸡
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  18:38
 */
public class LittleBraisedChicken implements BraisedChicken{
    @Override
    public void product() {
        System.out.print("生产【小】份黄焖鸡");
    }
}
