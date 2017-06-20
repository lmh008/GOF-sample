package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class Proxy implements Subject{

    private Subject subject;

    Proxy(){
        subject = new RealSubject();
    }

    /**
     * 代理相对于装饰模式，突出的是“控制”对象，并不提供对象本身的增强功能
     */
    @Override
    public void doSomething() {
        if(Math.random() * 10 > 5){
            subject.doSomething();
        }
    }
}
