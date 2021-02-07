package com.uucoding.gof23.behavioral.iterator;

/**
 * 获取迭代器的容器接口
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/6  15:13
 */
public interface Container<T> {

    /**
     * 向容器添加数据
     * @param t
     * @return
     */
    boolean add(T t);

    /**
     * 获取迭代器
     * @return
     */
    Iterator<T> getIterator();
}
