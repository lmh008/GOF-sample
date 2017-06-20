package com.github;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.doSomething();
    }
}
