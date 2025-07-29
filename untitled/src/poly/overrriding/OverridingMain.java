package poly.overrriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child -> child");
        System.out.println("child.value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("parents.value = "+parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("poly.value= " + poly.value);
        poly.method();
    }
}
