package poly.ex.pay1;

import java.util.Scanner;

public class PayMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            PayService payService = new PayService();
            //kakao 결제
            System.out.println("결제 수단을 입력하세요: ");
            String payOption = scanner.nextLine();
            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("결제 금액을 입력하세요: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            payService.processPay(payOption, amount);
        }

    }
}
