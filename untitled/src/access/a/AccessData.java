package access.a;

public class AccessData {

    public int publicField;
    int defaultField;
    private int privateFiled;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출" + defaultField);
    }

    void privateMethod() {
        System.out.println("privatreMethod 호출" + privateFiled);
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateFiled = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
