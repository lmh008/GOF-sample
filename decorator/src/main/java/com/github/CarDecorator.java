package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 * <p>
 * Decorator
 * —维持一个指向Component对象的指针，并定义一个与Component接口一致的接口。
 */
public abstract class CarDecorator implements Car {

    protected Car car;

    @Override
    public void run() {
        if (car != null) {
            car.run();
        }
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
