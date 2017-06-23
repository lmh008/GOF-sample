package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * Client
 * — 维持一个对flyweight的引用。
 * — 计算或存储一个（多个）flyweight的外部状态。
 *
 * 棋盘类
 * 控制chessFactory
 */
public class ChessBoard {

    private Color[][] chessBoardState;

    private ChessFactory chessFactory;

    public ChessBoard() {
        chessBoardState = new Color[10][10];
        chessFactory = new ChessFactory();
    }

    public void draw(){
        for (int i = 0; i < chessBoardState.length; i++) {
            Color[] colors = chessBoardState[i];
            for (int j = 0; j < colors.length; j++) {
                chessFactory.getChess(colors[j]).draw(i, j);
            }
            System.out.println();
        }
    }

    public void addPiece(int x, int y, Color color){
        chessBoardState[x][y] = color;
    }
}
