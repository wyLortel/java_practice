package static2.ex;

public class Car {
    private String carName;
    private static int count;

    public Car(String carName) {
        this.carName = carName;
        System.out.println("차량 구입, 이름: " + carName );
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량수" + count);
    }

}
