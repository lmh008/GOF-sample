package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 *
 * ConcreteComponent(TextView)
 * —定义一个对象，可以给这个对象添加一些职责
 */
public class BenzCar implements Car{

    @Override
    public void run() {
        System.out.println("this id benz car, the car run");
    }
}
