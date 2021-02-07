package com.uucoding.gof23.behavioral.iterator;

/**
 * 学生名次
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/6  15:10
 */
public class Student {

    /**
     * 学生名次
     */
    private Integer ranking;

    /**
     * 学生名字
     */
    private String name;

    public Student(Integer ranking, String name) {
        this.ranking = ranking;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ranking=" + ranking +
                ", name='" + name + '\'' +
                '}';
    }
}
