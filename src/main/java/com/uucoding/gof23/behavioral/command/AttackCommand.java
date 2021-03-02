package com.uucoding.gof23.behavioral.command;

/**
 * 进攻命令
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/2  07:45
 */
public class AttackCommand implements Command {

    private Army army;

    public AttackCommand(Army army) {
        this.army = army;
    }

    @Override
    public void execute() {
        army.attack();
    }
}
