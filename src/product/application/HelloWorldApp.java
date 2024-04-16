package product.application;

import product.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            private String name;

            public void setName(String name) {
                this.name = name;
            }

            public String sayHello() {
                return "Hello " + name;
            }
        };

        english.setName("Budi");
        System.out.println(english.sayHello());

        english.setName("Dyaksa");
        System.out.println(english.sayHello());

        HelloWorld indonesia = new HelloWorld() {
            private String name;

            @Override
            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String sayHello() {
                return "Halo " + name;
            }
        };

        indonesia.setName("Dyaksa");
        System.out.println(indonesia.sayHello());
    }
}
