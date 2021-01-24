package com.uucoding.gof23.structural.decorator;

/**
 * 蔬菜装饰器
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  18:46
 */
public class VegetablesBraisedChickenDecorator extends AbstractBraisedChickenDecorator {

    public VegetablesBraisedChickenDecorator(BraisedChicken braisedChicken) {
        super(braisedChicken);
    }

    @Override
    public void addSideDish() {
        System.out.print(" 加蔬菜");
    }
}
