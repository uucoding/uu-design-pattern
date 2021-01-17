package com.uucoding.gof23.creational.prototype;

import java.util.Date;

/**
 * 深拷贝演示类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/17  23:23
 */
public class DeepAuthor implements Cloneable{

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 生日
     */
    private Date birthday;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Author{" +
                "nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
