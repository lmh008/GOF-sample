package com.github;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = SimpleVehicleFactory.getVehicle("BENZ");
        vehicle.run();
    }
}
