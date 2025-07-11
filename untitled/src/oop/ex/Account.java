package oop.ex;

public class Account {
    int balance;


    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금햇습니다 현재 금액" + balance + "원");
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println(amount + "원을 출금하려 햇으나 잔액이 부족합니다");
        }else {
            balance -= amount;
            System.out.println(amount + "원을 출금햇습니다 현재 금액" + balance + "원");
        }
    }

    void printBalance() {
        System.out.println("현재 잔액" + balance + "원");
    }




}
