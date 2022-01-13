package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount();
        userAccount.deposit(20000);

        while (true) {
            try {
                userAccount.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                try {
                    userAccount.withDraw(userAccount.getAmount());
                    System.out.println("У вас нет средств");
                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                }
                break;
            }
        }
    }
}
