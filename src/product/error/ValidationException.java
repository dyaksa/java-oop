package product.error;

public class ValidationException extends Throwable {
    public ValidationException(String message) {
        super(message);
    }
}
