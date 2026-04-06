package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRandoopTest1 {

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
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.lang.Class<?> wildcardClass8 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        reservation7.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((double) (short) 0, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime16, localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((double) 0L, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.lang.Class<?> wildcardClass10 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        java.lang.Class<?> wildcardClass11 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        main.models.User user8 = null;
        reservation7.setUser(user8);
        java.lang.Class<?> wildcardClass10 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        java.lang.Class<?> wildcardClass15 = reservation7.getClass();
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.Equipment equipment21 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        reservation17.setStartTime(localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation17.setStatus(reservationStatus31);
        reservation7.setStatus(reservationStatus31);
        java.time.LocalDateTime localDateTime34 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        java.lang.Class<?> wildcardClass40 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        java.time.LocalDateTime localDateTime41 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double42 = reservation7.calculateCost((double) 1L, localDateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime15, localDateTime16, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 100.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation41.modify(localDateTime42, localDateTime43, localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = reservation7.calculateCost((double) (-1), localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.lang.Class<?> wildcardClass42 = reservation41.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        double double16 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = reservation7.calculateCost((double) 10.0f, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        main.models.User user8 = null;
        reservation7.setUser(user8);
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        main.models.Equipment equipment14 = null;
        reservation7.setEquipment(equipment14);
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        java.lang.Class<?> wildcardClass22 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        main.models.User user11 = reservation7.getUser();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = reservation7.calculateCost((double) (short) 1, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) '4', equipment25, user26);
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation27.extend(localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.lang.Class<?> wildcardClass10 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.lang.String str12 = reservation7.getReservationId();
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateCost((double) ' ', localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) 1.0f, equipment25, user26);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation27.modify(localDateTime28, localDateTime29, localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateCost((double) 0L, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.Equipment equipment21 = reservation7.getEquipment();
        main.models.User user22 = reservation7.getUser();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime23, localDateTime24, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = null;
        reservation7.setUser(user39);
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime41, localDateTime42, localDateTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime9 = null;
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime8, localDateTime9, localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        java.time.LocalDateTime localDateTime40 = null;
        double double41 = reservation7.calculateCost((double) 100.0f, localDateTime40);
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        main.models.Equipment equipment13 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = null;
        reservation7.setUser(user39);
        java.lang.Class<?> wildcardClass41 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        main.models.Equipment equipment8 = null;
        reservation7.setEquipment(equipment8);
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        java.time.LocalDateTime localDateTime40 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateCost((double) (byte) 10, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("hi!", localDateTime14, localDateTime15, reservationStatus16, 0.0d, equipment18, user19);
        java.time.LocalDateTime localDateTime21 = null;
        reservation20.setStartTime(localDateTime21);
        main.models.User user23 = null;
        reservation20.setUser(user23);
        main.models.User user25 = null;
        reservation20.setUser(user25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.enums.ReservationStatus reservationStatus36 = reservation34.getStatus();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.activate();
        main.enums.ReservationStatus reservationStatus46 = reservation44.getStatus();
        reservation34.setStatus(reservationStatus46);
        reservation20.setStatus(reservationStatus46);
        reservation7.setStatus(reservationStatus46);
        java.lang.String str50 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime51, localDateTime52, localDateTime53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus46.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = reservation7.calculateCost(100.0d, localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        java.time.LocalDateTime localDateTime40 = null;
        double double41 = reservation7.calculateCost((double) 100.0f, localDateTime40);
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) 1.0f, equipment25, user26);
        main.enums.ReservationStatus reservationStatus28 = reservation27.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.lang.Class<?> wildcardClass23 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime38 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double39 = reservation7.calculateCost((double) 1, localDateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setStartTime(localDateTime11);
        main.enums.ReservationStatus reservationStatus13 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        reservation10.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("hi!", localDateTime17, localDateTime18, reservationStatus19, 0.0d, equipment21, user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation23.setStartTime(localDateTime24);
        main.models.User user26 = null;
        reservation23.setUser(user26);
        main.models.User user28 = null;
        reservation23.setUser(user28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.enums.ReservationStatus reservationStatus49 = reservation47.getStatus();
        reservation37.setStatus(reservationStatus49);
        reservation23.setStatus(reservationStatus49);
        reservation10.setStatus(reservationStatus49);
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus49, (double) '4', equipment54, user55);
        java.lang.Class<?> wildcardClass57 = reservationStatus49.getClass();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        main.enums.ReservationStatus reservationStatus38 = reservation7.getStatus();
        java.lang.String str39 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime40 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        java.lang.Class<?> wildcardClass18 = reservation7.getClass();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime17 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime19, localDateTime20, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation19.setStatus(reservationStatus31);
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus31, (double) '4', equipment34, user35);
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus31, (double) 1, equipment38, user39);
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 10.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, 0.0d, equipment46, user47);
        java.lang.String str49 = reservation48.getReservationId();
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double52 = reservation48.calculateCost((double) (short) 10, localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double21 = reservation7.calculateCost((double) 0, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        reservation7.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.setReservationId("hi!");
        main.models.Equipment equipment13 = null;
        reservation10.setEquipment(equipment13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.setReservationId("hi!");
        java.time.LocalDateTime localDateTime25 = null;
        reservation22.setStartTime(localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.enums.ReservationStatus reservationStatus36 = reservation34.getStatus();
        reservation22.setStatus(reservationStatus36);
        reservation10.setStatus(reservationStatus36);
        java.time.LocalDateTime localDateTime39 = reservation10.getStartTime();
        java.time.LocalDateTime localDateTime40 = reservation10.getStartTime();
        main.enums.ReservationStatus reservationStatus41 = reservation10.getStatus();
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus41, (double) (short) 10, equipment43, user44);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation45.modify(localDateTime46, localDateTime47, localDateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus41 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus41.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setEndTime(localDateTime15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        reservation7.setDepositAmount((double) 10.0f);
        reservation7.setDepositAmount((double) 1.0f);
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.setEndTime(localDateTime17);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = reservation7.getUser();
        main.models.Equipment equipment14 = null;
        reservation7.setEquipment(equipment14);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime16, localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        main.models.Equipment equipment42 = reservation41.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment42);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        reservation7.setDepositAmount((double) 1L);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = reservation7.calculateCost((double) 100, localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        main.models.User user8 = null;
        reservation7.setUser(user8);
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = reservation7.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = user13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime11, localDateTime12, localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.setStartTime(localDateTime42);
        java.time.LocalDateTime localDateTime44 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation41.extend(localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) (short) 0, equipment25, user26);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        java.lang.Class<?> wildcardClass21 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.setReservationId("hi!");
        main.models.Equipment equipment13 = null;
        reservation10.setEquipment(equipment13);
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.setReservationId("hi!");
        java.time.LocalDateTime localDateTime25 = null;
        reservation22.setStartTime(localDateTime25);
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.enums.ReservationStatus reservationStatus36 = reservation34.getStatus();
        reservation22.setStatus(reservationStatus36);
        reservation10.setStatus(reservationStatus36);
        java.time.LocalDateTime localDateTime39 = reservation10.getStartTime();
        java.time.LocalDateTime localDateTime40 = reservation10.getStartTime();
        main.enums.ReservationStatus reservationStatus41 = reservation10.getStatus();
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus41, (double) '4', equipment43, user44);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus41 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus41.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.setReservationId("hi!");
        main.models.Equipment equipment34 = null;
        reservation31.setEquipment(equipment34);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.setReservationId("hi!");
        java.time.LocalDateTime localDateTime46 = null;
        reservation43.setStartTime(localDateTime46);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        main.enums.ReservationStatus reservationStatus51 = null;
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("", localDateTime49, localDateTime50, reservationStatus51, (double) 10L, equipment53, user54);
        reservation55.activate();
        main.enums.ReservationStatus reservationStatus57 = reservation55.getStatus();
        reservation43.setStatus(reservationStatus57);
        reservation31.setStatus(reservationStatus57);
        main.models.User user60 = reservation31.getUser();
        reservation31.setDepositAmount((double) (-1L));
        main.enums.ReservationStatus reservationStatus63 = reservation31.getStatus();
        reservation7.setStatus(reservationStatus63);
        main.models.User user65 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + reservationStatus57 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus57.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user60);
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user65);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        java.lang.String str18 = reservation7.getReservationId();
        main.models.Equipment equipment19 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = reservation7.calculateCost((double) (byte) 1, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(equipment19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        main.enums.ReservationStatus reservationStatus24 = null;
        main.models.Equipment equipment26 = null;
        main.models.User user27 = null;
        main.models.Reservation reservation28 = new main.models.Reservation("", localDateTime22, localDateTime23, reservationStatus24, (double) 10L, equipment26, user27);
        reservation28.activate();
        main.enums.ReservationStatus reservationStatus30 = reservation28.getStatus();
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        main.enums.ReservationStatus reservationStatus34 = null;
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("", localDateTime32, localDateTime33, reservationStatus34, (double) 10L, equipment36, user37);
        reservation38.activate();
        main.enums.ReservationStatus reservationStatus40 = reservation38.getStatus();
        reservation28.setStatus(reservationStatus40);
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus40, (double) '4', equipment43, user44);
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus40, (double) 1, equipment47, user48);
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("hi!", localDateTime13, localDateTime14, reservationStatus40, (double) 100.0f, equipment51, user52);
        reservation7.setStatus(reservationStatus40);
        org.junit.Assert.assertTrue("'" + reservationStatus30 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus30.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.checkArrival(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        main.models.User user13 = null;
        reservation7.setUser(user13);
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((double) 0.0f, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.models.Equipment equipment15 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime16, localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.lang.Class<?> wildcardClass9 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        java.time.LocalDateTime localDateTime40 = null;
        double double41 = reservation7.calculateCost((double) 100.0f, localDateTime40);
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.Equipment equipment21 = reservation7.getEquipment();
        main.models.User user22 = reservation7.getUser();
        main.models.Equipment equipment23 = null;
        reservation7.setEquipment(equipment23);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.lang.String str16 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) 1.0f, equipment48, user49);
        reservation7.setStatus(reservationStatus45);
        main.models.User user52 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user52);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.time.LocalDateTime localDateTime17 = reservation7.getEndTime();
        java.lang.Class<?> wildcardClass18 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        reservation17.setStartTime(localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation17.setStatus(reservationStatus31);
        reservation7.setStatus(reservationStatus31);
        main.models.User user34 = reservation7.getUser();
        java.time.LocalDateTime localDateTime35 = null;
        reservation7.setStartTime(localDateTime35);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime20, localDateTime21, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        double double13 = reservation7.getDepositAmount();
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus14 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus14.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        reservation7.setDepositAmount((double) (-1L));
        reservation7.activate();
        java.time.LocalDateTime localDateTime40 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        reservation7.setReservationId("");
        java.lang.Class<?> wildcardClass25 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation19.setStatus(reservationStatus31);
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus31, (double) '4', equipment34, user35);
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus31, (double) 1, equipment38, user39);
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 10.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, 0.0d, equipment46, user47);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation48.modify(localDateTime49, localDateTime50, localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.ReservationStatus reservationStatus9 = null;
        main.models.Equipment equipment11 = null;
        main.models.User user12 = null;
        main.models.Reservation reservation13 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus9, (double) 10L, equipment11, user12);
        reservation13.activate();
        main.enums.ReservationStatus reservationStatus15 = reservation13.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("", localDateTime17, localDateTime18, reservationStatus19, (double) 10L, equipment21, user22);
        reservation23.activate();
        main.enums.ReservationStatus reservationStatus25 = reservation23.getStatus();
        reservation13.setStatus(reservationStatus25);
        main.models.Equipment equipment28 = null;
        main.models.User user29 = null;
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus25, (double) '4', equipment28, user29);
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus25, (double) 1, equipment32, user33);
        java.time.LocalDateTime localDateTime35 = null;
        reservation34.setStartTime(localDateTime35);
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation34.modify(localDateTime37, localDateTime38, localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        reservation7.setDepositAmount((double) '#');
        java.time.LocalDateTime localDateTime74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = reservation7.calculateCost((double) (byte) 1, localDateTime74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation19.setStatus(reservationStatus31);
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus31, (double) '4', equipment34, user35);
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus31, (double) 1L, equipment38, user39);
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 10.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, (double) (short) 1, equipment46, user47);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setStartTime(localDateTime11);
        reservation7.setDepositAmount((double) 1L);
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        reservation7.setDepositAmount((double) '#');
        java.time.LocalDateTime localDateTime74 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double75 = reservation7.calculateCost(0.0d, localDateTime74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setStartTime(localDateTime11);
        main.models.User user13 = null;
        reservation10.setUser(user13);
        main.models.User user15 = null;
        reservation10.setUser(user15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        main.enums.ReservationStatus reservationStatus26 = reservation24.getStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.enums.ReservationStatus reservationStatus36 = reservation34.getStatus();
        reservation24.setStatus(reservationStatus36);
        reservation10.setStatus(reservationStatus36);
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus36, (double) 10L, equipment40, user41);
        main.models.Equipment equipment43 = reservation42.getEquipment();
        double double44 = reservation42.getDepositAmount();
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation42.extend(localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        reservation7.setReservationId("");
        main.models.Equipment equipment25 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime26, localDateTime27, localDateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment25);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateCost(1.0d, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        main.models.User user15 = null;
        reservation7.setUser(user15);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        reservation7.activate();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateCost((double) ' ', localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        reservation7.setDepositAmount((double) 10.0f);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        main.enums.ReservationStatus reservationStatus38 = reservation7.getStatus();
        java.lang.String str39 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime40 = null;
        reservation7.setStartTime(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime17 = reservation7.getStartTime();
        main.models.User user18 = reservation7.getUser();
        java.time.LocalDateTime localDateTime19 = null;
        reservation7.setStartTime(localDateTime19);
        java.time.LocalDateTime localDateTime21 = null;
        reservation7.setEndTime(localDateTime21);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        double double10 = reservation7.getDepositAmount();
        reservation7.setReservationId("");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        reservation7.setDepositAmount((double) (-1L));
        main.enums.ReservationStatus reservationStatus39 = reservation7.getStatus();
        main.enums.ReservationStatus reservationStatus40 = reservation7.getStatus();
        main.models.User user41 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.User user12 = reservation7.getUser();
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost(0.0d, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.User user10 = reservation7.getUser();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = null;
        reservation7.setStatus(reservationStatus10);
        reservation7.setDepositAmount((double) 100);
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        java.time.LocalDateTime localDateTime21 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime22 = reservation7.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = localDateTime22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        reservation7.setDepositAmount((double) (-1));
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = reservation7.calculateCost((double) (short) 10, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        java.time.LocalDateTime localDateTime71 = null;
        reservation7.setStartTime(localDateTime71);
        java.time.LocalDateTime localDateTime73 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        reservation7.activate();
        java.lang.String str15 = reservation7.getReservationId();
        main.models.User user16 = null;
        reservation7.setUser(user16);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        reservation17.setStartTime(localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation17.setStatus(reservationStatus31);
        reservation7.setStatus(reservationStatus31);
        main.models.User user34 = reservation7.getUser();
        double double35 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double38 = reservation7.calculateCost(10.0d, localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.lang.String str12 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getStartTime();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(reservationStatus16);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus10 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus10.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime13, localDateTime14, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        double double40 = reservation7.getDepositAmount();
        java.lang.Class<?> wildcardClass41 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.checkArrival(localDateTime17);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        java.lang.String str18 = reservation7.getReservationId();
        main.models.Equipment equipment19 = reservation7.getEquipment();
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(equipment19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = reservation7.getUser();
        reservation7.setDepositAmount((-1.0d));
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user39);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        main.enums.ReservationStatus reservationStatus24 = reservation22.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        reservation22.setStatus(reservationStatus34);
        main.models.Equipment equipment37 = null;
        main.models.User user38 = null;
        main.models.Reservation reservation39 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus34, (double) '4', equipment37, user38);
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus34, (double) 1, equipment41, user42);
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus34, (double) 10.0f, equipment45, user46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus34, (double) 0, equipment49, user50);
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus34, 0.0d, equipment53, user54);
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation55.modify(localDateTime56, localDateTime57, localDateTime58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setStartTime(localDateTime11);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((double) (short) -1, localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.checkArrival(localDateTime42);
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        main.models.Equipment equipment54 = reservation51.getEquipment();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        main.enums.ReservationStatus reservationStatus64 = null;
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime62, localDateTime63, reservationStatus64, (double) 10L, equipment66, user67);
        reservation68.activate();
        main.enums.ReservationStatus reservationStatus70 = reservation68.getStatus();
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        main.enums.ReservationStatus reservationStatus74 = null;
        main.models.Equipment equipment76 = null;
        main.models.User user77 = null;
        main.models.Reservation reservation78 = new main.models.Reservation("", localDateTime72, localDateTime73, reservationStatus74, (double) 10L, equipment76, user77);
        reservation78.activate();
        main.enums.ReservationStatus reservationStatus80 = reservation78.getStatus();
        reservation68.setStatus(reservationStatus80);
        main.models.Equipment equipment83 = null;
        main.models.User user84 = null;
        main.models.Reservation reservation85 = new main.models.Reservation("", localDateTime59, localDateTime60, reservationStatus80, (double) '4', equipment83, user84);
        main.models.Equipment equipment87 = null;
        main.models.User user88 = null;
        main.models.Reservation reservation89 = new main.models.Reservation("hi!", localDateTime56, localDateTime57, reservationStatus80, (double) 1L, equipment87, user88);
        reservation51.setStatus(reservationStatus80);
        reservation41.setStatus(reservationStatus80);
        main.models.User user92 = null;
        reservation41.setUser(user92);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment54);
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus80 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus80.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        double double40 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = reservation7.calculateCost((double) (byte) 10, localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        double double11 = reservation7.getDepositAmount();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) (short) 10);
        double double12 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.setStartTime(localDateTime18);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        main.models.User user37 = reservation7.getUser();
        java.time.LocalDateTime localDateTime38 = null;
        reservation7.checkArrival(localDateTime38);
        java.lang.String str40 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        reservation7.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        double double11 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.checkArrival(localDateTime12);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        reservation7.setReservationId("");
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.lang.String str12 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus13 = reservation7.getStatus();
        double double14 = reservation7.getDepositAmount();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        reservation7.activate();
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.checkArrival(localDateTime18);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) 1.0f, equipment48, user49);
        reservation7.setStatus(reservationStatus45);
        main.models.User user52 = null;
        reservation7.setUser(user52);
        reservation7.activate();
        java.time.LocalDateTime localDateTime55 = null;
        reservation7.setEndTime(localDateTime55);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) '4', equipment48, user49);
        main.models.Equipment equipment52 = null;
        main.models.User user53 = null;
        main.models.Reservation reservation54 = new main.models.Reservation("", localDateTime21, localDateTime22, reservationStatus45, (double) 1, equipment52, user53);
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("hi!", localDateTime18, localDateTime19, reservationStatus45, (double) 10.0f, equipment56, user57);
        reservation7.setStatus(reservationStatus45);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        double double8 = reservation7.getDepositAmount();
        java.lang.Class<?> wildcardClass9 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.lang.String str11 = reservation7.getReservationId();
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = null;
        reservation7.setUser(user13);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.enums.ReservationStatus reservationStatus12 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        reservation7.setReservationId("hi!");
        main.models.User user18 = null;
        reservation7.setUser(user18);
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setDepositAmount((double) (short) -1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = null;
        reservation7.setUser(user13);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.lang.String str10 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        main.models.Equipment equipment38 = reservation7.getEquipment();
        main.models.Equipment equipment39 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime40, localDateTime41, localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) '4', equipment48, user49);
        main.models.Equipment equipment52 = null;
        main.models.User user53 = null;
        main.models.Reservation reservation54 = new main.models.Reservation("", localDateTime21, localDateTime22, reservationStatus45, (double) 1, equipment52, user53);
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("hi!", localDateTime18, localDateTime19, reservationStatus45, (double) 10.0f, equipment56, user57);
        reservation7.setStatus(reservationStatus45);
        reservation7.setDepositAmount((double) (byte) 1);
        java.time.LocalDateTime localDateTime62 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus22, (double) (byte) 10, equipment25, user26);
        java.lang.Class<?> wildcardClass28 = reservation27.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        reservation7.activate();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        main.models.Equipment equipment38 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        java.lang.String str18 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime19 = null;
        reservation7.setEndTime(localDateTime19);
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation7.calculateCost((double) (byte) 1, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        reservation7.setDepositAmount((double) (-1L));
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        reservation7.activate();
        main.models.Equipment equipment23 = reservation7.getEquipment();
        main.enums.ReservationStatus reservationStatus24 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        reservation7.setStartTime(localDateTime25);
        java.lang.String str27 = reservation7.getReservationId();
        java.lang.Class<?> wildcardClass28 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment23);
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.enums.ReservationStatus reservationStatus12 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime18, localDateTime19, localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        main.models.User user71 = null;
        reservation7.setUser(user71);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        java.time.LocalDateTime localDateTime21 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime22 = reservation7.getEndTime();
        reservation7.setDepositAmount((double) (byte) 10);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertNull(localDateTime22);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation7.calculateCost((double) (short) -1, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        java.time.LocalDateTime localDateTime26 = reservation24.getStartTime();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        java.time.LocalDateTime localDateTime39 = null;
        reservation37.setStartTime(localDateTime39);
        double double41 = reservation37.getDepositAmount();
        main.enums.ReservationStatus reservationStatus42 = reservation37.getStatus();
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("hi!", localDateTime28, localDateTime29, reservationStatus42, (double) 100, equipment44, user45);
        reservation24.setStatus(reservationStatus42);
        reservation7.setStatus(reservationStatus42);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime49, localDateTime50, localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus42.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        reservation7.activate();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = null;
        reservation7.setUser(user39);
        main.models.User user41 = null;
        reservation7.setUser(user41);
        double double43 = reservation7.getDepositAmount();
        main.models.User user44 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNull(user44);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.models.User user21 = reservation19.getUser();
        reservation19.activate();
        java.time.LocalDateTime localDateTime23 = null;
        reservation19.setEndTime(localDateTime23);
        java.time.LocalDateTime localDateTime25 = null;
        reservation19.setStartTime(localDateTime25);
        main.enums.ReservationStatus reservationStatus27 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime28 = null;
        reservation19.setEndTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.setReservationId("hi!");
        java.time.LocalDateTime localDateTime40 = null;
        reservation37.setStartTime(localDateTime40);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        main.enums.ReservationStatus reservationStatus45 = null;
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("", localDateTime43, localDateTime44, reservationStatus45, (double) 10L, equipment47, user48);
        reservation49.activate();
        main.enums.ReservationStatus reservationStatus51 = reservation49.getStatus();
        reservation37.setStatus(reservationStatus51);
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        main.enums.ReservationStatus reservationStatus59 = null;
        main.models.Equipment equipment61 = null;
        main.models.User user62 = null;
        main.models.Reservation reservation63 = new main.models.Reservation("", localDateTime57, localDateTime58, reservationStatus59, (double) 10L, equipment61, user62);
        reservation63.activate();
        main.enums.ReservationStatus reservationStatus65 = reservation63.getStatus();
        java.time.LocalDateTime localDateTime67 = null;
        java.time.LocalDateTime localDateTime68 = null;
        main.enums.ReservationStatus reservationStatus69 = null;
        main.models.Equipment equipment71 = null;
        main.models.User user72 = null;
        main.models.Reservation reservation73 = new main.models.Reservation("", localDateTime67, localDateTime68, reservationStatus69, (double) 10L, equipment71, user72);
        reservation73.activate();
        main.enums.ReservationStatus reservationStatus75 = reservation73.getStatus();
        reservation63.setStatus(reservationStatus75);
        main.models.Equipment equipment78 = null;
        main.models.User user79 = null;
        main.models.Reservation reservation80 = new main.models.Reservation("", localDateTime54, localDateTime55, reservationStatus75, (double) 1.0f, equipment78, user79);
        reservation37.setStatus(reservationStatus75);
        reservation19.setStatus(reservationStatus75);
        reservation7.setStatus(reservationStatus75);
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + reservationStatus27 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus27.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus51 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus51.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        reservation7.activate();
        double double15 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setStartTime(localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime17, localDateTime18, localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        double double14 = reservation7.getDepositAmount();
        java.lang.Class<?> wildcardClass15 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        reservation7.activate();
        java.lang.String str15 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime16 = reservation7.getStartTime();
        main.enums.ReservationStatus reservationStatus17 = reservation7.getStatus();
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        main.models.User user71 = reservation7.getUser();
        java.time.LocalDateTime localDateTime73 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double74 = reservation7.calculateCost((double) (-1.0f), localDateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user71);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        java.time.LocalDateTime localDateTime26 = reservation24.getStartTime();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        java.time.LocalDateTime localDateTime39 = null;
        reservation37.setStartTime(localDateTime39);
        double double41 = reservation37.getDepositAmount();
        main.enums.ReservationStatus reservationStatus42 = reservation37.getStatus();
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("hi!", localDateTime28, localDateTime29, reservationStatus42, (double) 100, equipment44, user45);
        reservation24.setStatus(reservationStatus42);
        reservation7.setStatus(reservationStatus42);
        main.models.Equipment equipment49 = null;
        reservation7.setEquipment(equipment49);
        java.time.LocalDateTime localDateTime51 = reservation7.getEndTime();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus42.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime51);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = reservation7.getStartTime();
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        reservation7.activate();
        java.time.LocalDateTime localDateTime16 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        main.models.User user17 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime14, localDateTime15, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        main.enums.ReservationStatus reservationStatus12 = null;
        main.models.Equipment equipment14 = null;
        main.models.User user15 = null;
        main.models.Reservation reservation16 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus12, (double) 10L, equipment14, user15);
        reservation16.activate();
        main.enums.ReservationStatus reservationStatus18 = reservation16.getStatus();
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.activate();
        main.enums.ReservationStatus reservationStatus28 = reservation26.getStatus();
        reservation16.setStatus(reservationStatus28);
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) '4', equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) 1, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) (-1.0f), equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.setStartTime(localDateTime42);
        main.models.User user44 = reservation41.getUser();
        java.time.LocalDateTime localDateTime46 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double47 = reservation41.calculateCost((double) (short) 0, localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user44);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.models.User user15 = null;
        reservation7.setUser(user15);
        java.lang.String str17 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.checkArrival(localDateTime18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        main.models.User user11 = reservation7.getUser();
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.setReservationId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        reservation25.setStartTime(localDateTime28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation25.setStatus(reservationStatus39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        main.enums.ReservationStatus reservationStatus47 = null;
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime45, localDateTime46, reservationStatus47, (double) 10L, equipment49, user50);
        reservation51.activate();
        main.enums.ReservationStatus reservationStatus53 = reservation51.getStatus();
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        reservation51.setStatus(reservationStatus63);
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus63, (double) 1.0f, equipment66, user67);
        reservation25.setStatus(reservationStatus63);
        reservation7.setStatus(reservationStatus63);
        java.time.LocalDateTime localDateTime71 = null;
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime71, localDateTime72, localDateTime73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        main.enums.ReservationStatus reservationStatus24 = reservation22.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        reservation22.setStatus(reservationStatus34);
        main.models.Equipment equipment37 = null;
        main.models.User user38 = null;
        main.models.Reservation reservation39 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus34, (double) '4', equipment37, user38);
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus34, (double) 1, equipment41, user42);
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus34, (double) 10.0f, equipment45, user46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus34, (double) 0, equipment49, user50);
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus34, (double) (-1), equipment53, user54);
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        main.models.Equipment equipment38 = reservation7.getEquipment();
        main.models.Equipment equipment39 = reservation7.getEquipment();
        main.enums.ReservationStatus reservationStatus40 = reservation7.getStatus();
        java.lang.String str41 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        main.enums.ReservationStatus reservationStatus24 = reservation22.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        reservation22.setStatus(reservationStatus34);
        main.models.Equipment equipment37 = null;
        main.models.User user38 = null;
        main.models.Reservation reservation39 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus34, (double) '4', equipment37, user38);
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus34, (double) 1, equipment41, user42);
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus34, (double) 10.0f, equipment45, user46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus34, (double) 0, equipment49, user50);
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus34, 0.0d, equipment53, user54);
        double double56 = reservation55.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.0d + "'", double56 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) (short) 10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        reservation7.setDepositAmount((double) (byte) 0);
        java.lang.String str16 = reservation7.getReservationId();
        reservation7.setDepositAmount((double) '#');
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        reservation7.activate();
        main.models.Equipment equipment23 = reservation7.getEquipment();
        main.enums.ReservationStatus reservationStatus24 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        reservation7.setStartTime(localDateTime25);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime27, localDateTime28, localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment23);
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = null;
        reservation7.setUser(user39);
        main.models.User user41 = null;
        reservation7.setUser(user41);
        main.enums.ReservationStatus reservationStatus43 = reservation7.getStatus();
        double double44 = reservation7.getDepositAmount();
        main.models.User user45 = null;
        reservation7.setUser(user45);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus43.equals(main.enums.ReservationStatus.NoShow));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setEndTime(localDateTime10);
        reservation7.setDepositAmount((double) ' ');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation19.setStatus(reservationStatus31);
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus31, (double) '4', equipment34, user35);
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus31, (double) 1, equipment38, user39);
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 10.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, 0.0d, equipment46, user47);
        java.time.LocalDateTime localDateTime49 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation48.extend(localDateTime49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation17.getStatus();
        reservation7.setStatus(reservationStatus19);
        main.models.User user21 = reservation7.getUser();
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.ReservationStatus reservationStatus9 = null;
        main.models.Equipment equipment11 = null;
        main.models.User user12 = null;
        main.models.Reservation reservation13 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus9, (double) 10L, equipment11, user12);
        reservation13.activate();
        main.enums.ReservationStatus reservationStatus15 = reservation13.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("", localDateTime17, localDateTime18, reservationStatus19, (double) 10L, equipment21, user22);
        reservation23.activate();
        main.enums.ReservationStatus reservationStatus25 = reservation23.getStatus();
        reservation13.setStatus(reservationStatus25);
        main.models.Equipment equipment28 = null;
        main.models.User user29 = null;
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus25, (double) '4', equipment28, user29);
        reservation30.setDepositAmount((double) (short) 0);
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        main.enums.ReservationStatus reservationStatus36 = null;
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("", localDateTime34, localDateTime35, reservationStatus36, (double) 10L, equipment38, user39);
        reservation40.activate();
        java.time.LocalDateTime localDateTime42 = null;
        reservation40.setStartTime(localDateTime42);
        double double44 = reservation40.getDepositAmount();
        main.models.Equipment equipment45 = reservation40.getEquipment();
        main.models.Equipment equipment46 = null;
        reservation40.setEquipment(equipment46);
        java.time.LocalDateTime localDateTime48 = null;
        reservation40.checkArrival(localDateTime48);
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        main.enums.ReservationStatus reservationStatus62 = null;
        main.models.Equipment equipment64 = null;
        main.models.User user65 = null;
        main.models.Reservation reservation66 = new main.models.Reservation("", localDateTime60, localDateTime61, reservationStatus62, (double) 10L, equipment64, user65);
        reservation66.activate();
        main.enums.ReservationStatus reservationStatus68 = reservation66.getStatus();
        java.time.LocalDateTime localDateTime70 = null;
        java.time.LocalDateTime localDateTime71 = null;
        main.enums.ReservationStatus reservationStatus72 = null;
        main.models.Equipment equipment74 = null;
        main.models.User user75 = null;
        main.models.Reservation reservation76 = new main.models.Reservation("", localDateTime70, localDateTime71, reservationStatus72, (double) 10L, equipment74, user75);
        reservation76.activate();
        main.enums.ReservationStatus reservationStatus78 = reservation76.getStatus();
        reservation66.setStatus(reservationStatus78);
        main.models.Equipment equipment81 = null;
        main.models.User user82 = null;
        main.models.Reservation reservation83 = new main.models.Reservation("", localDateTime57, localDateTime58, reservationStatus78, (double) '4', equipment81, user82);
        main.models.Equipment equipment85 = null;
        main.models.User user86 = null;
        main.models.Reservation reservation87 = new main.models.Reservation("", localDateTime54, localDateTime55, reservationStatus78, (double) 1, equipment85, user86);
        main.models.Equipment equipment89 = null;
        main.models.User user90 = null;
        main.models.Reservation reservation91 = new main.models.Reservation("hi!", localDateTime51, localDateTime52, reservationStatus78, (double) 10.0f, equipment89, user90);
        reservation40.setStatus(reservationStatus78);
        reservation30.setStatus(reservationStatus78);
        main.models.Equipment equipment95 = null;
        main.models.User user96 = null;
        main.models.Reservation reservation97 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus78, (double) (byte) 100, equipment95, user96);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNull(equipment45);
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus78 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus78.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        main.models.User user36 = reservation7.getUser();
        java.time.LocalDateTime localDateTime37 = null;
        reservation7.checkArrival(localDateTime37);
        main.models.User user39 = reservation7.getUser();
        reservation7.setDepositAmount((-1.0d));
        java.time.LocalDateTime localDateTime42 = reservation7.getEndTime();
        main.models.Equipment equipment43 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime44 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertNull(localDateTime44);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        main.enums.ReservationStatus reservationStatus13 = null;
        main.models.Equipment equipment15 = null;
        main.models.User user16 = null;
        main.models.Reservation reservation17 = new main.models.Reservation("", localDateTime11, localDateTime12, reservationStatus13, (double) 10L, equipment15, user16);
        reservation17.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        reservation17.setStartTime(localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation17.setStatus(reservationStatus31);
        reservation7.setStatus(reservationStatus31);
        main.models.User user34 = reservation7.getUser();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        main.enums.ReservationStatus reservationStatus38 = null;
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime36, localDateTime37, reservationStatus38, (double) 10L, equipment40, user41);
        reservation42.activate();
        java.time.LocalDateTime localDateTime44 = null;
        reservation42.setStartTime(localDateTime44);
        double double46 = reservation42.getDepositAmount();
        main.models.Equipment equipment47 = reservation42.getEquipment();
        main.models.Equipment equipment48 = null;
        reservation42.setEquipment(equipment48);
        java.time.LocalDateTime localDateTime50 = null;
        reservation42.checkArrival(localDateTime50);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        main.enums.ReservationStatus reservationStatus64 = null;
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime62, localDateTime63, reservationStatus64, (double) 10L, equipment66, user67);
        reservation68.activate();
        main.enums.ReservationStatus reservationStatus70 = reservation68.getStatus();
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        main.enums.ReservationStatus reservationStatus74 = null;
        main.models.Equipment equipment76 = null;
        main.models.User user77 = null;
        main.models.Reservation reservation78 = new main.models.Reservation("", localDateTime72, localDateTime73, reservationStatus74, (double) 10L, equipment76, user77);
        reservation78.activate();
        main.enums.ReservationStatus reservationStatus80 = reservation78.getStatus();
        reservation68.setStatus(reservationStatus80);
        main.models.Equipment equipment83 = null;
        main.models.User user84 = null;
        main.models.Reservation reservation85 = new main.models.Reservation("", localDateTime59, localDateTime60, reservationStatus80, (double) '4', equipment83, user84);
        main.models.Equipment equipment87 = null;
        main.models.User user88 = null;
        main.models.Reservation reservation89 = new main.models.Reservation("", localDateTime56, localDateTime57, reservationStatus80, (double) 1, equipment87, user88);
        main.models.Equipment equipment91 = null;
        main.models.User user92 = null;
        main.models.Reservation reservation93 = new main.models.Reservation("hi!", localDateTime53, localDateTime54, reservationStatus80, (double) 10.0f, equipment91, user92);
        reservation42.setStatus(reservationStatus80);
        reservation7.setStatus(reservationStatus80);
        java.time.LocalDateTime localDateTime96 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNull(equipment47);
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus80 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus80.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        main.enums.ReservationStatus reservationStatus14 = null;
        main.models.Equipment equipment16 = null;
        main.models.User user17 = null;
        main.models.Reservation reservation18 = new main.models.Reservation("", localDateTime12, localDateTime13, reservationStatus14, (double) 10L, equipment16, user17);
        reservation18.activate();
        java.time.LocalDateTime localDateTime20 = null;
        reservation18.setStartTime(localDateTime20);
        double double22 = reservation18.getDepositAmount();
        double double23 = reservation18.getDepositAmount();
        java.time.LocalDateTime localDateTime24 = reservation18.getStartTime();
        reservation18.activate();
        java.lang.String str26 = reservation18.getReservationId();
        java.time.LocalDateTime localDateTime27 = reservation18.getStartTime();
        main.enums.ReservationStatus reservationStatus28 = reservation18.getStatus();
        reservation7.setStatus(reservationStatus28);
        org.junit.Assert.assertNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.models.User user15 = null;
        reservation7.setUser(user15);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.lang.Class<?> wildcardClass10 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = reservation7.getUser();
        main.models.Equipment equipment14 = null;
        reservation7.setEquipment(equipment14);
        java.time.LocalDateTime localDateTime16 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) 1.0f, equipment25, user26);
        java.time.LocalDateTime localDateTime28 = null;
        reservation27.checkArrival(localDateTime28);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setStartTime(localDateTime15);
        main.enums.ReservationStatus reservationStatus17 = reservation7.getStatus();
        reservation7.activate();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(reservationStatus17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setEndTime(localDateTime12);
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        org.junit.Assert.assertNull(reservationStatus14);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.activate();
        main.enums.ReservationStatus reservationStatus31 = reservation29.getStatus();
        reservation19.setStatus(reservationStatus31);
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime10, localDateTime11, reservationStatus31, (double) '4', equipment34, user35);
        main.models.Equipment equipment38 = null;
        main.models.User user39 = null;
        main.models.Reservation reservation40 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus31, (double) 1, equipment38, user39);
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 10.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, (double) 0, equipment46, user47);
        java.lang.String str49 = reservation48.getReservationId();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation48.modify(localDateTime50, localDateTime51, localDateTime52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        main.models.User user12 = reservation7.getUser();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        double double40 = reservation7.getDepositAmount();
        reservation7.activate();
        java.time.LocalDateTime localDateTime42 = null;
        reservation7.setStartTime(localDateTime42);
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setStartTime(localDateTime11);
        main.models.User user13 = null;
        reservation10.setUser(user13);
        main.models.User user15 = null;
        reservation10.setUser(user15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        main.enums.ReservationStatus reservationStatus26 = reservation24.getStatus();
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.enums.ReservationStatus reservationStatus36 = reservation34.getStatus();
        reservation24.setStatus(reservationStatus36);
        reservation10.setStatus(reservationStatus36);
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus36, (double) 10L, equipment40, user41);
        main.models.Equipment equipment43 = reservation42.getEquipment();
        double double44 = reservation42.getDepositAmount();
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation42.cancel(localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        reservation7.setDepositAmount((double) (byte) 100);
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus12 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        reservation10.setStatus(reservationStatus22);
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus22, (double) '4', equipment25, user26);
        reservation27.activate();
        java.time.LocalDateTime localDateTime30 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double31 = reservation27.calculateCost((double) 100, localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        java.lang.String str15 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        main.enums.ReservationStatus reservationStatus19 = null;
        reservation7.setStatus(reservationStatus19);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.checkArrival(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.setEndTime(localDateTime18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        double double11 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setStartTime(localDateTime12);
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setStartTime(localDateTime11);
        main.enums.ReservationStatus reservationStatus13 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        reservation10.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("hi!", localDateTime17, localDateTime18, reservationStatus19, 0.0d, equipment21, user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation23.setStartTime(localDateTime24);
        main.models.User user26 = null;
        reservation23.setUser(user26);
        main.models.User user28 = null;
        reservation23.setUser(user28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.enums.ReservationStatus reservationStatus49 = reservation47.getStatus();
        reservation37.setStatus(reservationStatus49);
        reservation23.setStatus(reservationStatus49);
        reservation10.setStatus(reservationStatus49);
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus49, 1.0d, equipment54, user55);
        java.time.LocalDateTime localDateTime57 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation56.cancel(localDateTime57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) 1.0f, equipment48, user49);
        reservation7.setStatus(reservationStatus45);
        main.models.User user52 = null;
        reservation7.setUser(user52);
        main.models.User user54 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user54);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = reservation7.calculateCost((double) (byte) 1, localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = reservation7.calculateCost((double) (byte) -1, localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.lang.String str11 = reservation7.getReservationId();
        main.models.Equipment equipment12 = null;
        reservation7.setEquipment(equipment12);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) 1.0f, equipment48, user49);
        reservation7.setStatus(reservationStatus45);
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setStartTime(localDateTime13);
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime16, localDateTime17, localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.setDepositAmount((double) 1.0f);
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        main.enums.ReservationStatus reservationStatus29 = null;
        main.models.Equipment equipment31 = null;
        main.models.User user32 = null;
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus29, (double) 10L, equipment31, user32);
        reservation33.activate();
        main.enums.ReservationStatus reservationStatus35 = reservation33.getStatus();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        main.enums.ReservationStatus reservationStatus45 = reservation43.getStatus();
        reservation33.setStatus(reservationStatus45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus45, (double) 1.0f, equipment48, user49);
        reservation7.setStatus(reservationStatus45);
        main.models.Equipment equipment52 = null;
        reservation7.setEquipment(equipment52);
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        double double11 = reservation7.getDepositAmount();
        double double12 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        reservation7.setReservationId("");
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setEndTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.checkArrival(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setStartTime(localDateTime16);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.models.User user10 = null;
        reservation7.setUser(user10);
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        main.enums.ReservationStatus reservationStatus23 = reservation21.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation21.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = null;
        reservation7.setEndTime(localDateTime36);
        reservation7.setDepositAmount((double) (byte) -1);
        java.time.LocalDateTime localDateTime40 = null;
        reservation7.setStartTime(localDateTime40);
        main.enums.ReservationStatus reservationStatus42 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus42.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        main.models.Equipment equipment10 = null;
        reservation7.setEquipment(equipment10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.setReservationId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        reservation19.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.enums.ReservationStatus reservationStatus33 = reservation31.getStatus();
        reservation19.setStatus(reservationStatus33);
        reservation7.setStatus(reservationStatus33);
        java.time.LocalDateTime localDateTime36 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime37 = reservation7.getStartTime();
        java.lang.String str38 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        main.models.User user9 = null;
        reservation7.setUser(user9);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.ReservationStatus reservationStatus9 = null;
        main.models.Equipment equipment11 = null;
        main.models.User user12 = null;
        main.models.Reservation reservation13 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus9, (double) 10L, equipment11, user12);
        reservation13.activate();
        main.enums.ReservationStatus reservationStatus15 = reservation13.getStatus();
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("", localDateTime17, localDateTime18, reservationStatus19, (double) 10L, equipment21, user22);
        reservation23.activate();
        main.enums.ReservationStatus reservationStatus25 = reservation23.getStatus();
        reservation13.setStatus(reservationStatus25);
        main.models.Equipment equipment28 = null;
        main.models.User user29 = null;
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus25, (double) '4', equipment28, user29);
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus25, (double) 1L, equipment32, user33);
        main.enums.ReservationStatus reservationStatus35 = null;
        reservation34.setStatus(reservationStatus35);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.models.Equipment equipment49 = reservation47.getEquipment();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        main.enums.ReservationStatus reservationStatus53 = null;
        main.models.Equipment equipment55 = null;
        main.models.User user56 = null;
        main.models.Reservation reservation57 = new main.models.Reservation("", localDateTime51, localDateTime52, reservationStatus53, (double) 10L, equipment55, user56);
        reservation57.setReservationId("hi!");
        java.time.LocalDateTime localDateTime60 = null;
        reservation57.setStartTime(localDateTime60);
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        main.enums.ReservationStatus reservationStatus65 = null;
        main.models.Equipment equipment67 = null;
        main.models.User user68 = null;
        main.models.Reservation reservation69 = new main.models.Reservation("", localDateTime63, localDateTime64, reservationStatus65, (double) 10L, equipment67, user68);
        reservation69.activate();
        main.enums.ReservationStatus reservationStatus71 = reservation69.getStatus();
        reservation57.setStatus(reservationStatus71);
        reservation47.setStatus(reservationStatus71);
        main.models.Equipment equipment75 = null;
        main.models.User user76 = null;
        main.models.Reservation reservation77 = new main.models.Reservation("hi!", localDateTime38, localDateTime39, reservationStatus71, (double) 10L, equipment75, user76);
        reservation34.setStatus(reservationStatus71);
        java.lang.Class<?> wildcardClass79 = reservation34.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment49);
        org.junit.Assert.assertTrue("'" + reservationStatus71 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus71.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setStartTime(localDateTime11);
        main.models.Equipment equipment13 = reservation7.getEquipment();
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        java.lang.Class<?> wildcardClass15 = reservation7.getClass();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertTrue("'" + reservationStatus14 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus14.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus15, (double) 10L, equipment17, user18);
        reservation19.activate();
        main.enums.ReservationStatus reservationStatus21 = reservation19.getStatus();
        reservation7.setStatus(reservationStatus21);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime25 = reservation7.getStartTime();
        main.models.Equipment equipment26 = null;
        reservation7.setEquipment(equipment26);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = null;
        reservation10.setStartTime(localDateTime11);
        main.enums.ReservationStatus reservationStatus13 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        reservation10.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("hi!", localDateTime17, localDateTime18, reservationStatus19, 0.0d, equipment21, user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation23.setStartTime(localDateTime24);
        main.models.User user26 = null;
        reservation23.setUser(user26);
        main.models.User user28 = null;
        reservation23.setUser(user28);
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.enums.ReservationStatus reservationStatus49 = reservation47.getStatus();
        reservation37.setStatus(reservationStatus49);
        reservation23.setStatus(reservationStatus49);
        reservation10.setStatus(reservationStatus49);
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus49, (double) '4', equipment54, user55);
        main.models.Equipment equipment57 = reservation56.getEquipment();
        reservation56.activate();
        main.models.Equipment equipment59 = null;
        reservation56.setEquipment(equipment59);
        reservation56.activate();
        java.time.LocalDateTime localDateTime63 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double64 = reservation56.calculateCost(100.0d, localDateTime63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.lang.String str9 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime10 = null;
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime10, localDateTime11, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }
}

