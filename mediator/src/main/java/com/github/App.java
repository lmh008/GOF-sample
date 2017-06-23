package com.github;

/**
 * 用一个中介对象来封装一系列的对象交互。
 * 中介者使各对象不需要显式地相互引用，从 而使其耦合松散，而且可以独立地改变它们之间的交互。
 *
 * 模拟一个网络聊天室，ChatMediator聊天中介，起到中介者的作用
 * 聊天者Chater(colleague)不必知道其他聊天者的情况。
 *
 * 与观察者模式不同的是：
 * 观察者模式事情的发起者是Subject，所有观察者是被动的接受事件
 * 中介者模式事件的发起者是colleague，Mediator本身只做事件的转发，不参与事件的发起
 */
public class App {

    public static void main(String[] args) {
        ChatMediator chatMediator = new SampleChatMediator();
        Chater pcChater = new PcChater("张三", chatMediator);
        Chater mobileChater = new MobileChater("李四",chatMediator);
        chatMediator.addChater(pcChater);
        chatMediator.addChater(mobileChater);
        pcChater.sendAll("hello");
        mobileChater.send("张三", "nice to meet you");
    }
}
