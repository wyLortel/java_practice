package poly.basic;

public class CastingMain3 {

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = child;
        Parent parent2 = (Parent) child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
