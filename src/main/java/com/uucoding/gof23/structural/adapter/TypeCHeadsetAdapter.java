package com.uucoding.gof23.structural.adapter;

/**
 * type-c耳机转接线
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/25  21:46
 */
public class TypeCHeadsetAdapter implements TypeCMobile {
    CircularHoleHeadset circularHoleHeadset = new CircularHoleHeadset();

    @Override
    public void supportCircularHoleHeadset() {
        System.out.println("给圆形耳机接上type-c转接口 ");
        circularHoleHeadset.listenMusic();
    }
}
