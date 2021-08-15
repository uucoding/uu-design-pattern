package com.uucoding.gof23.behavioral.chainofresponsibility;

/**
 * 请假表单
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:21
 */
public class Leave {

    /**
     * 请假人姓名
     */
    private String name;

    /**
     * 请假天数
     */
    private Integer day;

    public Leave(String name, Integer day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "name='" + name + '\'' +
                ", day=" + day +
                '}';
    }
}
