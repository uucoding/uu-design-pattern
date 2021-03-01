package com.uucoding.gof23.behavioral.memento;

/**
 * 游戏
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/28  22:14
 */
public class Game {

    /**
     * 存档名称
     */
    private String name;

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 存档
     * @return
     */
    public GameMemento saveGameMemento() {
        return new GameMemento(this.name);
    }

    /**
     * 撤回到指定的快照部分
     * @param gameMemento
     */
    public void undoGameMemento(GameMemento gameMemento) {
        this.name = gameMemento.getName();
    }
}
