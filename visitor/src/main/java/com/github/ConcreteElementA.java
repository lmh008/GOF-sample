package com.github;

/**
 * ConcreteElement（具体元素，如AssignmentNode，VariableRefNode）
 * — 实现Accept操作，该操作以一个访问者为参数
 */
public class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }

    //区别ConcreteElementB完全不同的方法
    public String elementAMethod() {
        return "ConcreteElementA";
    }
}
