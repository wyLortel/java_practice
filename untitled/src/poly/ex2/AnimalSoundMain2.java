package poly.ex2;

public class AnimalSoundMain2 {

    public static void main(String[] args) {

        Animal[] animals = {new Dog(), new Cat(), new Cow() , new Pig() };

        for (Animal animal : animals) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 테스트");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }

}
