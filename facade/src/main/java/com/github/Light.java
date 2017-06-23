package com.github;

import java.io.Console;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * Subsystemclasses(Scanner、Parser、ProgramNode等)
 * —实现子系统的功能。
 * —处理由Facade对象指派的任务。
 * —没有facade的任何相关信息；即没有指向facade的指针。
 */
public class Light {

    public void TurnOff() {
        System.out.println("Turning on the light.");
    }

    public void TurnOn() {
        System.out.println("Turning off the light.");
    }

    public void ChangeBulb() {
        System.out.println("changing the light-bulb.");
    }

}
