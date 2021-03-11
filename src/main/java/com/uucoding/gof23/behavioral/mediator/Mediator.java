package com.uucoding.gof23.behavioral.mediator;

/**
 * 中介者接口
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/3  08:07
 */
public interface Mediator {

    /**
     * 出租房屋
     * @param type 房屋类型
     */
    void rentOutHouse(String type);
}
