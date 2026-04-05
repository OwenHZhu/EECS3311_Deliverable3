package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.enums.PaymentMethod;
import main.models.CreditPayment;
import main.models.DebitPayment;
import main.models.GrantPayment;
import main.models.InstitutionalPayment;
import main.models.Payment;
import main.models.PaymentStrategy;
import main.models.PaymentStrategyFactory;

public class PaymentTest {

    private Payment creditPayment;
    private Payment debitPayment;
    private Payment institutionalPayment;
    private Payment grantPayment;

    @Before
    public void setUp() {
        creditPayment       = new Payment("P001", 100.0, PaymentMethod.Credit);
        debitPayment        = new Payment("P002", 250.0, PaymentMethod.Debit);
        institutionalPayment = new Payment("P003", 500.0, PaymentMethod.Institutional);
        grantPayment        = new Payment("P004", 1000.0, PaymentMethod.Grant);
    }

    @Test
    public void constructor_setsFieldsCorrectly() {
        assertEquals("P001", creditPayment.getPaymentId());
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
        assertEquals(PaymentMethod.Credit, creditPayment.getMethod());
    }

    @Test
    public void setters_updateFieldsCorrectly() {
        creditPayment.setPaymentId("P999");
        creditPayment.setAmount(200.0);
        assertEquals("P999", creditPayment.getPaymentId());
        assertEquals(200.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void processPayment_credit_returnsTrue() {
        assertTrue(creditPayment.processPayment());
    }

    @Test
    public void processPayment_debit_returnsTrue() {
        assertTrue(debitPayment.processPayment());
    }

    @Test
    public void processPayment_institutional_returnsTrue() {
        assertTrue(institutionalPayment.processPayment());
    }

    @Test
    public void processPayment_grant_returnsTrue() {
        assertTrue(grantPayment.processPayment());
    }

    @Test(expected = IllegalStateException.class)
    public void processPayment_noStrategy_throwsIllegalState() {
        Payment p = new Payment("P010", 50.0, PaymentMethod.Credit);
        p.setStrategy(null);
        p.processPayment();
    }

    @Test
    public void setStrategy_overridesMethodStrategy() {
        creditPayment.setStrategy(new DebitPayment());
        assertTrue(creditPayment.processPayment());
    }

    @Test
    public void setMethod_changesStrategyToNewType() {
        creditPayment.setMethod(PaymentMethod.Grant);
        assertEquals(PaymentMethod.Grant, creditPayment.getMethod());
        assertTrue(creditPayment.processPayment());
    }

    @Test
    public void refund_partialAmount_returnsTrueAndReducesAmount() {
        boolean result = creditPayment.refund(40.0);
        assertTrue(result);
        assertEquals(60.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void refund_fullAmount_returnsTrueAndZerosAmount() {
        boolean result = creditPayment.refund(100.0);
        assertTrue(result);
        assertEquals(0.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void refund_zeroAmount_returnsTrueNoChange() {
        boolean result = creditPayment.refund(0.0);
        assertTrue(result);
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void refund_exceedsAmount_returnsFalse() {
        boolean result = creditPayment.refund(200.0);
        assertFalse(result);
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void refund_negativeAmount_returnsFalse() {
        boolean result = creditPayment.refund(-10.0);
        assertFalse(result);
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void creditPayment_processPositive_returnsTrue() {
        assertTrue(new CreditPayment().process(50.0));
    }

    @Test
    public void creditPayment_processZero_returnsTrue() {
        assertTrue(new CreditPayment().process(0.0));
    }

    @Test
    public void creditPayment_processNegative_returnsFalse() {
        assertFalse(new CreditPayment().process(-1.0));
    }

    @Test
    public void debitPayment_processPositive_returnsTrue() {
        assertTrue(new DebitPayment().process(75.0));
    }

    @Test
    public void debitPayment_processNegative_returnsFalse() {
        assertFalse(new DebitPayment().process(-5.0));
    }

    @Test
    public void institutionalPayment_processPositive_returnsTrue() {
        assertTrue(new InstitutionalPayment().process(300.0));
    }

    @Test
    public void institutionalPayment_processNegative_returnsFalse() {
        assertFalse(new InstitutionalPayment().process(-0.01));
    }

    @Test
    public void grantPayment_processPositive_returnsTrue() {
        assertTrue(new GrantPayment().process(999.99));
    }

    @Test
    public void grantPayment_processNegative_returnsFalse() {
        assertFalse(new GrantPayment().process(-100.0));
    }

    @Test
    public void factory_credit_returnsCreditPayment() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Credit);
        assertTrue(s instanceof CreditPayment);
    }

    @Test
    public void factory_debit_returnsDebitPayment() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Debit);
        assertTrue(s instanceof DebitPayment);
    }

    @Test
    public void factory_institutional_returnsInstitutionalPayment() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Institutional);
        assertTrue(s instanceof InstitutionalPayment);
    }

    @Test
    public void factory_grant_returnsGrantPayment() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Grant);
        assertTrue(s instanceof GrantPayment);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factory_null_throwsIllegalArgument() {
        PaymentStrategyFactory.fromMethod(null);
    }

    @Test
    public void factory_producedStrategyIsCallable() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Institutional);
        assertTrue(s.process(500.0));
        assertFalse(s.process(-1.0));
    }

    @Test
    public void processPayment_zeroAmount_returnsTrue() {
        Payment p = new Payment("P020", 0.0, PaymentMethod.Debit);
        assertTrue(p.processPayment());
    }
}
