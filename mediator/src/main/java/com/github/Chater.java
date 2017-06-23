package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * Colleagueclass(同事类，如ListBox,EntryField)
 * —每一个同事类都知道它的中介者对象。
 * —每一个同事对象在需与其他的同事通信的时候，与它的中介者通信。
 */
public interface Chater {

    void receive(String name,String msg);

    void sendAll(String msg);

    void send(String name, String msg);

    String getName();

    String getType();
}
