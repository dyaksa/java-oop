package product.application;

import product.data.Avanza;
import product.data.Car;

public class AvanzaApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.setDrive("Avanza");
        car.setTire(4);
        car.setBrand("Toyota");
        car.setMaintenance(false);

        System.out.println("Car name: " + car.getDrive());
        System.out.println("Tire: " + car.getTire());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Maintenance: " + car.isMaintenance());
    }
}
