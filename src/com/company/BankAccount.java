package com.company;

public class BankAccount{

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit (double sum){
        System.out.println(amount + sum);
    }

    void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма превышает: ", getAmount());
        }
        System.out.println(amount = amount - sum);
    }
}
