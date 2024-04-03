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
        if(employee instanceof VicePresident vicePresident) {
            System.out.println("Hello " + vicePresident.name + " my name is VP");
        }else if(employee instanceof Manager manager){
            System.out.println("Hello " + manager.name + " my name is Manager");
        }else {
            System.out.println("Hello " + employee.name);
        }
    }
}
