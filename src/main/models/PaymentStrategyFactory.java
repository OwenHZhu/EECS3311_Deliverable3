package main.models;

import main.enums.PaymentMethod;

public final class PaymentStrategyFactory {
    private PaymentStrategyFactory() {}

    public static PaymentStrategy fromMethod(PaymentMethod method) {
        if (method == null) {
            throw new IllegalArgumentException("Payment method cannot be null.");
        }
        return switch (method) {
            case Credit -> new CreditPayment();
            case Debit -> new DebitPayment();
            case Institutional -> new InstitutionalPayment();
            case Grant -> new GrantPayment();
        };
    }
}

