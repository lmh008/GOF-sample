package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * ConcreteClass（具体类，如MyApplication）
 * — 实现原语操作以完成算法中与特定子类相关的步骤。
 */
public class ConcreteClassB extends AbstratTemplate{

    @Override
    protected void doSomething() {
        System.out.println("ConcreteClassB");
    }
}
