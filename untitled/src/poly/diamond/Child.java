package poly.diamond;

public class Child implements InterfaceA, InterfaceB {

    @Override
    public void method() {
        System.out.println("childMethod1");

    }

    @Override
    public void methodCommon() {
        System.out.println("child.common");

    }

    @Override
    public void methodB() {
        System.out.println("childMethod2");
    }
}
