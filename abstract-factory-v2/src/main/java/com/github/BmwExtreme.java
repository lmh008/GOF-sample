package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class BmwExtreme implements Bmw {

    public static final String NAME = "BMWEXTREME";

    public String getName() {
        return NAME;
    }

    public void bmwRun() {
        System.out.println(NAME + " run");
    }
}
