package com.uucoding.gof23.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:51
 */
public class DynamicProxyTicketOffice implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    public DynamicProxyTicketOffice(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象
     *
     * 基于接口的动态代理
     * newProxyInstance方法的参数：在使用代理时需要转换成指定的对象
     * ClassLoader:类加载器，用于加载代理对象字节码的。和被代理对象使用相同的类加载器。
     * Class[]：字节码数组，让代理对象和被代理对象有相同方法。
     * InvocationHandler：提供增强的代码，需要实现InvocationHandler接口，重写invoke逻辑，可以在被代理的类方法前后加入动作
     *              （被代理的类必须实现一个接口，且只能代理接口中存在的方法，类自有的不能使用）
     *
     * @return
     */
    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * 具体代理逻辑处理
     *
     * @param proxy  代理对象
     * @param method 被代理的方法
     * @param args   被代理的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    /**
     * 买票之前的操作
     */
    private void before() {
        System.out.println("动态代理： 找黄牛帮忙，去买票");
    }

    /**
     * 买票之后的操作
     */
    private void after() {
        System.out.println("动态代理： 买到票，拿票！");
    }
}
