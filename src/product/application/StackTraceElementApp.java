package product.application;

public class StackTraceElementApp {
    public static void main(String[] args) {
        try {
//            String[] names = {"Dyaksa", "Anggiani"};
//            System.out.println(names[100]);
            traceError();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void traceError() {
        try {
            String[] names = {"Dyaksa", "Anggiani"};
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
