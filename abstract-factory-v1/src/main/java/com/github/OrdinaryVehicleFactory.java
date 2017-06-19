package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class OrdinaryVehicleFactory implements VehicleFactory{

    public Benz getBenz() {
        return new BenzOrdinary();
    }

    public Bmw getBmw() {
        return new BmwOrdinary();
    }
}
