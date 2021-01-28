package com.uucoding.gof23.structural.flyweight;

/**
 * Integer 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/26  21:50
 */
public class IntegerTest {

    public static void main(String[] args) {

        Integer a = Integer.valueOf(129);
        Integer b = Integer.valueOf(129);
        System.out.println(a == b);  // false
        Integer c = Integer.valueOf(127);
        Integer d = Integer.valueOf(127);
        System.out.println(c == d); // true
    }
}
