package com.github;

/**
 * 1.  意图 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。 第 3 章 创建型模式 6 3 下载 2.  动机 一个 R T F （ Rich Text Format ）文档交换格式的阅读器应能将 R T F 转换为多种正文格式。 该阅读器可以将 R T F
 * 文档转换成普通 A S C I I 文本或转换成一个能以交互方式编辑的正文窗口组 件。但问题在于可能转换的数目是无限的。因此要能够很容易实现新的转换的增加，同时却 不改变 R T F 阅读器
 */
public class App {

    public static void main(String[] args) {
        BuildDirector houseBuildDirector = new BuildDirector(new HouseBuilder());
        BuildDirector MansionBuildDirector = new BuildDirector(new MansionBuilder());
        houseBuildDirector.build();
        MansionBuildDirector.build();
    }
}
