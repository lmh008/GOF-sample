package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * Flyweight(Glyph)
 * — 描述一个接口，通过这个接口flyweight可以接受并作用于外部状态。
 */
public interface Chess {

    //坐标对应了外部状态
    void draw(int x, int y);
}
