package com.github;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        VehicleFactory.getBenz("Extreme").benzRun();
        VehicleFactory.getBenz("Ordinary").benzRun();
        VehicleFactory.getBmw("Extreme").bmwRun();
        VehicleFactory.getBmw("Ordinary").bmwRun();
    }
}
