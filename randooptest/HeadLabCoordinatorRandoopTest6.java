package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HeadLabCoordinatorRandoopTest6 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        headLabCoordinator7.setName("hi!");
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        double double11 = headLabCoordinator7.getHourlyRate();
        java.lang.String str12 = headLabCoordinator7.getName();
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        double double14 = headLabCoordinator7.getHourlyRate();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        java.util.List<main.models.Reservation> reservationList17 = headLabCoordinator7.getReservations();
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus24);
        main.models.Reservation reservation26 = null;
        headLabCoordinator25.addReservation(reservation26);
        main.models.Payment payment28 = null;
        headLabCoordinator25.addPayment(payment28);
        headLabCoordinator25.setPassword("hi!");
        boolean boolean32 = headLabCoordinator25.isUniversityAffiliated();
        java.util.List<main.models.Payment> paymentList33 = headLabCoordinator25.getPayments();
        headLabCoordinator7.setPayments(paymentList33);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(reservationList17);
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(paymentList33);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.Reservation reservation8 = null;
        headLabCoordinator7.addReservation(reservation8);
        java.util.List<main.models.Reservation> reservationList10 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList11 = headLabCoordinator7.getPayments();
        main.models.LabManager labManager12 = headLabCoordinator7.createLabManager();
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus19);
        boolean boolean21 = headLabCoordinator20.isUniversityAffiliated();
        headLabCoordinator20.setIdOrCertificationNumber("");
        java.lang.String str24 = headLabCoordinator20.getUserId();
        java.lang.String str25 = headLabCoordinator20.getName();
        boolean boolean26 = headLabCoordinator20.isPasswordStrong();
        main.enums.AccountStatus accountStatus33 = null;
        main.models.HeadLabCoordinator headLabCoordinator34 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus33);
        main.models.Reservation reservation35 = null;
        headLabCoordinator34.addReservation(reservation35);
        java.util.List<main.models.Reservation> reservationList37 = headLabCoordinator34.getReservations();
        java.util.List<main.models.Payment> paymentList38 = headLabCoordinator34.getPayments();
        headLabCoordinator34.setPassword("hi!");
        headLabCoordinator34.setPassword("");
        headLabCoordinator34.setUserId("hi!");
        headLabCoordinator34.setEmail("");
        java.util.List<main.models.Reservation> reservationList47 = headLabCoordinator34.getReservations();
        headLabCoordinator20.setReservations(reservationList47);
        headLabCoordinator7.setReservations(reservationList47);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky "1) test2503(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertNotNull(reservationList37);
        org.junit.Assert.assertNotNull(paymentList38);
        org.junit.Assert.assertNotNull(reservationList47);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "hi!", "hi!", "", "hi!", accountStatus6);
        headLabCoordinator7.setEmail("hi!");
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Reservation> reservationList12 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        main.models.Payment[] paymentArray9 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList10 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList10, paymentArray9);
        headLabCoordinator7.setPayments((java.util.List<main.models.Payment>) paymentList10);
        java.lang.String str13 = headLabCoordinator7.getUserId();
        boolean boolean14 = headLabCoordinator7.isUniversityAffiliated();
        main.models.LabManager labManager15 = headLabCoordinator7.createLabManager();
        main.models.Payment payment16 = null;
        headLabCoordinator7.addPayment(payment16);
        headLabCoordinator7.setName("hi!");
        java.lang.String str20 = headLabCoordinator7.getDepartment();
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(paymentArray9);
        org.junit.Assert.assertArrayEquals(paymentArray9, new main.models.Payment[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(labManager15);
// flaky "2) test2505(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        boolean boolean19 = headLabCoordinator7.isPasswordStrong();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        main.models.LabManager labManager12 = headLabCoordinator7.createLabManager();
        main.models.Reservation reservation13 = null;
        headLabCoordinator7.addReservation(reservation13);
        double double15 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        headLabCoordinator7.setPassword("hi!");
        java.lang.String str26 = headLabCoordinator7.getName();
        java.util.List<main.models.Reservation> reservationList27 = headLabCoordinator7.getReservations();
        java.lang.String str28 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus29 = headLabCoordinator7.getStatus();
        headLabCoordinator7.setDepartment("hi!");
        main.enums.AccountStatus accountStatus32 = null;
        headLabCoordinator7.setStatus(accountStatus32);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(reservationList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(accountStatus29);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus21);
        main.enums.AccountStatus accountStatus23 = headLabCoordinator22.getStatus();
        boolean boolean24 = headLabCoordinator22.isPasswordStrong();
        double double25 = headLabCoordinator22.getHourlyRate();
        headLabCoordinator22.setPassword("hi!");
        java.lang.String str28 = headLabCoordinator22.getEmail();
        java.lang.String str29 = headLabCoordinator22.getDepartment();
        java.util.List<main.models.ApprovalRequest> approvalRequestList30 = headLabCoordinator22.getApprovalRequests();
        headLabCoordinator7.setApprovalRequests(approvalRequestList30);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNull(accountStatus23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(approvalRequestList30);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.models.Payment payment10 = null;
        headLabCoordinator7.addPayment(payment10);
        java.util.List<main.models.Payment> paymentList12 = headLabCoordinator7.getPayments();
        java.lang.String str13 = headLabCoordinator7.getUserId();
        java.lang.String str14 = headLabCoordinator7.getDepartment();
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus21);
        main.models.LabManager labManager23 = headLabCoordinator22.createLabManager();
        double double24 = headLabCoordinator22.getHourlyRate();
        main.models.Payment payment25 = null;
        headLabCoordinator22.addPayment(payment25);
        java.util.List<main.models.Payment> paymentList27 = headLabCoordinator22.getPayments();
        main.models.ApprovalRequest approvalRequest28 = null;
        headLabCoordinator22.addApprovalRequest(approvalRequest28);
        main.enums.AccountStatus accountStatus36 = null;
        main.models.HeadLabCoordinator headLabCoordinator37 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus36);
        main.models.LabManager labManager38 = headLabCoordinator37.createLabManager();
        double double39 = headLabCoordinator37.getHourlyRate();
        main.models.Payment payment40 = null;
        headLabCoordinator37.addPayment(payment40);
        java.lang.String str42 = headLabCoordinator37.getName();
        boolean boolean43 = headLabCoordinator37.isUniversityAffiliated();
        java.lang.String str44 = headLabCoordinator37.getIdOrCertificationNumber();
        java.util.List<main.models.ApprovalRequest> approvalRequestList45 = headLabCoordinator37.getApprovalRequests();
        headLabCoordinator22.setApprovalRequests(approvalRequestList45);
        headLabCoordinator7.setApprovalRequests(approvalRequestList45);
        headLabCoordinator7.setDepartment("");
        java.lang.String str50 = headLabCoordinator7.getEmail();
        java.lang.String str51 = headLabCoordinator7.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList27);
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(approvalRequestList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        java.lang.String str12 = headLabCoordinator7.getIdOrCertificationNumber();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus21 = null;
        main.models.HeadLabCoordinator headLabCoordinator22 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus21);
        java.lang.String str23 = headLabCoordinator22.getEmail();
        main.enums.AccountStatus accountStatus30 = null;
        main.models.HeadLabCoordinator headLabCoordinator31 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus30);
        java.util.List<main.models.Reservation> reservationList32 = headLabCoordinator31.getReservations();
        headLabCoordinator22.setReservations(reservationList32);
        headLabCoordinator7.setReservations(reservationList32);
        main.enums.AccountStatus accountStatus35 = null;
        headLabCoordinator7.setStatus(accountStatus35);
        headLabCoordinator7.setName("");
        boolean boolean39 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headLabCoordinator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertNotNull(reservationList32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isPasswordStrong();
        double double9 = headLabCoordinator7.getHourlyRate();
        java.util.List<main.models.Reservation> reservationList10 = null;
        headLabCoordinator7.setReservations(reservationList10);
        boolean boolean12 = headLabCoordinator7.isPasswordStrong();
        java.lang.String str13 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setEmail("hi!");
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "hi!", "hi!", "", "hi!", "hi!", accountStatus6);
        main.models.ApprovalRequest approvalRequest8 = null;
        headLabCoordinator7.addApprovalRequest(approvalRequest8);
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus10);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        java.lang.String str10 = headLabCoordinator7.getUserId();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(accountStatus11);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        java.lang.String str32 = headLabCoordinator7.getUserId();
        double double33 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertNotNull(labManager17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertNotNull(approvalRequestList31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setPassword("");
        boolean boolean13 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus14 = null;
        headLabCoordinator7.setStatus(accountStatus14);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus14 = null;
        main.models.HeadLabCoordinator headLabCoordinator15 = main.models.HeadLabCoordinator.getInstance("", "", "", "hi!", "hi!", "", accountStatus14);
        headLabCoordinator15.setDepartment("hi!");
        java.lang.String str18 = headLabCoordinator15.getEmail();
        java.lang.String str19 = headLabCoordinator15.getName();
        main.enums.AccountStatus accountStatus26 = null;
        main.models.HeadLabCoordinator headLabCoordinator27 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus26);
        main.models.LabManager labManager28 = headLabCoordinator27.createLabManager();
        double double29 = headLabCoordinator27.getHourlyRate();
        main.models.Payment payment30 = null;
        headLabCoordinator27.addPayment(payment30);
        java.util.List<main.models.Payment> paymentList32 = headLabCoordinator27.getPayments();
        main.enums.AccountStatus accountStatus33 = headLabCoordinator27.getStatus();
        java.lang.String str34 = headLabCoordinator27.getUserId();
        main.enums.AccountStatus accountStatus41 = null;
        main.models.HeadLabCoordinator headLabCoordinator42 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus41);
        main.models.LabManager labManager43 = headLabCoordinator42.createLabManager();
        double double44 = headLabCoordinator42.getHourlyRate();
        main.models.Payment payment45 = null;
        headLabCoordinator42.addPayment(payment45);
        java.lang.String str47 = headLabCoordinator42.getName();
        java.lang.String str48 = headLabCoordinator42.getName();
        headLabCoordinator42.setPassword("hi!");
        java.lang.String str51 = headLabCoordinator42.getName();
        main.enums.AccountStatus accountStatus58 = null;
        main.models.HeadLabCoordinator headLabCoordinator59 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus58);
        main.models.LabManager labManager60 = headLabCoordinator59.createLabManager();
        double double61 = headLabCoordinator59.getHourlyRate();
        main.models.Payment payment62 = null;
        headLabCoordinator59.addPayment(payment62);
        java.lang.String str64 = headLabCoordinator59.getName();
        java.lang.String str65 = headLabCoordinator59.getName();
        main.models.ApprovalRequest[] approvalRequestArray66 = new main.models.ApprovalRequest[] {};
        java.util.ArrayList<main.models.ApprovalRequest> approvalRequestList67 = new java.util.ArrayList<main.models.ApprovalRequest>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.ApprovalRequest>) approvalRequestList67, approvalRequestArray66);
        headLabCoordinator59.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList67);
        headLabCoordinator42.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList67);
        headLabCoordinator27.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList67);
        headLabCoordinator15.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList67);
        headLabCoordinator7.setApprovalRequests((java.util.List<main.models.ApprovalRequest>) approvalRequestList67);
        main.enums.AccountStatus accountStatus74 = headLabCoordinator7.getStatus();
        java.lang.String str75 = headLabCoordinator7.getDepartment();
        boolean boolean76 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headLabCoordinator27);
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(paymentList32);
        org.junit.Assert.assertNull(accountStatus33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertNotNull(labManager43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(headLabCoordinator59);
        org.junit.Assert.assertNotNull(labManager60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(approvalRequestArray66);
        org.junit.Assert.assertArrayEquals(approvalRequestArray66, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(accountStatus74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        headLabCoordinator7.setName("");
        main.models.Payment payment20 = null;
        headLabCoordinator7.addPayment(payment20);
        main.models.LabManager labManager22 = headLabCoordinator7.createLabManager();
        headLabCoordinator7.setIdOrCertificationNumber("hi!");
        java.lang.String str25 = headLabCoordinator7.getName();
        headLabCoordinator7.setDepartment("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        headLabCoordinator7.setEmail("hi!");
        boolean boolean25 = headLabCoordinator7.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(paymentList22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getName();
        headLabCoordinator7.setUserId("hi!");
        double double11 = headLabCoordinator7.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        main.models.LabManager labManager11 = headLabCoordinator7.createLabManager();
        java.lang.String str12 = headLabCoordinator7.getDepartment();
        java.lang.String str13 = headLabCoordinator7.getIdOrCertificationNumber();
        main.enums.AccountStatus accountStatus14 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(accountStatus14);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus6);
        main.models.LabManager labManager8 = headLabCoordinator7.createLabManager();
        double double9 = headLabCoordinator7.getHourlyRate();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus11 = headLabCoordinator7.getStatus();
        main.models.Payment payment12 = null;
        headLabCoordinator7.addPayment(payment12);
        java.util.List<main.models.Payment> paymentList14 = headLabCoordinator7.getPayments();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertNull(accountStatus11);
        org.junit.Assert.assertNotNull(paymentList14);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus6);
        java.util.List<main.models.Reservation> reservationList8 = headLabCoordinator7.getReservations();
        java.util.List<main.models.Payment> paymentList9 = headLabCoordinator7.getPayments();
        java.util.List<main.models.Payment> paymentList10 = headLabCoordinator7.getPayments();
        headLabCoordinator7.setEmail("");
        main.enums.AccountStatus accountStatus19 = null;
        main.models.HeadLabCoordinator headLabCoordinator20 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "", "", "hi!", accountStatus19);
        headLabCoordinator20.setDepartment("");
        java.util.List<main.models.Payment> paymentList23 = headLabCoordinator20.getPayments();
        headLabCoordinator7.setPayments(paymentList23);
        headLabCoordinator7.setPassword("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(paymentList10);
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(paymentList23);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "", "", accountStatus6);
        headLabCoordinator7.setIdOrCertificationNumber("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        main.enums.AccountStatus accountStatus24 = null;
        main.models.HeadLabCoordinator headLabCoordinator25 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "", accountStatus24);
        main.models.LabManager labManager26 = headLabCoordinator25.createLabManager();
        main.enums.AccountStatus accountStatus27 = headLabCoordinator25.getStatus();
        main.enums.AccountStatus accountStatus28 = headLabCoordinator25.getStatus();
        java.util.List<main.models.Reservation> reservationList29 = headLabCoordinator25.getReservations();
        headLabCoordinator7.setReservations(reservationList29);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(labManager8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNull(accountStatus27);
        org.junit.Assert.assertNull(accountStatus28);
        org.junit.Assert.assertNull(reservationList29);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        double double51 = headLabCoordinator7.getHourlyRate();
        java.lang.String str52 = headLabCoordinator7.getName();
        main.models.LabManager labManager53 = headLabCoordinator7.createLabManager();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
// flaky "3) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertNotNull(labManager21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertNotNull(labManager38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.0d + "'", double39 == 0.0d);
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(approvalRequestArray44);
        org.junit.Assert.assertArrayEquals(approvalRequestArray44, new main.models.ApprovalRequest[] {});
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(labManager50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
// flaky "1) test2526(RegressionTest5)":         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(labManager53);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        main.enums.AccountStatus accountStatus10 = headLabCoordinator7.getStatus();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        java.lang.String str12 = headLabCoordinator7.getDepartment();
        java.util.List<main.models.Reservation> reservationList13 = headLabCoordinator7.getReservations();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(accountStatus10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(reservationList13);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        java.lang.String str9 = headLabCoordinator7.getEmail();
        boolean boolean10 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setUserId("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "hi!", "", "hi!", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        main.models.Payment payment9 = null;
        headLabCoordinator7.addPayment(payment9);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        main.enums.AccountStatus accountStatus8 = headLabCoordinator7.getStatus();
        boolean boolean9 = headLabCoordinator7.isPasswordStrong();
        double double10 = headLabCoordinator7.getHourlyRate();
        java.lang.String str11 = headLabCoordinator7.getDepartment();
        headLabCoordinator7.setName("");
        java.lang.String str14 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setPassword("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNull(accountStatus8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setUserId("hi!");
        main.enums.AccountStatus accountStatus13 = headLabCoordinator7.getStatus();
        main.enums.AccountStatus accountStatus20 = null;
        main.models.HeadLabCoordinator headLabCoordinator21 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus20);
        main.enums.AccountStatus accountStatus22 = headLabCoordinator21.getStatus();
        boolean boolean23 = headLabCoordinator21.isPasswordStrong();
        double double24 = headLabCoordinator21.getHourlyRate();
        main.models.LabManager labManager25 = headLabCoordinator21.createLabManager();
        java.util.List<main.models.Reservation> reservationList26 = headLabCoordinator21.getReservations();
        headLabCoordinator7.setReservations(reservationList26);
        java.util.List<main.models.ApprovalRequest> approvalRequestList28 = headLabCoordinator7.getApprovalRequests();
        java.util.List<main.models.Reservation> reservationList29 = headLabCoordinator7.getReservations();
        headLabCoordinator7.setDepartment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(accountStatus13);
        org.junit.Assert.assertNotNull(headLabCoordinator21);
        org.junit.Assert.assertNull(accountStatus22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(labManager25);
        org.junit.Assert.assertNull(reservationList26);
        org.junit.Assert.assertNotNull(approvalRequestList28);
        org.junit.Assert.assertNull(reservationList29);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        main.enums.AccountStatus accountStatus17 = null;
        main.models.HeadLabCoordinator headLabCoordinator18 = main.models.HeadLabCoordinator.getInstance("", "", "", "", "hi!", "hi!", accountStatus17);
        java.util.List<main.models.Reservation> reservationList19 = headLabCoordinator18.getReservations();
        java.util.List<main.models.Payment> paymentList20 = headLabCoordinator18.getPayments();
        java.util.List<main.models.Payment> paymentList21 = headLabCoordinator18.getPayments();
        main.enums.AccountStatus accountStatus22 = null;
        headLabCoordinator18.setStatus(accountStatus22);
        java.lang.String str24 = headLabCoordinator18.getUserId();
        java.util.List<main.models.Payment> paymentList25 = headLabCoordinator18.getPayments();
        headLabCoordinator7.setPayments(paymentList25);
        main.enums.AccountStatus accountStatus27 = headLabCoordinator7.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNull(reservationList19);
        org.junit.Assert.assertNotNull(paymentList20);
        org.junit.Assert.assertNotNull(paymentList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(paymentList25);
        org.junit.Assert.assertNull(accountStatus27);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "", "", "hi!", "", accountStatus6);
        boolean boolean8 = headLabCoordinator7.isUniversityAffiliated();
        headLabCoordinator7.setIdOrCertificationNumber("");
        java.lang.String str11 = headLabCoordinator7.getUserId();
        headLabCoordinator7.setEmail("hi!");
        java.lang.String str14 = headLabCoordinator7.getName();
        headLabCoordinator7.setName("hi!");
        java.util.List<main.models.ApprovalRequest> approvalRequestList17 = headLabCoordinator7.getApprovalRequests();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(approvalRequestList17);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "", "hi!", "hi!", "hi!", "hi!", accountStatus6);
        java.lang.String str8 = headLabCoordinator7.getEmail();
        headLabCoordinator7.setIdOrCertificationNumber("");
        headLabCoordinator7.setDepartment("hi!");
        java.lang.String str13 = headLabCoordinator7.getEmail();
        boolean boolean14 = headLabCoordinator7.isPasswordStrong();
        headLabCoordinator7.setDepartment("");
        headLabCoordinator7.setEmail("");
        java.lang.String str19 = headLabCoordinator7.getUserId();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        main.enums.AccountStatus accountStatus6 = null;
        main.models.HeadLabCoordinator headLabCoordinator7 = main.models.HeadLabCoordinator.getInstance("hi!", "hi!", "hi!", "", "", "hi!", accountStatus6);
        headLabCoordinator7.setName("");
        org.junit.Assert.assertNotNull(headLabCoordinator7);
    }
}
