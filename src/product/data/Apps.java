package product.data;

public class Apps {

    public static final int PROCESSORS;

    static {
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
