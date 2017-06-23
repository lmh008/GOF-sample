package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/20.
 * Version v1.0
 *
 * Facade(Compiler)
 * —知道哪些子系统类负责处理请求。
 * —将客户的请求代理给适当的子系统对象。
 */
public class SecurityFacade {

    private Camera camera1, camera2;
    private Light light1, light2, light3;
    private Sensor sensor;

    SecurityFacade() {
        camera1 = new Camera();
        camera2 = new Camera();
        light1 = new Light();
        light2 = new Light();
        light3 = new Light();
        sensor = new Sensor();
    }

    public void Activate() {
        camera1.TurnOn();
        camera2.TurnOn();
        light1.TurnOn();
        light2.TurnOn();
        light3.TurnOn();
        sensor.Activate();
    }

    public void Deactivate() {
        camera1.TurnOff();
        camera2.TurnOff();
        light1.TurnOff();
        light2.TurnOff();
        light3.TurnOff();
        sensor.Deactivate();
    }

}
