package product.application;

import product.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Coca cola", 2000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
