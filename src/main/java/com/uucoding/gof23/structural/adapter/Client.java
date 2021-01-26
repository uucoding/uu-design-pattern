package com.uucoding.gof23.structural.adapter;

/**
 * 客户使用
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/25  21:46
 */
public class Client {

    public static void main(String[] args) {
        TypeCMobile typeCMobile = new TypeCHeadsetAdapter();
        typeCMobile.supportCircularHoleHeadset();
    }
}
