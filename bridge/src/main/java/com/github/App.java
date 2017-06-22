package com.github;

/**
 * 桥接模式
 * 将抽象部分与它的实现部分分离，使它们都可以独立地变化。
 * 当一个抽象可能有多个实现时，通常用继承来协调它们。抽象类定义对该抽象的接口， 而具体的子类则用不同方式加以实现。
 * 但是此方法有时不够灵活。继承机制将抽象部分与它的实现部分固定在一起，使得难以对抽象部分和实现部分独立地进行修改、扩充和重用。
 */
public class App {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.doSomething();
    }
}
