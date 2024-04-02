public class Manager {
    String name;
    String address;

    Manager(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Manager(String name) {
        this(name, null);
    }

    Manager() {
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is " + this.name + " Manager");
    }
}
