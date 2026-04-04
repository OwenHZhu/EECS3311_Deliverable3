package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HeadLabCoordinatorRandoopTest1 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        java.lang.Class<?> wildcardClass9 = labManager8.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.lang.String str17 = headLabCoordinator7.getDepartment();
        java.lang.Class<?> wildcardClass18 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "1) test0004(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        main.models.ApprovalRequest approvalRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest11);
// flaky "2) test0005(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "3) test0006(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "4) test0007(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
// flaky "1) test0007(RegressionTest0)":         org.junit.Assert.assertNull(paymentList14);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "5) test0008(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setName("");
        main.models.Reservation reservation12 = null;
        headLabCoordinator7.addReservation(reservation12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setDepartment("");
        java.util.List<main.models.ApprovalRequest> approvalRequestList13 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "6) test0010(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList13);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setName("");
        main.models.Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment12);
// flaky "7) test0011(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "2) test0011(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        java.lang.String str17 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "8) test0012(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isPasswordStrong();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "9) test0013(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "3) test0013(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setUserId("hi!");
        main.models.ApprovalRequest approvalRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest13);
// flaky "10) test0015(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.models.ApprovalRequest approvalRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest11);
// flaky "11) test0016(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest10);
// flaky "12) test0018(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        main.models.ApprovalRequest approvalRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest9);
// flaky "13) test0019(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        main.models.Payment payment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        headLabCoordinator22.setName("hi!");
        java.lang.String str25 = headLabCoordinator22.getPassword();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus32);
        java.util.List<main.models.Reservation> reservationList34 = headLabCoordinator33.getReservations();
        headLabCoordinator22.setReservations(reservationList34);
        boolean boolean36 = headLabCoordinator22.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator22.getPayments();
        main.enums.AccountStatus accountStatus44 = null;
        main.models.HeadLabCoordinator headLabCoordinator45 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus44);
        main.models.LabManager labManager46 = headLabCoordinator45.createLabManager();
        double double47 = headLabCoordinator45.getHourlyRate();
        main.models.Payment payment48 = null;
// flaky "14) test0024(RegressionTest0)":         headLabCoordinator45.addPayment(payment48);
        java.lang.String str50 = headLabCoordinator45.getEmail();
        java.util.List<main.models.Payment> paymentList51 = headLabCoordinator45.getPayments();
        headLabCoordinator22.setPayments(paymentList51);
        headLabCoordinator7.setPayments(paymentList51);
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "4) test0024(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "1) test0024(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
// flaky "1) test0024(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNotNull(headLabCoordinator45);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
// flaky "1) test0024(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList51);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "15) test0025(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        java.lang.String str15 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "5) test0025(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "16) test0026(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        java.lang.String str14 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
// flaky "6) test0026(RegressionTest0)":         headLabCoordinator22.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator22.getName();
        java.lang.String str28 = headLabCoordinator22.getName();
        headLabCoordinator22.setPassword("hi!");
        java.lang.String str31 = headLabCoordinator22.getName();
        main.enums.AccountStatus accountStatus38 = null;
        main.models.HeadLabCoordinator headLabCoordinator39 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus38);
        main.models.LabManager labManager40 = headLabCoordinator39.createLabManager();
        double double41 = headLabCoordinator39.getHourlyRate();
        main.models.Payment payment42 = null;
// flaky "2) test0026(RegressionTest0)":         headLabCoordinator39.addPayment(payment42);
        java.lang.String str44 = headLabCoordinator39.getName();
        java.lang.String str45 = headLabCoordinator39.getName();
        main.models.ApprovalRequest[] approvalRequestArray46 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList47 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList47, approvalRequestArray46);
        headLabCoordinator39.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator22.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        java.lang.Class<?> wildcardClass52 = approvalRequestList47.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "2) test0026(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator39);
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray46);
        org.junit.Assert.assertArrayEquals(approvalRequestArray46, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "17) test0027(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
// flaky "7) test0027(RegressionTest0)":         headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        main.models.Payment payment20 = null;
// flaky "3) test0027(RegressionTest0)":         headLabCoordinator7.addPayment(payment20);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        java.lang.String str24 = headLabCoordinator7.getDepartment();
        java.lang.String str25 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
// flaky "18) test0028(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "8) test0028(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky "4) test0028(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setUserId("");
        main.models.Payment payment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        main.models.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "19) test0031(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "20) test0032(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        java.lang.String str20 = headLabCoordinator7.getName();
        main.models.Payment payment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "9) test0032(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        java.lang.Class<?> wildcardClass17 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
// flaky "21) test0034(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest16 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest16);
        main.models.Payment payment18 = null;
// flaky "22) test0037(RegressionTest0)":         headLabCoordinator7.addPayment(payment18);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "10) test0037(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "5) test0037(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setUserId("");
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
// flaky "23) test0038(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        double double10 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setDepartment("");
        main.models.ApprovalRequest approvalRequest12 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "24) test0041(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        java.lang.String str14 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
// flaky "11) test0041(RegressionTest0)":         headLabCoordinator22.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator22.getName();
        java.lang.String str28 = headLabCoordinator22.getName();
        headLabCoordinator22.setPassword("hi!");
        java.lang.String str31 = headLabCoordinator22.getName();
        main.enums.AccountStatus accountStatus38 = null;
        main.models.HeadLabCoordinator headLabCoordinator39 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus38);
        main.models.LabManager labManager40 = headLabCoordinator39.createLabManager();
        double double41 = headLabCoordinator39.getHourlyRate();
        main.models.Payment payment42 = null;
// flaky "6) test0041(RegressionTest0)":         headLabCoordinator39.addPayment(payment42);
        java.lang.String str44 = headLabCoordinator39.getName();
        java.lang.String str45 = headLabCoordinator39.getName();
        main.models.ApprovalRequest[] approvalRequestArray46 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList47 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList47, approvalRequestArray46);
        headLabCoordinator39.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator22.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        main.models.ApprovalRequest[] approvalRequestArray52 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList53 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList53, approvalRequestArray52);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList53);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "3) test0041(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(accountStatus13);
// flaky "2) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
// flaky "1) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
// flaky "1) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky "1) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator39);
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
// flaky "1) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
// flaky "1) test0041(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray46);
        org.junit.Assert.assertArrayEquals(approvalRequestArray46, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(approvalRequestArray52);
        org.junit.Assert.assertArrayEquals(approvalRequestArray52, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus18);
        boolean boolean20 = headLabCoordinator19.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus27);
        main.models.LabManager labManager29 = headLabCoordinator28.createLabManager();
        double double30 = headLabCoordinator28.getHourlyRate();
        main.models.Payment payment31 = null;
// flaky "25) test0042(RegressionTest0)":         headLabCoordinator28.addPayment(payment31);
        java.lang.String str33 = headLabCoordinator28.getEmail();
        java.util.List<main.models.Payment> paymentList34 = headLabCoordinator28.getPayments();
        headLabCoordinator19.setPayments(paymentList34);
        headLabCoordinator7.setPayments(paymentList34);
        java.lang.String str37 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
// flaky "12) test0042(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.lang.String str15 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "26) test0043(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
// flaky "13) test0043(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        double double8 = headLabCoordinator7.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str10 = headLabCoordinator7.getEmail();
        java.lang.String str11 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        main.models.Payment payment10 = null;
// flaky "27) test0046(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setPassword("hi!");
        main.models.Payment payment14 = null;
// flaky "14) test0046(RegressionTest0)":         headLabCoordinator7.addPayment(payment14);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setName("hi!");
        java.lang.String str14 = headLabCoordinator7.getPassword();
        main.models.ApprovalRequest approvalRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest15);
// flaky "28) test0047(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "29) test0048(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "30) test0049(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.Payment> paymentList18 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass19 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "15) test0049(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "", "", "", accountStatus6);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "31) test0051(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setUserId("");
        java.util.List<main.models.ApprovalRequest> approvalRequestList19 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "16) test0051(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "7) test0051(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList19);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        main.models.Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "32) test0052(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation12 = null;
        headLabCoordinator7.addReservation(reservation12);
        java.lang.String str14 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "33) test0053(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
// flaky "17) test0053(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNull(paymentList10);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "34) test0055(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        headLabCoordinator24.setEmail("");
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus33);
        java.lang.String str35 = headLabCoordinator34.getName();
        main.models.Payment[] paymentArray36 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList37 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList37, paymentArray36);
        headLabCoordinator34.setPayments((java.util.List<main.models.Payment>) paymentList37);
        headLabCoordinator24.setPayments((java.util.List<main.models.Payment>) paymentList37);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList37);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(paymentArray36);
        org.junit.Assert.assertArrayEquals(paymentArray36, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        headLabCoordinator7.setUserId("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        java.lang.String str15 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        main.models.Payment payment11 = null;
// flaky "35) test0057(RegressionTest0)":         headLabCoordinator7.addPayment(payment11);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        java.lang.Class<?> wildcardClass8 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "36) test0059(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        main.models.Reservation reservation15 = null;
        headLabCoordinator7.addReservation(reservation15);
        double double17 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "18) test0059(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "37) test0060(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "19) test0060(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        boolean boolean14 = headLabCoordinator7.isPasswordStrong();
        main.models.Payment payment15 = null;
// flaky "38) test0061(RegressionTest0)":         headLabCoordinator7.addPayment(payment15);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setUserId("");
        java.lang.String str15 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        main.models.ApprovalRequest approvalRequest23 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest23);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "20) test0063(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.Payment payment12 = null;
// flaky "39) test0064(RegressionTest0)":         headLabCoordinator7.addPayment(payment12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "21) test0064(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus15);
        boolean boolean17 = headLabCoordinator16.isUniversityAffiliated();
        headLabCoordinator16.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray20 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList21 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList21, approvalRequestArray20);
        headLabCoordinator16.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList21);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList21);
        java.lang.String str25 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray20);
        org.junit.Assert.assertArrayEquals(approvalRequestArray20, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "40) test0067(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
// flaky "41) test0068(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setUserId("");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "42) test0069(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        main.enums.AccountStatus accountStatus13 = null;
        headLabCoordinator7.setStatus(accountStatus13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        java.lang.Class<?> wildcardClass16 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "43) test0070(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "hi!", "", "hi!", "hi!", accountStatus6);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setPassword("");
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        double double15 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(reservationList11);
// flaky "44) test0072(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.ApprovalRequest> approvalRequestList12 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "45) test0073(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "22) test0073(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setName("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(accountStatus12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass9 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        headLabCoordinator22.setName("hi!");
        java.lang.String str25 = headLabCoordinator22.getPassword();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus32);
        java.util.List<main.models.Reservation> reservationList34 = headLabCoordinator33.getReservations();
        headLabCoordinator22.setReservations(reservationList34);
        boolean boolean36 = headLabCoordinator22.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator22.getPayments();
        main.enums.AccountStatus accountStatus44 = null;
        main.models.HeadLabCoordinator headLabCoordinator45 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus44);
        main.models.LabManager labManager46 = headLabCoordinator45.createLabManager();
        double double47 = headLabCoordinator45.getHourlyRate();
        main.models.Payment payment48 = null;
        headLabCoordinator45.addPayment(payment48);
        java.lang.String str50 = headLabCoordinator45.getEmail();
        java.util.List<main.models.Payment> paymentList51 = headLabCoordinator45.getPayments();
        headLabCoordinator22.setPayments(paymentList51);
        headLabCoordinator7.setPayments(paymentList51);
        java.lang.String str54 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus55 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
// flaky "46) test0076(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertNotNull(reservationList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNotNull(headLabCoordinator45);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(paymentList51);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(accountStatus55);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getPassword();
        main.models.ApprovalRequest approvalRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest12);
// flaky "47) test0077(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList16 = headLabCoordinator7.getApprovalRequests();
        java.lang.Class<?> wildcardClass17 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky "48) test0078(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        java.lang.String str9 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        main.models.ApprovalRequest approvalRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest9);
// flaky "49) test0080(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        double double18 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus25);
        main.models.LabManager labManager27 = headLabCoordinator26.createLabManager();
        double double28 = headLabCoordinator26.getHourlyRate();
        main.models.Payment payment29 = null;
        headLabCoordinator26.addPayment(payment29);
        java.lang.String str31 = headLabCoordinator26.getEmail();
        main.models.Reservation reservation32 = null;
        headLabCoordinator26.addReservation(reservation32);
        java.lang.String str34 = headLabCoordinator26.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList35 = headLabCoordinator26.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList35);
        boolean boolean37 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
// flaky "50) test0082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky "23) test0082(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(approvalRequestList35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest15 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest15);
        main.models.ApprovalRequest approvalRequest17 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest17);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest9);
// flaky "51) test0084(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "24) test0084(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        double double18 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        java.lang.Class<?> wildcardClass21 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        boolean boolean15 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean16 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        main.models.LabManager labManager12 = headLabCoordinator7.createLabManager();
        java.lang.String str13 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus19);
        main.models.LabManager labManager21 = headLabCoordinator20.createLabManager();
        double double22 = headLabCoordinator20.getHourlyRate();
        main.models.Payment payment23 = null;
        headLabCoordinator20.addPayment(payment23);
        java.lang.String str25 = headLabCoordinator20.getName();
        java.lang.String str26 = headLabCoordinator20.getName();
        headLabCoordinator20.setPassword("hi!");
        java.lang.String str29 = headLabCoordinator20.getName();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        main.models.ApprovalRequest[] approvalRequestArray44 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList45 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList45, approvalRequestArray44);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator20.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        java.lang.Class<?> wildcardClass50 = approvalRequestList45.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        headLabCoordinator7.setUserId("hi!");
        main.models.Payment payment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment18);
// flaky "52) test0090(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setDepartment("hi!");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(accountStatus13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.models.ApprovalRequest approvalRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "53) test0092(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "25) test0092(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "8) test0092(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(approvalRequestList14);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus25 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(accountStatus25);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setPassword("hi!");
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        headLabCoordinator7.setPayments(paymentList27);
        java.lang.String str29 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList27);
// flaky "54) test0096(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        java.lang.String str15 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "55) test0097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "26) test0097(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        main.models.Payment payment18 = null;
        headLabCoordinator7.addPayment(payment18);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getName();
        main.models.Reservation reservation16 = null;
        headLabCoordinator7.addReservation(reservation16);
        main.models.ApprovalRequest approvalRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getUserId();
        java.util.List<main.models.Reservation> reservationList15 = headLabCoordinator7.getReservations();
        java.util.List<main.models.ApprovalRequest> approvalRequestList16 = headLabCoordinator7.getApprovalRequests();
        boolean boolean17 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
// flaky "56) test0100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "27) test0100(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(reservationList15);
// flaky "9) test0100(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getName();
        java.lang.String str16 = headLabCoordinator7.getUserId();
        main.models.ApprovalRequest approvalRequest17 = null;
// flaky "57) test0101(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest17);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky "28) test0101(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus16);
        headLabCoordinator17.setEmail("");
        main.enums.AccountStatus accountStatus26 = null;
        main.models.HeadLabCoordinator headLabCoordinator27 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus26);
        java.lang.String str28 = headLabCoordinator27.getName();
        main.models.Payment[] paymentArray29 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList30 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList30, paymentArray29);
        headLabCoordinator27.setPayments((java.util.List<main.models.Payment>) paymentList30);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList30);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList30);
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(headLabCoordinator27);
// flaky "58) test0102(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(paymentArray29);
        org.junit.Assert.assertArrayEquals(paymentArray29, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "59) test0103(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList10);
// flaky "29) test0103(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Reservation reservation9 = null;
        headLabCoordinator7.addReservation(reservation9);
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = headLabCoordinator7.getApprovalRequests();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.lang.String str10 = headLabCoordinator7.getPassword();
        boolean boolean11 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        headLabCoordinator24.setEmail("");
        main.models.Reservation reservation27 = null;
        headLabCoordinator24.addReservation(reservation27);
        main.enums.AccountStatus accountStatus29 = null;
        headLabCoordinator24.setStatus(accountStatus29);
        main.enums.AccountStatus accountStatus31 = null;
        headLabCoordinator24.setStatus(accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator24.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList34 = headLabCoordinator24.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList34);
        java.lang.String str36 = headLabCoordinator7.getName();
        main.models.Payment payment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment37);
