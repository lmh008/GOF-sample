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

    public void build(BuildingBuilder buildingBuilder){
        buildingBuilder.buildBase();
        buildingBuilder.buildFrame();
        buildingBuilder.buildWall();
    }
}
