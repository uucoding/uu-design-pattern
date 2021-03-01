package com.uucoding.gof23.behavioral.memento;

/**
 * 游戏快照
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/28  22:15
 */
public class GameMemento {

    private String name;

    public GameMemento(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
