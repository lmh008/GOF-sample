package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * ConcreteObserver（具体观察者）
 * —维护一个指向ConcreteSubject对象的引用。
 * —存储有关状态，这些状态应与目标的状态保持一致。
 * —实现Observer的更新接口以使自身状态与目标的状态保持一致。
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update(int state) {
        if (state % 3 == 0) {
            System.out.println("ConcreteObserverA update  " + state);
        }
    }
}
