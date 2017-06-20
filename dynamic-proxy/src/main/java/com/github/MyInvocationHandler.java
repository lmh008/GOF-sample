package com.github;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class MyInvocationHandler implements InvocationHandler{

    private Subject subject;

    public MyInvocationHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before do something");
        return method.invoke(subject,args);
    }
}
