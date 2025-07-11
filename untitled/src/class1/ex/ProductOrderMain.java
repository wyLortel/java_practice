package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productOrderName = "두부";
        product1.price = 2000;
        product1.quantity = 2;


        ProductOrder product2 = new ProductOrder();
        product2.productOrderName = "김치";
        product2.price = 5000;
        product2.quantity = 1;


        ProductOrder product3 = new ProductOrder();
        product3.productOrderName = "콜라";
        product3.price = 5000;
        product3.quantity = 2;


        ProductOrder[] products = {product1, product2, product3};

        int totalPrice = 0;

        for (ProductOrder p : products) {
            System.out.println("상품명: " + p.productOrderName + "가격: " + p.price + "수량: " + p.quantity);
            totalPrice += p.price;
        }

        System.out.println("총 결제 금액: " + totalPrice);


    }
}
