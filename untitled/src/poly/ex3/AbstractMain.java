package poly.ex3;

import poly.ex2.Animal;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 울음소리 테스트");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }

}
