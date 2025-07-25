package final1;

public class FinalLocalMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;
//        data1=20; 컴파일 오 최초 한번만 가능

        final int data2 = 10;
//        data2 = 20;
    }

    static void method(final int parameter) {
        //parameter = 20;
    }
}
