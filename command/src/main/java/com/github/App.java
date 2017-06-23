package com.github;

/**
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤消的操作。
 */
public class App {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command concreteCommandA = new ConcreteCommandA(receiver);
        Command concreteCommandB = new ConcreteCommandB(receiver);
        Invoker invoker = new Invoker();
        invoker.addCommand(concreteCommandA);
        invoker.addCommand(concreteCommandB);
        invoker.run();
    }
}
