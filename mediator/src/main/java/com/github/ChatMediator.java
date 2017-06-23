package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * Mediator(中介者，如DialogDirector)
 * —中介者定义一个接口用于与各同事（Colleague）对象通信。
 */
public interface ChatMediator {

    void addChater(Chater chater);

    void removeChater(Chater chater);

    void sendAll(Chater chater, String msg);

    void send(Chater chater, String name, String msg);
}
