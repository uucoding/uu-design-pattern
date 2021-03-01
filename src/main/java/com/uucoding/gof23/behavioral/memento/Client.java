package com.uucoding.gof23.behavioral.memento;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/28  22:54
 */
public class Client {

    public static void main(String[] args) {
        Game game = new Game("当前存档1");
        GameManager gameManager = new GameManager();
        gameManager.setGameMemento(game.saveGameMemento());
        game.setName("当前存档2");
        gameManager.setGameMemento(game.saveGameMemento());
        // 撤销到上次存档
        GameMemento lastGameMemento = gameManager.getGameMemento();
        game.undoGameMemento(lastGameMemento);
        // 打印当前存档名称
        System.out.println(game.getName());
    }
}
