package com.uucoding.gof23.behavioral.command;

/**
 * 军队
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/2  07:42
 */
public class Army {

    public void attack() {
        System.out.println(" 军队进攻");
    }

    public void stopAttack() {
        System.out.println(" 军队停止进攻");
    }
}
