package com.github;

/**
 * 1.意图
 * 动态地给一个对象添加一些额外的职责。就增加功能来说，Decorator模式相比生成子类
 * 更为灵活。
 * 2.别名
 * 包装器Wrapper
 *
 * 装饰器模式的应用场景
 * 1、需要扩展一个类的功能。
 * 2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
 * 缺点：产生过多相似的对象，不易排错！
 *
 * 代理模式区分与装饰模式：
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问
 * 代理模式给一个对象提供一个代理对象，并有代理对象来控制对原有对象的引用；
 * 装饰模式应该为所装饰的对象增强功能；
 * 代理模式对代理的对象施加控制，并不提供对象本身的增强功能
 */
public class App {

    public static void main(String[] args) {
        Car car = new BenzCar();
        CarDecorator dscribeCarDecorator = new DscribeCarDecorator();
        CarDecorator detailCarDecorator = new DetailCarDecorator();
        car.run();
        System.out.println("---------------");
        dscribeCarDecorator.setCar(car);
        dscribeCarDecorator.run();
        System.out.println("---------------");
        detailCarDecorator.setCar(dscribeCarDecorator);
        detailCarDecorator.run();
    }
}
