package com.uucoding.gof23.structural.decorator;

/**
 * 客户端
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  18:51
 */
public class Client {

    public static void main(String[] args) {
        BraisedChicken braisedChicken = new LittleBraisedChicken();
        // 加肉
        braisedChicken = new MeatBraisedChickenDecorator(braisedChicken);
        //再加一份蔬菜
        braisedChicken = new VegetablesBraisedChickenDecorator(braisedChicken);
        //再加一份蔬菜
        braisedChicken = new VegetablesBraisedChickenDecorator(braisedChicken);

        braisedChicken.product();
    }
}
