package main.models;

public interface PaymentStrategy {
    boolean process(double amount);
}

