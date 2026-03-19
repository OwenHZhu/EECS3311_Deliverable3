package main.models;

public class InstitutionalPayment implements PaymentStrategy {
    @Override
    public boolean process(double amount) {
        return amount >= 0.0;
    }
}

