package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * ConcreteSubject（具体目标）
 * —将有关状态存入各ConcreteObserver对象。
 * —当它的状态发生改变时,向它的各个观察者发出通知。
 */
public class ConcreteSubject extends Subject {

    @Override
    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void updateState(int state) {
        this.state = state;
        for (Observer observer : this.observers) {
            observer.update(state);
        }
    }
}
