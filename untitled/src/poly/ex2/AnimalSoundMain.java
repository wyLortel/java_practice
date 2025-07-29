package poly.ex2;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        Animal duck = new Duk();

        soundAnimals(dog);
        soundAnimals(cat);
        soundAnimals(cow);
        soundAnimals(duck);

//        Animal[] animals = {dog, cat, cow};
//
//        for (Animal animal : animals) {
//            System.out.println("동물 울음소리 테스트");
//            animal.sound();
//            System.out.println("동물 울음소리 테스트 종료");
//
//        }
    }



    private static void soundAnimals(Animal animal) {
        System.out.println("동물 울음소리 테스트");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }
}
