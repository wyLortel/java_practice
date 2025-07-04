package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생수를 입력하세요");
        int n = scanner.nextInt();
        String[] subjects = {"국어", "영어", "수학"};

        int[][] arr = new int[n][subjects.length];

        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요");
            for (int j = 0; j < subjects.length; j++) {
                System.out.println(subjects[j] + "점수: " );
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < subjects.length; j++) {
                sum += arr[i][j];
            }
            double aver = sum / (double) subjects.length;
            System.out.println((i+1) + "번 학생의 총점" + sum + ", 평균: " + aver);
        }

    }

}
