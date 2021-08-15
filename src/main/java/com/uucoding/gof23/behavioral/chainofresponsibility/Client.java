package com.uucoding.gof23.behavioral.chainofresponsibility;

/**
 * 请假流程
 * <p>
 * 3天内人事审批、3-5天经理审批、超过5天总经理审批。
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:25
 */
public class Client {

    public static void main(String[] args) {
        // 人事
        PersonnelHandler personnelHandler = new PersonnelHandler();
        // 经理
        ManagerHandler managerHandler = new ManagerHandler();
        // 总经理
        GeneralManagerHandler generalManagerHandler = new GeneralManagerHandler();

        personnelHandler.setNext(managerHandler);
        managerHandler.setNext(generalManagerHandler);

        System.out.println("--------------");
        Leave zhangsan = new Leave("张三", 2);
        System.out.println(zhangsan);
        personnelHandler.execute(zhangsan);
        System.out.println("--------------");

        Leave lisi = new Leave("李四", 4);
        System.out.println(lisi);
        personnelHandler.execute(lisi);
        System.out.println("--------------");

        Leave wanger = new Leave("王二", 6);
        System.out.println(wanger);
        personnelHandler.execute(wanger);
        System.out.println("--------------");
    }
}
