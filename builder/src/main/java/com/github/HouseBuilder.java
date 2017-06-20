package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class HouseBuilder implements BuildingBuilder{

    @Override
    public void buildBase() {
        System.out.println("house build base");
    }

    @Override
    public void buildFrame() {
        System.out.println("house build frame");
    }

    @Override
    public void buildWall() {
        System.out.println("house build wall");
    }

    @Override
    public void decoration() {
        System.out.println("house decoration");
    }
}
