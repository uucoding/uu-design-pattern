package com.uucoding.gof23.behavioral.visitor;

/**
 * 程序员
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:15
 */
public class ITEmployee extends Employee{

    private Integer codeLine;

    public ITEmployee(String name, String kpi, Integer codeLine) {
        this.setName(name);
        this.setKpi(kpi);
        this.codeLine = codeLine;
    }

    @Override
    public void accept(Manager manager) {
        manager.visit(this);
    }

    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }
}
