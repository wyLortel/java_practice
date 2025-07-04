package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("입력한 정수를 역순으로 출력: ");

        for (int i = 4; i > -1; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ",");
            }else {
                System.out.println(numbers[i]);
            }

        }




    }

}
