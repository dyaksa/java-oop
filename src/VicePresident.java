public class VicePresident extends Manager {

    VicePresident(String name) {
        super(name, null);
    }

    void sayHello(String name) {
        System.out.println("Hai " + name + " my name is " + super.name + " as VP");
    }
}
