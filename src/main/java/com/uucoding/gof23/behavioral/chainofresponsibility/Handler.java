package com.uucoding.gof23.behavioral.chainofresponsibility;

/**
 * 处理器
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:18
 */
public abstract class Handler {

    /**
     * 下一个处理对象
     */
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 执行
     * @param leave
     */
    public abstract void execute(Leave leave);
}
