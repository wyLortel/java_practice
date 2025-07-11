package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");

        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[n];


        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "번쩨 주문 정보를 입력하세요.");
            System.out.println();

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            ProductOrder p = createOrder(productName, price, quantity);

            orders[i] = p;

        }

        printOrders(orders);

        int total = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + total);







    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

}
