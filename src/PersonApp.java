public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Dyaksa", "Demak");
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        var person2 = new Person("Budi");
        System.out.println(person2.name);
        person2.sayHello("Joko");

        var person3 = new Person();
        person3.name = "Joko";
        System.out.println(person3.name);
        person3.sayHello("Budi");
    }
}
