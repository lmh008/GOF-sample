package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure（对象结构，如Program）
 * — 能枚举它的元素。
 * — 可以提供一个高层的接口以允许该访问者访问它的元素。
 * — 可以是一个复合（参见Composite（4.3））或是一个集合，如一个列表或一个无序集
 * 合
 */
public class ObjectStructure implements Element {

    private List<Element> elements;

    public ObjectStructure() {
        elements = new ArrayList<>();
        elements.add(new ConcreteElementA());
        elements.add(new ConcreteElementB());
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
