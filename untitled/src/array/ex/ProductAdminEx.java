package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productName = new String[10];
        int[] productPrice = new int[10];
        int count = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                if (count == 10) {
                    System.out.println("더이상 상품을 추가할수 없습니다");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productName[count] = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요");
                productPrice[count] = scanner.nextInt();
                count++;
                scanner.nextLine();
                System.out.println("상품이 등록 되엇습니다");
            } else if (userChoice == 2) {

                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }

                for (int i = 0; i < count; i++) {
                    System.out.println(productName[i] + ": " + productPrice[i] +"원");
                }
            } else if (userChoice == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("잘못된 선택입니다");
            }


        }
    }
}
