package product.application;

import product.data.LoginRequest;
import product.error.ValidationException;
import product.utils.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Selalu di eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("", "rahasia");
        ValidationUtil.validateRuntime(loginRequest1);
    }
}
