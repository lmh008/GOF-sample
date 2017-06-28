package com.github;

/**
 * ConcreteVisitor（具体访问者，如TypeCheckingVisitor）
 * — 实现每个由Visitor声明的操作。每个操作实现本算法的一部分，而该算法片断乃是
 * 对应于结构中对象的类。ConcreteVisitor为该算法提供了上下文并存储它的局部状态。
 * 这一状态常常在遍历该结构的过程中累积结果
 */
public class ConcreteVisitor2 implements Visitor {

    @Override
    public void visitElementA(ConcreteElementA element) {
        System.out.println("ConcreteVisitor2 visit " + element.elementAMethod());
    }

    @Override
    public void visitElementB(ConcreteElementB element) {
        System.out.println("ConcreteVisitor2 visit " + element.elementBMethod());
    }
}
