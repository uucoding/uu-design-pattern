package com.uucoding.gof23.creational.builder;

/**
 * 出版社
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  14:28
 */
public class Publisher {

    private BookBuilder bookBuilder;

    public Publisher(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    /**
     * 出版
     *
     * @param name
     * @param baseKnowLedge
     * @param studyTarget
     * @return
     */
    public Book publish(String name, String baseKnowLedge, String studyTarget) {
        this.bookBuilder.buildName(name);
        this.bookBuilder.buildBaseKnowledge(baseKnowLedge);
        this.bookBuilder.buildStudyTarget(studyTarget);
        return bookBuilder.build();
    }
}
