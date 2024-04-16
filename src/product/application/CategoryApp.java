package product.application;

import product.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setExpensive(true);
        category.setName("Electronic");
        System.out.println("Category Name: " + category.getName());
        System.out.println("Is Expensive: " + category.isExpensive());
    }
}
