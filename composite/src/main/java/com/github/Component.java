package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/22.
 * Version v1.0
 *
 * —为组合中的对象声明接口。
 * —在适当的情况下，实现所有类共有接口的缺省行为。
 * —声明一个接口用于访问和管理Component的子组件。
 * —(可选)在递归结构中定义一个接口，用于访问一个父部件，并在合适的情况下实现它。
 */
public interface Component {


    void add(Component component);

    void remove(Component component);

    void display();

    void display(int level);
}
