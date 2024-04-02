public class Manager extends Employee {
    String address;

    Manager(String name, String address) {
        super(name);
        this.address = address;
    }



    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is " + super.name + " Manager");
    }
}
