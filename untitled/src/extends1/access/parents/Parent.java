package extends1.access.parents;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.setDefaultValue");
    }

    private void privateMethod() {
        System.out.println("Parent.privateValue");
    }

    public void printParent() {
        System.out.println("==parent 안==");
        System.out.println("publicvalue = " + publicValue);
        System.out.println("protectedVlue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);


        defaultMethod();
        privateMethod();
    }


}
