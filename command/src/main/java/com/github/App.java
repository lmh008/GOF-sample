package com.github;

/**
 * 将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤消的操作。
 *
 * 3.动机
 * 有时必须向某对象提交请求，但并不知道关于被请求的操作或请求的接受者的任何信息。
 * 例如，用户界面工具箱包括按钮和菜单这样的对象，它们执行请求响应用户输入。但工具箱
 * 不能显式的在按钮或菜单中实现该请求，因为只有使用工具箱的应用知道该由哪个对象做哪
 * 个操作。而工具箱的设计者无法知道请求的接受者或执行的操作。
 * 命令模式通过将请求本身变成一个对象来使工具箱对象可向未指定的应用对象提出请求。
 * 这个对象可被存储并像其他的对象一样被传递。这一模式的关键是一个抽象的Command类，
 * 它定义了一个执行操作的接口。其最简单的形式是一个抽象的Execute操作。具体的Command
 * 子类将接收者作为其一个实例变量，并实现Execute操作，指定接收者采取的动作。而接收者
 * 有执行该请求所需的具体信息
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
