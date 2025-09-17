package school;

class Animal {
    public void  cry() {
        System.out.println("동물이 운다");
    }

}

class Cat extends Animal{

    @Override
    public void cry(){
        System.out.println("야옹");
    }
}
class  Dog extends Animal{

    @Override
    public void cry(){
        System.out.println("멍멍");
    }
}






public class AnimalFarm {
    public static void main(String[] args) {

    }
}
