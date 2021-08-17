package com.uucoding.gof23.behavioral.visitor;

/**
 * CFO关注员工的KPI
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:16
 */
public class CFO implements Manager{
    @Override
    public void visit(ITEmployee itEmployee) {
        System.out.println("CFO 查看程序员 " + itEmployee.getName() + " KPI = " + itEmployee.getKpi());
    }

    @Override
    public void visit(ProductEmployee itEmployee) {
        System.out.println("CFO 查看产品 " + itEmployee.getName() + " KPI = " + itEmployee.getKpi());
    }
}
