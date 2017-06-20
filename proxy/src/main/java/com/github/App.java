package com.github;

/**
 * 代理模式区分与装饰模式：
 * 装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问
 * 代理模式给一个对象提供一个代理对象，并有代理对象来控制对原有对象的引用；
 * 装饰模式应该为所装饰的对象增强功能；
 * 代理模式对代理的对象施加控制，并不提供对象本身的增强功能
 */
public class App 
{
    public static void main( String[] args )
    {
        Subject subject = new Proxy();
        subject.doSomething();
    }
}
