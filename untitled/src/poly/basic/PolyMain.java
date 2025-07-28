package poly.basic;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("parent - parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("child - child");
        Child child = new Child();
        child.childMethod();
        child.parentMethod();


        System.out.println("Parent - child");
        Parent poly = new Child();
        poly.parentMethod();

    }
}
