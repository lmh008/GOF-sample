package com.github;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Observer observera = new ConcreteObserverA();
        Observer observerb = new ConcreteObserverB();
        Subject subject = new ConcreteSubject();
        subject.attach(observera);
        subject.attach(observerb);
        for (int i = 0; i < 100; i++) {
            subject.updateState(i);
        }
    }
}
