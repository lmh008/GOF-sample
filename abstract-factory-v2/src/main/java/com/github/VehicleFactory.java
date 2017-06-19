package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class VehicleFactory {

    public static Benz getBenz(String type) throws Exception {
        Class<Benz> clazz = (Class<Benz>) Class.forName("com.github.Benz" + type);
        return clazz.newInstance();
    }

    public static Bmw getBmw(String type) throws Exception {
        Class<Bmw> clazz = (Class<Bmw>) Class.forName("com.github.Bmw" + type);
        return clazz.newInstance();
    }
}
