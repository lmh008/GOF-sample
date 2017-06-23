package com.github;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/23.
 * Version v1.0
 *
 * ConcreteMediator(具体中介者，如FontDialogDirector)
 * —具体中介者通过协调各同事对象实现协作行为。
 * —了解并维护它的各个同事。
 */
public class SampleChatMediator implements ChatMediator {

    private Map<String, Chater> map;

    public SampleChatMediator() {
        this.map = new HashMap<>();
    }

    @Override
    public void addChater(Chater chater) {
        map.put(chater.getName(), chater);
    }

    @Override
    public void removeChater(Chater chater) {
        map.remove(chater.getName());
    }

    @Override
    public void sendAll(Chater chater, String msg) {
        Set<Map.Entry<String, Chater>> entrys = this.map.entrySet();
        for (Map.Entry<String, Chater> entry : entrys) {
            if (!entry.getKey().equals(chater.getName())) {
                entry.getValue().receive(chater.getName(), msg);
            }
        }
    }

    @Override
    public void send(Chater chater, String name, String msg) {
        Chater target = this.map.get(name);
        if (target != null) {
            target.receive(chater.getName(), msg);
        }
    }
}
