package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main method start");
        method1();
        System.out.println("main end");
    }


    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10);
        method2(data1);
        System.out.println("method2 end");

    }


    static void method2(Data data2) {
        System.out.println("start method2");
        System.out.println("data.Value= " + data2.getValue());
        System.out.println("method2 end");
    }
}
