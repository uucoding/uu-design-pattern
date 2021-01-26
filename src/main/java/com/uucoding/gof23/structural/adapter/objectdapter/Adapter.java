package com.uucoding.gof23.structural.adapter.objectdapter;

/**
 * 对象适配器模式 具体适配
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/25  21:46
 */
public class Adapter implements Target {
    Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
