package com.uucoding.gof23.behavioral.interpreter;

/**
 * 数字解释器
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/23  21:14
 */
public class NumberInterpreter implements Interpreter {

    private String number;

    public NumberInterpreter(String number) {
        this.number = number;
    }

    @Override
    public Integer interpret() {
        return Integer.valueOf(number);
    }
}
