package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
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
