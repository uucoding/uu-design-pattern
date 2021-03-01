package com.uucoding.gof23.behavioral.memento;

import java.util.Stack;

/**
 * 操作快照工具
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/28  22:17
 */
public class GameManager {

    private static Stack<GameMemento> gameMementoStack = new Stack<>();

    /**
     * 设置当前进度
     * @param gameMemento
     */
    public void setGameMemento(GameMemento gameMemento){
        gameMementoStack.push(gameMemento);
    }

    /**
     * 获取上一个进度
     * @return
     */
    public GameMemento getGameMemento() {
        return gameMementoStack.pop();
    }
}
