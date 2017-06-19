package com.github;

/**
 * Title
 * Author jirenhe@wanshifu.com
 * Time 2017/6/19.
 * Version v1.0
 */
public class DetailCarDecorator extends CarDecorator{

    @Override
    public void run(){
        System.out.println("this is a very nice car");
        System.out.println("this car have four tires");
        this.car.run();
    }

}
