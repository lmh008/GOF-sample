package com.github;

/**
 * 建造者模式
 * 意图 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 * 适用性 在以下情况使用Builder模式
 * •  当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 * •  当构造过程必须允许被构造的对象有不同的表示时。
 */
public class App {

    public static void main(String[] args) {
        BuildDirector houseBuildDirector = new BuildDirector(new HouseBuilder());
        BuildDirector MansionBuildDirector = new BuildDirector(new MansionBuilder());
        houseBuildDirector.build();
        MansionBuildDirector.build();
    }
}
