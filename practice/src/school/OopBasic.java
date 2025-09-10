package school;

class MyStudnet {
    public int age;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

public class OopBasic {
    public static void main(String[] args) {
        MyStudnet m1 = new MyStudnet();
        m1.age = 20;


        MyStudnet m2 = new MyStudnet();
        m2.age = 22;

    }
}
