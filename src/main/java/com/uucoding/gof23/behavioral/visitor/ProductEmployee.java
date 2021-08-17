package com.uucoding.gof23.behavioral.visitor;

/**
 * 产品
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:15
 */
public class ProductEmployee extends Employee{

    private Integer count;

    public ProductEmployee(String name, String kpi, Integer count) {
        this.setName(name);
        this.setKpi(kpi);
        this.count = count;
    }

    @Override
    public void accept(Manager manager) {
        manager.visit(this);
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
