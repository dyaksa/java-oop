package product.utils;

import product.annotation.NotBlank;
import product.data.LoginRequest;
import product.error.BlankException;
import product.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("password is blank");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("username is blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("password is null");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("password is blank");
        }
    }

    public static void validateAnnotation(Object object) {
        Field[] fields = object.getClass().getDeclaredFields();
        for (var field : fields) {
            if (field.getAnnotation(NotBlank.class) != null) {
                field.setAccessible(true);
                try {
                    String value = (String) field.get(object);
                    if (value == null) {
                        throw new NullPointerException("Field " + field.getName() + " is null");
                    }
                    if (value.isBlank()) {
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
