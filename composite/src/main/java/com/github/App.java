package com.github;

/**
 * 组合模式
 * 将对象组合成树形结构以表示“部分 - 整体”的层次结构。
 * Composite使得用户对单个对象 和组合对象的使用具有一致性。
 * 树形结构
 */
public class App {

    public static void main(String[] args) {
        Component root = new Composite("root");
        Component secondLevel1 = new Composite("secondLevel1");
        Component secondLevel2 = new Composite("secondLevel2");
        Component thirdLevel1_1 = new Composite("thirdLevel1_1");
        Component thirdLevel1_2 = new Composite("thirdLevel1_2");
        thirdLevel1_1.add(new Leaf("leaf1_1_1"));
        thirdLevel1_2.add(new Leaf("leaf1_2_1"));
        secondLevel1.add(thirdLevel1_1);
        secondLevel1.add(thirdLevel1_2);
        secondLevel2.add(new Leaf("leaf2_1"));
        root.add(secondLevel1);
        root.add(secondLevel2);
        root.display();
    }
}