// flaky "60) test0107(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "30) test0107(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNull(approvalRequestList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus17 = null;
        headLabCoordinator7.setStatus(accountStatus17);
        main.models.ApprovalRequest approvalRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        headLabCoordinator7.setUserId("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str20 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus27);
        java.lang.String str29 = headLabCoordinator28.getName();
        main.models.Payment[] paymentArray30 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList31 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList31, paymentArray30);
        headLabCoordinator28.setPayments((java.util.List<main.models.Payment>) paymentList31);
        java.lang.String str34 = headLabCoordinator28.getUserId();
        boolean boolean35 = headLabCoordinator28.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus36 = null;
        headLabCoordinator28.setStatus(accountStatus36);
        java.lang.String str38 = headLabCoordinator28.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus45 = null;
        main.models.HeadLabCoordinator headLabCoordinator46 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus45);
        headLabCoordinator46.setEmail("");
        main.enums.AccountStatus accountStatus55 = null;
        main.models.HeadLabCoordinator headLabCoordinator56 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus55);
        java.lang.String str57 = headLabCoordinator56.getName();
        main.models.Payment[] paymentArray58 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList59 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList59, paymentArray58);
        headLabCoordinator56.setPayments((java.util.List<main.models.Payment>) paymentList59);
        headLabCoordinator46.setPayments((java.util.List<main.models.Payment>) paymentList59);
        headLabCoordinator28.setPayments((java.util.List<main.models.Payment>) paymentList59);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList59);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(paymentArray30);
        org.junit.Assert.assertArrayEquals(paymentArray30, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertNotNull(headLabCoordinator56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(paymentArray58);
        org.junit.Assert.assertArrayEquals(paymentArray58, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus22);
        boolean boolean24 = headLabCoordinator23.isUniversityAffiliated();
        headLabCoordinator23.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray27 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList28 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList28, approvalRequestArray27);
        headLabCoordinator23.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList28);
        java.lang.String str32 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray27);
        org.junit.Assert.assertArrayEquals(approvalRequestArray27, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "61) test0111(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "62) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "31) test0112(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus24);
        boolean boolean26 = headLabCoordinator25.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus33);
        main.models.LabManager labManager35 = headLabCoordinator34.createLabManager();
        double double36 = headLabCoordinator34.getHourlyRate();
        main.models.Payment payment37 = null;
        headLabCoordinator34.addPayment(payment37);
        java.lang.String str39 = headLabCoordinator34.getEmail();
        java.util.List<main.models.Payment> paymentList40 = headLabCoordinator34.getPayments();
        headLabCoordinator25.setPayments(paymentList40);
        headLabCoordinator7.setPayments(paymentList40);
        headLabCoordinator7.setName("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest47 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest47);
        java.lang.String str49 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "63) test0113(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "32) test0113(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        main.models.LabManager labManager16 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = headLabCoordinator7.getApprovalRequests();
        double double18 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(approvalRequestList17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "hi!", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str15 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "64) test0116(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList14);
// flaky "33) test0116(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        java.util.List<main.models.Payment> paymentList13 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus20 = null;
        main.models.HeadLabCoordinator headLabCoordinator21 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus20);
        main.models.Reservation reservation22 = null;
        headLabCoordinator21.addReservation(reservation22);
        java.util.List<main.models.Reservation> reservationList24 = headLabCoordinator21.getReservations();
        java.util.List<main.models.Payment> paymentList25 = headLabCoordinator21.getPayments();
        headLabCoordinator21.setPassword("hi!");
        headLabCoordinator21.setPassword("");
        headLabCoordinator21.setUserId("hi!");
        double double32 = headLabCoordinator21.getHourlyRate();
        main.enums.AccountStatus accountStatus39 = null;
        main.models.HeadLabCoordinator headLabCoordinator40 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus39);
        main.models.LabManager labManager41 = headLabCoordinator40.createLabManager();
        double double42 = headLabCoordinator40.getHourlyRate();
        main.models.Payment payment43 = null;
        headLabCoordinator40.addPayment(payment43);
        java.lang.String str45 = headLabCoordinator40.getEmail();
        main.models.Reservation reservation46 = null;
        headLabCoordinator40.addReservation(reservation46);
        java.lang.String str48 = headLabCoordinator40.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList49 = headLabCoordinator40.getApprovalRequests();
        headLabCoordinator21.setApprovalRequests(approvalRequestList49);
        headLabCoordinator7.setApprovalRequests(approvalRequestList49);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "65) test0117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(headLabCoordinator21);
        org.junit.Assert.assertNotNull(reservationList24);
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
// flaky "34) test0117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
// flaky "10) test0117(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
// flaky "4) test0117(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList49);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus18);
        java.lang.String str20 = headLabCoordinator19.getEmail();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus27);
        java.util.List<main.models.Reservation> reservationList29 = headLabCoordinator28.getReservations();
        headLabCoordinator19.setReservations(reservationList29);
        headLabCoordinator7.setReservations(reservationList29);
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray11 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList12 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList12, approvalRequestArray11);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList12);
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        main.models.LabManager labManager24 = headLabCoordinator22.createLabManager();
        java.lang.String str25 = headLabCoordinator22.getUserId();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus32);
        boolean boolean34 = headLabCoordinator33.isUniversityAffiliated();
        headLabCoordinator33.setIdOrCertificationNumber("");
        main.models.Payment payment37 = null;
        headLabCoordinator33.addPayment(payment37);
        java.util.List<main.models.Payment> paymentList39 = headLabCoordinator33.getPayments();
        headLabCoordinator22.setPayments(paymentList39);
        headLabCoordinator7.setPayments(paymentList39);
        java.lang.Class<?> wildcardClass42 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray11);
        org.junit.Assert.assertArrayEquals(approvalRequestArray11, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertNotNull(labManager24);
// flaky "66) test0119(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(paymentList39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str21 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus28 = null;
        main.models.HeadLabCoordinator headLabCoordinator29 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus28);
        main.models.Reservation reservation30 = null;
        headLabCoordinator29.addReservation(reservation30);
        java.util.List<main.models.Reservation> reservationList32 = headLabCoordinator29.getReservations();
        java.util.List<main.models.Payment> paymentList33 = headLabCoordinator29.getPayments();
        headLabCoordinator29.setPassword("hi!");
        headLabCoordinator29.setPassword("");
        headLabCoordinator29.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList40 = null;
        headLabCoordinator29.setApprovalRequests(approvalRequestList40);
        java.util.List<main.models.Payment> paymentList42 = headLabCoordinator29.getPayments();
        headLabCoordinator7.setPayments(paymentList42);
        main.enums.AccountStatus accountStatus50 = null;
        main.models.HeadLabCoordinator headLabCoordinator51 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus50);
        main.models.LabManager labManager52 = headLabCoordinator51.createLabManager();
        double double53 = headLabCoordinator51.getHourlyRate();
        main.models.Payment payment54 = null;
        headLabCoordinator51.addPayment(payment54);
        java.lang.String str56 = headLabCoordinator51.getName();
        java.lang.String str57 = headLabCoordinator51.getName();
        headLabCoordinator51.setPassword("hi!");
        java.lang.String str60 = headLabCoordinator51.getName();
        main.models.Payment payment61 = null;
        headLabCoordinator51.addPayment(payment61);
        boolean boolean63 = headLabCoordinator51.isPasswordStrong();
        boolean boolean64 = headLabCoordinator51.isUniversityAffiliated();
        java.lang.String str65 = headLabCoordinator51.getPassword();
        main.enums.AccountStatus accountStatus72 = null;
        main.models.HeadLabCoordinator headLabCoordinator73 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus72);
        main.models.Reservation reservation74 = null;
        headLabCoordinator73.addReservation(reservation74);
        java.util.List<main.models.Reservation> reservationList76 = headLabCoordinator73.getReservations();
        java.util.List<main.models.Payment> paymentList77 = headLabCoordinator73.getPayments();
        headLabCoordinator73.setPassword("hi!");
        headLabCoordinator73.setPassword("");
        headLabCoordinator73.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList84 = null;
        headLabCoordinator73.setApprovalRequests(approvalRequestList84);
        java.util.List<main.models.Payment> paymentList86 = headLabCoordinator73.getPayments();
        headLabCoordinator51.setPayments(paymentList86);
        headLabCoordinator7.setPayments(paymentList86);
        java.lang.Class<?> wildcardClass89 = paymentList86.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "67) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "35) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "11) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator29);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
// flaky "5) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky "3) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
// flaky "2) test0120(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator73);
        org.junit.Assert.assertNotNull(reservationList76);
        org.junit.Assert.assertNotNull(paymentList77);
        org.junit.Assert.assertNotNull(paymentList86);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        main.models.LabManager labManager21 = headLabCoordinator7.createLabManager();
        boolean boolean22 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.Class<?> wildcardClass23 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        main.models.Reservation reservation22 = null;
        headLabCoordinator16.addReservation(reservation22);
        java.lang.String str24 = headLabCoordinator16.getEmail();
        headLabCoordinator16.setName("hi!");
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator16.getPayments();
        java.util.List<main.models.Payment> paymentList28 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList28);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNotNull(paymentList28);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setPassword("hi!");
        main.models.Payment payment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment14);
// flaky "68) test0123(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setUserId("");
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus19);
        main.models.LabManager labManager21 = headLabCoordinator20.createLabManager();
        double double22 = headLabCoordinator20.getHourlyRate();
        main.models.Payment payment23 = null;
        headLabCoordinator20.addPayment(payment23);
        java.lang.String str25 = headLabCoordinator20.getName();
        java.lang.String str26 = headLabCoordinator20.getName();
        headLabCoordinator20.setPassword("hi!");
        java.lang.String str29 = headLabCoordinator20.getName();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        main.models.ApprovalRequest[] approvalRequestArray44 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList45 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList45, approvalRequestArray44);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator20.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        main.models.LabManager labManager50 = headLabCoordinator7.createLabManager();
        main.models.ApprovalRequest approvalRequest51 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest51);
        java.lang.Class<?> wildcardClass53 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "69) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky "36) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky "12) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "6) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
// flaky "4) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky "3) test0125(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str18 = headLabCoordinator7.getEmail();
        java.lang.String str19 = headLabCoordinator7.getName();
        main.models.Payment payment20 = null;
        headLabCoordinator7.addPayment(payment20);
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "70) test0127(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        boolean boolean11 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("");
        java.lang.String str18 = headLabCoordinator7.getName();
        main.models.LabManager labManager19 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus20 = null;
        headLabCoordinator7.setStatus(accountStatus20);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        main.models.LabManager labManager10 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(labManager10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean9 = headLabCoordinator7.isUniversityAffiliated();
        main.models.ApprovalRequest approvalRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest10);
// flaky "71) test0131(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest16);
// flaky "72) test0132(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "37) test0132(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getPassword();
        java.util.List<main.models.Payment> paymentList20 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "73) test0133(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(paymentList20);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "74) test0134(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setPassword("hi!");
        main.models.ApprovalRequest approvalRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest15);
// flaky "38) test0134(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean11 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(accountStatus12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "75) test0136(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        main.models.LabManager labManager15 = headLabCoordinator7.createLabManager();
        java.lang.Class<?> wildcardClass16 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky "39) test0136(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(labManager15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "76) test0138(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.LabManager labManager17 = headLabCoordinator7.createLabManager();
        java.lang.String str18 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest19);
// flaky "40) test0138(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setName("hi!");
        java.lang.String str11 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "77) test0139(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        boolean boolean10 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str11 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky "78) test0140(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus9 = null;
        headLabCoordinator7.setStatus(accountStatus9);
        main.enums.AccountStatus accountStatus11 = null;
        headLabCoordinator7.setStatus(accountStatus11);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "79) test0141(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "80) test0142(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus18);
        headLabCoordinator19.setEmail("");
        main.enums.AccountStatus accountStatus28 = null;
        main.models.HeadLabCoordinator headLabCoordinator29 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus28);
        main.models.LabManager labManager30 = headLabCoordinator29.createLabManager();
        headLabCoordinator29.setPassword("");
        main.enums.AccountStatus accountStatus39 = null;
        main.models.HeadLabCoordinator headLabCoordinator40 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus39);
        headLabCoordinator40.setName("hi!");
        java.lang.String str43 = headLabCoordinator40.getPassword();
        main.enums.AccountStatus accountStatus50 = null;
        main.models.HeadLabCoordinator headLabCoordinator51 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus50);
        java.util.List<main.models.Reservation> reservationList52 = headLabCoordinator51.getReservations();
        headLabCoordinator40.setReservations(reservationList52);
        headLabCoordinator29.setReservations(reservationList52);
        headLabCoordinator19.setReservations(reservationList52);
        headLabCoordinator7.setReservations(reservationList52);
        main.models.Reservation reservation57 = null;
        headLabCoordinator7.addReservation(reservation57);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertNotNull(headLabCoordinator29);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertNotNull(reservationList52);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus22);
        headLabCoordinator23.setEmail("");
        main.models.Reservation reservation26 = null;
        headLabCoordinator23.addReservation(reservation26);
        main.enums.AccountStatus accountStatus34 = null;
        main.models.HeadLabCoordinator headLabCoordinator35 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus34);
        boolean boolean36 = headLabCoordinator35.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.HeadLabCoordinator headLabCoordinator44 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus43);
        main.models.LabManager labManager45 = headLabCoordinator44.createLabManager();
        double double46 = headLabCoordinator44.getHourlyRate();
        main.models.Payment payment47 = null;
        headLabCoordinator44.addPayment(payment47);
        java.lang.String str49 = headLabCoordinator44.getEmail();
        java.util.List<main.models.Payment> paymentList50 = headLabCoordinator44.getPayments();
        headLabCoordinator35.setPayments(paymentList50);
        headLabCoordinator23.setPayments(paymentList50);
        headLabCoordinator7.setPayments(paymentList50);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "81) test0144(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator44);
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(paymentList50);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        boolean boolean11 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        headLabCoordinator24.setEmail("");
        main.models.Reservation reservation27 = null;
        headLabCoordinator24.addReservation(reservation27);
        main.enums.AccountStatus accountStatus29 = null;
        headLabCoordinator24.setStatus(accountStatus29);
        main.enums.AccountStatus accountStatus31 = null;
        headLabCoordinator24.setStatus(accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator24.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList34 = headLabCoordinator24.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList34);
        boolean boolean36 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "82) test0146(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNotNull(approvalRequestList34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str18 = headLabCoordinator7.getEmail();
        java.lang.String str19 = headLabCoordinator7.getName();
        java.lang.String str20 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "83) test0147(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        boolean boolean15 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setName("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus15);
        boolean boolean17 = headLabCoordinator16.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator16.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList19 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList19);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "84) test0149(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(paymentList19);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation12 = null;
        headLabCoordinator7.addReservation(reservation12);
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "85) test0150(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Reservation reservation9 = null;
        headLabCoordinator7.addReservation(reservation9);
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.lang.String str10 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setName("hi!");
        java.lang.String str15 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
// flaky "86) test0153(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str21 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus28 = null;
        main.models.HeadLabCoordinator headLabCoordinator29 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus28);
        main.models.Reservation reservation30 = null;
        headLabCoordinator29.addReservation(reservation30);
        java.util.List<main.models.Reservation> reservationList32 = headLabCoordinator29.getReservations();
        java.util.List<main.models.Payment> paymentList33 = headLabCoordinator29.getPayments();
        headLabCoordinator29.setPassword("hi!");
        headLabCoordinator29.setPassword("");
        headLabCoordinator29.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList40 = null;
        headLabCoordinator29.setApprovalRequests(approvalRequestList40);
        java.util.List<main.models.Payment> paymentList42 = headLabCoordinator29.getPayments();
        headLabCoordinator7.setPayments(paymentList42);
        java.lang.Class<?> wildcardClass44 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator29);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        double double11 = headLabCoordinator7.getHourlyRate();
        main.models.Reservation reservation12 = null;
        headLabCoordinator7.addReservation(reservation12);
        double double14 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus15 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(accountStatus15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation47 = null;
        headLabCoordinator7.addReservation(reservation47);
        java.util.List<main.models.ApprovalRequest> approvalRequestList49 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList49);
        headLabCoordinator7.setName("hi!");
        double double53 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus56 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "87) test0156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "41) test0156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "13) test0156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
// flaky "7) test0156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky "5) test0156(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNull(accountStatus56);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("");
        java.lang.Class<?> wildcardClass10 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation47 = null;
        headLabCoordinator7.addReservation(reservation47);
        java.util.List<main.models.ApprovalRequest> approvalRequestList49 = headLabCoordinator7.getApprovalRequests();
        java.lang.Class<?> wildcardClass50 = approvalRequestList49.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(approvalRequestList49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        double double14 = headLabCoordinator7.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
// flaky "88) test0159(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        main.models.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment11);
// flaky "89) test0160(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "42) test0160(RegressionTest0)":         org.junit.Assert.assertNull(paymentList8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        java.util.List<main.models.Payment> paymentList24 = headLabCoordinator7.getPayments();
        java.lang.String str25 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        java.util.List<main.models.Payment> paymentList24 = headLabCoordinator7.getPayments();
        java.lang.String str25 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.Reservation reservation25 = null;
        headLabCoordinator24.addReservation(reservation25);
        java.util.List<main.models.Reservation> reservationList27 = headLabCoordinator24.getReservations();
        headLabCoordinator7.setReservations(reservationList27);
        boolean boolean29 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus29 = null;
        main.models.HeadLabCoordinator headLabCoordinator30 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus29);
        main.models.LabManager labManager31 = headLabCoordinator30.createLabManager();
        double double32 = headLabCoordinator30.getHourlyRate();
        main.models.Payment payment33 = null;
        headLabCoordinator30.addPayment(payment33);
        java.lang.String str35 = headLabCoordinator30.getEmail();
        java.util.List<main.models.Payment> paymentList36 = headLabCoordinator30.getPayments();
        headLabCoordinator7.setPayments(paymentList36);
        java.lang.String str38 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNotNull(headLabCoordinator30);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getPassword();
        main.models.ApprovalRequest approvalRequest12 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest12);
        headLabCoordinator7.setPassword("hi!");
        main.models.ApprovalRequest approvalRequest16 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest16);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "90) test0165(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.HeadLabCoordinator headLabCoordinator15 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus14);
        main.models.LabManager labManager16 = headLabCoordinator15.createLabManager();
        headLabCoordinator15.setPassword("");
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus25);
        headLabCoordinator26.setName("hi!");
        java.lang.String str29 = headLabCoordinator26.getPassword();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus36);
        java.util.List<main.models.Reservation> reservationList38 = headLabCoordinator37.getReservations();
        headLabCoordinator26.setReservations(reservationList38);
        headLabCoordinator15.setReservations(reservationList38);
        headLabCoordinator7.setReservations(reservationList38);
        java.lang.Class<?> wildcardClass42 = reservationList38.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator15);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        boolean boolean11 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("");
        java.lang.String str18 = headLabCoordinator7.getName();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "91) test0168(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
// flaky "43) test0168(RegressionTest0)":         org.junit.Assert.assertNull(paymentList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        headLabCoordinator7.setPayments(paymentList27);
        main.enums.AccountStatus accountStatus29 = null;
        headLabCoordinator7.setStatus(accountStatus29);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "92) test0169(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList27);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        java.lang.Class<?> wildcardClass12 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus25);
        headLabCoordinator26.setEmail("");
        main.enums.AccountStatus accountStatus35 = null;
        main.models.HeadLabCoordinator headLabCoordinator36 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus35);
        java.lang.String str37 = headLabCoordinator36.getName();
        main.models.Payment[] paymentArray38 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList39 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList39, paymentArray38);
        headLabCoordinator36.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator26.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList39);
        boolean boolean44 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertNotNull(headLabCoordinator36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(paymentArray38);
        org.junit.Assert.assertArrayEquals(paymentArray38, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        main.models.ApprovalRequest[] approvalRequestArray14 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList15 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList15, approvalRequestArray14);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList15);
        headLabCoordinator7.setUserId("hi!");
        headLabCoordinator7.setUserId("");
        java.lang.String str22 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray14);
        org.junit.Assert.assertArrayEquals(approvalRequestArray14, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        headLabCoordinator22.setPassword("");
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus32);
        main.models.Reservation reservation34 = null;
        headLabCoordinator33.addReservation(reservation34);
        java.util.List<main.models.Reservation> reservationList36 = headLabCoordinator33.getReservations();
        headLabCoordinator22.setReservations(reservationList36);
        headLabCoordinator7.setReservations(reservationList36);
        main.models.ApprovalRequest approvalRequest39 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest39);
        headLabCoordinator7.setName("");
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertNotNull(reservationList36);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        main.models.Reservation reservation9 = null;
        headLabCoordinator7.addReservation(reservation9);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        headLabCoordinator22.setEmail("");
        main.models.Reservation reservation25 = null;
        headLabCoordinator22.addReservation(reservation25);
        main.enums.AccountStatus accountStatus27 = null;
        headLabCoordinator22.setStatus(accountStatus27);
        main.enums.AccountStatus accountStatus29 = null;
        headLabCoordinator22.setStatus(accountStatus29);
        main.models.LabManager labManager31 = headLabCoordinator22.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList32 = headLabCoordinator22.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList32);
        main.enums.AccountStatus accountStatus34 = null;
        headLabCoordinator7.setStatus(accountStatus34);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertNotNull(approvalRequestList32);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation47 = null;
        headLabCoordinator7.addReservation(reservation47);
        java.util.List<main.models.ApprovalRequest> approvalRequestList49 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList49);
        java.lang.String str51 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "93) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "44) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "14) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
// flaky "8) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky "6) test0176(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        headLabCoordinator7.setReservations(reservationList23);
        main.models.Payment payment25 = null;
        headLabCoordinator7.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator7.getPassword();
        java.lang.String str28 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "94) test0178(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList9);
