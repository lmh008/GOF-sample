package com.github;

/**
 * 1.  意图
 * 为子系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
 * 2.  动机
 * 将一个系统划分成为若干个子系统有利于降低系统的复杂性。一个常见的设计目标是使子系统间的通信和相互依赖关系达到最小。
 * 达到该目标的途径之一是就是引入一个 外观 （facade)对象，它为子系统中较一般的设施提供了一个单一而简单的界面。
 */
public class App {

    public static void main(String[] args) {
        SecurityFacade securityFacade = new SecurityFacade();
        securityFacade.Activate();
        securityFacade.Deactivate();
    }
}
