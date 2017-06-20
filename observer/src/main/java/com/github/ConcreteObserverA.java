package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update(int state) {
        if (state % 3 == 0) {
            System.out.println("ConcreteObserverA update  " + state);
        }
    }
}
