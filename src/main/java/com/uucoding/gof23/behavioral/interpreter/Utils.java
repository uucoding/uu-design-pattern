package com.uucoding.gof23.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 解析工具类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/23  21:39
 */
public class Utils {

    // 允许的符号
    private static List<String> symbolList = Arrays.asList("+", "*");

    /**
     * 解析
     * @param express
     * @return
     */
    public static boolean parse(String express) {
        Stack<String> data = new Stack<>();
        String[] strList = express.split(" ");
        String symbol = "";
        for (String str : strList) {
            if (isSymbol(str)) {
                symbol = str;
            } else {
                if (!str.equals("=")) {
                    data.push(str);
                }
            }
        }
        Integer result = Integer.valueOf(data.pop());
        Interpreter interpreter = null;
        if (symbol.equals("*")) {
            interpreter = new MultiInterpreter(new NumberInterpreter(data.pop()), new NumberInterpreter(data.pop()));
        } else if (symbol.equals("+")) {
            interpreter = new AddInterpreter(new NumberInterpreter(data.pop()), new NumberInterpreter(data.pop()));

        } else {
            System.out.println("暂不支持此类型符号");
        }
        return result.equals(interpreter.interpret());
    }

    /**
     * 判断是否是符号
     * @param str
     * @return
     */
    public static boolean isSymbol(String str) {
        return symbolList.contains(str);
    }
}
