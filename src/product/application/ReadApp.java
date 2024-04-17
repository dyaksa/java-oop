package product.application;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("Re.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
//        BufferedReader reader = null;
//
//        try {
//            reader = new BufferedReader(
//                    new FileReader("README.md")
//            );
//            while (true) {
//                String line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//            }
//        } catch (Throwable e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
    }
}
