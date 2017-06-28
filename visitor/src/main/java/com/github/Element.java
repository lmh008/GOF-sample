package com.github;

/**
 * Element（元素，如Node）
 * — 定义一个Accept操作，它以一个访问者为参数
 */
public interface Element {

    void accept(Visitor visitor);

}
