package com.uucoding.gof23.structural.decorator;

/**
 * 加料抽象类
 * （装饰抽象类）
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/24  18:44
 */
public abstract class AbstractBraisedChickenDecorator implements BraisedChicken {

    /**
     * 被装饰的黄焖鸡
     */
    protected BraisedChicken braisedChicken;

    public AbstractBraisedChickenDecorator(BraisedChicken braisedChicken) {
        this.braisedChicken = braisedChicken;
    }

    @Override
    public void product() {
        braisedChicken.product();
        addSideDish();
    }

    /**
     * 加料
     *
     * @return
     */
    public abstract void addSideDish();
}
