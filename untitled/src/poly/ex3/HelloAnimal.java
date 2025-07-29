package poly.ex3;

import poly.ex2.Animal;

public class HelloAnimal extends AbstractAnimal {

    @Override
    public void sound() {

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 테스트");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }
}
