package com.example;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter payment amount:");
        double amount = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Choose payment method: (card / cod)");
        String method = sc.nextLine().toLowerCase();

        Payment payment = null;

        if (method.equals("card")) {
            payment = new CreditCartPayment(amount);
        } else if (method.equals("cod")) {
            System.out.println("Enter delivery address:");
            String address = sc.nextLine();
            payment = new CashOnDelivery(amount, address);
        } else {
            System.out.println("Invalid payment method.");
            System.exit(0);
        }

        System.out.println("\nProcessing...\n");
        payment.process();
    }
}