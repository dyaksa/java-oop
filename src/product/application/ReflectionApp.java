package product.application;

import product.data.CreateRequest;
import product.utils.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateRequest request = new CreateRequest();
        request.setName("Dyaksa");
        request.setEmail("diasnoue87@yopmail.com");
        request.setPassword("rahasia");
        ValidationUtil.validateAnnotation(request);

        System.out.println("registrasi berhasil");
    }
}
