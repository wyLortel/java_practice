package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("modelY");
        Dog dog1 = new Dog("멍멍이1",2);
        Dog dog2 = new Dog("멍멍이2",5);

        System.out.println("1.단순 toString호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2.printli호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);


        System.out.println("오브젝트 다형성 활용");
        ObjectPrint.print(car);
        ObjectPrint.print(dog1);
        ObjectPrint.print(dog2);

        String s = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(s);

        String s2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println(s2);


    }
}
