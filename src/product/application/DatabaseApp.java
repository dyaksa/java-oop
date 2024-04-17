package product.application;

import product.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        connect("null", "null");
    }

    public static void connect(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("connection database failed");
        }
        System.out.println("connection success");
    }
}
