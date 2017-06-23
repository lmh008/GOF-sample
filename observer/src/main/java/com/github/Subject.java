package com.github;

import java.util.ArrayList;
import java.util.List;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * Subject（目标）
 * —目标知道它的观察者。可以有任意多个观察者观察同一个目标。
 * —提供注册和删除观察者对象的接口。
 */
public abstract class Subject {

    protected List<Observer> observers = new ArrayList<>();

    protected int state;

    public abstract void attach(Observer observer);

    public abstract void detach(Observer observer);

    public abstract void updateState(int state);

}
