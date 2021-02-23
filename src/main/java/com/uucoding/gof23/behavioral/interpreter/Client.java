package com.uucoding.gof23.behavioral.interpreter;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/23  21:38
 */
public class Client {

    public static void main(String[] args) {
        String express = "4 + 5 = 9";
        String express2 = "4 * 5 = 18";

        boolean result = Utils.parse(express);
        boolean result2 = Utils.parse(express2);
        System.out.println("express结果为：" + result);
        System.out.println("express2结果为：" + result2);
    }
}
