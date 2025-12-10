package com.example;

public class CreditCartPayment extends Payment implements SecureTransaction{

    public CreditCartPayment(double amount) {
        super(amount);
    }

    @Override
    public boolean authenticate() {
        System.out.println("Authenticating credit card...");

        return true;
    }

    @Override
    public void process() {
        
        if (authenticate()) {
            logTransaction();
            System.out.println("Charging credit card: " + amount);
        } else {
            System.out.println("Authentication failed. Payment aborted.");
        }
    }
}