// flaky "45) test0178(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(reservationList23);
// flaky "15) test0178(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
// flaky "9) test0178(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.Payment> paymentList18 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Payment> paymentList19 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus26 = null;
        main.models.HeadLabCoordinator headLabCoordinator27 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus26);
        main.models.Reservation reservation28 = null;
        headLabCoordinator27.addReservation(reservation28);
        java.util.List<main.models.Reservation> reservationList30 = headLabCoordinator27.getReservations();
        java.util.List<main.models.Payment> paymentList31 = headLabCoordinator27.getPayments();
        headLabCoordinator27.setPassword("hi!");
        headLabCoordinator27.setPassword("");
        headLabCoordinator27.setUserId("hi!");
        double double38 = headLabCoordinator27.getHourlyRate();
        main.enums.AccountStatus accountStatus45 = null;
        main.models.HeadLabCoordinator headLabCoordinator46 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus45);
        main.models.LabManager labManager47 = headLabCoordinator46.createLabManager();
        double double48 = headLabCoordinator46.getHourlyRate();
        main.models.Payment payment49 = null;
        headLabCoordinator46.addPayment(payment49);
        java.lang.String str51 = headLabCoordinator46.getEmail();
        main.models.Reservation reservation52 = null;
        headLabCoordinator46.addReservation(reservation52);
        java.lang.String str54 = headLabCoordinator46.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList55 = headLabCoordinator46.getApprovalRequests();
        headLabCoordinator27.setApprovalRequests(approvalRequestList55);
        main.enums.AccountStatus accountStatus63 = null;
        main.models.HeadLabCoordinator headLabCoordinator64 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus63);
        main.models.LabManager labManager65 = headLabCoordinator64.createLabManager();
        double double66 = headLabCoordinator64.getHourlyRate();
        main.enums.AccountStatus accountStatus73 = null;
        main.models.HeadLabCoordinator headLabCoordinator74 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus73);
        main.models.LabManager labManager75 = headLabCoordinator74.createLabManager();
        headLabCoordinator74.setPassword("");
        main.enums.AccountStatus accountStatus84 = null;
        main.models.HeadLabCoordinator headLabCoordinator85 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus84);
        main.models.Reservation reservation86 = null;
        headLabCoordinator85.addReservation(reservation86);
        java.util.List<main.models.Reservation> reservationList88 = headLabCoordinator85.getReservations();
        headLabCoordinator74.setReservations(reservationList88);
        headLabCoordinator64.setReservations(reservationList88);
        headLabCoordinator27.setReservations(reservationList88);
        headLabCoordinator7.setReservations(reservationList88);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "95) test0179(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "46) test0179(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(paymentList18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(headLabCoordinator27);
        org.junit.Assert.assertNotNull(reservationList30);
        org.junit.Assert.assertNotNull(paymentList31);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
// flaky "16) test0179(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
// flaky "10) test0179(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
// flaky "7) test0179(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList55);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertNotNull(labManager65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator74);
        org.junit.Assert.assertNotNull(labManager75);
        org.junit.Assert.assertNotNull(headLabCoordinator85);
        org.junit.Assert.assertNotNull(reservationList88);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment payment9 = null;
        headLabCoordinator7.addPayment(payment9);
        double double11 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setName("");
        java.lang.String str14 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList15 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str16 = headLabCoordinator7.getName();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
// flaky "96) test0180(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "47) test0180(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setPassword("");
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus17);
        main.models.Reservation reservation19 = null;
        headLabCoordinator18.addReservation(reservation19);
        java.util.List<main.models.Reservation> reservationList21 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList21);
        main.models.LabManager labManager23 = headLabCoordinator7.createLabManager();
        java.lang.String str24 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList22 = headLabCoordinator7.getApprovalRequests();
        boolean boolean23 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
// flaky "97) test0182(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Reservation> reservationList15 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "98) test0185(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "hi!", "hi!", accountStatus6);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        main.models.Reservation reservation16 = null;
        headLabCoordinator7.addReservation(reservation16);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
        org.junit.Assert.assertNull(paymentList15);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str22 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus29 = null;
        main.models.HeadLabCoordinator headLabCoordinator30 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus29);
        main.models.Reservation reservation31 = null;
        headLabCoordinator30.addReservation(reservation31);
        java.util.List<main.models.Reservation> reservationList33 = headLabCoordinator30.getReservations();
        headLabCoordinator7.setReservations(reservationList33);
        java.util.List<main.models.Payment> paymentList35 = null;
        headLabCoordinator7.setPayments(paymentList35);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headLabCoordinator30);
        org.junit.Assert.assertNotNull(reservationList33);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
// flaky "99) test0189(RegressionTest0)":         headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        main.enums.AccountStatus accountStatus28 = headLabCoordinator22.getStatus();
        java.lang.String str29 = headLabCoordinator22.getUserId();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
// flaky "48) test0189(RegressionTest0)":         headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        headLabCoordinator37.setPassword("hi!");
        java.lang.String str46 = headLabCoordinator37.getName();
        main.enums.AccountStatus accountStatus53 = null;
        main.models.HeadLabCoordinator headLabCoordinator54 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus53);
        main.models.LabManager labManager55 = headLabCoordinator54.createLabManager();
        double double56 = headLabCoordinator54.getHourlyRate();
        main.models.Payment payment57 = null;
// flaky "17) test0189(RegressionTest0)":         headLabCoordinator54.addPayment(payment57);
        java.lang.String str59 = headLabCoordinator54.getName();
        java.lang.String str60 = headLabCoordinator54.getName();
        main.models.ApprovalRequest[] approvalRequestArray61 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList62 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList62, approvalRequestArray61);
        headLabCoordinator54.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator22.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        double double68 = headLabCoordinator7.getHourlyRate();
        java.lang.Class<?> wildcardClass69 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "11) test0189(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList11);
// flaky "8) test0189(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
// flaky "4) test0189(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNull(accountStatus28);
// flaky "2) test0189(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator54);
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray61);
        org.junit.Assert.assertArrayEquals(approvalRequestArray61, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "", "hi!", accountStatus16);
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus24);
        headLabCoordinator25.setPassword("hi!");
        java.lang.String str28 = headLabCoordinator25.getName();
        java.lang.String str29 = headLabCoordinator25.getIdOrCertificationNumber();
        java.lang.String str30 = headLabCoordinator25.getPassword();
        main.enums.AccountStatus accountStatus37 = null;
        main.models.HeadLabCoordinator headLabCoordinator38 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus37);
        main.models.LabManager labManager39 = headLabCoordinator38.createLabManager();
        double double40 = headLabCoordinator38.getHourlyRate();
        main.models.Payment payment41 = null;
// flaky "100) test0190(RegressionTest0)":         headLabCoordinator38.addPayment(payment41);
        java.lang.String str43 = headLabCoordinator38.getName();
        java.lang.String str44 = headLabCoordinator38.getName();
        headLabCoordinator38.setPassword("hi!");
        java.lang.String str47 = headLabCoordinator38.getName();
        main.enums.AccountStatus accountStatus54 = null;
        main.models.HeadLabCoordinator headLabCoordinator55 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus54);
        main.models.LabManager labManager56 = headLabCoordinator55.createLabManager();
        double double57 = headLabCoordinator55.getHourlyRate();
        main.models.Payment payment58 = null;
// flaky "49) test0190(RegressionTest0)":         headLabCoordinator55.addPayment(payment58);
        java.lang.String str60 = headLabCoordinator55.getName();
        java.lang.String str61 = headLabCoordinator55.getName();
        main.models.ApprovalRequest[] approvalRequestArray62 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList63 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList63, approvalRequestArray62);
        headLabCoordinator55.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator38.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator25.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator17.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        boolean boolean70 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "18) test0190(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "12) test0190(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
// flaky "9) test0190(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator38);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator55);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray62);
        org.junit.Assert.assertArrayEquals(approvalRequestArray62, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "101) test0191(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.models.Reservation reservation14 = null;
        headLabCoordinator7.addReservation(reservation14);
        main.enums.AccountStatus accountStatus16 = null;
        headLabCoordinator7.setStatus(accountStatus16);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "50) test0191(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(accountStatus13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        main.models.Payment payment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "102) test0192(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList10);
// flaky "51) test0192(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(paymentList14);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.Payment> paymentList26 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        main.models.Reservation reservation29 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation29);
// flaky "103) test0193(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
// flaky "52) test0193(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList26);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        double double10 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "104) test0194(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        main.models.ApprovalRequest approvalRequest9 = null;
// flaky "105) test0195(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest9);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        java.lang.String str9 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        java.lang.String str17 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str18 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "106) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "53) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky "19) test0197(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        main.models.Reservation reservation13 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation13);
// flaky "107) test0198(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
// flaky "54) test0198(RegressionTest0)":         org.junit.Assert.assertNull(reservationList12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        java.lang.String str17 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator7.getApprovalRequests();
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "108) test0199(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(paymentList14);
// flaky "55) test0199(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        java.lang.String str10 = headLabCoordinator7.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean14 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "109) test0200(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        boolean boolean15 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus16 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(accountStatus16);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        main.enums.AccountStatus accountStatus30 = null;
        main.models.HeadLabCoordinator headLabCoordinator31 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus30);
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        headLabCoordinator31.setReservations((java.util.List<main.models.Reservation>) reservationList33);
        headLabCoordinator22.setReservations((java.util.List<main.models.Reservation>) reservationList33);
        headLabCoordinator7.setReservations((java.util.List<main.models.Reservation>) reservationList33);
        java.lang.Class<?> wildcardClass38 = reservationList33.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
// flaky "110) test0202(RegressionTest0)":         org.junit.Assert.assertNull(reservationList23);
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertNotNull(reservationArray32);
        org.junit.Assert.assertArrayEquals(reservationArray32, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList16 = headLabCoordinator7.getApprovalRequests();
        boolean boolean17 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky "111) test0203(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.models.ApprovalRequest approvalRequest13 = null;
// flaky "112) test0204(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest13);
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator22.getName();
        boolean boolean28 = headLabCoordinator22.isUniversityAffiliated();
        java.lang.String str29 = headLabCoordinator22.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList30 = headLabCoordinator22.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList30);
        java.lang.Class<?> wildcardClass32 = null; // flaky "56) test0204(RegressionTest0)": approvalRequestList30.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(approvalRequestList30);
// flaky "20) test0204(RegressionTest0)":         org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        main.models.LabManager labManager13 = headLabCoordinator7.createLabManager();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.Class<?> wildcardClass11 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.ApprovalRequest approvalRequest12 = null;
// flaky "113) test0208(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest12);
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        java.lang.String str10 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation11);
// flaky "114) test0209(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        boolean boolean14 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest13 = null;
// flaky "115) test0211(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest13);
        double double15 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment16 = null;
        headLabCoordinator7.addPayment(payment16);
        java.lang.String str18 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setDepartment("");
        main.models.Reservation reservation21 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation21);
// flaky "57) test0211(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "21) test0211(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        java.lang.String str13 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertNull(accountStatus12);
// flaky "116) test0212(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        java.lang.String str10 = headLabCoordinator7.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.Reservation reservation15 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation15);
// flaky "117) test0213(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
// flaky "58) test0213(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setName("");
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus25);
        headLabCoordinator26.setEmail("");
        main.enums.AccountStatus accountStatus35 = null;
        main.models.HeadLabCoordinator headLabCoordinator36 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus35);
        java.lang.String str37 = headLabCoordinator36.getName();
        main.models.Payment[] paymentArray38 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList39 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList39, paymentArray38);
        headLabCoordinator36.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator26.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        main.models.Reservation reservation46 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation46);
// flaky "118) test0215(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "59) test0215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "22) test0215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "13) test0215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertNotNull(headLabCoordinator36);
// flaky "10) test0215(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(paymentArray38);
        org.junit.Assert.assertArrayEquals(paymentArray38, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation[] reservationArray8 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList9 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList9, reservationArray8);
        headLabCoordinator7.setReservations((java.util.List<main.models.Reservation>) reservationList9);
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationArray8);
        org.junit.Assert.assertArrayEquals(reservationArray8, new main.models.Reservation[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        main.models.Payment payment24 = null;
        headLabCoordinator7.addPayment(payment24);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus17);
        boolean boolean19 = headLabCoordinator18.isUniversityAffiliated();
        headLabCoordinator18.setIdOrCertificationNumber("");
        main.models.Payment payment22 = null;
        headLabCoordinator18.addPayment(payment22);
        java.util.List<main.models.Payment> paymentList24 = headLabCoordinator18.getPayments();
        headLabCoordinator7.setPayments(paymentList24);
        double double26 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation29 = null;
        headLabCoordinator7.addReservation(reservation29);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(paymentList24);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setUserId("");
        double double17 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "119) test0220(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "120) test0221(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setPassword("");
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus17);
        main.models.Reservation reservation19 = null;
        headLabCoordinator18.addReservation(reservation19);
        java.util.List<main.models.Reservation> reservationList21 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList21);
        main.models.LabManager labManager23 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setEmail("hi!");
        java.lang.Class<?> wildcardClass26 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList21);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus18);
        boolean boolean20 = headLabCoordinator19.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus27);
        main.models.LabManager labManager29 = headLabCoordinator28.createLabManager();
        double double30 = headLabCoordinator28.getHourlyRate();
        main.models.Payment payment31 = null;
        headLabCoordinator28.addPayment(payment31);
        java.lang.String str33 = headLabCoordinator28.getEmail();
        java.util.List<main.models.Payment> paymentList34 = headLabCoordinator28.getPayments();
        headLabCoordinator19.setPayments(paymentList34);
        headLabCoordinator7.setPayments(paymentList34);
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str39 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        main.models.Payment payment18 = null;
        headLabCoordinator7.addPayment(payment18);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus24);
        boolean boolean26 = headLabCoordinator25.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus33);
        main.models.LabManager labManager35 = headLabCoordinator34.createLabManager();
        double double36 = headLabCoordinator34.getHourlyRate();
        main.models.Payment payment37 = null;
        headLabCoordinator34.addPayment(payment37);
        java.lang.String str39 = headLabCoordinator34.getEmail();
        java.util.List<main.models.Payment> paymentList40 = headLabCoordinator34.getPayments();
        headLabCoordinator25.setPayments(paymentList40);
        headLabCoordinator7.setPayments(paymentList40);
        main.enums.AccountStatus accountStatus49 = null;
        main.models.HeadLabCoordinator headLabCoordinator50 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus49);
        main.models.LabManager labManager51 = headLabCoordinator50.createLabManager();
        main.enums.AccountStatus accountStatus52 = headLabCoordinator50.getStatus();
        headLabCoordinator50.setDepartment("");
        headLabCoordinator50.setName("hi!");
        java.lang.String str57 = headLabCoordinator50.getPassword();
        main.enums.AccountStatus accountStatus64 = null;
        main.models.HeadLabCoordinator headLabCoordinator65 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus64);
        java.util.List<main.models.Reservation> reservationList66 = headLabCoordinator65.getReservations();
        main.models.LabManager labManager67 = headLabCoordinator65.createLabManager();
        java.lang.String str68 = headLabCoordinator65.getUserId();
        main.enums.AccountStatus accountStatus75 = null;
        main.models.HeadLabCoordinator headLabCoordinator76 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus75);
        boolean boolean77 = headLabCoordinator76.isUniversityAffiliated();
        headLabCoordinator76.setIdOrCertificationNumber("");
        main.models.Payment payment80 = null;
        headLabCoordinator76.addPayment(payment80);
        java.util.List<main.models.Payment> paymentList82 = headLabCoordinator76.getPayments();
        headLabCoordinator65.setPayments(paymentList82);
        headLabCoordinator50.setPayments(paymentList82);
        headLabCoordinator7.setPayments(paymentList82);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        double double88 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertNotNull(headLabCoordinator50);
        org.junit.Assert.assertNotNull(labManager51);
        org.junit.Assert.assertNull(accountStatus52);
// flaky "121) test0225(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator65);
        org.junit.Assert.assertNotNull(reservationList66);
        org.junit.Assert.assertNotNull(labManager67);
// flaky "60) test0225(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(paymentList82);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation24 = null;
        headLabCoordinator7.addReservation(reservation24);
        java.lang.String str26 = headLabCoordinator7.getDepartment();
        main.models.LabManager labManager27 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(labManager27);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        java.lang.Class<?> wildcardClass8 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "122) test0229(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
// flaky "61) test0229(RegressionTest0)":         headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus27);
        headLabCoordinator28.setName("hi!");
        java.lang.String str31 = headLabCoordinator28.getPassword();
        main.enums.AccountStatus accountStatus38 = null;
        main.models.HeadLabCoordinator headLabCoordinator39 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus38);
        java.util.List<main.models.Reservation> reservationList40 = headLabCoordinator39.getReservations();
        headLabCoordinator28.setReservations(reservationList40);
        boolean boolean42 = headLabCoordinator28.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList43 = headLabCoordinator28.getPayments();
        main.enums.AccountStatus accountStatus50 = null;
        main.models.HeadLabCoordinator headLabCoordinator51 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus50);
        main.models.LabManager labManager52 = headLabCoordinator51.createLabManager();
        double double53 = headLabCoordinator51.getHourlyRate();
        main.models.Payment payment54 = null;
// flaky "23) test0229(RegressionTest0)":         headLabCoordinator51.addPayment(payment54);
        java.lang.String str56 = headLabCoordinator51.getEmail();
        java.util.List<main.models.Payment> paymentList57 = headLabCoordinator51.getPayments();
        headLabCoordinator28.setPayments(paymentList57);
        headLabCoordinator7.setPayments(paymentList57);
        java.lang.String str60 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator39);
        org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky "14) test0229(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
// flaky "11) test0229(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
// flaky "5) test0229(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "123) test0230(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
// flaky "62) test0230(RegressionTest0)":         headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        main.models.LabManager labManager21 = headLabCoordinator7.createLabManager();
        boolean boolean22 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean23 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus24 = null;
        headLabCoordinator7.setStatus(accountStatus24);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "124) test0231(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList22 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str23 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "63) test0231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "24) test0231(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky "15) test0231(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation9 = null;
        headLabCoordinator7.addReservation(reservation9);
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray11 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList12 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList12, approvalRequestArray11);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList12);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray11);
        org.junit.Assert.assertArrayEquals(approvalRequestArray11, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setDepartment("");
        double double12 = headLabCoordinator7.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str13 = headLabCoordinator7.getEmail();
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "125) test0236(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(paymentList14);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "126) test0237(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setName("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setUserId("");
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(paymentList11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(paymentList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str10 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setEmail("");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        java.lang.String str16 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(paymentList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        double double9 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("");
        double double12 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        main.models.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        main.enums.AccountStatus accountStatus13 = null;
        headLabCoordinator7.setStatus(accountStatus13);
        main.models.Reservation reservation15 = null;
        headLabCoordinator7.addReservation(reservation15);
        main.enums.AccountStatus accountStatus17 = null;
        headLabCoordinator7.setStatus(accountStatus17);
        main.enums.AccountStatus accountStatus19 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "127) test0245(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(accountStatus19);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str22 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus29 = null;
        main.models.HeadLabCoordinator headLabCoordinator30 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus29);
        main.models.Reservation reservation31 = null;
        headLabCoordinator30.addReservation(reservation31);
        java.util.List<main.models.Reservation> reservationList33 = headLabCoordinator30.getReservations();
        headLabCoordinator7.setReservations(reservationList33);
        main.models.ApprovalRequest approvalRequest35 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest35);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "128) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "64) test0246(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator30);
        org.junit.Assert.assertNotNull(reservationList33);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = null;
        headLabCoordinator7.setStatus(accountStatus8);
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "129) test0247(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "130) test0248(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky "65) test0248(RegressionTest0)":         org.junit.Assert.assertNull(reservationList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        main.models.LabManager labManager13 = headLabCoordinator7.createLabManager();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "131) test0249(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        java.util.List<main.models.Payment> paymentList13 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "132) test0250(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(paymentList13);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        java.lang.String str10 = headLabCoordinator7.getIdOrCertificationNumber();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setName("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setName("");
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass21 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "133) test0252(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky "66) test0252(RegressionTest0)":         org.junit.Assert.assertNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass16 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "134) test0253(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
// flaky "67) test0253(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "135) test0254(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList10);
// flaky "68) test0254(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList15 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus22);
        boolean boolean24 = headLabCoordinator23.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.lang.String str37 = headLabCoordinator32.getEmail();
        java.util.List<main.models.Payment> paymentList38 = headLabCoordinator32.getPayments();
        headLabCoordinator23.setPayments(paymentList38);
        headLabCoordinator7.setPayments(paymentList38);
        java.lang.String str41 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest42 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest42);
// flaky "136) test0255(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky "69) test0255(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setName("hi!");
        java.lang.Class<?> wildcardClass11 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus16);
        headLabCoordinator17.setEmail("");
        main.enums.AccountStatus accountStatus26 = null;
        main.models.HeadLabCoordinator headLabCoordinator27 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus26);
        java.lang.String str28 = headLabCoordinator27.getName();
        main.models.Payment[] paymentArray29 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList30 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList30, paymentArray29);
        headLabCoordinator27.setPayments((java.util.List<main.models.Payment>) paymentList30);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList30);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList30);
        java.lang.String str35 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setDepartment("");
        java.lang.String str38 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(headLabCoordinator27);
