package com.uucoding.gof23.structural.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib代理
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/2/1  20:51
 */
public class CglibProxyTicketOffice implements MethodInterceptor {

    /**
     * 被代理的对象
     */
    private Object target;

    /**
     * 获取代理对象
     *
     * 基于类的动态代理
     * Enhancer.create参数含义：
     * Class：类加载器，用于加载代理对象字节码的。和被代理对象使用相同的类加载器
     * Callback：用于提供增强的代码，需要实现MethodInterceptor接口，并重写intercept方法
     * @return
     */
    public Object getProxy(Object target) {
        this.target = target;
        return Enhancer.create(target.getClass(), this);
    }

    /**
     * 具体代理逻辑处理
     *
     * @param proxy       代理对象的引用
     * @param method      被代理的方法
     * @param args        被代理的方法参数
     * @param methodProxy 当前执行方法的代理对象
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        Object invoke = method.invoke(target, args);
        after();
        return invoke;
    }

    /**
     * 买票之前的操作
     */
    private void before() {
        System.out.println("cglib代理： 找黄牛帮忙，去买票");
    }

    /**
     * 买票之后的操作
     */
    private void after() {
        System.out.println("cglib代理： 买到票，拿票！");
    }
}
