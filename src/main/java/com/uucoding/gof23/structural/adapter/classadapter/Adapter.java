package com.uucoding.gof23.structural.adapter.classadapter;

/**
 * 类适配器模式 具体适配
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/25  21:46
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specificRequest();
    }
}
