package product.data;

import java.util.Objects;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product " + name + " with price " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    //    public boolean equals(Object o){
//        if(this == o) return true;
//
//        if(!(o instanceof Product)) return false;
//
//        Product p = (Product) o;
//
//        if(this.price != p.price) return false;
//        return name != null ? name.equals(p.name) : p.name == null;
//    }
}
