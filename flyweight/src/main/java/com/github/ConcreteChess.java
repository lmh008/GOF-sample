package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * ConcreteFlyweight(Character)
 * — 实现Flyweight接口，并为内部状态（如果有的话）增加存储空间。
 * ConcreteFlyweight对象必须是可共享的。它所存储的状态必须是内部的；即，它必
 * 须独立于ConcreteFlyweight对象的场景。
 */
public class ConcreteChess implements Chess {

    //color对应了内部状态
    private Color color;

    public ConcreteChess(Color color) {
        this.color = color;
    }

    /**
     * //坐标对应了外部状态（将外部状态独立出去）
     * @param x
     * @param y
     */
    @Override
    public void draw(int x, int y) {
        //这里为了模拟控制台打印，没有使用x,y
        if (this.color == null) {
//            System.out.print("draw empty chess on " + x + "," + y);
            System.out.print("*");
        } else {
//            System.out.print("draw " + this.color.code + " chess on " + x + "," + y);
            System.out.print(this.color.code);
        }

    }
}
