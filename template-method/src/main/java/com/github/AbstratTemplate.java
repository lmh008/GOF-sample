package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public abstract class AbstratTemplate {

    public void run(){
        System.out.println("prepare run");
        this.doSomething();
        System.out.println("run over");
    }

    protected abstract void doSomething();

}
