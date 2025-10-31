package school2;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<String> carList = null;

    public Car() {
        carList = new ArrayList<>();
    }

    public String getCar() {
        String carName = null;

        switch ((int)(Math.random() * 3)) {
            case 0:
                carName = "SMS";
                break;
            case 1:
                carName = "매그너스";
                break;
            case 2:
                carName = "카렌스";
                break;
        }
        return carName;
    }

    public synchronized String pop() {
        String carName = null;

        if (carList.size() == 0) {
            try {
                System.out.println("차가 없어요. 생산할 때까지 기다려요 🚗💤");
                this.wait();  // 생산 쓰레드가 notify() 할 때까지 대기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        carName = carList.remove(carList.size() - 1);
        System.out.println("손님이 구입한 차 이름은 => " + carName);
        return carName;
    }

    public  synchronized void posh(String car){
        carList.add(car);
        System.out.println("차가 만들어 졌습니다" + "차 이름은 " + car + "");
        if (carList.size() == 5){
            this.notify();
        }
    }
}


