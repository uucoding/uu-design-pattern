package com.uucoding.gof23.creational.builder.optimize;

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

    public Book(BookBuilder builder) {
        this.name = builder.name;
        this.baseKnowledge = builder.baseKnowledge;
        this.studyTarget = builder.studyTarget;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", baseKnowledge='" + baseKnowledge + '\'' +
                ", studyTarget='" + studyTarget + '\'' +
                '}';
    }

    /**
     * 书的构造者
     */
    public static class BookBuilder {

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


        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setBaseKnowledge(String baseKnowledge) {
            this.baseKnowledge = baseKnowledge;
            return this;
        }

        public BookBuilder setStudyTarget(String studyTarget) {
            this.studyTarget = studyTarget;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

}
