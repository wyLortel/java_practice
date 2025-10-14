package cond;

public class MethodValue3 {
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("호출전" + num1);

        num1 = changenum(num1);
        System.out.println("호출후" + num1);
    }

    public static int changenum(int num1) {
        num1 = num1 * 2;
        return num1;
    }
}