// flaky "137) test0257(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(paymentArray29);
        org.junit.Assert.assertArrayEquals(paymentArray29, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator7.getApprovalRequests();
        double double26 = headLabCoordinator7.getHourlyRate();
        java.lang.Class<?> wildcardClass27 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.models.LabManager labManager19 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList20 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "138) test0259(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "70) test0259(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "25) test0259(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNull(approvalRequestList20);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "hi!", accountStatus6);
        main.models.Payment payment8 = null;
        headLabCoordinator7.addPayment(payment8);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setPassword("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setUserId("hi!");
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        main.models.Payment payment15 = null;
        headLabCoordinator7.addPayment(payment15);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        java.lang.String str46 = headLabCoordinator7.getName();
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
// flaky "139) test0262(RegressionTest0)":         org.junit.Assert.assertNull(reservationList44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        java.lang.String str14 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator22.getName();
        java.lang.String str28 = headLabCoordinator22.getName();
        headLabCoordinator22.setPassword("hi!");
        java.lang.String str31 = headLabCoordinator22.getName();
        main.enums.AccountStatus accountStatus38 = null;
        main.models.HeadLabCoordinator headLabCoordinator39 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus38);
        main.models.LabManager labManager40 = headLabCoordinator39.createLabManager();
        double double41 = headLabCoordinator39.getHourlyRate();
        main.models.Payment payment42 = null;
        headLabCoordinator39.addPayment(payment42);
        java.lang.String str44 = headLabCoordinator39.getName();
        java.lang.String str45 = headLabCoordinator39.getName();
        main.models.ApprovalRequest[] approvalRequestArray46 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList47 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList47, approvalRequestArray46);
        headLabCoordinator39.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator22.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList47);
        java.util.List<main.models.ApprovalRequest> approvalRequestList52 = headLabCoordinator7.getApprovalRequests();
        double double53 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList54 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator39);
        org.junit.Assert.assertNotNull(labManager40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray46);
        org.junit.Assert.assertArrayEquals(approvalRequestArray46, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(approvalRequestList52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
// flaky "140) test0263(RegressionTest0)":         org.junit.Assert.assertNull(reservationList54);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus19);
        main.models.LabManager labManager21 = headLabCoordinator20.createLabManager();
        double double22 = headLabCoordinator20.getHourlyRate();
        main.models.Payment payment23 = null;
        headLabCoordinator20.addPayment(payment23);
        java.lang.String str25 = headLabCoordinator20.getName();
        java.lang.String str26 = headLabCoordinator20.getName();
        headLabCoordinator20.setPassword("hi!");
        java.lang.String str29 = headLabCoordinator20.getName();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        main.models.ApprovalRequest[] approvalRequestArray44 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList45 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList45, approvalRequestArray44);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator20.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        main.models.Reservation reservation50 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation50);
// flaky "141) test0264(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "71) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky "26) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky "16) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "12) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
// flaky "6) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky "3) test0264(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        java.lang.Class<?> wildcardClass10 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Reservation> reservationList9 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        boolean boolean10 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(approvalRequestList11);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        java.lang.String str24 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator32.getPayments();
        java.lang.String str38 = headLabCoordinator32.getUserId();
        java.lang.String str39 = headLabCoordinator32.getUserId();
        java.util.List<main.models.Reservation> reservationList40 = headLabCoordinator32.getReservations();
        headLabCoordinator7.setReservations(reservationList40);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "142) test0269(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(reservationList40);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str18 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.Reservation reservation19 = null;
        headLabCoordinator7.addReservation(reservation19);
        headLabCoordinator7.setEmail("hi!");
        java.lang.Class<?> wildcardClass23 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "143) test0270(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "72) test0270(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setUserId("hi!");
        java.lang.String str27 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("");
        java.util.List<main.models.Reservation> reservationList30 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(reservationList30);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(approvalRequestList10);
// flaky "144) test0273(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "145) test0274(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.Payment payment11 = null;
        headLabCoordinator7.addPayment(payment11);
        java.util.List<main.models.Payment> paymentList13 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass14 = paymentList13.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "146) test0276(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        main.enums.AccountStatus accountStatus16 = null;
        headLabCoordinator7.setStatus(accountStatus16);
        java.lang.String str18 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass11 = paymentList10.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        java.lang.String str12 = headLabCoordinator7.getEmail();
        java.lang.String str13 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        double double13 = headLabCoordinator7.getHourlyRate();
        java.lang.String str14 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getName();
        java.lang.String str16 = headLabCoordinator7.getUserId();
        java.lang.String str17 = headLabCoordinator7.getUserId();
        java.lang.String str18 = headLabCoordinator7.getPassword();
        main.models.ApprovalRequest approvalRequest19 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest19);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
// flaky "147) test0283(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        double double11 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.HeadLabCoordinator headLabCoordinator15 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus14);
        headLabCoordinator15.setEmail("");
        main.models.Reservation reservation18 = null;
        headLabCoordinator15.addReservation(reservation18);
        main.enums.AccountStatus accountStatus20 = headLabCoordinator15.getStatus();
        java.lang.String str21 = headLabCoordinator15.getUserId();
        main.enums.AccountStatus accountStatus28 = null;
        main.models.HeadLabCoordinator headLabCoordinator29 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus28);
        main.models.LabManager labManager30 = headLabCoordinator29.createLabManager();
        main.enums.AccountStatus accountStatus31 = headLabCoordinator29.getStatus();
        headLabCoordinator29.setDepartment("");
        headLabCoordinator29.setName("hi!");
        java.lang.String str36 = headLabCoordinator29.getPassword();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.HeadLabCoordinator headLabCoordinator44 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus43);
        java.util.List<main.models.Reservation> reservationList45 = headLabCoordinator44.getReservations();
        main.models.LabManager labManager46 = headLabCoordinator44.createLabManager();
        java.lang.String str47 = headLabCoordinator44.getUserId();
        main.enums.AccountStatus accountStatus54 = null;
        main.models.HeadLabCoordinator headLabCoordinator55 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus54);
        boolean boolean56 = headLabCoordinator55.isUniversityAffiliated();
        headLabCoordinator55.setIdOrCertificationNumber("");
        main.models.Payment payment59 = null;
        headLabCoordinator55.addPayment(payment59);
        java.util.List<main.models.Payment> paymentList61 = headLabCoordinator55.getPayments();
        headLabCoordinator44.setPayments(paymentList61);
        headLabCoordinator29.setPayments(paymentList61);
        headLabCoordinator15.setPayments(paymentList61);
        headLabCoordinator7.setPayments(paymentList61);
        java.lang.String str66 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator15);
        org.junit.Assert.assertNull(accountStatus20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator29);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNull(accountStatus31);
// flaky "148) test0285(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator44);
        org.junit.Assert.assertNotNull(reservationList45);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(paymentList61);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus17 = null;
        headLabCoordinator7.setStatus(accountStatus17);
        boolean boolean19 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        headLabCoordinator7.setEmail("");
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass21 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        java.lang.String str13 = headLabCoordinator7.getName();
        java.lang.String str14 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(accountStatus12);
// flaky "149) test0288(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "73) test0288(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        java.util.List<main.models.Payment> paymentList13 = headLabCoordinator7.getPayments();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setUserId("");
        main.enums.AccountStatus accountStatus17 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "150) test0290(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList10);
        org.junit.Assert.assertNull(accountStatus17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = headLabCoordinator7.getApprovalRequests();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.lang.String str10 = headLabCoordinator7.getPassword();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "151) test0291(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList8);
        org.junit.Assert.assertNotNull(labManager9);
// flaky "74) test0291(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "27) test0291(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("");
        java.lang.String str18 = headLabCoordinator7.getName();
        main.models.LabManager labManager19 = headLabCoordinator7.createLabManager();
        boolean boolean20 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation21 = null;
        headLabCoordinator7.addReservation(reservation21);
        java.util.List<main.models.Payment> paymentList23 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "152) test0292(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
// flaky "75) test0292(RegressionTest0)":         org.junit.Assert.assertNull(paymentList15);
// flaky "28) test0292(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky "17) test0292(RegressionTest0)":         org.junit.Assert.assertNull(paymentList23);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setName("");
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str21 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "153) test0293(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus16);
        headLabCoordinator17.setName("hi!");
        java.lang.String str20 = headLabCoordinator17.getPassword();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus27);
        java.util.List<main.models.Reservation> reservationList29 = headLabCoordinator28.getReservations();
        headLabCoordinator17.setReservations(reservationList29);
        boolean boolean31 = headLabCoordinator17.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList32 = headLabCoordinator17.getPayments();
        headLabCoordinator17.setEmail("hi!");
        headLabCoordinator17.setEmail("hi!");
        java.util.List<main.models.Reservation> reservationList37 = headLabCoordinator17.getReservations();
        headLabCoordinator7.setReservations(reservationList37);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "154) test0294(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertNotNull(reservationList29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNotNull(reservationList37);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        headLabCoordinator7.setUserId("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        boolean boolean15 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus22);
        main.models.LabManager labManager24 = headLabCoordinator23.createLabManager();
        double double25 = headLabCoordinator23.getHourlyRate();
        main.models.Payment payment26 = null;
        headLabCoordinator23.addPayment(payment26);
        java.lang.String str28 = headLabCoordinator23.getName();
        java.lang.String str29 = headLabCoordinator23.getName();
        headLabCoordinator23.setPassword("hi!");
        java.lang.String str32 = headLabCoordinator23.getName();
        main.models.Payment payment33 = null;
        headLabCoordinator23.addPayment(payment33);
        boolean boolean35 = headLabCoordinator23.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList36 = headLabCoordinator23.getReservations();
        main.enums.AccountStatus accountStatus43 = null;
        main.models.HeadLabCoordinator headLabCoordinator44 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus43);
        main.models.LabManager labManager45 = headLabCoordinator44.createLabManager();
        double double46 = headLabCoordinator44.getHourlyRate();
        main.models.Payment payment47 = null;
        headLabCoordinator44.addPayment(payment47);
        java.lang.String str49 = headLabCoordinator44.getName();
        java.lang.String str50 = headLabCoordinator44.getName();
        headLabCoordinator44.setPassword("hi!");
        java.lang.String str53 = headLabCoordinator44.getName();
        main.models.Payment payment54 = null;
        headLabCoordinator44.addPayment(payment54);
        boolean boolean56 = headLabCoordinator44.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList57 = headLabCoordinator44.getReservations();
        headLabCoordinator23.setReservations(reservationList57);
        headLabCoordinator7.setReservations(reservationList57);
        java.lang.String str60 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus67 = null;
        main.models.HeadLabCoordinator headLabCoordinator68 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus67);
        main.enums.AccountStatus accountStatus69 = headLabCoordinator68.getStatus();
        boolean boolean70 = headLabCoordinator68.isPasswordStrong();
        main.enums.AccountStatus accountStatus71 = null;
        headLabCoordinator68.setStatus(accountStatus71);
        headLabCoordinator68.setUserId("hi!");
        double double75 = headLabCoordinator68.getHourlyRate();
        boolean boolean76 = headLabCoordinator68.isUniversityAffiliated();
        java.util.List<main.models.ApprovalRequest> approvalRequestList77 = headLabCoordinator68.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList77);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(headLabCoordinator44);
        org.junit.Assert.assertNotNull(labManager45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(reservationList57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator68);
        org.junit.Assert.assertNull(accountStatus69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
// flaky "155) test0295(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList77);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus23);
        headLabCoordinator24.setName("hi!");
        java.lang.String str27 = headLabCoordinator24.getPassword();
        main.enums.AccountStatus accountStatus34 = null;
        main.models.HeadLabCoordinator headLabCoordinator35 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus34);
        java.util.List<main.models.Reservation> reservationList36 = headLabCoordinator35.getReservations();
        headLabCoordinator24.setReservations(reservationList36);
        java.util.List<main.models.Reservation> reservationList38 = headLabCoordinator24.getReservations();
        headLabCoordinator7.setReservations(reservationList38);
        boolean boolean40 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertNotNull(reservationList38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str9 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "156) test0297(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        java.lang.String str24 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator32.getPayments();
        main.enums.AccountStatus accountStatus38 = headLabCoordinator32.getStatus();
        java.lang.String str39 = headLabCoordinator32.getUserId();
        main.enums.AccountStatus accountStatus46 = null;
        main.models.HeadLabCoordinator headLabCoordinator47 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus46);
        main.models.LabManager labManager48 = headLabCoordinator47.createLabManager();
        double double49 = headLabCoordinator47.getHourlyRate();
        main.models.Payment payment50 = null;
        headLabCoordinator47.addPayment(payment50);
        java.lang.String str52 = headLabCoordinator47.getName();
        java.lang.String str53 = headLabCoordinator47.getName();
        headLabCoordinator47.setPassword("hi!");
        java.lang.String str56 = headLabCoordinator47.getName();
        main.enums.AccountStatus accountStatus63 = null;
        main.models.HeadLabCoordinator headLabCoordinator64 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus63);
        main.models.LabManager labManager65 = headLabCoordinator64.createLabManager();
        double double66 = headLabCoordinator64.getHourlyRate();
        main.models.Payment payment67 = null;
        headLabCoordinator64.addPayment(payment67);
        java.lang.String str69 = headLabCoordinator64.getName();
        java.lang.String str70 = headLabCoordinator64.getName();
        main.models.ApprovalRequest[] approvalRequestArray71 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList72 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList72, approvalRequestArray71);
        headLabCoordinator64.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator47.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator32.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        java.lang.String str78 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
// flaky "157) test0298(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
// flaky "76) test0298(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(accountStatus38);
// flaky "29) test0298(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertNotNull(labManager65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray71);
        org.junit.Assert.assertArrayEquals(approvalRequestArray71, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
// flaky "18) test0298(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "158) test0299(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList18);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList47 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus48 = null;
        headLabCoordinator7.setStatus(accountStatus48);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "159) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "77) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky "30) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
// flaky "19) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky "13) test0300(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(reservationList47);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        java.lang.String str15 = headLabCoordinator7.getDepartment();
        java.lang.String str16 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
// flaky "160) test0301(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
// flaky "78) test0301(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus15);
        java.util.List<main.models.Reservation> reservationList17 = headLabCoordinator16.getReservations();
        headLabCoordinator7.setReservations(reservationList17);
        double double19 = headLabCoordinator7.getHourlyRate();
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        headLabCoordinator22.setPassword("");
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus32);
        main.models.Reservation reservation34 = null;
        headLabCoordinator33.addReservation(reservation34);
        java.util.List<main.models.Reservation> reservationList36 = headLabCoordinator33.getReservations();
        headLabCoordinator22.setReservations(reservationList36);
        headLabCoordinator7.setReservations(reservationList36);
        main.models.ApprovalRequest approvalRequest39 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest39);
        headLabCoordinator7.setName("");
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "161) test0303(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertNotNull(reservationList36);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        main.models.Reservation reservation14 = null;
        headLabCoordinator7.addReservation(reservation14);
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.lang.String str9 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setUserId("");
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
// flaky "162) test0305(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setUserId("hi!");
        java.lang.String str27 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        double double15 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment16 = null;
        headLabCoordinator7.addPayment(payment16);
        java.lang.String str18 = headLabCoordinator7.getDepartment();
        java.lang.Class<?> wildcardClass19 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
// flaky "163) test0308(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        java.lang.String str46 = headLabCoordinator7.getName();
        main.models.Reservation reservation47 = null;
        headLabCoordinator7.addReservation(reservation47);
        java.lang.String str49 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "hi!", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("hi!");
        main.models.Reservation reservation14 = null;
        headLabCoordinator7.addReservation(reservation14);
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest15 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest15);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        java.lang.String str17 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "164) test0313(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        main.models.Reservation reservation10 = null;
        headLabCoordinator7.addReservation(reservation10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("hi!");
        java.lang.String str15 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "165) test0314(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "79) test0314(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        main.enums.AccountStatus accountStatus29 = null;
        main.models.HeadLabCoordinator headLabCoordinator30 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus29);
        headLabCoordinator30.setDepartment("hi!");
        headLabCoordinator30.setDepartment("");
        headLabCoordinator30.setEmail("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList37 = headLabCoordinator30.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList37);
        main.enums.AccountStatus accountStatus45 = null;
        main.models.HeadLabCoordinator headLabCoordinator46 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus45);
        java.lang.String str47 = headLabCoordinator46.getName();
        main.models.Payment[] paymentArray48 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList49 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList49, paymentArray48);
        headLabCoordinator46.setPayments((java.util.List<main.models.Payment>) paymentList49);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList49);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(headLabCoordinator30);
        org.junit.Assert.assertNotNull(approvalRequestList37);
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(paymentArray48);
        org.junit.Assert.assertArrayEquals(paymentArray48, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        java.lang.String str17 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setUserId("hi!");
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(approvalRequestList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(paymentList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("hi!");
        main.models.Reservation reservation14 = null;
        headLabCoordinator7.addReservation(reservation14);
        java.lang.Class<?> wildcardClass16 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str10 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setName("hi!");
        java.lang.String str13 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky "166) test0318(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "167) test0319(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(approvalRequestList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        main.models.ApprovalRequest approvalRequest12 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("");
        main.models.ApprovalRequest approvalRequest10 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest10);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus15);
        boolean boolean17 = headLabCoordinator16.isUniversityAffiliated();
        headLabCoordinator16.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray20 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList21 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList21, approvalRequestArray20);
        headLabCoordinator16.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList21);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList21);
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus31);
        java.lang.String str33 = headLabCoordinator32.getName();
        main.models.Payment[] paymentArray34 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList35 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList35, paymentArray34);
        headLabCoordinator32.setPayments((java.util.List<main.models.Payment>) paymentList35);
        java.util.List<main.models.Reservation> reservationList38 = headLabCoordinator32.getReservations();
        headLabCoordinator7.setReservations(reservationList38);
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray20);
        org.junit.Assert.assertArrayEquals(approvalRequestArray20, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(paymentArray34);
        org.junit.Assert.assertArrayEquals(paymentArray34, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(reservationList38);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus15);
        boolean boolean17 = headLabCoordinator16.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator16.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList19 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList19);
        java.util.List<main.models.Reservation> reservationList21 = null;
        headLabCoordinator7.setReservations(reservationList21);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(paymentList19);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.lang.String str25 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("hi!");
        main.models.LabManager labManager28 = headLabCoordinator7.createLabManager();
        main.models.Payment payment29 = null;
        headLabCoordinator7.addPayment(payment29);
        java.util.List<main.models.ApprovalRequest> approvalRequestList31 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setName("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
// flaky "168) test0324(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
// flaky "80) test0324(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertNotNull(approvalRequestList31);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList15 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(approvalRequestList15);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation17 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
// flaky "169) test0326(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "170) test0327(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "81) test0327(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
// flaky "31) test0327(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "171) test0328(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        headLabCoordinator24.setEmail("");
        main.models.Reservation reservation27 = null;
// flaky "82) test0328(RegressionTest0)":         headLabCoordinator24.addReservation(reservation27);
        main.enums.AccountStatus accountStatus29 = null;
        headLabCoordinator24.setStatus(accountStatus29);
        main.enums.AccountStatus accountStatus31 = null;
        headLabCoordinator24.setStatus(accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator24.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList34 = headLabCoordinator24.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList34);
        java.lang.String str36 = headLabCoordinator7.getName();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "32) test0328(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "20) test0328(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertNotNull(approvalRequestList34);
// flaky "14) test0328(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
// flaky "172) test0329(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus18);
        java.lang.String str20 = headLabCoordinator19.getEmail();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus27);
        java.util.List<main.models.Reservation> reservationList29 = headLabCoordinator28.getReservations();
        headLabCoordinator19.setReservations(reservationList29);
        headLabCoordinator7.setReservations(reservationList29);
        java.lang.String str32 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager9);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator28);
