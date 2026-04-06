package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationSystemRandoopTest {

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
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.PaymentMethod paymentMethod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double4 = reservationSystem0.completeReservation(reservation1, localDateTime2, paymentMethod3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation1, localDateTime2, localDateTime3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user3 = reservationSystem0.registerUser(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservationSystem0.completeReservation(reservation4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.User user2 = null;
        main.models.Equipment equipment3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation7 = reservationSystem0.createReservation(user2, equipment3, localDateTime4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation2, localDateTime3, localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user4 = null;
        main.models.Equipment equipment5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation9 = reservationSystem0.createReservation(user4, equipment5, localDateTime6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.User user5 = null;
        main.models.Equipment equipment6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation10 = reservationSystem0.createReservation(user5, equipment6, localDateTime7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.lang.Class<?> wildcardClass4 = reservationList3.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user4 = null;
        main.models.Equipment equipment5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation9 = reservationSystem0.createReservation(user4, equipment5, localDateTime6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user4 = reservationSystem0.registerUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        java.lang.Class<?> wildcardClass5 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.Equipment equipment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.lang.Class<?> wildcardClass2 = userList1.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservationSystem0.completeReservation(reservation3, localDateTime4, paymentMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user3 = null;
        main.models.Equipment equipment4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation8 = reservationSystem0.createReservation(user3, equipment4, localDateTime5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser10 = reservationSystem0.createLabManagerAccount(headLabCoordinator4, "", "", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user5 = reservationSystem0.registerUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass5 = paymentList4.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user8 = null;
        main.models.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.PaymentMethod paymentMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation13 = reservationSystem0.createReservation(user8, equipment9, localDateTime10, localDateTime11, paymentMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation2, localDateTime3, localDateTime4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user5 = reservationSystem0.registerUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user2 = null;
        main.models.Equipment equipment3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation7 = reservationSystem0.createReservation(user2, equipment3, localDateTime4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.lang.Class<?> wildcardClass3 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass2 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = user9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user11 = null;
        main.models.Equipment equipment12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation16 = reservationSystem0.createReservation(user11, equipment12, localDateTime13, localDateTime14, paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        main.models.User user10 = null;
        main.models.Equipment equipment11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation15 = reservationSystem0.createReservation(user10, equipment11, localDateTime12, localDateTime13, paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation6, localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        java.lang.Class<?> wildcardClass4 = reservationSystem0.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation5, localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        main.models.Equipment equipment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user5 = reservationSystem0.registerUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservationSystem0.completeReservation(reservation6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.HeadLabCoordinator headLabCoordinator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser9 = reservationSystem0.createLabManagerAccount(headLabCoordinator3, "", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        main.models.User user2 = null;
        main.models.Equipment equipment3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation7 = reservationSystem0.createReservation(user2, equipment3, localDateTime4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double6 = reservationSystem0.completeReservation(reservation3, localDateTime4, paymentMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass12 = reservationSystem0.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservationSystem0.completeReservation(reservation4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = null;
        main.models.Equipment equipment6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation10 = reservationSystem0.createReservation(user5, equipment6, localDateTime7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass4 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.User user4 = null;
        main.models.Equipment equipment5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation9 = reservationSystem0.createReservation(user4, equipment5, localDateTime6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        main.models.User user15 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation16, localDateTime17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user1 = null;
        main.models.Equipment equipment2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        main.enums.PaymentMethod paymentMethod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation6 = reservationSystem0.createReservation(user1, equipment2, localDateTime3, localDateTime4, paymentMethod5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation4, localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation5, localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        main.models.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user3, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "hi!", "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        main.models.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation6, localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        main.models.User user9 = null;
        main.models.Equipment equipment10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.PaymentMethod paymentMethod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation14 = reservationSystem0.createReservation(user9, equipment10, localDateTime11, localDateTime12, paymentMethod13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        java.lang.Class<?> wildcardClass13 = equipmentList12.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.lang.Class<?> wildcardClass5 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "hi!", "hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation3, localDateTime4, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "", "", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.Reservation reservation12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservationSystem0.completeReservation(reservation12, localDateTime13, paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        java.lang.Class<?> wildcardClass9 = reservationSystem0.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.lang.Class<?> wildcardClass2 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        main.models.Reservation reservation15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservationSystem0.completeReservation(reservation7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList14 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user7 = reservationSystem0.registerUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation6, localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user7 = reservationSystem0.registerUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        main.models.HeadLabCoordinator headLabCoordinator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser8 = reservationSystem0.createLabManagerAccount(headLabCoordinator2, "", "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("");
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservationSystem0.completeReservation(reservation4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser18 = reservationSystem0.createLabManagerAccount(headLabCoordinator12, "", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.Equipment equipment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.User user5 = null;
        main.models.Equipment equipment6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation10 = reservationSystem0.createReservation(user5, equipment6, localDateTime7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        java.lang.Class<?> wildcardClass5 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        main.models.HeadLabCoordinator headLabCoordinator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser13 = reservationSystem0.createLabManagerAccount(headLabCoordinator7, "", "", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        main.models.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.lang.Class<?> wildcardClass5 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser12 = reservationSystem0.createLabManagerAccount(headLabCoordinator6, "hi!", "hi!", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        main.models.HeadLabCoordinator headLabCoordinator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser20 = reservationSystem0.createLabManagerAccount(headLabCoordinator14, "hi!", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user6 = reservationSystem0.registerUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservationSystem0.completeReservation(reservation13, localDateTime14, paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.lang.Class<?> wildcardClass4 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation3, localDateTime4, localDateTime5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        main.models.HeadLabCoordinator headLabCoordinator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser10 = reservationSystem0.createLabManagerAccount(headLabCoordinator4, "hi!", "", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user6 = reservationSystem0.registerUser(user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        main.models.User user6 = null;
        main.models.Equipment equipment7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation11 = reservationSystem0.createReservation(user6, equipment7, localDateTime8, localDateTime9, paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.lang.Class<?> wildcardClass2 = reservationList1.getClass();
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation6, localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        main.models.HeadLabCoordinator headLabCoordinator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser10 = reservationSystem0.createLabManagerAccount(headLabCoordinator4, "", "hi!", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "", "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("hi!");
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "", "", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.PaymentMethod paymentMethod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = reservationSystem0.completeReservation(reservation16, localDateTime17, paymentMethod18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = null;
        main.models.Equipment equipment6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation10 = reservationSystem0.createReservation(user5, equipment6, localDateTime7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.User> userList6 = reservationSystem0.getUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList14 = reservationSystem0.getEquipmentItems();
        main.models.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user16 = reservationSystem0.registerUser(user15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservationSystem0.completeReservation(reservation6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.lang.Class<?> wildcardClass6 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser10 = reservationSystem0.createLabManagerAccount(headLabCoordinator4, "", "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.User user9 = reservationSystem0.login("", "");
        main.models.Reservation reservation10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservationSystem0.completeReservation(reservation9, localDateTime10, paymentMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservations();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.PaymentMethod paymentMethod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double7 = reservationSystem0.completeReservation(reservation4, localDateTime5, paymentMethod6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation8, localDateTime9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList14 = reservationSystem0.getEquipmentItems();
        main.models.User user15 = null;
        main.models.Equipment equipment16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.PaymentMethod paymentMethod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation20 = reservationSystem0.createReservation(user15, equipment16, localDateTime17, localDateTime18, paymentMethod19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.Reservation reservation12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation12, localDateTime13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        main.models.HeadLabCoordinator headLabCoordinator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser17 = reservationSystem0.createLabManagerAccount(headLabCoordinator11, "", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.Reservation reservation12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        main.models.User user7 = null;
        main.models.Equipment equipment8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation12 = reservationSystem0.createReservation(user7, equipment8, localDateTime9, localDateTime10, paymentMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser9 = reservationSystem0.createLabManagerAccount(headLabCoordinator3, "", "hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        main.models.HeadLabCoordinator headLabCoordinator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser13 = reservationSystem0.createLabManagerAccount(headLabCoordinator7, "hi!", "", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        main.models.User user11 = reservationSystem0.login("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user11, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user11, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user7 = reservationSystem0.registerUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservationsForUser("");
        java.lang.Class<?> wildcardClass6 = reservationList5.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation8, localDateTime9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservations();
        main.models.User user13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user14 = reservationSystem0.registerUser(user13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList13 = reservationSystem0.getReservationsForUser("");
        main.models.User user14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user15 = reservationSystem0.registerUser(user14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation7, localDateTime8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser9 = reservationSystem0.createLabManagerAccount(headLabCoordinator3, "hi!", "hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        main.models.HeadLabCoordinator headLabCoordinator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser21 = reservationSystem0.createLabManagerAccount(headLabCoordinator15, "", "", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.User user5 = null;
        main.models.Equipment equipment6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation10 = reservationSystem0.createReservation(user5, equipment6, localDateTime7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        java.lang.Class<?> wildcardClass4 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user13 = reservationSystem0.registerUser(user12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        main.models.User user6 = null;
        main.models.Equipment equipment7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation11 = reservationSystem0.createReservation(user6, equipment7, localDateTime8, localDateTime9, paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.User user9 = reservationSystem0.login("", "");
        main.models.User user10 = null;
        main.models.Equipment equipment11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation15 = reservationSystem0.createReservation(user10, equipment11, localDateTime12, localDateTime13, paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user3 = null;
        main.models.Equipment equipment4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation8 = reservationSystem0.createReservation(user3, equipment4, localDateTime5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser10 = reservationSystem0.createLabManagerAccount(headLabCoordinator4, "", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "hi!", "hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        main.models.Reservation reservation2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList13 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation14, localDateTime15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList13 = reservationSystem0.getReservations();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList16 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user17, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user8 = null;
        main.models.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.PaymentMethod paymentMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation13 = reservationSystem0.createReservation(user8, equipment9, localDateTime10, localDateTime11, paymentMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList9 = reservationSystem0.getReservations();
        main.models.Reservation reservation10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.PaymentMethod paymentMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservationSystem0.completeReservation(reservation10, localDateTime11, paymentMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList9);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user4 = reservationSystem0.registerUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "", "", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user9 = reservationSystem0.login("", "");
        main.models.User user10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user11 = reservationSystem0.registerUser(user10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        main.models.Reservation reservation17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation17, localDateTime18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        main.models.HeadLabCoordinator headLabCoordinator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser15 = reservationSystem0.createLabManagerAccount(headLabCoordinator9, "hi!", "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.PaymentMethod paymentMethod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservationSystem0.completeReservation(reservation11, localDateTime12, paymentMethod13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass12 = paymentList11.getClass();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.lang.Class<?> wildcardClass11 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList2 = reservationSystem0.getUsers();
        main.models.Reservation reservation3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation3, localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList15 = reservationSystem0.getReservationsForUser("");
        main.models.User user18 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList12 = reservationSystem0.getPayments();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        java.lang.Class<?> wildcardClass5 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser8 = reservationSystem0.createLabManagerAccount(headLabCoordinator2, "hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList11 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList12 = reservationSystem0.getUsers();
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser8 = reservationSystem0.createLabManagerAccount(headLabCoordinator2, "hi!", "", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList8 = reservationSystem0.getPayments();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(paymentList8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.HeadLabCoordinator headLabCoordinator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser19 = reservationSystem0.createLabManagerAccount(headLabCoordinator13, "hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        main.models.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList6 = reservationSystem0.getUsers();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(userList6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList16 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservationSystem0.completeReservation(reservation6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList2 = reservationSystem0.getUsers();
        main.models.HeadLabCoordinator headLabCoordinator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser9 = reservationSystem0.createLabManagerAccount(headLabCoordinator3, "", "", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        main.models.User user11 = null;
        main.models.Equipment equipment12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation16 = reservationSystem0.createReservation(user11, equipment12, localDateTime13, localDateTime14, paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user5 = reservationSystem0.registerUser(user4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation6, localDateTime7, localDateTime8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservations();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList7);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList11 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList12 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList13 = reservationSystem0.getPayments();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(paymentList13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        main.models.User user13 = reservationSystem0.login("", "");
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservationSystem0.completeReservation(reservation9, localDateTime10, paymentMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.User user7 = reservationSystem0.login("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNull(user7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        main.models.User user14 = null;
        main.models.Equipment equipment15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.PaymentMethod paymentMethod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation19 = reservationSystem0.createReservation(user14, equipment15, localDateTime16, localDateTime17, paymentMethod18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser8 = reservationSystem0.createLabManagerAccount(headLabCoordinator2, "hi!", "hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        main.models.User user7 = null;
        main.models.Equipment equipment8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        main.enums.PaymentMethod paymentMethod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation12 = reservationSystem0.createReservation(user7, equipment8, localDateTime9, localDateTime10, paymentMethod11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList15 = reservationSystem0.getReservationsForUser("");
        main.models.User user18 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.User> userList19 = reservationSystem0.getUsers();
        main.models.Equipment equipment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass8 = paymentList7.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Equipment> equipmentList11 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.PaymentMethod paymentMethod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservationSystem0.completeReservation(reservation12, localDateTime13, paymentMethod14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        main.models.User user8 = reservationSystem0.login("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList15 = reservationSystem0.getReservationsForUser("");
        main.models.User user18 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Payment> paymentList19 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList20 = reservationSystem0.getUsers();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList15);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertNotNull(paymentList19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        main.models.User user6 = reservationSystem0.login("hi!", "");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("hi!");
        main.models.HeadLabCoordinator headLabCoordinator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser14 = reservationSystem0.createLabManagerAccount(headLabCoordinator8, "hi!", "", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.Equipment equipment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservations();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation7, localDateTime8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList9 = reservationSystem0.getPayments();
        main.models.Equipment equipment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(reservationList8);
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Payment> paymentList13 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList14 = reservationSystem0.getUsers();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(paymentList13);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(userList5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.User> userList15 = reservationSystem0.getUsers();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        main.models.User user8 = reservationSystem0.login("", "hi!");
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        main.models.User user15 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("hi!", "hi!");
        main.models.User user4 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList16 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation17, localDateTime18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Equipment> equipmentList6 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.PaymentMethod paymentMethod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservationSystem0.completeReservation(reservation7, localDateTime8, paymentMethod9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.lang.Class<?> wildcardClass4 = equipmentList3.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservations();
        main.models.HeadLabCoordinator headLabCoordinator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser19 = reservationSystem0.createLabManagerAccount(headLabCoordinator13, "", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        main.models.User user17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user17, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList6 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservations();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(equipmentList5);
        org.junit.Assert.assertNotNull(paymentList6);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.Reservation reservation1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation1, localDateTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation8, localDateTime9, localDateTime10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        main.models.User user4 = null;
        main.models.Equipment equipment5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation9 = reservationSystem0.createReservation(user4, equipment5, localDateTime6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        java.lang.Class<?> wildcardClass5 = equipmentList4.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation13, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Equipment> equipmentList13 = reservationSystem0.getEquipmentItems();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        main.models.User user11 = null;
        main.models.Equipment equipment12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation16 = reservationSystem0.createReservation(user11, equipment12, localDateTime13, localDateTime14, paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation5, localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList2 = reservationSystem0.getUsers();
        main.models.User user3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user4 = reservationSystem0.registerUser(user3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(userList2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList2 = reservationSystem0.getUsers();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservationSystem0.completeReservation(reservation6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList6 = reservationSystem0.getEquipmentItems();
        main.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user8 = reservationSystem0.registerUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservationsForUser("");
        main.models.Equipment equipment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation13, localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(reservationList14);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        main.models.User user6 = reservationSystem0.login("", "hi!");
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        main.models.User user19 = reservationSystem0.login("", "");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.User> userList7 = reservationSystem0.getUsers();
        main.models.User user8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList17 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList18 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList19 = reservationSystem0.getUsers();
        main.models.Equipment equipment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList17 = reservationSystem0.getPayments();
        main.models.Reservation reservation18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(paymentList17);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        main.models.User user8 = null;
        main.models.Equipment equipment9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.PaymentMethod paymentMethod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation13 = reservationSystem0.createReservation(user8, equipment9, localDateTime10, localDateTime11, paymentMethod12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation9, localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.Reservation reservation9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList12 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation13, localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.User user4 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Reservation> reservationList12 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.PaymentMethod paymentMethod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservationSystem0.completeReservation(reservation13, localDateTime14, paymentMethod15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        main.models.User user14 = reservationSystem0.login("", "");
        main.models.Reservation reservation15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation5, localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        main.models.HeadLabCoordinator headLabCoordinator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser12 = reservationSystem0.createLabManagerAccount(headLabCoordinator6, "hi!", "", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList11 = reservationSystem0.getReservationsForUser("");
        main.models.User user14 = reservationSystem0.login("hi!", "hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(reservationList11);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        main.enums.PaymentMethod paymentMethod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double8 = reservationSystem0.completeReservation(reservation5, localDateTime6, paymentMethod7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.HeadLabCoordinator headLabCoordinator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.LabManagerUser labManagerUser11 = reservationSystem0.createLabManagerAccount(headLabCoordinator5, "", "", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: actor cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList1 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList2 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        main.models.Reservation reservation4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation4, localDateTime5, localDateTime6, localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList1);
        org.junit.Assert.assertNotNull(equipmentList2);
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(reservationList5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList16 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList17 = reservationSystem0.getReservations();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(reservationList16);
        org.junit.Assert.assertNotNull(reservationList17);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList15 = reservationSystem0.getReservationsForUser("hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("hi!");
        java.util.List<main.models.Reservation> reservationList11 = reservationSystem0.getReservations();
        main.models.User user12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList5 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList7 = reservationSystem0.getReservationsForUser("hi!");
        main.models.Reservation reservation8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.cancelReservation(reservation8, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(paymentList5);
        org.junit.Assert.assertNotNull(reservationList7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList10 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList12 = reservationSystem0.getUsers();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList3 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList4 = reservationSystem0.getEquipmentItems();
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(paymentList3);
        org.junit.Assert.assertNotNull(equipmentList4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservations();
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList17 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList18 = reservationSystem0.getPayments();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(paymentList18);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        main.models.User user19 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNull(user19);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservations();
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList8 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList9 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass10 = paymentList9.getClass();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNotNull(reservationList6);
        org.junit.Assert.assertNotNull(paymentList7);
        org.junit.Assert.assertNotNull(equipmentList8);
        org.junit.Assert.assertNotNull(paymentList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList6 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        main.models.Reservation reservation10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation10, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = null;
        main.models.Equipment equipment7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        main.enums.PaymentMethod paymentMethod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Reservation reservation11 = reservationSystem0.createReservation(user6, equipment7, localDateTime8, localDateTime9, paymentMethod10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList3 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.approveUser(user6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Payment> paymentList1 = reservationSystem0.getPayments();
        main.models.User user4 = reservationSystem0.login("", "");
        java.util.List<main.models.Reservation> reservationList5 = reservationSystem0.getReservations();
        main.models.Reservation reservation6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        main.enums.PaymentMethod paymentMethod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = reservationSystem0.completeReservation(reservation6, localDateTime7, paymentMethod8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(paymentList1);
        org.junit.Assert.assertNull(user4);
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Equipment> equipmentList6 = reservationSystem0.getEquipmentItems();
        main.models.Reservation reservation7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.recordArrival(reservation7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        main.models.User user5 = reservationSystem0.login("hi!", "");
        main.models.User user8 = reservationSystem0.login("", "");
        main.models.User user11 = reservationSystem0.login("hi!", "hi!");
        main.models.Reservation reservation12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.extendReservation(reservation12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList9 = reservationSystem0.getReservations();
        java.lang.Class<?> wildcardClass10 = reservationSystem0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        main.models.Reservation reservation5 = null;
        java.time.LocalDateTime localDateTime6 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.modifyReservation(reservation5, localDateTime6, localDateTime7, localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Reservation cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNotNull(reservationList4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.User> userList3 = reservationSystem0.getUsers();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        java.util.List<main.models.Payment> paymentList11 = reservationSystem0.getPayments();
        java.lang.Class<?> wildcardClass12 = paymentList11.getClass();
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNotNull(paymentList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        main.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationSystem0.registerUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        main.models.User user6 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList8 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList9 = reservationSystem0.getPayments();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList8 = reservationSystem0.getReservationsForUser("");
        main.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user10 = reservationSystem0.registerUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(reservationList8);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("hi!", "hi!");
        java.util.List<main.models.User> userList4 = reservationSystem0.getUsers();
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservationSystem0.addEquipment(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Equipment cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.Reservation> reservationList2 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Reservation> reservationList4 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Equipment> equipmentList5 = reservationSystem0.getEquipmentItems();
        org.junit.Assert.assertNotNull(reservationList2);
        org.junit.Assert.assertNotNull(reservationList4);
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Payment> paymentList2 = reservationSystem0.getPayments();
        main.models.User user5 = reservationSystem0.login("", "hi!");
        main.models.User user8 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Reservation> reservationList9 = reservationSystem0.getReservations();
        java.util.List<main.models.Reservation> reservationList11 = reservationSystem0.getReservationsForUser("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(paymentList2);
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(user8);
        org.junit.Assert.assertNotNull(reservationList9);
        org.junit.Assert.assertNotNull(reservationList11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        main.models.User user2 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.User user3 = reservationSystem0.registerUser(user2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: User cannot be null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Equipment> equipmentList7 = reservationSystem0.getEquipmentItems();
        main.models.User user10 = reservationSystem0.login("", "");
        main.models.User user13 = reservationSystem0.login("hi!", "");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        java.util.List<main.models.User> userList1 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList3 = reservationSystem0.getReservationsForUser("");
        java.util.List<main.models.Payment> paymentList4 = reservationSystem0.getPayments();
        java.util.List<main.models.User> userList5 = reservationSystem0.getUsers();
        java.util.List<main.models.Equipment> equipmentList6 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList7 = reservationSystem0.getPayments();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(reservationList3);
        org.junit.Assert.assertNotNull(paymentList4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        main.models.ReservationSystem reservationSystem0 = new main.models.ReservationSystem();
        main.models.User user3 = reservationSystem0.login("", "");
        main.models.User user6 = reservationSystem0.login("", "hi!");
        main.models.User user9 = reservationSystem0.login("hi!", "");
        java.util.List<main.models.Equipment> equipmentList10 = reservationSystem0.getEquipmentItems();
        main.models.User user13 = reservationSystem0.login("", "hi!");
        java.util.List<main.models.Reservation> reservationList14 = reservationSystem0.getReservations();
        java.util.List<main.models.Equipment> equipmentList15 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Payment> paymentList16 = reservationSystem0.getPayments();
        java.util.List<main.models.Equipment> equipmentList17 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.Equipment> equipmentList18 = reservationSystem0.getEquipmentItems();
        java.util.List<main.models.User> userList19 = reservationSystem0.getUsers();
        java.util.List<main.models.Reservation> reservationList21 = reservationSystem0.getReservationsForUser("hi!");
        org.junit.Assert.assertNull(user3);
        org.junit.Assert.assertNull(user6);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNotNull(reservationList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(paymentList16);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipmentList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(reservationList21);
    }
}

