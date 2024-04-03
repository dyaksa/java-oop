public class VicePresident extends Manager {

    VicePresident(String name) {
        super(name, null);
    }

    void sayHello(String name) {
        System.out.println("Hai " + name + " my name is " + this.name + " as VP");
    }
}