// flaky "173) test0330(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList29);
// flaky "83) test0330(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus17 = null;
        headLabCoordinator7.setStatus(accountStatus17);
        boolean boolean19 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str20 = headLabCoordinator7.getPassword();
        main.models.Reservation reservation21 = null;
// flaky "174) test0332(RegressionTest0)":         headLabCoordinator7.addReservation(reservation21);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "175) test0333(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("");
        java.util.List<main.models.Payment> paymentList18 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus25);
        boolean boolean27 = headLabCoordinator26.isUniversityAffiliated();
        headLabCoordinator26.setIdOrCertificationNumber("");
        headLabCoordinator26.setUserId("hi!");
        main.enums.AccountStatus accountStatus32 = headLabCoordinator26.getStatus();
        main.enums.AccountStatus accountStatus39 = null;
        main.models.HeadLabCoordinator headLabCoordinator40 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus39);
        main.enums.AccountStatus accountStatus41 = headLabCoordinator40.getStatus();
        boolean boolean42 = headLabCoordinator40.isPasswordStrong();
        double double43 = headLabCoordinator40.getHourlyRate();
        main.models.LabManager labManager44 = headLabCoordinator40.createLabManager();
        java.util.List<main.models.Reservation> reservationList45 = headLabCoordinator40.getReservations();
        headLabCoordinator26.setReservations(reservationList45);
        headLabCoordinator7.setReservations(reservationList45);
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "84) test0333(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
// flaky "33) test0333(RegressionTest0)":         org.junit.Assert.assertNull(paymentList11);
        org.junit.Assert.assertNull(accountStatus14);
// flaky "21) test0333(RegressionTest0)":         org.junit.Assert.assertNull(paymentList15);
// flaky "15) test0333(RegressionTest0)":         org.junit.Assert.assertNull(paymentList18);
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(accountStatus32);
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertNull(accountStatus41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(labManager44);
// flaky "7) test0333(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList45);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus15);
        boolean boolean17 = headLabCoordinator16.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = headLabCoordinator16.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList19 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        boolean boolean22 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str23 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(approvalRequestList18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky "176) test0334(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setPassword("");
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(labManager14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "177) test0336(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.Payment> paymentList26 = headLabCoordinator7.getPayments();
        java.lang.String str27 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        java.lang.String str30 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList26);
// flaky "178) test0337(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("");
        double double14 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
// flaky "179) test0338(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        main.models.Reservation reservation10 = null;
// flaky "180) test0339(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setUserId("");
        java.lang.String str14 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList20);
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.Payment> paymentList26 = headLabCoordinator7.getPayments();
        main.models.ApprovalRequest approvalRequest27 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest27);
        java.lang.String str29 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
// flaky "181) test0341(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setEmail("");
        boolean boolean24 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Payment payment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str10 = headLabCoordinator7.getEmail();
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "85) test0342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky "182) test0342(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(paymentList14);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getDepartment();
        java.lang.String str9 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "183) test0343(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "86) test0343(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "87) test0344(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        main.models.ApprovalRequest[] approvalRequestArray14 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList15 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList15, approvalRequestArray14);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList15);
        headLabCoordinator7.setUserId("hi!");
        headLabCoordinator7.setUserId("");
        main.models.Payment payment22 = null;
// flaky "34) test0344(RegressionTest0)":         headLabCoordinator7.addPayment(payment22);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "184) test0344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
// flaky "22) test0344(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(approvalRequestArray14);
        org.junit.Assert.assertArrayEquals(approvalRequestArray14, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "185) test0345(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setEmail("");
        main.models.ApprovalRequest approvalRequest14 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest14);
        java.util.List<main.models.Reservation> reservationList16 = headLabCoordinator7.getReservations();
        java.lang.Class<?> wildcardClass17 = null; // flaky "88) test0345(RegressionTest0)": reservationList16.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "35) test0345(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList16);
// flaky "23) test0345(RegressionTest0)":         org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        double double12 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setName("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        java.lang.String str13 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setEmail("");
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "89) test0348(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        java.lang.String str15 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        double double18 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        main.models.Reservation reservation9 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        headLabCoordinator7.setUserId("hi!");
        main.enums.AccountStatus accountStatus20 = null;
        main.models.HeadLabCoordinator headLabCoordinator21 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus20);
        java.lang.String str22 = headLabCoordinator21.getDepartment();
        headLabCoordinator21.setEmail("hi!");
        java.util.List<main.models.Reservation> reservationList25 = headLabCoordinator21.getReservations();
        headLabCoordinator7.setReservations(reservationList25);
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator21);
// flaky "90) test0351(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(reservationList25);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "", accountStatus6);
        headLabCoordinator7.setUserId("");
        java.lang.String str10 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
// flaky "91) test0353(RegressionTest0)":         headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.lang.String str17 = headLabCoordinator7.getDepartment();
        main.models.ApprovalRequest approvalRequest18 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest18);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky "186) test0353(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "hi!", "hi!", "hi!", "", accountStatus6);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        boolean boolean10 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setPassword("");
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        main.models.Reservation reservation14 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addReservation(reservation14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.reservations\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reservationList13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str9 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus16);
        main.models.LabManager labManager18 = headLabCoordinator17.createLabManager();
        double double19 = headLabCoordinator17.getHourlyRate();
        main.models.Payment payment20 = null;
// flaky "92) test0357(RegressionTest0)":         headLabCoordinator17.addPayment(payment20);
        java.lang.String str22 = headLabCoordinator17.getName();
        boolean boolean23 = headLabCoordinator17.isUniversityAffiliated();
        java.lang.String str24 = headLabCoordinator17.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator17.getApprovalRequests();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus32);
        boolean boolean34 = headLabCoordinator33.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.HeadLabCoordinator headLabCoordinator42 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus41);
        main.models.LabManager labManager43 = headLabCoordinator42.createLabManager();
        double double44 = headLabCoordinator42.getHourlyRate();
        main.models.Payment payment45 = null;
// flaky "36) test0357(RegressionTest0)":         headLabCoordinator42.addPayment(payment45);
        java.lang.String str47 = headLabCoordinator42.getEmail();
        java.util.List<main.models.Payment> paymentList48 = headLabCoordinator42.getPayments();
        headLabCoordinator33.setPayments(paymentList48);
        headLabCoordinator17.setPayments(paymentList48);
        headLabCoordinator7.setPayments(paymentList48);
        headLabCoordinator7.setUserId("hi!");
        main.enums.AccountStatus accountStatus54 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "187) test0357(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
// flaky "24) test0357(RegressionTest0)":         org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertNull(accountStatus54);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        java.lang.String str9 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus16);
        java.lang.String str18 = headLabCoordinator17.getName();
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList20);
        java.lang.String str23 = headLabCoordinator17.getUserId();
        boolean boolean24 = headLabCoordinator17.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus25 = null;
        headLabCoordinator17.setStatus(accountStatus25);
        java.lang.String str27 = headLabCoordinator17.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus34 = null;
        main.models.HeadLabCoordinator headLabCoordinator35 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus34);
        headLabCoordinator35.setEmail("");
        main.enums.AccountStatus accountStatus44 = null;
        main.models.HeadLabCoordinator headLabCoordinator45 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus44);
        java.lang.String str46 = headLabCoordinator45.getName();
        main.models.Payment[] paymentArray47 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList48 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList48, paymentArray47);
        headLabCoordinator45.setPayments((java.util.List<main.models.Payment>) paymentList48);
        headLabCoordinator35.setPayments((java.util.List<main.models.Payment>) paymentList48);
        headLabCoordinator17.setPayments((java.util.List<main.models.Payment>) paymentList48);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList48);
        headLabCoordinator7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
// flaky "188) test0359(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(paymentArray19);
        org.junit.Assert.assertArrayEquals(paymentArray19, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "93) test0359(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
// flaky "37) test0359(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertNotNull(headLabCoordinator45);
// flaky "25) test0359(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(paymentArray47);
        org.junit.Assert.assertArrayEquals(paymentArray47, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        double double8 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setEmail("");
        java.lang.Class<?> wildcardClass11 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus16);
        main.models.LabManager labManager18 = headLabCoordinator17.createLabManager();
        double double19 = headLabCoordinator17.getHourlyRate();
        main.models.Payment payment20 = null;
        headLabCoordinator17.addPayment(payment20);
        java.lang.String str22 = headLabCoordinator17.getName();
        boolean boolean23 = headLabCoordinator17.isUniversityAffiliated();
        java.lang.String str24 = headLabCoordinator17.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator17.getApprovalRequests();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus32);
        boolean boolean34 = headLabCoordinator33.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.HeadLabCoordinator headLabCoordinator42 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus41);
        main.models.LabManager labManager43 = headLabCoordinator42.createLabManager();
        double double44 = headLabCoordinator42.getHourlyRate();
        main.models.Payment payment45 = null;
        headLabCoordinator42.addPayment(payment45);
        java.lang.String str47 = headLabCoordinator42.getEmail();
        java.util.List<main.models.Payment> paymentList48 = headLabCoordinator42.getPayments();
        headLabCoordinator33.setPayments(paymentList48);
        headLabCoordinator17.setPayments(paymentList48);
        headLabCoordinator7.setPayments(paymentList48);
        java.lang.Class<?> wildcardClass52 = paymentList48.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
// flaky "189) test0361(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky "94) test0361(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(paymentList48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        double double12 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        java.lang.String str9 = headLabCoordinator7.getIdOrCertificationNumber();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest13);
// flaky "190) test0363(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "95) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "38) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(reservationList11);
// flaky "26) test0363(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        main.models.Payment payment15 = null;
        headLabCoordinator7.addPayment(payment15);
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "hi!", "", "hi!", accountStatus23);
        java.util.List<main.models.Reservation> reservationList25 = headLabCoordinator24.getReservations();
        headLabCoordinator7.setReservations(reservationList25);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNull(reservationList25);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setPassword("");
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("");
        java.lang.Class<?> wildcardClass17 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "191) test0365(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
// flaky "96) test0365(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList47 = headLabCoordinator7.getReservations();
        java.lang.String str48 = headLabCoordinator7.getDepartment();
        java.lang.String str49 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus56 = null;
        main.models.HeadLabCoordinator headLabCoordinator57 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus56);
        main.models.LabManager labManager58 = headLabCoordinator57.createLabManager();
        headLabCoordinator57.setPassword("");
        main.enums.AccountStatus accountStatus67 = null;
        main.models.HeadLabCoordinator headLabCoordinator68 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus67);
        headLabCoordinator68.setName("hi!");
        java.lang.String str71 = headLabCoordinator68.getPassword();
        main.enums.AccountStatus accountStatus78 = null;
        main.models.HeadLabCoordinator headLabCoordinator79 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus78);
        java.util.List<main.models.Reservation> reservationList80 = headLabCoordinator79.getReservations();
        headLabCoordinator68.setReservations(reservationList80);
        headLabCoordinator57.setReservations(reservationList80);
        headLabCoordinator7.setReservations(reservationList80);
        main.models.Reservation reservation84 = null;
// flaky "192) test0366(RegressionTest0)":         headLabCoordinator7.addReservation(reservation84);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
// flaky "97) test0366(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "39) test0366(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator57);
        org.junit.Assert.assertNotNull(labManager58);
        org.junit.Assert.assertNotNull(headLabCoordinator68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(headLabCoordinator79);
// flaky "27) test0366(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList80);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        main.models.ApprovalRequest[] approvalRequestArray14 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList15 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList15, approvalRequestArray14);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList15);
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray14);
        org.junit.Assert.assertArrayEquals(approvalRequestArray14, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getUserId();
        java.util.List<main.models.Reservation> reservationList15 = headLabCoordinator7.getReservations();
        java.util.List<main.models.ApprovalRequest> approvalRequestList16 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "", "hi!", accountStatus23);
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.lang.String str37 = headLabCoordinator32.getName();
        java.lang.String str38 = headLabCoordinator32.getName();
        headLabCoordinator32.setPassword("hi!");
        java.lang.String str41 = headLabCoordinator32.getName();
        main.models.Payment payment42 = null;
        headLabCoordinator32.addPayment(payment42);
        boolean boolean44 = headLabCoordinator32.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList45 = headLabCoordinator32.getReservations();
        main.enums.AccountStatus accountStatus52 = null;
        main.models.HeadLabCoordinator headLabCoordinator53 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus52);
        main.models.LabManager labManager54 = headLabCoordinator53.createLabManager();
        double double55 = headLabCoordinator53.getHourlyRate();
        main.models.Payment payment56 = null;
        headLabCoordinator53.addPayment(payment56);
        java.lang.String str58 = headLabCoordinator53.getName();
        java.lang.String str59 = headLabCoordinator53.getName();
        headLabCoordinator53.setPassword("hi!");
        java.lang.String str62 = headLabCoordinator53.getName();
        main.models.Payment payment63 = null;
        headLabCoordinator53.addPayment(payment63);
        boolean boolean65 = headLabCoordinator53.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList66 = headLabCoordinator53.getReservations();
        headLabCoordinator32.setReservations(reservationList66);
        main.enums.AccountStatus accountStatus74 = null;
        main.models.HeadLabCoordinator headLabCoordinator75 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus74);
        boolean boolean76 = headLabCoordinator75.isUniversityAffiliated();
        headLabCoordinator75.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray79 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList80 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList80, approvalRequestArray79);
        headLabCoordinator75.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList80);
        headLabCoordinator32.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList80);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList80);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList80);
        double double86 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
// flaky "98) test0368(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "40) test0368(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky "193) test0368(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky "28) test0368(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList45);
        org.junit.Assert.assertNotNull(headLabCoordinator53);
        org.junit.Assert.assertNotNull(labManager54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
// flaky "16) test0368(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList66);
        org.junit.Assert.assertNotNull(headLabCoordinator75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray79);
        org.junit.Assert.assertArrayEquals(approvalRequestArray79, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        main.models.LabManager labManager21 = headLabCoordinator7.createLabManager();
        boolean boolean22 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean23 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation24 = null;
// flaky "194) test0369(RegressionTest0)":         headLabCoordinator7.addReservation(reservation24);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "99) test0369(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus19);
        main.models.LabManager labManager21 = headLabCoordinator20.createLabManager();
        double double22 = headLabCoordinator20.getHourlyRate();
        main.models.Payment payment23 = null;
        headLabCoordinator20.addPayment(payment23);
        java.lang.String str25 = headLabCoordinator20.getName();
        java.lang.String str26 = headLabCoordinator20.getName();
        headLabCoordinator20.setPassword("hi!");
        java.lang.String str29 = headLabCoordinator20.getName();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        main.models.ApprovalRequest[] approvalRequestArray44 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList45 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList45, approvalRequestArray44);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator20.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        main.models.LabManager labManager50 = headLabCoordinator7.createLabManager();
        main.models.ApprovalRequest approvalRequest51 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest51);
        main.enums.AccountStatus accountStatus59 = null;
        main.models.HeadLabCoordinator headLabCoordinator60 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus59);
        main.models.Reservation reservation61 = null;
// flaky "195) test0370(RegressionTest0)":         headLabCoordinator60.addReservation(reservation61);
        java.util.List<main.models.Reservation> reservationList63 = headLabCoordinator60.getReservations();
        java.util.List<main.models.Payment> paymentList64 = headLabCoordinator60.getPayments();
        headLabCoordinator60.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList67 = headLabCoordinator60.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList67);
        java.lang.Class<?> wildcardClass69 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertNotNull(headLabCoordinator60);
// flaky "100) test0370(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList63);
        org.junit.Assert.assertNotNull(paymentList64);
        org.junit.Assert.assertNotNull(approvalRequestList67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setPassword("hi!");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        java.lang.String str16 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation17 = null;
// flaky "196) test0371(RegressionTest0)":         headLabCoordinator7.addReservation(reservation17);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(accountStatus13);
// flaky "101) test0371(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus9 = null;
        headLabCoordinator7.setStatus(accountStatus9);
        boolean boolean11 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "197) test0372(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "198) test0373(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNull(accountStatus13);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "199) test0374(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList18);
        java.util.List<main.models.Payment> paymentList20 = headLabCoordinator7.getPayments();
        main.models.LabManager labManager21 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "102) test0374(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(labManager21);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "200) test0375(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation12 = null;
// flaky "103) test0375(RegressionTest0)":         headLabCoordinator7.addReservation(reservation12);
        java.lang.String str14 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "41) test0375(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "201) test0376(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus24);
        java.lang.String str26 = headLabCoordinator25.getEmail();
        headLabCoordinator25.setName("");
        main.enums.AccountStatus accountStatus35 = null;
        main.models.HeadLabCoordinator headLabCoordinator36 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus35);
        main.models.LabManager labManager37 = headLabCoordinator36.createLabManager();
        double double38 = headLabCoordinator36.getHourlyRate();
        main.models.Payment payment39 = null;
        headLabCoordinator36.addPayment(payment39);
        java.lang.String str41 = headLabCoordinator36.getName();
        java.lang.String str42 = headLabCoordinator36.getName();
        main.models.ApprovalRequest[] approvalRequestArray43 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList44 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList44, approvalRequestArray43);
        headLabCoordinator36.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList44);
        headLabCoordinator25.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList44);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList44);
        main.models.LabManager labManager49 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "104) test0376(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headLabCoordinator36);
        org.junit.Assert.assertNotNull(labManager37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(approvalRequestArray43);
        org.junit.Assert.assertArrayEquals(approvalRequestArray43, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(labManager49);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "202) test0377(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList9 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
// flaky "203) test0378(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "", "hi!", accountStatus6);
        java.lang.Class<?> wildcardClass8 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
// flaky "204) test0380(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str18 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.Reservation reservation19 = null;
// flaky "105) test0380(RegressionTest0)":         headLabCoordinator7.addReservation(reservation19);
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "42) test0380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "29) test0380(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList20 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus27);
        headLabCoordinator28.setName("hi!");
        java.lang.String str31 = headLabCoordinator28.getPassword();
        main.enums.AccountStatus accountStatus38 = null;
        main.models.HeadLabCoordinator headLabCoordinator39 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus38);
        java.util.List<main.models.Reservation> reservationList40 = headLabCoordinator39.getReservations();
        headLabCoordinator28.setReservations(reservationList40);
        boolean boolean42 = headLabCoordinator28.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList43 = headLabCoordinator28.getPayments();
        main.enums.AccountStatus accountStatus50 = null;
        main.models.HeadLabCoordinator headLabCoordinator51 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus50);
        main.models.LabManager labManager52 = headLabCoordinator51.createLabManager();
        double double53 = headLabCoordinator51.getHourlyRate();
        main.models.Payment payment54 = null;
        headLabCoordinator51.addPayment(payment54);
        java.lang.String str56 = headLabCoordinator51.getEmail();
        java.util.List<main.models.Payment> paymentList57 = headLabCoordinator51.getPayments();
        headLabCoordinator28.setPayments(paymentList57);
        headLabCoordinator7.setPayments(paymentList57);
        main.enums.AccountStatus accountStatus60 = headLabCoordinator7.getStatus();
        java.lang.String str61 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "106) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "43) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "30) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky "205) test0381(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList20);
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator39);
// flaky "17) test0381(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(paymentList43);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertNotNull(labManager52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(paymentList57);
        org.junit.Assert.assertNull(accountStatus60);
