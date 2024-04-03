package product.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Coca cola", 2000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
