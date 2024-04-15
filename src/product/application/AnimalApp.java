package product.application;

import product.data.Animal;
import product.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Kitty";
        cat.run();
    }
}
