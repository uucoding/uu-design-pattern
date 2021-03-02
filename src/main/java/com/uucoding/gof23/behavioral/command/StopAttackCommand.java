package com.uucoding.gof23.behavioral.command;

/**
 * 停止进攻命令
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/2  07:45
 */
public class StopAttackCommand implements Command {

    private Army army;

    public StopAttackCommand(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.stopAttack();
    }
}
