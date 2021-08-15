package com.uucoding.gof23.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * 人事：审批3天内
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:24
 */
public class PersonnelHandler extends Handler {

    @Override
    public void execute(Leave leave) {
        if (leave.getDay() < 3) {
            System.out.println(leave.getName() + "请假 < 3天，人事审批通过！");
        } else {
            if (Objects.nonNull(next)) {
                System.out.println("人事无法处理，请求经理介入！");
                next.execute(leave);
            } else {
                System.out.println("未设置下一节点处理人，无法继续处理！");
            }
        }
    }
}
