package com.github;

/**
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VehicleFactory v1 = new ExtremeVehicleFactory();
        VehicleFactory v2 = new OrdinaryVehicleFactory();
        v1.getBenz().benzRun();
        v1.getBmw().bmwRun();
        v2.getBenz().benzRun();
        v2.getBmw().bmwRun();
    }
}
