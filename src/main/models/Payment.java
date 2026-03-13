package main.models;

import main.enums.*;

public class Payment {
    private String paymentId;
    private double amount;
    private PaymentMethod method;

    public Payment(String paymentId, double amount, PaymentMethod method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
    }

    public boolean processPayment() {
        return amount >= 0.0;
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
    }
}
