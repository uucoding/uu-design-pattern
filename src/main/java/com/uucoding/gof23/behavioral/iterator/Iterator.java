package com.uucoding.gof23.behavioral.iterator;

/**
 * 迭代器接口
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/6  15:05
 */
public interface Iterator<T> {

    /**
     * 判断是否还有下一个
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    T next();
}
