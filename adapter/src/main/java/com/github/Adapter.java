package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * 对Adaptee的接口与Target接口进行适配
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter() {
        this.adaptee = new Adaptee();
    }

    @Override
    public void doSomething() {
        adaptee.adapteeMethod();
    }
}
