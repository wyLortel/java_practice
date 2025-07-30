package poly.diamond;

public class DiamondMain {

    public static void main(String[] args) {
        InterfaceA child1 = new Child();
        child1.method();
        child1.methodCommon();

        InterfaceB child2 = new Child();
        child2.methodB();
        child2.methodCommon();
    }
}
