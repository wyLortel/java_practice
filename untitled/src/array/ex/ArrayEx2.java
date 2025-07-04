package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생성할 숫자 갯수");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i + "번째 숫자입력");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("출력 : ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }





    }

}
