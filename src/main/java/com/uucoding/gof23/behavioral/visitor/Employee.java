package com.uucoding.gof23.behavioral.visitor;

/**
 * 被访问者的业务抽象对象
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:12
 */
public abstract class Employee {

    private String name;

    private String kpi;

    /**
     * 接收管理者查看
     * @param manager
     */
    public abstract void accept(Manager manager);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKpi() {
        return kpi;
    }

    public void setKpi(String kpi) {
        this.kpi = kpi;
    }
}
