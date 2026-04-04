package test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserFactoryRandoopTest {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "", "", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "hi!", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "hi!", "", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "", "hi!", "hi!", "hi!", "hi!", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "hi!", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "hi!", "hi!", "", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "", "hi!", "", "", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("", "hi!", "", "", "hi!", "", "", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.enums.AccountStatus accountStatus7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = main.models.UserFactory.createUser("hi!", "hi!", "", "hi!", "hi!", "", "hi!", accountStatus7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

