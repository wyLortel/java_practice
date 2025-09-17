package school;

class Parent{
    int age;

    public  Parent(int age){
        this.age =age;
    }
}

class Son extends Parent{
    String name;

    public Son(String name , int age){
        super(age);
        this.name = name;
    }

}





public class main {
}
