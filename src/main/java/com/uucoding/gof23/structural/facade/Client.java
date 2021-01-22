package com.uucoding.gof23.structural.facade;

/**
 * 客户端
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/22  00:34
 */
public class Client {

    public static void main(String[] args) {
        UserInfoController userInfoController = new UserInfoController();
        userInfoController.getUserInfo();
    }
}