// flaky "8) test0381(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setUserId("hi!");
        main.models.Payment payment13 = null;
        headLabCoordinator7.addPayment(payment13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "206) test0382(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky "107) test0382(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "207) test0383(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        java.lang.String str17 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus24);
        headLabCoordinator25.setEmail("");
        main.enums.AccountStatus accountStatus34 = null;
        main.models.HeadLabCoordinator headLabCoordinator35 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus34);
        java.lang.String str36 = headLabCoordinator35.getName();
        main.models.Payment[] paymentArray37 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList38 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList38, paymentArray37);
        headLabCoordinator35.setPayments((java.util.List<main.models.Payment>) paymentList38);
        headLabCoordinator25.setPayments((java.util.List<main.models.Payment>) paymentList38);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList38);
        main.models.Payment payment43 = null;
        headLabCoordinator7.addPayment(payment43);
        main.enums.AccountStatus accountStatus51 = null;
        main.models.HeadLabCoordinator headLabCoordinator52 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "hi!", "hi!", accountStatus51);
        java.lang.String str53 = headLabCoordinator52.getDepartment();
        boolean boolean54 = headLabCoordinator52.isPasswordStrong();
        java.lang.String str55 = headLabCoordinator52.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList56 = headLabCoordinator52.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList56);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(paymentArray37);
        org.junit.Assert.assertArrayEquals(paymentArray37, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator52);
// flaky "208) test0384(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
// flaky "108) test0384(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList56);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        main.enums.AccountStatus accountStatus21 = null;
        headLabCoordinator7.setStatus(accountStatus21);
        main.enums.AccountStatus accountStatus29 = null;
        main.models.HeadLabCoordinator headLabCoordinator30 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus29);
        main.models.LabManager labManager31 = headLabCoordinator30.createLabManager();
        double double32 = headLabCoordinator30.getHourlyRate();
        main.models.Payment payment33 = null;
        headLabCoordinator30.addPayment(payment33);
        java.util.List<main.models.Payment> paymentList35 = headLabCoordinator30.getPayments();
        java.lang.String str36 = headLabCoordinator30.getUserId();
        boolean boolean37 = headLabCoordinator30.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus44 = null;
        main.models.HeadLabCoordinator headLabCoordinator45 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus44);
        main.models.LabManager labManager46 = headLabCoordinator45.createLabManager();
        double double47 = headLabCoordinator45.getHourlyRate();
        main.models.Payment payment48 = null;
        headLabCoordinator45.addPayment(payment48);
        java.lang.String str50 = headLabCoordinator45.getEmail();
        main.models.Reservation reservation51 = null;
// flaky "209) test0385(RegressionTest0)":         headLabCoordinator45.addReservation(reservation51);
        java.lang.String str53 = headLabCoordinator45.getEmail();
        main.enums.AccountStatus accountStatus60 = null;
        main.models.HeadLabCoordinator headLabCoordinator61 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus60);
        boolean boolean62 = headLabCoordinator61.isUniversityAffiliated();
        headLabCoordinator61.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray65 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList66 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList66, approvalRequestArray65);
        headLabCoordinator61.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        headLabCoordinator45.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        headLabCoordinator30.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList66);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "109) test0385(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
// flaky "44) test0385(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertNotNull(headLabCoordinator30);
        org.junit.Assert.assertNotNull(labManager31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList35);
// flaky "31) test0385(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator45);
        org.junit.Assert.assertNotNull(labManager46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
// flaky "18) test0385(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
// flaky "9) test0385(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray65);
        org.junit.Assert.assertArrayEquals(approvalRequestArray65, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setEmail("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky "210) test0386(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setUserId("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "211) test0388(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        java.util.List<main.models.ApprovalRequest> approvalRequestList11 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList11);
        main.models.Reservation reservation13 = null;
// flaky "212) test0389(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        java.lang.String str17 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(accountStatus10);
// flaky "110) test0389(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setEmail("hi!");
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        headLabCoordinator7.setReservations(reservationList23);
        main.models.Payment payment25 = null;
        headLabCoordinator7.addPayment(payment25);
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.util.List<main.models.Payment> paymentList29 = null;
        headLabCoordinator7.setPayments(paymentList29);
        main.models.ApprovalRequest approvalRequest31 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
// flaky "213) test0391(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.HeadLabCoordinator headLabCoordinator15 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus14);
        main.models.Reservation reservation16 = null;
// flaky "214) test0392(RegressionTest0)":         headLabCoordinator15.addReservation(reservation16);
        java.util.List<main.models.Reservation> reservationList18 = headLabCoordinator15.getReservations();
        java.util.List<main.models.Payment> paymentList19 = headLabCoordinator15.getPayments();
        headLabCoordinator15.setPassword("hi!");
        main.enums.AccountStatus accountStatus22 = headLabCoordinator15.getStatus();
        java.util.List<main.models.Payment> paymentList23 = headLabCoordinator15.getPayments();
        headLabCoordinator15.setDepartment("");
        java.util.List<main.models.Payment> paymentList26 = headLabCoordinator15.getPayments();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus33);
        boolean boolean35 = headLabCoordinator34.isUniversityAffiliated();
        headLabCoordinator34.setIdOrCertificationNumber("");
        headLabCoordinator34.setUserId("hi!");
        main.enums.AccountStatus accountStatus40 = headLabCoordinator34.getStatus();
        main.enums.AccountStatus accountStatus47 = null;
        main.models.HeadLabCoordinator headLabCoordinator48 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus47);
        main.enums.AccountStatus accountStatus49 = headLabCoordinator48.getStatus();
        boolean boolean50 = headLabCoordinator48.isPasswordStrong();
        double double51 = headLabCoordinator48.getHourlyRate();
        main.models.LabManager labManager52 = headLabCoordinator48.createLabManager();
        java.util.List<main.models.Reservation> reservationList53 = headLabCoordinator48.getReservations();
        headLabCoordinator34.setReservations(reservationList53);
        headLabCoordinator15.setReservations(reservationList53);
        headLabCoordinator7.setReservations(reservationList53);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator15);
// flaky "111) test0392(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList18);
        org.junit.Assert.assertNull(paymentList19);
        org.junit.Assert.assertNull(accountStatus22);
        org.junit.Assert.assertNull(paymentList23);
        org.junit.Assert.assertNull(paymentList26);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(accountStatus40);
        org.junit.Assert.assertNotNull(headLabCoordinator48);
        org.junit.Assert.assertNull(accountStatus49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(labManager52);
// flaky "45) test0392(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList53);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setUserId("");
        java.lang.String str15 = headLabCoordinator7.getName();
        boolean boolean16 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean17 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        headLabCoordinator22.setPassword("");
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus32);
        main.models.Reservation reservation34 = null;
// flaky "215) test0394(RegressionTest0)":         headLabCoordinator33.addReservation(reservation34);
        java.util.List<main.models.Reservation> reservationList36 = headLabCoordinator33.getReservations();
        headLabCoordinator22.setReservations(reservationList36);
        headLabCoordinator7.setReservations(reservationList36);
        headLabCoordinator7.setDepartment("");
        java.lang.String str41 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
// flaky "112) test0394(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList36);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        double double13 = headLabCoordinator7.getHourlyRate();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass15 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "216) test0395(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        java.lang.String str36 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "217) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "113) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "46) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
// flaky "32) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky "19) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky "10) test0396(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
// flaky "218) test0398(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus24);
        boolean boolean26 = headLabCoordinator25.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus33);
        main.models.LabManager labManager35 = headLabCoordinator34.createLabManager();
        double double36 = headLabCoordinator34.getHourlyRate();
        main.models.Payment payment37 = null;
        headLabCoordinator34.addPayment(payment37);
        java.lang.String str39 = headLabCoordinator34.getEmail();
        java.util.List<main.models.Payment> paymentList40 = headLabCoordinator34.getPayments();
        headLabCoordinator25.setPayments(paymentList40);
        headLabCoordinator7.setPayments(paymentList40);
        java.lang.String str43 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        main.enums.AccountStatus accountStatus13 = null;
        headLabCoordinator7.setStatus(accountStatus13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "219) test0399(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "220) test0400(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList18 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList18);
        java.util.List<main.models.Payment> paymentList20 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setUserId("");
        main.models.Payment payment23 = null;
        headLabCoordinator7.addPayment(payment23);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "114) test0400(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList20);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setDepartment("hi!");
        headLabCoordinator7.setUserId("");
        main.models.Reservation reservation17 = null;
// flaky "221) test0401(RegressionTest0)":         headLabCoordinator7.addReservation(reservation17);
        double double19 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(approvalRequestList10);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setUserId("");
        java.lang.String str15 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus22);
        main.models.LabManager labManager24 = headLabCoordinator23.createLabManager();
        double double25 = headLabCoordinator23.getHourlyRate();
        main.models.Payment payment26 = null;
        headLabCoordinator23.addPayment(payment26);
        java.lang.String str28 = headLabCoordinator23.getName();
        java.lang.String str29 = headLabCoordinator23.getName();
        headLabCoordinator23.setPassword("hi!");
        java.lang.String str32 = headLabCoordinator23.getName();
        main.enums.AccountStatus accountStatus39 = null;
        main.models.HeadLabCoordinator headLabCoordinator40 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus39);
        main.models.LabManager labManager41 = headLabCoordinator40.createLabManager();
        double double42 = headLabCoordinator40.getHourlyRate();
        main.models.Payment payment43 = null;
        headLabCoordinator40.addPayment(payment43);
        java.lang.String str45 = headLabCoordinator40.getName();
        java.lang.String str46 = headLabCoordinator40.getName();
        main.models.ApprovalRequest[] approvalRequestArray47 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList48 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList48, approvalRequestArray47);
        headLabCoordinator40.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        headLabCoordinator23.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList48);
        main.enums.AccountStatus accountStatus58 = null;
        main.models.HeadLabCoordinator headLabCoordinator59 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus58);
        java.util.List<main.models.Reservation> reservationList60 = headLabCoordinator59.getReservations();
        headLabCoordinator23.setReservations(reservationList60);
        boolean boolean62 = headLabCoordinator23.isPasswordStrong();
        main.models.Reservation reservation63 = null;
// flaky "222) test0402(RegressionTest0)":         headLabCoordinator23.addReservation(reservation63);
        java.util.List<main.models.ApprovalRequest> approvalRequestList65 = headLabCoordinator23.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList65);
        headLabCoordinator7.setEmail("");
        boolean boolean69 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertNotNull(labManager24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertNotNull(labManager41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(approvalRequestArray47);
        org.junit.Assert.assertArrayEquals(approvalRequestArray47, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator59);
// flaky "115) test0402(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(approvalRequestList65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        double double9 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus18);
        headLabCoordinator19.setDepartment("hi!");
        java.lang.String str22 = headLabCoordinator19.getUserId();
        main.models.Payment payment23 = null;
        headLabCoordinator19.addPayment(payment23);
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator32.getPayments();
        java.lang.String str38 = headLabCoordinator32.getUserId();
        boolean boolean39 = headLabCoordinator32.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus46 = null;
        main.models.HeadLabCoordinator headLabCoordinator47 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus46);
        main.models.LabManager labManager48 = headLabCoordinator47.createLabManager();
        double double49 = headLabCoordinator47.getHourlyRate();
        main.models.Payment payment50 = null;
        headLabCoordinator47.addPayment(payment50);
        java.lang.String str52 = headLabCoordinator47.getEmail();
        main.models.Reservation reservation53 = null;
// flaky "223) test0403(RegressionTest0)":         headLabCoordinator47.addReservation(reservation53);
        java.lang.String str55 = headLabCoordinator47.getEmail();
        main.enums.AccountStatus accountStatus62 = null;
        main.models.HeadLabCoordinator headLabCoordinator63 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus62);
        boolean boolean64 = headLabCoordinator63.isUniversityAffiliated();
        headLabCoordinator63.setIdOrCertificationNumber("");
        main.models.ApprovalRequest[] approvalRequestArray67 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList68 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList68, approvalRequestArray67);
        headLabCoordinator63.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList68);
        headLabCoordinator47.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList68);
        headLabCoordinator32.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList68);
        headLabCoordinator19.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList68);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList68);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky "116) test0403(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
// flaky "47) test0403(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(approvalRequestArray67);
        org.junit.Assert.assertArrayEquals(approvalRequestArray67, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus25);
        java.util.List<main.models.Reservation> reservationList27 = headLabCoordinator26.getReservations();
        headLabCoordinator7.setReservations(reservationList27);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setUserId("");
        headLabCoordinator7.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList35 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
// flaky "224) test0404(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertNull(approvalRequestList35);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setName("hi!");
        java.lang.String str14 = headLabCoordinator7.getPassword();
        java.lang.String str15 = headLabCoordinator7.getDepartment();
        java.util.List<main.models.Reservation> reservationList16 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "225) test0405(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        double double14 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setDepartment("hi!");
        boolean boolean17 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "226) test0407(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setEmail("");
        main.models.ApprovalRequest approvalRequest14 = null;
// flaky "117) test0407(RegressionTest0)":         headLabCoordinator7.addApprovalRequest(approvalRequest14);
        java.lang.Class<?> wildcardClass16 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("hi!");
        main.models.Payment[] paymentArray12 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList13 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList13, paymentArray12);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList13);
        java.lang.String str16 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "227) test0408(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentArray12);
        org.junit.Assert.assertArrayEquals(paymentArray12, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator7.getPayments();
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus30 = null;
        main.models.HeadLabCoordinator headLabCoordinator31 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus30);
        main.models.LabManager labManager32 = headLabCoordinator31.createLabManager();
        double double33 = headLabCoordinator31.getHourlyRate();
        main.models.Payment payment34 = null;
        headLabCoordinator31.addPayment(payment34);
        java.util.List<main.models.Payment> paymentList36 = headLabCoordinator31.getPayments();
        java.lang.String str37 = headLabCoordinator31.getUserId();
        java.lang.String str38 = headLabCoordinator31.getDepartment();
        main.enums.AccountStatus accountStatus45 = null;
        main.models.HeadLabCoordinator headLabCoordinator46 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus45);
        main.models.LabManager labManager47 = headLabCoordinator46.createLabManager();
        double double48 = headLabCoordinator46.getHourlyRate();
        main.models.Payment payment49 = null;
        headLabCoordinator46.addPayment(payment49);
        java.util.List<main.models.Payment> paymentList51 = headLabCoordinator46.getPayments();
        main.models.ApprovalRequest approvalRequest52 = null;
// flaky "228) test0409(RegressionTest0)":         headLabCoordinator46.addApprovalRequest(approvalRequest52);
        main.enums.AccountStatus accountStatus60 = null;
        main.models.HeadLabCoordinator headLabCoordinator61 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus60);
        main.models.LabManager labManager62 = headLabCoordinator61.createLabManager();
        double double63 = headLabCoordinator61.getHourlyRate();
        main.models.Payment payment64 = null;
        headLabCoordinator61.addPayment(payment64);
        java.lang.String str66 = headLabCoordinator61.getName();
        boolean boolean67 = headLabCoordinator61.isUniversityAffiliated();
        java.lang.String str68 = headLabCoordinator61.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList69 = headLabCoordinator61.getApprovalRequests();
        headLabCoordinator46.setApprovalRequests(approvalRequestList69);
        headLabCoordinator31.setApprovalRequests(approvalRequestList69);
        headLabCoordinator7.setApprovalRequests(approvalRequestList69);
        java.lang.String str73 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus80 = null;
        main.models.HeadLabCoordinator headLabCoordinator81 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus80);
        java.util.List<main.models.Reservation> reservationList82 = headLabCoordinator81.getReservations();
        java.util.List<main.models.Payment> paymentList83 = headLabCoordinator81.getPayments();
        headLabCoordinator81.setDepartment("hi!");
        main.models.Payment[] paymentArray86 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList87 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList87, paymentArray86);
        headLabCoordinator81.setPayments((java.util.List<main.models.Payment>) paymentList87);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList87);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
// flaky "118) test0409(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertNotNull(labManager32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertNotNull(labManager47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList51);
        org.junit.Assert.assertNotNull(headLabCoordinator61);
        org.junit.Assert.assertNotNull(labManager62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
// flaky "48) test0409(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headLabCoordinator81);
// flaky "33) test0409(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList82);
        org.junit.Assert.assertNotNull(paymentList83);
        org.junit.Assert.assertNotNull(paymentArray86);
        org.junit.Assert.assertArrayEquals(paymentArray86, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Reservation> reservationList47 = headLabCoordinator7.getReservations();
        java.lang.String str48 = headLabCoordinator7.getDepartment();
        java.lang.String str49 = headLabCoordinator7.getName();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
// flaky "229) test0410(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky "119) test0410(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList15 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus22);
        headLabCoordinator23.setEmail("");
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus32);
        java.lang.String str34 = headLabCoordinator33.getName();
        main.models.Payment[] paymentArray35 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList36 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList36, paymentArray35);
        headLabCoordinator33.setPayments((java.util.List<main.models.Payment>) paymentList36);
        headLabCoordinator23.setPayments((java.util.List<main.models.Payment>) paymentList36);
        java.util.List<main.models.Payment> paymentList40 = headLabCoordinator23.getPayments();
        headLabCoordinator7.setPayments(paymentList40);
        main.enums.AccountStatus accountStatus48 = null;
        main.models.HeadLabCoordinator headLabCoordinator49 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus48);
        boolean boolean50 = headLabCoordinator49.isUniversityAffiliated();
        headLabCoordinator49.setIdOrCertificationNumber("");
        double double53 = headLabCoordinator49.getHourlyRate();
        main.models.Reservation reservation54 = null;
