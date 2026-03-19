package main.models;

import main.enums.PaymentMethod;

public class Payment {
    private String paymentId;
    private double amount;
    private PaymentStrategy strategy;
    private PaymentMethod method;

    public Payment(String paymentId, double amount, PaymentMethod method) {
        this.paymentId = paymentId;
        this.amount = amount;
        setMethod(method);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean processPayment() {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy not set.");
        }
        return strategy.process(amount);
    }

    public boolean refund(double refundAmount) {
        if (refundAmount < 0 || refundAmount > amount) {
            return false;
        }
        amount -= refundAmount;
        return true;
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public void setMethod(PaymentMethod method) {
        this.method = method;
        this.strategy = PaymentStrategyFactory.fromMethod(method);
    }
}
