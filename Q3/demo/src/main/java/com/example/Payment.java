package com.example;
import java.time.LocalDateTime;

public abstract class Payment {
    protected final double amount;

    protected Payment(double amount) {
        this.amount = amount;
    }

    public void logTransaction() {
        System.out.println("Transaction logged at " + LocalDateTime.now() + ", amount: " + amount);
    }

    public abstract void process();
}