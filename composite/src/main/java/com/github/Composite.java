package com.github;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 * <p>
 * —定义有子部件的那些部件的行为。
 * —存储子部件。
 * —在Component接口中实现与子部件有关的操作。
 */
public class Composite implements Component {

    private List<Component> list;

    private String name;

    public Composite(String name) {
        this.list = new LinkedList<>();
        this.name = name;
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void display() {
        this.display(0);
    }

    @Override
    public void display(int level) {
        char[] chars = new char[level];
        Arrays.fill(chars, '-');
        System.out.println(new String(chars) + this.name);
        for (Component component : list) {
            component.display(level + 2);
        }
    }
}
