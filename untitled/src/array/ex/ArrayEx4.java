package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int [] num = new int[5];

        Scanner scanner = new Scanner(System.in);


        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }

        double average = (double) sum / num.length;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }

}
