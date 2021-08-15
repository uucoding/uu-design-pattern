package com.uucoding.gof23.behavioral.chainofresponsibility;

import java.util.Objects;

/**
 * 经理: 审批3-5天
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:21
 */
public class ManagerHandler extends Handler {

    @Override
    public void execute(Leave leave) {
        if (leave.getDay() >= 3 && leave.getDay() <= 5) {
            System.out.println(leave.getName() + "请假 >= 3天，请假 <= 5天，经理审批通过！");
        } else {
            if (Objects.nonNull(next)) {
                System.out.println("经理无法处理，请求总经理介入！");
                next.execute(leave);
            } else {
                System.out.println("未设置下一节点处理人，无法继续处理！");
            }
        }
    }
}
