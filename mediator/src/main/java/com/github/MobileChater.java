package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 * 对于Colleagueclass不需要知道其他Colleagueclass，只需要知道中介
 */
public class MobileChater implements Chater {

    private String name;

    private ChatMediator chatMediator;

    public MobileChater(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    @Override
    public void receive(String name, String msg) {
        System.out.println("【" + this.getName() + "on mobile receive msg from " + name + "】   " + msg);
    }

    @Override
    public void sendAll(String msg) {
        this.chatMediator.sendAll(this, msg);
    }

    @Override
    public void send(String name, String msg) {
        this.chatMediator.send(this, name, msg);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return "MOBILE";
    }
}
