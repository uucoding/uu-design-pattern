package com.uucoding.gof23.creational.builder;

/**
 * 书
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  14:10
 */
public class Book {

    /**
     * 名称
     */
    private String name;

    /**
     * 基础知识
     */
    private String baseKnowledge;

    /**
     * 学习结果
     */
    private String studyTarget;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBaseKnowledge() {
        return baseKnowledge;
    }

    public void setBaseKnowledge(String baseKnowledge) {
        this.baseKnowledge = baseKnowledge;
    }

    public String getStudyTarget() {
        return studyTarget;
    }

    public void setStudyTarget(String studyTarget) {
        this.studyTarget = studyTarget;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", baseKnowledge='" + baseKnowledge + '\'' +
                ", studyTarget='" + studyTarget + '\'' +
                '}';
    }
}
