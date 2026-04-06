package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationFacadeRandoopTest {

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
        java.lang.String str0 = main.models.ReservationFacade.newReservationId();
// flaky "1) test001(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str0, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime2, localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = reservationFacade0.extendReservation("", localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user9 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user11 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.lang.Class<?> wildcardClass4 = userList3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUser("hi!", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = reservationFacade0.cancelReservation("", localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass9 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user9 = reservationFacade0.registerUserAutoId("", "hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationFacade0.registerUser("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("hi!", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(reservation9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(reservation9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.enableEquipment("");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reservationFacade0.cancelReservation("", localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user14 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "hi!", "Reservation not found.", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", localDateTime9, localDateTime10, paymentMethod11);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.extendReservation("Reservation not found.", localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.lang.Class<?> wildcardClass8 = equipmentList7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Reservation> reservationList5 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.enums.PaymentMethod paymentMethod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reservationFacade0.reserveReservation("", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", paymentMethod22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.lang.Class<?> wildcardClass3 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.markEquipmentUnderMaintenance("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user25 = reservationFacade0.registerUserAutoId("", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = reservationFacade0.extendReservation("hi!", localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        java.lang.Class<?> wildcardClass14 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = reservationFacade0.extendReservation("hi!", localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.markEquipmentUnderMaintenance("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user25 = reservationFacade0.registerUserAutoId("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user12 = reservationFacade0.registerUserAutoId("Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.cancelReservation("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.lang.Class<?> wildcardClass6 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationFacade0.registerUserAutoId("Reservation not found.", "", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user9, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.cancelReservation("", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        main.models.User user9 = reservationFacade0.loginUser("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean22 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean28 = reservationFacade0.createLabManagerAccountFromHead("hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUserAutoId("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.reserveReservation("hi!", "hi!", "hi!", paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass9 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user24 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.extendReservation("hi!", localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        java.util.List<main.models.Reservation> reservationList7 = reservationFacade0.listReservationsByUserId("");
        main.models.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user19 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.cancelReservation("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(reservation9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        main.models.Reservation reservation13 = reservationFacade0.getReservationById("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(reservation13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.cancelReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.String str16 = reservationFacade0.displayMessage("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = reservationFacade0.cancelReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.util.List<main.models.Reservation> reservationList6 = reservationFacade0.listReservationsByUserId("");
        java.lang.Class<?> wildcardClass7 = reservationList6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("hi!", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.lang.Class<?> wildcardClass5 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reservationFacade0.extendReservation("", localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user22 = reservationFacade0.registerUserAutoId("", "Reservation not found.", "Reservation not found.", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user22 = reservationFacade0.registerUser("Reservation not found.", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUserAutoId("Reservation not found.", "hi!", "", "", "Reservation not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.enableEquipment("Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.enums.PaymentMethod paymentMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", paymentMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.lang.Class<?> wildcardClass14 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList10 = reservationFacade0.getAllUsers();
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.reserveReservation("", "Reservation not found.", "hi!", paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", localDateTime9, localDateTime10, paymentMethod11);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user19 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "", "", "", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.PaymentMethod paymentMethod18 = null;
        boolean boolean19 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime16, localDateTime17, paymentMethod18);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.cancelReservation("Reservation not found.", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.cancelReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        main.enums.PaymentMethod paymentMethod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", paymentMethod13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.reserveReservation("", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean16 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean15 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.PaymentMethod paymentMethod20 = null;
        boolean boolean21 = reservationFacade0.reserveReservation("hi!", "Reservation not found.", localDateTime18, localDateTime19, paymentMethod20);
        main.models.User user22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user22, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUser("Reservation not found.", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.User user6 = reservationFacade0.loginUser("hi!", "");
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.modifyReservation("", localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        main.models.Reservation reservation12 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.extendReservation("", localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reservation12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user11 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = reservationFacade0.cancelReservation("", localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user19 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.PaymentMethod paymentMethod16 = null;
        boolean boolean17 = reservationFacade0.reserveReservation("hi!", "Reservation not found.", localDateTime14, localDateTime15, paymentMethod16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime19, localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean15 = reservationFacade0.createLabManagerAccountFromHead("", "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("hi!");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = reservationFacade0.modifyReservation("hi!", localDateTime17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", localDateTime9, localDateTime10, paymentMethod11);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.extendReservation("hi!", localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation16 = reservationFacade0.getReservationById("");
        main.models.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(reservation16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", localDateTime9, localDateTime10, paymentMethod11);
        boolean boolean14 = reservationFacade0.enableEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user22 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("");
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Equipment> equipmentList10 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.cancelReservation("", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = reservationFacade0.modifyReservation("", localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user23 = reservationFacade0.registerUser("hi!", "", "Reservation not found.", "Reservation not found.", "", "Reservation not found.", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList16 = reservationFacade0.listReservationsByUserId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user24 = reservationFacade0.registerUser("", "Reservation not found.", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("");
        main.models.Reservation reservation15 = reservationFacade0.getReservationById("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNull(reservation15);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUserAutoId("", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user13 = reservationFacade0.registerUser("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user14 = reservationFacade0.registerUserAutoId("Reservation not found.", "Reservation not found.", "hi!", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime7, localDateTime8, paymentMethod9);
        java.lang.Class<?> wildcardClass11 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user13 = reservationFacade0.registerUserAutoId("hi!", "hi!", "Reservation not found.", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.User user6 = reservationFacade0.loginUser("hi!", "");
        boolean boolean8 = reservationFacade0.enableEquipment("hi!");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user18 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", "hi!", "", "Reservation not found.", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("");
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = reservationFacade0.cancelReservation("", localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user18 = reservationFacade0.registerUserAutoId("hi!", "hi!", "Reservation not found.", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        java.util.List<main.models.User> userList6 = reservationFacade0.getAllUsers();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user12 = reservationFacade0.registerUser("hi!", "Reservation not found.", "hi!", "", "", "Reservation not found.", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        boolean boolean15 = reservationFacade0.reserveReservation("hi!", "", localDateTime12, localDateTime13, paymentMethod14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = reservationFacade0.modifyReservation("hi!", localDateTime17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.extendReservation("hi!", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        main.enums.PaymentMethod paymentMethod10 = null;
        boolean boolean11 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime8, localDateTime9, paymentMethod10);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        boolean boolean10 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        main.models.Reservation reservation12 = reservationFacade0.getReservationById("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reservation12);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        java.lang.String str5 = reservationFacade0.displayMessage("");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.Reservation reservation12 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationFacade0.modifyReservation("", localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reservation12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        boolean boolean8 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList6 = reservationFacade0.listReservationsByUserId("hi!");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.PaymentMethod paymentMethod13 = null;
        boolean boolean14 = reservationFacade0.reserveReservation("Reservation not found.", "hi!", localDateTime11, localDateTime12, paymentMethod13);
        main.enums.PaymentMethod paymentMethod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", paymentMethod18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        boolean boolean7 = reservationFacade0.enableEquipment("");
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.cancelReservation("hi!", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        boolean boolean10 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.modifyReservation("Reservation not found.", localDateTime12, localDateTime13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass11 = reservationList10.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user13 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.lang.Class<?> wildcardClass11 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime4);
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reservationFacade0.reserveReservation("", "Reservation not found.", "", paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        boolean boolean10 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.cancelReservation("hi!", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList10 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.extendReservation("Reservation not found.", localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.lang.String str2 = reservationFacade0.displayMessage("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.modifyReservation("hi!", localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("");
        boolean boolean17 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass18 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user17 = reservationFacade0.loginUser("", "");
        java.util.List<main.models.Equipment> equipmentList18 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        main.models.Reservation reservation10 = reservationFacade0.getReservationById("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(reservation10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.modifyReservation("hi!", localDateTime9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = reservationFacade0.loginUser("Reservation not found.", "");
        main.enums.PaymentMethod paymentMethod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationFacade0.reserveReservation("hi!", "Reservation not found.", "", paymentMethod16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean12 = reservationFacade0.enableEquipment("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUser("hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        java.lang.String str11 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = reservationFacade0.cancelReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str11, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = reservationFacade0.extendReservation("Reservation not found.", localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.lang.String str2 = reservationFacade0.displayMessage("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user12 = reservationFacade0.registerUser("hi!", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean22 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation24 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass25 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = reservationFacade0.loginUser("Reservation not found.", "");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user19 = reservationFacade0.registerUserAutoId("hi!", "hi!", "Reservation not found.", "Reservation not found.", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass10 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.Class<?> wildcardClass10 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = reservationFacade0.loginUser("Reservation not found.", "");
        main.models.Reservation reservation14 = reservationFacade0.getReservationById("Reservation not found.");
        java.lang.Class<?> wildcardClass15 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        boolean boolean10 = reservationFacade0.disableEquipment("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.lang.String str8 = reservationFacade0.displayMessage("");
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        boolean boolean7 = reservationFacade0.enableEquipment("");
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("hi!", "", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = reservationFacade0.cancelReservation("Reservation not found.", localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.lang.String str2 = reservationFacade0.displayMessage("");
        java.lang.String str4 = reservationFacade0.displayMessage("Reservation not found.");
        java.lang.String str6 = reservationFacade0.displayMessage("Reservation not found.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Reservation not found." + "'", str4, "Reservation not found.");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("");
        boolean boolean17 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.String str19 = reservationFacade0.displayMessage("Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Reservation not found." + "'", str19, "Reservation not found.");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime9, localDateTime10, paymentMethod11);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.enableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationFacade0.extendReservation("Reservation not found.", localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime7, localDateTime8, paymentMethod9);
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.reserveReservation("Reservation not found.", "", "Reservation not found.", paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        boolean boolean11 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList12 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        boolean boolean15 = reservationFacade0.reserveReservation("hi!", "", localDateTime12, localDateTime13, paymentMethod14);
        boolean boolean17 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.enums.PaymentMethod paymentMethod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationFacade0.reserveReservation("", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", paymentMethod21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = reservationFacade0.recordArrival("Reservation not found.", localDateTime15);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Reservation not found." + "'", str16, "Reservation not found.");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user11 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Equipment> equipmentList15 = reservationFacade0.listEquipment();
        main.models.User user18 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        boolean boolean20 = reservationFacade0.enableEquipment("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        main.models.User user18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user18, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        boolean boolean7 = reservationFacade0.enableEquipment("");
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = reservationFacade0.recordArrival("Reservation not found.", localDateTime9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Reservation not found." + "'", str10, "Reservation not found.");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.cancelReservation("hi!", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean12 = reservationFacade0.enableEquipment("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUser("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime7, localDateTime8, paymentMethod9);
        boolean boolean12 = reservationFacade0.disableEquipment("");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        java.util.List<main.models.Reservation> reservationList7 = reservationFacade0.listReservationsByUserId("");
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("hi!", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.");
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.cancelReservation("", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("");
        boolean boolean12 = reservationFacade0.disableEquipment("hi!");
        main.models.Reservation reservation14 = reservationFacade0.getReservationById("");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.PaymentMethod paymentMethod19 = null;
        boolean boolean20 = reservationFacade0.reserveReservation("", "hi!", localDateTime17, localDateTime18, paymentMethod19);
        main.enums.PaymentMethod paymentMethod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationFacade0.reserveReservation("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", paymentMethod24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUserAutoId("hi!", "", "hi!", "", "hi!", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        java.lang.String str7 = reservationFacade0.displayMessage("Reservation not found.");
        main.models.User user10 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Reservation not found." + "'", str7, "Reservation not found.");
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList9 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        main.models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user10, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation16 = reservationFacade0.getReservationById("");
        java.util.List<main.models.Reservation> reservationList18 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(reservation16);
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("");
        boolean boolean12 = reservationFacade0.disableEquipment("Reservation not found.");
        main.models.User user15 = reservationFacade0.loginUser("Reservation not found.", "");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        boolean boolean19 = reservationFacade0.disableEquipment("Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("");
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("");
        java.lang.String str13 = reservationFacade0.displayMessage("hi!");
        boolean boolean15 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "Reservation not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user11 = reservationFacade0.loginUser("Reservation not found.", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        main.models.Reservation reservation13 = reservationFacade0.getReservationById("Reservation not found.");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationFacade0.cancelReservation("hi!", localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        java.lang.String str16 = reservationFacade0.recordArrival("hi!", localDateTime15);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Reservation not found." + "'", str16, "Reservation not found.");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        boolean boolean11 = reservationFacade0.enableEquipment("");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean11 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.String str16 = reservationFacade0.displayMessage("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        boolean boolean16 = reservationFacade0.markEquipmentUnderMaintenance("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        main.models.Reservation reservation13 = reservationFacade0.getReservationById("Reservation not found.");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(reservation13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = reservationFacade0.recordArrival("", localDateTime19);
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = reservationFacade0.modifyReservation("hi!", localDateTime22, localDateTime23, localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Reservation not found." + "'", str20, "Reservation not found.");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean15 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.PaymentMethod paymentMethod20 = null;
        boolean boolean21 = reservationFacade0.reserveReservation("hi!", "Reservation not found.", localDateTime18, localDateTime19, paymentMethod20);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        main.enums.PaymentMethod paymentMethod26 = null;
        boolean boolean27 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", localDateTime24, localDateTime25, paymentMethod26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean15 = reservationFacade0.disableEquipment("hi!");
        main.models.Reservation reservation17 = reservationFacade0.getReservationById("hi!");
        main.enums.PaymentMethod paymentMethod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", paymentMethod21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reservation17);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user11 = reservationFacade0.registerUser("hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList15 = reservationFacade0.listReservationsByUserId("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        boolean boolean8 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user11 = reservationFacade0.loginUser("hi!", "");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        boolean boolean6 = reservationFacade0.enableEquipment("hi!");
        main.models.Reservation reservation8 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(reservation8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        boolean boolean16 = reservationFacade0.enableEquipment("");
        main.models.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Equipment> equipmentList15 = reservationFacade0.listEquipment();
        main.models.User user18 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        main.enums.PaymentMethod paymentMethod23 = null;
        boolean boolean24 = reservationFacade0.reserveReservation("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime21, localDateTime22, paymentMethod23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime4);
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = reservationFacade0.cancelReservation("hi!", localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        boolean boolean7 = reservationFacade0.enableEquipment("");
        main.models.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("");
        boolean boolean12 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList13 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.cancelReservation("", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList16 = reservationFacade0.listReservationsByUserId("hi!");
        main.models.Reservation reservation18 = reservationFacade0.getReservationById("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNull(reservation18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        main.models.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Equipment> equipmentList12 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = reservationFacade0.modifyReservation("", localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user17 = reservationFacade0.loginUser("", "");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user25 = reservationFacade0.registerUser("hi!", "", "", "", "", "Reservation not found.", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        boolean boolean12 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", localDateTime9, localDateTime10, paymentMethod11);
        boolean boolean14 = reservationFacade0.enableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList16 = reservationFacade0.listReservationsByUserId("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        boolean boolean6 = reservationFacade0.enableEquipment("hi!");
        boolean boolean8 = reservationFacade0.markEquipmentUnderMaintenance("");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = reservationFacade0.loginUser("Reservation not found.", "");
        main.models.User user15 = reservationFacade0.loginUser("hi!", "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean22 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation24 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Equipment> equipmentList25 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = reservationFacade0.cancelReservation("", localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(reservation24);
        org.junit.Assert.assertNotNull(equipmentList25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUserAutoId("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user11 = reservationFacade0.registerUser("", "hi!", "Reservation not found.", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.util.List<main.models.Reservation> reservationList6 = reservationFacade0.listReservationsByUserId("");
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.extendReservation("Reservation not found.", localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        java.lang.String str11 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str11, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Equipment> equipmentList14 = reservationFacade0.listEquipment();
        boolean boolean20 = reservationFacade0.createLabManagerAccountFromHead("hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        boolean boolean16 = reservationFacade0.enableEquipment("");
        main.models.Reservation reservation18 = reservationFacade0.getReservationById("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(reservation18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        main.models.Reservation reservation12 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(reservation12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean15 = reservationFacade0.disableEquipment("hi!");
        main.models.Reservation reservation17 = reservationFacade0.getReservationById("hi!");
        main.models.User user20 = reservationFacade0.loginUser("", "");
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = reservationFacade0.extendReservation("hi!", localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(reservation17);
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = reservationFacade0.recordArrival("", localDateTime19);
        boolean boolean22 = reservationFacade0.markEquipmentUnderMaintenance("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Reservation not found." + "'", str20, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user17 = reservationFacade0.loginUser("", "");
        java.util.List<main.models.Reservation> reservationList19 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean21 = reservationFacade0.disableEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user29 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean8 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("hi!");
        java.lang.Class<?> wildcardClass11 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("Reservation not found.", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.User user12 = reservationFacade0.loginUser("Reservation not found.", "");
        boolean boolean18 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "", "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.util.List<main.models.User> userList5 = reservationFacade0.getAllUsers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("");
        main.models.Reservation reservation10 = reservationFacade0.getReservationById("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reservation10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean12 = reservationFacade0.enableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = reservationFacade0.cancelReservation("", localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.lang.String str10 = reservationFacade0.displayMessage("hi!");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList12 = reservationFacade0.getAllUsers();
        main.models.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationFacade0.registerUserAutoId("Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.markEquipmentUnderMaintenance("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean11 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        main.models.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        boolean boolean15 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime12, localDateTime13, paymentMethod14);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.PaymentMethod paymentMethod20 = null;
        boolean boolean21 = reservationFacade0.reserveReservation("hi!", "hi!", localDateTime18, localDateTime19, paymentMethod20);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.PaymentMethod paymentMethod13 = null;
        boolean boolean14 = reservationFacade0.reserveReservation("Reservation not found.", "hi!", localDateTime11, localDateTime12, paymentMethod13);
        java.time.LocalDateTime localDateTime16 = null;
        java.lang.String str17 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime16);
        boolean boolean19 = reservationFacade0.enableEquipment("Reservation not found.");
        java.lang.String str21 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Reservation not found." + "'", str17, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str21, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("", "", "Reservation not found.", "", "");
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.cancelReservation("Reservation not found.", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Reservation> reservationList5 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        boolean boolean16 = reservationFacade0.enableEquipment("");
        boolean boolean18 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean24 = reservationFacade0.createLabManagerAccountFromHead("hi!", "", "Reservation not found.", "hi!", "");
        main.enums.PaymentMethod paymentMethod28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "hi!", paymentMethod28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean14 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Equipment> equipmentList15 = reservationFacade0.listEquipment();
        main.models.User user18 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user26 = reservationFacade0.registerUser("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        boolean boolean16 = reservationFacade0.reserveReservation("Reservation not found.", "Reservation not found.", localDateTime13, localDateTime14, paymentMethod15);
        boolean boolean18 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Equipment> equipmentList19 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(equipmentList19);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("");
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean17 = reservationFacade0.createLabManagerAccountFromHead("", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        java.time.LocalDateTime localDateTime19 = null;
        java.lang.String str20 = reservationFacade0.recordArrival("", localDateTime19);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.PaymentMethod paymentMethod25 = null;
        boolean boolean26 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime23, localDateTime24, paymentMethod25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Reservation not found." + "'", str20, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        boolean boolean15 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime12, localDateTime13, paymentMethod14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList12 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user19 = reservationFacade0.registerUserAutoId("hi!", "Reservation not found.", "", "hi!", "", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.lang.String str8 = reservationFacade0.displayMessage("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUserAutoId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean8 = reservationFacade0.disableEquipment("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        boolean boolean15 = reservationFacade0.createLabManagerAccountFromHead("hi!", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        boolean boolean5 = reservationFacade0.disableEquipment("Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user13 = reservationFacade0.registerUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.lang.String str8 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.PaymentMethod paymentMethod13 = null;
        boolean boolean14 = reservationFacade0.reserveReservation("Reservation not found.", "hi!", localDateTime11, localDateTime12, paymentMethod13);
        boolean boolean16 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user23 = reservationFacade0.registerUserAutoId("", "hi!", "hi!", "Reservation not found.", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str8, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        java.util.List<main.models.Equipment> equipmentList8 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = reservationFacade0.modifyReservation("Reservation not found.", localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.time.LocalDateTime localDateTime8 = null;
        java.lang.String str9 = reservationFacade0.recordArrival("Reservation not found.", localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationFacade0.registerUserAutoId("hi!", "", "Reservation not found.", "", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reservation not found." + "'", str9, "Reservation not found.");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.lang.String str2 = reservationFacade0.displayMessage("");
        java.lang.String str4 = reservationFacade0.displayMessage("Reservation not found.");
        main.models.Reservation reservation6 = reservationFacade0.getReservationById("Reservation not found.");
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = reservationFacade0.modifyReservation("", localDateTime8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Reservation not found." + "'", str4, "Reservation not found.");
        org.junit.Assert.assertNull(reservation6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("");
        boolean boolean12 = reservationFacade0.disableEquipment("hi!");
        main.models.Reservation reservation14 = reservationFacade0.getReservationById("");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.PaymentMethod paymentMethod19 = null;
        boolean boolean20 = reservationFacade0.reserveReservation("Reservation not found.", "hi!", localDateTime17, localDateTime18, paymentMethod19);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.util.List<main.models.Reservation> reservationList12 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        boolean boolean15 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime12, localDateTime13, paymentMethod14);
        boolean boolean17 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        boolean boolean11 = reservationFacade0.enableEquipment("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(equipmentList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        boolean boolean6 = reservationFacade0.enableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList8 = reservationFacade0.listReservationsByUserId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationFacade0.registerUserAutoId("", "", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        java.util.List<main.models.Equipment> equipmentList16 = reservationFacade0.listEquipment();
        java.util.List<main.models.Reservation> reservationList18 = reservationFacade0.listReservationsByUserId("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(reservationList18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.util.List<main.models.Equipment> equipmentList12 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList10 = reservationFacade0.getAllUsers();
        boolean boolean12 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.lang.String str15 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Reservation not found." + "'", str15, "Reservation not found.");
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationFacade0.registerUserAutoId("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user17 = reservationFacade0.loginUser("", "");
        java.util.List<main.models.Reservation> reservationList19 = reservationFacade0.listReservationsByUserId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user27 = reservationFacade0.registerUser("hi!", "Reservation not found.", "", "", "Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        main.models.User user8 = reservationFacade0.loginUser("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationFacade0.listReservationsByUserId("");
        boolean boolean12 = reservationFacade0.disableEquipment("hi!");
        main.models.Reservation reservation14 = reservationFacade0.getReservationById("");
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.PaymentMethod paymentMethod19 = null;
        boolean boolean20 = reservationFacade0.reserveReservation("", "hi!", localDateTime17, localDateTime18, paymentMethod19);
        java.lang.Class<?> wildcardClass21 = reservationFacade0.getClass();
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(reservation14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        boolean boolean6 = reservationFacade0.enableEquipment("hi!");
        java.util.List<main.models.Reservation> reservationList8 = reservationFacade0.listReservationsByUserId("hi!");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationFacade0.registerUser("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList10 = reservationFacade0.getAllUsers();
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user17 = reservationFacade0.registerUserAutoId("hi!", "", "Reservation not found.", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        main.models.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.User user3 = reservationFacade0.loginUser("Reservation not found.", "");
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        boolean boolean6 = reservationFacade0.enableEquipment("hi!");
        boolean boolean12 = reservationFacade0.createLabManagerAccountFromHead("hi!", "", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList4 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        boolean boolean10 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", localDateTime7, localDateTime8, paymentMethod9);
        java.time.LocalDateTime localDateTime12 = null;
        java.lang.String str13 = reservationFacade0.recordArrival("hi!", localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.extendReservation("", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Reservation not found." + "'", str13, "Reservation not found.");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        boolean boolean9 = reservationFacade0.disableEquipment("Reservation not found.");
        boolean boolean15 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "hi!", "Reservation not found.", "hi!");
        boolean boolean21 = reservationFacade0.createLabManagerAccountFromHead("", "Reservation not found.", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = reservationFacade0.cancelReservation("", localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.PaymentMethod paymentMethod16 = null;
        boolean boolean17 = reservationFacade0.reserveReservation("hi!", "Reservation not found.", localDateTime14, localDateTime15, paymentMethod16);
        java.util.List<main.models.Equipment> equipmentList18 = reservationFacade0.listEquipment();
        boolean boolean20 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("hi!");
        boolean boolean13 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.enums.PaymentMethod paymentMethod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "hi!", "hi!", paymentMethod17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.User> userList9 = reservationFacade0.getAllUsers();
        boolean boolean15 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "hi!", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "");
        java.util.List<main.models.Equipment> equipmentList16 = reservationFacade0.listEquipment();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.enableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.Equipment> equipmentList8 = reservationFacade0.listEquipment();
        java.lang.Class<?> wildcardClass9 = reservationFacade0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("", "", "", "", "Reservation not found.");
        boolean boolean19 = reservationFacade0.createLabManagerAccountFromHead("hi!", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("");
        java.lang.Class<?> wildcardClass12 = reservationList11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(reservation9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        main.models.Reservation reservation4 = reservationFacade0.getReservationById("Reservation not found.");
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = reservationFacade0.modifyReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newStart cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNull(reservation4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.util.List<main.models.User> userList1 = reservationFacade0.getAllUsers();
        main.models.User user4 = reservationFacade0.loginUser("Reservation not found.", "Reservation not found.");
        boolean boolean10 = reservationFacade0.createLabManagerAccountFromHead("hi!", "hi!", "hi!", "", "Reservation not found.");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        java.time.LocalDateTime localDateTime5 = null;
        java.lang.String str6 = reservationFacade0.recordArrival("", localDateTime5);
        boolean boolean8 = reservationFacade0.markEquipmentUnderMaintenance("");
        java.lang.String str10 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.lang.String str12 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Reservation not found." + "'", str6, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str10, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str12, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean12 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.", "Reservation not found.", "Reservation not found.");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user20 = reservationFacade0.registerUser("", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "hi!", "", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean13 = reservationFacade0.disableEquipment("Reservation not found.");
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = reservationFacade0.extendReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        java.lang.String str7 = reservationFacade0.displayMessage("Reservation not found.");
        main.enums.PaymentMethod paymentMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.reserveReservation("hi!", "", "hi!", paymentMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: payment method cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Reservation not found." + "'", str7, "Reservation not found.");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        main.models.Reservation reservation9 = reservationFacade0.getReservationById("");
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.cancelReservation("", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: now cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertNull(reservation9);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean15 = reservationFacade0.enableEquipment("");
        java.lang.String str17 = reservationFacade0.displayMessage("");
        main.models.User user20 = reservationFacade0.loginUser("Reservation not found.", "Reservation not found.");
        boolean boolean26 = reservationFacade0.createLabManagerAccountFromHead("Reservation not found.", "", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(user20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime2 = null;
        java.lang.String str3 = reservationFacade0.recordArrival("", localDateTime2);
        java.lang.Class<?> wildcardClass4 = reservationFacade0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Reservation not found." + "'", str3, "Reservation not found.");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList12 = reservationFacade0.getAllUsers();
        main.models.User user15 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.enableEquipment("Reservation not found.");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList13 = reservationFacade0.listReservationsByUserId("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user16 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
        org.junit.Assert.assertNotNull(reservationList13);
        org.junit.Assert.assertNull(user16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        main.models.User user11 = reservationFacade0.loginUser("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean10 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean9 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "", "", "", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation11 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(reservation11);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        java.util.List<main.models.Reservation> reservationList7 = reservationFacade0.listReservationsByUserId("hi!");
        main.models.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationFacade0.approveUser(user8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.util.List<main.models.User> userList1 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean8 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        main.models.Reservation reservation10 = reservationFacade0.getReservationById("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(reservation10);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean9 = reservationFacade0.disableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        boolean boolean11 = reservationFacade0.enableEquipment("Reservation not found.");
        boolean boolean13 = reservationFacade0.disableEquipment("hi!");
        java.util.List<main.models.User> userList14 = reservationFacade0.getAllUsers();
        main.models.User user17 = reservationFacade0.loginUser("", "");
        java.util.List<main.models.Reservation> reservationList19 = reservationFacade0.listReservationsByUserId("hi!");
        boolean boolean21 = reservationFacade0.disableEquipment("");
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user29 = reservationFacade0.registerUser("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "hi!", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "Reservation not found.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: Reservation not found.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNull(user17);
        org.junit.Assert.assertNotNull(reservationList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        main.models.User user7 = reservationFacade0.loginUser("hi!", "");
        java.time.LocalDateTime localDateTime9 = null;
        java.lang.String str10 = reservationFacade0.recordArrival("Reservation not found.", localDateTime9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(user7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Reservation not found." + "'", str10, "Reservation not found.");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.time.LocalDateTime localDateTime4 = null;
        java.lang.String str5 = reservationFacade0.recordArrival("Reservation not found.", localDateTime4);
        java.util.List<main.models.Equipment> equipmentList6 = reservationFacade0.listEquipment();
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        boolean boolean13 = reservationFacade0.createLabManagerAccountFromHead("", "", "", "", "Reservation not found.");
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.PaymentMethod paymentMethod18 = null;
        boolean boolean19 = reservationFacade0.reserveReservation("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime16, localDateTime17, paymentMethod18);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Reservation not found." + "'", str5, "Reservation not found.");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.enableEquipment("");
        java.util.List<main.models.Equipment> equipmentList7 = reservationFacade0.listEquipment();
        java.util.List<main.models.User> userList8 = reservationFacade0.getAllUsers();
        java.util.List<main.models.Equipment> equipmentList9 = reservationFacade0.listEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = reservationFacade0.extendReservation("Reservation not found.", localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: newEndTime cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        boolean boolean5 = reservationFacade0.markEquipmentUnderMaintenance("hi!");
        boolean boolean7 = reservationFacade0.markEquipmentUnderMaintenance("Reservation not found.");
        boolean boolean9 = reservationFacade0.enableEquipment("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.util.List<main.models.Reservation> reservationList11 = reservationFacade0.listReservationsByUserId("Reservation not found.");
        java.time.LocalDateTime localDateTime13 = null;
        java.lang.String str14 = reservationFacade0.recordArrival("", localDateTime13);
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Reservation not found." + "'", str14, "Reservation not found.");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        main.models.Reservation reservation2 = reservationFacade0.getReservationById("hi!");
        java.util.List<main.models.User> userList3 = reservationFacade0.getAllUsers();
        main.models.Reservation reservation5 = reservationFacade0.getReservationById("");
        java.lang.String str7 = reservationFacade0.displayMessage("Reservation not found.");
        main.models.User user10 = reservationFacade0.loginUser("Reservation not found.", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertNull(reservation2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNull(reservation5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Reservation not found." + "'", str7, "Reservation not found.");
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        boolean boolean2 = reservationFacade0.enableEquipment("");
        boolean boolean4 = reservationFacade0.markEquipmentUnderMaintenance("");
        boolean boolean6 = reservationFacade0.disableEquipment("");
        boolean boolean8 = reservationFacade0.disableEquipment("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        java.lang.String str11 = reservationFacade0.recordArrival("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime10);
        boolean boolean13 = reservationFacade0.disableEquipment("Reservation not found.");
        java.lang.String str15 = reservationFacade0.displayMessage("ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        java.time.LocalDateTime localDateTime17 = null;
        java.lang.String str18 = reservationFacade0.recordArrival("", localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Reservation not found." + "'", str11, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ee457380-a78b-484e-b4b7-f26f2ce8c8a8" + "'", str15, "ee457380-a78b-484e-b4b7-f26f2ce8c8a8");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Reservation not found." + "'", str18, "Reservation not found.");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        main.models.ReservationFacade reservationFacade0 = new main.models.ReservationFacade();
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        boolean boolean6 = reservationFacade0.reserveReservation("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "ee457380-a78b-484e-b4b7-f26f2ce8c8a8", localDateTime3, localDateTime4, paymentMethod5);
        java.time.LocalDateTime localDateTime8 = null;
        java.lang.String str9 = reservationFacade0.recordArrival("Reservation not found.", localDateTime8);
        boolean boolean15 = reservationFacade0.createLabManagerAccountFromHead("ee457380-a78b-484e-b4b7-f26f2ce8c8a8", "Reservation not found.", "hi!", "Reservation not found.", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Reservation not found." + "'", str9, "Reservation not found.");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}
