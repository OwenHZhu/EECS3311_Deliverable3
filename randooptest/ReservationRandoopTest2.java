package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRandoopTest2 {

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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
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
        main.models.User user38 = reservation7.getUser();
        main.models.User user39 = reservation7.getUser();
        main.models.Equipment equipment40 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(equipment40);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
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
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        java.time.LocalDateTime localDateTime22 = null;
        reservation20.setStartTime(localDateTime22);
        double double24 = reservation20.getDepositAmount();
        main.enums.ReservationStatus reservationStatus25 = reservation20.getStatus();
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("hi!", localDateTime11, localDateTime12, reservationStatus25, (double) 100, equipment27, user28);
        reservation7.setStatus(reservationStatus25);
        double double31 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime32 = null;
        reservation7.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime34 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime35, localDateTime36, localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertNull(localDateTime34);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
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
        java.time.LocalDateTime localDateTime39 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double40 = reservation7.calculateCost((double) 100, localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.checkArrival(localDateTime24);
        main.models.Equipment equipment26 = reservation7.getEquipment();
        java.lang.String str27 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
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
        java.time.LocalDateTime localDateTime39 = null;
        reservation7.checkArrival(localDateTime39);
        java.time.LocalDateTime localDateTime41 = null;
        reservation7.checkArrival(localDateTime41);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
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
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.setStartTime(localDateTime17);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
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
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.setEndTime(localDateTime14);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
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
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
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
        java.time.LocalDateTime localDateTime55 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double56 = reservation7.calculateCost((-1.0d), localDateTime55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
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
        java.lang.String str71 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime72 = reservation7.getEndTime();
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(localDateTime72);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        main.models.Equipment equipment8 = null;
        reservation7.setEquipment(equipment8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
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
        main.models.User user65 = null;
        reservation7.setUser(user65);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + reservationStatus57 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus57.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user60);
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
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
        main.models.User user44 = null;
        reservation7.setUser(user44);
        java.time.LocalDateTime localDateTime46 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus43.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
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
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.checkArrival(localDateTime18);
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
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
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
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
        java.time.LocalDateTime localDateTime45 = null;
        reservation44.checkArrival(localDateTime45);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        main.enums.ReservationStatus reservationStatus50 = null;
        main.models.Equipment equipment52 = null;
        main.models.User user53 = null;
        main.models.Reservation reservation54 = new main.models.Reservation("", localDateTime48, localDateTime49, reservationStatus50, (double) 10L, equipment52, user53);
        reservation54.activate();
        main.enums.ReservationStatus reservationStatus56 = reservation54.getStatus();
        main.models.Equipment equipment57 = reservation54.getEquipment();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        main.enums.ReservationStatus reservationStatus67 = null;
        main.models.Equipment equipment69 = null;
        main.models.User user70 = null;
        main.models.Reservation reservation71 = new main.models.Reservation("", localDateTime65, localDateTime66, reservationStatus67, (double) 10L, equipment69, user70);
        reservation71.activate();
        main.enums.ReservationStatus reservationStatus73 = reservation71.getStatus();
        java.time.LocalDateTime localDateTime75 = null;
        java.time.LocalDateTime localDateTime76 = null;
        main.enums.ReservationStatus reservationStatus77 = null;
        main.models.Equipment equipment79 = null;
        main.models.User user80 = null;
        main.models.Reservation reservation81 = new main.models.Reservation("", localDateTime75, localDateTime76, reservationStatus77, (double) 10L, equipment79, user80);
        reservation81.activate();
        main.enums.ReservationStatus reservationStatus83 = reservation81.getStatus();
        reservation71.setStatus(reservationStatus83);
        main.models.Equipment equipment86 = null;
        main.models.User user87 = null;
        main.models.Reservation reservation88 = new main.models.Reservation("", localDateTime62, localDateTime63, reservationStatus83, (double) '4', equipment86, user87);
        main.models.Equipment equipment90 = null;
        main.models.User user91 = null;
        main.models.Reservation reservation92 = new main.models.Reservation("hi!", localDateTime59, localDateTime60, reservationStatus83, (double) 1L, equipment90, user91);
        reservation54.setStatus(reservationStatus83);
        reservation44.setStatus(reservationStatus83);
        main.models.Equipment equipment96 = null;
        main.models.User user97 = null;
        main.models.Reservation reservation98 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus83, (double) 1, equipment96, user97);
        java.time.LocalDateTime localDateTime99 = reservation98.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus56 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus56.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
        org.junit.Assert.assertTrue("'" + reservationStatus73 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus73.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus83 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus83.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime99);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
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
        main.models.User user58 = reservation56.getUser();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
        org.junit.Assert.assertNull(user58);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime11 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
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
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user71);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
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
        java.time.LocalDateTime localDateTime23 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.checkArrival(localDateTime24);
        main.models.Equipment equipment26 = null;
        reservation7.setEquipment(equipment26);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
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
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setStartTime(localDateTime16);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
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
        java.time.LocalDateTime localDateTime16 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
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
        main.models.User user62 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user62);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
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
        reservation7.setReservationId("");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
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
        main.models.User user29 = reservation27.getUser();
        main.models.User user30 = reservation27.getUser();
        java.lang.String str31 = reservation27.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNull(user30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
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
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setStartTime(localDateTime11);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
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
        main.models.Equipment equipment13 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime14 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
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
        main.models.Reservation reservation97 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus78, (double) 1L, equipment95, user96);
        main.models.User user98 = reservation97.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNull(equipment45);
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus78 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus78.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user98);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
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
        reservation48.setEndTime(localDateTime50);
        java.time.LocalDateTime localDateTime52 = null;
        reservation48.setEndTime(localDateTime52);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = reservation41.getStartTime();
        java.time.LocalDateTime localDateTime44 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double45 = reservation41.calculateCost((double) 0.0f, localDateTime44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime42);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
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
        main.models.User user38 = reservation7.getUser();
        main.models.User user39 = reservation7.getUser();
        reservation7.setReservationId("hi!");
        java.lang.String str42 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.models.Equipment equipment12 = reservation10.getEquipment();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.setReservationId("hi!");
        java.time.LocalDateTime localDateTime23 = null;
        reservation20.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        reservation20.setStatus(reservationStatus34);
        reservation10.setStatus(reservationStatus34);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.activate();
        main.enums.ReservationStatus reservationStatus46 = reservation44.getStatus();
        reservation10.setStatus(reservationStatus46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus46, (double) (byte) 100, equipment49, user50);
        java.lang.Class<?> wildcardClass52 = reservation51.getClass();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus46.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
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
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(reservationStatus15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
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
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((-1.0d), localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
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
        main.models.Reservation reservation97 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus78, (double) 1L, equipment95, user96);
        reservation97.setDepositAmount((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNull(equipment45);
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus78 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus78.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        java.time.LocalDateTime localDateTime24 = reservation22.getStartTime();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        main.enums.ReservationStatus reservationStatus31 = null;
        main.models.Equipment equipment33 = null;
        main.models.User user34 = null;
        main.models.Reservation reservation35 = new main.models.Reservation("", localDateTime29, localDateTime30, reservationStatus31, (double) 10L, equipment33, user34);
        reservation35.activate();
        java.time.LocalDateTime localDateTime37 = null;
        reservation35.setStartTime(localDateTime37);
        double double39 = reservation35.getDepositAmount();
        main.enums.ReservationStatus reservationStatus40 = reservation35.getStatus();
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime26, localDateTime27, reservationStatus40, (double) 100, equipment42, user43);
        reservation22.setStatus(reservationStatus40);
        reservation7.setStatus(reservationStatus40);
        java.time.LocalDateTime localDateTime47 = reservation7.getStartTime();
        java.lang.Class<?> wildcardClass48 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
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
        main.models.User user17 = reservation7.getUser();
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
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
        double double60 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
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
        reservation27.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
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
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.checkArrival(localDateTime14);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
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
        java.time.LocalDateTime localDateTime16 = reservation10.getEndTime();
        java.time.LocalDateTime localDateTime17 = null;
        reservation10.checkArrival(localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("hi!", localDateTime23, localDateTime24, reservationStatus25, 0.0d, equipment27, user28);
        java.time.LocalDateTime localDateTime30 = null;
        reservation29.setStartTime(localDateTime30);
        main.enums.ReservationStatus reservationStatus32 = reservation29.getStatus();
        java.time.LocalDateTime localDateTime33 = null;
        reservation29.setEndTime(localDateTime33);
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        main.enums.ReservationStatus reservationStatus38 = null;
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("hi!", localDateTime36, localDateTime37, reservationStatus38, 0.0d, equipment40, user41);
        java.time.LocalDateTime localDateTime43 = null;
        reservation42.setStartTime(localDateTime43);
        main.models.User user45 = null;
        reservation42.setUser(user45);
        main.models.User user47 = null;
        reservation42.setUser(user47);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.activate();
        main.enums.ReservationStatus reservationStatus58 = reservation56.getStatus();
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        main.enums.ReservationStatus reservationStatus62 = null;
        main.models.Equipment equipment64 = null;
        main.models.User user65 = null;
        main.models.Reservation reservation66 = new main.models.Reservation("", localDateTime60, localDateTime61, reservationStatus62, (double) 10L, equipment64, user65);
        reservation66.activate();
        main.enums.ReservationStatus reservationStatus68 = reservation66.getStatus();
        reservation56.setStatus(reservationStatus68);
        reservation42.setStatus(reservationStatus68);
        reservation29.setStatus(reservationStatus68);
        main.models.Equipment equipment73 = null;
        main.models.User user74 = null;
        main.models.Reservation reservation75 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus68, (double) '4', equipment73, user74);
        main.models.User user76 = reservation75.getUser();
        java.time.LocalDateTime localDateTime77 = null;
        reservation75.setStartTime(localDateTime77);
        main.enums.ReservationStatus reservationStatus79 = reservation75.getStatus();
        reservation10.setStatus(reservationStatus79);
        main.models.Equipment equipment82 = null;
        main.models.User user83 = null;
        main.models.Reservation reservation84 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus79, (double) (-1L), equipment82, user83);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(reservationStatus32);
        org.junit.Assert.assertTrue("'" + reservationStatus58 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus58.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user76);
        org.junit.Assert.assertTrue("'" + reservationStatus79 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus79.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
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
        java.lang.String str71 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime72 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime73 = null;
        java.time.LocalDateTime localDateTime74 = null;
        java.time.LocalDateTime localDateTime75 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime73, localDateTime74, localDateTime75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(localDateTime72);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = null;
        reservation10.setStartTime(localDateTime12);
        double double14 = reservation10.getDepositAmount();
        main.enums.ReservationStatus reservationStatus15 = reservation10.getStatus();
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus15, (double) 100, equipment17, user18);
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation19.extend(localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
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
        reservation27.setDepositAmount((double) (short) 0);
        reservation27.setDepositAmount((double) ' ');
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
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
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(reservationStatus15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
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
        java.lang.String str38 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime39, localDateTime40, localDateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
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
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.checkArrival(localDateTime12);
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
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
        main.models.User user14 = null;
        reservation7.setUser(user14);
        main.models.Equipment equipment16 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(equipment16);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
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
        reservation56.checkArrival(localDateTime57);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
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
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.models.User user12 = reservation10.getUser();
        reservation10.activate();
        java.time.LocalDateTime localDateTime14 = null;
        reservation10.setEndTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = null;
        reservation10.setStartTime(localDateTime16);
        main.enums.ReservationStatus reservationStatus18 = reservation10.getStatus();
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus18, (double) 1, equipment20, user21);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        reservation7.setDepositAmount((double) (byte) 100);
        main.models.Equipment equipment11 = reservation7.getEquipment();
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
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
        main.models.User user29 = reservation27.getUser();
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation27.modify(localDateTime30, localDateTime31, localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
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
        java.lang.Class<?> wildcardClass52 = reservationStatus45.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
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
        main.models.User user38 = reservation7.getUser();
        main.models.User user39 = reservation7.getUser();
        reservation7.setDepositAmount((double) 0L);
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNull(user39);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test310");
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
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
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
        main.models.User user42 = reservation41.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user42);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
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
        reservation7.setReservationId("");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
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
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.setStartTime(localDateTime14);
        reservation7.setReservationId("");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
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
        main.models.User user15 = null;
        reservation7.setUser(user15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.User user10 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime12 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user10);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
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
        main.models.User user57 = reservation56.getUser();
        java.time.LocalDateTime localDateTime58 = null;
        reservation56.setStartTime(localDateTime58);
        main.enums.ReservationStatus reservationStatus60 = reservation56.getStatus();
        java.time.LocalDateTime localDateTime61 = null;
        reservation56.setStartTime(localDateTime61);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertTrue("'" + reservationStatus60 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus60.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
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
        reservation27.setDepositAmount((double) (short) 0);
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
        main.models.Equipment equipment42 = reservation37.getEquipment();
        main.models.Equipment equipment43 = null;
        reservation37.setEquipment(equipment43);
        java.time.LocalDateTime localDateTime45 = null;
        reservation37.checkArrival(localDateTime45);
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
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
        main.models.Reservation reservation80 = new main.models.Reservation("", localDateTime54, localDateTime55, reservationStatus75, (double) '4', equipment78, user79);
        main.models.Equipment equipment82 = null;
        main.models.User user83 = null;
        main.models.Reservation reservation84 = new main.models.Reservation("", localDateTime51, localDateTime52, reservationStatus75, (double) 1, equipment82, user83);
        main.models.Equipment equipment86 = null;
        main.models.User user87 = null;
        main.models.Reservation reservation88 = new main.models.Reservation("hi!", localDateTime48, localDateTime49, reservationStatus75, (double) 10.0f, equipment86, user87);
        reservation37.setStatus(reservationStatus75);
        reservation27.setStatus(reservationStatus75);
        java.time.LocalDateTime localDateTime92 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double93 = reservation27.calculateCost(52.0d, localDateTime92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
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
        java.lang.String str57 = reservation56.getReservationId();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
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
        main.models.User user29 = reservation27.getUser();
        double double30 = reservation27.getDepositAmount();
        reservation27.setDepositAmount((double) 10L);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
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
        java.time.LocalDateTime localDateTime23 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = reservation7.calculateCost((-1.0d), localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
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
            double double75 = reservation7.calculateCost((double) (byte) 0, localDateTime74);
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
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setReservationId("");
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
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
        java.lang.Class<?> wildcardClass12 = reservation7.getClass();
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
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
        main.models.Equipment equipment36 = null;
        reservation7.setEquipment(equipment36);
        java.lang.String str38 = reservation7.getReservationId();
        main.models.Equipment equipment39 = null;
        reservation7.setEquipment(equipment39);
        main.models.User user41 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(user41);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
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
        java.time.LocalDateTime localDateTime29 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double30 = reservation27.calculateCost((double) '4', localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        java.time.LocalDateTime localDateTime25 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = reservation7.calculateCost((double) (short) -1, localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
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
        double double17 = reservation7.getDepositAmount();
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
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
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
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime55, localDateTime56, localDateTime57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) (byte) 10, equipment39, user40);
        java.lang.Class<?> wildcardClass42 = reservationStatus28.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
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
        reservation7.setReservationId("hi!");
        reservation7.setDepositAmount((double) 10.0f);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
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
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
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
        double double23 = reservation7.getDepositAmount();
        main.models.Equipment equipment24 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime25 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertNull(equipment24);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
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
        main.models.Reservation reservation49 = new main.models.Reservation("hi!", localDateTime16, localDateTime17, reservationStatus40, (double) 1L, equipment47, user48);
        main.enums.ReservationStatus reservationStatus50 = null;
        reservation49.setStatus(reservationStatus50);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        main.enums.ReservationStatus reservationStatus58 = null;
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("", localDateTime56, localDateTime57, reservationStatus58, (double) 10L, equipment60, user61);
        reservation62.activate();
        main.models.Equipment equipment64 = reservation62.getEquipment();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        main.enums.ReservationStatus reservationStatus68 = null;
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime66, localDateTime67, reservationStatus68, (double) 10L, equipment70, user71);
        reservation72.setReservationId("hi!");
        java.time.LocalDateTime localDateTime75 = null;
        reservation72.setStartTime(localDateTime75);
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        main.enums.ReservationStatus reservationStatus80 = null;
        main.models.Equipment equipment82 = null;
        main.models.User user83 = null;
        main.models.Reservation reservation84 = new main.models.Reservation("", localDateTime78, localDateTime79, reservationStatus80, (double) 10L, equipment82, user83);
        reservation84.activate();
        main.enums.ReservationStatus reservationStatus86 = reservation84.getStatus();
        reservation72.setStatus(reservationStatus86);
        reservation62.setStatus(reservationStatus86);
        main.models.Equipment equipment90 = null;
        main.models.User user91 = null;
        main.models.Reservation reservation92 = new main.models.Reservation("hi!", localDateTime53, localDateTime54, reservationStatus86, (double) 10L, equipment90, user91);
        reservation49.setStatus(reservationStatus86);
        reservation7.setStatus(reservationStatus86);
        main.models.Equipment equipment95 = null;
        reservation7.setEquipment(equipment95);
        java.time.LocalDateTime localDateTime97 = reservation7.getStartTime();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus30 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus30.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment64);
        org.junit.Assert.assertTrue("'" + reservationStatus86 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus86.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime97);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
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
        reservation7.setDepositAmount((double) (short) 0);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
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
        java.time.LocalDateTime localDateTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        main.models.Equipment equipment12 = reservation10.getEquipment();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.setReservationId("hi!");
        java.time.LocalDateTime localDateTime23 = null;
        reservation20.setStartTime(localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        reservation20.setStatus(reservationStatus34);
        reservation10.setStatus(reservationStatus34);
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.activate();
        main.enums.ReservationStatus reservationStatus46 = reservation44.getStatus();
        reservation10.setStatus(reservationStatus46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus46, (double) (byte) 100, equipment49, user50);
        main.models.User user52 = null;
        reservation51.setUser(user52);
        main.models.User user54 = reservation51.getUser();
        main.models.Equipment equipment55 = reservation51.getEquipment();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus46.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user54);
        org.junit.Assert.assertNull(equipment55);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        main.models.User user9 = null;
        reservation7.setUser(user9);
        org.junit.Assert.assertNull(reservationStatus8);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
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
        reservation7.setDepositAmount((double) 0);
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) (byte) 10, equipment39, user40);
        reservation41.setDepositAmount((double) '#');
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
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
        main.models.Equipment equipment22 = null;
        reservation7.setEquipment(equipment22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.setEndTime(localDateTime24);
        reservation7.setDepositAmount((double) 100.0f);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
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
        java.time.LocalDateTime localDateTime39 = null;
        reservation7.setStartTime(localDateTime39);
        main.models.User user41 = reservation7.getUser();
        main.models.User user42 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user41);
        org.junit.Assert.assertNull(user42);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = null;
        reservation10.setStartTime(localDateTime12);
        double double14 = reservation10.getDepositAmount();
        main.enums.ReservationStatus reservationStatus15 = reservation10.getStatus();
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus15, (double) 100, equipment17, user18);
        main.enums.ReservationStatus reservationStatus20 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime21 = null;
        reservation19.checkArrival(localDateTime21);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus20 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus20.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
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
        double double12 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
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
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.checkArrival(localDateTime12);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        reservation7.setReservationId("");
        main.models.Equipment equipment12 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
        reservation7.setDepositAmount((double) (byte) 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
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
        double double51 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime53 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double54 = reservation7.calculateCost((double) 100L, localDateTime53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus42.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
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
        main.models.User user12 = reservation7.getUser();
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
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
        main.enums.ReservationStatus reservationStatus19 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
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
        main.models.Equipment equipment56 = reservation55.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment56);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        java.time.LocalDateTime localDateTime22 = null;
        reservation20.setStartTime(localDateTime22);
        double double24 = reservation20.getDepositAmount();
        main.enums.ReservationStatus reservationStatus25 = reservation20.getStatus();
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("hi!", localDateTime11, localDateTime12, reservationStatus25, (double) 100, equipment27, user28);
        reservation7.setStatus(reservationStatus25);
        double double31 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime32 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
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
        main.models.Equipment equipment42 = reservation7.getEquipment();
        double double43 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
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
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus36, (double) '4', equipment39, user40);
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("hi!", localDateTime12, localDateTime13, reservationStatus36, (double) 1L, equipment43, user44);
        reservation7.setStatus(reservationStatus36);
        java.lang.String str47 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
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
        main.models.User user38 = reservation7.getUser();
        main.models.User user39 = reservation7.getUser();
        reservation7.setReservationId("hi!");
        reservation7.activate();
        java.lang.String str43 = reservation7.getReservationId();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(user38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
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
        java.time.LocalDateTime localDateTime39 = reservation7.getEndTime();
        main.models.User user40 = reservation7.getUser();
        java.time.LocalDateTime localDateTime41 = null;
        reservation7.setStartTime(localDateTime41);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(user40);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
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
        reservation7.checkArrival(localDateTime17);
        java.time.LocalDateTime localDateTime19 = null;
        reservation7.setEndTime(localDateTime19);
        main.enums.ReservationStatus reservationStatus21 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus21.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
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
        double double40 = reservation7.getDepositAmount();
        main.models.User user41 = null;
        reservation7.setUser(user41);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
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
        reservation27.activate();
        java.time.LocalDateTime localDateTime30 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation27.cancel(localDateTime30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
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
        reservation7.setStartTime(localDateTime14);
        java.time.LocalDateTime localDateTime16 = reservation7.getEndTime();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
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
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.checkArrival(localDateTime24);
        reservation7.setDepositAmount((double) 10.0f);
        reservation7.activate();
        main.models.Equipment equipment29 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment29);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateCost((double) 'a', localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
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
        main.models.User user13 = null;
        reservation7.setUser(user13);
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setEndTime(localDateTime15);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
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
        main.models.Equipment equipment57 = null;
        reservation56.setEquipment(equipment57);
        double double59 = reservation56.getDepositAmount();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 52.0d + "'", double59 == 52.0d);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test368");
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
        main.models.Reservation reservation49 = new main.models.Reservation("hi!", localDateTime16, localDateTime17, reservationStatus40, (double) 1L, equipment47, user48);
        main.enums.ReservationStatus reservationStatus50 = null;
        reservation49.setStatus(reservationStatus50);
        java.time.LocalDateTime localDateTime53 = null;
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        main.enums.ReservationStatus reservationStatus58 = null;
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("", localDateTime56, localDateTime57, reservationStatus58, (double) 10L, equipment60, user61);
        reservation62.activate();
        main.models.Equipment equipment64 = reservation62.getEquipment();
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        main.enums.ReservationStatus reservationStatus68 = null;
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime66, localDateTime67, reservationStatus68, (double) 10L, equipment70, user71);
        reservation72.setReservationId("hi!");
        java.time.LocalDateTime localDateTime75 = null;
        reservation72.setStartTime(localDateTime75);
        java.time.LocalDateTime localDateTime78 = null;
        java.time.LocalDateTime localDateTime79 = null;
        main.enums.ReservationStatus reservationStatus80 = null;
        main.models.Equipment equipment82 = null;
        main.models.User user83 = null;
        main.models.Reservation reservation84 = new main.models.Reservation("", localDateTime78, localDateTime79, reservationStatus80, (double) 10L, equipment82, user83);
        reservation84.activate();
        main.enums.ReservationStatus reservationStatus86 = reservation84.getStatus();
        reservation72.setStatus(reservationStatus86);
        reservation62.setStatus(reservationStatus86);
        main.models.Equipment equipment90 = null;
        main.models.User user91 = null;
        main.models.Reservation reservation92 = new main.models.Reservation("hi!", localDateTime53, localDateTime54, reservationStatus86, (double) 10L, equipment90, user91);
        reservation49.setStatus(reservationStatus86);
        reservation7.setStatus(reservationStatus86);
        java.lang.Class<?> wildcardClass95 = reservation7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus30 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus30.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment64);
        org.junit.Assert.assertTrue("'" + reservationStatus86 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus86.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test369");
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
        main.models.User user13 = null;
        reservation7.setUser(user13);
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateCost((double) 1, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test370");
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
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test371");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        reservation7.setDepositAmount((double) (byte) 100);
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        org.junit.Assert.assertNull(reservationStatus8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test372");
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
        main.enums.ReservationStatus reservationStatus39 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus39.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test373");
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
        main.models.Equipment equipment22 = null;
        reservation7.setEquipment(equipment22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.setEndTime(localDateTime24);
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
        main.models.Equipment equipment47 = reservation33.getEquipment();
        main.enums.ReservationStatus reservationStatus48 = reservation33.getStatus();
        reservation7.setStatus(reservationStatus48);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment47);
        org.junit.Assert.assertTrue("'" + reservationStatus48 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus48.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test374");
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
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        main.enums.ReservationStatus reservationStatus48 = null;
        main.models.Equipment equipment50 = null;
        main.models.User user51 = null;
        main.models.Reservation reservation52 = new main.models.Reservation("hi!", localDateTime46, localDateTime47, reservationStatus48, 0.0d, equipment50, user51);
        java.time.LocalDateTime localDateTime53 = null;
        reservation52.setStartTime(localDateTime53);
        main.models.User user55 = null;
        reservation52.setUser(user55);
        main.models.User user57 = null;
        reservation52.setUser(user57);
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
        reservation52.setStatus(reservationStatus78);
        main.models.Equipment equipment82 = null;
        main.models.User user83 = null;
        main.models.Reservation reservation84 = new main.models.Reservation("", localDateTime43, localDateTime44, reservationStatus78, (double) 10L, equipment82, user83);
        reservation41.setStatus(reservationStatus78);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus78 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus78.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test375");
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
        reservation7.setDepositAmount((double) 100L);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test376");
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
        main.models.User user57 = reservation56.getUser();
        java.time.LocalDateTime localDateTime58 = null;
        reservation56.setEndTime(localDateTime58);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user57);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test377");
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
        reservation48.setReservationId("");
        java.time.LocalDateTime localDateTime51 = null;
        reservation48.setStartTime(localDateTime51);
        java.time.LocalDateTime localDateTime54 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double55 = reservation48.calculateCost((double) (short) 10, localDateTime54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test378");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.setDepositAmount((double) 1.0f);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test379");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation34.cancel(localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test380");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.activate();
        main.enums.ReservationStatus reservationStatus27 = reservation25.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        main.enums.ReservationStatus reservationStatus31 = null;
        main.models.Equipment equipment33 = null;
        main.models.User user34 = null;
        main.models.Reservation reservation35 = new main.models.Reservation("", localDateTime29, localDateTime30, reservationStatus31, (double) 10L, equipment33, user34);
        reservation35.activate();
        main.enums.ReservationStatus reservationStatus37 = reservation35.getStatus();
        reservation25.setStatus(reservationStatus37);
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus37, (double) '4', equipment40, user41);
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus37, (double) 1, equipment44, user45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("hi!", localDateTime10, localDateTime11, reservationStatus37, (double) 10.0f, equipment48, user49);
        main.models.Equipment equipment52 = null;
        main.models.User user53 = null;
        main.models.Reservation reservation54 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus37, (double) 0, equipment52, user53);
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus37, 0.0d, equipment56, user57);
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus37, (double) 10.0f, equipment60, user61);
        org.junit.Assert.assertTrue("'" + reservationStatus27 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus27.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus37 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus37.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test381");
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
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test382");
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
        main.models.User user57 = null;
        reservation56.setUser(user57);
        main.models.Equipment equipment59 = null;
        reservation56.setEquipment(equipment59);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test383");
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
        reservation7.checkArrival(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.setEndTime(localDateTime18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test384");
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
        main.models.User user73 = null;
        reservation7.setUser(user73);
        java.time.LocalDateTime localDateTime75 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime75);
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
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test385");
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
        main.models.User user14 = reservation7.getUser();
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test386");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.checkArrival(localDateTime24);
        reservation7.setDepositAmount((double) 10.0f);
        reservation7.activate();
        java.lang.String str29 = reservation7.getReservationId();
        main.models.Equipment equipment30 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(equipment30);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test387");
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
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus25, (double) 1.0f, equipment28, user29);
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus25, (double) '4', equipment32, user33);
        reservation34.activate();
        java.time.LocalDateTime localDateTime37 = null;
        java.time.LocalDateTime localDateTime38 = null;
        main.enums.ReservationStatus reservationStatus39 = null;
        main.models.Equipment equipment41 = null;
        main.models.User user42 = null;
        main.models.Reservation reservation43 = new main.models.Reservation("", localDateTime37, localDateTime38, reservationStatus39, (double) 10L, equipment41, user42);
        reservation43.activate();
        java.time.LocalDateTime localDateTime45 = reservation43.getStartTime();
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.activate();
        java.time.LocalDateTime localDateTime58 = null;
        reservation56.setStartTime(localDateTime58);
        double double60 = reservation56.getDepositAmount();
        main.enums.ReservationStatus reservationStatus61 = reservation56.getStatus();
        main.models.Equipment equipment63 = null;
        main.models.User user64 = null;
        main.models.Reservation reservation65 = new main.models.Reservation("hi!", localDateTime47, localDateTime48, reservationStatus61, (double) 100, equipment63, user64);
        reservation43.setStatus(reservationStatus61);
        reservation34.setStatus(reservationStatus61);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus61 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus61.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test388");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        main.enums.ReservationStatus reservationStatus11 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        main.enums.ReservationStatus reservationStatus13 = reservation7.getStatus();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(reservationStatus11);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(reservationStatus13);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test389");
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
        main.models.User user15 = reservation7.getUser();
        java.lang.String str16 = reservation7.getReservationId();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test390");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = null;
        reservation10.setStartTime(localDateTime12);
        double double14 = reservation10.getDepositAmount();
        double double15 = reservation10.getDepositAmount();
        main.models.User user16 = null;
        reservation10.setUser(user16);
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.activate();
        java.time.LocalDateTime localDateTime27 = reservation25.getStartTime();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        main.enums.ReservationStatus reservationStatus34 = null;
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("", localDateTime32, localDateTime33, reservationStatus34, (double) 10L, equipment36, user37);
        reservation38.activate();
        java.time.LocalDateTime localDateTime40 = null;
        reservation38.setStartTime(localDateTime40);
        double double42 = reservation38.getDepositAmount();
        main.enums.ReservationStatus reservationStatus43 = reservation38.getStatus();
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime29, localDateTime30, reservationStatus43, (double) 100, equipment45, user46);
        reservation25.setStatus(reservationStatus43);
        reservation10.setStatus(reservationStatus43);
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus43, 52.0d, equipment51, user52);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus43.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test391");
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
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test392");
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
        java.time.LocalDateTime localDateTime23 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime24, localDateTime25, localDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test393");
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
        reservation7.setDepositAmount((double) '#');
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test394");
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
        java.time.LocalDateTime localDateTime14 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime15 = reservation7.getStartTime();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test395");
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
        double double14 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test396");
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
        reservation7.setStartTime(localDateTime62);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test397");
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
        main.enums.ReservationStatus reservationStatus35 = reservation34.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test398");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        main.enums.ReservationStatus reservationStatus11 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime12 = reservation7.getEndTime();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(reservationStatus11);
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test399");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
        double double12 = reservation7.getDepositAmount();
        main.models.User user13 = reservation7.getUser();
        main.models.Equipment equipment14 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test400");
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
        reservation7.activate();
        java.lang.Class<?> wildcardClass13 = reservation7.getClass();
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test401");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime19 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test402");
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
        main.models.Equipment equipment57 = null;
        reservation56.setEquipment(equipment57);
        java.time.LocalDateTime localDateTime59 = null;
        reservation56.setEndTime(localDateTime59);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test403");
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
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.activate();
        main.enums.ReservationStatus reservationStatus27 = reservation25.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        main.enums.ReservationStatus reservationStatus31 = null;
        main.models.Equipment equipment33 = null;
        main.models.User user34 = null;
        main.models.Reservation reservation35 = new main.models.Reservation("", localDateTime29, localDateTime30, reservationStatus31, (double) 10L, equipment33, user34);
        reservation35.activate();
        main.enums.ReservationStatus reservationStatus37 = reservation35.getStatus();
        reservation25.setStatus(reservationStatus37);
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus37, (double) '4', equipment40, user41);
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime13, localDateTime14, reservationStatus37, (double) 1, equipment44, user45);
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("hi!", localDateTime10, localDateTime11, reservationStatus37, (double) 10.0f, equipment48, user49);
        main.models.Equipment equipment52 = null;
        main.models.User user53 = null;
        main.models.Reservation reservation54 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus37, (double) 0, equipment52, user53);
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus37, 0.0d, equipment56, user57);
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus37, (double) 1, equipment60, user61);
        org.junit.Assert.assertTrue("'" + reservationStatus27 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus27.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus37 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus37.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test404");
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
        double double54 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime55 = null;
        reservation7.setEndTime(localDateTime55);
        java.time.LocalDateTime localDateTime57 = null;
        reservation7.checkArrival(localDateTime57);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test405");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        java.time.LocalDateTime localDateTime22 = null;
        reservation20.setStartTime(localDateTime22);
        double double24 = reservation20.getDepositAmount();
        main.enums.ReservationStatus reservationStatus25 = reservation20.getStatus();
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("hi!", localDateTime11, localDateTime12, reservationStatus25, (double) 100, equipment27, user28);
        reservation7.setStatus(reservationStatus25);
        double double31 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime32 = null;
        reservation7.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime34 = null;
        reservation7.setEndTime(localDateTime34);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test406");
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
        main.models.Equipment equipment15 = null;
        reservation7.setEquipment(equipment15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test407");
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
        main.models.User user73 = null;
        reservation7.setUser(user73);
        main.models.Equipment equipment75 = reservation7.getEquipment();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment75);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test408");
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
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.checkArrival(localDateTime17);
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus22, (double) 10L, equipment24, user25);
        reservation26.setReservationId("hi!");
        java.time.LocalDateTime localDateTime29 = null;
        reservation26.setStartTime(localDateTime29);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        main.enums.ReservationStatus reservationStatus34 = null;
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("", localDateTime32, localDateTime33, reservationStatus34, (double) 10L, equipment36, user37);
        reservation38.activate();
        main.enums.ReservationStatus reservationStatus40 = reservation38.getStatus();
        reservation26.setStatus(reservationStatus40);
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        main.enums.ReservationStatus reservationStatus48 = null;
        main.models.Equipment equipment50 = null;
        main.models.User user51 = null;
        main.models.Reservation reservation52 = new main.models.Reservation("", localDateTime46, localDateTime47, reservationStatus48, (double) 10L, equipment50, user51);
        reservation52.activate();
        main.enums.ReservationStatus reservationStatus54 = reservation52.getStatus();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        main.enums.ReservationStatus reservationStatus58 = null;
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("", localDateTime56, localDateTime57, reservationStatus58, (double) 10L, equipment60, user61);
        reservation62.activate();
        main.enums.ReservationStatus reservationStatus64 = reservation62.getStatus();
        reservation52.setStatus(reservationStatus64);
        main.models.Equipment equipment67 = null;
        main.models.User user68 = null;
        main.models.Reservation reservation69 = new main.models.Reservation("", localDateTime43, localDateTime44, reservationStatus64, (double) 1.0f, equipment67, user68);
        reservation26.setStatus(reservationStatus64);
        reservation7.setStatus(reservationStatus64);
        java.time.LocalDateTime localDateTime72 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus54 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus54.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus64 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus64.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test409");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.setStartTime(localDateTime10);
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
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test410");
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
        reservation7.setDepositAmount((double) '#');
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = reservation7.calculateCost((double) 0L, localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test411");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = reservation7.calculateCost((double) (-1.0f), localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test412");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        reservation7.activate();
        main.models.User user12 = null;
        reservation7.setUser(user12);
        double double14 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test413");
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
        java.lang.Class<?> wildcardClass12 = reservation7.getClass();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test414");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.setStartTime(localDateTime42);
        reservation41.activate();
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        main.enums.ReservationStatus reservationStatus54 = null;
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("hi!", localDateTime52, localDateTime53, reservationStatus54, 0.0d, equipment56, user57);
        java.time.LocalDateTime localDateTime59 = null;
        reservation58.setStartTime(localDateTime59);
        main.models.User user61 = null;
        reservation58.setUser(user61);
        main.models.User user63 = null;
        reservation58.setUser(user63);
        java.time.LocalDateTime localDateTime66 = null;
        java.time.LocalDateTime localDateTime67 = null;
        main.enums.ReservationStatus reservationStatus68 = null;
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime66, localDateTime67, reservationStatus68, (double) 10L, equipment70, user71);
        reservation72.activate();
        main.enums.ReservationStatus reservationStatus74 = reservation72.getStatus();
        java.time.LocalDateTime localDateTime76 = null;
        java.time.LocalDateTime localDateTime77 = null;
        main.enums.ReservationStatus reservationStatus78 = null;
        main.models.Equipment equipment80 = null;
        main.models.User user81 = null;
        main.models.Reservation reservation82 = new main.models.Reservation("", localDateTime76, localDateTime77, reservationStatus78, (double) 10L, equipment80, user81);
        reservation82.activate();
        main.enums.ReservationStatus reservationStatus84 = reservation82.getStatus();
        reservation72.setStatus(reservationStatus84);
        reservation58.setStatus(reservationStatus84);
        main.models.Equipment equipment88 = null;
        main.models.User user89 = null;
        main.models.Reservation reservation90 = new main.models.Reservation("hi!", localDateTime49, localDateTime50, reservationStatus84, (double) 100.0f, equipment88, user89);
        main.models.Equipment equipment92 = null;
        main.models.User user93 = null;
        main.models.Reservation reservation94 = new main.models.Reservation("", localDateTime46, localDateTime47, reservationStatus84, (double) (short) 100, equipment92, user93);
        reservation41.setStatus(reservationStatus84);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus74 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus74.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus84 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus84.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test415");
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
        main.models.User user24 = reservation10.getUser();
        reservation10.setReservationId("");
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.setReservationId("hi!");
        main.models.Equipment equipment37 = null;
        reservation34.setEquipment(equipment37);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        main.enums.ReservationStatus reservationStatus42 = null;
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime40, localDateTime41, reservationStatus42, (double) 10L, equipment44, user45);
        reservation46.setReservationId("hi!");
        java.time.LocalDateTime localDateTime49 = null;
        reservation46.setStartTime(localDateTime49);
        java.time.LocalDateTime localDateTime52 = null;
        java.time.LocalDateTime localDateTime53 = null;
        main.enums.ReservationStatus reservationStatus54 = null;
        main.models.Equipment equipment56 = null;
        main.models.User user57 = null;
        main.models.Reservation reservation58 = new main.models.Reservation("", localDateTime52, localDateTime53, reservationStatus54, (double) 10L, equipment56, user57);
        reservation58.activate();
        main.enums.ReservationStatus reservationStatus60 = reservation58.getStatus();
        reservation46.setStatus(reservationStatus60);
        reservation34.setStatus(reservationStatus60);
        main.models.User user63 = reservation34.getUser();
        reservation34.setDepositAmount((double) (-1L));
        main.enums.ReservationStatus reservationStatus66 = reservation34.getStatus();
        reservation10.setStatus(reservationStatus66);
        main.models.Equipment equipment69 = null;
        main.models.User user70 = null;
        main.models.Reservation reservation71 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus66, (double) 1, equipment69, user70);
        java.time.LocalDateTime localDateTime72 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation71.cancel(localDateTime72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertTrue("'" + reservationStatus60 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus60.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertTrue("'" + reservationStatus66 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus66.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test416");
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
        main.models.User user29 = reservation27.getUser();
        double double30 = reservation27.getDepositAmount();
        java.time.LocalDateTime localDateTime31 = null;
        reservation27.setStartTime(localDateTime31);
        java.time.LocalDateTime localDateTime33 = null;
        reservation27.setStartTime(localDateTime33);
        java.time.LocalDateTime localDateTime36 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double37 = reservation27.calculateCost((double) 'a', localDateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 52.0d + "'", double30 == 52.0d);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test417");
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
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        java.time.LocalDateTime localDateTime18 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test418");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.setDepositAmount((double) 1.0f);
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
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test419");
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
        java.time.LocalDateTime localDateTime49 = null;
        reservation48.setEndTime(localDateTime49);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test420");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test421");
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
        java.time.LocalDateTime localDateTime13 = reservation7.getEndTime();
        main.models.User user14 = reservation7.getUser();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test422");
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
        java.time.LocalDateTime localDateTime37 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation34.extend(localDateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test423");
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
        main.models.User user15 = null;
        reservation7.setUser(user15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test424");
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
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus25, (double) 1.0f, equipment28, user29);
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus25, (double) '4', equipment32, user33);
        main.models.Equipment equipment35 = reservation34.getEquipment();
        main.models.User user36 = reservation34.getUser();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime41, localDateTime42, reservationStatus43, 0.0d, equipment45, user46);
        java.time.LocalDateTime localDateTime48 = null;
        reservation47.setStartTime(localDateTime48);
        main.models.User user50 = null;
        reservation47.setUser(user50);
        main.models.User user52 = null;
        reservation47.setUser(user52);
        java.time.LocalDateTime localDateTime55 = null;
        java.time.LocalDateTime localDateTime56 = null;
        main.enums.ReservationStatus reservationStatus57 = null;
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime55, localDateTime56, reservationStatus57, (double) 10L, equipment59, user60);
        reservation61.activate();
        main.enums.ReservationStatus reservationStatus63 = reservation61.getStatus();
        java.time.LocalDateTime localDateTime65 = null;
        java.time.LocalDateTime localDateTime66 = null;
        main.enums.ReservationStatus reservationStatus67 = null;
        main.models.Equipment equipment69 = null;
        main.models.User user70 = null;
        main.models.Reservation reservation71 = new main.models.Reservation("", localDateTime65, localDateTime66, reservationStatus67, (double) 10L, equipment69, user70);
        reservation71.activate();
        main.enums.ReservationStatus reservationStatus73 = reservation71.getStatus();
        reservation61.setStatus(reservationStatus73);
        reservation47.setStatus(reservationStatus73);
        main.models.Equipment equipment77 = null;
        main.models.User user78 = null;
        main.models.Reservation reservation79 = new main.models.Reservation("hi!", localDateTime38, localDateTime39, reservationStatus73, (double) 100.0f, equipment77, user78);
        reservation34.setStatus(reservationStatus73);
        java.lang.String str81 = reservation34.getReservationId();
        java.time.LocalDateTime localDateTime82 = null;
        reservation34.setStartTime(localDateTime82);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus73 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus73.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test425");
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
        double double16 = reservation7.getDepositAmount();
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test426");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = null;
        reservation10.setStartTime(localDateTime12);
        double double14 = reservation10.getDepositAmount();
        main.enums.ReservationStatus reservationStatus15 = reservation10.getStatus();
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus15, (double) 100, equipment17, user18);
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = reservation19.calculateCost(100.0d, localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test427");
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
        reservation42.setDepositAmount(1.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test428");
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
        main.models.Equipment equipment92 = reservation41.getEquipment();
        java.time.LocalDateTime localDateTime93 = reservation41.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment54);
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus80 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus80.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment92);
        org.junit.Assert.assertNull(localDateTime93);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test429");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.lang.Class<?> wildcardClass42 = reservationStatus28.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test430");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.setReservationId("hi!");
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
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test431");
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
        main.enums.ReservationStatus reservationStatus17 = reservation7.getStatus();
        main.models.User user18 = null;
        reservation7.setUser(user18);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(reservationStatus17);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test432");
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
        main.models.User user18 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user18);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test433");
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
        java.time.LocalDateTime localDateTime26 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment25);
        org.junit.Assert.assertNull(localDateTime26);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test434");
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
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.checkArrival(localDateTime12);
        main.models.Equipment equipment14 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test435");
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
        main.enums.ReservationStatus reservationStatus13 = reservation7.getStatus();
        double double14 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test436");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        main.models.User user24 = reservation7.getUser();
        java.time.LocalDateTime localDateTime25 = null;
        reservation7.setEndTime(localDateTime25);
        reservation7.activate();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        main.enums.ReservationStatus reservationStatus34 = null;
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("", localDateTime32, localDateTime33, reservationStatus34, (double) 10L, equipment36, user37);
        reservation38.activate();
        java.time.LocalDateTime localDateTime40 = reservation38.getStartTime();
        reservation38.setDepositAmount((double) (short) 10);
        main.models.User user43 = null;
        reservation38.setUser(user43);
        main.enums.ReservationStatus reservationStatus45 = reservation38.getStatus();
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("", localDateTime29, localDateTime30, reservationStatus45, (double) 0L, equipment47, user48);
        reservation7.setStatus(reservationStatus45);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test437");
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
        java.time.LocalDateTime localDateTime43 = null;
        reservation7.checkArrival(localDateTime43);
        java.time.LocalDateTime localDateTime45 = null;
        reservation7.checkArrival(localDateTime45);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test438");
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
        java.lang.String str14 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("hi!", localDateTime19, localDateTime20, reservationStatus21, 0.0d, equipment23, user24);
        java.time.LocalDateTime localDateTime26 = null;
        reservation25.setStartTime(localDateTime26);
        main.enums.ReservationStatus reservationStatus28 = reservation25.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        reservation25.setEndTime(localDateTime29);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        main.enums.ReservationStatus reservationStatus34 = null;
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("hi!", localDateTime32, localDateTime33, reservationStatus34, 0.0d, equipment36, user37);
        java.time.LocalDateTime localDateTime39 = null;
        reservation38.setStartTime(localDateTime39);
        main.models.User user41 = null;
        reservation38.setUser(user41);
        main.models.User user43 = null;
        reservation38.setUser(user43);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        main.enums.ReservationStatus reservationStatus48 = null;
        main.models.Equipment equipment50 = null;
        main.models.User user51 = null;
        main.models.Reservation reservation52 = new main.models.Reservation("", localDateTime46, localDateTime47, reservationStatus48, (double) 10L, equipment50, user51);
        reservation52.activate();
        main.enums.ReservationStatus reservationStatus54 = reservation52.getStatus();
        java.time.LocalDateTime localDateTime56 = null;
        java.time.LocalDateTime localDateTime57 = null;
        main.enums.ReservationStatus reservationStatus58 = null;
        main.models.Equipment equipment60 = null;
        main.models.User user61 = null;
        main.models.Reservation reservation62 = new main.models.Reservation("", localDateTime56, localDateTime57, reservationStatus58, (double) 10L, equipment60, user61);
        reservation62.activate();
        main.enums.ReservationStatus reservationStatus64 = reservation62.getStatus();
        reservation52.setStatus(reservationStatus64);
        reservation38.setStatus(reservationStatus64);
        reservation25.setStatus(reservationStatus64);
        main.models.Equipment equipment69 = null;
        main.models.User user70 = null;
        main.models.Reservation reservation71 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus64, (double) '4', equipment69, user70);
        reservation7.setStatus(reservationStatus64);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(reservationStatus28);
        org.junit.Assert.assertTrue("'" + reservationStatus54 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus54.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus64 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus64.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test439");
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
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.setStartTime(localDateTime14);
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test440");
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
        reservation7.checkArrival(localDateTime41);
        java.time.LocalDateTime localDateTime43 = null;
        reservation7.setEndTime(localDateTime43);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test441");
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
        reservation7.setDepositAmount((double) 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test442");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test443");
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
        reservation7.setStartTime(localDateTime15);
        main.models.User user17 = reservation7.getUser();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(user17);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test444");
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
        java.lang.String str14 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime15 = reservation7.getStartTime();
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test445");
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
        java.lang.String str18 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test446");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        main.models.Equipment equipment24 = reservation7.getEquipment();
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment24);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test447");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.setReservationId("hi!");
        java.time.LocalDateTime localDateTime13 = null;
        reservation10.setStartTime(localDateTime13);
        main.models.Equipment equipment15 = reservation10.getEquipment();
        java.time.LocalDateTime localDateTime16 = null;
        reservation10.setStartTime(localDateTime16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation10.checkArrival(localDateTime18);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        main.enums.ReservationStatus reservationStatus23 = null;
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime21, localDateTime22, reservationStatus23, (double) 10L, equipment25, user26);
        reservation27.activate();
        java.time.LocalDateTime localDateTime29 = reservation27.getStartTime();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
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
        main.enums.ReservationStatus reservationStatus45 = reservation40.getStatus();
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("hi!", localDateTime31, localDateTime32, reservationStatus45, (double) 100, equipment47, user48);
        reservation27.setStatus(reservationStatus45);
        reservation10.setStatus(reservationStatus45);
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus45, (double) 1, equipment53, user54);
        main.models.User user56 = reservation55.getUser();
        java.lang.String str57 = reservation55.getReservationId();
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test448");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.Equipment equipment9 = reservation7.getEquipment();
        reservation7.setReservationId("");
        main.models.Equipment equipment12 = null;
        reservation7.setEquipment(equipment12);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test449");
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
        java.time.LocalDateTime localDateTime72 = null;
        reservation7.checkArrival(localDateTime72);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user71);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test450");
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
        main.models.User user15 = reservation7.getUser();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test451");
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
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test452");
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
        main.models.User user29 = reservation27.getUser();
        java.time.LocalDateTime localDateTime30 = null;
        reservation27.checkArrival(localDateTime30);
        java.lang.Class<?> wildcardClass32 = reservation27.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test453");
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
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        main.models.User user17 = null;
        reservation7.setUser(user17);
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(reservationStatus16);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test454");
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
        reservation7.activate();
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test455");
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
        reservation7.activate();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test456");
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
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.setEndTime(localDateTime18);
        main.enums.ReservationStatus reservationStatus20 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus20 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus20.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test457");
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
        double double17 = reservation7.getDepositAmount();
        reservation7.setDepositAmount((double) 10.0f);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test458");
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
        reservation7.setDepositAmount((double) '#');
        java.lang.String str24 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test459");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setStartTime(localDateTime11);
        reservation7.setReservationId("");
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test460");
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
        main.models.User user22 = null;
        reservation7.setUser(user22);
        main.models.User user24 = reservation7.getUser();
        java.time.LocalDateTime localDateTime25 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertNull(localDateTime25);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test461");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = null;
        reservation10.setStartTime(localDateTime12);
        double double14 = reservation10.getDepositAmount();
        main.enums.ReservationStatus reservationStatus15 = reservation10.getStatus();
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus15, (double) 100, equipment17, user18);
        main.models.User user20 = reservation19.getUser();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test462");
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
        java.time.LocalDateTime localDateTime14 = reservation7.getEndTime();
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setEndTime(localDateTime16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(localDateTime14);
        org.junit.Assert.assertNull(reservationStatus15);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test463");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
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
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test464");
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
        main.models.Equipment equipment12 = null;
        reservation7.setEquipment(equipment12);
        java.time.LocalDateTime localDateTime14 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test465");
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
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.checkArrival(localDateTime13);
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test466");
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
        main.models.Equipment equipment35 = reservation7.getEquipment();
        reservation7.setDepositAmount((-1.0d));
        reservation7.setDepositAmount((double) (short) 1);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertNull(equipment35);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test467");
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
        main.enums.ReservationStatus reservationStatus39 = reservation7.getStatus();
        main.models.Equipment equipment40 = null;
        reservation7.setEquipment(equipment40);
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test468");
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
        main.models.User user37 = null;
        reservation7.setUser(user37);
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime39, localDateTime40, localDateTime41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test469");
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
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus36, (double) 10.0f, equipment40, user41);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test470");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        main.enums.ReservationStatus reservationStatus11 = reservation10.getStatus();
        main.models.Equipment equipment12 = null;
        reservation10.setEquipment(equipment12);
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
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
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus36, (double) '4', equipment39, user40);
        reservation10.setStatus(reservationStatus36);
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus36, (double) 1L, equipment44, user45);
        org.junit.Assert.assertNull(reservationStatus11);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test471");
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
        main.models.User user15 = reservation7.getUser();
        java.time.LocalDateTime localDateTime16 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime17 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime18 = reservation7.getEndTime();
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test472");
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
        double double40 = reservation7.getDepositAmount();
        main.models.Equipment equipment41 = null;
        reservation7.setEquipment(equipment41);
        java.time.LocalDateTime localDateTime43 = null;
        reservation7.setEndTime(localDateTime43);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test473");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) 1);
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test474");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test475");
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
            double double22 = reservation7.calculateCost((double) (-1), localDateTime21);
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test476");
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
        reservation7.setDepositAmount((double) 100);
        java.time.LocalDateTime localDateTime40 = null;
        reservation7.setEndTime(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test477");
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
        main.models.Reservation reservation37 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus28, (double) 1L, equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 10.0f, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = reservation41.getStartTime();
        java.lang.Class<?> wildcardClass43 = reservation41.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test478");
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
        double double16 = reservation7.getDepositAmount();
        main.enums.ReservationStatus reservationStatus17 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test479");
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
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus14);
        org.junit.Assert.assertNull(reservationStatus15);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test480");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.Equipment equipment10 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
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
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus36, (double) '4', equipment39, user40);
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("hi!", localDateTime12, localDateTime13, reservationStatus36, (double) 1L, equipment43, user44);
        reservation7.setStatus(reservationStatus36);
        java.time.LocalDateTime localDateTime47 = null;
        reservation7.setStartTime(localDateTime47);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test481");
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
        java.lang.String str12 = reservation7.getReservationId();
        main.models.Equipment equipment13 = reservation7.getEquipment();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test482");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = reservation10.getStartTime();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        main.enums.ReservationStatus reservationStatus19 = null;
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("", localDateTime17, localDateTime18, reservationStatus19, (double) 10L, equipment21, user22);
        reservation23.activate();
        java.time.LocalDateTime localDateTime25 = null;
        reservation23.setStartTime(localDateTime25);
        double double27 = reservation23.getDepositAmount();
        main.enums.ReservationStatus reservationStatus28 = reservation23.getStatus();
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("hi!", localDateTime14, localDateTime15, reservationStatus28, (double) 100, equipment30, user31);
        reservation10.setStatus(reservationStatus28);
        main.enums.ReservationStatus reservationStatus34 = reservation10.getStatus();
        main.models.Equipment equipment36 = null;
        main.models.User user37 = null;
        main.models.Reservation reservation38 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus34, 0.0d, equipment36, user37);
        java.time.LocalDateTime localDateTime39 = null;
        reservation38.setStartTime(localDateTime39);
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test483");
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
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        main.enums.ReservationStatus reservationStatus27 = null;
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("", localDateTime25, localDateTime26, reservationStatus27, (double) 10L, equipment29, user30);
        reservation31.activate();
        main.models.Equipment equipment33 = reservation31.getEquipment();
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        main.enums.ReservationStatus reservationStatus37 = null;
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime35, localDateTime36, reservationStatus37, (double) 10L, equipment39, user40);
        reservation41.setReservationId("hi!");
        java.time.LocalDateTime localDateTime44 = null;
        reservation41.setStartTime(localDateTime44);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        main.enums.ReservationStatus reservationStatus49 = null;
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("", localDateTime47, localDateTime48, reservationStatus49, (double) 10L, equipment51, user52);
        reservation53.activate();
        main.enums.ReservationStatus reservationStatus55 = reservation53.getStatus();
        reservation41.setStatus(reservationStatus55);
        reservation31.setStatus(reservationStatus55);
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        main.enums.ReservationStatus reservationStatus61 = null;
        main.models.Equipment equipment63 = null;
        main.models.User user64 = null;
        main.models.Reservation reservation65 = new main.models.Reservation("", localDateTime59, localDateTime60, reservationStatus61, (double) 10L, equipment63, user64);
        reservation65.activate();
        main.enums.ReservationStatus reservationStatus67 = reservation65.getStatus();
        reservation31.setStatus(reservationStatus67);
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("hi!", localDateTime22, localDateTime23, reservationStatus67, (double) (byte) 100, equipment70, user71);
        reservation7.setStatus(reservationStatus67);
        java.time.LocalDateTime localDateTime75 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double76 = reservation7.calculateCost(100.0d, localDateTime75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(equipment33);
        org.junit.Assert.assertTrue("'" + reservationStatus55 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus55.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus67 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus67.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test484");
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
        main.enums.ReservationStatus reservationStatus23 = null;
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime21, localDateTime22, reservationStatus23, (double) 10L, equipment25, user26);
        reservation27.activate();
        java.time.LocalDateTime localDateTime29 = null;
        reservation27.setStartTime(localDateTime29);
        double double31 = reservation27.getDepositAmount();
        main.enums.ReservationStatus reservationStatus32 = reservation27.getStatus();
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus32, (double) 100, equipment34, user35);
        reservation7.setStatus(reservationStatus32);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test485");
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
        java.time.LocalDateTime localDateTime54 = null;
        reservation7.checkArrival(localDateTime54);
        java.lang.Class<?> wildcardClass56 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test486");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test487");
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
        java.time.LocalDateTime localDateTime61 = reservation56.getStartTime();
        main.models.Equipment equipment62 = null;
        reservation56.setEquipment(equipment62);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
        org.junit.Assert.assertNull(localDateTime61);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test488");
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
        main.models.User user44 = reservation41.getUser();
        java.time.LocalDateTime localDateTime45 = null;
        reservation41.checkArrival(localDateTime45);
        java.time.LocalDateTime localDateTime47 = null;
        reservation41.checkArrival(localDateTime47);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user44);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test489");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.setStartTime(localDateTime16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test490");
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
        main.enums.ReservationStatus reservationStatus22 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test491");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = reservation7.calculateCost((double) 1L, localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test492");
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
        java.time.LocalDateTime localDateTime28 = null;
        reservation27.setStartTime(localDateTime28);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test493");
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
        main.models.User user36 = null;
        reservation7.setUser(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test494");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getEndTime();
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test495");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime40 = null;
        reservation7.checkArrival(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test496");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime51 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus46.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test497");
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
        java.time.LocalDateTime localDateTime45 = null;
        java.time.LocalDateTime localDateTime46 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation41.modify(localDateTime44, localDateTime45, localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test498");
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
        main.models.User user62 = null;
        reservation7.setUser(user62);
        java.time.LocalDateTime localDateTime64 = null;
        reservation7.checkArrival(localDateTime64);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test499");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus6, (double) 10L, equipment8, user9);
        reservation10.activate();
        java.time.LocalDateTime localDateTime12 = reservation10.getStartTime();
        reservation10.setDepositAmount((double) (short) 10);
        main.models.User user15 = null;
        reservation10.setUser(user15);
        main.enums.ReservationStatus reservationStatus17 = reservation10.getStatus();
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus17, (double) 0L, equipment19, user20);
        java.lang.Class<?> wildcardClass22 = reservationStatus17.getClass();
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test500");
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
        main.models.User user34 = null;
        reservation7.setUser(user34);
        reservation7.setDepositAmount((double) (short) 10);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }
}

