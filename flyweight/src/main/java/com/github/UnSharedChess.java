package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * UnsharedConcreteFlyweight(Row,Column)
 * — 并非所有的Flyweight子类都需要被共享。Flyweight接口使共享成为可能，但它并不
 * 强制共享。在Flyweight对象结构的某些层次，UnsharedConcreteFlyweight对象通常
 * 将ConcreteFlyweight对象作为子节点（Row和Column就是这样）。
 *
 */
public class UnSharedChess implements Chess{

    @Override
    public void draw(int x, int y) {

    }
}
