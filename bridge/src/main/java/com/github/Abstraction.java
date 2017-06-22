package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void doSomething();
}
