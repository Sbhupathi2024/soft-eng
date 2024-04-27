package edu.okcu.softeng;

public class Bank {
    private double balance;

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
