public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager("Paulo");
        manager.sayHello("Dyaksa");

        var vicePresident = new VicePresident("Abil");
        vicePresident.sayHello("Dyaksa");
    }
}
