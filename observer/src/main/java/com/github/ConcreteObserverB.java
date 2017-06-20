package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class ConcreteObserverB implements Observer {

    @Override
    public void update(int state) {
        if (state % 4 == 0) {
            System.out.println("ConcreteObserverB update  " + state);
        }
    }
}
