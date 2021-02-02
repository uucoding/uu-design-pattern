package com.uucoding.gof23.behavioral.template;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/2  21:50
 */
public class Client {

    public static void main(String[] args) {
        Game wangzhe = new WangZheGame();
        wangzhe.play();
        Game chiji = new ChiJiGame();
        chiji.play();
    }
}
