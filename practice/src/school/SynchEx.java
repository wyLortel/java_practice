package school;

class ATM2 implements Runnable {
    private long depositMoney = 100000; // 계좌 잔액

    @Override
    public void run() {

        synchronized (this){
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000); // 1초 대기
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getDepositMoney() <= 0)
                    break;
                withdraw(10000);
            }
        }
    }


    // 동기화된 인출 메서드 (스레드 간 충돌 방지)
    public synchronized void withdraw(long howMuch) {
        if (getDepositMoney() > 0) {
            depositMoney -= howMuch;
            System.out.println(Thread.currentThread().getName() + "가 " + howMuch + "원 인출함");
            System.out.println("남은 잔액: " + getDepositMoney() + "원");
        } else {
            System.out.println(Thread.currentThread().getName() + ": 잔액 부족");
        }
    }

    public long getDepositMoney() {
        return depositMoney;
    }
}


public class SynchEx {
    public static void main(String[] args) {
        ATM2 atm = new ATM2();
        Thread mother = new Thread(atm, "사용자1");
        mother.start();

        ATM2 atm2 = new ATM2();
        Thread son = new Thread(atm, "사용자2");
        son.start();
    }
}

//쓰레드는 스타트가 되면 레디 상태가 되고 하나만 받을수잇고 갑자기 지맘대로 쉬러나올수잇다
//동기화 문제 해결해라 두개이상 쓰레드가 하나의 자원을 공ㅎ유해서 사용하면 무조건 동기화 문제 발생
//자바에는 쓰레드 동기화 문제 해결을 위헤 synchronized문법 제공
//synchronized은 동기화 문제 발생 코드에 접근할 경우 다른 쓰레드 접근이 불가능하게 함
//자바ㅏ는 기본적을 ㅗ클래스 보안을 위해 락거려잇음
//동기화 할려면 열쇠 얻어서 집입해야함 열쇠는 기본적으로 하나만잇고
//다른 블럭으로 진입할경우 다른 쓰레드에서는 열쇠를 획들할수없으므로
