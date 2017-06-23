package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 * — 实现Implementor接口并定义它的具体实现
 */
public class ConcreteImplementor implements Implementor{

    @Override
    public void operation() {
        System.out.println("------------");
    }
}
