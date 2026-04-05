import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test001");
        main.enums.PaymentMethod paymentMethod0 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.PaymentStrategy paymentStrategy1 = main.models.PaymentStrategyFactory.fromMethod(paymentMethod0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test002");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10L);
        java.lang.Class<?> wildcardClass3 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test003");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test004");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        java.lang.Class<?> wildcardClass3 = grantPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test005");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        java.lang.Class<?> wildcardClass3 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test006");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        java.lang.Class<?> wildcardClass1 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test007");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) (byte) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test008");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        java.lang.Class<?> wildcardClass1 = grantPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test009");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10L);
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test010");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) (short) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test011");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", 10.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test012");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (byte) 0, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test013");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        java.lang.Class<?> wildcardClass3 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test014");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test015");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) '4', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test016");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) ' ', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test017");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", 1.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test018");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test019");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test020");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 100);
        boolean boolean6 = grantPayment0.process((double) 100L);
        boolean boolean8 = grantPayment0.process((double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test021");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 0.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test022");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        java.lang.Class<?> wildcardClass9 = grantPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test023");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 100);
        boolean boolean6 = grantPayment0.process(1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test024");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) 0);
        boolean boolean6 = creditPayment0.process((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test025");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (-1.0d), paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test026");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test027");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 100.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test028");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 1L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test029");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) (short) 0);
        java.lang.Class<?> wildcardClass7 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test030");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test031");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (short) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test032");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) '4');
        java.lang.Class<?> wildcardClass5 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test033");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test034");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process(1.0d);
        boolean boolean4 = grantPayment0.process((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test035");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) '#', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test036");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) '#', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test037");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 100.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test038");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        java.lang.Class<?> wildcardClass5 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test039");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (-1.0d), paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test040");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        java.lang.Class<?> wildcardClass5 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test041");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (-1.0f), paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test042");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test043");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test044");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test045");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) (short) 100);
        boolean boolean4 = debitPayment0.process((double) 0L);
        java.lang.Class<?> wildcardClass5 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test046");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 'a');
        boolean boolean8 = grantPayment0.process((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test047");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) (-1.0f));
        boolean boolean8 = grantPayment0.process((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test048");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) (byte) 10, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test049");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10L);
        boolean boolean4 = debitPayment0.process((double) 0);
        java.lang.Class<?> wildcardClass5 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test050");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) 10.0f);
        boolean boolean8 = institutionalPayment0.process(100.0d);
        boolean boolean10 = institutionalPayment0.process((double) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test051");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (-1L));
        boolean boolean6 = grantPayment0.process((double) (byte) 10);
        java.lang.Class<?> wildcardClass7 = grantPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test052");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", 100.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test053");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test054");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        boolean boolean10 = institutionalPayment0.process(100.0d);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test055");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 0L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test056");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test057");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test058");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (-1L));
        boolean boolean6 = grantPayment0.process((double) (byte) 10);
        boolean boolean8 = grantPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test059");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (byte) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test060");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 1.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test061");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        boolean boolean10 = grantPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test062");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 100L);
        boolean boolean8 = debitPayment0.process((double) '4');
        boolean boolean10 = debitPayment0.process(0.0d);
        boolean boolean12 = debitPayment0.process((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test063");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test064");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) 100);
        boolean boolean6 = creditPayment0.process((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test065");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test066");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        java.lang.Class<?> wildcardClass7 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test067");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) '4');
        boolean boolean6 = creditPayment0.process((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test068");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 'a', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test069");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test070");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) (short) 100);
        boolean boolean4 = debitPayment0.process((double) 0L);
        boolean boolean6 = debitPayment0.process((double) (-1));
        boolean boolean8 = debitPayment0.process((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test071");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 'a');
        boolean boolean8 = grantPayment0.process((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test072");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) (byte) -1);
        boolean boolean4 = institutionalPayment0.process((double) (-1.0f));
        boolean boolean6 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test073");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) 10.0f);
        boolean boolean8 = institutionalPayment0.process(100.0d);
        boolean boolean10 = institutionalPayment0.process((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test074");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test075");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test076");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) 1L);
        java.lang.Class<?> wildcardClass11 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test077");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) (short) 0);
        boolean boolean8 = creditPayment0.process((double) (short) 0);
        boolean boolean10 = creditPayment0.process((double) 1L);
        boolean boolean12 = creditPayment0.process(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test078");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test079");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test080");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) 10.0f);
        boolean boolean8 = institutionalPayment0.process((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test081");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test082");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 'a');
        java.lang.Class<?> wildcardClass3 = grantPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test083");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", 0.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test084");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) (short) -1);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test085");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (short) 0, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test086");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        boolean boolean10 = institutionalPayment0.process(100.0d);
        boolean boolean12 = institutionalPayment0.process((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test087");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) 10.0f);
        boolean boolean8 = institutionalPayment0.process(100.0d);
        boolean boolean10 = institutionalPayment0.process((double) 100);
        boolean boolean12 = institutionalPayment0.process(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test088");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) 100.0f);
        boolean boolean10 = institutionalPayment0.process((double) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test089");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) (short) 10);
        java.lang.Class<?> wildcardClass7 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test090");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        boolean boolean10 = grantPayment0.process((double) (short) -1);
        boolean boolean12 = grantPayment0.process(10.0d);
        boolean boolean14 = grantPayment0.process((double) (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test091");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test092");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) (-1.0f));
        boolean boolean6 = institutionalPayment0.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test093");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 100);
        boolean boolean8 = institutionalPayment0.process((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test094");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test095");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", 0.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test096");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test097");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 100);
        boolean boolean6 = grantPayment0.process((double) 100L);
        boolean boolean8 = grantPayment0.process(100.0d);
        boolean boolean10 = grantPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test098");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 1L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test099");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10L);
        boolean boolean6 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test100");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) (byte) -1, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test101");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test102");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test103");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) (short) 0, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test104");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) (byte) -1);
        boolean boolean4 = institutionalPayment0.process((double) (-1.0f));
        java.lang.Class<?> wildcardClass5 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test105");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        boolean boolean6 = institutionalPayment0.process((double) (-1));
        boolean boolean8 = institutionalPayment0.process((double) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test106");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (-1L));
        boolean boolean6 = grantPayment0.process((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test107");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10L);
        boolean boolean6 = institutionalPayment0.process((double) (byte) -1);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test108");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (short) 1, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test109");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (byte) -1, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test110");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 0.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test111");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) '4');
        boolean boolean6 = debitPayment0.process((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test112");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 'a');
        boolean boolean6 = grantPayment0.process((double) 1);
        boolean boolean8 = grantPayment0.process((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test113");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test114");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 10L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test115");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 10.0f, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test116");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        java.lang.Class<?> wildcardClass1 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test117");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        java.lang.Class<?> wildcardClass3 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test118");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) (byte) 0);
        boolean boolean12 = creditPayment0.process((double) (short) 0);
        boolean boolean14 = creditPayment0.process((double) 10);
        boolean boolean16 = creditPayment0.process((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test119");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", 10.0d, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test120");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) 1L);
        boolean boolean12 = creditPayment0.process(0.0d);
        java.lang.Class<?> wildcardClass13 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test121");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test122");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process((double) 100);
        boolean boolean12 = debitPayment0.process((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test123");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process((double) 100);
        boolean boolean12 = debitPayment0.process((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test124");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 0);
        boolean boolean8 = institutionalPayment0.process((double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test125");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 10);
        boolean boolean8 = institutionalPayment0.process((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test126");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        boolean boolean10 = grantPayment0.process((double) '4');
        boolean boolean12 = grantPayment0.process((double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test127");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (-1L));
        boolean boolean6 = grantPayment0.process((double) (byte) 10);
        boolean boolean8 = grantPayment0.process((-1.0d));
        boolean boolean10 = grantPayment0.process((double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test128");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) (short) 100);
        boolean boolean4 = debitPayment0.process((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test129");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process(1.0d);
        boolean boolean4 = grantPayment0.process((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test130");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test131");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 100);
        boolean boolean8 = institutionalPayment0.process((double) (-1L));
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test132");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 100L);
        boolean boolean8 = debitPayment0.process((double) '4');
        boolean boolean10 = debitPayment0.process((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test133");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        boolean boolean6 = institutionalPayment0.process((double) 100);
        boolean boolean8 = institutionalPayment0.process((double) 10);
        boolean boolean10 = institutionalPayment0.process((double) (byte) 0);
        boolean boolean12 = institutionalPayment0.process((double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test134");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) ' ', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test135");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process((double) 0);
        boolean boolean8 = creditPayment0.process((double) 0L);
        boolean boolean10 = creditPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test136");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) 1L);
        boolean boolean6 = creditPayment0.process((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test137");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 10L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test138");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 10L);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        boolean boolean6 = institutionalPayment0.process((double) 100);
        boolean boolean8 = institutionalPayment0.process((double) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test139");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 100);
        boolean boolean8 = institutionalPayment0.process((double) (-1L));
        boolean boolean10 = institutionalPayment0.process((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test140");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 100);
        boolean boolean8 = debitPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test141");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) (short) 0);
        boolean boolean8 = creditPayment0.process((double) (short) 0);
        boolean boolean10 = creditPayment0.process(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test142");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) (byte) 0);
        boolean boolean12 = creditPayment0.process((double) (short) 0);
        boolean boolean14 = creditPayment0.process((double) 10);
        boolean boolean16 = creditPayment0.process((double) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test143");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        boolean boolean10 = institutionalPayment0.process(100.0d);
        boolean boolean12 = institutionalPayment0.process((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test144");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process(0.0d);
        boolean boolean4 = institutionalPayment0.process((double) 10);
        boolean boolean6 = institutionalPayment0.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test145");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process((double) 100);
        boolean boolean12 = debitPayment0.process((double) 'a');
        java.lang.Class<?> wildcardClass13 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test146");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) 100.0f);
        boolean boolean10 = institutionalPayment0.process(1.0d);
        java.lang.Class<?> wildcardClass11 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test147");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process(1.0d);
        boolean boolean4 = creditPayment0.process((double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test148");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (-1L), paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test149");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test150");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 0L);
        java.lang.Class<?> wildcardClass7 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test151");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test152");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 10, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test153");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (-1L));
        boolean boolean6 = grantPayment0.process((double) (byte) 10);
        boolean boolean8 = grantPayment0.process((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test154");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        boolean boolean10 = grantPayment0.process((double) (short) -1);
        boolean boolean12 = grantPayment0.process(10.0d);
        boolean boolean14 = grantPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test155");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process(0.0d);
        boolean boolean10 = institutionalPayment0.process((double) 10.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test156");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 100L);
        boolean boolean8 = debitPayment0.process((double) '4');
        boolean boolean10 = debitPayment0.process(0.0d);
        boolean boolean12 = debitPayment0.process((double) (short) 100);
        boolean boolean14 = debitPayment0.process(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test157");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process(0.0d);
        boolean boolean10 = institutionalPayment0.process((double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test158");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process(0.0d);
        boolean boolean12 = debitPayment0.process((double) 1L);
        boolean boolean14 = debitPayment0.process((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test159");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) (byte) 10, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test160");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 100L, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test161");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        boolean boolean6 = institutionalPayment0.process((double) 10.0f);
        boolean boolean8 = institutionalPayment0.process(100.0d);
        boolean boolean10 = institutionalPayment0.process((double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test162");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) (short) 1);
        java.lang.Class<?> wildcardClass5 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test163");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 100);
        boolean boolean6 = grantPayment0.process((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test164");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (-1.0f));
        boolean boolean4 = creditPayment0.process((double) 10);
        boolean boolean6 = creditPayment0.process((double) 10);
        java.lang.Class<?> wildcardClass7 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test165");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (short) 0);
        boolean boolean4 = creditPayment0.process((double) 0);
        boolean boolean6 = creditPayment0.process((double) (short) 100);
        boolean boolean8 = creditPayment0.process(100.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test166");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test167");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) (byte) 0);
        java.lang.Class<?> wildcardClass11 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test168");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process((double) (byte) 1);
        boolean boolean8 = creditPayment0.process((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test169");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("", (double) 'a', paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test170");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) (byte) 1);
        boolean boolean12 = creditPayment0.process((double) (-1));
        boolean boolean14 = creditPayment0.process((double) (byte) 100);
        java.lang.Class<?> wildcardClass15 = creditPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test171");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) 100);
        boolean boolean6 = grantPayment0.process((double) 100L);
        boolean boolean8 = grantPayment0.process((double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test172");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        java.lang.Class<?> wildcardClass9 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test173");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(0.0d);
        boolean boolean4 = debitPayment0.process((double) ' ');
        boolean boolean6 = debitPayment0.process((double) 1L);
        boolean boolean8 = debitPayment0.process((double) 0);
        boolean boolean10 = debitPayment0.process((double) 100);
        boolean boolean12 = debitPayment0.process((double) 'a');
        boolean boolean14 = debitPayment0.process((double) 100.0f);
        boolean boolean16 = debitPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test174");
        main.enums.PaymentMethod paymentMethod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Payment payment3 = new main.models.Payment("hi!", (double) 100, paymentMethod2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Payment method cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test175");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) (byte) -1);
        boolean boolean4 = institutionalPayment0.process((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test176");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process(1.0d);
        boolean boolean4 = debitPayment0.process((double) (-1.0f));
        boolean boolean6 = debitPayment0.process((double) (byte) 1);
        boolean boolean8 = debitPayment0.process((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test177");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) (short) 0);
        boolean boolean6 = creditPayment0.process(100.0d);
        boolean boolean8 = creditPayment0.process((double) '4');
        boolean boolean10 = creditPayment0.process((double) (byte) 0);
        boolean boolean12 = creditPayment0.process((double) (short) 0);
        boolean boolean14 = creditPayment0.process((double) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test178");
        main.models.GrantPayment grantPayment0 = new main.models.GrantPayment();
        boolean boolean2 = grantPayment0.process((double) 100.0f);
        boolean boolean4 = grantPayment0.process((double) (short) 100);
        boolean boolean6 = grantPayment0.process((double) 1L);
        boolean boolean8 = grantPayment0.process((double) 1);
        boolean boolean10 = grantPayment0.process((double) '4');
        boolean boolean12 = grantPayment0.process((double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test179");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 0L);
        boolean boolean4 = debitPayment0.process((double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test180");
        main.models.DebitPayment debitPayment0 = new main.models.DebitPayment();
        boolean boolean2 = debitPayment0.process((double) 10.0f);
        boolean boolean4 = debitPayment0.process((double) 100L);
        boolean boolean6 = debitPayment0.process((double) 100L);
        boolean boolean8 = debitPayment0.process((double) '4');
        boolean boolean10 = debitPayment0.process(0.0d);
        java.lang.Class<?> wildcardClass11 = debitPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test181");
        main.models.CreditPayment creditPayment0 = new main.models.CreditPayment();
        boolean boolean2 = creditPayment0.process((double) (byte) 10);
        boolean boolean4 = creditPayment0.process((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test182");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        boolean boolean6 = institutionalPayment0.process((double) (-1));
        java.lang.Class<?> wildcardClass7 = institutionalPayment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test183");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) 10.0f);
        boolean boolean6 = institutionalPayment0.process((double) (-1));
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        boolean boolean10 = institutionalPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "PaymentRandoopTest0.test184");
        main.models.InstitutionalPayment institutionalPayment0 = new main.models.InstitutionalPayment();
        boolean boolean2 = institutionalPayment0.process((double) 0);
        boolean boolean4 = institutionalPayment0.process((double) (short) 100);
        boolean boolean6 = institutionalPayment0.process(1.0d);
        boolean boolean8 = institutionalPayment0.process((double) (short) 0);
        boolean boolean10 = institutionalPayment0.process(100.0d);
        boolean boolean12 = institutionalPayment0.process((double) (short) 1);
        boolean boolean14 = institutionalPayment0.process(100.0d);
        boolean boolean16 = institutionalPayment0.process(0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

