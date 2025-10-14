package cond;

public class MethodValue1 {

    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("1.ChangeNumber 호출전 , num1" + num1);
        changeNum(num1);
        System.out.println("호출후" + num1);
    }

    public static void changeNum(int num2) {
        System.out.println("넘버 변경 전" + num2);
        num2 = num2 * 2;
        System.out.println("3.체인지 넘버 번경후, num2: " + num2);
    }
}

