package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * Builder
 * —为创建一个Product对象的各个部件指定抽象接口。
 */
public interface BuildingBuilder {

    void buildBase();

    void buildFrame();

    void buildWall();

    Building getResult();

}
