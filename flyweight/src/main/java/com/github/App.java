package com.github;

/**
 * 1.意图
 * 运用共享技术有效地支持大量细粒度的对象
 * <p>
 * 3.适用性
 * Flyweight模式的有效性很大程度上取决于如何使用它以及在何处使用它。当以下情况都
 * 成立时使用Flyweight模式：
 * • 一个应用程序使用了大量的对象。
 * • 完全由于使用大量的对象，造成很大的存储开销。
 * • 对象的大多数状态都可变为外部状态。
 * • 如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象。
 * • 应用程序不依赖于对象标识。由于Flyweight对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值
 * <p>
 * 例如：五子棋应用：棋盘上有大量的棋子，棋子的黑白颜色是棋子的内部状态，坐标可以做外部状态
 * 可以利用享元模式减少内存消耗。
 */
public class App {

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        chessBoard.addPiece(0, 0, Color.WHITE);
        chessBoard.addPiece(2, 4, Color.BLACK);
        chessBoard.addPiece(2, 1, Color.WHITE);
        chessBoard.addPiece(4, 6, Color.BLACK);
        chessBoard.draw();
    }
}
