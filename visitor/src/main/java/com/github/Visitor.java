package com.github;

/**
 * Visitor
 * — 为该对象结构中ConcreteElement的每一个类声明一个Visit操作。该操作的名字和特
 * 征标识了发送Visit请求给该访问者的那个类。这使得访问者可以确定正被访问元素
 * 的具体的类。这样访问者就可以通过该元素的特定接口直接访问它。
 */
public interface Visitor {

    //依赖具体事例，不依赖抽象
    void visitElementA(ConcreteElementA element);

    //依赖具体事例，不依赖抽象
    void visitElementB(ConcreteElementB element);
}
