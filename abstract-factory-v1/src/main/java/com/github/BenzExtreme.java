package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class BenzExtreme implements Benz{

    public static final String NAME = "BENZEXTREME";

    public String getName() {
        return NAME;
    }

    public void benzRun() {
        System.out.println(NAME + " run");
    }
}
