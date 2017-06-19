package com.github;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = new BenzVehicleFactory().getVehicle();
        vehicle.run();
        vehicle = new BmwVehicleFactory().getVehicle();
        vehicle.run();
    }
}
