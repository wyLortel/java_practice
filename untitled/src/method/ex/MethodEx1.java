package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = add(a, b, c);
        double average = average(sum);
        System.out.println("평균값 : " + average);

        int sum2 = add(15, 25, 35);
        double aver = average(sum2);
        System.out.println("평균값 : " + aver);


    }


    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double average(int sum) {
        return sum / 3.0;
    }

}
