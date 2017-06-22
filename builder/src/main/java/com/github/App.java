package com.github;

/**
 * 建造者模式
 * 1.  意图 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class App {

    public static void main(String[] args) {
        BuildDirector houseBuildDirector = new BuildDirector(new HouseBuilder());
        BuildDirector MansionBuildDirector = new BuildDirector(new MansionBuilder());
        houseBuildDirector.build();
        MansionBuildDirector.build();
    }
}
