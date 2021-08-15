package com.uucoding.gof23.behavioral.chainofresponsibility;

/**
 * 总经理：审批请假超过五天
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/8/15  22:25
 */
public class GeneralManagerHandler extends Handler {
    @Override
    public void execute(Leave leave) {
        if (leave.getDay() > 5) {
            System.out.println(leave.getName() + "请假 > 5天，总经理审批通过！");
        }
    }
}
