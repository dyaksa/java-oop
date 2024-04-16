package product.application;

import product.data.Bus;
import product.data.Car;

public class BusApp {
    public static void main(String[] args) {
        Car bus = new Bus();

        bus.setDrive("Big Buzz");
        bus.setTire(8);
        bus.setBrand("Scania");
        bus.setMaintenance(false);

        System.out.println("Bus name: " + bus.getDrive());
        System.out.println("Tire: " + bus.getTire());
        System.out.println("Brand: " + bus.getBrand());
        System.out.println("Maintenance: " + bus.isMaintenance());
        System.out.println("Is big? " + bus.isBig());
    }
}
