package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int price = 0;

        while (true) {
            System.out.println("1 : 상품 입력 , 2: 결제 , 3 : 프로그램 종료");
            int userChoice = scanner.nextInt();

            scanner.nextLine();

            if (userChoice == 1) {
                System.out.println("상품명을 입력하세요");
                String productName = scanner.nextLine();

                System.out.println("상품 가격을 입력하세요");
                int productPrice = scanner.nextInt();

                System.out.println("구매 수량을 입력하세요");
                int productQuantity = scanner.nextInt();

                price += productPrice * productQuantity;
                System.out.println("상품명: " + productName + "가격: " + productPrice + "수량: " + productQuantity);
            } else if (userChoice == 2) {
                System.out.println("총비용" + price);
                price = 0;
            } else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 입력입니다 다시 입력해주십셔");
            }

        }


    }

}
