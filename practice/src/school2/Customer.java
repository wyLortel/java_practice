package school2;

public class Customer implements Runnable {
    private Car car;

    public Customer(Car car) {
        this.car = car;  // ✅ 올바른 대입문
    }

    @Override
    public void run() {
        String carName = null;

        for (int i = 0; i < 20; i++) {
            carName = car.pop();

            try {
                Thread.sleep((int)(Math.random() * 2000));  // ✅ 괄호 수정
            } catch (InterruptedException e) {             // ✅ 예외 타입 수정
                e.printStackTrace();
            }
        }
    }
}
