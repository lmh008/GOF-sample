package com.github;

/**
 * ConcreteElement（具体元素，如AssignmentNode，VariableRefNode）
 * — 实现Accept操作，该操作以一个访问者为参数
 */
public class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }

    //区别ConcreteElementA完全不同的方法
    public String elementBMethod() {
        return "ConcreteElementB";
    }
}
