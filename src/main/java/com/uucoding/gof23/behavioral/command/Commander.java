package com.uucoding.gof23.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 指挥官
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/3/2  07:47
 */
public class Commander {

    private List<Command> commandList = new ArrayList<>();

    /**
     * 添加命令
     * @param command
     */
    public void addCommands(Command command) {
        commandList.add(command);
    }

    public void execute() {
        for (Command command : commandList) {
            System.out.print("指挥官下达命令：")
            ;command.execute();
        }
        // 清空命令
        commandList.clear();
    }
}
