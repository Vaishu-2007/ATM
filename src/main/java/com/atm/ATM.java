
package com.atm;

public class ATM {

    private double balance;

    // Constructor
    public ATM(double initialBalance) {

        if (initialBalance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative");
        }

        this.balance = initialBalance;
    }

    // Balance Enquiry
    public double checkBalance() {
        return balance;
    }

    // Cash Deposit
    public void deposit(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive");
        }

        balance = balance + amount;

        System.out.println("Amount deposited: Rs. " + amount);
    }

    // Cash Withdrawal
    public void withdraw(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance");
        }

        balance = balance - amount;

        System.out.println("Amount withdrawn: Rs. " + amount);
    }
}