// flaky "230) test0411(RegressionTest0)":         headLabCoordinator49.addReservation(reservation54);
        headLabCoordinator49.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus64 = null;
        main.models.HeadLabCoordinator headLabCoordinator65 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus64);
        java.lang.String str66 = headLabCoordinator65.getIdOrCertificationNumber();
        java.lang.String str67 = headLabCoordinator65.getEmail();
        java.lang.String str68 = headLabCoordinator65.getDepartment();
        double double69 = headLabCoordinator65.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList70 = headLabCoordinator65.getReservations();
        headLabCoordinator49.setReservations(reservationList70);
        headLabCoordinator7.setReservations(reservationList70);
        java.util.List<main.models.ApprovalRequest> approvalRequestList73 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(approvalRequestList15);
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(paymentArray35);
        org.junit.Assert.assertArrayEquals(paymentArray35, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(paymentList40);
        org.junit.Assert.assertNotNull(headLabCoordinator49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
// flaky "120) test0411(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList70);
        org.junit.Assert.assertNotNull(approvalRequestList73);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.models.Payment payment13 = null;
        headLabCoordinator7.addPayment(payment13);
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        main.models.Reservation reservation17 = null;
// flaky "231) test0412(RegressionTest0)":         headLabCoordinator7.addReservation(reservation17);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "232) test0413(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setEmail("");
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str15 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "233) test0414(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
// flaky "121) test0414(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean11 = headLabCoordinator7.isUniversityAffiliated();
        main.models.ApprovalRequest approvalRequest12 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest12);
        java.util.List<main.models.Reservation> reservationList14 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky "234) test0415(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.HeadLabCoordinator headLabCoordinator15 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus14);
        main.models.LabManager labManager16 = headLabCoordinator15.createLabManager();
        double double17 = headLabCoordinator15.getHourlyRate();
        main.models.Payment payment18 = null;
        headLabCoordinator15.addPayment(payment18);
        java.lang.String str20 = headLabCoordinator15.getEmail();
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator15.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        main.models.ApprovalRequest approvalRequest23 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest23);
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator15);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.models.LabManager labManager14 = headLabCoordinator7.createLabManager();
        java.lang.String str15 = headLabCoordinator7.getEmail();
        main.models.ApprovalRequest approvalRequest16 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest16);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "235) test0418(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        main.enums.AccountStatus accountStatus28 = headLabCoordinator22.getStatus();
        java.lang.String str29 = headLabCoordinator22.getUserId();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        headLabCoordinator37.setPassword("hi!");
        java.lang.String str46 = headLabCoordinator37.getName();
        main.enums.AccountStatus accountStatus53 = null;
        main.models.HeadLabCoordinator headLabCoordinator54 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus53);
        main.models.LabManager labManager55 = headLabCoordinator54.createLabManager();
        double double56 = headLabCoordinator54.getHourlyRate();
        main.models.Payment payment57 = null;
        headLabCoordinator54.addPayment(payment57);
        java.lang.String str59 = headLabCoordinator54.getName();
        java.lang.String str60 = headLabCoordinator54.getName();
        main.models.ApprovalRequest[] approvalRequestArray61 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList62 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList62, approvalRequestArray61);
        headLabCoordinator54.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator22.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList62);
        double double68 = headLabCoordinator7.getHourlyRate();
        java.lang.String str69 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "122) test0418(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "49) test0418(RegressionTest0)":         org.junit.Assert.assertNull(approvalRequestList14);
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNull(accountStatus28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
// flaky "34) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
// flaky "20) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
// flaky "11) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator54);
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
// flaky "4) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
// flaky "2) test0418(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray61);
        org.junit.Assert.assertArrayEquals(approvalRequestArray61, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator7.getApprovalRequests();
        main.enums.AccountStatus accountStatus32 = null;
        main.models.HeadLabCoordinator headLabCoordinator33 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus32);
        java.lang.String str34 = headLabCoordinator33.getName();
        main.models.Payment[] paymentArray35 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList36 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList36, paymentArray35);
        headLabCoordinator33.setPayments((java.util.List<main.models.Payment>) paymentList36);
        java.lang.String str39 = headLabCoordinator33.getUserId();
        boolean boolean40 = headLabCoordinator33.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus47 = null;
        main.models.HeadLabCoordinator headLabCoordinator48 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus47);
        main.models.LabManager labManager49 = headLabCoordinator48.createLabManager();
        headLabCoordinator48.setPassword("");
        main.enums.AccountStatus accountStatus58 = null;
        main.models.HeadLabCoordinator headLabCoordinator59 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus58);
        main.models.Reservation reservation60 = null;
// flaky "236) test0419(RegressionTest0)":         headLabCoordinator59.addReservation(reservation60);
        java.util.List<main.models.Reservation> reservationList62 = headLabCoordinator59.getReservations();
        headLabCoordinator48.setReservations(reservationList62);
        headLabCoordinator33.setReservations(reservationList62);
        headLabCoordinator7.setReservations(reservationList62);
        main.models.Reservation reservation66 = null;
// flaky "123) test0419(RegressionTest0)":         headLabCoordinator7.addReservation(reservation66);
        main.models.Reservation reservation68 = null;
// flaky "50) test0419(RegressionTest0)":         headLabCoordinator7.addReservation(reservation68);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
// flaky "35) test0419(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
// flaky "21) test0419(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(paymentArray35);
        org.junit.Assert.assertArrayEquals(paymentArray35, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator48);
        org.junit.Assert.assertNotNull(labManager49);
        org.junit.Assert.assertNotNull(headLabCoordinator59);
// flaky "12) test0419(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList62);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.Class<?> wildcardClass13 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "237) test0420(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        java.lang.String str24 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator32.getPayments();
        main.enums.AccountStatus accountStatus38 = headLabCoordinator32.getStatus();
        java.lang.String str39 = headLabCoordinator32.getUserId();
        main.enums.AccountStatus accountStatus46 = null;
        main.models.HeadLabCoordinator headLabCoordinator47 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus46);
        main.models.LabManager labManager48 = headLabCoordinator47.createLabManager();
        double double49 = headLabCoordinator47.getHourlyRate();
        main.models.Payment payment50 = null;
        headLabCoordinator47.addPayment(payment50);
        java.lang.String str52 = headLabCoordinator47.getName();
        java.lang.String str53 = headLabCoordinator47.getName();
        headLabCoordinator47.setPassword("hi!");
        java.lang.String str56 = headLabCoordinator47.getName();
        main.enums.AccountStatus accountStatus63 = null;
        main.models.HeadLabCoordinator headLabCoordinator64 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus63);
        main.models.LabManager labManager65 = headLabCoordinator64.createLabManager();
        double double66 = headLabCoordinator64.getHourlyRate();
        main.models.Payment payment67 = null;
        headLabCoordinator64.addPayment(payment67);
        java.lang.String str69 = headLabCoordinator64.getName();
        java.lang.String str70 = headLabCoordinator64.getName();
        main.models.ApprovalRequest[] approvalRequestArray71 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList72 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList72, approvalRequestArray71);
        headLabCoordinator64.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator47.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator32.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        main.models.LabManager labManager78 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus79 = null;
        headLabCoordinator7.setStatus(accountStatus79);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(accountStatus38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
// flaky "238) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
// flaky "124) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
// flaky "51) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertNotNull(labManager65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
// flaky "36) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
// flaky "22) test0421(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray71);
        org.junit.Assert.assertArrayEquals(approvalRequestArray71, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(labManager78);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "hi!", "hi!", "", accountStatus6);
        main.models.ApprovalRequest approvalRequest8 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest8);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        double double9 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.models.ApprovalRequest approvalRequest12 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest12);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "239) test0423(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList10 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getName();
        main.models.Reservation reservation14 = null;
// flaky "240) test0424(RegressionTest0)":         headLabCoordinator7.addReservation(reservation14);
        java.lang.String str16 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus23);
        main.enums.AccountStatus accountStatus25 = headLabCoordinator24.getStatus();
        java.util.List<main.models.Reservation> reservationList26 = headLabCoordinator24.getReservations();
        headLabCoordinator7.setReservations(reservationList26);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(approvalRequestList10);
// flaky "125) test0424(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "52) test0424(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNull(accountStatus25);
// flaky "37) test0424(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        main.models.Payment payment12 = null;
        headLabCoordinator7.addPayment(payment12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.util.List<main.models.ApprovalRequest> approvalRequestList8 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(approvalRequestList8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation9 = null;
// flaky "241) test0427(RegressionTest0)":         headLabCoordinator7.addReservation(reservation9);
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky "126) test0427(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        main.enums.AccountStatus accountStatus30 = null;
        main.models.HeadLabCoordinator headLabCoordinator31 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus30);
        boolean boolean32 = headLabCoordinator31.isUniversityAffiliated();
        java.lang.String str33 = headLabCoordinator31.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList34 = headLabCoordinator31.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList34);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(approvalRequestList34);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "242) test0429(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setPassword("hi!");
        boolean boolean14 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus15 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(accountStatus15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        headLabCoordinator7.setUserId("hi!");
        double double14 = headLabCoordinator7.getHourlyRate();
        boolean boolean15 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.ApprovalRequest> approvalRequestList16 = headLabCoordinator7.getApprovalRequests();
        main.models.LabManager labManager17 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(approvalRequestList16);
        org.junit.Assert.assertNotNull(labManager17);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        main.models.Payment payment13 = null;
        headLabCoordinator7.addPayment(payment13);
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        headLabCoordinator7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        boolean boolean46 = headLabCoordinator7.isPasswordStrong();
        main.models.Reservation reservation47 = null;
// flaky "243) test0432(RegressionTest0)":         headLabCoordinator7.addReservation(reservation47);
        java.util.List<main.models.ApprovalRequest> approvalRequestList49 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList49);
        java.lang.String str51 = headLabCoordinator7.getPassword();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus60 = null;
        main.models.HeadLabCoordinator headLabCoordinator61 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus60);
        main.models.LabManager labManager62 = headLabCoordinator61.createLabManager();
        double double63 = headLabCoordinator61.getHourlyRate();
        main.models.Payment payment64 = null;
        headLabCoordinator61.addPayment(payment64);
        java.lang.String str66 = headLabCoordinator61.getEmail();
        main.models.Reservation reservation67 = null;
// flaky "127) test0432(RegressionTest0)":         headLabCoordinator61.addReservation(reservation67);
        java.lang.String str69 = headLabCoordinator61.getEmail();
        headLabCoordinator61.setEmail("hi!");
        main.enums.AccountStatus accountStatus78 = null;
        main.models.HeadLabCoordinator headLabCoordinator79 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus78);
        boolean boolean80 = headLabCoordinator79.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus87 = null;
        main.models.HeadLabCoordinator headLabCoordinator88 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus87);
        main.models.LabManager labManager89 = headLabCoordinator88.createLabManager();
        double double90 = headLabCoordinator88.getHourlyRate();
        main.models.Payment payment91 = null;
        headLabCoordinator88.addPayment(payment91);
        java.lang.String str93 = headLabCoordinator88.getEmail();
        java.util.List<main.models.Payment> paymentList94 = headLabCoordinator88.getPayments();
        headLabCoordinator79.setPayments(paymentList94);
        headLabCoordinator61.setPayments(paymentList94);
        headLabCoordinator7.setPayments(paymentList94);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
// flaky "53) test0432(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator61);
        org.junit.Assert.assertNotNull(labManager62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.0d + "'", double63 == 0.0d);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(headLabCoordinator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator88);
        org.junit.Assert.assertNotNull(labManager89);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertNotNull(paymentList94);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean11 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus12 = null;
        headLabCoordinator7.setStatus(accountStatus12);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        main.enums.AccountStatus accountStatus18 = headLabCoordinator16.getStatus();
        java.lang.String str19 = headLabCoordinator16.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList20 = headLabCoordinator16.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList20);
        java.lang.String str22 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertNull(accountStatus18);
// flaky "244) test0434(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(approvalRequestList20);
// flaky "128) test0434(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setName("hi!");
        java.lang.String str14 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation12 = null;
// flaky "245) test0436(RegressionTest0)":         headLabCoordinator7.addReservation(reservation12);
        double double14 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str14 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setDepartment("hi!");
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus23);
        boolean boolean25 = headLabCoordinator24.isUniversityAffiliated();
        headLabCoordinator24.setIdOrCertificationNumber("");
        double double28 = headLabCoordinator24.getHourlyRate();
        main.models.Reservation reservation29 = null;
// flaky "246) test0438(RegressionTest0)":         headLabCoordinator24.addReservation(reservation29);
        headLabCoordinator24.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus39 = null;
        main.models.HeadLabCoordinator headLabCoordinator40 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus39);
        java.lang.String str41 = headLabCoordinator40.getIdOrCertificationNumber();
        java.lang.String str42 = headLabCoordinator40.getEmail();
        java.lang.String str43 = headLabCoordinator40.getDepartment();
        double double44 = headLabCoordinator40.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList45 = headLabCoordinator40.getReservations();
        headLabCoordinator24.setReservations(reservationList45);
        headLabCoordinator7.setReservations(reservationList45);
        java.util.List<main.models.ApprovalRequest> approvalRequestList48 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "129) test0438(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
// flaky "54) test0438(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList45);
        org.junit.Assert.assertNull(approvalRequestList48);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.lang.String str25 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("hi!");
        boolean boolean28 = headLabCoordinator7.isUniversityAffiliated();
        main.models.ApprovalRequest approvalRequest29 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest29);
// flaky "247) test0439(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
// flaky "130) test0439(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus23);
        main.models.LabManager labManager25 = headLabCoordinator24.createLabManager();
        double double26 = headLabCoordinator24.getHourlyRate();
        main.models.Payment payment27 = null;
        headLabCoordinator24.addPayment(payment27);
        java.lang.String str29 = headLabCoordinator24.getName();
        java.lang.String str30 = headLabCoordinator24.getName();
        main.models.ApprovalRequest[] approvalRequestArray31 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList32 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList32, approvalRequestArray31);
        headLabCoordinator24.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList32);
        main.enums.AccountStatus accountStatus42 = null;
        main.models.HeadLabCoordinator headLabCoordinator43 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus42);
        java.util.List<main.models.Reservation> reservationList44 = headLabCoordinator43.getReservations();
        headLabCoordinator7.setReservations(reservationList44);
        main.enums.AccountStatus accountStatus52 = null;
        main.models.HeadLabCoordinator headLabCoordinator53 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus52);
        boolean boolean54 = headLabCoordinator53.isUniversityAffiliated();
        headLabCoordinator53.setIdOrCertificationNumber("");
        java.lang.String str57 = headLabCoordinator53.getUserId();
        headLabCoordinator53.setEmail("hi!");
        java.lang.String str60 = headLabCoordinator53.getName();
        java.lang.String str61 = headLabCoordinator53.getIdOrCertificationNumber();
        main.models.ApprovalRequest approvalRequest62 = null;
        headLabCoordinator53.addApprovalRequest(approvalRequest62);
        java.util.List<main.models.ApprovalRequest> approvalRequestList64 = headLabCoordinator53.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList64);
        main.models.Reservation reservation66 = null;
// flaky "248) test0440(RegressionTest0)":         headLabCoordinator7.addReservation(reservation66);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "131) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "55) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "38) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
// flaky "23) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
// flaky "13) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray31);
        org.junit.Assert.assertArrayEquals(approvalRequestArray31, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
// flaky "5) test0440(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList44);
        org.junit.Assert.assertNotNull(headLabCoordinator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
// flaky "3) test0440(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(approvalRequestList64);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "hi!", "", "hi!", accountStatus6);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus19);
        boolean boolean21 = headLabCoordinator20.isUniversityAffiliated();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator20.getPayments();
        main.enums.AccountStatus accountStatus23 = headLabCoordinator20.getStatus();
        java.util.List<main.models.Reservation> reservationList24 = headLabCoordinator20.getReservations();
        headLabCoordinator7.setReservations(reservationList24);
        headLabCoordinator7.setName("hi!");
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
// flaky "249) test0442(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "132) test0442(RegressionTest0)":         org.junit.Assert.assertNull(paymentList22);
        org.junit.Assert.assertNull(accountStatus23);
// flaky "56) test0442(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList24);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation10 = null;
// flaky "250) test0443(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        java.lang.String str12 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
// flaky "133) test0443(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        java.lang.Class<?> wildcardClass11 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus15);
        java.util.List<main.models.Reservation> reservationList17 = headLabCoordinator16.getReservations();
        headLabCoordinator7.setReservations(reservationList17);
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        java.lang.String str20 = headLabCoordinator7.getPassword();
        main.models.Payment payment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment21);
// flaky "251) test0445(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "134) test0445(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headLabCoordinator16);
// flaky "57) test0445(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str12 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus19);
        main.models.LabManager labManager21 = headLabCoordinator20.createLabManager();
        double double22 = headLabCoordinator20.getHourlyRate();
        main.models.Payment payment23 = null;
        headLabCoordinator20.addPayment(payment23);
        java.lang.String str25 = headLabCoordinator20.getName();
        java.lang.String str26 = headLabCoordinator20.getName();
        headLabCoordinator20.setPassword("hi!");
        java.lang.String str29 = headLabCoordinator20.getName();
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        java.lang.String str43 = headLabCoordinator37.getName();
        main.models.ApprovalRequest[] approvalRequestArray44 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList45 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList45, approvalRequestArray44);
        headLabCoordinator37.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator20.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList45);
        main.models.LabManager labManager50 = headLabCoordinator7.createLabManager();
        main.models.ApprovalRequest approvalRequest51 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest51);
        main.models.Reservation reservation53 = null;
// flaky "252) test0446(RegressionTest0)":         headLabCoordinator7.addReservation(reservation53);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(labManager50);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "hi!", "", "hi!", accountStatus6);
        main.models.Payment payment8 = null;
        headLabCoordinator7.addPayment(payment8);
        main.enums.AccountStatus accountStatus10 = null;
        headLabCoordinator7.setStatus(accountStatus10);
        java.lang.String str12 = headLabCoordinator7.getUserId();
        main.models.ApprovalRequest approvalRequest13 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "253) test0448(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str14 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        headLabCoordinator7.setPayments(paymentList27);
        boolean boolean29 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "135) test0448(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
// flaky "58) test0448(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus12 = headLabCoordinator7.getStatus();
        main.models.Payment payment13 = null;
        headLabCoordinator7.addPayment(payment13);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertNotNull(paymentList10);
// flaky "254) test0449(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(accountStatus12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
// flaky "255) test0450(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        java.util.List<main.models.Payment> paymentList15 = null;
        headLabCoordinator7.setPayments(paymentList15);
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("hi!");
        double double22 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "136) test0450(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        java.lang.String str10 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setDepartment("hi!");
        main.models.Payment payment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addPayment(payment13);
// flaky "256) test0451(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.payments\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getName();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "257) test0452(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str10 = headLabCoordinator7.getName();
        java.lang.String str11 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass12 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        boolean boolean12 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str13 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.Class<?> wildcardClass14 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus15);
        java.util.List<main.models.Reservation> reservationList17 = headLabCoordinator16.getReservations();
        headLabCoordinator7.setReservations(reservationList17);
        java.lang.String str19 = headLabCoordinator7.getDepartment();
        java.lang.String str20 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator16);
// flaky "258) test0455(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        main.enums.AccountStatus accountStatus13 = null;
        headLabCoordinator7.setStatus(accountStatus13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str18 = headLabCoordinator7.getUserId();
        java.lang.Class<?> wildcardClass19 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "259) test0456(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky "137) test0456(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setUserId("");
        java.lang.String str15 = headLabCoordinator7.getName();
        java.util.List<main.models.Reservation> reservationList16 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setPassword("");
        java.lang.String str19 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky "260) test0457(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        java.lang.String str10 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        headLabCoordinator7.setReservations(reservationList19);
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass23 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
// flaky "261) test0458(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.LabManager labManager13 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(labManager13);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator7.getApprovalRequests();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
// flaky "262) test0460(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList25);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        boolean boolean15 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        boolean boolean18 = headLabCoordinator7.isUniversityAffiliated();
        main.models.LabManager labManager19 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
// flaky "263) test0461(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(labManager19);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = null;
        headLabCoordinator7.setApprovalRequests(approvalRequestList17);
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus25);
        headLabCoordinator26.setEmail("");
        main.enums.AccountStatus accountStatus35 = null;
        main.models.HeadLabCoordinator headLabCoordinator36 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus35);
        java.lang.String str37 = headLabCoordinator36.getName();
        main.models.Payment[] paymentArray38 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList39 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList39, paymentArray38);
        headLabCoordinator36.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator26.setPayments((java.util.List<main.models.Payment>) paymentList39);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList39);
        java.lang.String str44 = headLabCoordinator7.getName();
        main.enums.AccountStatus accountStatus45 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "264) test0462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky "138) test0462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "59) test0462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertNotNull(headLabCoordinator36);
