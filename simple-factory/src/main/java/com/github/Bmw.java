package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class Bmw extends Vehicle {

    public static final String NAME = "BMW";

    public void run() {
        System.out.println(NAME + " run");
    }

    public String getName() {
        return NAME;
    }
}
