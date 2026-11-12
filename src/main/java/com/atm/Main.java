
package com.atm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM(10000);

        int choice = 0;

        do {

            System.out.println("\n===== ATM TRANSACTION SYSTEM =====");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Cash Deposit");
            System.out.println("3. Cash Withdrawal");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            try {

                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println(
                            "Available Balance: Rs. "
                            + atm.checkBalance());
                        break;

                    case 2:
                        System.out.print(
                            "Enter deposit amount: ");

                        double depositAmount = sc.nextDouble();

                        atm.deposit(depositAmount);

                        System.out.println(
                            "Updated Balance: Rs. "
                            + atm.checkBalance());
                        break;

                    case 3:
                        System.out.print(
                            "Enter withdrawal amount: ");

                        double withdrawAmount = sc.nextDouble();

                        atm.withdraw(withdrawAmount);

                        System.out.println(
                            "Updated Balance: Rs. "
                            + atm.checkBalance());
                        break;

                    case 4:
                        System.out.println(
                            "Thank you for using ATM!");
                        break;

                    default:
                        System.out.println(
                            "Invalid choice!");
                }

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (java.util.InputMismatchException e) {

                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }

        } while (choice != 4);

        sc.close();
    }
}

