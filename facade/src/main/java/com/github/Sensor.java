package com.github;

import java.io.Console;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 * <p>
 * Subsystemclasses(Scanner、Parser、ProgramNode等)
 * —实现子系统的功能。
 * —处理由Facade对象指派的任务。
 * —没有facade的任何相关信息；即没有指向facade的指针。
 */
public class Sensor {

    public void Activate() {
        System.out.println("Activating the sensor.");
    }

    public void Deactivate() {
        System.out.println("Deactivating the sensor.");
    }

    public void Trigger() {
        System.out.println("The sensor has triggered.");
    }

}
