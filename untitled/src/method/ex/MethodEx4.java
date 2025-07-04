package method.ex;

import java.math.BigInteger;
import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentAmount = 0;

        String main = """
                ---------------------------------
                1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
                ---------------------------------
                """;

        while (true) {
            System.out.println(main);

            System.out.print("선택: ");
            int userChoice = scanner.nextInt();

            scanner.nextLine();

            if (userChoice == 1) {
                currentAmount = deposit(currentAmount);
            } else if (userChoice == 2) {
                currentAmount = withdraw(currentAmount);
            } else if (userChoice == 3) {
                System.out.println("현재 잔액: " + currentAmount + "원");
            } else if (userChoice == 4) {
                System.out.println("프로그램을 종료합니다");
                break;
            }else {
                System.out.println("잘못된 입력입니다");
            }


        }

    }

    public static int deposit(int currentAmount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("임금액을 입력하세요: ");
        int depositAmount = scanner.nextInt();
        currentAmount += depositAmount;
        System.out.println(depositAmount + "원을 입금하엿습니다. 현재잔액" + currentAmount);
        return currentAmount;
    }

    public static int withdraw(int currentAmount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("출금액을 입력하세요: ");
        int withdrawAmount = scanner.nextInt();
        if (currentAmount < withdrawAmount) {
            System.out.println(withdrawAmount+ "원을 출력하려 햇으나 잔액이 부족합니다");
            return currentAmount;
        }else {
            currentAmount -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하엿습니다. 현재잔액" + currentAmount);
            return currentAmount;
        }

    }

}