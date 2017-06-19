package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 * 简单工厂模式，特点：工厂类中包含了实例实例化的判断。
 * 如果增加一类产品，需要修改工厂类，在工厂中增加相应的逻辑判断。违背开闭原则
 *
 */
public class SimpleVehicleFactory {

    private SimpleVehicleFactory() {
    }

    public static Vehicle getVehicle(String name) {
        if(Benz.NAME.equals(name)){
            return new Benz();
        }else if(Bmw.NAME.equals(name)){
            return new Bmw();
        }else {
            return new DefaultVehicle();
        }
    }
}
