package product.application;

import product.data.Avanza;
import product.data.Car;

public class AvanzaApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        car.setDrive("Avanza");
        car.setTire(4);

        System.out.println("Car name: " + car.getDrive());
        System.out.println("Tire: " + car.getTire());
    }
}
