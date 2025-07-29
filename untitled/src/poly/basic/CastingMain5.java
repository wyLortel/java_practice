package poly.basic;

public class CastingMain5 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        cal(parent1);

        Parent parent2 = new Child();
        cal(parent2);
    }

    private static void cal(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child) {
            System.out.println("child 인스턴스");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
