package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 *
 * ConcreteCommand
 * — 将一个接收者对象绑定于一个动作。
 * — 调用接收者相应的操作，以实现Execute。
 */
public class ConcreteCommandA implements Command{

    private Receiver receiver;

    public ConcreteCommandA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomethingA();
    }
}
