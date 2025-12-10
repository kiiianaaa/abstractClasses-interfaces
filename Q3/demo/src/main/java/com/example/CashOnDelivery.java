package com.example;

public class CashOnDelivery extends Payment {

    private final String address;

    public CashOnDelivery(double amount, String address) {
        super(amount);
        this.address = address;
    }

    @Override
    public void process() {
        logTransaction();
        System.out.println("Collect cash at: " + address);
    }
    
}