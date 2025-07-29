package poly.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 울음소리 테스트");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }

}
