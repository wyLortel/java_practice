package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요");
        String foodName = scanner.nextLine();

        System.out.println("가격을 입력해주세요");
        int foodPrice = scanner.nextInt();

        System.out.println("수량을 입력해주세요");
        int foodQuantity = scanner.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + "을 " + foodQuantity +
                "개 주문하셧습니다 총 가격은" + totalPrice + "원입니다");


    }
}
