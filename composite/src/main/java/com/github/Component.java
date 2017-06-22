package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 */
public interface Component {


    void add(Component component);

    void remove(Component component);

    void display();

    void display(int level);
}
