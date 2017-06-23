package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * Director
 * —构造一个使用Builder接口的对象。
 */
public class BuildDirector {

    private BuildingBuilder buildingBuilder;

    public BuildDirector(BuildingBuilder buildingBuilder) {
        this.buildingBuilder = buildingBuilder;
    }

    public void build(){
        this.buildingBuilder.buildBase();
        this.buildingBuilder.buildFrame();
        this.buildingBuilder.buildWall();
        this.buildingBuilder.decoration();
    }
}
