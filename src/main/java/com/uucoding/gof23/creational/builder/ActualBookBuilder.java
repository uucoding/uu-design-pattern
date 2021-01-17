package com.uucoding.gof23.creational.builder;

/**
 * 实际的书本设置
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  14:27
 */
public class ActualBookBuilder extends BookBuilder {

    private Book book = new Book();

    @Override
    public void buildName(String name) {
        book.setName(name);
    }

    @Override
    public void buildBaseKnowledge(String baseKnowledge) {
        book.setBaseKnowledge(baseKnowledge);
    }

    @Override
    public void buildStudyTarget(String studyTarget) {
        book.setStudyTarget(studyTarget);
    }

    @Override
    public Book build() {
        return book;
    }
}
