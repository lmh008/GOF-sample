package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * <p>
 * ConcreteBuilder
 * —实现Builder的接口以构造和装配该产品的各个部件。—定义并明确它所创建的表示
 * —提供一个检索产品的接口。
 */
public class HouseBuilder implements BuildingBuilder {

    private Building building;

    public HouseBuilder() {
        this.building = new Building();
    }

    @Override
    public void buildBase() {
        building.setBase("deep 20m");
    }

    @Override
    public void buildFrame() {
        building.setFrame("stable frame");
    }

    @Override
    public void buildWall() {
        building.setWall("high : 6m width : 20m");
    }

    @Override
    public Building getResult() {
        return building;
    }


}
