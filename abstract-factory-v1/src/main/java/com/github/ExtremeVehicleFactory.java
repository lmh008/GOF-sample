package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class ExtremeVehicleFactory implements VehicleFactory{

    public Benz getBenz() {
        return new BenzExtreme();
    }

    public Bmw getBmw() {
        return new BmwExtreme();
    }
}
