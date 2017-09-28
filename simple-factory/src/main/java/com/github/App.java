package com.github;

/**
 * Hello world!
 *  简单工厂模式，特点：工厂类中包含了实例实例化的判断。
 *  如果增加一类产品，需要修改工厂类，在工厂中增加相应的逻辑判断。违背开闭原则
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = SimpleVehicleFactory.getVehicle("BENZ");
        vehicle.run();
    }
}
