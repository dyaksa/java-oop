package product.application;

import product.data.Customer;
import product.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PLATINUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        for (var value : Level.values()) {
            System.out.println(value);
        }

        String levelString = Level.BRONZE.name();
        System.out.println(levelString);

        Level level = Level.valueOf("GOLD");
        System.out.println(level);
    }
}
