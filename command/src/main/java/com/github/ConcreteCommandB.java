package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 */
public class ConcreteCommandB implements Command{

    private Receiver receiver;

    public ConcreteCommandB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomethingB();
    }
}
