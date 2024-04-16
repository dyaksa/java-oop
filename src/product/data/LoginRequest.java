package product.data;

public record LoginRequest(String username, String password) {

    public LoginRequest() {
        this(null, null);
    }

    public LoginRequest(String username) {
        this(username, null);
    }
}
