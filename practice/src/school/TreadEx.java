package school;

// ✅ [1] Thread 클래스를 상속하는 방식
class MyThread1 extends Thread {
    // run()은 쓰레드가 실제로 수행할 작업을 정의하는 콜백 메서드
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread1 : " + i);
        }
    }
}


// ✅ [2] Runnable 인터페이스를 구현하는 방식
class MyThread2 implements Runnable {

    // 선택사항: 직접 start() 메서드를 만들어서 실행 흐름을 단순화할 수도 있음
    public void start() {
        Thread t = new Thread(this); // this = 현재 Runnable 객체
        t.start(); // 실제 스레드 실행 (run()이 내부적으로 호출됨)
    }

    @Override
    public void run() {
        for (int i = 100; i < 1000; i += 100) {
            System.out.println("MyThread2 : " + i);
        }
    }
}


// ✅ [3] 실행 클래스
public class  TreadEx {

    public static void main(String[] args) {
        System.out.println("start");

        // (1) Thread 상속 방식
        MyThread1 m1 = new MyThread1();
        m1.start(); // 새 스레드가 생성되어 run() 실행

        // (2) Runnable 구현 방식
        MyThread2 m2 = new MyThread2();
        Thread m2t = new Thread(m2); // Runnable 구현체를 Thread 생성자에 전달
        m2t.start(); // 별도의 스레드로 run() 실행됨

        System.out.println("end");

    }
}
