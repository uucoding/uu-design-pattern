package com.uucoding.gof23.behavioral.interpreter;

/**
 * 乘法解释器
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/23  21:03
 */
public class MultiInterpreter implements Interpreter {

    private Interpreter interpreter1, interpreter2;

    public MultiInterpreter(Interpreter interpreter1, Interpreter interpreter2) {
        this.interpreter1 = interpreter1;
        this.interpreter2 = interpreter2;
    }

    @Override
    public Integer interpret() {
        return interpreter1.interpret() * interpreter2.interpret();
    }
}
