package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * AbstractClass（抽象类，如Application）
 * — 定义抽象的原语操作（primitiveoperation），具体的子类将重定义它们以实现一个算法的各步骤
 * — 实现一个模板方法,定义一个算法的骨架。该模板方法不仅调用原语操作，也调用定义在AbstractClass或其他对象中的操作
 */
public abstract class AbstratTemplate {

    public void run(){
        System.out.println("prepare run");
        this.doSomething();
        System.out.println("run over");
    }

    /**
     * hook 钩子方法
     */
    protected abstract void doSomething();

}
