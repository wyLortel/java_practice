package method;

public class Overloading2 {
    public static void main(String[] args) {
        muMethod(1, 1.2);
        muMethod(1.2,1);

    }


    public static void muMethod(int a, double b) {
        System.out.println("int a , double b");
    }


    public static void muMethod(double a, int b) {
        System.out.println("double a , int b");
    }
}
