public class ParentApp {
    public static void main(String[] args) {
        var child = new Child();
        child.name = "Dyaksa";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
