package school;
class  MyCon{
    private int age;
    private  String name;

    public MyCon(int age , String name){
        this.age = age;
        this.name = name;
    }

    public MyCon(String name , int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}


public class ConstructorEx {

    public static void main(String[] args) {
       MyCon person1 = new MyCon(12,"김길동");
       MyCon person2 = new MyCon(13,"홍길동");
    }
}
