package com.uucoding.gof23.behavioral.command;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/2  07:51
 */
public class Client {

    public static void main(String[] args) {
        // 创建军队
        Army army = new Army();
        // 创建命令
        Command attackCommand = new AttackCommand(army);
        Command stopAttackCommand = new StopAttackCommand(army);
        // 创建指挥官
        Commander commander = new Commander();
        // 添加要执行的命令
        commander.addCommands(attackCommand);
        commander.addCommands(stopAttackCommand);
        // 指挥官执行命令
        commander.execute();
    }
}
