package com.uucoding.gof23.behavioral.visitor;

/**
 * CTO 关注员工的工作内容
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/16  21:15
 */
public class CTO implements Manager{
    @Override
    public void visit(ITEmployee itEmployee) {
        System.out.println("CTO 查看程序员 " + itEmployee.getName() + "代码质量，代码行数共计" + itEmployee.getCodeLine());
    }

    @Override
    public void visit(ProductEmployee itEmployee) {
        System.out.println("CTO 查看产品 " + itEmployee.getName() + "产品质量，产品个数共计" + itEmployee.getCount());
    }
}
