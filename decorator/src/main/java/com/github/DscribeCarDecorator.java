package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 * <p>
 * ConcreteDecorator(BorderDecorator,ScrollDecorator)
 * —向组件添加职责。
 */
public class DscribeCarDecorator extends CarDecorator {

    @Override
    public void run() {
        System.out.println("set destination : 'beijing'");
        this.car.run();
        System.out.println("i am runing now !");
    }
}
