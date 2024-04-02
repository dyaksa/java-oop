public class ManagerApp {

    public static void main(String[] args) {
        var manager = new Manager("Paulo", "Jawa");
        manager.sayHello("Dyaksa");

        var vicePresident = new VicePresident("Abil");
        vicePresident.sayHello("Diana");

        var employee = new Employee("Dyaksa");
        employee.sayHello("Paulo");

        employee = new Manager("Winandi", "Rss");
        employee.sayHello("Dyaksa");

        employee = new VicePresident("Diana");
        employee.sayHello("Abil");

        SayHello(new Employee("Dyaksa"));
        SayHello(new Manager("Winandi", "Rss"));
        SayHello(new VicePresident("Diana"));
    }

    public static void SayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
