package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int num1 = scanner.nextInt();

//        for (int i = 1; i <= 9; i++) {
//            System.out.println(num1 + "x" + i + " = " + num1 * i);
//        }
        int i = 1;
        while (i <= 9) {
            System.out.println(num1 + "x" + i + " = " + num1 * i);
            i++;
        }
    }
}
