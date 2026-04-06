package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReservationRandoopTest3 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test501");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = reservation7.getEndTime();
        double double12 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test502");
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
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setStartTime(localDateTime12);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test503");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) (short) 10);
        main.models.User user12 = reservation7.getUser();
        reservation7.activate();
        reservation7.activate();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test504");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        reservation7.activate();
        reservation7.setDepositAmount((double) (byte) 100);
        java.lang.String str11 = reservation7.getReservationId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test505");
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
        reservation56.setReservationId("");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        main.enums.ReservationStatus reservationStatus65 = null;
        main.models.Equipment equipment67 = null;
        main.models.User user68 = null;
        main.models.Reservation reservation69 = new main.models.Reservation("", localDateTime63, localDateTime64, reservationStatus65, (double) 10L, equipment67, user68);
        reservation69.activate();
        java.time.LocalDateTime localDateTime71 = null;
        reservation69.setStartTime(localDateTime71);
        double double73 = reservation69.getDepositAmount();
        main.enums.ReservationStatus reservationStatus74 = reservation69.getStatus();
        reservation56.setStatus(reservationStatus74);
        main.models.Equipment equipment76 = reservation56.getEquipment();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus74 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus74.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment76);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test506");
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
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setEndTime(localDateTime15);
        java.lang.String str17 = reservation7.getReservationId();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test507");
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
        java.time.LocalDateTime localDateTime59 = null;
        reservation56.setStartTime(localDateTime59);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test508");
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
        double double13 = reservation7.getDepositAmount();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(reservationStatus16);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test509");
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
        java.time.LocalDateTime localDateTime60 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime60);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test510");
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
        main.models.Equipment equipment43 = null;
        reservation7.setEquipment(equipment43);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test511");
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
        main.models.User user39 = null;
        reservation7.setUser(user39);
        java.lang.String str41 = reservation7.getReservationId();
        reservation7.activate();
        java.time.LocalDateTime localDateTime43 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNull(localDateTime43);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test512");
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
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        main.enums.ReservationStatus reservationStatus46 = null;
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("", localDateTime44, localDateTime45, reservationStatus46, (double) 10L, equipment48, user49);
        reservation50.activate();
        main.enums.ReservationStatus reservationStatus52 = reservation50.getStatus();
        java.time.LocalDateTime localDateTime54 = null;
        java.time.LocalDateTime localDateTime55 = null;
        main.enums.ReservationStatus reservationStatus56 = null;
        main.models.Equipment equipment58 = null;
        main.models.User user59 = null;
        main.models.Reservation reservation60 = new main.models.Reservation("", localDateTime54, localDateTime55, reservationStatus56, (double) 10L, equipment58, user59);
        reservation60.activate();
        main.enums.ReservationStatus reservationStatus62 = reservation60.getStatus();
        reservation50.setStatus(reservationStatus62);
        main.models.Equipment equipment65 = null;
        main.models.User user66 = null;
        main.models.Reservation reservation67 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus62, (double) '4', equipment65, user66);
        reservation10.setStatus(reservationStatus62);
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus62, (double) 'a', equipment70, user71);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + reservationStatus52 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus52.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus62 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus62.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test513");
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
        reservation71.setEndTime(localDateTime72);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertTrue("'" + reservationStatus60 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus60.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertTrue("'" + reservationStatus66 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus66.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test514");
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
        java.time.LocalDateTime localDateTime22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = reservation7.calculateCost(10.0d, localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test515");
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
        main.models.User user39 = null;
        reservation7.setUser(user39);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test516");
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
        java.lang.Class<?> wildcardClass19 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test517");
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
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(reservationStatus14);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test518");
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
        reservation7.setEndTime(localDateTime41);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test519");
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
        java.lang.Class<?> wildcardClass44 = reservation42.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test520");
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
            reservation7.cancel(localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test521");
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
        java.lang.String str59 = reservation56.getReservationId();
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test522");
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
        reservation7.setDepositAmount((double) 1);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test523");
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
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime59 = null;
        reservation7.checkArrival(localDateTime59);
        main.enums.ReservationStatus reservationStatus61 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus61 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus61.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test524");
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
        reservation7.setDepositAmount((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test525");
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
        java.lang.String str13 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test526");
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
        java.time.LocalDateTime localDateTime43 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime43, localDateTime44, localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(localDateTime42);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test527");
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
        java.time.LocalDateTime localDateTime15 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test528");
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
        double double17 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test529");
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
            reservation7.cancel(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test530");
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
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.setEndTime(localDateTime17);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test531");
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
        double double16 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(reservationStatus12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test532");
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
        main.models.User user16 = null;
        reservation7.setUser(user16);
        java.time.LocalDateTime localDateTime18 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime19 = null;
        reservation7.setEndTime(localDateTime19);
        java.time.LocalDateTime localDateTime21 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test533");
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
        main.models.Equipment equipment15 = reservation10.getEquipment();
        main.models.Equipment equipment16 = null;
        reservation10.setEquipment(equipment16);
        java.lang.String str18 = reservation10.getReservationId();
        main.enums.ReservationStatus reservationStatus19 = reservation10.getStatus();
        java.time.LocalDateTime localDateTime20 = reservation10.getStartTime();
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
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("hi!", localDateTime22, localDateTime23, reservationStatus55, (double) 10L, equipment59, user60);
        reservation10.setStatus(reservationStatus55);
        main.models.Equipment equipment64 = null;
        main.models.User user65 = null;
        main.models.Reservation reservation66 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus55, (double) (short) 10, equipment64, user65);
        java.time.LocalDateTime localDateTime67 = null;
        reservation66.checkArrival(localDateTime67);
        java.time.LocalDateTime localDateTime69 = null;
        reservation66.setEndTime(localDateTime69);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime20);
        org.junit.Assert.assertNull(equipment33);
        org.junit.Assert.assertTrue("'" + reservationStatus55 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus55.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test534");
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
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.enums.ReservationStatus reservationStatus49 = reservation47.getStatus();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        main.enums.ReservationStatus reservationStatus53 = null;
        main.models.Equipment equipment55 = null;
        main.models.User user56 = null;
        main.models.Reservation reservation57 = new main.models.Reservation("", localDateTime51, localDateTime52, reservationStatus53, (double) 10L, equipment55, user56);
        reservation57.activate();
        main.enums.ReservationStatus reservationStatus59 = reservation57.getStatus();
        reservation47.setStatus(reservationStatus59);
        main.models.Equipment equipment62 = null;
        main.models.User user63 = null;
        main.models.Reservation reservation64 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus59, (double) '4', equipment62, user63);
        reservation7.setStatus(reservationStatus59);
        java.time.LocalDateTime localDateTime66 = reservation7.getEndTime();
        main.models.Equipment equipment67 = null;
        reservation7.setEquipment(equipment67);
        main.models.Equipment equipment69 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus59 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus59.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime66);
        org.junit.Assert.assertNull(equipment69);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test535");
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
        double double15 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test536");
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
        java.time.LocalDateTime localDateTime15 = reservation13.getStartTime();
        reservation13.setDepositAmount((double) (short) 10);
        main.models.User user18 = null;
        reservation13.setUser(user18);
        main.enums.ReservationStatus reservationStatus20 = reservation13.getStatus();
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus20, (double) 0L, equipment22, user23);
        main.models.Equipment equipment26 = null;
        main.models.User user27 = null;
        main.models.Reservation reservation28 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus20, (double) 0, equipment26, user27);
        reservation28.setDepositAmount((double) '#');
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + reservationStatus20 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus20.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test537");
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
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test538");
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
        main.models.Equipment equipment15 = reservation10.getEquipment();
        main.models.Equipment equipment16 = null;
        reservation10.setEquipment(equipment16);
        reservation10.activate();
        main.enums.ReservationStatus reservationStatus19 = reservation10.getStatus();
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus19, (double) (byte) 0, equipment21, user22);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test539");
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
        java.time.LocalDateTime localDateTime37 = reservation34.getEndTime();
        double double38 = reservation34.getDepositAmount();
        main.enums.ReservationStatus reservationStatus39 = reservation34.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
        org.junit.Assert.assertNull(reservationStatus39);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test540");
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
        java.lang.Class<?> wildcardClass14 = reservation7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test541");
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
        double double41 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test542");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        java.time.LocalDateTime localDateTime24 = null;
        reservation22.setStartTime(localDateTime24);
        double double26 = reservation22.getDepositAmount();
        main.enums.ReservationStatus reservationStatus27 = reservation22.getStatus();
        main.models.Equipment equipment29 = null;
        main.models.User user30 = null;
        main.models.Reservation reservation31 = new main.models.Reservation("hi!", localDateTime13, localDateTime14, reservationStatus27, (double) 100, equipment29, user30);
        main.enums.ReservationStatus reservationStatus32 = reservation31.getStatus();
        reservation7.setStatus(reservationStatus32);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus27 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus27.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test543");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test544");
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
        reservation7.setReservationId("");
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test545");
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
        java.lang.String str43 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test546");
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
        double double16 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test547");
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
        reservation10.checkArrival(localDateTime13);
        double double15 = reservation10.getDepositAmount();
        main.models.User user16 = reservation10.getUser();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        java.time.LocalDateTime localDateTime26 = null;
        reservation24.setStartTime(localDateTime26);
        double double28 = reservation24.getDepositAmount();
        main.models.Equipment equipment29 = reservation24.getEquipment();
        java.time.LocalDateTime localDateTime30 = null;
        reservation24.setStartTime(localDateTime30);
        main.enums.ReservationStatus reservationStatus32 = reservation24.getStatus();
        reservation10.setStatus(reservationStatus32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus32, (double) 0L, equipment35, user36);
        java.lang.Class<?> wildcardClass38 = reservation37.getClass();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNull(equipment29);
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test548");
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
        reservation7.setStartTime(localDateTime22);
        reservation7.setDepositAmount((double) 1);
        java.time.LocalDateTime localDateTime27 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double28 = reservation7.calculateCost((double) 1L, localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test549");
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
        main.models.Equipment equipment28 = null;
        reservation27.setEquipment(equipment28);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test550");
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
        main.models.Equipment equipment24 = null;
        reservation7.setEquipment(equipment24);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test551");
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
        java.lang.String str31 = reservation7.getReservationId();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test552");
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
        java.time.LocalDateTime localDateTime72 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus54 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus54.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus64 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus64.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime72);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test553");
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
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        main.enums.ReservationStatus reservationStatus37 = null;
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime35, localDateTime36, reservationStatus37, (double) 10L, equipment39, user40);
        reservation41.activate();
        main.enums.ReservationStatus reservationStatus43 = reservation41.getStatus();
        reservation7.setStatus(reservationStatus43);
        main.models.User user45 = null;
        reservation7.setUser(user45);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus43.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test554");
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
        reservation7.setDepositAmount((double) (byte) 10);
        reservation7.setDepositAmount((double) 100.0f);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test555");
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
        reservation7.activate();
        main.models.User user72 = reservation7.getUser();
        java.time.LocalDateTime localDateTime73 = reservation7.getEndTime();
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user72);
        org.junit.Assert.assertNull(localDateTime73);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test556");
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
        main.models.Equipment equipment15 = reservation10.getEquipment();
        main.models.Equipment equipment16 = null;
        reservation10.setEquipment(equipment16);
        java.lang.String str18 = reservation10.getReservationId();
        double double19 = reservation10.getDepositAmount();
        java.time.LocalDateTime localDateTime20 = null;
        reservation10.checkArrival(localDateTime20);
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        main.enums.ReservationStatus reservationStatus25 = null;
        main.models.Equipment equipment27 = null;
        main.models.User user28 = null;
        main.models.Reservation reservation29 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus25, (double) 10L, equipment27, user28);
        reservation29.setReservationId("hi!");
        java.time.LocalDateTime localDateTime32 = null;
        reservation29.setStartTime(localDateTime32);
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        main.enums.ReservationStatus reservationStatus37 = null;
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime35, localDateTime36, reservationStatus37, (double) 10L, equipment39, user40);
        reservation41.activate();
        main.enums.ReservationStatus reservationStatus43 = reservation41.getStatus();
        reservation29.setStatus(reservationStatus43);
        java.time.LocalDateTime localDateTime46 = null;
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        main.enums.ReservationStatus reservationStatus51 = null;
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("", localDateTime49, localDateTime50, reservationStatus51, (double) 10L, equipment53, user54);
        reservation55.activate();
        main.enums.ReservationStatus reservationStatus57 = reservation55.getStatus();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        main.enums.ReservationStatus reservationStatus61 = null;
        main.models.Equipment equipment63 = null;
        main.models.User user64 = null;
        main.models.Reservation reservation65 = new main.models.Reservation("", localDateTime59, localDateTime60, reservationStatus61, (double) 10L, equipment63, user64);
        reservation65.activate();
        main.enums.ReservationStatus reservationStatus67 = reservation65.getStatus();
        reservation55.setStatus(reservationStatus67);
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime46, localDateTime47, reservationStatus67, (double) 1.0f, equipment70, user71);
        reservation29.setStatus(reservationStatus67);
        reservation10.setStatus(reservationStatus67);
        main.models.Equipment equipment76 = null;
        main.models.User user77 = null;
        main.models.Reservation reservation78 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus67, (double) (-1L), equipment76, user77);
        reservation78.activate();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus43.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus57 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus57.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus67 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus67.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test557");
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
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("", localDateTime26, localDateTime27, reservationStatus28, (double) 10L, equipment30, user31);
        reservation32.activate();
        main.enums.ReservationStatus reservationStatus34 = reservation32.getStatus();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        main.enums.ReservationStatus reservationStatus38 = null;
        main.models.Equipment equipment40 = null;
        main.models.User user41 = null;
        main.models.Reservation reservation42 = new main.models.Reservation("", localDateTime36, localDateTime37, reservationStatus38, (double) 10L, equipment40, user41);
        reservation42.activate();
        main.enums.ReservationStatus reservationStatus44 = reservation42.getStatus();
        reservation32.setStatus(reservationStatus44);
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("", localDateTime23, localDateTime24, reservationStatus44, (double) '4', equipment47, user48);
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("", localDateTime20, localDateTime21, reservationStatus44, (double) 1, equipment51, user52);
        main.models.Equipment equipment55 = null;
        main.models.User user56 = null;
        main.models.Reservation reservation57 = new main.models.Reservation("hi!", localDateTime17, localDateTime18, reservationStatus44, (double) 10.0f, equipment55, user56);
        main.models.Equipment equipment59 = null;
        main.models.User user60 = null;
        main.models.Reservation reservation61 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus44, (double) (short) 0, equipment59, user60);
        reservation7.setStatus(reservationStatus44);
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus44 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus44.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test558");
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
        main.models.Reservation reservation42 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus36, (double) 100.0f, equipment40, user41);
        reservation42.activate();
        main.models.User user44 = null;
        reservation42.setUser(user44);
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test559");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test560");
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
        java.lang.String str18 = reservation7.getReservationId();
        main.models.Equipment equipment19 = reservation7.getEquipment();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(reservationStatus17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(equipment19);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test561");
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
        reservation56.setReservationId("");
        java.time.LocalDateTime localDateTime63 = null;
        java.time.LocalDateTime localDateTime64 = null;
        main.enums.ReservationStatus reservationStatus65 = null;
        main.models.Equipment equipment67 = null;
        main.models.User user68 = null;
        main.models.Reservation reservation69 = new main.models.Reservation("", localDateTime63, localDateTime64, reservationStatus65, (double) 10L, equipment67, user68);
        reservation69.activate();
        java.time.LocalDateTime localDateTime71 = null;
        reservation69.setStartTime(localDateTime71);
        double double73 = reservation69.getDepositAmount();
        main.enums.ReservationStatus reservationStatus74 = reservation69.getStatus();
        reservation56.setStatus(reservationStatus74);
        main.enums.ReservationStatus reservationStatus76 = null;
        reservation56.setStatus(reservationStatus76);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user57);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus74 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus74.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test562");
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
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        main.enums.ReservationStatus reservationStatus21 = null;
        main.models.Equipment equipment23 = null;
        main.models.User user24 = null;
        main.models.Reservation reservation25 = new main.models.Reservation("", localDateTime19, localDateTime20, reservationStatus21, (double) 10L, equipment23, user24);
        reservation25.activate();
        java.time.LocalDateTime localDateTime27 = reservation25.getStartTime();
        reservation25.setDepositAmount((double) (short) 10);
        main.models.User user30 = null;
        reservation25.setUser(user30);
        main.enums.ReservationStatus reservationStatus32 = reservation25.getStatus();
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus32, (double) 0L, equipment34, user35);
        reservation7.setStatus(reservationStatus32);
        main.models.User user38 = reservation7.getUser();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + reservationStatus14 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus14.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test563");
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
        main.models.User user12 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test564");
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
        main.enums.ReservationStatus reservationStatus44 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus44 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus44.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test565");
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
        reservation7.setDepositAmount((double) 'a');
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test566");
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
        reservation7.checkArrival(localDateTime19);
        java.lang.String str21 = reservation7.getReservationId();
        main.models.User user22 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(user22);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test567");
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
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) 1.0f, equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) '4', equipment35, user36);
        main.models.Equipment equipment38 = reservation37.getEquipment();
        main.models.User user39 = reservation37.getUser();
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime44 = null;
        java.time.LocalDateTime localDateTime45 = null;
        main.enums.ReservationStatus reservationStatus46 = null;
        main.models.Equipment equipment48 = null;
        main.models.User user49 = null;
        main.models.Reservation reservation50 = new main.models.Reservation("hi!", localDateTime44, localDateTime45, reservationStatus46, 0.0d, equipment48, user49);
        java.time.LocalDateTime localDateTime51 = null;
        reservation50.setStartTime(localDateTime51);
        main.models.User user53 = null;
        reservation50.setUser(user53);
        main.models.User user55 = null;
        reservation50.setUser(user55);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        main.enums.ReservationStatus reservationStatus60 = null;
        main.models.Equipment equipment62 = null;
        main.models.User user63 = null;
        main.models.Reservation reservation64 = new main.models.Reservation("", localDateTime58, localDateTime59, reservationStatus60, (double) 10L, equipment62, user63);
        reservation64.activate();
        main.enums.ReservationStatus reservationStatus66 = reservation64.getStatus();
        java.time.LocalDateTime localDateTime68 = null;
        java.time.LocalDateTime localDateTime69 = null;
        main.enums.ReservationStatus reservationStatus70 = null;
        main.models.Equipment equipment72 = null;
        main.models.User user73 = null;
        main.models.Reservation reservation74 = new main.models.Reservation("", localDateTime68, localDateTime69, reservationStatus70, (double) 10L, equipment72, user73);
        reservation74.activate();
        main.enums.ReservationStatus reservationStatus76 = reservation74.getStatus();
        reservation64.setStatus(reservationStatus76);
        reservation50.setStatus(reservationStatus76);
        main.models.Equipment equipment80 = null;
        main.models.User user81 = null;
        main.models.Reservation reservation82 = new main.models.Reservation("hi!", localDateTime41, localDateTime42, reservationStatus76, (double) 100.0f, equipment80, user81);
        reservation37.setStatus(reservationStatus76);
        main.models.Equipment equipment85 = null;
        main.models.User user86 = null;
        main.models.Reservation reservation87 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus76, (double) (byte) 1, equipment85, user86);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertTrue("'" + reservationStatus66 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus66.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus76 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus76.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test568");
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
        reservation10.checkArrival(localDateTime13);
        double double15 = reservation10.getDepositAmount();
        main.models.User user16 = reservation10.getUser();
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.activate();
        java.time.LocalDateTime localDateTime26 = null;
        reservation24.setStartTime(localDateTime26);
        double double28 = reservation24.getDepositAmount();
        main.models.Equipment equipment29 = reservation24.getEquipment();
        java.time.LocalDateTime localDateTime30 = null;
        reservation24.setStartTime(localDateTime30);
        main.enums.ReservationStatus reservationStatus32 = reservation24.getStatus();
        reservation10.setStatus(reservationStatus32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus32, (double) 0L, equipment35, user36);
        main.models.Equipment equipment38 = null;
        reservation37.setEquipment(equipment38);
        reservation37.activate();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(user16);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNull(equipment29);
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test569");
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
        reservation7.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.setEndTime(localDateTime24);
        main.models.Equipment equipment26 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment26);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test570");
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
        main.models.User user12 = null;
        reservation7.setUser(user12);
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test571");
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
        reservation34.setDepositAmount(100.0d);
        java.time.LocalDateTime localDateTime39 = reservation34.getStartTime();
        java.lang.String str40 = reservation34.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test572");
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
        main.models.User user26 = null;
        reservation7.setUser(user26);
        main.models.User user28 = reservation7.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(user28);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test573");
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
        main.models.Equipment equipment15 = reservation7.getEquipment();
        reservation7.activate();
        double double17 = reservation7.getDepositAmount();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test574");
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
        main.enums.ReservationStatus reservationStatus15 = reservation7.getStatus();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user14);
        org.junit.Assert.assertNull(reservationStatus15);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test575");
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
        java.time.LocalDateTime localDateTime38 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user37);
        org.junit.Assert.assertNull(localDateTime38);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test576");
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
        java.lang.Class<?> wildcardClass14 = reservation7.getClass();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test577");
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
        reservation41.setDepositAmount((double) 10.0f);
        java.time.LocalDateTime localDateTime44 = null;
        reservation41.setEndTime(localDateTime44);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test578");
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
        main.models.Equipment equipment13 = reservation7.getEquipment();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test579");
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
        main.models.Reservation reservation42 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus36, (double) 0.0f, equipment40, user41);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test580");
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
        main.models.User user39 = null;
        reservation7.setUser(user39);
        java.lang.String str41 = reservation7.getReservationId();
        reservation7.activate();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test581");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test582");
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
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = reservation7.calculateCost((double) (short) 0, localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(user40);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test583");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.lang.String str9 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.lang.Class<?> wildcardClass11 = reservation7.getClass();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test584");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.activate();
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test585");
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
        reservation7.activate();
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test586");
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
        reservation7.setReservationId("");
        reservation7.setDepositAmount((double) 10L);
        main.models.Equipment equipment18 = reservation7.getEquipment();
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test587");
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
        double double12 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test588");
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
        double double16 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test589");
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
        main.models.User user12 = null;
        reservation7.setUser(user12);
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
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test590");
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
        main.models.User user41 = null;
        reservation7.setUser(user41);
        java.lang.Class<?> wildcardClass43 = reservation7.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test591");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test592");
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
        double double71 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime72 = null;
        reservation7.checkArrival(localDateTime72);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test593");
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
        java.time.LocalDateTime localDateTime40 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime40);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test594");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = user30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNull(user30);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test595");
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
        reservation7.setStartTime(localDateTime22);
        java.time.LocalDateTime localDateTime24 = null;
        reservation7.setEndTime(localDateTime24);
        main.models.Equipment equipment26 = null;
        reservation7.setEquipment(equipment26);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test596");
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
        main.models.Reservation reservation48 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus31, (double) 1.0f, equipment46, user47);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test597");
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
        reservation41.setStartTime(localDateTime44);
        java.lang.String str46 = reservation41.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test598");
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
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test599");
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
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test600");
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
        main.models.User user13 = reservation7.getUser();
        main.models.User user14 = reservation7.getUser();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setStartTime(localDateTime15);
        main.models.Equipment equipment17 = null;
        reservation7.setEquipment(equipment17);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertNull(user14);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test601");
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
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        java.time.LocalDateTime localDateTime61 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.modify(localDateTime59, localDateTime60, localDateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter3>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test602");
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
        main.models.Equipment equipment18 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test603");
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
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        java.time.LocalDateTime localDateTime41 = null;
        java.time.LocalDateTime localDateTime42 = null;
        main.enums.ReservationStatus reservationStatus43 = null;
        main.models.Equipment equipment45 = null;
        main.models.User user46 = null;
        main.models.Reservation reservation47 = new main.models.Reservation("", localDateTime41, localDateTime42, reservationStatus43, (double) 10L, equipment45, user46);
        reservation47.activate();
        main.enums.ReservationStatus reservationStatus49 = reservation47.getStatus();
        java.time.LocalDateTime localDateTime51 = null;
        java.time.LocalDateTime localDateTime52 = null;
        main.enums.ReservationStatus reservationStatus53 = null;
        main.models.Equipment equipment55 = null;
        main.models.User user56 = null;
        main.models.Reservation reservation57 = new main.models.Reservation("", localDateTime51, localDateTime52, reservationStatus53, (double) 10L, equipment55, user56);
        reservation57.activate();
        main.enums.ReservationStatus reservationStatus59 = reservation57.getStatus();
        reservation47.setStatus(reservationStatus59);
        main.models.Equipment equipment62 = null;
        main.models.User user63 = null;
        main.models.Reservation reservation64 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus59, (double) '4', equipment62, user63);
        reservation7.setStatus(reservationStatus59);
        main.models.Equipment equipment66 = null;
        reservation7.setEquipment(equipment66);
        java.time.LocalDateTime localDateTime68 = null;
        reservation7.setEndTime(localDateTime68);
        main.enums.ReservationStatus reservationStatus70 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus59 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus59.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test604");
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
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        main.enums.ReservationStatus reservationStatus37 = null;
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime35, localDateTime36, reservationStatus37, 0.0d, equipment39, user40);
        java.time.LocalDateTime localDateTime42 = null;
        reservation41.setStartTime(localDateTime42);
        main.models.User user44 = null;
        reservation41.setUser(user44);
        main.models.User user46 = null;
        reservation41.setUser(user46);
        java.time.LocalDateTime localDateTime49 = null;
        java.time.LocalDateTime localDateTime50 = null;
        main.enums.ReservationStatus reservationStatus51 = null;
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("", localDateTime49, localDateTime50, reservationStatus51, (double) 10L, equipment53, user54);
        reservation55.activate();
        main.enums.ReservationStatus reservationStatus57 = reservation55.getStatus();
        java.time.LocalDateTime localDateTime59 = null;
        java.time.LocalDateTime localDateTime60 = null;
        main.enums.ReservationStatus reservationStatus61 = null;
        main.models.Equipment equipment63 = null;
        main.models.User user64 = null;
        main.models.Reservation reservation65 = new main.models.Reservation("", localDateTime59, localDateTime60, reservationStatus61, (double) 10L, equipment63, user64);
        reservation65.activate();
        main.enums.ReservationStatus reservationStatus67 = reservation65.getStatus();
        reservation55.setStatus(reservationStatus67);
        reservation41.setStatus(reservationStatus67);
        reservation7.setStatus(reservationStatus67);
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus57 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus57.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus67 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus67.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test605");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10.0f, equipment5, user6);
        main.models.User user8 = reservation7.getUser();
        main.models.Equipment equipment9 = null;
        reservation7.setEquipment(equipment9);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test606");
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
        reservation34.setDepositAmount(0.0d);
        main.enums.ReservationStatus reservationStatus38 = reservation34.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment35);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test607");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, (double) 1.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        double double10 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime11 = null;
        reservation7.setEndTime(localDateTime11);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test608");
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
        double double13 = reservation7.getDepositAmount();
        main.models.Equipment equipment14 = reservation7.getEquipment();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test609");
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
        double double17 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.checkArrival(localDateTime18);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test610");
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
        main.models.Equipment equipment73 = null;
        reservation7.setEquipment(equipment73);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(localDateTime72);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test611");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.models.User user9 = reservation7.getUser();
        reservation7.activate();
        java.time.LocalDateTime localDateTime11 = reservation7.getEndTime();
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
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test612");
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
        double double41 = reservation7.getDepositAmount();
        main.models.Equipment equipment42 = null;
        reservation7.setEquipment(equipment42);
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double46 = reservation7.calculateCost((double) 'a', localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test613");
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
        main.models.Reservation reservation42 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus36, (double) 100.0f, equipment40, user41);
        main.enums.ReservationStatus reservationStatus43 = reservation42.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus43.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test614");
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
        main.models.Equipment equipment15 = reservation7.getEquipment();
        reservation7.activate();
        double double17 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime18 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime19 = null;
        reservation7.checkArrival(localDateTime19);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test615");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setEndTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
        java.time.LocalDateTime localDateTime12 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test616");
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
        // The following exception was thrown during execution in test generation
        try {
            double double17 = reservation7.calculateCost((double) 10.0f, localDateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test617");
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
        reservation7.checkArrival(localDateTime13);
        java.lang.String str15 = reservation7.getReservationId();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test618");
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
        main.models.User user41 = null;
        reservation7.setUser(user41);
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test619");
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
        java.time.LocalDateTime localDateTime18 = reservation7.getEndTime();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test620");
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
        java.lang.String str16 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime17 = null;
        reservation7.setStartTime(localDateTime17);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test621");
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
        java.time.LocalDateTime localDateTime91 = null;
        reservation27.checkArrival(localDateTime91);
        reservation27.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test622");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10.0f, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = null;
        reservation7.setStartTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = reservation7.getStartTime();
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test623");
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
        java.time.LocalDateTime localDateTime23 = reservation7.getEndTime();
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test624");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        reservation7.setReservationId("");
        java.time.LocalDateTime localDateTime10 = null;
        reservation7.checkArrival(localDateTime10);
        main.models.Equipment equipment12 = null;
        reservation7.setEquipment(equipment12);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test625");
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
        double double18 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime19 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNull(localDateTime19);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test626");
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
        main.enums.ReservationStatus reservationStatus12 = reservation7.getStatus();
        reservation7.setDepositAmount((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test627");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.lang.String str9 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        main.models.User user11 = null;
        reservation7.setUser(user11);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(reservationStatus10);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test628");
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
        reservation7.setReservationId("hi!");
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test629");
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
        java.time.LocalDateTime localDateTime91 = null;
        reservation27.checkArrival(localDateTime91);
        main.models.Equipment equipment93 = reservation27.getEquipment();
        double double94 = reservation27.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment93);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 0.0d + "'", double94 == 0.0d);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test630");
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
        main.models.Equipment equipment17 = reservation7.getEquipment();
        main.models.Equipment equipment18 = reservation7.getEquipment();
        main.enums.ReservationStatus reservationStatus19 = reservation7.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(equipment17);
        org.junit.Assert.assertNull(equipment18);
        org.junit.Assert.assertNull(reservationStatus19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test631");
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
        java.time.LocalDateTime localDateTime62 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation56.cancel(localDateTime62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment57);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test632");
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
        java.time.LocalDateTime localDateTime45 = null;
        double double46 = reservation7.calculateCost(10.0d, localDateTime45);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test633");
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
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test634");
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
        main.models.Equipment equipment15 = reservation7.getEquipment();
        reservation7.setDepositAmount((-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(equipment15);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test635");
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
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) (-1.0f), equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus31, (double) 'a', equipment46, user47);
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test636");
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
        main.models.Equipment equipment22 = null;
        reservation7.setEquipment(equipment22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.models.Equipment equipment36 = reservation34.getEquipment();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.setReservationId("hi!");
        java.time.LocalDateTime localDateTime47 = null;
        reservation44.setStartTime(localDateTime47);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.activate();
        main.enums.ReservationStatus reservationStatus58 = reservation56.getStatus();
        reservation44.setStatus(reservationStatus58);
        reservation34.setStatus(reservationStatus58);
        main.models.Equipment equipment62 = null;
        main.models.User user63 = null;
        main.models.Reservation reservation64 = new main.models.Reservation("hi!", localDateTime25, localDateTime26, reservationStatus58, (double) 10L, equipment62, user63);
        reservation7.setStatus(reservationStatus58);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertNull(equipment36);
        org.junit.Assert.assertTrue("'" + reservationStatus58 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus58.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test637");
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
        reservation7.activate();
        java.time.LocalDateTime localDateTime18 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertNull(localDateTime18);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test638");
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
        reservation56.setReservationId("");
        java.time.LocalDateTime localDateTime59 = null;
        reservation56.setStartTime(localDateTime59);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test639");
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
        java.lang.Class<?> wildcardClass14 = reservation7.getClass();
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test640");
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
        main.models.Reservation reservation33 = new main.models.Reservation("", localDateTime7, localDateTime8, reservationStatus28, (double) 1.0f, equipment31, user32);
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus28, (double) '4', equipment35, user36);
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus28, (double) 1.0f, equipment39, user40);
        main.models.Equipment equipment42 = reservation41.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment42);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test641");
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
        java.time.LocalDateTime localDateTime91 = null;
        reservation27.checkArrival(localDateTime91);
        main.models.User user93 = reservation27.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user93);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test642");
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
        java.time.LocalDateTime localDateTime16 = reservation10.getStartTime();
        main.models.User user17 = null;
        reservation10.setUser(user17);
        reservation10.setReservationId("");
        java.lang.String str21 = reservation10.getReservationId();
        java.time.LocalDateTime localDateTime22 = null;
        reservation10.setEndTime(localDateTime22);
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime29 = null;
        main.enums.ReservationStatus reservationStatus30 = null;
        main.models.Equipment equipment32 = null;
        main.models.User user33 = null;
        main.models.Reservation reservation34 = new main.models.Reservation("", localDateTime28, localDateTime29, reservationStatus30, (double) 10L, equipment32, user33);
        reservation34.activate();
        main.models.Equipment equipment36 = reservation34.getEquipment();
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.setReservationId("hi!");
        java.time.LocalDateTime localDateTime47 = null;
        reservation44.setStartTime(localDateTime47);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.activate();
        main.enums.ReservationStatus reservationStatus58 = reservation56.getStatus();
        reservation44.setStatus(reservationStatus58);
        reservation34.setStatus(reservationStatus58);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        main.enums.ReservationStatus reservationStatus64 = null;
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime62, localDateTime63, reservationStatus64, (double) 10L, equipment66, user67);
        reservation68.activate();
        main.enums.ReservationStatus reservationStatus70 = reservation68.getStatus();
        reservation34.setStatus(reservationStatus70);
        main.models.Equipment equipment73 = null;
        main.models.User user74 = null;
        main.models.Reservation reservation75 = new main.models.Reservation("hi!", localDateTime25, localDateTime26, reservationStatus70, (double) (byte) 100, equipment73, user74);
        reservation10.setStatus(reservationStatus70);
        main.models.Equipment equipment78 = null;
        main.models.User user79 = null;
        main.models.Reservation reservation80 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus70, (double) '4', equipment78, user79);
        main.models.Equipment equipment81 = null;
        reservation80.setEquipment(equipment81);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(equipment36);
        org.junit.Assert.assertTrue("'" + reservationStatus58 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus58.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test643");
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
        java.time.LocalDateTime localDateTime43 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double44 = reservation7.calculateCost((double) (short) -1, localDateTime43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user41);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test644");
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
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime59 = null;
        reservation7.checkArrival(localDateTime59);
        java.time.LocalDateTime localDateTime61 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test645");
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
        main.models.Equipment equipment45 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(equipment45);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test646");
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
        reservation34.setDepositAmount(1.0d);
        double double39 = reservation34.getDepositAmount();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 1.0d + "'", double39 == 1.0d);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test647");
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
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        main.enums.ReservationStatus reservationStatus18 = null;
        main.models.Equipment equipment20 = null;
        main.models.User user21 = null;
        main.models.Reservation reservation22 = new main.models.Reservation("", localDateTime16, localDateTime17, reservationStatus18, (double) 10L, equipment20, user21);
        reservation22.activate();
        main.enums.ReservationStatus reservationStatus24 = reservation22.getStatus();
        reservation10.setStatus(reservationStatus24);
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        main.enums.ReservationStatus reservationStatus32 = null;
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime30, localDateTime31, reservationStatus32, (double) 10L, equipment34, user35);
        reservation36.activate();
        main.enums.ReservationStatus reservationStatus38 = reservation36.getStatus();
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        main.enums.ReservationStatus reservationStatus42 = null;
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime40, localDateTime41, reservationStatus42, (double) 10L, equipment44, user45);
        reservation46.activate();
        main.enums.ReservationStatus reservationStatus48 = reservation46.getStatus();
        reservation36.setStatus(reservationStatus48);
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("", localDateTime27, localDateTime28, reservationStatus48, (double) 1.0f, equipment51, user52);
        reservation10.setStatus(reservationStatus48);
        main.models.Equipment equipment55 = null;
        reservation10.setEquipment(equipment55);
        java.time.LocalDateTime localDateTime58 = null;
        java.time.LocalDateTime localDateTime59 = null;
        main.enums.ReservationStatus reservationStatus60 = null;
        main.models.Equipment equipment62 = null;
        main.models.User user63 = null;
        main.models.Reservation reservation64 = new main.models.Reservation("hi!", localDateTime58, localDateTime59, reservationStatus60, 0.0d, equipment62, user63);
        java.time.LocalDateTime localDateTime65 = null;
        reservation64.setStartTime(localDateTime65);
        main.models.User user67 = null;
        reservation64.setUser(user67);
        main.models.User user69 = null;
        reservation64.setUser(user69);
        java.time.LocalDateTime localDateTime72 = null;
        java.time.LocalDateTime localDateTime73 = null;
        main.enums.ReservationStatus reservationStatus74 = null;
        main.models.Equipment equipment76 = null;
        main.models.User user77 = null;
        main.models.Reservation reservation78 = new main.models.Reservation("", localDateTime72, localDateTime73, reservationStatus74, (double) 10L, equipment76, user77);
        reservation78.activate();
        main.enums.ReservationStatus reservationStatus80 = reservation78.getStatus();
        java.time.LocalDateTime localDateTime82 = null;
        java.time.LocalDateTime localDateTime83 = null;
        main.enums.ReservationStatus reservationStatus84 = null;
        main.models.Equipment equipment86 = null;
        main.models.User user87 = null;
        main.models.Reservation reservation88 = new main.models.Reservation("", localDateTime82, localDateTime83, reservationStatus84, (double) 10L, equipment86, user87);
        reservation88.activate();
        main.enums.ReservationStatus reservationStatus90 = reservation88.getStatus();
        reservation78.setStatus(reservationStatus90);
        reservation64.setStatus(reservationStatus90);
        reservation10.setStatus(reservationStatus90);
        main.models.Equipment equipment95 = null;
        main.models.User user96 = null;
        main.models.Reservation reservation97 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus90, (double) '4', equipment95, user96);
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus48 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus48.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus80 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus80.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus90 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus90.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test648");
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
        java.time.LocalDateTime localDateTime79 = null;
        reservation34.setStartTime(localDateTime79);
        java.time.LocalDateTime localDateTime81 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation34.cancel(localDateTime81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment49);
        org.junit.Assert.assertTrue("'" + reservationStatus71 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus71.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test649");
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
        main.models.User user13 = reservation7.getUser();
        java.time.LocalDateTime localDateTime14 = null;
        reservation7.checkArrival(localDateTime14);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test650");
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
        reservation7.activate();
        org.junit.Assert.assertNull(user11);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test651");
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
        main.models.User user12 = reservation7.getUser();
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test652");
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
        double double41 = reservation7.getDepositAmount();
        main.models.Equipment equipment42 = null;
        reservation7.setEquipment(equipment42);
        main.models.Equipment equipment44 = null;
        reservation7.setEquipment(equipment44);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test653");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        reservation7.activate();
        java.lang.String str10 = reservation7.getReservationId();
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test654");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        reservation7.activate();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test655");
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
        java.lang.Class<?> wildcardClass41 = reservationStatus40.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test656");
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
        main.models.User user12 = null;
        reservation7.setUser(user12);
        java.lang.String str14 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.checkArrival(localDateTime15);
        java.lang.String str17 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.setStartTime(localDateTime18);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test657");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        main.enums.ReservationStatus reservationStatus8 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime9 = null;
        reservation7.setStartTime(localDateTime9);
        main.models.Equipment equipment11 = null;
        reservation7.setEquipment(equipment11);
        java.time.LocalDateTime localDateTime13 = reservation7.getStartTime();
        org.junit.Assert.assertNull(reservationStatus8);
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test658");
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
        reservation7.setStartTime(localDateTime73);
        java.time.LocalDateTime localDateTime75 = null;
        reservation7.checkArrival(localDateTime75);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(localDateTime72);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test659");
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
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double43 = reservation7.calculateCost((double) (short) 0, localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<local4>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test660");
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
        reservation7.checkArrival(localDateTime72);
        reservation7.activate();
        main.models.User user75 = null;
        reservation7.setUser(user75);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus54 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus54.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus64 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus64.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test661");
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
        main.models.User user57 = null;
        reservation55.setUser(user57);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user56);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test662");
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
        reservation7.activate();
        java.lang.String str72 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime73 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime74 = null;
        reservation7.setStartTime(localDateTime74);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNull(localDateTime73);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test663");
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
        reservation7.setReservationId("");
        main.models.User user20 = reservation7.getUser();
        java.time.LocalDateTime localDateTime21 = null;
        reservation7.checkArrival(localDateTime21);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user20);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test664");
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
        main.models.Equipment equipment29 = reservation27.getEquipment();
        reservation27.setDepositAmount(0.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment29);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test665");
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
        reservation34.setDepositAmount(0.0d);
        reservation34.setDepositAmount((double) 10L);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment35);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test666");
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
        reservation71.setDepositAmount((double) 0);
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user24);
        org.junit.Assert.assertTrue("'" + reservationStatus60 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus60.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user63);
        org.junit.Assert.assertTrue("'" + reservationStatus66 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus66.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test667");
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
        java.time.LocalDateTime localDateTime42 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation41.extend(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test668");
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
        main.models.Equipment equipment13 = null;
        reservation7.setEquipment(equipment13);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test669");
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
        reservation51.setDepositAmount(0.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus46.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user54);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test670");
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
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        main.enums.ReservationStatus reservationStatus17 = null;
        main.models.Equipment equipment19 = null;
        main.models.User user20 = null;
        main.models.Reservation reservation21 = new main.models.Reservation("", localDateTime15, localDateTime16, reservationStatus17, (double) 10L, equipment19, user20);
        reservation21.activate();
        java.time.LocalDateTime localDateTime23 = null;
        reservation21.setStartTime(localDateTime23);
        double double25 = reservation21.getDepositAmount();
        main.models.Equipment equipment26 = reservation21.getEquipment();
        java.time.LocalDateTime localDateTime27 = null;
        reservation21.setStartTime(localDateTime27);
        main.enums.ReservationStatus reservationStatus29 = reservation21.getStatus();
        reservation7.setStatus(reservationStatus29);
        java.time.LocalDateTime localDateTime31 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(user13);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNull(equipment26);
        org.junit.Assert.assertTrue("'" + reservationStatus29 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus29.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test671");
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
        java.lang.String str13 = reservation7.getReservationId();
        main.models.User user14 = null;
        reservation7.setUser(user14);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test672");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        main.enums.ReservationStatus reservationStatus6 = null;
        main.models.Equipment equipment8 = null;
        main.models.User user9 = null;
        main.models.Reservation reservation10 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus6, 0.0d, equipment8, user9);
        java.time.LocalDateTime localDateTime11 = reservation10.getStartTime();
        reservation10.activate();
        java.lang.String str13 = reservation10.getReservationId();
        java.lang.String str14 = reservation10.getReservationId();
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
        main.models.User user72 = reservation71.getUser();
        java.time.LocalDateTime localDateTime73 = null;
        reservation71.setStartTime(localDateTime73);
        main.enums.ReservationStatus reservationStatus75 = reservation71.getStatus();
        reservation10.setStatus(reservationStatus75);
        main.models.Equipment equipment78 = null;
        main.models.User user79 = null;
        main.models.Reservation reservation80 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus75, (double) (short) -1, equipment78, user79);
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(reservationStatus28);
        org.junit.Assert.assertTrue("'" + reservationStatus54 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus54.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus64 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus64.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user72);
        org.junit.Assert.assertTrue("'" + reservationStatus75 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus75.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test673");
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
        java.time.LocalDateTime localDateTime40 = reservation7.getEndTime();
        main.enums.ReservationStatus reservationStatus41 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus41 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus41.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test674");
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
        main.enums.ReservationStatus reservationStatus31 = reservation7.getStatus();
        main.models.User user32 = reservation7.getUser();
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test675");
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
        main.enums.ReservationStatus reservationStatus45 = reservation7.getStatus();
        main.enums.ReservationStatus reservationStatus46 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime47 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus45.equals(main.enums.ReservationStatus.NoShow));
        org.junit.Assert.assertTrue("'" + reservationStatus46 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus46.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test676");
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
        java.time.LocalDateTime localDateTime15 = null;
        main.enums.ReservationStatus reservationStatus16 = null;
        main.models.Equipment equipment18 = null;
        main.models.User user19 = null;
        main.models.Reservation reservation20 = new main.models.Reservation("", localDateTime14, localDateTime15, reservationStatus16, (double) 10L, equipment18, user19);
        reservation20.activate();
        main.enums.ReservationStatus reservationStatus22 = reservation20.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        main.enums.ReservationStatus reservationStatus26 = null;
        main.models.Equipment equipment28 = null;
        main.models.User user29 = null;
        main.models.Reservation reservation30 = new main.models.Reservation("", localDateTime24, localDateTime25, reservationStatus26, (double) 10L, equipment28, user29);
        reservation30.activate();
        main.enums.ReservationStatus reservationStatus32 = reservation30.getStatus();
        reservation20.setStatus(reservationStatus32);
        main.models.User user34 = reservation20.getUser();
        reservation20.setReservationId("");
        java.time.LocalDateTime localDateTime38 = null;
        java.time.LocalDateTime localDateTime39 = null;
        main.enums.ReservationStatus reservationStatus40 = null;
        main.models.Equipment equipment42 = null;
        main.models.User user43 = null;
        main.models.Reservation reservation44 = new main.models.Reservation("", localDateTime38, localDateTime39, reservationStatus40, (double) 10L, equipment42, user43);
        reservation44.setReservationId("hi!");
        main.models.Equipment equipment47 = null;
        reservation44.setEquipment(equipment47);
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.setReservationId("hi!");
        java.time.LocalDateTime localDateTime59 = null;
        reservation56.setStartTime(localDateTime59);
        java.time.LocalDateTime localDateTime62 = null;
        java.time.LocalDateTime localDateTime63 = null;
        main.enums.ReservationStatus reservationStatus64 = null;
        main.models.Equipment equipment66 = null;
        main.models.User user67 = null;
        main.models.Reservation reservation68 = new main.models.Reservation("", localDateTime62, localDateTime63, reservationStatus64, (double) 10L, equipment66, user67);
        reservation68.activate();
        main.enums.ReservationStatus reservationStatus70 = reservation68.getStatus();
        reservation56.setStatus(reservationStatus70);
        reservation44.setStatus(reservationStatus70);
        main.models.User user73 = reservation44.getUser();
        reservation44.setDepositAmount((double) (-1L));
        main.enums.ReservationStatus reservationStatus76 = reservation44.getStatus();
        reservation20.setStatus(reservationStatus76);
        java.time.LocalDateTime localDateTime78 = null;
        reservation20.checkArrival(localDateTime78);
        main.enums.ReservationStatus reservationStatus80 = reservation20.getStatus();
        reservation7.setStatus(reservationStatus80);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus32 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus32.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user34);
        org.junit.Assert.assertTrue("'" + reservationStatus70 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus70.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user73);
        org.junit.Assert.assertTrue("'" + reservationStatus76 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus76.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus80 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus80.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test677");
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
        reservation7.activate();
        main.models.User user72 = reservation7.getUser();
        java.time.LocalDateTime localDateTime73 = reservation7.getEndTime();
        main.models.Equipment equipment74 = null;
        reservation7.setEquipment(equipment74);
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus53 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus53.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus63 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus63.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user72);
        org.junit.Assert.assertNull(localDateTime73);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test678");
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
        reservation7.setDepositAmount((double) (-1L));
        java.time.LocalDateTime localDateTime24 = reservation7.getEndTime();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(localDateTime24);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test679");
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
        main.models.User user13 = reservation7.getUser();
        reservation7.setDepositAmount((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user13);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test680");
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
        main.models.User user15 = reservation7.getUser();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        java.time.LocalDateTime localDateTime18 = null;
        reservation7.checkArrival(localDateTime18);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test681");
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
        main.models.User user46 = null;
        reservation45.setUser(user46);
        main.models.User user48 = null;
        reservation45.setUser(user48);
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime39);
        org.junit.Assert.assertNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + reservationStatus41 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus41.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test682");
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
        double double13 = reservation7.getDepositAmount();
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test683");
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
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setStartTime(localDateTime12);
        java.time.LocalDateTime localDateTime14 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) 1.0f);
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test684");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        java.time.LocalDateTime localDateTime9 = reservation7.getStartTime();
        reservation7.setDepositAmount((double) (short) 10);
        main.models.User user12 = reservation7.getUser();
        java.time.LocalDateTime localDateTime13 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime9);
        org.junit.Assert.assertNull(user12);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test685");
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
        java.time.LocalDateTime localDateTime15 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime16 = reservation7.getEndTime();
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test686");
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
        main.models.Equipment equipment41 = null;
        reservation7.setEquipment(equipment41);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test687");
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
        main.models.Equipment equipment14 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime15 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test688");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus42 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus42.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test689");
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
        main.models.User user15 = reservation7.getUser();
        main.models.Equipment equipment16 = null;
        reservation7.setEquipment(equipment16);
        main.enums.ReservationStatus reservationStatus18 = reservation7.getStatus();
        double double19 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(user15);
        org.junit.Assert.assertNull(reservationStatus18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test690");
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
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test691");
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
        main.models.Equipment equipment24 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNull(user22);
        org.junit.Assert.assertNull(localDateTime23);
        org.junit.Assert.assertNull(equipment24);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test692");
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
        main.models.User user44 = reservation7.getUser();
        java.time.LocalDateTime localDateTime45 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user36);
        org.junit.Assert.assertNull(user39);
        org.junit.Assert.assertNull(localDateTime42);
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertNull(user44);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test693");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus3, (double) 10L, equipment5, user6);
        reservation7.activate();
        main.enums.ReservationStatus reservationStatus9 = reservation7.getStatus();
        main.models.User user10 = reservation7.getUser();
        reservation7.setDepositAmount((double) 100L);
        java.time.LocalDateTime localDateTime13 = null;
        reservation7.setEndTime(localDateTime13);
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test694");
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
        main.models.Equipment equipment12 = null;
        reservation7.setEquipment(equipment12);
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        main.models.Equipment equipment15 = reservation7.getEquipment();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNull(user11);
        org.junit.Assert.assertNull(reservationStatus14);
        org.junit.Assert.assertNull(equipment15);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test695");
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
        main.models.User user18 = reservation7.getUser();
        java.lang.String str19 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime20 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.cancel(localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.isAfter(java.time.chrono.ChronoLocalDateTime)\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDateTime12);
        org.junit.Assert.assertNull(reservationStatus17);
        org.junit.Assert.assertNull(user18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test696");
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
        main.models.Equipment equipment14 = reservation7.getEquipment();
        java.time.LocalDateTime localDateTime15 = null;
        reservation7.setStartTime(localDateTime15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test697");
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
        reservation7.activate();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertTrue("'" + reservationStatus38 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus38.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test698");
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
            reservation56.extend(localDateTime57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test699");
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
        main.models.User user26 = null;
        reservation7.setUser(user26);
        double double28 = reservation7.getDepositAmount();
        main.enums.ReservationStatus reservationStatus29 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus9 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus9.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user21);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + reservationStatus29 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus29.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test700");
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
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        main.enums.ReservationStatus reservationStatus22 = null;
        main.models.Equipment equipment24 = null;
        main.models.User user25 = null;
        main.models.Reservation reservation26 = new main.models.Reservation("hi!", localDateTime20, localDateTime21, reservationStatus22, 0.0d, equipment24, user25);
        java.time.LocalDateTime localDateTime27 = null;
        reservation26.setStartTime(localDateTime27);
        main.enums.ReservationStatus reservationStatus29 = reservation26.getStatus();
        java.time.LocalDateTime localDateTime30 = null;
        reservation26.setEndTime(localDateTime30);
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        main.enums.ReservationStatus reservationStatus35 = null;
        main.models.Equipment equipment37 = null;
        main.models.User user38 = null;
        main.models.Reservation reservation39 = new main.models.Reservation("hi!", localDateTime33, localDateTime34, reservationStatus35, 0.0d, equipment37, user38);
        java.time.LocalDateTime localDateTime40 = null;
        reservation39.setStartTime(localDateTime40);
        main.models.User user42 = null;
        reservation39.setUser(user42);
        main.models.User user44 = null;
        reservation39.setUser(user44);
        java.time.LocalDateTime localDateTime47 = null;
        java.time.LocalDateTime localDateTime48 = null;
        main.enums.ReservationStatus reservationStatus49 = null;
        main.models.Equipment equipment51 = null;
        main.models.User user52 = null;
        main.models.Reservation reservation53 = new main.models.Reservation("", localDateTime47, localDateTime48, reservationStatus49, (double) 10L, equipment51, user52);
        reservation53.activate();
        main.enums.ReservationStatus reservationStatus55 = reservation53.getStatus();
        java.time.LocalDateTime localDateTime57 = null;
        java.time.LocalDateTime localDateTime58 = null;
        main.enums.ReservationStatus reservationStatus59 = null;
        main.models.Equipment equipment61 = null;
        main.models.User user62 = null;
        main.models.Reservation reservation63 = new main.models.Reservation("", localDateTime57, localDateTime58, reservationStatus59, (double) 10L, equipment61, user62);
        reservation63.activate();
        main.enums.ReservationStatus reservationStatus65 = reservation63.getStatus();
        reservation53.setStatus(reservationStatus65);
        reservation39.setStatus(reservationStatus65);
        reservation26.setStatus(reservationStatus65);
        main.models.Equipment equipment70 = null;
        main.models.User user71 = null;
        main.models.Reservation reservation72 = new main.models.Reservation("", localDateTime17, localDateTime18, reservationStatus65, (double) '4', equipment70, user71);
        main.models.User user73 = reservation72.getUser();
        java.time.LocalDateTime localDateTime74 = null;
        reservation72.setStartTime(localDateTime74);
        main.enums.ReservationStatus reservationStatus76 = reservation72.getStatus();
        reservation7.setStatus(reservationStatus76);
        main.models.Equipment equipment78 = null;
        reservation7.setEquipment(equipment78);
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(reservationStatus29);
        org.junit.Assert.assertTrue("'" + reservationStatus55 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus55.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus65 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus65.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user73);
        org.junit.Assert.assertTrue("'" + reservationStatus76 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus76.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test701");
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
        double double98 = reservation97.getDepositAmount();
        java.lang.Class<?> wildcardClass99 = reservation97.getClass();
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNull(equipment45);
        org.junit.Assert.assertTrue("'" + reservationStatus68 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus68.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus78 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus78.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double98 + "' != '" + 1.0d + "'", double98 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test702");
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
        java.time.LocalDateTime localDateTime36 = null;
        reservation34.setStartTime(localDateTime36);
        org.junit.Assert.assertTrue("'" + reservationStatus15 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus15.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus25 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus25.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment35);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test703");
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
        double double15 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(user9);
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test704");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.lang.String str9 = reservation7.getReservationId();
        main.enums.ReservationStatus reservationStatus10 = reservation7.getStatus();
        java.time.LocalDateTime localDateTime11 = reservation7.getStartTime();
        java.time.LocalDateTime localDateTime12 = null;
        reservation7.setEndTime(localDateTime12);
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test705");
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
        reservation7.checkArrival(localDateTime14);
        org.junit.Assert.assertNull(equipment9);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test706");
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
        double double13 = reservation7.getDepositAmount();
        java.lang.String str14 = reservation7.getReservationId();
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test707");
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
        reservation7.setReservationId("hi!");
        java.time.LocalDateTime localDateTime59 = reservation7.getStartTime();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNull(localDateTime59);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test708");
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
        java.time.LocalDateTime localDateTime16 = reservation7.getEndTime();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test709");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        main.enums.ReservationStatus reservationStatus9 = null;
        main.models.Equipment equipment11 = null;
        main.models.User user12 = null;
        main.models.Reservation reservation13 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus9, 0.0d, equipment11, user12);
        java.time.LocalDateTime localDateTime14 = null;
        reservation13.setStartTime(localDateTime14);
        main.models.User user16 = null;
        reservation13.setUser(user16);
        main.models.User user18 = null;
        reservation13.setUser(user18);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        main.enums.ReservationStatus reservationStatus23 = null;
        main.models.Equipment equipment25 = null;
        main.models.User user26 = null;
        main.models.Reservation reservation27 = new main.models.Reservation("", localDateTime21, localDateTime22, reservationStatus23, (double) 10L, equipment25, user26);
        reservation27.activate();
        main.enums.ReservationStatus reservationStatus29 = reservation27.getStatus();
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        main.enums.ReservationStatus reservationStatus33 = null;
        main.models.Equipment equipment35 = null;
        main.models.User user36 = null;
        main.models.Reservation reservation37 = new main.models.Reservation("", localDateTime31, localDateTime32, reservationStatus33, (double) 10L, equipment35, user36);
        reservation37.activate();
        main.enums.ReservationStatus reservationStatus39 = reservation37.getStatus();
        reservation27.setStatus(reservationStatus39);
        reservation13.setStatus(reservationStatus39);
        main.models.Equipment equipment43 = null;
        main.models.User user44 = null;
        main.models.Reservation reservation45 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus39, (double) 100.0f, equipment43, user44);
        main.models.Equipment equipment47 = null;
        main.models.User user48 = null;
        main.models.Reservation reservation49 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus39, (double) (byte) 100, equipment47, user48);
        org.junit.Assert.assertTrue("'" + reservationStatus29 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus29.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus39 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus39.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test710");
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
        main.models.Reservation reservation44 = new main.models.Reservation("hi!", localDateTime4, localDateTime5, reservationStatus31, (double) 100.0f, equipment42, user43);
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus31, 10.0d, equipment46, user47);
        main.enums.ReservationStatus reservationStatus49 = reservation48.getStatus();
        org.junit.Assert.assertTrue("'" + reservationStatus21 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus21.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus49 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus49.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test711");
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
        main.enums.ReservationStatus reservationStatus14 = reservation7.getStatus();
        main.models.User user15 = null;
        reservation7.setUser(user15);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        main.enums.ReservationStatus reservationStatus20 = null;
        main.models.Equipment equipment22 = null;
        main.models.User user23 = null;
        main.models.Reservation reservation24 = new main.models.Reservation("", localDateTime18, localDateTime19, reservationStatus20, (double) 10L, equipment22, user23);
        reservation24.setReservationId("hi!");
        main.models.Equipment equipment27 = null;
        reservation24.setEquipment(equipment27);
        java.time.LocalDateTime localDateTime30 = null;
        java.time.LocalDateTime localDateTime31 = null;
        main.enums.ReservationStatus reservationStatus32 = null;
        main.models.Equipment equipment34 = null;
        main.models.User user35 = null;
        main.models.Reservation reservation36 = new main.models.Reservation("", localDateTime30, localDateTime31, reservationStatus32, (double) 10L, equipment34, user35);
        reservation36.setReservationId("hi!");
        java.time.LocalDateTime localDateTime39 = null;
        reservation36.setStartTime(localDateTime39);
        java.time.LocalDateTime localDateTime42 = null;
        java.time.LocalDateTime localDateTime43 = null;
        main.enums.ReservationStatus reservationStatus44 = null;
        main.models.Equipment equipment46 = null;
        main.models.User user47 = null;
        main.models.Reservation reservation48 = new main.models.Reservation("", localDateTime42, localDateTime43, reservationStatus44, (double) 10L, equipment46, user47);
        reservation48.activate();
        main.enums.ReservationStatus reservationStatus50 = reservation48.getStatus();
        reservation36.setStatus(reservationStatus50);
        reservation24.setStatus(reservationStatus50);
        main.models.User user53 = reservation24.getUser();
        java.time.LocalDateTime localDateTime54 = null;
        reservation24.checkArrival(localDateTime54);
        main.models.User user56 = null;
        reservation24.setUser(user56);
        main.models.User user58 = null;
        reservation24.setUser(user58);
        java.time.LocalDateTime localDateTime60 = null;
        reservation24.checkArrival(localDateTime60);
        main.enums.ReservationStatus reservationStatus62 = reservation24.getStatus();
        reservation7.setStatus(reservationStatus62);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertNull(reservationStatus14);
        org.junit.Assert.assertTrue("'" + reservationStatus50 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus50.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user53);
        org.junit.Assert.assertTrue("'" + reservationStatus62 + "' != '" + main.enums.ReservationStatus.NoShow + "'", reservationStatus62.equals(main.enums.ReservationStatus.NoShow));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test712");
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
        double double18 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + reservationStatus17 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus17.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test713");
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
        main.models.User user41 = reservation7.getUser();
        double double42 = reservation7.getDepositAmount();
        java.lang.String str43 = reservation7.getReservationId();
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user41);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test714");
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
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        main.enums.ReservationStatus reservationStatus15 = null;
        main.models.Equipment equipment17 = null;
        main.models.User user18 = null;
        main.models.Reservation reservation19 = new main.models.Reservation("hi!", localDateTime13, localDateTime14, reservationStatus15, 0.0d, equipment17, user18);
        java.time.LocalDateTime localDateTime20 = null;
        reservation19.setStartTime(localDateTime20);
        main.enums.ReservationStatus reservationStatus22 = reservation19.getStatus();
        java.time.LocalDateTime localDateTime23 = null;
        reservation19.setEndTime(localDateTime23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        main.enums.ReservationStatus reservationStatus28 = null;
        main.models.Equipment equipment30 = null;
        main.models.User user31 = null;
        main.models.Reservation reservation32 = new main.models.Reservation("hi!", localDateTime26, localDateTime27, reservationStatus28, 0.0d, equipment30, user31);
        java.time.LocalDateTime localDateTime33 = null;
        reservation32.setStartTime(localDateTime33);
        main.models.User user35 = null;
        reservation32.setUser(user35);
        main.models.User user37 = null;
        reservation32.setUser(user37);
        java.time.LocalDateTime localDateTime40 = null;
        java.time.LocalDateTime localDateTime41 = null;
        main.enums.ReservationStatus reservationStatus42 = null;
        main.models.Equipment equipment44 = null;
        main.models.User user45 = null;
        main.models.Reservation reservation46 = new main.models.Reservation("", localDateTime40, localDateTime41, reservationStatus42, (double) 10L, equipment44, user45);
        reservation46.activate();
        main.enums.ReservationStatus reservationStatus48 = reservation46.getStatus();
        java.time.LocalDateTime localDateTime50 = null;
        java.time.LocalDateTime localDateTime51 = null;
        main.enums.ReservationStatus reservationStatus52 = null;
        main.models.Equipment equipment54 = null;
        main.models.User user55 = null;
        main.models.Reservation reservation56 = new main.models.Reservation("", localDateTime50, localDateTime51, reservationStatus52, (double) 10L, equipment54, user55);
        reservation56.activate();
        main.enums.ReservationStatus reservationStatus58 = reservation56.getStatus();
        reservation46.setStatus(reservationStatus58);
        reservation32.setStatus(reservationStatus58);
        reservation19.setStatus(reservationStatus58);
        reservation7.setStatus(reservationStatus58);
        org.junit.Assert.assertNull(reservationStatus10);
        org.junit.Assert.assertNull(reservationStatus11);
        org.junit.Assert.assertNull(reservationStatus22);
        org.junit.Assert.assertTrue("'" + reservationStatus48 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus48.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus58 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus58.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test715");
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
        main.enums.ReservationStatus reservationStatus16 = reservation7.getStatus();
        double double17 = reservation7.getDepositAmount();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + reservationStatus16 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus16.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test716");
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
        main.enums.ReservationStatus reservationStatus18 = reservation7.getStatus();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test717");
        java.time.LocalDateTime localDateTime1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        main.enums.ReservationStatus reservationStatus3 = null;
        main.models.Equipment equipment5 = null;
        main.models.User user6 = null;
        main.models.Reservation reservation7 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus3, 0.0d, equipment5, user6);
        java.time.LocalDateTime localDateTime8 = reservation7.getStartTime();
        java.lang.String str9 = reservation7.getReservationId();
        main.models.User user10 = reservation7.getUser();
        org.junit.Assert.assertNull(localDateTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(user10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test718");
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
        java.time.LocalDateTime localDateTime60 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation7.extend(localDateTime60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertTrue("'" + reservationStatus35 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus35.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus45 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus45.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test719");
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
        java.time.LocalDateTime localDateTime42 = null;
        reservation7.setStartTime(localDateTime42);
        java.time.LocalDateTime localDateTime44 = null;
        reservation7.checkArrival(localDateTime44);
        org.junit.Assert.assertTrue("'" + reservationStatus23 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus23.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test720");
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
        main.models.Reservation reservation47 = new main.models.Reservation("hi!", localDateTime7, localDateTime8, reservationStatus34, (double) 100.0f, equipment45, user46);
        main.models.Equipment equipment49 = null;
        main.models.User user50 = null;
        main.models.Reservation reservation51 = new main.models.Reservation("", localDateTime4, localDateTime5, reservationStatus34, 10.0d, equipment49, user50);
        main.models.Equipment equipment53 = null;
        main.models.User user54 = null;
        main.models.Reservation reservation55 = new main.models.Reservation("", localDateTime1, localDateTime2, reservationStatus34, (double) (short) 10, equipment53, user54);
        org.junit.Assert.assertTrue("'" + reservationStatus24 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus24.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus34 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus34.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test721");
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
        main.enums.ReservationStatus reservationStatus19 = reservation10.getStatus();
        main.models.Equipment equipment21 = null;
        main.models.User user22 = null;
        main.models.Reservation reservation23 = new main.models.Reservation("hi!", localDateTime1, localDateTime2, reservationStatus19, (double) 0L, equipment21, user22);
        org.junit.Assert.assertNull(user12);
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus19 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus19.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test722");
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
        // The following exception was thrown during execution in test generation
        try {
            reservation41.extend(localDateTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus18 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus18.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus28 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus28.equals(main.enums.ReservationStatus.Active));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test723");
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
        main.models.Equipment equipment14 = reservation7.getEquipment();
        main.models.User user15 = reservation7.getUser();
        main.models.User user16 = null;
        reservation7.setUser(user16);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(reservationStatus13);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(user15);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test724");
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
        java.time.LocalDateTime localDateTime35 = null;
        java.time.LocalDateTime localDateTime36 = null;
        main.enums.ReservationStatus reservationStatus37 = null;
        main.models.Equipment equipment39 = null;
        main.models.User user40 = null;
        main.models.Reservation reservation41 = new main.models.Reservation("", localDateTime35, localDateTime36, reservationStatus37, (double) 10L, equipment39, user40);
        reservation41.activate();
        main.enums.ReservationStatus reservationStatus43 = reservation41.getStatus();
        reservation7.setStatus(reservationStatus43);
        main.models.Equipment equipment45 = reservation7.getEquipment();
        double double46 = reservation7.getDepositAmount();
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertTrue("'" + reservationStatus31 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus31.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus43 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus43.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment45);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test725");
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
        main.models.Equipment equipment44 = null;
        reservation42.setEquipment(equipment44);
        java.time.LocalDateTime localDateTime46 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservation42.extend(localDateTime46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: New end time must be after current end time.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test726");
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
        main.models.Equipment equipment45 = reservation42.getEquipment();
        org.junit.Assert.assertTrue("'" + reservationStatus26 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus26.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus36 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus36.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(equipment43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNull(equipment45);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test727");
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
        double double14 = reservation7.getDepositAmount();
        java.lang.String str15 = reservation7.getReservationId();
        java.time.LocalDateTime localDateTime16 = null;
        reservation7.checkArrival(localDateTime16);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test728");
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
        main.models.User user32 = reservation27.getUser();
        org.junit.Assert.assertTrue("'" + reservationStatus12 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus12.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertTrue("'" + reservationStatus22 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus22.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(user29);
        org.junit.Assert.assertNull(user32);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test729");
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
        java.time.LocalDateTime localDateTime41 = null;
        reservation7.checkArrival(localDateTime41);
        reservation7.setDepositAmount((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + reservationStatus33 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus33.equals(main.enums.ReservationStatus.Active));
        org.junit.Assert.assertNull(localDateTime36);
        org.junit.Assert.assertNull(localDateTime37);
        org.junit.Assert.assertNull(equipment38);
        org.junit.Assert.assertNull(equipment39);
        org.junit.Assert.assertTrue("'" + reservationStatus40 + "' != '" + main.enums.ReservationStatus.Active + "'", reservationStatus40.equals(main.enums.ReservationStatus.Active));
    }
}

