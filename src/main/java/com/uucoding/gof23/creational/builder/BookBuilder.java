package com.uucoding.gof23.creational.builder;

/**
 * 建造者
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  14:23
 */
public abstract class BookBuilder {

    /**
     * 构建语言名称
     *
     * @param name
     * @return
     */
    public abstract void buildName(String name);

    /**
     * 学习语言基础知识
     *
     * @param baseKnowledge
     * @return
     */
    public abstract void buildBaseKnowledge(String baseKnowledge);

    /**
     * 达到学习目标
     *
     * @param studyTarget
     * @return
     */
    public abstract void buildStudyTarget(String studyTarget);

    /**
     * 构建书
     *
     * @return
     */
    public abstract Book build();
}
