package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;
import main.enums.PaymentMethod;

/**
 * AI-generated tests for the Strategy Pattern.
 * Covers: Payment, CreditPayment, DebitPayment, InstitutionalPayment,
 *         GrantPayment, PaymentStrategyFactory.
 */
public class PaymentAITest {

    private Payment creditPayment;
    private Payment debitPayment;
    private Payment institutionalPayment;
    private Payment grantPayment;

    @Before
    public void setup() {
        creditPayment        = new Payment("P001", 100.0, PaymentMethod.Credit);
        debitPayment         = new Payment("P002", 250.0, PaymentMethod.Debit);
        institutionalPayment = new Payment("P003", 500.0, PaymentMethod.Institutional);
        grantPayment         = new Payment("P004", 1000.0, PaymentMethod.Grant);
    }

    // ── Payment constructor / getters ────────────────────────────────────────

    @Test
    public void testConstructorSetsId() {
        assertEquals("P001", creditPayment.getPaymentId());
    }

    @Test
    public void testConstructorSetsAmount() {
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void testConstructorSetsMethod() {
        assertEquals(PaymentMethod.Credit, creditPayment.getMethod());
    }

    @Test
    public void testSettersUpdateFields() {
        creditPayment.setPaymentId("X99");
        creditPayment.setAmount(999.0);
        assertEquals("X99", creditPayment.getPaymentId());
        assertEquals(999.0, creditPayment.getAmount(), 0.001);
    }

    // ── processPayment ───────────────────────────────────────────────────────

    @Test
    public void testProcessCreditReturnsTrue() {
        assertTrue(creditPayment.processPayment());
    }

    @Test
    public void testProcessDebitReturnsTrue() {
        assertTrue(debitPayment.processPayment());
    }

    @Test
    public void testProcessInstitutionalReturnsTrue() {
        assertTrue(institutionalPayment.processPayment());
    }

    @Test
    public void testProcessGrantReturnsTrue() {
        assertTrue(grantPayment.processPayment());
    }

    @Test(expected = IllegalStateException.class)
    public void testProcessNullStrategyThrows() {
        Payment p = new Payment("P099", 50.0, PaymentMethod.Credit);
        p.setStrategy(null);
        p.processPayment();
    }

    @Test
    public void testSetMethodChangesStrategy() {
        creditPayment.setMethod(PaymentMethod.Grant);
        assertEquals(PaymentMethod.Grant, creditPayment.getMethod());
        assertTrue(creditPayment.processPayment());
    }

    @Test
    public void testSetStrategyOverridesAutoStrategy() {
        creditPayment.setStrategy(new DebitPayment());
        assertTrue(creditPayment.processPayment());
    }

    // ── refund ───────────────────────────────────────────────────────────────

    @Test
    public void testPartialRefundSucceeds() {
        assertTrue(creditPayment.refund(40.0));
        assertEquals(60.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void testFullRefundSucceeds() {
        assertTrue(creditPayment.refund(100.0));
        assertEquals(0.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void testZeroRefundAllowed() {
        assertTrue(creditPayment.refund(0.0));
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void testRefundExceedingAmountFails() {
        assertFalse(creditPayment.refund(200.0));
        assertEquals(100.0, creditPayment.getAmount(), 0.001);
    }

    @Test
    public void testNegativeRefundFails() {
        assertFalse(creditPayment.refund(-10.0));
    }

    // ── CreditPayment strategy ───────────────────────────────────────────────

    @Test
    public void testCreditProcessPositive() {
        assertTrue(new CreditPayment().process(50.0));
    }

    @Test
    public void testCreditProcessZero() {
        assertTrue(new CreditPayment().process(0.0));
    }

    @Test
    public void testCreditProcessNegative() {
        assertFalse(new CreditPayment().process(-1.0));
    }

    // ── DebitPayment strategy ────────────────────────────────────────────────

    @Test
    public void testDebitProcessPositive() {
        assertTrue(new DebitPayment().process(75.0));
    }

    @Test
    public void testDebitProcessNegative() {
        assertFalse(new DebitPayment().process(-5.0));
    }

    // ── InstitutionalPayment strategy ────────────────────────────────────────

    @Test
    public void testInstitutionalProcessPositive() {
        assertTrue(new InstitutionalPayment().process(300.0));
    }

    @Test
    public void testInstitutionalProcessNegative() {
        assertFalse(new InstitutionalPayment().process(-0.01));
    }

    // ── GrantPayment strategy ────────────────────────────────────────────────

    @Test
    public void testGrantProcessPositive() {
        assertTrue(new GrantPayment().process(999.99));
    }

    @Test
    public void testGrantProcessNegative() {
        assertFalse(new GrantPayment().process(-100.0));
    }

    // ── PaymentStrategyFactory ───────────────────────────────────────────────

    @Test
    public void testFactoryCreatesCredit() {
        assertTrue(PaymentStrategyFactory.fromMethod(PaymentMethod.Credit) instanceof CreditPayment);
    }

    @Test
    public void testFactoryCreatesDebit() {
        assertTrue(PaymentStrategyFactory.fromMethod(PaymentMethod.Debit) instanceof DebitPayment);
    }

    @Test
    public void testFactoryCreatesInstitutional() {
        assertTrue(PaymentStrategyFactory.fromMethod(PaymentMethod.Institutional) instanceof InstitutionalPayment);
    }

    @Test
    public void testFactoryCreatesGrant() {
        assertTrue(PaymentStrategyFactory.fromMethod(PaymentMethod.Grant) instanceof GrantPayment);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactoryNullThrows() {
        PaymentStrategyFactory.fromMethod(null);
    }

    @Test
    public void testFactoryStrategyIsCallable() {
        PaymentStrategy s = PaymentStrategyFactory.fromMethod(PaymentMethod.Debit);
        assertTrue(s.process(100.0));
        assertFalse(s.process(-1.0));
    }
}
