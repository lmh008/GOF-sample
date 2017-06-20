package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    protected int state;

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void updateState(int state);

}
