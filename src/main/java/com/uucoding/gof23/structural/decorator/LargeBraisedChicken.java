package com.uucoding.gof23.structural.decorator;

/**
 * 大份黄焖鸡
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  18:38
 */
public class LargeBraisedChicken implements BraisedChicken{
    @Override
    public void product() {
        System.out.print("生产【大】份黄焖鸡");
    }
}
