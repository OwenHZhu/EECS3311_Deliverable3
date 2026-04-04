package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApprovalRequestRandoopTest {

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
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        java.lang.Class<?> wildcardClass5 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass4 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.enums.ApprovalStatus approvalStatus0 = main.enums.ApprovalStatus.Active;
        java.lang.Class<?> wildcardClass1 = approvalStatus0.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus0 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus0.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass10 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        java.lang.Class<?> wildcardClass8 = approvalStatus5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("");
        java.lang.String str5 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        main.enums.ApprovalStatus approvalStatus12 = null;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest13.approve();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest13.setStatus(approvalStatus18);
        approvalRequest7.setStatus(approvalStatus18);
        approvalRequest7.reject();
        approvalRequest7.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        java.lang.Class<?> wildcardClass10 = approvalStatus9.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest8.setStatus(approvalStatus11);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus11);
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass11 = approvalStatus10.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass4 = approvalStatus3.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest8.setStatus(approvalStatus11);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        java.lang.Class<?> wildcardClass16 = approvalStatus11.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        java.lang.Class<?> wildcardClass10 = approvalRequest7.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        approvalRequest5.reject();
        java.lang.Class<?> wildcardClass8 = approvalRequest5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.Class<?> wildcardClass10 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest6.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        java.lang.Class<?> wildcardClass16 = approvalRequest15.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest5.setStatus(approvalStatus11);
        java.lang.Class<?> wildcardClass14 = approvalRequest5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus17);
        approvalRequest14.setStatus(approvalStatus17);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("hi!", approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        main.enums.ApprovalStatus approvalStatus23 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass24 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus23.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.setRequestId("");
        approvalRequest7.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.Class<?> wildcardClass5 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass15 = approvalStatus14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        java.lang.Class<?> wildcardClass7 = approvalRequest5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        java.lang.Class<?> wildcardClass6 = approvalStatus4.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRequestId();
        java.lang.String str8 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        java.lang.String str6 = approvalRequest5.getRequestId();
        approvalRequest5.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus3);
        java.lang.Class<?> wildcardClass7 = approvalStatus3.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus3);
        approvalRequest6.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        org.junit.Assert.assertNull(approvalStatus5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.Class<?> wildcardClass6 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass7 = approvalStatus6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.reject();
        approvalRequest2.submit();
        approvalRequest2.approve();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        approvalRequest12.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.approve();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest13.getStatus();
        approvalRequest9.setStatus(approvalStatus14);
        main.enums.ApprovalStatus approvalStatus16 = approvalRequest9.getStatus();
        approvalRequest6.setStatus(approvalStatus16);
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus16);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus11);
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.setRequestId("");
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest7.getStatus();
        approvalRequest7.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        java.lang.Class<?> wildcardClass3 = approvalStatus1.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest5.setStatus(approvalStatus11);
        approvalRequest5.reject();
        java.lang.Class<?> wildcardClass15 = approvalRequest5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        approvalRequest2.submit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("");
        approvalRequest12.submit();
        java.lang.Class<?> wildcardClass16 = approvalRequest12.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.submit();
        java.lang.String str4 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus4);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus4);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        approvalRequest8.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.submit();
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        approvalRequest2.submit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus3);
        java.lang.Class<?> wildcardClass5 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("");
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus3);
        approvalRequest6.approve();
        java.lang.String str8 = approvalRequest6.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        java.lang.String str17 = approvalRequest16.getRequestId();
        java.lang.String str18 = approvalRequest16.getRequestId();
        approvalRequest16.setRequestId("");
        main.enums.ApprovalStatus approvalStatus21 = null;
        approvalRequest16.setStatus(approvalStatus21);
        approvalRequest16.approve();
        java.lang.String str24 = approvalRequest16.getRequestId();
        main.enums.ApprovalStatus approvalStatus25 = main.enums.ApprovalStatus.Rejected;
        approvalRequest16.setStatus(approvalStatus25);
        approvalRequest2.setStatus(approvalStatus25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + approvalStatus25 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus25.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        approvalRequest16.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Pending;
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus22 = approvalRequest21.getStatus();
        java.lang.String str23 = approvalRequest21.getRequestId();
        main.enums.ApprovalStatus approvalStatus27 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("", approvalStatus27);
        main.enums.ApprovalStatus approvalStatus29 = approvalRequest28.getStatus();
        main.models.ApprovalRequest approvalRequest30 = new main.models.ApprovalRequest("hi!", approvalStatus29);
        main.models.ApprovalRequest approvalRequest31 = new main.models.ApprovalRequest("", approvalStatus29);
        main.enums.ApprovalStatus approvalStatus34 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest35 = new main.models.ApprovalRequest("", approvalStatus34);
        main.models.ApprovalRequest approvalRequest36 = new main.models.ApprovalRequest("", approvalStatus34);
        approvalRequest31.setStatus(approvalStatus34);
        approvalRequest21.setStatus(approvalStatus34);
        approvalRequest2.setStatus(approvalStatus34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus27.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus29.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus34 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus34.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        approvalRequest7.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.setRequestId("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus6 = null;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        approvalRequest7.approve();
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        approvalRequest7.setStatus(approvalStatus12);
        approvalRequest2.setStatus(approvalStatus12);
        java.lang.String str15 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        java.lang.Class<?> wildcardClass20 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest2.setStatus(approvalStatus12);
        java.lang.String str15 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest2.setStatus(approvalStatus12);
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.submit();
        approvalRequest2.submit();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest6.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest15.approve();
        approvalRequest15.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.submit();
        approvalRequest2.submit();
        approvalRequest2.setRequestId("");
        java.lang.String str10 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.submit();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.reject();
        java.lang.Class<?> wildcardClass13 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.reject();
        approvalRequest2.submit();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        org.junit.Assert.assertNull(approvalStatus5);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.reject();
        approvalRequest2.setRequestId("hi!");
        java.lang.String str11 = approvalRequest2.getRequestId();
        org.junit.Assert.assertNull(approvalStatus5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.submit();
        org.junit.Assert.assertNull(approvalStatus5);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        java.lang.String str10 = approvalRequest8.getRequestId();
        approvalRequest8.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(approvalStatus4);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.reject();
        java.lang.String str10 = approvalRequest8.getRequestId();
        approvalRequest8.setRequestId("hi!");
        approvalRequest8.setRequestId("");
        main.enums.ApprovalStatus approvalStatus15 = approvalRequest8.getStatus();
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        java.lang.Class<?> wildcardClass17 = approvalRequest16.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus10);
        approvalRequest7.setStatus(approvalStatus10);
        approvalRequest7.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.reject();
        approvalRequest2.setRequestId("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.enums.ApprovalStatus approvalStatus3 = null;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("hi!", approvalStatus3);
        approvalRequest4.approve();
        main.enums.ApprovalStatus approvalStatus7 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest4.setStatus(approvalStatus9);
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest4.getStatus();
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus12);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.setRequestId("");
        approvalRequest3.submit();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest13.getStatus();
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus14);
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest3.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest25.setRequestId("hi!");
        approvalRequest25.reject();
        approvalRequest25.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus18 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus18);
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus18);
        approvalRequest15.setStatus(approvalStatus18);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus18);
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        java.lang.Class<?> wildcardClass7 = approvalStatus5.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.enums.ApprovalStatus approvalStatus3 = null;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("hi!", approvalStatus3);
        approvalRequest4.approve();
        main.enums.ApprovalStatus approvalStatus7 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest4.setStatus(approvalStatus9);
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus9);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        approvalRequest2.submit();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        approvalRequest2.approve();
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest8.getStatus();
        approvalRequest8.approve();
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest8.getStatus();
        approvalRequest2.setStatus(approvalStatus13);
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.submit();
        approvalRequest2.submit();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.reject();
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("");
        approvalRequest12.submit();
        approvalRequest12.reject();
        approvalRequest12.approve();
        java.lang.Class<?> wildcardClass18 = approvalRequest12.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        java.lang.String str8 = approvalRequest7.getRequestId();
        java.lang.Class<?> wildcardClass9 = approvalRequest7.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus6);
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        approvalRequest2.approve();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest2.getStatus();
        java.lang.String str11 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.setRequestId("");
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest7.getStatus();
        java.lang.String str15 = approvalRequest7.getRequestId();
        approvalRequest7.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus4);
        approvalRequest3.reject();
        approvalRequest3.reject();
        main.enums.ApprovalStatus approvalStatus9 = null;
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        java.lang.String str11 = approvalRequest10.getRequestId();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        approvalRequest10.setStatus(approvalStatus12);
        approvalRequest3.setStatus(approvalStatus12);
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest17.getStatus();
        approvalRequest3.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        approvalRequest7.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass8 = approvalStatus7.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        approvalRequest12.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        approvalRequest7.reject();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest12.reject();
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest12.getStatus();
        approvalRequest7.setStatus(approvalStatus14);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        java.lang.String str10 = approvalRequest9.getRequestId();
        java.lang.String str11 = approvalRequest9.getRequestId();
        java.lang.String str12 = approvalRequest9.getRequestId();
        java.lang.String str13 = approvalRequest9.getRequestId();
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("", approvalStatus20);
        approvalRequest9.setStatus(approvalStatus20);
        approvalRequest5.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("", approvalStatus20);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus13 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus15 = approvalRequest14.getStatus();
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus17 = approvalRequest16.getStatus();
        approvalRequest2.setStatus(approvalStatus17);
        approvalRequest2.submit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        java.lang.String str6 = approvalRequest5.getRequestId();
        approvalRequest5.reject();
        approvalRequest5.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.setRequestId("");
        approvalRequest8.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest2.getStatus();
        java.lang.String str5 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNull(approvalStatus4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        java.lang.String str9 = approvalRequest8.getRequestId();
        approvalRequest8.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        approvalRequest2.reject();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus2);
        approvalRequest4.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        approvalRequest2.reject();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus4);
        approvalRequest3.reject();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus18 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus18);
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus18);
        approvalRequest15.setStatus(approvalStatus18);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus18);
        approvalRequest3.setStatus(approvalStatus18);
        main.enums.ApprovalStatus approvalStatus24 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus24);
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.enums.ApprovalStatus approvalStatus0 = main.enums.ApprovalStatus.Rejected;
        java.lang.Class<?> wildcardClass1 = approvalStatus0.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus0 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus0.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("", approvalStatus7);
        approvalRequest9.setRequestId("hi!");
        approvalRequest9.approve();
        main.enums.ApprovalStatus approvalStatus14 = null;
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        approvalRequest15.approve();
        main.enums.ApprovalStatus approvalStatus18 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus18);
        main.enums.ApprovalStatus approvalStatus20 = approvalRequest19.getStatus();
        approvalRequest15.setStatus(approvalStatus20);
        approvalRequest9.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus20);
        main.models.ApprovalRequest approvalRequest24 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.submit();
        approvalRequest8.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = null;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest13.approve();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest13.setStatus(approvalStatus18);
        main.enums.ApprovalStatus approvalStatus20 = approvalRequest13.getStatus();
        main.enums.ApprovalStatus approvalStatus21 = approvalRequest13.getStatus();
        approvalRequest2.setStatus(approvalStatus21);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        java.lang.String str6 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus4);
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        approvalRequest14.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        approvalRequest2.setRequestId("");
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        approvalRequest3.reject();
        approvalRequest3.approve();
        approvalRequest3.submit();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus7);
        approvalRequest8.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        approvalRequest7.submit();
        java.lang.String str14 = approvalRequest7.getRequestId();
        java.lang.String str15 = approvalRequest7.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus11);
        java.lang.String str13 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        java.lang.String str7 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest10.getStatus();
        java.lang.Class<?> wildcardClass12 = approvalStatus11.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("");
        approvalRequest12.submit();
        approvalRequest12.submit();
        java.lang.Class<?> wildcardClass17 = approvalRequest12.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        approvalRequest14.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus29 = null;
        main.models.ApprovalRequest approvalRequest30 = new main.models.ApprovalRequest("hi!", approvalStatus29);
        java.lang.String str31 = approvalRequest30.getRequestId();
        main.enums.ApprovalStatus approvalStatus32 = main.enums.ApprovalStatus.Rejected;
        approvalRequest30.setStatus(approvalStatus32);
        main.enums.ApprovalStatus approvalStatus35 = null;
        main.models.ApprovalRequest approvalRequest36 = new main.models.ApprovalRequest("hi!", approvalStatus35);
        approvalRequest36.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus39 = main.enums.ApprovalStatus.Pending;
        approvalRequest36.setStatus(approvalStatus39);
        approvalRequest30.setStatus(approvalStatus39);
        main.models.ApprovalRequest approvalRequest42 = new main.models.ApprovalRequest("hi!", approvalStatus39);
        approvalRequest42.approve();
        main.enums.ApprovalStatus approvalStatus46 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest47 = new main.models.ApprovalRequest("", approvalStatus46);
        main.enums.ApprovalStatus approvalStatus48 = approvalRequest47.getStatus();
        main.models.ApprovalRequest approvalRequest49 = new main.models.ApprovalRequest("hi!", approvalStatus48);
        approvalRequest42.setStatus(approvalStatus48);
        main.enums.ApprovalStatus approvalStatus51 = approvalRequest42.getStatus();
        approvalRequest2.setStatus(approvalStatus51);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus32 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus32.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus39 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus39.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus46 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus46.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus48 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus48.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus51 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus51.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        java.lang.String str6 = approvalRequest5.getRequestId();
        approvalRequest5.setRequestId("hi!");
        approvalRequest5.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        java.lang.String str7 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.setRequestId("hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        java.lang.String str10 = approvalRequest9.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest9.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus17 = approvalRequest16.getStatus();
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest16.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        java.lang.Class<?> wildcardClass20 = approvalStatus18.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("", approvalStatus7);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus12);
        approvalRequest15.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        java.lang.String str6 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest3.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest15.approve();
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus21 = approvalRequest20.getStatus();
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus21);
        approvalRequest15.setStatus(approvalStatus21);
        java.lang.Class<?> wildcardClass24 = approvalStatus21.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("");
        java.lang.String str17 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        main.enums.ApprovalStatus approvalStatus20 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        java.lang.String str20 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest8.setStatus(approvalStatus11);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest15.setRequestId("");
        java.lang.String str18 = approvalRequest15.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.setRequestId("");
        approvalRequest3.submit();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest13.getStatus();
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus14);
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest3.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus26 = approvalRequest25.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus26 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus26.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        approvalRequest14.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        approvalRequest2.setRequestId("");
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus29 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus29.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.submit();
        java.lang.String str10 = approvalRequest8.getRequestId();
        approvalRequest8.submit();
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest8.getStatus();
        approvalRequest8.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus10);
        approvalRequest7.setStatus(approvalStatus10);
        approvalRequest7.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest6.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest15.approve();
        java.lang.Class<?> wildcardClass17 = approvalRequest15.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.submit();
        approvalRequest2.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest18.getStatus();
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest21.reject();
        approvalRequest21.approve();
        approvalRequest21.reject();
        main.enums.ApprovalStatus approvalStatus28 = null;
        main.models.ApprovalRequest approvalRequest29 = new main.models.ApprovalRequest("hi!", approvalStatus28);
        java.lang.String str30 = approvalRequest29.getRequestId();
        main.enums.ApprovalStatus approvalStatus31 = main.enums.ApprovalStatus.Rejected;
        approvalRequest29.setStatus(approvalStatus31);
        main.enums.ApprovalStatus approvalStatus34 = null;
        main.models.ApprovalRequest approvalRequest35 = new main.models.ApprovalRequest("hi!", approvalStatus34);
        approvalRequest35.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus38 = main.enums.ApprovalStatus.Pending;
        approvalRequest35.setStatus(approvalStatus38);
        approvalRequest29.setStatus(approvalStatus38);
        main.models.ApprovalRequest approvalRequest41 = new main.models.ApprovalRequest("hi!", approvalStatus38);
        approvalRequest41.approve();
        main.enums.ApprovalStatus approvalStatus45 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest46 = new main.models.ApprovalRequest("", approvalStatus45);
        main.enums.ApprovalStatus approvalStatus47 = approvalRequest46.getStatus();
        main.models.ApprovalRequest approvalRequest48 = new main.models.ApprovalRequest("hi!", approvalStatus47);
        approvalRequest41.setStatus(approvalStatus47);
        main.models.ApprovalRequest approvalRequest50 = new main.models.ApprovalRequest("", approvalStatus47);
        approvalRequest21.setStatus(approvalStatus47);
        approvalRequest13.setStatus(approvalStatus47);
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus38 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus38.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus45 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus45.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus47 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus47.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus17 = approvalRequest16.getStatus();
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest18.getStatus();
        approvalRequest7.setStatus(approvalStatus19);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus8 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("", approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus10);
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.enums.ApprovalStatus approvalStatus3 = null;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("hi!", approvalStatus3);
        approvalRequest4.approve();
        main.enums.ApprovalStatus approvalStatus7 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest4.setStatus(approvalStatus9);
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.reject();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.reject();
        org.junit.Assert.assertNull(approvalStatus5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        approvalRequest8.submit();
        approvalRequest8.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        java.lang.String str6 = approvalRequest5.getRequestId();
        approvalRequest5.reject();
        approvalRequest5.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        java.lang.String str5 = approvalRequest3.getRequestId();
        approvalRequest3.setRequestId("");
        main.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest3.setStatus(approvalStatus8);
        approvalRequest3.approve();
        java.lang.String str11 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus12);
        java.lang.String str14 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        java.lang.String str18 = approvalRequest17.getRequestId();
        java.lang.String str19 = approvalRequest17.getRequestId();
        java.lang.String str20 = approvalRequest17.getRequestId();
        approvalRequest17.approve();
        approvalRequest17.approve();
        approvalRequest17.setRequestId("hi!");
        approvalRequest17.approve();
        main.enums.ApprovalStatus approvalStatus28 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest29 = new main.models.ApprovalRequest("", approvalStatus28);
        main.enums.ApprovalStatus approvalStatus30 = approvalRequest29.getStatus();
        main.models.ApprovalRequest approvalRequest31 = new main.models.ApprovalRequest("", approvalStatus30);
        main.enums.ApprovalStatus approvalStatus32 = approvalRequest31.getStatus();
        approvalRequest17.setStatus(approvalStatus32);
        approvalRequest3.setStatus(approvalStatus32);
        main.models.ApprovalRequest approvalRequest35 = new main.models.ApprovalRequest("hi!", approvalStatus32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus28.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus30 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus30.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus32 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus32.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        approvalRequest2.submit();
        approvalRequest2.submit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        java.lang.String str10 = approvalRequest9.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest9.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("");
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest8.setStatus(approvalStatus11);
        java.lang.String str15 = approvalRequest8.getRequestId();
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus20);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("", approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus20);
        main.models.ApprovalRequest approvalRequest24 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest8.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest26 = new main.models.ApprovalRequest("", approvalStatus20);
        java.lang.Class<?> wildcardClass27 = approvalRequest26.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.setRequestId("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Pending;
        approvalRequest8.setStatus(approvalStatus11);
        approvalRequest2.setStatus(approvalStatus11);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Pending;
        approvalRequest7.setStatus(approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        java.lang.Class<?> wildcardClass13 = approvalRequest7.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.setRequestId("");
        approvalRequest3.submit();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest13.getStatus();
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus14);
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest3.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest25.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus28 = approvalRequest25.getStatus();
        approvalRequest25.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus28 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus28.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        approvalRequest14.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus27 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus27.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.submit();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus16);
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus16);
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest3.setStatus(approvalStatus16);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus11);
        java.lang.String str13 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        java.lang.String str17 = approvalRequest16.getRequestId();
        java.lang.String str18 = approvalRequest16.getRequestId();
        java.lang.String str19 = approvalRequest16.getRequestId();
        approvalRequest16.approve();
        approvalRequest16.approve();
        approvalRequest16.setRequestId("hi!");
        approvalRequest16.approve();
        main.enums.ApprovalStatus approvalStatus27 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("", approvalStatus27);
        main.enums.ApprovalStatus approvalStatus29 = approvalRequest28.getStatus();
        main.models.ApprovalRequest approvalRequest30 = new main.models.ApprovalRequest("", approvalStatus29);
        main.enums.ApprovalStatus approvalStatus31 = approvalRequest30.getStatus();
        approvalRequest16.setStatus(approvalStatus31);
        approvalRequest2.setStatus(approvalStatus31);
        approvalRequest2.submit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus27.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus29.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        java.lang.Class<?> wildcardClass9 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest2.getStatus();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus11);
        approvalRequest8.setStatus(approvalStatus11);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest15.setRequestId("");
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest15.getStatus();
        approvalRequest15.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest3.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest15.approve();
        approvalRequest15.submit();
        approvalRequest15.setRequestId("hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("", approvalStatus8);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus16 = null;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        approvalRequest17.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus20 = main.enums.ApprovalStatus.Pending;
        approvalRequest17.setStatus(approvalStatus20);
        approvalRequest14.setStatus(approvalStatus20);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus20);
        approvalRequest2.setStatus(approvalStatus20);
        java.lang.String str25 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus20 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus20.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus14 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus14);
        main.enums.ApprovalStatus approvalStatus16 = approvalRequest15.getStatus();
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("hi!", approvalStatus16);
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus16);
        approvalRequest18.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus21 = main.enums.ApprovalStatus.Pending;
        approvalRequest18.setStatus(approvalStatus21);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus21);
        approvalRequest2.setStatus(approvalStatus21);
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus6);
        main.enums.ApprovalStatus approvalStatus9 = null;
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        java.lang.String str11 = approvalRequest10.getRequestId();
        java.lang.String str12 = approvalRequest10.getRequestId();
        java.lang.String str13 = approvalRequest10.getRequestId();
        main.enums.ApprovalStatus approvalStatus14 = main.enums.ApprovalStatus.Pending;
        approvalRequest10.setStatus(approvalStatus14);
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus21 = approvalRequest20.getStatus();
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus21);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus21);
        approvalRequest23.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus26 = main.enums.ApprovalStatus.Pending;
        approvalRequest23.setStatus(approvalStatus26);
        approvalRequest10.setStatus(approvalStatus26);
        approvalRequest2.setStatus(approvalStatus26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus26 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus26.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus11);
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest12.getStatus();
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("", approvalStatus13);
        main.enums.ApprovalStatus approvalStatus18 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus18);
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus18);
        approvalRequest15.setStatus(approvalStatus18);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus18);
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.approve();
        java.lang.String str6 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest3.getStatus();
        java.lang.String str8 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest10.getStatus();
        approvalRequest10.submit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest7.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest9.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus12);
        approvalRequest3.setStatus(approvalStatus12);
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        java.lang.String str16 = approvalRequest15.getRequestId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest8.submit();
        approvalRequest8.reject();
        main.enums.ApprovalStatus approvalStatus13 = null;
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        approvalRequest14.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Pending;
        approvalRequest14.setStatus(approvalStatus17);
        main.enums.ApprovalStatus approvalStatus22 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus22);
        main.enums.ApprovalStatus approvalStatus24 = approvalRequest23.getStatus();
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus24);
        main.enums.ApprovalStatus approvalStatus27 = null;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("hi!", approvalStatus27);
        approvalRequest28.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus31 = main.enums.ApprovalStatus.Pending;
        approvalRequest28.setStatus(approvalStatus31);
        approvalRequest25.setStatus(approvalStatus31);
        main.models.ApprovalRequest approvalRequest34 = new main.models.ApprovalRequest("hi!", approvalStatus31);
        approvalRequest14.setStatus(approvalStatus31);
        main.enums.ApprovalStatus approvalStatus37 = null;
        main.models.ApprovalRequest approvalRequest38 = new main.models.ApprovalRequest("hi!", approvalStatus37);
        main.enums.ApprovalStatus approvalStatus39 = main.enums.ApprovalStatus.Rejected;
        approvalRequest38.setStatus(approvalStatus39);
        approvalRequest14.setStatus(approvalStatus39);
        approvalRequest8.setStatus(approvalStatus39);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus39 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus39.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        approvalRequest5.reject();
        main.enums.ApprovalStatus approvalStatus9 = null;
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        java.lang.String str11 = approvalRequest10.getRequestId();
        java.lang.String str12 = approvalRequest10.getRequestId();
        java.lang.String str13 = approvalRequest10.getRequestId();
        approvalRequest10.approve();
        main.enums.ApprovalStatus approvalStatus15 = approvalRequest10.getStatus();
        approvalRequest5.setStatus(approvalStatus15);
        main.enums.ApprovalStatus approvalStatus17 = approvalRequest5.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Active));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.submit();
        java.lang.String str10 = approvalRequest8.getRequestId();
        approvalRequest8.submit();
        approvalRequest8.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus4);
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.approve();
        approvalRequest8.setRequestId("");
        approvalRequest8.submit();
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest18.getStatus();
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus24 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("", approvalStatus24);
        main.models.ApprovalRequest approvalRequest26 = new main.models.ApprovalRequest("", approvalStatus24);
        approvalRequest21.setStatus(approvalStatus24);
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("hi!", approvalStatus24);
        approvalRequest8.setStatus(approvalStatus24);
        main.enums.ApprovalStatus approvalStatus32 = null;
        main.models.ApprovalRequest approvalRequest33 = new main.models.ApprovalRequest("hi!", approvalStatus32);
        java.lang.String str34 = approvalRequest33.getRequestId();
        main.enums.ApprovalStatus approvalStatus35 = main.enums.ApprovalStatus.Rejected;
        approvalRequest33.setStatus(approvalStatus35);
        main.enums.ApprovalStatus approvalStatus38 = null;
        main.models.ApprovalRequest approvalRequest39 = new main.models.ApprovalRequest("hi!", approvalStatus38);
        approvalRequest39.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus42 = main.enums.ApprovalStatus.Pending;
        approvalRequest39.setStatus(approvalStatus42);
        approvalRequest33.setStatus(approvalStatus42);
        main.models.ApprovalRequest approvalRequest45 = new main.models.ApprovalRequest("hi!", approvalStatus42);
        approvalRequest8.setStatus(approvalStatus42);
        approvalRequest2.setStatus(approvalStatus42);
        approvalRequest2.reject();
        java.lang.String str49 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus35 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus35.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus42 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus42.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass10 = approvalRequest2.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        java.lang.String str10 = approvalRequest7.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest7.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        approvalRequest4.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        approvalRequest2.submit();
        java.lang.String str7 = approvalRequest2.getRequestId();
        java.lang.String str8 = approvalRequest2.getRequestId();
        java.lang.String str9 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("hi!", approvalStatus10);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.enums.ApprovalStatus approvalStatus3 = null;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("hi!", approvalStatus3);
        approvalRequest4.approve();
        main.enums.ApprovalStatus approvalStatus7 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        approvalRequest4.setStatus(approvalStatus9);
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("hi!", approvalStatus9);
        approvalRequest11.approve();
        approvalRequest11.approve();
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = null;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        approvalRequest7.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Pending;
        approvalRequest7.setStatus(approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus15);
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        java.lang.String str5 = approvalRequest2.getRequestId();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        main.enums.ApprovalStatus approvalStatus10 = null;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("hi!", approvalStatus10);
        approvalRequest11.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus14 = main.enums.ApprovalStatus.Pending;
        approvalRequest11.setStatus(approvalStatus14);
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus14);
        approvalRequest2.setStatus(approvalStatus14);
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus22 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus22);
        main.enums.ApprovalStatus approvalStatus24 = approvalRequest23.getStatus();
        approvalRequest23.reject();
        main.enums.ApprovalStatus approvalStatus27 = null;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("hi!", approvalStatus27);
        approvalRequest28.approve();
        main.enums.ApprovalStatus approvalStatus31 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest32 = new main.models.ApprovalRequest("", approvalStatus31);
        main.enums.ApprovalStatus approvalStatus33 = approvalRequest32.getStatus();
        approvalRequest28.setStatus(approvalStatus33);
        approvalRequest23.setStatus(approvalStatus33);
        approvalRequest2.setStatus(approvalStatus33);
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus33 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus33.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.approve();
        java.lang.String str6 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        approvalRequest8.setRequestId("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(approvalStatus11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest8.getStatus();
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest8.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        approvalRequest2.setRequestId("");
        java.lang.Class<?> wildcardClass13 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        java.lang.String str9 = approvalRequest7.getRequestId();
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        approvalRequest7.submit();
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        approvalRequest16.approve();
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus21 = approvalRequest20.getStatus();
        approvalRequest16.setStatus(approvalStatus21);
        approvalRequest7.setStatus(approvalStatus21);
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("", approvalStatus17);
        approvalRequest14.setStatus(approvalStatus17);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("hi!", approvalStatus17);
        approvalRequest2.setStatus(approvalStatus17);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus25 = approvalRequest2.getStatus();
        java.lang.Class<?> wildcardClass26 = approvalStatus25.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus25 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus25.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        approvalRequest2.reject();
        java.lang.Class<?> wildcardClass7 = approvalRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus11);
        java.lang.String str13 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        java.lang.String str17 = approvalRequest16.getRequestId();
        java.lang.String str18 = approvalRequest16.getRequestId();
        java.lang.String str19 = approvalRequest16.getRequestId();
        approvalRequest16.approve();
        approvalRequest16.approve();
        approvalRequest16.setRequestId("hi!");
        approvalRequest16.approve();
        main.enums.ApprovalStatus approvalStatus27 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("", approvalStatus27);
        main.enums.ApprovalStatus approvalStatus29 = approvalRequest28.getStatus();
        main.models.ApprovalRequest approvalRequest30 = new main.models.ApprovalRequest("", approvalStatus29);
        main.enums.ApprovalStatus approvalStatus31 = approvalRequest30.getStatus();
        approvalRequest16.setStatus(approvalStatus31);
        approvalRequest2.setStatus(approvalStatus31);
        java.lang.Class<?> wildcardClass34 = approvalStatus31.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus27.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus29.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        approvalRequest3.setStatus(approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest7.setStatus(approvalStatus8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus4 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("hi!", approvalStatus4);
        approvalRequest5.approve();
        approvalRequest5.approve();
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest5.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus3);
        approvalRequest2.reject();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        approvalRequest2.submit();
        java.lang.String str7 = approvalRequest2.getRequestId();
        approvalRequest2.submit();
        java.lang.Class<?> wildcardClass9 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Active + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Active));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest2.getStatus();
        java.lang.String str8 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        java.lang.String str9 = approvalRequest2.getRequestId();
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.reject();
        main.enums.ApprovalStatus approvalStatus13 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus13 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus13.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.approve();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("", approvalStatus12);
        approvalRequest14.setRequestId("hi!");
        approvalRequest14.approve();
        main.enums.ApprovalStatus approvalStatus19 = null;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest20.approve();
        main.enums.ApprovalStatus approvalStatus23 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest24 = new main.models.ApprovalRequest("", approvalStatus23);
        main.enums.ApprovalStatus approvalStatus25 = approvalRequest24.getStatus();
        approvalRequest20.setStatus(approvalStatus25);
        approvalRequest14.setStatus(approvalStatus25);
        approvalRequest2.setStatus(approvalStatus25);
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus23 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus23.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus25 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus25.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Pending;
        approvalRequest2.setStatus(approvalStatus5);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest11.getStatus();
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        approvalRequest16.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Pending;
        approvalRequest16.setStatus(approvalStatus19);
        approvalRequest13.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest2.setStatus(approvalStatus19);
        java.lang.String str24 = approvalRequest2.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.reject();
        approvalRequest7.reject();
        approvalRequest7.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        approvalRequest7.approve();
        main.enums.ApprovalStatus approvalStatus12 = null;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("hi!", approvalStatus12);
        approvalRequest13.approve();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest13.setStatus(approvalStatus18);
        approvalRequest7.setStatus(approvalStatus18);
        approvalRequest7.reject();
        main.enums.ApprovalStatus approvalStatus22 = approvalRequest7.getStatus();
        approvalRequest7.approve();
        approvalRequest7.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        approvalRequest7.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus10 = approvalRequest7.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus11 = null;
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("hi!", approvalStatus11);
        approvalRequest12.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus15 = main.enums.ApprovalStatus.Pending;
        approvalRequest12.setStatus(approvalStatus15);
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus15);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        approvalRequest2.setStatus(approvalStatus18);
        approvalRequest2.submit();
        main.enums.ApprovalStatus approvalStatus22 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("", approvalStatus22);
        main.enums.ApprovalStatus approvalStatus24 = approvalRequest23.getStatus();
        approvalRequest23.reject();
        main.enums.ApprovalStatus approvalStatus27 = null;
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("hi!", approvalStatus27);
        approvalRequest28.approve();
        main.enums.ApprovalStatus approvalStatus31 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest32 = new main.models.ApprovalRequest("", approvalStatus31);
        main.enums.ApprovalStatus approvalStatus33 = approvalRequest32.getStatus();
        approvalRequest28.setStatus(approvalStatus33);
        approvalRequest23.setStatus(approvalStatus33);
        approvalRequest2.setStatus(approvalStatus33);
        main.enums.ApprovalStatus approvalStatus37 = approvalRequest2.getStatus();
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus33 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus33.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus37 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus37.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.reject();
        java.lang.String str5 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        main.enums.ApprovalStatus approvalStatus3 = approvalRequest2.getStatus();
        approvalRequest2.approve();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        approvalRequest2.reject();
        java.lang.String str12 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.approve();
        java.lang.String str6 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        java.lang.Class<?> wildcardClass9 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        java.lang.Class<?> wildcardClass11 = approvalRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.reject();
        approvalRequest2.submit();
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus8 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest9 = new main.models.ApprovalRequest("", approvalStatus8);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Pending;
        approvalRequest9.setStatus(approvalStatus10);
        approvalRequest9.reject();
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest18.getStatus();
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        main.enums.ApprovalStatus approvalStatus24 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("", approvalStatus24);
        main.models.ApprovalRequest approvalRequest26 = new main.models.ApprovalRequest("", approvalStatus24);
        approvalRequest21.setStatus(approvalStatus24);
        main.models.ApprovalRequest approvalRequest28 = new main.models.ApprovalRequest("hi!", approvalStatus24);
        approvalRequest9.setStatus(approvalStatus24);
        approvalRequest9.setRequestId("");
        main.enums.ApprovalStatus approvalStatus32 = approvalRequest9.getStatus();
        approvalRequest2.setStatus(approvalStatus32);
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus24 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus24.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus32 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus32.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.enums.ApprovalStatus approvalStatus4 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest5 = new main.models.ApprovalRequest("", approvalStatus4);
        main.enums.ApprovalStatus approvalStatus6 = approvalRequest5.getStatus();
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.reject();
        java.lang.String str10 = approvalRequest8.getRequestId();
        approvalRequest8.setRequestId("hi!");
        approvalRequest8.setRequestId("");
        main.enums.ApprovalStatus approvalStatus15 = approvalRequest8.getStatus();
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        approvalRequest16.approve();
        java.lang.String str18 = approvalRequest16.getRequestId();
        approvalRequest16.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus4 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus4.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus15 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus15.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        main.enums.ApprovalStatus approvalStatus5 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus7 = approvalRequest6.getStatus();
        approvalRequest2.setStatus(approvalStatus7);
        main.enums.ApprovalStatus approvalStatus9 = approvalRequest2.getStatus();
        approvalRequest2.setRequestId("hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus7 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus7.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus9 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus9.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Pending;
        approvalRequest3.setStatus(approvalStatus6);
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("", approvalStatus6);
        approvalRequest8.submit();
        java.lang.String str10 = approvalRequest8.getRequestId();
        main.enums.ApprovalStatus approvalStatus13 = null;
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        java.lang.String str15 = approvalRequest14.getRequestId();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        approvalRequest14.setStatus(approvalStatus16);
        main.enums.ApprovalStatus approvalStatus19 = null;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest20.approve();
        approvalRequest20.setRequestId("");
        approvalRequest20.submit();
        main.enums.ApprovalStatus approvalStatus29 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest30 = new main.models.ApprovalRequest("", approvalStatus29);
        main.enums.ApprovalStatus approvalStatus31 = approvalRequest30.getStatus();
        main.models.ApprovalRequest approvalRequest32 = new main.models.ApprovalRequest("hi!", approvalStatus31);
        main.models.ApprovalRequest approvalRequest33 = new main.models.ApprovalRequest("", approvalStatus31);
        main.enums.ApprovalStatus approvalStatus36 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest37 = new main.models.ApprovalRequest("", approvalStatus36);
        main.models.ApprovalRequest approvalRequest38 = new main.models.ApprovalRequest("", approvalStatus36);
        approvalRequest33.setStatus(approvalStatus36);
        main.models.ApprovalRequest approvalRequest40 = new main.models.ApprovalRequest("hi!", approvalStatus36);
        approvalRequest20.setStatus(approvalStatus36);
        main.enums.ApprovalStatus approvalStatus44 = null;
        main.models.ApprovalRequest approvalRequest45 = new main.models.ApprovalRequest("hi!", approvalStatus44);
        java.lang.String str46 = approvalRequest45.getRequestId();
        main.enums.ApprovalStatus approvalStatus47 = main.enums.ApprovalStatus.Rejected;
        approvalRequest45.setStatus(approvalStatus47);
        main.enums.ApprovalStatus approvalStatus50 = null;
        main.models.ApprovalRequest approvalRequest51 = new main.models.ApprovalRequest("hi!", approvalStatus50);
        approvalRequest51.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus54 = main.enums.ApprovalStatus.Pending;
        approvalRequest51.setStatus(approvalStatus54);
        approvalRequest45.setStatus(approvalStatus54);
        main.models.ApprovalRequest approvalRequest57 = new main.models.ApprovalRequest("hi!", approvalStatus54);
        approvalRequest20.setStatus(approvalStatus54);
        approvalRequest14.setStatus(approvalStatus54);
        main.models.ApprovalRequest approvalRequest60 = new main.models.ApprovalRequest("", approvalStatus54);
        approvalRequest8.setStatus(approvalStatus54);
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus29 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus29.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus31 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus31.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus36 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus36.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus47 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus47.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus54 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus54.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        main.enums.ApprovalStatus approvalStatus6 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus6);
        main.enums.ApprovalStatus approvalStatus8 = approvalRequest7.getStatus();
        approvalRequest3.setStatus(approvalStatus8);
        main.models.ApprovalRequest approvalRequest10 = new main.models.ApprovalRequest("hi!", approvalStatus8);
        approvalRequest10.approve();
        java.lang.Class<?> wildcardClass12 = approvalRequest10.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus6 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus6.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus8 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus8.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        approvalRequest3.reject();
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest3.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        java.lang.String str7 = approvalRequest6.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus11 = main.enums.ApprovalStatus.Rejected;
        approvalRequest2.setStatus(approvalStatus11);
        java.lang.String str13 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus11 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus11.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus10);
        approvalRequest7.setStatus(approvalStatus10);
        java.lang.String str14 = approvalRequest7.getRequestId();
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest7.setStatus(approvalStatus19);
        approvalRequest7.approve();
        approvalRequest7.reject();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        approvalRequest2.approve();
        approvalRequest2.setRequestId("hi!");
        approvalRequest2.submit();
        java.lang.String str7 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus11 = approvalRequest2.getStatus();
        approvalRequest2.reject();
        java.lang.String str13 = approvalRequest2.getRequestId();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(approvalStatus11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        approvalRequest3.approve();
        approvalRequest3.setRequestId("");
        approvalRequest3.submit();
        main.enums.ApprovalStatus approvalStatus12 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest13 = new main.models.ApprovalRequest("", approvalStatus12);
        main.enums.ApprovalStatus approvalStatus14 = approvalRequest13.getStatus();
        main.models.ApprovalRequest approvalRequest15 = new main.models.ApprovalRequest("hi!", approvalStatus14);
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("", approvalStatus14);
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest3.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest25 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest25.setRequestId("hi!");
        approvalRequest25.reject();
        main.enums.ApprovalStatus approvalStatus31 = null;
        main.models.ApprovalRequest approvalRequest32 = new main.models.ApprovalRequest("hi!", approvalStatus31);
        approvalRequest32.approve();
        main.enums.ApprovalStatus approvalStatus35 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest36 = new main.models.ApprovalRequest("", approvalStatus35);
        main.enums.ApprovalStatus approvalStatus37 = approvalRequest36.getStatus();
        approvalRequest32.setStatus(approvalStatus37);
        main.models.ApprovalRequest approvalRequest39 = new main.models.ApprovalRequest("hi!", approvalStatus37);
        main.enums.ApprovalStatus approvalStatus40 = approvalRequest39.getStatus();
        approvalRequest25.setStatus(approvalStatus40);
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus14 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus14.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus35 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus35.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus37 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus37.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus40 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus40.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.enums.ApprovalStatus approvalStatus3 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus3);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.models.ApprovalRequest approvalRequest6 = new main.models.ApprovalRequest("hi!", approvalStatus5);
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("", approvalStatus5);
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest11 = new main.models.ApprovalRequest("", approvalStatus10);
        main.models.ApprovalRequest approvalRequest12 = new main.models.ApprovalRequest("", approvalStatus10);
        approvalRequest7.setStatus(approvalStatus10);
        java.lang.String str14 = approvalRequest7.getRequestId();
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest22 = new main.models.ApprovalRequest("", approvalStatus19);
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus19);
        approvalRequest7.setStatus(approvalStatus19);
        java.lang.String str25 = approvalRequest7.getRequestId();
        org.junit.Assert.assertTrue("'" + approvalStatus3 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus3.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.enums.ApprovalStatus approvalStatus1 = null;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("hi!", approvalStatus1);
        java.lang.String str3 = approvalRequest2.getRequestId();
        java.lang.String str4 = approvalRequest2.getRequestId();
        approvalRequest2.setRequestId("");
        main.enums.ApprovalStatus approvalStatus7 = null;
        approvalRequest2.setStatus(approvalStatus7);
        approvalRequest2.approve();
        java.lang.String str10 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus13 = null;
        main.models.ApprovalRequest approvalRequest14 = new main.models.ApprovalRequest("hi!", approvalStatus13);
        approvalRequest14.approve();
        main.enums.ApprovalStatus approvalStatus17 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest18 = new main.models.ApprovalRequest("", approvalStatus17);
        main.enums.ApprovalStatus approvalStatus19 = approvalRequest18.getStatus();
        approvalRequest14.setStatus(approvalStatus19);
        main.enums.ApprovalStatus approvalStatus21 = approvalRequest14.getStatus();
        main.enums.ApprovalStatus approvalStatus22 = approvalRequest14.getStatus();
        main.models.ApprovalRequest approvalRequest23 = new main.models.ApprovalRequest("hi!", approvalStatus22);
        approvalRequest2.setStatus(approvalStatus22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + approvalStatus17 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus17.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus21 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus21.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus22 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus22.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.enums.ApprovalStatus approvalStatus1 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest2 = new main.models.ApprovalRequest("", approvalStatus1);
        approvalRequest2.reject();
        java.lang.String str4 = approvalRequest2.getRequestId();
        main.enums.ApprovalStatus approvalStatus6 = null;
        main.models.ApprovalRequest approvalRequest7 = new main.models.ApprovalRequest("hi!", approvalStatus6);
        approvalRequest7.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus10 = main.enums.ApprovalStatus.Pending;
        approvalRequest7.setStatus(approvalStatus10);
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest7.getStatus();
        approvalRequest2.setStatus(approvalStatus12);
        approvalRequest2.reject();
        approvalRequest2.submit();
        org.junit.Assert.assertTrue("'" + approvalStatus1 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus1.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + approvalStatus10 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus10.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertTrue("'" + approvalStatus12 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus12.equals(main.enums.ApprovalStatus.Pending));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.enums.ApprovalStatus approvalStatus2 = null;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("hi!", approvalStatus2);
        java.lang.String str4 = approvalRequest3.getRequestId();
        java.lang.String str5 = approvalRequest3.getRequestId();
        approvalRequest3.setRequestId("");
        main.enums.ApprovalStatus approvalStatus8 = null;
        approvalRequest3.setStatus(approvalStatus8);
        approvalRequest3.setRequestId("");
        main.enums.ApprovalStatus approvalStatus12 = approvalRequest3.getStatus();
        main.enums.ApprovalStatus approvalStatus16 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest17 = new main.models.ApprovalRequest("", approvalStatus16);
        main.enums.ApprovalStatus approvalStatus18 = approvalRequest17.getStatus();
        main.models.ApprovalRequest approvalRequest19 = new main.models.ApprovalRequest("hi!", approvalStatus18);
        main.models.ApprovalRequest approvalRequest20 = new main.models.ApprovalRequest("", approvalStatus18);
        approvalRequest20.reject();
        java.lang.String str22 = approvalRequest20.getRequestId();
        approvalRequest20.setRequestId("hi!");
        approvalRequest20.setRequestId("");
        main.enums.ApprovalStatus approvalStatus27 = approvalRequest20.getStatus();
        approvalRequest3.setStatus(approvalStatus27);
        main.models.ApprovalRequest approvalRequest29 = new main.models.ApprovalRequest("", approvalStatus27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(approvalStatus12);
        org.junit.Assert.assertTrue("'" + approvalStatus16 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus16.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus18 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus18.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + approvalStatus27 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus27.equals(main.enums.ApprovalStatus.Rejected));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.enums.ApprovalStatus approvalStatus2 = main.enums.ApprovalStatus.Rejected;
        main.models.ApprovalRequest approvalRequest3 = new main.models.ApprovalRequest("", approvalStatus2);
        main.models.ApprovalRequest approvalRequest4 = new main.models.ApprovalRequest("", approvalStatus2);
        main.enums.ApprovalStatus approvalStatus5 = approvalRequest4.getStatus();
        main.enums.ApprovalStatus approvalStatus7 = null;
        main.models.ApprovalRequest approvalRequest8 = new main.models.ApprovalRequest("hi!", approvalStatus7);
        java.lang.String str9 = approvalRequest8.getRequestId();
        java.lang.String str10 = approvalRequest8.getRequestId();
        java.lang.String str11 = approvalRequest8.getRequestId();
        java.lang.String str12 = approvalRequest8.getRequestId();
        main.enums.ApprovalStatus approvalStatus15 = null;
        main.models.ApprovalRequest approvalRequest16 = new main.models.ApprovalRequest("hi!", approvalStatus15);
        approvalRequest16.setRequestId("hi!");
        main.enums.ApprovalStatus approvalStatus19 = main.enums.ApprovalStatus.Pending;
        approvalRequest16.setStatus(approvalStatus19);
        main.models.ApprovalRequest approvalRequest21 = new main.models.ApprovalRequest("", approvalStatus19);
        approvalRequest8.setStatus(approvalStatus19);
        approvalRequest4.setStatus(approvalStatus19);
        java.lang.Class<?> wildcardClass24 = approvalRequest4.getClass();
        org.junit.Assert.assertTrue("'" + approvalStatus2 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus2.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertTrue("'" + approvalStatus5 + "' != '" + main.enums.ApprovalStatus.Rejected + "'", approvalStatus5.equals(main.enums.ApprovalStatus.Rejected));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + approvalStatus19 + "' != '" + main.enums.ApprovalStatus.Pending + "'", approvalStatus19.equals(main.enums.ApprovalStatus.Pending));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }
}

