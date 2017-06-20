package com.github;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstratTemplate abstratTemplateA = new ConcreteClassA();
        AbstratTemplate abstratTemplateB = new ConcreteClassB();
        abstratTemplateA.run();
        abstratTemplateA.run();
    }
}
