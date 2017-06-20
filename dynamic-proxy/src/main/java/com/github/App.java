package com.github;

import java.lang.reflect.Proxy;

public class App
{
    public static void main( String[] args )
    {
        Subject subject = new RealSubject();
        subject = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), new MyInvocationHandler(subject));
        subject.doSomething();
    }
}
