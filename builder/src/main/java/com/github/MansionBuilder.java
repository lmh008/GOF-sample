package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * * ConcreteBuilder
 * —实现Builder的接口以构造和装配该产品的各个部件。—定义并明确它所创建的表示
 * —提供一个检索产品的接口。
 */
public class MansionBuilder implements BuildingBuilder{

    @Override
    public void buildBase() {
        System.out.println("mansion build base");
    }

    @Override
    public void buildFrame() {
        System.out.println("mansion build frame");
    }

    @Override
    public void buildWall() {
        System.out.println("mansion build wall");
    }

    @Override
    public void decoration() {
        System.out.println("mansion decoration");
    }
}
