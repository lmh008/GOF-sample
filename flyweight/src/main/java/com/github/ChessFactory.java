package com.github;

import java.util.HashMap;
import java.util.Map;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * FlyweightFactory
 * — 创建并管理flyweight对象。
 * — 确保合理地共享flyweight。当用户请求一个flyweight时，FlyweightFactory对象提供
 * 一个已创建的实例或者创建一个（如果不存在的话）。
 */
public class ChessFactory {

    private Map<Color, Chess> chessMap;

    public ChessFactory() {
        chessMap = new HashMap<>();
    }

    public Chess getChess(Color color) {
        return chessMap.computeIfAbsent(color, ConcreteChess::new);
    }
}
