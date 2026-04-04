package test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRandoopTest {

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
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.Class<?> wildcardClass8 = guest7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.Class<?> wildcardClass11 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.String str8 = guest7.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "", "hi!", "", "hi!", accountStatus6);
        java.lang.Class<?> wildcardClass8 = researcher7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass10 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        java.lang.Class<?> wildcardClass12 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setEmail("");
        main.models.Reservation reservation10 = null;
        guest7.addReservation(reservation10);
        java.lang.String str12 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        guest7.setEmail("");
        main.models.Payment payment12 = null;
        guest7.addPayment(payment12);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        java.lang.String str21 = guest7.getUserId();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        main.models.ApprovalRequest approvalRequest11 = null;
        guest7.addApprovalRequest(approvalRequest11);
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        main.models.ApprovalRequest approvalRequest11 = null;
        guest7.addApprovalRequest(approvalRequest11);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.lang.Class<?> wildcardClass12 = researcher7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus10 = guest7.getStatus();
        guest7.setUserId("");
        guest7.setPassword("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        java.lang.String str9 = faculty7.getName();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setName("");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        researcher7.setEmail("hi!");
        main.enums.AccountStatus accountStatus11 = researcher7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.models.ApprovalRequest approvalRequest8 = null;
        researcher7.addApprovalRequest(approvalRequest8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.Class<?> wildcardClass8 = faculty7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        researcher7.setPassword("");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        main.enums.AccountStatus accountStatus14 = guest7.getStatus();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setName("");
        double double19 = guest7.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus10 = guest7.getStatus();
        main.models.Reservation[] reservationArray11 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList12 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList12, reservationArray11);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList12);
        double double15 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNotNull(reservationArray11);
        org.junit.Assert.assertArrayEquals(reservationArray11, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        boolean boolean14 = guest7.isPasswordStrong();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        double double9 = researcher7.getHourlyRate();
        researcher7.setUserId("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        guest7.setDepartment("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.util.List<main.models.Reservation> reservationList36 = guest32.getReservations();
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest20.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        boolean boolean43 = guest7.isPasswordStrong();
        main.models.ApprovalRequest approvalRequest44 = null;
        guest7.addApprovalRequest(approvalRequest44);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationArray37);
        org.junit.Assert.assertArrayEquals(reservationArray37, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        java.lang.String str13 = guest7.getName();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        java.lang.String str10 = faculty7.getName();
        main.models.Reservation reservation11 = null;
        faculty7.addReservation(reservation11);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest19 = null;
        guest7.addApprovalRequest(approvalRequest19);
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus27);
        guest28.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList31 = guest28.getReservations();
        guest28.setDepartment("hi!");
        double double34 = guest28.getHourlyRate();
        guest28.setEmail("");
        main.models.Payment[] paymentArray37 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList38 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList38, paymentArray37);
        guest28.setPayments((java.util.List<main.models.Payment>) paymentList38);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList38);
        boolean boolean42 = guest7.isPasswordStrong();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 30.0d + "'", double34 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray37);
        org.junit.Assert.assertArrayEquals(paymentArray37, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.String str8 = guest7.getEmail();
        java.lang.String str9 = guest7.getName();
        boolean boolean10 = guest7.isPasswordStrong();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        researcher7.setIdOrCertificationNumber("");
        double double10 = researcher7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Guest guest17 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus16);
        main.enums.AccountStatus accountStatus18 = guest17.getStatus();
        main.models.Payment payment19 = null;
        guest17.addPayment(payment19);
        guest17.setUserId("hi!");
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus29);
        main.enums.AccountStatus accountStatus31 = guest30.getStatus();
        main.models.Payment payment32 = null;
        guest30.addPayment(payment32);
        java.lang.String str34 = guest30.getUserId();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        java.util.List<main.models.Reservation> reservationList46 = guest42.getReservations();
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest30.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest17.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        main.models.Reservation reservation54 = null;
        faculty7.addReservation(reservation54);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationArray47);
        org.junit.Assert.assertArrayEquals(reservationArray47, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus27);
        main.enums.AccountStatus accountStatus29 = guest28.getStatus();
        main.models.Payment payment30 = null;
        guest28.addPayment(payment30);
        guest28.setUserId("hi!");
        main.enums.AccountStatus accountStatus40 = null;
        main.models.Guest guest41 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus40);
        main.enums.AccountStatus accountStatus42 = guest41.getStatus();
        main.models.Payment payment43 = null;
        guest41.addPayment(payment43);
        java.lang.String str45 = guest41.getUserId();
        main.enums.AccountStatus accountStatus52 = null;
        main.models.Guest guest53 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus52);
        main.enums.AccountStatus accountStatus54 = guest53.getStatus();
        main.models.Payment payment55 = null;
        guest53.addPayment(payment55);
        java.util.List<main.models.Reservation> reservationList57 = guest53.getReservations();
        main.models.Reservation[] reservationArray58 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList59 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList59, reservationArray58);
        guest53.setReservations((java.util.List<main.models.Reservation>) reservationList59);
        guest41.setReservations((java.util.List<main.models.Reservation>) reservationList59);
        guest28.setReservations((java.util.List<main.models.Reservation>) reservationList59);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList59);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertNull(accountStatus42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(accountStatus54);
        org.junit.Assert.assertNotNull(reservationList57);
        org.junit.Assert.assertNotNull(reservationArray58);
        org.junit.Assert.assertArrayEquals(reservationArray58, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        java.util.List<main.models.Reservation> reservationList22 = guest18.getReservations();
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        guest18.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        main.enums.AccountStatus accountStatus28 = guest7.getStatus();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(accountStatus28);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.String str8 = guest7.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        boolean boolean21 = guest7.isUniversityAffiliated();
        java.lang.Class<?> wildcardClass22 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setName("");
        double double19 = guest7.getHourlyRate();
        main.enums.AccountStatus accountStatus20 = null;
        guest7.setStatus(accountStatus20);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.lang.String str8 = guest7.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.Guest guest24 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus23);
        main.enums.AccountStatus accountStatus25 = guest24.getStatus();
        main.models.Payment payment26 = null;
        guest24.addPayment(payment26);
        java.lang.String str28 = guest24.getUserId();
        main.enums.AccountStatus accountStatus35 = null;
        main.models.Guest guest36 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus35);
        main.enums.AccountStatus accountStatus37 = guest36.getStatus();
        main.models.Payment payment38 = null;
        guest36.addPayment(payment38);
        java.util.List<main.models.Reservation> reservationList40 = guest36.getReservations();
        main.models.Reservation[] reservationArray41 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList42 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList42, reservationArray41);
        guest36.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        guest24.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        guest7.setEmail("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(accountStatus25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(accountStatus37);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNotNull(reservationArray41);
        org.junit.Assert.assertArrayEquals(reservationArray41, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("hi!");
        java.lang.String str15 = guest7.getEmail();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        java.lang.String str10 = researcher7.getName();
        java.lang.Class<?> wildcardClass11 = researcher7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        guest7.setName("hi!");
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = faculty7.getPayments();
        double double9 = faculty7.getHourlyRate();
        faculty7.setName("hi!");
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "", "hi!", "hi!", "hi!", accountStatus6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        guest19.setUserId("hi!");
        guest19.setDepartment("");
        java.lang.String str27 = guest19.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray28 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList29 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList29, approvalRequestArray28);
        guest19.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList29);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList29);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(approvalRequestArray28);
        org.junit.Assert.assertArrayEquals(approvalRequestArray28, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getEmail();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        java.util.List<main.models.Reservation> reservationList23 = guest19.getReservations();
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        guest19.setReservations((java.util.List<main.models.Reservation>) reservationList25);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList25);
        main.enums.AccountStatus accountStatus29 = guest7.getStatus();
        double double30 = guest7.getHourlyRate();
        main.enums.AccountStatus accountStatus31 = guest7.getStatus();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationArray24);
        org.junit.Assert.assertArrayEquals(reservationArray24, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 30.0d + "'", double30 == 30.0d);
        org.junit.Assert.assertNull(accountStatus31);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        double double9 = researcher7.getHourlyRate();
        double double10 = researcher7.getHourlyRate();
        double double11 = researcher7.getHourlyRate();
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        java.lang.String str23 = guest19.getUserId();
        main.enums.AccountStatus accountStatus30 = null;
        main.models.Guest guest31 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus30);
        main.enums.AccountStatus accountStatus32 = guest31.getStatus();
        main.models.Payment payment33 = null;
        guest31.addPayment(payment33);
        java.util.List<main.models.Reservation> reservationList35 = guest31.getReservations();
        main.models.Reservation[] reservationArray36 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList37 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList37, reservationArray36);
        guest31.setReservations((java.util.List<main.models.Reservation>) reservationList37);
        guest19.setReservations((java.util.List<main.models.Reservation>) reservationList37);
        researcher7.setReservations((java.util.List<main.models.Reservation>) reservationList37);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(accountStatus32);
        org.junit.Assert.assertNotNull(reservationList35);
        org.junit.Assert.assertNotNull(reservationArray36);
        org.junit.Assert.assertArrayEquals(reservationArray36, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        researcher7.setEmail("hi!");
        researcher7.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        java.lang.String str20 = guest7.getEmail();
        java.lang.String str21 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        main.enums.AccountStatus accountStatus13 = guest7.getStatus();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(accountStatus13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "hi!", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = researcher7.getApprovalRequests();
        java.lang.String str9 = researcher7.getPassword();
        researcher7.setEmail("hi!");
        main.models.Reservation reservation12 = null;
        researcher7.addReservation(reservation12);
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        main.enums.AccountStatus accountStatus9 = null;
        researcher7.setStatus(accountStatus9);
        researcher7.setPassword("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus10 = guest7.getStatus();
        main.models.Reservation[] reservationArray11 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList12 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList12, reservationArray11);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList12);
        guest7.setDepartment("hi!");
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNotNull(reservationArray11);
        org.junit.Assert.assertArrayEquals(reservationArray11, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setPassword("hi!");
        guest7.setName("");
        java.lang.String str15 = guest7.getEmail();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        guest7.setDepartment("");
        java.lang.String str18 = guest7.getUserId();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest19 = null;
        guest7.addApprovalRequest(approvalRequest19);
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus27);
        guest28.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList31 = guest28.getReservations();
        guest28.setDepartment("hi!");
        double double34 = guest28.getHourlyRate();
        guest28.setEmail("");
        main.models.Payment[] paymentArray37 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList38 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList38, paymentArray37);
        guest28.setPayments((java.util.List<main.models.Payment>) paymentList38);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList38);
        guest7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 30.0d + "'", double34 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray37);
        org.junit.Assert.assertArrayEquals(paymentArray37, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        main.enums.AccountStatus accountStatus26 = null;
        main.models.Guest guest27 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus26);
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Guest guest35 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus34);
        main.enums.AccountStatus accountStatus36 = guest35.getStatus();
        main.models.Payment payment37 = null;
        guest35.addPayment(payment37);
        java.util.List<main.models.Reservation> reservationList39 = guest35.getReservations();
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        guest35.setReservations((java.util.List<main.models.Reservation>) reservationList41);
        java.lang.String str44 = guest35.getUserId();
        main.enums.AccountStatus accountStatus51 = null;
        main.models.Guest guest52 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus51);
        main.enums.AccountStatus accountStatus53 = guest52.getStatus();
        main.models.Payment payment54 = null;
        guest52.addPayment(payment54);
        java.lang.String str56 = guest52.getUserId();
        main.enums.AccountStatus accountStatus63 = null;
        main.models.Guest guest64 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus63);
        main.enums.AccountStatus accountStatus65 = guest64.getStatus();
        main.models.Payment payment66 = null;
        guest64.addPayment(payment66);
        java.util.List<main.models.Reservation> reservationList68 = guest64.getReservations();
        main.models.Reservation[] reservationArray69 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList70 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList70, reservationArray69);
        guest64.setReservations((java.util.List<main.models.Reservation>) reservationList70);
        guest52.setReservations((java.util.List<main.models.Reservation>) reservationList70);
        guest35.setReservations((java.util.List<main.models.Reservation>) reservationList70);
        guest27.setReservations((java.util.List<main.models.Reservation>) reservationList70);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList70);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(accountStatus36);
        org.junit.Assert.assertNotNull(reservationList39);
        org.junit.Assert.assertNotNull(reservationArray40);
        org.junit.Assert.assertArrayEquals(reservationArray40, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(accountStatus53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(accountStatus65);
        org.junit.Assert.assertNotNull(reservationList68);
        org.junit.Assert.assertNotNull(reservationArray69);
        org.junit.Assert.assertArrayEquals(reservationArray69, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = faculty7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "", "", "hi!", "hi!", accountStatus6);
        main.models.ApprovalRequest approvalRequest8 = null;
        faculty7.addApprovalRequest(approvalRequest8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = researcher7.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        java.lang.String str11 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Guest guest17 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus16);
        main.enums.AccountStatus accountStatus18 = guest17.getStatus();
        main.models.Payment payment19 = null;
        guest17.addPayment(payment19);
        guest17.setUserId("hi!");
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus29);
        main.enums.AccountStatus accountStatus31 = guest30.getStatus();
        main.models.Payment payment32 = null;
        guest30.addPayment(payment32);
        java.lang.String str34 = guest30.getUserId();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        java.util.List<main.models.Reservation> reservationList46 = guest42.getReservations();
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest30.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest17.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        double double54 = faculty7.getHourlyRate();
        double double55 = faculty7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationArray47);
        org.junit.Assert.assertArrayEquals(reservationArray47, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 15.0d + "'", double54 == 15.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 15.0d + "'", double55 == 15.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "", "hi!", accountStatus6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "hi!", "hi!", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        main.models.Payment payment17 = null;
        guest15.addPayment(payment17);
        java.util.List<main.models.Reservation> reservationList19 = guest15.getReservations();
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.lang.String str24 = guest15.getUserId();
        guest15.setName("");
        main.models.ApprovalRequest[] approvalRequestArray27 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList28 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList28, approvalRequestArray27);
        guest15.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        researcher7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        java.lang.String str32 = researcher7.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationArray20);
        org.junit.Assert.assertArrayEquals(reservationArray20, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestArray27);
        org.junit.Assert.assertArrayEquals(approvalRequestArray27, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        faculty7.addReservation(reservation8);
        boolean boolean10 = faculty7.isUniversityAffiliated();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "hi!", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = researcher7.getApprovalRequests();
        java.lang.String str9 = researcher7.getPassword();
        java.lang.String str10 = researcher7.getName();
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = researcher7.getPayments();
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        double double12 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = guest7.getPayments();
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        main.models.Reservation reservation9 = null;
        researcher7.addReservation(reservation9);
        boolean boolean11 = researcher7.isPasswordStrong();
        main.enums.AccountStatus accountStatus12 = null;
        researcher7.setStatus(accountStatus12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "", "", "", "", accountStatus6);
        researcher7.setPassword("");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.enums.AccountStatus accountStatus10 = researcher7.getStatus();
        java.lang.String str11 = researcher7.getPassword();
        boolean boolean12 = researcher7.isUniversityAffiliated();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        boolean boolean11 = guest7.isUniversityAffiliated();
        java.lang.String str12 = guest7.getUserId();
        java.lang.String str13 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.util.List<main.models.Reservation> reservationList36 = guest32.getReservations();
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest20.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationArray37);
        org.junit.Assert.assertArrayEquals(reservationArray37, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("hi!");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.Faculty faculty22 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus21);
        double double23 = faculty22.getHourlyRate();
        double double24 = faculty22.getHourlyRate();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Faculty faculty32 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus31);
        java.util.List<main.models.Payment> paymentList33 = faculty32.getPayments();
        faculty22.setPayments(paymentList33);
        guest7.setPayments(paymentList33);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 15.0d + "'", double23 == 15.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 15.0d + "'", double24 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList33);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        guest7.setEmail("hi!");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        java.util.List<main.models.Reservation> reservationList23 = guest19.getReservations();
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        guest19.setReservations((java.util.List<main.models.Reservation>) reservationList25);
        java.lang.String str28 = guest19.getUserId();
        guest19.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest31 = null;
        guest19.addApprovalRequest(approvalRequest31);
        main.enums.AccountStatus accountStatus39 = null;
        main.models.Guest guest40 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus39);
        guest40.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList43 = guest40.getReservations();
        guest40.setDepartment("hi!");
        double double46 = guest40.getHourlyRate();
        guest40.setEmail("");
        main.models.Payment[] paymentArray49 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList50 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList50, paymentArray49);
        guest40.setPayments((java.util.List<main.models.Payment>) paymentList50);
        guest19.setPayments((java.util.List<main.models.Payment>) paymentList50);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList50);
        java.lang.String str55 = guest7.getEmail();
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationArray24);
        org.junit.Assert.assertArrayEquals(reservationArray24, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(reservationList43);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 30.0d + "'", double46 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray49);
        org.junit.Assert.assertArrayEquals(paymentArray49, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        guest7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        main.enums.AccountStatus accountStatus26 = null;
        main.models.Guest guest27 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus26);
        main.enums.AccountStatus accountStatus28 = guest27.getStatus();
        main.models.Payment payment29 = null;
        guest27.addPayment(payment29);
        java.util.List<main.models.Reservation> reservationList31 = guest27.getReservations();
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        guest27.setReservations((java.util.List<main.models.Reservation>) reservationList33);
        java.lang.String str36 = guest27.getUserId();
        guest27.setName("");
        main.models.ApprovalRequest[] approvalRequestArray39 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList40 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList40, approvalRequestArray39);
        guest27.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList40);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList40);
        main.models.Reservation reservation44 = null;
        guest7.addReservation(reservation44);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(accountStatus28);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationArray32);
        org.junit.Assert.assertArrayEquals(reservationArray32, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(approvalRequestArray39);
        org.junit.Assert.assertArrayEquals(approvalRequestArray39, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        double double10 = researcher7.getHourlyRate();
        researcher7.setUserId("");
        researcher7.setDepartment("");
        double double15 = researcher7.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        faculty7.setEmail("");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        double double10 = researcher7.getHourlyRate();
        researcher7.setName("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        researcher7.setIdOrCertificationNumber("");
        java.lang.String str10 = researcher7.getIdOrCertificationNumber();
        researcher7.setDepartment("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        main.models.Payment payment17 = null;
        guest15.addPayment(payment17);
        java.util.List<main.models.Reservation> reservationList19 = guest15.getReservations();
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.lang.String str24 = guest15.getUserId();
        guest15.setName("");
        main.models.ApprovalRequest[] approvalRequestArray27 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList28 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList28, approvalRequestArray27);
        guest15.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        double double32 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationArray20);
        org.junit.Assert.assertArrayEquals(reservationArray20, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestArray27);
        org.junit.Assert.assertArrayEquals(approvalRequestArray27, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 30.0d + "'", double32 == 30.0d);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        double double12 = guest7.getHourlyRate();
        guest7.setPassword("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = guest7.getApprovalRequests();
        guest7.setIdOrCertificationNumber("hi!");
        java.lang.Class<?> wildcardClass13 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        java.lang.String str12 = guest7.getName();
        guest7.setPassword("");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.Guest guest22 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus21);
        double double23 = guest22.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList24 = guest22.getApprovalRequests();
        guest7.setApprovalRequests(approvalRequestList24);
        guest7.setUserId("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertNotNull(approvalRequestList24);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        guest7.setIdOrCertificationNumber("");
        main.models.Payment payment22 = null;
        guest7.addPayment(payment22);
        double double24 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        guest7.setEmail("");
        java.util.List<main.models.Payment> paymentList16 = guest7.getPayments();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "hi!", "", "hi!", "", accountStatus6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        double double9 = researcher7.getHourlyRate();
        java.lang.String str10 = researcher7.getName();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        guest18.setUserId("hi!");
        guest18.setDepartment("");
        java.lang.String str26 = guest18.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray27 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList28 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList28, approvalRequestArray27);
        guest18.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        main.enums.AccountStatus accountStatus37 = null;
        main.models.Guest guest38 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus37);
        main.enums.AccountStatus accountStatus39 = guest38.getStatus();
        main.models.Payment payment40 = null;
        guest38.addPayment(payment40);
        guest38.setUserId("hi!");
        guest38.setDepartment("");
        java.lang.String str46 = guest38.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray47 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList48 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList48, approvalRequestArray47);
        guest38.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        guest18.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        researcher7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        researcher7.setName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(approvalRequestArray27);
        org.junit.Assert.assertArrayEquals(approvalRequestArray27, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(accountStatus39);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(approvalRequestArray47);
        org.junit.Assert.assertArrayEquals(approvalRequestArray47, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getUserId();
        double double9 = researcher7.getHourlyRate();
        java.lang.String str10 = researcher7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        java.util.List<main.models.Reservation> reservationList22 = guest18.getReservations();
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        guest18.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        researcher7.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        main.models.ApprovalRequest approvalRequest28 = null;
        researcher7.addApprovalRequest(approvalRequest28);
        main.enums.AccountStatus accountStatus36 = null;
        main.models.Guest guest37 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus36);
        main.enums.AccountStatus accountStatus38 = guest37.getStatus();
        main.models.Payment payment39 = null;
        guest37.addPayment(payment39);
        guest37.setUserId("hi!");
        guest37.setDepartment("");
        java.lang.String str45 = guest37.getEmail();
        main.enums.AccountStatus accountStatus52 = null;
        main.models.Guest guest53 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus52);
        main.enums.AccountStatus accountStatus54 = guest53.getStatus();
        main.models.Payment payment55 = null;
        guest53.addPayment(payment55);
        java.util.List<main.models.Reservation> reservationList57 = guest53.getReservations();
        main.models.Reservation[] reservationArray58 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList59 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList59, reservationArray58);
        guest53.setReservations((java.util.List<main.models.Reservation>) reservationList59);
        java.lang.String str62 = guest53.getUserId();
        guest53.setName("");
        main.models.ApprovalRequest[] approvalRequestArray65 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList66 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList66, approvalRequestArray65);
        guest53.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        guest37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        researcher7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(accountStatus38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNull(accountStatus54);
        org.junit.Assert.assertNotNull(reservationList57);
        org.junit.Assert.assertNotNull(reservationArray58);
        org.junit.Assert.assertArrayEquals(reservationArray58, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(approvalRequestArray65);
        org.junit.Assert.assertArrayEquals(approvalRequestArray65, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus6);
        guest7.setName("hi!");
        java.lang.String str10 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.enums.AccountStatus accountStatus10 = researcher7.getStatus();
        researcher7.setIdOrCertificationNumber("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.util.List<main.models.Reservation> reservationList36 = guest32.getReservations();
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest20.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        java.util.List<main.models.ApprovalRequest> approvalRequestList43 = guest7.getApprovalRequests();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationArray37);
        org.junit.Assert.assertArrayEquals(reservationArray37, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(approvalRequestList43);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest19 = null;
        guest7.addApprovalRequest(approvalRequest19);
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus27);
        main.enums.AccountStatus accountStatus29 = guest28.getStatus();
        main.models.Payment payment30 = null;
        guest28.addPayment(payment30);
        java.lang.String str32 = guest28.getUserId();
        main.models.ApprovalRequest approvalRequest33 = null;
        guest28.addApprovalRequest(approvalRequest33);
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus41);
        main.enums.AccountStatus accountStatus49 = null;
        main.models.Guest guest50 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus49);
        main.enums.AccountStatus accountStatus51 = guest50.getStatus();
        main.models.Payment payment52 = null;
        guest50.addPayment(payment52);
        java.util.List<main.models.Reservation> reservationList54 = guest50.getReservations();
        main.models.Reservation[] reservationArray55 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList56 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList56, reservationArray55);
        guest50.setReservations((java.util.List<main.models.Reservation>) reservationList56);
        java.lang.String str59 = guest50.getUserId();
        main.enums.AccountStatus accountStatus66 = null;
        main.models.Guest guest67 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus66);
        main.enums.AccountStatus accountStatus68 = guest67.getStatus();
        main.models.Payment payment69 = null;
        guest67.addPayment(payment69);
        java.lang.String str71 = guest67.getUserId();
        main.enums.AccountStatus accountStatus78 = null;
        main.models.Guest guest79 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus78);
        main.enums.AccountStatus accountStatus80 = guest79.getStatus();
        main.models.Payment payment81 = null;
        guest79.addPayment(payment81);
        java.util.List<main.models.Reservation> reservationList83 = guest79.getReservations();
        main.models.Reservation[] reservationArray84 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList85 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList85, reservationArray84);
        guest79.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        guest67.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        guest50.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        guest28.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList85);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(accountStatus51);
        org.junit.Assert.assertNotNull(reservationList54);
        org.junit.Assert.assertNotNull(reservationArray55);
        org.junit.Assert.assertArrayEquals(reservationArray55, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(accountStatus68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(accountStatus80);
        org.junit.Assert.assertNotNull(reservationList83);
        org.junit.Assert.assertNotNull(reservationArray84);
        org.junit.Assert.assertArrayEquals(reservationArray84, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        java.lang.String str20 = guest7.getEmail();
        java.util.List<main.models.Reservation> reservationList21 = guest7.getReservations();
        double double22 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        java.lang.String str9 = researcher7.getName();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.util.List<main.models.ApprovalRequest> approvalRequestList12 = researcher7.getApprovalRequests();
        researcher7.setUserId("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        java.lang.String str11 = guest7.getEmail();
        main.models.Payment payment12 = null;
        guest7.addPayment(payment12);
        boolean boolean14 = guest7.isPasswordStrong();
        java.lang.String str15 = guest7.getDepartment();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        main.models.Reservation reservation9 = null;
        researcher7.addReservation(reservation9);
        boolean boolean11 = researcher7.isPasswordStrong();
        main.models.Reservation reservation12 = null;
        researcher7.addReservation(reservation12);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.enums.AccountStatus accountStatus10 = researcher7.getStatus();
        double double11 = researcher7.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList12 = researcher7.getReservations();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setEmail("");
        main.models.Reservation reservation10 = null;
        guest7.addReservation(reservation10);
        guest7.setEmail("");
        main.enums.AccountStatus accountStatus14 = guest7.getStatus();
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        main.models.Payment payment17 = null;
        guest15.addPayment(payment17);
        java.util.List<main.models.Reservation> reservationList19 = guest15.getReservations();
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.lang.String str24 = guest15.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.lang.String str36 = guest32.getUserId();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.Guest guest44 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus43);
        main.enums.AccountStatus accountStatus45 = guest44.getStatus();
        main.models.Payment payment46 = null;
        guest44.addPayment(payment46);
        java.util.List<main.models.Reservation> reservationList48 = guest44.getReservations();
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        guest44.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest7.setDepartment("hi!");
        guest7.setEmail("");
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationArray20);
        org.junit.Assert.assertArrayEquals(reservationArray20, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(accountStatus45);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertNotNull(reservationArray49);
        org.junit.Assert.assertArrayEquals(reservationArray49, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        guest7.setName("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        researcher7.setEmail("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = researcher7.getApprovalRequests();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList16 = guest7.getReservations();
        main.enums.AccountStatus accountStatus17 = guest7.getStatus();
        guest7.setPassword("hi!");
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(accountStatus17);
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.String str8 = guest7.getDepartment();
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "", "", "", accountStatus6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "hi!", "", "", "", "", accountStatus6);
        researcher7.setIdOrCertificationNumber("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = guest7.getApprovalRequests();
        guest7.setIdOrCertificationNumber("hi!");
        java.lang.String str13 = guest7.getName();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        java.lang.String str8 = guest7.getName();
        guest7.setDepartment("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "", "", "hi!", accountStatus6);
        guest7.setDepartment("");
        double double10 = guest7.getHourlyRate();
        main.models.Payment payment11 = null;
        guest7.addPayment(payment11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        researcher7.setName("hi!");
        main.enums.AccountStatus accountStatus11 = null;
        researcher7.setStatus(accountStatus11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getName();
        main.models.Reservation reservation21 = null;
        guest7.addReservation(reservation21);
        guest7.setUserId("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        java.lang.String str20 = guest7.getEmail();
        java.util.List<main.models.Reservation> reservationList21 = guest7.getReservations();
        java.util.List<main.models.Payment> paymentList22 = guest7.getPayments();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(paymentList22);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "hi!", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = researcher7.getApprovalRequests();
        java.util.List<main.models.Reservation> reservationList9 = researcher7.getReservations();
        java.lang.String str10 = researcher7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = null;
        guest7.setStatus(accountStatus8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "", "", "", "", accountStatus6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.lang.Class<?> wildcardClass10 = guest7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        java.util.List<main.models.Reservation> reservationList22 = guest18.getReservations();
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        guest18.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        guest7.setName("hi!");
        main.enums.AccountStatus accountStatus36 = null;
        main.models.Guest guest37 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus36);
        main.enums.AccountStatus accountStatus38 = guest37.getStatus();
        java.lang.String str39 = guest37.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus40 = guest37.getStatus();
        guest37.setUserId("");
        main.enums.AccountStatus accountStatus49 = null;
        main.models.Researcher researcher50 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus49);
        java.lang.String str51 = researcher50.getPassword();
        double double52 = researcher50.getHourlyRate();
        java.lang.String str53 = researcher50.getName();
        main.enums.AccountStatus accountStatus60 = null;
        main.models.Guest guest61 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus60);
        main.enums.AccountStatus accountStatus62 = guest61.getStatus();
        main.models.Payment payment63 = null;
        guest61.addPayment(payment63);
        guest61.setUserId("hi!");
        guest61.setDepartment("");
        java.lang.String str69 = guest61.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray70 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList71 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList71, approvalRequestArray70);
        guest61.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList71);
        main.enums.AccountStatus accountStatus80 = null;
        main.models.Guest guest81 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus80);
        main.enums.AccountStatus accountStatus82 = guest81.getStatus();
        main.models.Payment payment83 = null;
        guest81.addPayment(payment83);
        guest81.setUserId("hi!");
        guest81.setDepartment("");
        java.lang.String str89 = guest81.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray90 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList91 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList91, approvalRequestArray90);
        guest81.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList91);
        guest61.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList91);
        researcher50.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList91);
        guest37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList91);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList91);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(accountStatus38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNull(accountStatus40);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNull(accountStatus62);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(approvalRequestArray70);
        org.junit.Assert.assertArrayEquals(approvalRequestArray70, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(accountStatus82);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(approvalRequestArray90);
        org.junit.Assert.assertArrayEquals(approvalRequestArray90, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.String str8 = guest7.getUserId();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.Guest guest16 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus15);
        guest16.setDepartment("hi!");
        guest16.setEmail("hi!");
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus27);
        main.enums.AccountStatus accountStatus29 = guest28.getStatus();
        main.models.Payment payment30 = null;
        guest28.addPayment(payment30);
        java.util.List<main.models.Reservation> reservationList32 = guest28.getReservations();
        main.models.Reservation[] reservationArray33 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList34 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList34, reservationArray33);
        guest28.setReservations((java.util.List<main.models.Reservation>) reservationList34);
        java.lang.String str37 = guest28.getUserId();
        guest28.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest40 = null;
        guest28.addApprovalRequest(approvalRequest40);
        main.enums.AccountStatus accountStatus48 = null;
        main.models.Guest guest49 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus48);
        guest49.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList52 = guest49.getReservations();
        guest49.setDepartment("hi!");
        double double55 = guest49.getHourlyRate();
        guest49.setEmail("");
        main.models.Payment[] paymentArray58 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList59 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList59, paymentArray58);
        guest49.setPayments((java.util.List<main.models.Payment>) paymentList59);
        guest28.setPayments((java.util.List<main.models.Payment>) paymentList59);
        guest16.setPayments((java.util.List<main.models.Payment>) paymentList59);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList59);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(reservationArray33);
        org.junit.Assert.assertArrayEquals(reservationArray33, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(reservationList52);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 30.0d + "'", double55 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray58);
        org.junit.Assert.assertArrayEquals(paymentArray58, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        double double8 = researcher7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        java.lang.String str10 = faculty7.getIdOrCertificationNumber();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        java.lang.String str12 = guest7.getDepartment();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Guest guest17 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus16);
        main.enums.AccountStatus accountStatus18 = guest17.getStatus();
        main.models.Payment payment19 = null;
        guest17.addPayment(payment19);
        guest17.setUserId("hi!");
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus29);
        main.enums.AccountStatus accountStatus31 = guest30.getStatus();
        main.models.Payment payment32 = null;
        guest30.addPayment(payment32);
        java.lang.String str34 = guest30.getUserId();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        java.util.List<main.models.Reservation> reservationList46 = guest42.getReservations();
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest30.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest17.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        main.enums.AccountStatus accountStatus54 = faculty7.getStatus();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationArray47);
        org.junit.Assert.assertArrayEquals(reservationArray47, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(accountStatus54);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        main.models.Payment payment11 = null;
        guest7.addPayment(payment11);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus17);
        guest18.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList21 = guest18.getReservations();
        guest18.setDepartment("hi!");
        double double24 = guest18.getHourlyRate();
        guest18.setEmail("");
        main.models.Payment[] paymentArray27 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList28 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList28, paymentArray27);
        guest18.setPayments((java.util.List<main.models.Payment>) paymentList28);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList28);
        java.util.List<main.models.Payment> paymentList32 = guest7.getPayments();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray27);
        org.junit.Assert.assertArrayEquals(paymentArray27, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(paymentList32);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        boolean boolean8 = faculty7.isUniversityAffiliated();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "hi!", "hi!", "hi!", "", accountStatus6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.Guest guest24 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus23);
        main.enums.AccountStatus accountStatus25 = guest24.getStatus();
        main.models.Payment payment26 = null;
        guest24.addPayment(payment26);
        java.lang.String str28 = guest24.getUserId();
        main.enums.AccountStatus accountStatus35 = null;
        main.models.Guest guest36 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus35);
        main.enums.AccountStatus accountStatus37 = guest36.getStatus();
        main.models.Payment payment38 = null;
        guest36.addPayment(payment38);
        java.util.List<main.models.Reservation> reservationList40 = guest36.getReservations();
        main.models.Reservation[] reservationArray41 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList42 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList42, reservationArray41);
        guest36.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        guest24.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList42);
        main.models.ApprovalRequest approvalRequest47 = null;
        guest7.addApprovalRequest(approvalRequest47);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(accountStatus25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(accountStatus37);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertNotNull(reservationArray41);
        org.junit.Assert.assertArrayEquals(reservationArray41, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        guest7.setIdOrCertificationNumber("hi!");
        guest7.setPassword("");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        guest19.setUserId("hi!");
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.lang.String str36 = guest32.getUserId();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.Guest guest44 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus43);
        main.enums.AccountStatus accountStatus45 = guest44.getStatus();
        main.models.Payment payment46 = null;
        guest44.addPayment(payment46);
        java.util.List<main.models.Reservation> reservationList48 = guest44.getReservations();
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        guest44.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest19.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(accountStatus45);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertNotNull(reservationArray49);
        org.junit.Assert.assertArrayEquals(reservationArray49, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus19 = null;
        guest7.setStatus(accountStatus19);
        java.lang.String str21 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setEmail("");
        main.models.Reservation reservation10 = null;
        guest7.addReservation(reservation10);
        guest7.setEmail("");
        guest7.setPassword("hi!");
        double double16 = guest7.getHourlyRate();
        guest7.setPassword("");
        main.enums.AccountStatus accountStatus25 = null;
        main.models.Researcher researcher26 = new main.models.Researcher("", "", "", "hi!", "", "hi!", accountStatus25);
        java.util.List<main.models.ApprovalRequest> approvalRequestList27 = researcher26.getApprovalRequests();
        guest7.setApprovalRequests(approvalRequestList27);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(approvalRequestList27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        main.models.ApprovalRequest approvalRequest21 = null;
        guest7.addApprovalRequest(approvalRequest21);
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus29);
        double double31 = guest30.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList32 = guest30.getApprovalRequests();
        guest30.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        guest42.setUserId("hi!");
        main.enums.AccountStatus accountStatus54 = null;
        main.models.Guest guest55 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus54);
        main.enums.AccountStatus accountStatus56 = guest55.getStatus();
        main.models.Payment payment57 = null;
        guest55.addPayment(payment57);
        java.lang.String str59 = guest55.getUserId();
        main.enums.AccountStatus accountStatus66 = null;
        main.models.Guest guest67 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus66);
        main.enums.AccountStatus accountStatus68 = guest67.getStatus();
        main.models.Payment payment69 = null;
        guest67.addPayment(payment69);
        java.util.List<main.models.Reservation> reservationList71 = guest67.getReservations();
        main.models.Reservation[] reservationArray72 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList73 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList73, reservationArray72);
        guest67.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        guest55.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        java.util.List<main.models.Reservation> reservationList78 = guest42.getReservations();
        guest30.setReservations(reservationList78);
        guest7.setReservations(reservationList78);
        main.models.ApprovalRequest approvalRequest81 = null;
        guest7.addApprovalRequest(approvalRequest81);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertNotNull(approvalRequestList32);
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNull(accountStatus56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(accountStatus68);
        org.junit.Assert.assertNotNull(reservationList71);
        org.junit.Assert.assertNotNull(reservationArray72);
        org.junit.Assert.assertArrayEquals(reservationArray72, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(reservationList78);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        main.models.Reservation reservation10 = null;
        guest7.addReservation(reservation10);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "", "", "", "", accountStatus6);
        researcher7.setEmail("");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        main.models.ApprovalRequest approvalRequest9 = null;
        faculty7.addApprovalRequest(approvalRequest9);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = faculty7.getPayments();
        double double9 = faculty7.getHourlyRate();
        double double10 = faculty7.getHourlyRate();
        main.models.Payment payment11 = null;
        faculty7.addPayment(payment11);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getPassword();
        double double20 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus6);
        guest7.setPassword("hi!");
        java.lang.String str10 = guest7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = guest7.getApprovalRequests();
        java.lang.String str12 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "", "", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        java.lang.String str17 = guest15.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus18 = guest15.getStatus();
        main.models.Reservation[] reservationArray19 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList20 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList20, reservationArray19);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList20);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList20);
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNotNull(reservationArray19);
        org.junit.Assert.assertArrayEquals(reservationArray19, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.util.List<main.models.Reservation> reservationList36 = guest32.getReservations();
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest20.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        main.models.Reservation reservation43 = null;
        guest7.addReservation(reservation43);
        java.lang.String str45 = guest7.getUserId();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationArray37);
        org.junit.Assert.assertArrayEquals(reservationArray37, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        java.lang.String str9 = researcher7.getName();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.util.List<main.models.ApprovalRequest> approvalRequestList12 = researcher7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList13 = researcher7.getPayments();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(paymentList13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setPassword("hi!");
        guest7.setName("");
        double double15 = guest7.getHourlyRate();
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        double double9 = researcher7.getHourlyRate();
        double double10 = researcher7.getHourlyRate();
        boolean boolean11 = researcher7.isUniversityAffiliated();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        guest7.setIdOrCertificationNumber("");
        main.models.Reservation reservation22 = null;
        guest7.addReservation(reservation22);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        main.models.Reservation reservation20 = null;
        guest7.addReservation(reservation20);
        guest7.setName("hi!");
        java.lang.String str24 = guest7.getEmail();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getUserId();
        double double9 = researcher7.getHourlyRate();
        java.lang.String str10 = researcher7.getPassword();
        java.lang.String str11 = researcher7.getIdOrCertificationNumber();
        java.lang.String str12 = researcher7.getPassword();
        java.lang.String str13 = researcher7.getDepartment();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getUserId();
        double double9 = researcher7.getHourlyRate();
        java.lang.String str10 = researcher7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        java.util.List<main.models.Reservation> reservationList22 = guest18.getReservations();
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        guest18.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        researcher7.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Guest guest35 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus34);
        main.enums.AccountStatus accountStatus36 = guest35.getStatus();
        main.models.Payment payment37 = null;
        guest35.addPayment(payment37);
        guest35.setUserId("hi!");
        guest35.setDepartment("");
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        guest35.setReservations((java.util.List<main.models.Reservation>) reservationList44);
        researcher7.setReservations((java.util.List<main.models.Reservation>) reservationList44);
        java.util.List<main.models.Payment> paymentList48 = researcher7.getPayments();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(accountStatus36);
        org.junit.Assert.assertNotNull(reservationArray43);
        org.junit.Assert.assertArrayEquals(reservationArray43, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(paymentList48);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "hi!", "", "", "", "hi!", accountStatus6);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        guest7.setEmail("hi!");
        main.enums.AccountStatus accountStatus28 = null;
        main.models.Guest guest29 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus28);
        guest29.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList32 = guest29.getReservations();
        guest7.setReservations(reservationList32);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList32);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Faculty faculty17 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus16);
        java.util.List<main.models.Payment> paymentList18 = faculty17.getPayments();
        faculty7.setPayments(paymentList18);
        double double20 = faculty7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        guest7.setEmail("hi!");
        java.lang.Class<?> wildcardClass22 = guest7.getClass();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "", "", "hi!", "hi!", accountStatus6);
        faculty7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Researcher researcher17 = new main.models.Researcher("", "", "", "hi!", "hi!", "hi!", accountStatus16);
        main.enums.AccountStatus accountStatus24 = null;
        main.models.Faculty faculty25 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus24);
        double double26 = faculty25.getHourlyRate();
        double double27 = faculty25.getHourlyRate();
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Faculty faculty35 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus34);
        java.util.List<main.models.Payment> paymentList36 = faculty35.getPayments();
        faculty25.setPayments(paymentList36);
        researcher17.setPayments(paymentList36);
        faculty7.setPayments(paymentList36);
        faculty7.setPassword("");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 15.0d + "'", double26 == 15.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 15.0d + "'", double27 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList36);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus17);
        main.enums.AccountStatus accountStatus19 = guest18.getStatus();
        main.models.Payment payment20 = null;
        guest18.addPayment(payment20);
        java.util.List<main.models.Reservation> reservationList22 = guest18.getReservations();
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        guest18.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList24);
        guest7.setName("hi!");
        java.lang.String str30 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus19);
        org.junit.Assert.assertNotNull(reservationList22);
        org.junit.Assert.assertNotNull(reservationArray23);
        org.junit.Assert.assertArrayEquals(reservationArray23, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        main.models.Reservation reservation9 = null;
        researcher7.addReservation(reservation9);
        boolean boolean11 = researcher7.isPasswordStrong();
        researcher7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getIdOrCertificationNumber();
        double double9 = researcher7.getHourlyRate();
        boolean boolean10 = researcher7.isPasswordStrong();
        double double11 = researcher7.getHourlyRate();
        double double12 = researcher7.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.String str8 = faculty7.getUserId();
        java.lang.String str9 = faculty7.getIdOrCertificationNumber();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        main.models.ApprovalRequest approvalRequest12 = null;
        guest7.addApprovalRequest(approvalRequest12);
        java.lang.String str14 = guest7.getPassword();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.Guest guest22 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus21);
        guest22.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList25 = guest22.getReservations();
        guest22.setDepartment("hi!");
        double double28 = guest22.getHourlyRate();
        guest22.setEmail("");
        main.models.Payment[] paymentArray31 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList32 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList32, paymentArray31);
        guest22.setPayments((java.util.List<main.models.Payment>) paymentList32);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList32);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 30.0d + "'", double28 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray31);
        org.junit.Assert.assertArrayEquals(paymentArray31, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        java.lang.String str12 = guest7.getName();
        guest7.setUserId("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        main.enums.AccountStatus accountStatus18 = null;
        main.models.Guest guest19 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus18);
        main.enums.AccountStatus accountStatus20 = guest19.getStatus();
        main.models.Payment payment21 = null;
        guest19.addPayment(payment21);
        java.util.List<main.models.Reservation> reservationList23 = guest19.getReservations();
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        guest19.setReservations((java.util.List<main.models.Reservation>) reservationList25);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList25);
        main.enums.AccountStatus accountStatus29 = guest7.getStatus();
        double double30 = guest7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList31 = guest7.getApprovalRequests();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(reservationArray24);
        org.junit.Assert.assertArrayEquals(reservationArray24, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 30.0d + "'", double30 == 30.0d);
        org.junit.Assert.assertNotNull(approvalRequestList31);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "hi!", "", "", "", "", accountStatus6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = faculty7.getPayments();
        double double9 = faculty7.getHourlyRate();
        double double10 = faculty7.getHourlyRate();
        double double11 = faculty7.getHourlyRate();
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList16 = guest7.getReservations();
        main.enums.AccountStatus accountStatus17 = guest7.getStatus();
        guest7.setPassword("hi!");
        main.enums.AccountStatus accountStatus26 = null;
        main.models.Guest guest27 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus26);
        main.enums.AccountStatus accountStatus28 = guest27.getStatus();
        main.models.Payment payment29 = null;
        guest27.addPayment(payment29);
        java.util.List<main.models.Reservation> reservationList31 = guest27.getReservations();
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        guest27.setReservations((java.util.List<main.models.Reservation>) reservationList33);
        java.util.List<main.models.Reservation> reservationList36 = guest27.getReservations();
        guest7.setReservations(reservationList36);
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(accountStatus17);
        org.junit.Assert.assertNull(accountStatus28);
        org.junit.Assert.assertNotNull(reservationList31);
        org.junit.Assert.assertNotNull(reservationArray32);
        org.junit.Assert.assertArrayEquals(reservationArray32, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(reservationList36);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setEmail("");
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = guest7.getApprovalRequests();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.Guest guest18 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus17);
        java.lang.String str19 = guest18.getEmail();
        java.lang.String str20 = guest18.getName();
        java.util.List<main.models.Reservation> reservationList21 = guest18.getReservations();
        guest7.setReservations(reservationList21);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        main.models.Reservation reservation20 = null;
        guest7.addReservation(reservation20);
        java.lang.String str22 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList16);
        java.lang.String str19 = guest7.getUserId();
        main.models.Reservation reservation20 = null;
        guest7.addReservation(reservation20);
        java.lang.String str22 = guest7.getIdOrCertificationNumber();
        guest7.setEmail("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationArray15);
        org.junit.Assert.assertArrayEquals(reservationArray15, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setName("");
        main.models.ApprovalRequest[] approvalRequestArray19 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList20 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList20, approvalRequestArray19);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList20);
        guest7.setName("hi!");
        guest7.setDepartment("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(approvalRequestArray19);
        org.junit.Assert.assertArrayEquals(approvalRequestArray19, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        main.models.Reservation reservation20 = null;
        guest7.addReservation(reservation20);
        guest7.setName("hi!");
        java.util.List<main.models.Reservation> reservationList24 = guest7.getReservations();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(reservationList24);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        double double21 = guest7.getHourlyRate();
        main.enums.AccountStatus accountStatus28 = null;
        main.models.Guest guest29 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus28);
        main.enums.AccountStatus accountStatus30 = guest29.getStatus();
        main.models.Payment payment31 = null;
        guest29.addPayment(payment31);
        guest29.setUserId("hi!");
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        java.lang.String str46 = guest42.getUserId();
        main.enums.AccountStatus accountStatus53 = null;
        main.models.Guest guest54 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus53);
        main.enums.AccountStatus accountStatus55 = guest54.getStatus();
        main.models.Payment payment56 = null;
        guest54.addPayment(payment56);
        java.util.List<main.models.Reservation> reservationList58 = guest54.getReservations();
        main.models.Reservation[] reservationArray59 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList60 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList60, reservationArray59);
        guest54.setReservations((java.util.List<main.models.Reservation>) reservationList60);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList60);
        guest29.setReservations((java.util.List<main.models.Reservation>) reservationList60);
        java.util.List<main.models.Reservation> reservationList65 = guest29.getReservations();
        guest7.setReservations(reservationList65);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertNull(accountStatus30);
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(accountStatus55);
        org.junit.Assert.assertNotNull(reservationList58);
        org.junit.Assert.assertNotNull(reservationArray59);
        org.junit.Assert.assertArrayEquals(reservationArray59, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(reservationList65);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = null;
        researcher7.setStatus(accountStatus8);
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Faculty faculty17 = new main.models.Faculty("", "", "", "", "hi!", "hi!", accountStatus16);
        faculty17.setEmail("");
        main.enums.AccountStatus accountStatus26 = null;
        main.models.Researcher researcher27 = new main.models.Researcher("", "", "", "hi!", "hi!", "hi!", accountStatus26);
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Faculty faculty35 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus34);
        double double36 = faculty35.getHourlyRate();
        double double37 = faculty35.getHourlyRate();
        main.enums.AccountStatus accountStatus44 = null;
        main.models.Faculty faculty45 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus44);
        java.util.List<main.models.Payment> paymentList46 = faculty45.getPayments();
        faculty35.setPayments(paymentList46);
        researcher27.setPayments(paymentList46);
        faculty17.setPayments(paymentList46);
        researcher7.setPayments(paymentList46);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 15.0d + "'", double36 == 15.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 15.0d + "'", double37 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList46);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.String str8 = guest7.getDepartment();
        java.util.List<main.models.Payment> paymentList9 = guest7.getPayments();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = faculty7.getPayments();
        faculty7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getUserId();
        researcher7.setEmail("hi!");
        java.lang.String str11 = researcher7.getUserId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Guest guest17 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus16);
        main.enums.AccountStatus accountStatus18 = guest17.getStatus();
        main.models.Payment payment19 = null;
        guest17.addPayment(payment19);
        java.util.List<main.models.Reservation> reservationList21 = guest17.getReservations();
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        guest17.setReservations((java.util.List<main.models.Reservation>) reservationList23);
        java.lang.String str26 = guest17.getUserId();
        guest17.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest29 = null;
        guest17.addApprovalRequest(approvalRequest29);
        main.enums.AccountStatus accountStatus37 = null;
        main.models.Guest guest38 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus37);
        guest38.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList41 = guest38.getReservations();
        guest38.setDepartment("hi!");
        double double44 = guest38.getHourlyRate();
        guest38.setEmail("");
        main.models.Payment[] paymentArray47 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList48 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList48, paymentArray47);
        guest38.setPayments((java.util.List<main.models.Payment>) paymentList48);
        guest17.setPayments((java.util.List<main.models.Payment>) paymentList48);
        researcher7.setPayments((java.util.List<main.models.Payment>) paymentList48);
        researcher7.setPassword("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(reservationArray22);
        org.junit.Assert.assertArrayEquals(reservationArray22, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 30.0d + "'", double44 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray47);
        org.junit.Assert.assertArrayEquals(paymentArray47, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.enums.AccountStatus accountStatus10 = researcher7.getStatus();
        main.models.ApprovalRequest approvalRequest11 = null;
        researcher7.addApprovalRequest(approvalRequest11);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "", "", "hi!", "hi!", accountStatus6);
        faculty7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Researcher researcher17 = new main.models.Researcher("", "", "", "hi!", "hi!", "hi!", accountStatus16);
        main.enums.AccountStatus accountStatus24 = null;
        main.models.Faculty faculty25 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus24);
        double double26 = faculty25.getHourlyRate();
        double double27 = faculty25.getHourlyRate();
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Faculty faculty35 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus34);
        java.util.List<main.models.Payment> paymentList36 = faculty35.getPayments();
        faculty25.setPayments(paymentList36);
        researcher17.setPayments(paymentList36);
        faculty7.setPayments(paymentList36);
        java.lang.String str40 = faculty7.getIdOrCertificationNumber();
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 15.0d + "'", double26 == 15.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 15.0d + "'", double27 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus10 = guest7.getStatus();
        guest7.setUserId("");
        main.models.ApprovalRequest[] approvalRequestArray13 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList14 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList14, approvalRequestArray13);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList14);
        main.enums.AccountStatus accountStatus17 = guest7.getStatus();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNotNull(approvalRequestArray13);
        org.junit.Assert.assertArrayEquals(approvalRequestArray13, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(accountStatus17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "hi!", "", "", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        main.models.Payment payment17 = null;
        guest15.addPayment(payment17);
        java.util.List<main.models.Reservation> reservationList19 = guest15.getReservations();
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.lang.String str24 = guest15.getUserId();
        guest15.setIdOrCertificationNumber("");
        java.lang.String str27 = guest15.getName();
        main.enums.AccountStatus accountStatus34 = null;
        main.models.Guest guest35 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus34);
        main.enums.AccountStatus accountStatus36 = guest35.getStatus();
        main.models.Payment payment37 = null;
        guest35.addPayment(payment37);
        java.util.List<main.models.Reservation> reservationList39 = guest35.getReservations();
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        guest35.setReservations((java.util.List<main.models.Reservation>) reservationList41);
        java.lang.String str44 = guest35.getUserId();
        guest35.setName("");
        main.models.ApprovalRequest[] approvalRequestArray47 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList48 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList48, approvalRequestArray47);
        guest35.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        guest15.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        faculty7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        double double53 = faculty7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationArray20);
        org.junit.Assert.assertArrayEquals(reservationArray20, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(accountStatus36);
        org.junit.Assert.assertNotNull(reservationList39);
        org.junit.Assert.assertNotNull(reservationArray40);
        org.junit.Assert.assertArrayEquals(reservationArray40, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(approvalRequestArray47);
        org.junit.Assert.assertArrayEquals(approvalRequestArray47, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 15.0d + "'", double53 == 15.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        double double9 = researcher7.getHourlyRate();
        double double10 = researcher7.getHourlyRate();
        double double11 = researcher7.getHourlyRate();
        researcher7.setEmail("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.lang.String str11 = guest7.getUserId();
        main.models.ApprovalRequest approvalRequest12 = null;
        guest7.addApprovalRequest(approvalRequest12);
        java.lang.String str14 = guest7.getPassword();
        double double15 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "", "", "", "", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        researcher7.setEmail("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = researcher7.getApprovalRequests();
        main.models.Reservation reservation11 = null;
        researcher7.addReservation(reservation11);
        org.junit.Assert.assertNotNull(approvalRequestList10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        boolean boolean11 = guest7.isUniversityAffiliated();
        java.lang.String str12 = guest7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList13 = guest7.getApprovalRequests();
        double double14 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.util.List<main.models.Payment> paymentList12 = null;
        researcher7.setPayments(paymentList12);
        main.models.Payment payment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            researcher7.addPayment(payment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray16 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList17 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList17, approvalRequestArray16);
        guest7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList17);
        java.util.List<main.models.Reservation> reservationList20 = guest7.getReservations();
        main.models.ApprovalRequest approvalRequest21 = null;
        guest7.addApprovalRequest(approvalRequest21);
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus29);
        double double31 = guest30.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList32 = guest30.getApprovalRequests();
        guest30.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        guest42.setUserId("hi!");
        main.enums.AccountStatus accountStatus54 = null;
        main.models.Guest guest55 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus54);
        main.enums.AccountStatus accountStatus56 = guest55.getStatus();
        main.models.Payment payment57 = null;
        guest55.addPayment(payment57);
        java.lang.String str59 = guest55.getUserId();
        main.enums.AccountStatus accountStatus66 = null;
        main.models.Guest guest67 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus66);
        main.enums.AccountStatus accountStatus68 = guest67.getStatus();
        main.models.Payment payment69 = null;
        guest67.addPayment(payment69);
        java.util.List<main.models.Reservation> reservationList71 = guest67.getReservations();
        main.models.Reservation[] reservationArray72 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList73 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList73, reservationArray72);
        guest67.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        guest55.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList73);
        java.util.List<main.models.Reservation> reservationList78 = guest42.getReservations();
        guest30.setReservations(reservationList78);
        guest7.setReservations(reservationList78);
        guest7.setUserId("");
        boolean boolean83 = guest7.isPasswordStrong();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(approvalRequestArray16);
        org.junit.Assert.assertArrayEquals(approvalRequestArray16, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertNotNull(approvalRequestList32);
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNull(accountStatus56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(accountStatus68);
        org.junit.Assert.assertNotNull(reservationList71);
        org.junit.Assert.assertNotNull(reservationArray72);
        org.junit.Assert.assertArrayEquals(reservationArray72, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(reservationList78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        guest7.setEmail("");
        main.models.Payment[] paymentArray16 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList17 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList17, paymentArray16);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList17);
        java.lang.String str20 = guest7.getEmail();
        boolean boolean21 = guest7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList22 = null;
        guest7.setApprovalRequests(approvalRequestList22);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray16);
        org.junit.Assert.assertArrayEquals(paymentArray16, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        guest7.setIdOrCertificationNumber("");
        boolean boolean22 = guest7.isPasswordStrong();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        guest7.setEmail("");
        main.models.Payment[] paymentArray16 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList17 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList17, paymentArray16);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList17);
        java.lang.String str20 = guest7.getIdOrCertificationNumber();
        guest7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray16);
        org.junit.Assert.assertArrayEquals(paymentArray16, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "hi!", "hi!", "hi!", "hi!", "hi!", accountStatus6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.util.List<main.models.Reservation> reservationList10 = guest7.getReservations();
        guest7.setDepartment("hi!");
        double double13 = guest7.getHourlyRate();
        guest7.setEmail("");
        main.models.Payment[] paymentArray16 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList17 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList17, paymentArray16);
        guest7.setPayments((java.util.List<main.models.Payment>) paymentList17);
        java.lang.String str20 = guest7.getIdOrCertificationNumber();
        guest7.setName("hi!");
        guest7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(paymentArray16);
        org.junit.Assert.assertArrayEquals(paymentArray16, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getUserId();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getName();
        boolean boolean21 = guest7.isPasswordStrong();
        boolean boolean22 = guest7.isPasswordStrong();
        main.models.Reservation reservation23 = null;
        guest7.addReservation(reservation23);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = faculty7.getPayments();
        double double9 = faculty7.getHourlyRate();
        faculty7.setName("");
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = null;
        guest7.setStatus(accountStatus8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.Class<?> wildcardClass8 = guest7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setName("");
        double double19 = guest7.getHourlyRate();
        guest7.setDepartment("hi!");
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        java.lang.String str9 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Reservation reservation9 = null;
        guest7.addReservation(reservation9);
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("hi!", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = researcher7.getReservations();
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus9 = null;
        faculty7.setStatus(accountStatus9);
        faculty7.setPassword("");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus6);
        boolean boolean8 = guest7.isUniversityAffiliated();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "hi!", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus14);
        main.enums.AccountStatus accountStatus22 = null;
        main.models.Guest guest23 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus22);
        main.enums.AccountStatus accountStatus24 = guest23.getStatus();
        main.models.Payment payment25 = null;
        guest23.addPayment(payment25);
        java.util.List<main.models.Reservation> reservationList27 = guest23.getReservations();
        main.models.Reservation[] reservationArray28 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList29 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList29, reservationArray28);
        guest23.setReservations((java.util.List<main.models.Reservation>) reservationList29);
        java.lang.String str32 = guest23.getUserId();
        main.enums.AccountStatus accountStatus39 = null;
        main.models.Guest guest40 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus39);
        main.enums.AccountStatus accountStatus41 = guest40.getStatus();
        main.models.Payment payment42 = null;
        guest40.addPayment(payment42);
        java.lang.String str44 = guest40.getUserId();
        main.enums.AccountStatus accountStatus51 = null;
        main.models.Guest guest52 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus51);
        main.enums.AccountStatus accountStatus53 = guest52.getStatus();
        main.models.Payment payment54 = null;
        guest52.addPayment(payment54);
        java.util.List<main.models.Reservation> reservationList56 = guest52.getReservations();
        main.models.Reservation[] reservationArray57 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList58 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList58, reservationArray57);
        guest52.setReservations((java.util.List<main.models.Reservation>) reservationList58);
        guest40.setReservations((java.util.List<main.models.Reservation>) reservationList58);
        guest23.setReservations((java.util.List<main.models.Reservation>) reservationList58);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList58);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList58);
        org.junit.Assert.assertNull(accountStatus24);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNotNull(reservationArray28);
        org.junit.Assert.assertArrayEquals(reservationArray28, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(accountStatus41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(accountStatus53);
        org.junit.Assert.assertNotNull(reservationList56);
        org.junit.Assert.assertNotNull(reservationArray57);
        org.junit.Assert.assertArrayEquals(reservationArray57, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Guest guest15 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus14);
        main.enums.AccountStatus accountStatus16 = guest15.getStatus();
        main.models.Payment payment17 = null;
        guest15.addPayment(payment17);
        java.util.List<main.models.Reservation> reservationList19 = guest15.getReservations();
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.lang.String str24 = guest15.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.lang.String str36 = guest32.getUserId();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.Guest guest44 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus43);
        main.enums.AccountStatus accountStatus45 = guest44.getStatus();
        main.models.Payment payment46 = null;
        guest44.addPayment(payment46);
        java.util.List<main.models.Reservation> reservationList48 = guest44.getReservations();
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        guest44.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest15.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList50);
        guest7.setDepartment("hi!");
        guest7.setEmail("");
        boolean boolean60 = guest7.isUniversityAffiliated();
        org.junit.Assert.assertNull(accountStatus16);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(reservationArray20);
        org.junit.Assert.assertArrayEquals(reservationArray20, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(accountStatus45);
        org.junit.Assert.assertNotNull(reservationList48);
        org.junit.Assert.assertNotNull(reservationArray49);
        org.junit.Assert.assertArrayEquals(reservationArray49, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Faculty faculty17 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus16);
        java.util.List<main.models.Payment> paymentList18 = faculty17.getPayments();
        faculty7.setPayments(paymentList18);
        boolean boolean20 = faculty7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.Guest guest28 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus27);
        main.enums.AccountStatus accountStatus29 = guest28.getStatus();
        main.models.Payment payment30 = null;
        guest28.addPayment(payment30);
        guest28.setUserId("hi!");
        guest28.setDepartment("");
        java.lang.String str36 = guest28.getEmail();
        main.models.ApprovalRequest[] approvalRequestArray37 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList38 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList38, approvalRequestArray37);
        guest28.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList38);
        java.util.List<main.models.Reservation> reservationList41 = guest28.getReservations();
        double double42 = guest28.getHourlyRate();
        main.enums.AccountStatus accountStatus49 = null;
        main.models.Researcher researcher50 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus49);
        java.lang.String str51 = researcher50.getUserId();
        double double52 = researcher50.getHourlyRate();
        java.lang.String str53 = researcher50.getPassword();
        main.enums.AccountStatus accountStatus60 = null;
        main.models.Guest guest61 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus60);
        main.enums.AccountStatus accountStatus62 = guest61.getStatus();
        main.models.Payment payment63 = null;
        guest61.addPayment(payment63);
        java.util.List<main.models.Reservation> reservationList65 = guest61.getReservations();
        main.models.Reservation[] reservationArray66 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList67 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList67, reservationArray66);
        guest61.setReservations((java.util.List<main.models.Reservation>) reservationList67);
        researcher50.setReservations((java.util.List<main.models.Reservation>) reservationList67);
        guest28.setReservations((java.util.List<main.models.Reservation>) reservationList67);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList67);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(accountStatus29);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(approvalRequestArray37);
        org.junit.Assert.assertArrayEquals(approvalRequestArray37, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(reservationList41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 30.0d + "'", double42 == 30.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(accountStatus62);
        org.junit.Assert.assertNotNull(reservationList65);
        org.junit.Assert.assertNotNull(reservationArray66);
        org.junit.Assert.assertArrayEquals(reservationArray66, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        java.lang.String str10 = faculty7.getName();
        java.lang.String str11 = faculty7.getDepartment();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        guest7.setDepartment("hi!");
        java.lang.String str10 = guest7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = guest7.getApprovalRequests();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        double double12 = guest7.getHourlyRate();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.models.ApprovalRequest approvalRequest25 = null;
        guest20.addApprovalRequest(approvalRequest25);
        main.enums.AccountStatus accountStatus33 = null;
        main.models.Faculty faculty34 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus33);
        double double35 = faculty34.getHourlyRate();
        double double36 = faculty34.getHourlyRate();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.Faculty faculty44 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus43);
        java.util.List<main.models.Payment> paymentList45 = faculty44.getPayments();
        faculty34.setPayments(paymentList45);
        guest20.setPayments(paymentList45);
        guest7.setPayments(paymentList45);
        java.lang.String str49 = guest7.getUserId();
        boolean boolean50 = guest7.isUniversityAffiliated();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 15.0d + "'", double35 == 15.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 15.0d + "'", double36 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "", "", "hi!", accountStatus6);
        guest7.setDepartment("");
        guest7.setName("");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        guest7.setEmail("");
        boolean boolean10 = guest7.isUniversityAffiliated();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        java.lang.String str10 = faculty7.getName();
        double double11 = faculty7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 15.0d + "'", double11 == 15.0d);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        double double20 = guest7.getHourlyRate();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        double double10 = researcher7.getHourlyRate();
        researcher7.setUserId("");
        researcher7.setDepartment("");
        researcher7.setPassword("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        double double10 = researcher7.getHourlyRate();
        java.lang.String str11 = researcher7.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        java.lang.String str19 = guest7.getName();
        main.models.Reservation reservation20 = null;
        guest7.addReservation(reservation20);
        java.util.List<main.models.ApprovalRequest> approvalRequestList22 = guest7.getApprovalRequests();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList16 = guest7.getReservations();
        main.enums.AccountStatus accountStatus17 = guest7.getStatus();
        guest7.setPassword("hi!");
        java.lang.String str20 = guest7.getIdOrCertificationNumber();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(accountStatus17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        java.lang.String str9 = researcher7.getName();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.util.List<main.models.ApprovalRequest> approvalRequestList12 = researcher7.getApprovalRequests();
        researcher7.setPassword("hi!");
        researcher7.setName("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList12);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getName();
        main.models.Reservation reservation21 = null;
        guest7.addReservation(reservation21);
        guest7.setUserId("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        researcher7.setUserId("hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = researcher7.getApprovalRequests();
        main.models.ApprovalRequest[] approvalRequestArray10 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList11 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList11, approvalRequestArray10);
        researcher7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList11);
        main.enums.AccountStatus accountStatus20 = null;
        main.models.Guest guest21 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus20);
        main.enums.AccountStatus accountStatus22 = guest21.getStatus();
        main.models.Payment payment23 = null;
        guest21.addPayment(payment23);
        java.util.List<main.models.Reservation> reservationList25 = guest21.getReservations();
        main.models.Reservation[] reservationArray26 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList27 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList27, reservationArray26);
        guest21.setReservations((java.util.List<main.models.Reservation>) reservationList27);
        researcher7.setReservations((java.util.List<main.models.Reservation>) reservationList27);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(approvalRequestArray10);
        org.junit.Assert.assertArrayEquals(approvalRequestArray10, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(accountStatus22);
        org.junit.Assert.assertNotNull(reservationList25);
        org.junit.Assert.assertNotNull(reservationArray26);
        org.junit.Assert.assertArrayEquals(reservationArray26, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = faculty7.getStatus();
        faculty7.setDepartment("");
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        guest7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest22 = null;
        guest7.addApprovalRequest(approvalRequest22);
        guest7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = null;
        researcher7.setStatus(accountStatus8);
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = researcher7.getApprovalRequests();
        org.junit.Assert.assertNotNull(approvalRequestList10);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        double double8 = researcher7.getHourlyRate();
        java.lang.String str9 = researcher7.getUserId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("hi!", "", "", "", "", "", accountStatus6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.Guest guest20 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus19);
        main.enums.AccountStatus accountStatus21 = guest20.getStatus();
        main.models.Payment payment22 = null;
        guest20.addPayment(payment22);
        java.lang.String str24 = guest20.getUserId();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.Guest guest32 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus31);
        main.enums.AccountStatus accountStatus33 = guest32.getStatus();
        main.models.Payment payment34 = null;
        guest32.addPayment(payment34);
        java.util.List<main.models.Reservation> reservationList36 = guest32.getReservations();
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        guest32.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest20.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList38);
        java.lang.String str43 = guest7.getPassword();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNull(accountStatus21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationArray37);
        org.junit.Assert.assertArrayEquals(reservationArray37, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        double double9 = researcher7.getHourlyRate();
        double double10 = researcher7.getHourlyRate();
        double double11 = researcher7.getHourlyRate();
        java.lang.String str12 = researcher7.getPassword();
        boolean boolean13 = researcher7.isUniversityAffiliated();
        main.models.Payment payment14 = null;
        researcher7.addPayment(payment14);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "", "", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.Faculty faculty15 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus14);
        double double16 = faculty15.getHourlyRate();
        double double17 = faculty15.getHourlyRate();
        main.enums.AccountStatus accountStatus24 = null;
        main.models.Faculty faculty25 = new main.models.Faculty("hi!", "", "", "hi!", "hi!", "", accountStatus24);
        java.util.List<main.models.Payment> paymentList26 = faculty25.getPayments();
        faculty15.setPayments(paymentList26);
        researcher7.setPayments(paymentList26);
        java.util.List<main.models.ApprovalRequest> approvalRequestList29 = researcher7.getApprovalRequests();
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 15.0d + "'", double17 == 15.0d);
        org.junit.Assert.assertNotNull(paymentList26);
        org.junit.Assert.assertNotNull(approvalRequestList29);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "hi!", "hi!", "", accountStatus6);
        guest7.setEmail("");
        guest7.setUserId("hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.lang.String str16 = guest7.getUserId();
        guest7.setIdOrCertificationNumber("");
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getName();
        main.models.Reservation reservation21 = null;
        guest7.addReservation(reservation21);
        boolean boolean23 = guest7.isUniversityAffiliated();
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        faculty7.setDepartment("");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        java.lang.String str8 = guest7.getDepartment();
        main.enums.AccountStatus accountStatus9 = null;
        guest7.setStatus(accountStatus9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Faculty faculty7 = new main.models.Faculty("", "", "hi!", "", "hi!", "", accountStatus6);
        double double8 = faculty7.getHourlyRate();
        double double9 = faculty7.getHourlyRate();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.Guest guest17 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus16);
        main.enums.AccountStatus accountStatus18 = guest17.getStatus();
        main.models.Payment payment19 = null;
        guest17.addPayment(payment19);
        guest17.setUserId("hi!");
        main.enums.AccountStatus accountStatus29 = null;
        main.models.Guest guest30 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus29);
        main.enums.AccountStatus accountStatus31 = guest30.getStatus();
        main.models.Payment payment32 = null;
        guest30.addPayment(payment32);
        java.lang.String str34 = guest30.getUserId();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.Guest guest42 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus41);
        main.enums.AccountStatus accountStatus43 = guest42.getStatus();
        main.models.Payment payment44 = null;
        guest42.addPayment(payment44);
        java.util.List<main.models.Reservation> reservationList46 = guest42.getReservations();
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        guest42.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest30.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        guest17.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        faculty7.setReservations((java.util.List<main.models.Reservation>) reservationList48);
        double double54 = faculty7.getHourlyRate();
        java.lang.String str55 = faculty7.getUserId();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 15.0d + "'", double8 == 15.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 15.0d + "'", double9 == 15.0d);
        org.junit.Assert.assertNull(accountStatus18);
        org.junit.Assert.assertNull(accountStatus31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(accountStatus43);
        org.junit.Assert.assertNotNull(reservationList46);
        org.junit.Assert.assertNotNull(reservationArray47);
        org.junit.Assert.assertArrayEquals(reservationArray47, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 15.0d + "'", double54 == 15.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        java.util.List<main.models.Reservation> reservationList11 = guest7.getReservations();
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        guest7.setReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList16 = guest7.getReservations();
        main.models.ApprovalRequest approvalRequest17 = null;
        guest7.addApprovalRequest(approvalRequest17);
        guest7.setPassword("hi!");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(reservationArray12);
        org.junit.Assert.assertArrayEquals(reservationArray12, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        java.lang.String str9 = researcher7.getName();
        main.models.ApprovalRequest approvalRequest10 = null;
        researcher7.addApprovalRequest(approvalRequest10);
        java.util.List<main.models.ApprovalRequest> approvalRequestList12 = researcher7.getApprovalRequests();
        java.util.List<main.models.ApprovalRequest> approvalRequestList13 = researcher7.getApprovalRequests();
        java.lang.String str14 = researcher7.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList12);
        org.junit.Assert.assertNotNull(approvalRequestList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Researcher researcher7 = new main.models.Researcher("", "hi!", "hi!", "", "", "hi!", accountStatus6);
        java.lang.String str8 = researcher7.getPassword();
        double double9 = researcher7.getHourlyRate();
        double double10 = researcher7.getHourlyRate();
        double double11 = researcher7.getHourlyRate();
        researcher7.setIdOrCertificationNumber("");
        java.util.List<main.models.Payment> paymentList14 = researcher7.getPayments();
        java.lang.String str15 = researcher7.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = guest7.getStatus();
        main.models.Payment payment9 = null;
        guest7.addPayment(payment9);
        guest7.setUserId("hi!");
        guest7.setDepartment("");
        java.lang.String str15 = guest7.getEmail();
        guest7.setDepartment("");
        java.lang.String str18 = guest7.getName();
        main.models.ApprovalRequest approvalRequest19 = null;
        guest7.addApprovalRequest(approvalRequest19);
        guest7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.Guest guest7 = new main.models.Guest("", "", "", "", "hi!", "hi!", accountStatus6);
        main.models.Payment payment8 = null;
        guest7.addPayment(payment8);
    }
}

