package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/9/29.
 * Version v1.0
 */
public class Building {

    private Object base;

    private Object wall;

    private Object frame;

    public Object getBase() {
        return base;
    }

    public void setBase(Object base) {
        this.base = base;
    }

    public Object getWall() {
        return wall;
    }

    public void setWall(Object wall) {
        this.wall = wall;
    }

    public Object getFrame() {
        return frame;
    }

    public void setFrame(Object frame) {
        this.frame = frame;
    }

    @Override
    public String toString() {
        return "Building{" +
                "base=" + base +
                ", wall=" + wall +
                ", frame=" + frame +
                '}';
    }
}