// flaky "39) test0462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(paymentArray38);
        org.junit.Assert.assertArrayEquals(paymentArray38, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky "24) test0462(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertNull(accountStatus45);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.util.List<main.models.Payment> paymentList8 = headLabCoordinator7.getPayments();
        double double9 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        headLabCoordinator7.setReservations(reservationList23);
        main.models.Payment payment25 = null;
        headLabCoordinator7.addPayment(payment25);
        java.lang.String str27 = headLabCoordinator7.getPassword();
        java.lang.String str28 = headLabCoordinator7.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(approvalRequestList9);
// flaky "265) test0464(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
// flaky "139) test0464(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList21);
        java.lang.String str23 = headLabCoordinator7.getDepartment();
        java.lang.String str24 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus31 = null;
        main.models.HeadLabCoordinator headLabCoordinator32 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus31);
        main.models.LabManager labManager33 = headLabCoordinator32.createLabManager();
        double double34 = headLabCoordinator32.getHourlyRate();
        main.models.Payment payment35 = null;
        headLabCoordinator32.addPayment(payment35);
        java.util.List<main.models.Payment> paymentList37 = headLabCoordinator32.getPayments();
        main.enums.AccountStatus accountStatus38 = headLabCoordinator32.getStatus();
        java.lang.String str39 = headLabCoordinator32.getUserId();
        main.enums.AccountStatus accountStatus46 = null;
        main.models.HeadLabCoordinator headLabCoordinator47 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus46);
        main.models.LabManager labManager48 = headLabCoordinator47.createLabManager();
        double double49 = headLabCoordinator47.getHourlyRate();
        main.models.Payment payment50 = null;
        headLabCoordinator47.addPayment(payment50);
        java.lang.String str52 = headLabCoordinator47.getName();
        java.lang.String str53 = headLabCoordinator47.getName();
        headLabCoordinator47.setPassword("hi!");
        java.lang.String str56 = headLabCoordinator47.getName();
        main.enums.AccountStatus accountStatus63 = null;
        main.models.HeadLabCoordinator headLabCoordinator64 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus63);
        main.models.LabManager labManager65 = headLabCoordinator64.createLabManager();
        double double66 = headLabCoordinator64.getHourlyRate();
        main.models.Payment payment67 = null;
        headLabCoordinator64.addPayment(payment67);
        java.lang.String str69 = headLabCoordinator64.getName();
        java.lang.String str70 = headLabCoordinator64.getName();
        main.models.ApprovalRequest[] approvalRequestArray71 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList72 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList72, approvalRequestArray71);
        headLabCoordinator64.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator47.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator32.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList72);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
// flaky "266) test0465(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headLabCoordinator32);
        org.junit.Assert.assertNotNull(labManager33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList37);
        org.junit.Assert.assertNull(accountStatus38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertNotNull(labManager48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertNotNull(labManager65);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestArray71);
        org.junit.Assert.assertArrayEquals(approvalRequestArray71, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setDepartment("hi!");
        main.models.Payment[] paymentArray12 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList13 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList13, paymentArray12);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList13);
        java.util.List<main.models.Payment> paymentList16 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus23 = null;
        main.models.HeadLabCoordinator headLabCoordinator24 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus23);
        headLabCoordinator24.setDepartment("");
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator24.getPayments();
        headLabCoordinator7.setPayments(paymentList27);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "267) test0466(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentArray12);
        org.junit.Assert.assertArrayEquals(paymentArray12, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertNotNull(paymentList27);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "", "", "", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.LabManager labManager9 = headLabCoordinator7.createLabManager();
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(labManager9);
// flaky "268) test0467(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
// flaky "140) test0467(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "269) test0468(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setPassword("hi!");
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.Payment> paymentList15 = headLabCoordinator7.getPayments();
        main.models.LabManager labManager16 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(paymentList15);
        org.junit.Assert.assertNotNull(labManager16);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str21 = headLabCoordinator7.getPassword();
        main.enums.AccountStatus accountStatus28 = null;
        main.models.HeadLabCoordinator headLabCoordinator29 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus28);
        main.models.Reservation reservation30 = null;
// flaky "270) test0469(RegressionTest0)":         headLabCoordinator29.addReservation(reservation30);
        java.util.List<main.models.Reservation> reservationList32 = headLabCoordinator29.getReservations();
        java.util.List<main.models.Payment> paymentList33 = headLabCoordinator29.getPayments();
        headLabCoordinator29.setPassword("hi!");
        headLabCoordinator29.setPassword("");
        headLabCoordinator29.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList40 = null;
        headLabCoordinator29.setApprovalRequests(approvalRequestList40);
        java.util.List<main.models.Payment> paymentList42 = headLabCoordinator29.getPayments();
        headLabCoordinator7.setPayments(paymentList42);
        java.lang.String str44 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator29);
// flaky "141) test0469(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertNotNull(paymentList33);
        org.junit.Assert.assertNotNull(paymentList42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setEmail("");
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "271) test0470(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
// flaky "142) test0470(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        main.models.ApprovalRequest approvalRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest12);
// flaky "272) test0471(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        double double11 = headLabCoordinator7.getHourlyRate();
        main.models.Reservation reservation12 = null;
// flaky "273) test0472(RegressionTest0)":         headLabCoordinator7.addReservation(reservation12);
        double double14 = headLabCoordinator7.getHourlyRate();
        main.models.ApprovalRequest approvalRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            headLabCoordinator7.addApprovalRequest(approvalRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.add(Object)\" because \"this.approvalRequests\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus9 = headLabCoordinator7.getStatus();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        java.lang.Class<?> wildcardClass11 = headLabCoordinator7.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNull(accountStatus9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        main.models.Reservation reservation10 = null;
// flaky "274) test0474(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
// flaky "143) test0474(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        java.lang.String str19 = headLabCoordinator7.getName();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Reservation reservation9 = null;
// flaky "275) test0476(RegressionTest0)":         headLabCoordinator7.addReservation(reservation9);
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        main.models.LabManager labManager12 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "hi!", "", "hi!", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        double double13 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str15 = headLabCoordinator7.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "276) test0478(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(approvalRequestList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getDepartment();
        double double14 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setName("");
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "277) test0479(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNull(approvalRequestList17);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        double double9 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str12 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "278) test0481(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        main.enums.AccountStatus accountStatus18 = null;
        main.models.HeadLabCoordinator headLabCoordinator19 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus18);
        boolean boolean20 = headLabCoordinator19.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus27 = null;
        main.models.HeadLabCoordinator headLabCoordinator28 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus27);
        main.models.LabManager labManager29 = headLabCoordinator28.createLabManager();
        double double30 = headLabCoordinator28.getHourlyRate();
        main.models.Payment payment31 = null;
        headLabCoordinator28.addPayment(payment31);
        java.lang.String str33 = headLabCoordinator28.getEmail();
        java.util.List<main.models.Payment> paymentList34 = headLabCoordinator28.getPayments();
        headLabCoordinator19.setPayments(paymentList34);
        headLabCoordinator7.setPayments(paymentList34);
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus39 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator28);
        org.junit.Assert.assertNotNull(labManager29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(paymentList34);
        org.junit.Assert.assertNull(accountStatus39);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        java.lang.String str12 = headLabCoordinator7.getName();
        boolean boolean13 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setUserId("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky "144) test0482(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(accountStatus13);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("");
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Reservation reservation15 = null;
// flaky "279) test0485(RegressionTest0)":         headLabCoordinator7.addReservation(reservation15);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        java.util.List<main.models.Reservation> reservationList11 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky "280) test0486(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        boolean boolean15 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus22 = null;
        main.models.HeadLabCoordinator headLabCoordinator23 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus22);
        boolean boolean24 = headLabCoordinator23.isUniversityAffiliated();
        headLabCoordinator23.setIdOrCertificationNumber("");
        java.lang.String str27 = headLabCoordinator23.getUserId();
        headLabCoordinator23.setEmail("hi!");
        java.lang.String str30 = headLabCoordinator23.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus37 = null;
        main.models.HeadLabCoordinator headLabCoordinator38 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus37);
        main.models.LabManager labManager39 = headLabCoordinator38.createLabManager();
        double double40 = headLabCoordinator38.getHourlyRate();
        main.models.Payment payment41 = null;
        headLabCoordinator38.addPayment(payment41);
        java.lang.String str43 = headLabCoordinator38.getName();
        java.lang.String str44 = headLabCoordinator38.getName();
        headLabCoordinator38.setPassword("hi!");
        java.lang.String str47 = headLabCoordinator38.getName();
        main.models.Payment payment48 = null;
        headLabCoordinator38.addPayment(payment48);
        boolean boolean50 = headLabCoordinator38.isPasswordStrong();
        boolean boolean51 = headLabCoordinator38.isUniversityAffiliated();
        java.lang.String str52 = headLabCoordinator38.getPassword();
        main.enums.AccountStatus accountStatus59 = null;
        main.models.HeadLabCoordinator headLabCoordinator60 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus59);
        main.models.Reservation reservation61 = null;
// flaky "281) test0487(RegressionTest0)":         headLabCoordinator60.addReservation(reservation61);
        java.util.List<main.models.Reservation> reservationList63 = headLabCoordinator60.getReservations();
        java.util.List<main.models.Payment> paymentList64 = headLabCoordinator60.getPayments();
        headLabCoordinator60.setPassword("hi!");
        headLabCoordinator60.setPassword("");
        headLabCoordinator60.setUserId("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList71 = null;
        headLabCoordinator60.setApprovalRequests(approvalRequestList71);
        java.util.List<main.models.Payment> paymentList73 = headLabCoordinator60.getPayments();
        headLabCoordinator38.setPayments(paymentList73);
        headLabCoordinator23.setPayments(paymentList73);
        headLabCoordinator7.setPayments(paymentList73);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "145) test0487(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(headLabCoordinator38);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator60);
// flaky "60) test0487(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList63);
        org.junit.Assert.assertNotNull(paymentList64);
        org.junit.Assert.assertNotNull(paymentList73);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        main.models.Reservation reservation13 = null;
// flaky "282) test0488(RegressionTest0)":         headLabCoordinator7.addReservation(reservation13);
        java.lang.String str15 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str18 = headLabCoordinator7.getIdOrCertificationNumber();
        main.models.Reservation reservation19 = null;
// flaky "146) test0488(RegressionTest0)":         headLabCoordinator7.addReservation(reservation19);
        headLabCoordinator7.setEmail("");
        java.lang.String str23 = headLabCoordinator7.getIdOrCertificationNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "283) test0489(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setPassword("hi!");
        headLabCoordinator7.setPassword("");
        headLabCoordinator7.setUserId("hi!");
        double double18 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus25 = null;
        main.models.HeadLabCoordinator headLabCoordinator26 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus25);
        main.models.LabManager labManager27 = headLabCoordinator26.createLabManager();
        double double28 = headLabCoordinator26.getHourlyRate();
        main.models.Payment payment29 = null;
        headLabCoordinator26.addPayment(payment29);
        java.lang.String str31 = headLabCoordinator26.getEmail();
        main.models.Reservation reservation32 = null;
// flaky "147) test0489(RegressionTest0)":         headLabCoordinator26.addReservation(reservation32);
        java.lang.String str34 = headLabCoordinator26.getEmail();
        java.util.List<main.models.ApprovalRequest> approvalRequestList35 = headLabCoordinator26.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList35);
        main.enums.AccountStatus accountStatus43 = null;
        main.models.HeadLabCoordinator headLabCoordinator44 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus43);
        java.lang.String str45 = headLabCoordinator44.getEmail();
        headLabCoordinator44.setName("");
        main.enums.AccountStatus accountStatus54 = null;
        main.models.HeadLabCoordinator headLabCoordinator55 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus54);
        main.models.LabManager labManager56 = headLabCoordinator55.createLabManager();
        double double57 = headLabCoordinator55.getHourlyRate();
        main.models.Payment payment58 = null;
        headLabCoordinator55.addPayment(payment58);
        java.lang.String str60 = headLabCoordinator55.getName();
        java.lang.String str61 = headLabCoordinator55.getName();
        main.models.ApprovalRequest[] approvalRequestArray62 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList63 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList63, approvalRequestArray62);
        headLabCoordinator55.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator44.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList63);
        double double68 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "61) test0489(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertNotNull(labManager27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
// flaky "40) test0489(RegressionTest0)":         org.junit.Assert.assertNotNull(approvalRequestList35);
        org.junit.Assert.assertNotNull(headLabCoordinator44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(headLabCoordinator55);
        org.junit.Assert.assertNotNull(labManager56);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(approvalRequestArray62);
        org.junit.Assert.assertArrayEquals(approvalRequestArray62, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
// flaky "284) test0490(RegressionTest0)":         headLabCoordinator7.addReservation(reservation8);
        main.models.Reservation reservation10 = null;
// flaky "148) test0490(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str9 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus16 = null;
        main.models.HeadLabCoordinator headLabCoordinator17 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus16);
        main.models.LabManager labManager18 = headLabCoordinator17.createLabManager();
        double double19 = headLabCoordinator17.getHourlyRate();
        main.models.Payment payment20 = null;
        headLabCoordinator17.addPayment(payment20);
        java.lang.String str22 = headLabCoordinator17.getName();
        java.lang.String str23 = headLabCoordinator17.getName();
        headLabCoordinator17.setPassword("hi!");
        java.lang.String str26 = headLabCoordinator17.getName();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus33);
        main.models.LabManager labManager35 = headLabCoordinator34.createLabManager();
        double double36 = headLabCoordinator34.getHourlyRate();
        main.models.Payment payment37 = null;
        headLabCoordinator34.addPayment(payment37);
        java.lang.String str39 = headLabCoordinator34.getName();
        java.lang.String str40 = headLabCoordinator34.getName();
        main.models.ApprovalRequest[] approvalRequestArray41 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList42 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList42, approvalRequestArray41);
        headLabCoordinator34.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList42);
        headLabCoordinator17.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList42);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList42);
        main.enums.AccountStatus accountStatus53 = null;
        main.models.HeadLabCoordinator headLabCoordinator54 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus53);
        main.models.Reservation reservation55 = null;
// flaky "285) test0491(RegressionTest0)":         headLabCoordinator54.addReservation(reservation55);
        java.util.List<main.models.Reservation> reservationList57 = headLabCoordinator54.getReservations();
        java.util.List<main.models.Payment> paymentList58 = headLabCoordinator54.getPayments();
        headLabCoordinator54.setPassword("hi!");
        java.lang.String str61 = headLabCoordinator54.getEmail();
        main.enums.AccountStatus accountStatus68 = null;
        main.models.HeadLabCoordinator headLabCoordinator69 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus68);
        main.models.LabManager labManager70 = headLabCoordinator69.createLabManager();
        double double71 = headLabCoordinator69.getHourlyRate();
        main.models.Payment payment72 = null;
        headLabCoordinator69.addPayment(payment72);
        java.util.List<main.models.Payment> paymentList74 = headLabCoordinator69.getPayments();
        headLabCoordinator54.setPayments(paymentList74);
        headLabCoordinator7.setPayments(paymentList74);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator17);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(approvalRequestArray41);
        org.junit.Assert.assertArrayEquals(approvalRequestArray41, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator54);
// flaky "149) test0491(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList57);
        org.junit.Assert.assertNotNull(paymentList58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(headLabCoordinator69);
        org.junit.Assert.assertNotNull(labManager70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList74);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        headLabCoordinator7.setEmail("");
        main.models.Reservation reservation10 = null;
// flaky "286) test0492(RegressionTest0)":         headLabCoordinator7.addReservation(reservation10);
        headLabCoordinator7.setEmail("");
        main.models.ApprovalRequest approvalRequest14 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest14);
        java.util.List<main.models.Reservation> reservationList16 = headLabCoordinator7.getReservations();
        java.lang.String str17 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus18 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "150) test0492(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(accountStatus18);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        java.util.List<main.models.ApprovalRequest> approvalRequestList9 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setName("");
        headLabCoordinator7.setName("hi!");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus21);
        java.util.List<main.models.Reservation> reservationList23 = headLabCoordinator22.getReservations();
        headLabCoordinator7.setReservations(reservationList23);
        main.models.Payment payment25 = null;
        headLabCoordinator7.addPayment(payment25);
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setUserId("hi!");
        java.lang.String str31 = headLabCoordinator7.getName();
        main.models.LabManager labManager32 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(approvalRequestList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
// flaky "287) test0493(RegressionTest0)":         org.junit.Assert.assertNotNull(reservationList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(labManager32);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        main.models.HeadLabCoordinator headLabCoordinator16 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus15);
        main.models.LabManager labManager17 = headLabCoordinator16.createLabManager();
        double double18 = headLabCoordinator16.getHourlyRate();
        main.models.Payment payment19 = null;
        headLabCoordinator16.addPayment(payment19);
        java.lang.String str21 = headLabCoordinator16.getEmail();
        java.util.List<main.models.Payment> paymentList22 = headLabCoordinator16.getPayments();
        headLabCoordinator7.setPayments(paymentList22);
        java.lang.String str24 = headLabCoordinator7.getUserId();
        java.util.List<main.models.ApprovalRequest> approvalRequestList25 = headLabCoordinator7.getApprovalRequests();
        java.lang.String str26 = headLabCoordinator7.getUserId();
        boolean boolean27 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus28 = null;
        headLabCoordinator7.setStatus(accountStatus28);
        main.models.ApprovalRequest approvalRequest30 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest30);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
// flaky "288) test0494(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        boolean boolean15 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str16 = headLabCoordinator7.getDepartment();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky "289) test0495(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky "151) test0495(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.enums.AccountStatus accountStatus15 = null;
        headLabCoordinator7.setStatus(accountStatus15);
        boolean boolean17 = headLabCoordinator7.isPasswordStrong();
        main.models.LabManager labManager18 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(labManager18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str15 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
// flaky "290) test0498(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.lang.String str12 = headLabCoordinator7.getName();
        java.lang.String str13 = headLabCoordinator7.getName();
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str16 = headLabCoordinator7.getName();
        main.models.Payment payment17 = null;
        headLabCoordinator7.addPayment(payment17);
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        boolean boolean20 = headLabCoordinator7.isUniversityAffiliated();
        boolean boolean21 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setPassword("hi!");
        main.models.Reservation reservation24 = null;
// flaky "291) test0499(RegressionTest0)":         headLabCoordinator7.addReservation(reservation24);
        java.lang.String str26 = headLabCoordinator7.getEmail();
        main.models.LabManager labManager27 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky "152) test0499(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(labManager27);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus6);
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str10 = headLabCoordinator7.getEmail();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setEmail("");
        java.util.List<main.models.ApprovalRequest> approvalRequestList14 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "292) test0500(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertNotNull(approvalRequestList14);
    }
}
