package test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CSVDatabaseManagerRandoopTest {

    public static boolean debug = false;

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        java.util.List<main.models.Reservation> reservationList24 = databaseProxy1.readReservations();
        java.util.List<main.models.User> userList25 = databaseProxy1.readUsers();
        java.util.List<main.models.Payment> paymentList26 = databaseProxy1.readPayments();
        java.util.List<main.models.Equipment> equipmentList27 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy29 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        main.models.Payment[] paymentArray30 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList31 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList31, paymentArray30);
        databaseProxy29.writePayments((java.util.List<main.models.Payment>) paymentList31);
        java.util.List<main.models.Reservation> reservationList34 = databaseProxy29.readReservations();
        databaseProxy1.writeReservations(reservationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList34);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.util.List<main.models.User> userList5 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray7 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList8 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList8, equipmentArray7);
        cSVDatabaseManager6.writeEquipment((java.util.List<main.models.Equipment>) equipmentList8);
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager6.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy22 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager21);
        main.models.Payment[] paymentArray23 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList24 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList24, paymentArray23);
        databaseProxy22.writePayments((java.util.List<main.models.Payment>) paymentList24);
        cSVDatabaseManager16.writePayments((java.util.List<main.models.Payment>) paymentList24);
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        java.util.List<main.models.Equipment> equipmentList33 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy35 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager34);
        main.models.Payment[] paymentArray36 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList37 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList37, paymentArray36);
        databaseProxy35.writePayments((java.util.List<main.models.Payment>) paymentList37);
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.Reservation[] reservationArray52 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList53 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList53, reservationArray52);
        cSVDatabaseManager47.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        cSVDatabaseManager42.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        databaseProxy41.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        databaseProxy35.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy3 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager2);
        main.models.CSVDatabaseManager cSVDatabaseManager4 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager4.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.Reservation[] reservationArray14 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList15 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList15, reservationArray14);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        cSVDatabaseManager4.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        databaseProxy3.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy26 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager25);
        main.models.Payment[] paymentArray27 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList28 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList28, paymentArray27);
        databaseProxy26.writePayments((java.util.List<main.models.Payment>) paymentList28);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList28);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        java.util.List<main.models.User> userList37 = databaseProxy36.readUsers();
        databaseProxy33.writeUsers(userList37);
        java.util.List<main.models.Equipment> equipmentList39 = databaseProxy33.readEquipment();
        java.util.List<main.models.Equipment> equipmentList40 = databaseProxy33.readEquipment();
        java.util.List<main.models.User> userList41 = databaseProxy33.readUsers();
        databaseProxy1.writeUsers(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        java.util.List<main.models.Reservation> reservationList6 = databaseProxy1.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager7);
        main.models.User[] userArray9 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList10 = new java.util.ArrayList<main.models.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList10, userArray9);
        cSVDatabaseManager7.writeUsers((java.util.List<main.models.User>) userList10);
        java.util.List<main.models.Payment> paymentList13 = cSVDatabaseManager7.readPayments();
        java.util.List<main.models.User> userList14 = cSVDatabaseManager7.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray16 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList17 = new java.util.ArrayList<main.models.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList17, userArray16);
        cSVDatabaseManager15.writeUsers((java.util.List<main.models.User>) userList17);
        cSVDatabaseManager7.writeUsers((java.util.List<main.models.User>) userList17);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList17);
        java.util.List<main.models.Reservation> reservationList22 = databaseProxy1.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        java.util.List<main.models.User> userList13 = databaseProxy12.readUsers();
        databaseProxy9.writeUsers(userList13);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        databaseProxy9.writeUsers(userList17);
        databaseProxy1.writeUsers(userList17);
        java.util.List<main.models.Payment> paymentList20 = databaseProxy1.readPayments();
        java.util.List<main.models.Payment> paymentList21 = databaseProxy1.readPayments();
        java.util.List<main.models.Equipment> equipmentList22 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList23 = databaseProxy1.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList23);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        main.models.Payment[] paymentArray14 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList15 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList15, paymentArray14);
        databaseProxy13.writePayments((java.util.List<main.models.Payment>) paymentList15);
        cSVDatabaseManager7.writePayments((java.util.List<main.models.Payment>) paymentList15);
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray24 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList25 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList25, equipmentArray24);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList25);
        main.models.Reservation[] reservationArray28 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList29 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList29, reservationArray28);
        cSVDatabaseManager23.writeReservations((java.util.List<main.models.Reservation>) reservationList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        java.util.List<main.models.User> userList38 = cSVDatabaseManager23.readUsers();
        java.util.List<main.models.Equipment> equipmentList39 = cSVDatabaseManager23.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray41 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList42 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList42, equipmentArray41);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
        main.models.Reservation[] reservationArray45 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList46 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList46, reservationArray45);
        cSVDatabaseManager40.writeReservations((java.util.List<main.models.Reservation>) reservationList46);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        java.util.List<main.models.User> userList58 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy60 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager59);
        main.models.User[] userArray61 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList62 = new java.util.ArrayList<main.models.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList62, userArray61);
        cSVDatabaseManager59.writeUsers((java.util.List<main.models.User>) userList62);
        java.util.List<main.models.Payment> paymentList65 = cSVDatabaseManager59.readPayments();
        java.util.List<main.models.User> userList66 = cSVDatabaseManager59.readUsers();
        java.util.List<main.models.Reservation> reservationList67 = cSVDatabaseManager59.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray69 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList70 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList70, equipmentArray69);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        main.models.CSVDatabaseManager cSVDatabaseManager73 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray74 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList75 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList75, equipmentArray74);
        cSVDatabaseManager73.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        main.models.Reservation[] reservationArray78 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList79 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList79, reservationArray78);
        cSVDatabaseManager73.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        cSVDatabaseManager68.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        java.util.List<main.models.Equipment> equipmentList83 = cSVDatabaseManager68.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager84 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy85 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager84);
        main.models.Payment[] paymentArray86 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList87 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList87, paymentArray86);
        databaseProxy85.writePayments((java.util.List<main.models.Payment>) paymentList87);
        java.util.List<main.models.Reservation> reservationList90 = databaseProxy85.readReservations();
        cSVDatabaseManager68.writeReservations(reservationList90);
        cSVDatabaseManager59.writeReservations(reservationList90);
        databaseProxy1.writeReservations(reservationList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList90);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = sensor18.getLastUpdateTime();
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "hi!", localDateTime23);
        sensor2.setLastUpdateTime(localDateTime23);
        java.time.LocalDateTime localDateTime26 = sensor2.getLastUpdateTime();
        java.lang.String str27 = sensor2.getSensorId();
        main.models.SystemAlert systemAlert28 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList29 = systemAlert28.getMessages();
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("", "hi!", localDateTime32);
        systemAlert28.update(usageData33);
        java.util.List<java.lang.String> strList35 = systemAlert28.getMessages();
        main.models.SystemAlert systemAlert36 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList37 = systemAlert36.getMessages();
        java.util.List<java.lang.String> strList38 = systemAlert36.getMessages();
        main.models.UsageLogger usageLogger39 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        usageLogger39.update(usageData43);
        systemAlert36.update(usageData43);
        systemAlert28.update(usageData43);
        java.util.List<java.lang.String> strList47 = systemAlert28.getMessages();
        sensor2.detach((main.models.Observer) systemAlert28);
        main.enums.SensorStatus sensorStatus49 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus49);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = sensor2.getStatus();
        main.models.SystemAlert systemAlert6 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList7 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList8 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert6.getMessages();
        sensor2.attach((main.models.Observer) systemAlert6);
        main.models.SystemAlert systemAlert11 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList12 = systemAlert11.getMessages();
        main.models.UsageLogger usageLogger13 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("hi!", "", localDateTime16);
        usageLogger13.update(usageData17);
        java.lang.String str19 = usageData17.getEquipmentId();
        java.lang.String str20 = usageData17.getEquipmentId();
        systemAlert11.update(usageData17);
        java.time.LocalDateTime localDateTime24 = null;
        main.models.UsageData usageData25 = new main.models.UsageData("", "", localDateTime24);
        systemAlert11.update(usageData25);
        sensor2.detach((main.models.Observer) systemAlert11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager5);
        main.models.Payment[] paymentArray7 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList8 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList8, paymentArray7);
        databaseProxy6.writePayments((java.util.List<main.models.Payment>) paymentList8);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList8);
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Reservation[] reservationArray21 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList22 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList22, reservationArray21);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        java.util.List<main.models.User> userList31 = cSVDatabaseManager16.readUsers();
        java.util.List<main.models.Equipment> equipmentList32 = cSVDatabaseManager16.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.Reservation[] reservationArray38 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList39 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList39, reservationArray38);
        cSVDatabaseManager33.writeReservations((java.util.List<main.models.Reservation>) reservationList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager0.readUsers();
        main.models.DatabaseProxy databaseProxy51 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList32 = cSVDatabaseManager17.readUsers();
        cSVDatabaseManager0.writeUsers(userList32);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy35 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager34);
        java.util.List<main.models.User> userList36 = databaseProxy35.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        java.util.List<main.models.User> userList39 = databaseProxy38.readUsers();
        databaseProxy35.writeUsers(userList39);
        java.util.List<main.models.Equipment> equipmentList41 = databaseProxy35.readEquipment();
        java.util.List<main.models.Equipment> equipmentList42 = databaseProxy35.readEquipment();
        java.util.List<main.models.User> userList43 = databaseProxy35.readUsers();
        cSVDatabaseManager0.writeUsers(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        java.util.List<main.models.User> userList13 = databaseProxy12.readUsers();
        databaseProxy9.writeUsers(userList13);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        databaseProxy9.writeUsers(userList17);
        databaseProxy1.writeUsers(userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Equipment[] equipmentArray25 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList26 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList26, equipmentArray25);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList26);
        java.util.List<main.models.User> userList29 = cSVDatabaseManager20.readUsers();
        databaseProxy1.writeUsers(userList29);
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.util.List<main.models.Equipment> equipmentList32 = databaseProxy31.readEquipment();
        java.util.List<main.models.Equipment> equipmentList33 = databaseProxy31.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList33);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList1 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList18 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.User> userList19 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray21 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList22 = new java.util.ArrayList<main.models.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList22, userArray21);
        cSVDatabaseManager20.writeUsers((java.util.List<main.models.User>) userList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.Reservation[] reservationArray30 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList31 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList31, reservationArray30);
        cSVDatabaseManager25.writeReservations((java.util.List<main.models.Reservation>) reservationList31);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        java.util.List<main.models.User> userList40 = cSVDatabaseManager25.readUsers();
        cSVDatabaseManager20.writeUsers(userList40);
        cSVDatabaseManager0.writeUsers(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList33 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        java.util.List<main.models.Payment> paymentList40 = cSVDatabaseManager0.readPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList40);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = null;
        sensor2.setStatus(sensorStatus5);
        main.enums.SensorStatus sensorStatus12 = null;
        main.models.Sensor sensor13 = new main.models.Sensor("hi!", sensorStatus12);
        sensor13.setSensorId("");
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("hi!", "", localDateTime18);
        java.lang.String str20 = usageData19.getEquipmentId();
        java.time.LocalDateTime localDateTime21 = usageData19.getRecordedAt();
        java.time.LocalDateTime localDateTime22 = usageData19.getRecordedAt();
        java.lang.String str23 = usageData19.getOperationStatus();
        sensor13.recordUsage(usageData19);
        main.enums.SensorStatus sensorStatus26 = null;
        main.models.Sensor sensor27 = new main.models.Sensor("hi!", sensorStatus26);
        sensor27.setSensorId("");
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        java.lang.String str34 = usageData33.getEquipmentId();
        java.time.LocalDateTime localDateTime35 = usageData33.getRecordedAt();
        java.time.LocalDateTime localDateTime36 = usageData33.getRecordedAt();
        java.lang.String str37 = usageData33.getOperationStatus();
        sensor27.recordUsage(usageData33);
        main.enums.SensorStatus sensorStatus40 = null;
        main.models.Sensor sensor41 = new main.models.Sensor("hi!", sensorStatus40);
        main.models.UsageLogger usageLogger42 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList43 = usageLogger42.getRecords();
        sensor41.attach((main.models.Observer) usageLogger42);
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("hi!", "", localDateTime47);
        java.lang.String str49 = usageData48.getEquipmentId();
        usageLogger42.update(usageData48);
        main.enums.SensorStatus sensorStatus52 = null;
        main.models.Sensor sensor53 = new main.models.Sensor("hi!", sensorStatus52);
        java.time.LocalDateTime localDateTime56 = null;
        main.models.UsageData usageData57 = new main.models.UsageData("hi!", "", localDateTime56);
        java.lang.String str58 = usageData57.getEquipmentId();
        sensor53.notifyObservers(usageData57);
        usageLogger42.update(usageData57);
        sensor27.attach((main.models.Observer) usageLogger42);
        java.util.List<main.models.UsageData> usageDataList62 = usageLogger42.getRecords();
        sensor13.attach((main.models.Observer) usageLogger42);
        main.enums.SensorStatus sensorStatus67 = null;
        main.models.Sensor sensor68 = new main.models.Sensor("hi!", sensorStatus67);
        sensor68.setSensorId("");
        sensor68.setSensorId("");
        java.time.LocalDateTime localDateTime73 = sensor68.getLastUpdateTime();
        main.models.UsageData usageData74 = new main.models.UsageData("", "hi!", localDateTime73);
        sensor13.setLastUpdateTime(localDateTime73);
        main.models.UsageData usageData76 = new main.models.UsageData("hi!", "hi!", localDateTime73);
        main.models.UsageData usageData77 = new main.models.UsageData("", "hi!", localDateTime73);
        sensor2.notifyObservers(usageData77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime73);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList8 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Reservation> reservationList9 = null;
        cSVDatabaseManager0.writeReservations(reservationList9);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.Payment[] paymentArray16 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList17 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList17, paymentArray16);
        cSVDatabaseManager11.writePayments((java.util.List<main.models.Payment>) paymentList17);
        java.util.List<main.models.Payment> paymentList20 = cSVDatabaseManager11.readPayments();
        java.util.List<main.models.User> userList21 = cSVDatabaseManager11.readUsers();
        cSVDatabaseManager0.writeUsers(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "", localDateTime11);
        sensor2.notifyObservers(usageData12);
        sensor2.setSensorId("hi!");
        sensor2.setSensorId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList18 = usageLogger17.getRecords();
        sensor16.attach((main.models.Observer) usageLogger17);
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        java.lang.String str24 = usageData23.getEquipmentId();
        usageLogger17.update(usageData23);
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("hi!", "", localDateTime28);
        usageLogger17.update(usageData29);
        sensor2.notifyObservers(usageData29);
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        sensor38.setSensorId("");
        java.time.LocalDateTime localDateTime43 = null;
        main.models.UsageData usageData44 = new main.models.UsageData("hi!", "", localDateTime43);
        java.lang.String str45 = usageData44.getEquipmentId();
        java.time.LocalDateTime localDateTime46 = usageData44.getRecordedAt();
        sensor38.recordUsage(usageData44);
        sensor38.setSensorId("hi!");
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("", "hi!", localDateTime52);
        sensor38.notifyObservers(usageData53);
        main.enums.SensorStatus sensorStatus55 = sensor38.getStatus();
        main.models.SystemAlert systemAlert56 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList57 = systemAlert56.getMessages();
        java.time.LocalDateTime localDateTime60 = null;
        main.models.UsageData usageData61 = new main.models.UsageData("", "hi!", localDateTime60);
        systemAlert56.update(usageData61);
        main.models.SystemAlert systemAlert63 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList64 = systemAlert63.getMessages();
        java.time.LocalDateTime localDateTime67 = null;
        main.models.UsageData usageData68 = new main.models.UsageData("", "hi!", localDateTime67);
        systemAlert63.update(usageData68);
        systemAlert56.update(usageData68);
        sensor38.detach((main.models.Observer) systemAlert56);
        main.enums.SensorStatus sensorStatus73 = null;
        main.models.Sensor sensor74 = new main.models.Sensor("hi!", sensorStatus73);
        sensor74.setSensorId("");
        java.lang.String str77 = sensor74.getSensorId();
        java.time.LocalDateTime localDateTime78 = sensor74.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus80 = null;
        main.models.Sensor sensor81 = new main.models.Sensor("hi!", sensorStatus80);
        sensor81.setSensorId("");
        java.lang.String str84 = sensor81.getSensorId();
        java.time.LocalDateTime localDateTime85 = sensor81.getLastUpdateTime();
        sensor74.setLastUpdateTime(localDateTime85);
        sensor38.setLastUpdateTime(localDateTime85);
        main.models.UsageData usageData88 = new main.models.UsageData("hi!", "", localDateTime85);
        main.models.UsageData usageData89 = new main.models.UsageData("", "hi!", localDateTime85);
        sensor2.notifyObservers(usageData89);
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime85);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager5);
        main.models.Payment[] paymentArray7 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList8 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList8, paymentArray7);
        databaseProxy6.writePayments((java.util.List<main.models.Payment>) paymentList8);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList8);
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Reservation[] reservationArray21 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList22 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList22, reservationArray21);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        java.util.List<main.models.User> userList31 = cSVDatabaseManager16.readUsers();
        java.util.List<main.models.Equipment> equipmentList32 = cSVDatabaseManager16.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.Reservation[] reservationArray38 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList39 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList39, reservationArray38);
        cSVDatabaseManager33.writeReservations((java.util.List<main.models.Reservation>) reservationList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        java.util.List<main.models.User> userList59 = cSVDatabaseManager50.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager60.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        main.models.Reservation[] reservationArray65 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList66 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList66, reservationArray65);
        cSVDatabaseManager60.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        java.util.List<main.models.User> userList69 = cSVDatabaseManager60.readUsers();
        main.models.DatabaseProxy databaseProxy70 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager60);
        java.util.List<main.models.User> userList71 = cSVDatabaseManager60.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray73 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList74 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList74, equipmentArray73);
        cSVDatabaseManager72.writeEquipment((java.util.List<main.models.Equipment>) equipmentList74);
        main.models.CSVDatabaseManager cSVDatabaseManager77 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray78 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList79 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList79, equipmentArray78);
        cSVDatabaseManager77.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        main.models.Reservation[] reservationArray82 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList83 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList83, reservationArray82);
        cSVDatabaseManager77.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        cSVDatabaseManager72.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        main.models.CSVDatabaseManager cSVDatabaseManager87 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy88 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager87);
        java.util.List<main.models.User> userList89 = databaseProxy88.readUsers();
        cSVDatabaseManager72.writeUsers(userList89);
        cSVDatabaseManager60.writeUsers(userList89);
        cSVDatabaseManager50.writeUsers(userList89);
        cSVDatabaseManager0.writeUsers(userList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList89);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime8 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
        main.models.SystemAlert systemAlert11 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList12 = systemAlert11.getMessages();
        java.util.List<java.lang.String> strList13 = systemAlert11.getMessages();
        java.util.List<java.lang.String> strList14 = systemAlert11.getMessages();
        main.enums.SensorStatus sensorStatus16 = null;
        main.models.Sensor sensor17 = new main.models.Sensor("hi!", sensorStatus16);
        main.models.UsageLogger usageLogger18 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList19 = usageLogger18.getRecords();
        sensor17.attach((main.models.Observer) usageLogger18);
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        usageLogger18.update(usageData24);
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("hi!", "", localDateTime29);
        usageLogger18.update(usageData30);
        systemAlert11.update(usageData30);
        sensor2.recordUsage(usageData30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = null;
        cSVDatabaseManager0.writeEquipment(equipmentList9);
        java.util.List<main.models.Payment> paymentList11 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray15 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList16 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList16, equipmentArray15);
        cSVDatabaseManager14.writeEquipment((java.util.List<main.models.Equipment>) equipmentList16);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        cSVDatabaseManager19.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        cSVDatabaseManager14.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        databaseProxy13.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        java.util.List<main.models.User> userList31 = cSVDatabaseManager0.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray16 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList17 = new java.util.ArrayList<main.models.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList17, userArray16);
        cSVDatabaseManager15.writeUsers((java.util.List<main.models.User>) userList17);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.Reservation[] reservationArray26 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList27 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList27, reservationArray26);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        java.util.List<main.models.User> userList40 = databaseProxy39.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy42 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager41);
        java.util.List<main.models.User> userList43 = databaseProxy42.readUsers();
        databaseProxy39.writeUsers(userList43);
        java.util.List<main.models.Equipment> equipmentList45 = databaseProxy39.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy49 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager48);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.Reservation[] reservationArray60 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList61 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList61, reservationArray60);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        cSVDatabaseManager50.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy49.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy47.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        databaseProxy47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy72 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager71);
        java.util.List<main.models.User> userList73 = databaseProxy72.readUsers();
        databaseProxy47.writeUsers(userList73);
        databaseProxy39.writeUsers(userList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray77 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList78 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList78, equipmentArray77);
        cSVDatabaseManager76.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        main.models.Reservation[] reservationArray81 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList82 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList82, reservationArray81);
        cSVDatabaseManager76.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        databaseProxy39.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        java.util.List<main.models.User> userList86 = databaseProxy39.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager87 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList88 = cSVDatabaseManager87.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager89 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy90 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager89);
        java.util.List<main.models.User> userList91 = databaseProxy90.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager92 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy93 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager92);
        java.util.List<main.models.User> userList94 = databaseProxy93.readUsers();
        databaseProxy90.writeUsers(userList94);
        cSVDatabaseManager87.writeUsers(userList94);
        databaseProxy39.writeUsers(userList94);
        databaseProxy37.writeUsers(userList94);
        java.util.List<main.models.User> userList99 = databaseProxy37.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        java.util.List<main.models.Reservation> reservationList24 = databaseProxy1.readReservations();
        java.util.List<main.models.User> userList25 = databaseProxy1.readUsers();
        java.util.List<main.models.Payment> paymentList26 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        main.models.Payment[] paymentArray34 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList35 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList35, paymentArray34);
        databaseProxy33.writePayments((java.util.List<main.models.Payment>) paymentList35);
        cSVDatabaseManager27.writePayments((java.util.List<main.models.Payment>) paymentList35);
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy45 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager44);
        java.util.List<main.models.User> userList46 = databaseProxy45.readUsers();
        java.util.List<main.models.Reservation> reservationList47 = databaseProxy45.readReservations();
        java.util.List<main.models.Payment> paymentList48 = databaseProxy45.readPayments();
        databaseProxy1.writePayments(paymentList48);
        java.util.List<main.models.Equipment> equipmentList50 = databaseProxy1.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList50);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        java.time.LocalDateTime localDateTime12 = usageData10.getRecordedAt();
        sensor4.recordUsage(usageData10);
        sensor4.setSensorId("");
        java.time.LocalDateTime localDateTime16 = sensor4.getLastUpdateTime();
        java.time.LocalDateTime localDateTime17 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData18 = new main.models.UsageData("", "", localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        usageLogger5.update(usageData9);
        sensor2.detach((main.models.Observer) usageLogger5);
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        usageLogger5.update(usageData15);
        java.util.List<main.models.UsageData> usageDataList18 = usageLogger5.getRecords();
        main.enums.SensorStatus sensorStatus20 = null;
        main.models.Sensor sensor21 = new main.models.Sensor("hi!", sensorStatus20);
        sensor21.setSensorId("");
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("hi!", "", localDateTime26);
        java.lang.String str28 = usageData27.getEquipmentId();
        java.time.LocalDateTime localDateTime29 = usageData27.getRecordedAt();
        sensor21.recordUsage(usageData27);
        usageLogger5.update(usageData27);
        java.lang.String str32 = usageData27.getOperationStatus();
        java.lang.String str33 = usageData27.getEquipmentId();
        java.time.LocalDateTime localDateTime34 = usageData27.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime34);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime14 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime15 = sensor2.getLastUpdateTime();
        main.models.SystemAlert systemAlert16 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList17 = systemAlert16.getMessages();
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("", "hi!", localDateTime20);
        systemAlert16.update(usageData21);
        main.models.SystemAlert systemAlert23 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList24 = systemAlert23.getMessages();
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("", "hi!", localDateTime27);
        systemAlert23.update(usageData28);
        systemAlert16.update(usageData28);
        java.util.List<java.lang.String> strList31 = systemAlert16.getMessages();
        sensor2.attach((main.models.Observer) systemAlert16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList31);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus8 = null;
        main.models.Sensor sensor9 = new main.models.Sensor("hi!", sensorStatus8);
        sensor9.setSensorId("");
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        java.time.LocalDateTime localDateTime17 = usageData15.getRecordedAt();
        sensor9.recordUsage(usageData15);
        sensor9.setSensorId("hi!");
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("", "hi!", localDateTime23);
        sensor9.notifyObservers(usageData24);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        main.models.UsageLogger usageLogger29 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList30 = usageLogger29.getRecords();
        sensor28.attach((main.models.Observer) usageLogger29);
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("hi!", "", localDateTime34);
        java.lang.String str36 = usageData35.getEquipmentId();
        usageLogger29.update(usageData35);
        java.time.LocalDateTime localDateTime40 = null;
        main.models.UsageData usageData41 = new main.models.UsageData("hi!", "", localDateTime40);
        usageLogger29.update(usageData41);
        sensor9.detach((main.models.Observer) usageLogger29);
        java.util.List<main.models.UsageData> usageDataList44 = usageLogger29.getRecords();
        main.models.UsageData usageData45 = null;
        usageLogger29.update(usageData45);
        sensor2.attach((main.models.Observer) usageLogger29);
        main.enums.SensorStatus sensorStatus49 = null;
        main.models.Sensor sensor50 = new main.models.Sensor("hi!", sensorStatus49);
        sensor50.setSensorId("");
        java.time.LocalDateTime localDateTime55 = null;
        main.models.UsageData usageData56 = new main.models.UsageData("hi!", "", localDateTime55);
        java.lang.String str57 = usageData56.getEquipmentId();
        java.time.LocalDateTime localDateTime58 = usageData56.getRecordedAt();
        sensor50.recordUsage(usageData56);
        sensor50.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus63 = null;
        main.models.Sensor sensor64 = new main.models.Sensor("hi!", sensorStatus63);
        main.models.UsageLogger usageLogger65 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList66 = usageLogger65.getRecords();
        sensor64.attach((main.models.Observer) usageLogger65);
        java.time.LocalDateTime localDateTime70 = null;
        main.models.UsageData usageData71 = new main.models.UsageData("hi!", "", localDateTime70);
        java.lang.String str72 = usageData71.getEquipmentId();
        usageLogger65.update(usageData71);
        java.time.LocalDateTime localDateTime76 = null;
        main.models.UsageData usageData77 = new main.models.UsageData("hi!", "", localDateTime76);
        usageLogger65.update(usageData77);
        sensor50.notifyObservers(usageData77);
        java.lang.String str80 = usageData77.getEquipmentId();
        sensor2.recordUsage(usageData77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        java.util.List<main.models.Reservation> reservationList9 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        cSVDatabaseManager15.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy27 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager26);
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy29 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        cSVDatabaseManager30.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        databaseProxy29.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        databaseProxy27.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        databaseProxy27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.CSVDatabaseManager cSVDatabaseManager56 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy57 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager56);
        main.models.Payment[] paymentArray58 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList59 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList59, paymentArray58);
        databaseProxy57.writePayments((java.util.List<main.models.Payment>) paymentList59);
        cSVDatabaseManager51.writePayments((java.util.List<main.models.Payment>) paymentList59);
        databaseProxy27.writePayments((java.util.List<main.models.Payment>) paymentList59);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList59);
        java.util.List<main.models.Reservation> reservationList65 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Payment> paymentList66 = cSVDatabaseManager0.readPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList66);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = null;
        cSVDatabaseManager0.writeEquipment(equipmentList9);
        java.util.List<main.models.Payment> paymentList11 = cSVDatabaseManager0.readPayments();
        java.lang.Class<?> wildcardClass12 = cSVDatabaseManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.lang.String str4 = usageData3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = usageData3.getRecordedAt();
        java.time.LocalDateTime localDateTime6 = usageData3.getRecordedAt();
        java.lang.String str7 = usageData3.getOperationStatus();
        java.lang.String str8 = usageData3.getEquipmentId();
        java.lang.String str9 = usageData3.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData3.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList18 = usageLogger17.getRecords();
        sensor16.attach((main.models.Observer) usageLogger17);
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        java.lang.String str24 = usageData23.getEquipmentId();
        usageLogger17.update(usageData23);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        java.time.LocalDateTime localDateTime31 = null;
        main.models.UsageData usageData32 = new main.models.UsageData("hi!", "", localDateTime31);
        java.lang.String str33 = usageData32.getEquipmentId();
        sensor28.notifyObservers(usageData32);
        usageLogger17.update(usageData32);
        sensor2.attach((main.models.Observer) usageLogger17);
        main.enums.SensorStatus sensorStatus38 = null;
        main.models.Sensor sensor39 = new main.models.Sensor("hi!", sensorStatus38);
        main.models.UsageLogger usageLogger40 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList41 = usageLogger40.getRecords();
        sensor39.attach((main.models.Observer) usageLogger40);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        usageLogger40.update(usageData46);
        main.enums.SensorStatus sensorStatus50 = null;
        main.models.Sensor sensor51 = new main.models.Sensor("hi!", sensorStatus50);
        java.time.LocalDateTime localDateTime54 = null;
        main.models.UsageData usageData55 = new main.models.UsageData("hi!", "", localDateTime54);
        java.lang.String str56 = usageData55.getEquipmentId();
        sensor51.notifyObservers(usageData55);
        usageLogger40.update(usageData55);
        sensor2.recordUsage(usageData55);
        java.time.LocalDateTime localDateTime60 = usageData55.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime60);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.util.List<main.models.User> userList5 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList7 = cSVDatabaseManager6.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList7);
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager10.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList17 = cSVDatabaseManager16.readReservations();
        cSVDatabaseManager10.writeReservations(reservationList17);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager19);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy22 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager21);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray24 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList25 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList25, equipmentArray24);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList25);
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.Reservation[] reservationArray33 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList34 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList34, reservationArray33);
        cSVDatabaseManager28.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        cSVDatabaseManager23.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        databaseProxy22.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        databaseProxy20.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        databaseProxy20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        java.util.List<main.models.Equipment> equipmentList44 = databaseProxy20.readEquipment();
        cSVDatabaseManager10.writeEquipment(equipmentList44);
        databaseProxy9.writeEquipment(equipmentList44);
        java.util.List<main.models.Reservation> reservationList47 = databaseProxy9.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList47);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "", localDateTime11);
        sensor2.notifyObservers(usageData12);
        main.models.SystemAlert systemAlert14 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList15 = systemAlert14.getMessages();
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("", "hi!", localDateTime18);
        systemAlert14.update(usageData19);
        java.util.List<java.lang.String> strList21 = systemAlert14.getMessages();
        main.models.SystemAlert systemAlert22 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList23 = systemAlert22.getMessages();
        java.util.List<java.lang.String> strList24 = systemAlert22.getMessages();
        main.models.UsageLogger usageLogger25 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("hi!", "", localDateTime28);
        usageLogger25.update(usageData29);
        systemAlert22.update(usageData29);
        systemAlert14.update(usageData29);
        sensor2.attach((main.models.Observer) systemAlert14);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("", "", localDateTime36);
        sensor2.recordUsage(usageData37);
        java.lang.String str39 = usageData37.getOperationStatus();
        java.lang.String str40 = usageData37.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime3 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Payment[] paymentArray5 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList6 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList6, paymentArray5);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList6);
        java.util.List<main.models.Payment> paymentList9 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList16);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray26 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList27 = new java.util.ArrayList<main.models.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList27, userArray26);
        cSVDatabaseManager25.writeUsers((java.util.List<main.models.User>) userList27);
        cSVDatabaseManager10.writeUsers((java.util.List<main.models.User>) userList27);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList27);
        java.util.List<main.models.User> userList32 = cSVDatabaseManager0.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        java.time.LocalDateTime localDateTime25 = usageData22.getRecordedAt();
        java.lang.String str26 = usageData22.getOperationStatus();
        sensor16.recordUsage(usageData22);
        main.enums.SensorStatus sensorStatus28 = sensor16.getStatus();
        main.enums.SensorStatus sensorStatus29 = sensor16.getStatus();
        java.time.LocalDateTime localDateTime30 = sensor16.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime30);
        java.time.LocalDateTime localDateTime32 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        java.time.LocalDateTime localDateTime25 = usageData22.getRecordedAt();
        java.lang.String str26 = usageData22.getOperationStatus();
        sensor16.recordUsage(usageData22);
        main.enums.SensorStatus sensorStatus29 = null;
        main.models.Sensor sensor30 = new main.models.Sensor("hi!", sensorStatus29);
        main.models.UsageLogger usageLogger31 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger31.getRecords();
        sensor30.attach((main.models.Observer) usageLogger31);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        java.lang.String str38 = usageData37.getEquipmentId();
        usageLogger31.update(usageData37);
        main.enums.SensorStatus sensorStatus41 = null;
        main.models.Sensor sensor42 = new main.models.Sensor("hi!", sensorStatus41);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        sensor42.notifyObservers(usageData46);
        usageLogger31.update(usageData46);
        sensor16.attach((main.models.Observer) usageLogger31);
        java.util.List<main.models.UsageData> usageDataList51 = usageLogger31.getRecords();
        sensor2.attach((main.models.Observer) usageLogger31);
        main.enums.SensorStatus sensorStatus56 = null;
        main.models.Sensor sensor57 = new main.models.Sensor("hi!", sensorStatus56);
        sensor57.setSensorId("");
        sensor57.setSensorId("");
        java.time.LocalDateTime localDateTime62 = sensor57.getLastUpdateTime();
        main.models.UsageData usageData63 = new main.models.UsageData("", "hi!", localDateTime62);
        sensor2.setLastUpdateTime(localDateTime62);
        java.time.LocalDateTime localDateTime67 = null;
        main.models.UsageData usageData68 = new main.models.UsageData("hi!", "", localDateTime67);
        java.time.LocalDateTime localDateTime69 = usageData68.getRecordedAt();
        sensor2.notifyObservers(usageData68);
        java.lang.String str71 = usageData68.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        usageLogger5.update(usageData9);
        sensor2.detach((main.models.Observer) usageLogger5);
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        java.time.LocalDateTime localDateTime17 = null;
        main.models.UsageData usageData18 = new main.models.UsageData("hi!", "", localDateTime17);
        java.lang.String str19 = usageData18.getEquipmentId();
        sensor14.notifyObservers(usageData18);
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("", "", localDateTime23);
        sensor14.notifyObservers(usageData24);
        sensor2.notifyObservers(usageData24);
        java.lang.String str27 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime28 = usageData24.getRecordedAt();
        java.lang.String str29 = usageData24.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy11 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager10);
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager12.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        databaseProxy11.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        databaseProxy9.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        databaseProxy9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
        java.util.List<main.models.User> userList35 = databaseProxy34.readUsers();
        databaseProxy9.writeUsers(userList35);
        databaseProxy1.writeUsers(userList35);
        java.util.List<main.models.Equipment> equipmentList38 = databaseProxy1.readEquipment();
        java.lang.Class<?> wildcardClass39 = databaseProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray6 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList7 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList7, equipmentArray6);
        cSVDatabaseManager5.writeEquipment((java.util.List<main.models.Equipment>) equipmentList7);
        main.models.Reservation[] reservationArray10 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList11 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList11, reservationArray10);
        cSVDatabaseManager5.writeReservations((java.util.List<main.models.Reservation>) reservationList11);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList11);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        cSVDatabaseManager0.writeUsers(userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager19);
        java.util.List<main.models.User> userList21 = databaseProxy20.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager22 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy23 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager22);
        java.util.List<main.models.User> userList24 = databaseProxy23.readUsers();
        databaseProxy20.writeUsers(userList24);
        java.util.List<main.models.Equipment> equipmentList26 = databaseProxy20.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager27);
        java.util.List<main.models.User> userList29 = databaseProxy28.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        java.util.List<main.models.User> userList32 = databaseProxy31.readUsers();
        databaseProxy28.writeUsers(userList32);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy35 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager34);
        java.util.List<main.models.User> userList36 = databaseProxy35.readUsers();
        databaseProxy28.writeUsers(userList36);
        databaseProxy20.writeUsers(userList36);
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        cSVDatabaseManager39.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager39.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        java.util.List<main.models.User> userList48 = cSVDatabaseManager39.readUsers();
        databaseProxy20.writeUsers(userList48);
        java.util.List<main.models.Payment> paymentList50 = databaseProxy20.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy52 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager51);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        main.models.Reservation[] reservationArray63 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList64 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList64, reservationArray63);
        cSVDatabaseManager58.writeReservations((java.util.List<main.models.Reservation>) reservationList64);
        cSVDatabaseManager53.writeReservations((java.util.List<main.models.Reservation>) reservationList64);
        databaseProxy52.writeReservations((java.util.List<main.models.Reservation>) reservationList64);
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        databaseProxy52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        java.util.List<main.models.Reservation> reservationList75 = databaseProxy52.readReservations();
        java.util.List<main.models.User> userList76 = databaseProxy52.readUsers();
        java.util.List<main.models.Payment> paymentList77 = databaseProxy52.readPayments();
        databaseProxy20.writePayments(paymentList77);
        java.util.List<main.models.User> userList79 = databaseProxy20.readUsers();
        cSVDatabaseManager0.writeUsers(userList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList79);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        main.models.UsageLogger usageLogger2 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        usageLogger2.update(usageData6);
        java.lang.String str8 = usageData6.getEquipmentId();
        java.lang.String str9 = usageData6.getEquipmentId();
        systemAlert0.update(usageData6);
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("", "", localDateTime13);
        systemAlert0.update(usageData14);
        java.lang.String str16 = usageData14.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        main.enums.SensorStatus sensorStatus7 = null;
        main.models.Sensor sensor8 = new main.models.Sensor("hi!", sensorStatus7);
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        java.lang.String str13 = usageData12.getEquipmentId();
        sensor8.notifyObservers(usageData12);
        main.enums.SensorStatus sensorStatus15 = sensor8.getStatus();
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = sensor20.getLastUpdateTime();
        main.models.UsageData usageData26 = new main.models.UsageData("", "hi!", localDateTime25);
        sensor8.setLastUpdateTime(localDateTime25);
        main.models.UsageData usageData28 = new main.models.UsageData("", "hi!", localDateTime25);
        main.models.UsageData usageData29 = new main.models.UsageData("", "hi!", localDateTime25);
        main.models.UsageData usageData30 = new main.models.UsageData("", "hi!", localDateTime25);
        java.time.LocalDateTime localDateTime31 = usageData30.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray16 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList17 = new java.util.ArrayList<main.models.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList17, userArray16);
        cSVDatabaseManager15.writeUsers((java.util.List<main.models.User>) userList17);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.Reservation[] reservationArray26 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList27 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList27, reservationArray26);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.Payment[] paymentArray42 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList43 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList43, paymentArray42);
        cSVDatabaseManager37.writePayments((java.util.List<main.models.Payment>) paymentList43);
        java.util.List<main.models.Payment> paymentList46 = cSVDatabaseManager37.readPayments();
        cSVDatabaseManager0.writePayments(paymentList46);
        java.util.List<main.models.Equipment> equipmentList48 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.User> userList49 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList50 = cSVDatabaseManager0.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList50);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        sensor6.setSensorId("");
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        java.lang.String str13 = usageData12.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = usageData12.getRecordedAt();
        sensor6.recordUsage(usageData12);
        sensor6.setSensorId("hi!");
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("", "hi!", localDateTime20);
        sensor6.notifyObservers(usageData21);
        main.enums.SensorStatus sensorStatus24 = null;
        main.models.Sensor sensor25 = new main.models.Sensor("hi!", sensorStatus24);
        main.models.UsageLogger usageLogger26 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList27 = usageLogger26.getRecords();
        sensor25.attach((main.models.Observer) usageLogger26);
        java.time.LocalDateTime localDateTime31 = null;
        main.models.UsageData usageData32 = new main.models.UsageData("hi!", "", localDateTime31);
        java.lang.String str33 = usageData32.getEquipmentId();
        usageLogger26.update(usageData32);
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("hi!", "", localDateTime37);
        usageLogger26.update(usageData38);
        sensor6.detach((main.models.Observer) usageLogger26);
        main.enums.SensorStatus sensorStatus41 = sensor6.getStatus();
        main.enums.SensorStatus sensorStatus43 = null;
        main.models.Sensor sensor44 = new main.models.Sensor("hi!", sensorStatus43);
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("hi!", "", localDateTime47);
        java.lang.String str49 = usageData48.getEquipmentId();
        sensor44.notifyObservers(usageData48);
        java.time.LocalDateTime localDateTime51 = sensor44.getLastUpdateTime();
        sensor6.setLastUpdateTime(localDateTime51);
        main.models.UsageData usageData53 = new main.models.UsageData("hi!", "", localDateTime51);
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "hi!", localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime51);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy11 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager10);
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager12.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        databaseProxy11.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        databaseProxy11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        java.util.List<main.models.Reservation> reservationList34 = databaseProxy11.readReservations();
        java.util.List<main.models.User> userList35 = databaseProxy11.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        main.models.Reservation[] reservationArray48 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList49 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList49, reservationArray48);
        cSVDatabaseManager43.writeReservations((java.util.List<main.models.Reservation>) reservationList49);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList49);
        databaseProxy37.writeReservations((java.util.List<main.models.Reservation>) reservationList49);
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy55 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager54);
        java.util.List<main.models.User> userList56 = databaseProxy55.readUsers();
        main.models.User[] userArray57 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList58 = new java.util.ArrayList<main.models.User>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList58, userArray57);
        databaseProxy55.writeUsers((java.util.List<main.models.User>) userList58);
        databaseProxy37.writeUsers((java.util.List<main.models.User>) userList58);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        java.util.List<main.models.User> userList64 = databaseProxy63.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager65 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy66 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager65);
        java.util.List<main.models.User> userList67 = databaseProxy66.readUsers();
        databaseProxy63.writeUsers(userList67);
        databaseProxy37.writeUsers(userList67);
        databaseProxy11.writeUsers(userList67);
        java.util.List<main.models.Equipment> equipmentList71 = databaseProxy11.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList71);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        java.util.List<main.models.Reservation> reservationList24 = databaseProxy1.readReservations();
        java.util.List<main.models.User> userList25 = databaseProxy1.readUsers();
        java.util.List<main.models.Payment> paymentList26 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        main.models.Payment[] paymentArray34 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList35 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList35, paymentArray34);
        databaseProxy33.writePayments((java.util.List<main.models.Payment>) paymentList35);
        cSVDatabaseManager27.writePayments((java.util.List<main.models.Payment>) paymentList35);
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy45 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager44);
        java.util.List<main.models.User> userList46 = databaseProxy45.readUsers();
        java.util.List<main.models.Reservation> reservationList47 = databaseProxy45.readReservations();
        java.util.List<main.models.Payment> paymentList48 = databaseProxy45.readPayments();
        databaseProxy1.writePayments(paymentList48);
        java.util.List<main.models.User> userList50 = databaseProxy1.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus6 = null;
        main.models.Sensor sensor7 = new main.models.Sensor("hi!", sensorStatus6);
        sensor7.setSensorId("");
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        java.lang.String str14 = usageData13.getEquipmentId();
        java.time.LocalDateTime localDateTime15 = usageData13.getRecordedAt();
        java.time.LocalDateTime localDateTime16 = usageData13.getRecordedAt();
        java.lang.String str17 = usageData13.getOperationStatus();
        sensor7.recordUsage(usageData13);
        main.enums.SensorStatus sensorStatus20 = null;
        main.models.Sensor sensor21 = new main.models.Sensor("hi!", sensorStatus20);
        main.models.UsageLogger usageLogger22 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList23 = usageLogger22.getRecords();
        sensor21.attach((main.models.Observer) usageLogger22);
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("hi!", "", localDateTime27);
        java.lang.String str29 = usageData28.getEquipmentId();
        usageLogger22.update(usageData28);
        main.enums.SensorStatus sensorStatus32 = null;
        main.models.Sensor sensor33 = new main.models.Sensor("hi!", sensorStatus32);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        java.lang.String str38 = usageData37.getEquipmentId();
        sensor33.notifyObservers(usageData37);
        usageLogger22.update(usageData37);
        sensor7.attach((main.models.Observer) usageLogger22);
        main.enums.SensorStatus sensorStatus43 = null;
        main.models.Sensor sensor44 = new main.models.Sensor("hi!", sensorStatus43);
        main.models.UsageLogger usageLogger45 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList46 = usageLogger45.getRecords();
        sensor44.attach((main.models.Observer) usageLogger45);
        java.time.LocalDateTime localDateTime50 = null;
        main.models.UsageData usageData51 = new main.models.UsageData("hi!", "", localDateTime50);
        java.lang.String str52 = usageData51.getEquipmentId();
        usageLogger45.update(usageData51);
        main.enums.SensorStatus sensorStatus55 = null;
        main.models.Sensor sensor56 = new main.models.Sensor("hi!", sensorStatus55);
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        java.lang.String str61 = usageData60.getEquipmentId();
        sensor56.notifyObservers(usageData60);
        usageLogger45.update(usageData60);
        sensor7.recordUsage(usageData60);
        sensor2.recordUsage(usageData60);
        main.enums.SensorStatus sensorStatus67 = null;
        main.models.Sensor sensor68 = new main.models.Sensor("hi!", sensorStatus67);
        main.enums.SensorStatus sensorStatus69 = null;
        sensor68.setStatus(sensorStatus69);
        main.models.UsageLogger usageLogger71 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("hi!", "", localDateTime74);
        usageLogger71.update(usageData75);
        sensor68.detach((main.models.Observer) usageLogger71);
        sensor2.attach((main.models.Observer) usageLogger71);
        java.time.LocalDateTime localDateTime79 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime79);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        sensor16.recordUsage(usageData22);
        sensor16.setSensorId("hi!");
        java.time.LocalDateTime localDateTime30 = null;
        main.models.UsageData usageData31 = new main.models.UsageData("", "hi!", localDateTime30);
        sensor16.notifyObservers(usageData31);
        main.enums.SensorStatus sensorStatus34 = null;
        main.models.Sensor sensor35 = new main.models.Sensor("hi!", sensorStatus34);
        main.models.UsageLogger usageLogger36 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList37 = usageLogger36.getRecords();
        sensor35.attach((main.models.Observer) usageLogger36);
        java.time.LocalDateTime localDateTime41 = null;
        main.models.UsageData usageData42 = new main.models.UsageData("hi!", "", localDateTime41);
        java.lang.String str43 = usageData42.getEquipmentId();
        usageLogger36.update(usageData42);
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("hi!", "", localDateTime47);
        usageLogger36.update(usageData48);
        sensor16.detach((main.models.Observer) usageLogger36);
        sensor2.attach((main.models.Observer) usageLogger36);
        java.util.List<main.models.UsageData> usageDataList52 = usageLogger36.getRecords();
        main.enums.SensorStatus sensorStatus54 = null;
        main.models.Sensor sensor55 = new main.models.Sensor("hi!", sensorStatus54);
        main.models.UsageLogger usageLogger56 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList57 = usageLogger56.getRecords();
        sensor55.attach((main.models.Observer) usageLogger56);
        java.time.LocalDateTime localDateTime61 = null;
        main.models.UsageData usageData62 = new main.models.UsageData("hi!", "", localDateTime61);
        java.lang.String str63 = usageData62.getEquipmentId();
        usageLogger56.update(usageData62);
        main.enums.SensorStatus sensorStatus66 = null;
        main.models.Sensor sensor67 = new main.models.Sensor("hi!", sensorStatus66);
        java.time.LocalDateTime localDateTime70 = null;
        main.models.UsageData usageData71 = new main.models.UsageData("hi!", "", localDateTime70);
        java.lang.String str72 = usageData71.getEquipmentId();
        sensor67.notifyObservers(usageData71);
        usageLogger56.update(usageData71);
        usageLogger36.update(usageData71);
        java.lang.String str76 = usageData71.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = null;
        cSVDatabaseManager0.writeEquipment(equipmentList9);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy14 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager13);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Reservation[] reservationArray25 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList26 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList26, reservationArray25);
        cSVDatabaseManager20.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        cSVDatabaseManager15.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        databaseProxy14.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        databaseProxy12.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        main.models.Equipment[] equipmentArray32 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList33 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList33, equipmentArray32);
        databaseProxy12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        main.models.Reservation[] reservationArray41 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList42 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList42, reservationArray41);
        cSVDatabaseManager36.writeReservations((java.util.List<main.models.Reservation>) reservationList42);
        main.models.CSVDatabaseManager cSVDatabaseManager45 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager45.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        java.util.List<main.models.User> userList51 = cSVDatabaseManager36.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray53 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList54 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList54, equipmentArray53);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        main.models.Reservation[] reservationArray57 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList58 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList58, reservationArray57);
        cSVDatabaseManager52.writeReservations((java.util.List<main.models.Reservation>) reservationList58);
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        java.util.List<main.models.User> userList67 = cSVDatabaseManager52.readUsers();
        java.util.List<main.models.Equipment> equipmentList68 = cSVDatabaseManager52.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        main.models.Reservation[] reservationArray74 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList75 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList75, reservationArray74);
        cSVDatabaseManager69.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray79 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList80 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList80, equipmentArray79);
        cSVDatabaseManager78.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        databaseProxy12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("", "hi!", localDateTime16);
        sensor2.notifyObservers(usageData17);
        main.enums.SensorStatus sensorStatus20 = null;
        main.models.Sensor sensor21 = new main.models.Sensor("hi!", sensorStatus20);
        main.models.UsageLogger usageLogger22 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList23 = usageLogger22.getRecords();
        sensor21.attach((main.models.Observer) usageLogger22);
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("hi!", "", localDateTime27);
        java.lang.String str29 = usageData28.getEquipmentId();
        usageLogger22.update(usageData28);
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("hi!", "", localDateTime33);
        usageLogger22.update(usageData34);
        sensor2.detach((main.models.Observer) usageLogger22);
        java.util.List<main.models.UsageData> usageDataList37 = usageLogger22.getRecords();
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        main.enums.SensorStatus sensorStatus41 = null;
        sensor40.setStatus(sensorStatus41);
        main.enums.SensorStatus sensorStatus44 = null;
        main.models.Sensor sensor45 = new main.models.Sensor("hi!", sensorStatus44);
        sensor45.setSensorId("");
        java.time.LocalDateTime localDateTime50 = null;
        main.models.UsageData usageData51 = new main.models.UsageData("hi!", "", localDateTime50);
        java.lang.String str52 = usageData51.getEquipmentId();
        java.time.LocalDateTime localDateTime53 = usageData51.getRecordedAt();
        java.time.LocalDateTime localDateTime54 = usageData51.getRecordedAt();
        java.lang.String str55 = usageData51.getOperationStatus();
        sensor45.recordUsage(usageData51);
        java.lang.String str57 = sensor45.getSensorId();
        main.enums.SensorStatus sensorStatus59 = null;
        main.models.Sensor sensor60 = new main.models.Sensor("hi!", sensorStatus59);
        main.models.UsageLogger usageLogger61 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList62 = usageLogger61.getRecords();
        sensor60.attach((main.models.Observer) usageLogger61);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        usageLogger61.update(usageData67);
        java.time.LocalDateTime localDateTime72 = null;
        main.models.UsageData usageData73 = new main.models.UsageData("hi!", "", localDateTime72);
        usageLogger61.update(usageData73);
        java.util.List<main.models.UsageData> usageDataList75 = usageLogger61.getRecords();
        sensor45.attach((main.models.Observer) usageLogger61);
        sensor40.detach((main.models.Observer) usageLogger61);
        main.models.UsageLogger usageLogger78 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime81 = null;
        main.models.UsageData usageData82 = new main.models.UsageData("hi!", "", localDateTime81);
        usageLogger78.update(usageData82);
        main.models.SystemAlert systemAlert84 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList85 = systemAlert84.getMessages();
        java.time.LocalDateTime localDateTime88 = null;
        main.models.UsageData usageData89 = new main.models.UsageData("", "hi!", localDateTime88);
        systemAlert84.update(usageData89);
        usageLogger78.update(usageData89);
        sensor40.notifyObservers(usageData89);
        usageLogger22.update(usageData89);
        java.lang.Class<?> wildcardClass94 = usageData89.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.lang.String str4 = usageData3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = usageData3.getRecordedAt();
        java.time.LocalDateTime localDateTime6 = usageData3.getRecordedAt();
        java.lang.String str7 = usageData3.getOperationStatus();
        java.time.LocalDateTime localDateTime8 = usageData3.getRecordedAt();
        java.time.LocalDateTime localDateTime9 = usageData3.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager5);
        main.models.Payment[] paymentArray7 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList8 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList8, paymentArray7);
        databaseProxy6.writePayments((java.util.List<main.models.Payment>) paymentList8);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList8);
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Reservation[] reservationArray21 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList22 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList22, reservationArray21);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        java.util.List<main.models.User> userList31 = cSVDatabaseManager16.readUsers();
        java.util.List<main.models.Equipment> equipmentList32 = cSVDatabaseManager16.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.Reservation[] reservationArray38 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList39 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList39, reservationArray38);
        cSVDatabaseManager33.writeReservations((java.util.List<main.models.Reservation>) reservationList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList51 = cSVDatabaseManager0.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList51);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Equipment> equipmentList2 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList3 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList4 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray6 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList7 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList7, equipmentArray6);
        cSVDatabaseManager5.writeEquipment((java.util.List<main.models.Equipment>) equipmentList7);
        main.models.Payment[] paymentArray10 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList11 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList11, paymentArray10);
        cSVDatabaseManager5.writePayments((java.util.List<main.models.Payment>) paymentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy15 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager14);
        java.util.List<main.models.User> userList16 = databaseProxy15.readUsers();
        java.util.List<main.models.Reservation> reservationList17 = databaseProxy15.readReservations();
        cSVDatabaseManager5.writeReservations(reservationList17);
        databaseProxy1.writeReservations(reservationList17);
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Equipment[] equipmentArray25 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList26 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList26, equipmentArray25);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList26);
        java.util.List<main.models.Reservation> reservationList29 = cSVDatabaseManager20.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        cSVDatabaseManager30.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        cSVDatabaseManager20.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy49 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager48);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.Reservation[] reservationArray60 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList61 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList61, reservationArray60);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        cSVDatabaseManager50.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy49.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy47.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        databaseProxy47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray72 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList73 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList73, equipmentArray72);
        cSVDatabaseManager71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy77 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager76);
        main.models.Payment[] paymentArray78 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList79 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList79, paymentArray78);
        databaseProxy77.writePayments((java.util.List<main.models.Payment>) paymentList79);
        cSVDatabaseManager71.writePayments((java.util.List<main.models.Payment>) paymentList79);
        databaseProxy47.writePayments((java.util.List<main.models.Payment>) paymentList79);
        cSVDatabaseManager20.writePayments((java.util.List<main.models.Payment>) paymentList79);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.enums.SensorStatus sensorStatus6 = null;
        main.models.Sensor sensor7 = new main.models.Sensor("hi!", sensorStatus6);
        sensor7.setSensorId("");
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        java.lang.String str14 = usageData13.getEquipmentId();
        java.time.LocalDateTime localDateTime15 = usageData13.getRecordedAt();
        java.time.LocalDateTime localDateTime16 = usageData13.getRecordedAt();
        java.lang.String str17 = usageData13.getOperationStatus();
        sensor7.recordUsage(usageData13);
        java.lang.String str19 = sensor7.getSensorId();
        main.enums.SensorStatus sensorStatus21 = null;
        main.models.Sensor sensor22 = new main.models.Sensor("hi!", sensorStatus21);
        main.models.UsageLogger usageLogger23 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList24 = usageLogger23.getRecords();
        sensor22.attach((main.models.Observer) usageLogger23);
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("hi!", "", localDateTime28);
        java.lang.String str30 = usageData29.getEquipmentId();
        usageLogger23.update(usageData29);
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("hi!", "", localDateTime34);
        usageLogger23.update(usageData35);
        java.util.List<main.models.UsageData> usageDataList37 = usageLogger23.getRecords();
        sensor7.attach((main.models.Observer) usageLogger23);
        sensor2.detach((main.models.Observer) usageLogger23);
        main.models.UsageLogger usageLogger40 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime43 = null;
        main.models.UsageData usageData44 = new main.models.UsageData("hi!", "", localDateTime43);
        usageLogger40.update(usageData44);
        main.models.SystemAlert systemAlert46 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList47 = systemAlert46.getMessages();
        java.time.LocalDateTime localDateTime50 = null;
        main.models.UsageData usageData51 = new main.models.UsageData("", "hi!", localDateTime50);
        systemAlert46.update(usageData51);
        usageLogger40.update(usageData51);
        sensor2.notifyObservers(usageData51);
        java.lang.String str55 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus56 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus56);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        java.time.LocalDateTime localDateTime25 = usageData22.getRecordedAt();
        java.lang.String str26 = usageData22.getOperationStatus();
        sensor16.recordUsage(usageData22);
        main.enums.SensorStatus sensorStatus29 = null;
        main.models.Sensor sensor30 = new main.models.Sensor("hi!", sensorStatus29);
        main.models.UsageLogger usageLogger31 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger31.getRecords();
        sensor30.attach((main.models.Observer) usageLogger31);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        java.lang.String str38 = usageData37.getEquipmentId();
        usageLogger31.update(usageData37);
        main.enums.SensorStatus sensorStatus41 = null;
        main.models.Sensor sensor42 = new main.models.Sensor("hi!", sensorStatus41);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        sensor42.notifyObservers(usageData46);
        usageLogger31.update(usageData46);
        sensor16.attach((main.models.Observer) usageLogger31);
        java.util.List<main.models.UsageData> usageDataList51 = usageLogger31.getRecords();
        sensor2.attach((main.models.Observer) usageLogger31);
        java.time.LocalDateTime localDateTime53 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus55 = null;
        main.models.Sensor sensor56 = new main.models.Sensor("hi!", sensorStatus55);
        main.models.UsageLogger usageLogger57 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList58 = usageLogger57.getRecords();
        sensor56.attach((main.models.Observer) usageLogger57);
        java.time.LocalDateTime localDateTime62 = null;
        main.models.UsageData usageData63 = new main.models.UsageData("hi!", "", localDateTime62);
        java.lang.String str64 = usageData63.getEquipmentId();
        usageLogger57.update(usageData63);
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        usageLogger57.update(usageData69);
        sensor2.notifyObservers(usageData69);
        java.lang.String str72 = usageData69.getOperationStatus();
        java.time.LocalDateTime localDateTime73 = usageData69.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime73);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray16 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList17 = new java.util.ArrayList<main.models.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList17, userArray16);
        cSVDatabaseManager15.writeUsers((java.util.List<main.models.User>) userList17);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.Reservation[] reservationArray26 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList27 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList27, reservationArray26);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        java.util.List<main.models.User> userList40 = databaseProxy39.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy42 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager41);
        java.util.List<main.models.User> userList43 = databaseProxy42.readUsers();
        databaseProxy39.writeUsers(userList43);
        java.util.List<main.models.Equipment> equipmentList45 = databaseProxy39.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy49 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager48);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.Reservation[] reservationArray60 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList61 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList61, reservationArray60);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        cSVDatabaseManager50.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy49.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        databaseProxy47.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        databaseProxy47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy72 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager71);
        java.util.List<main.models.User> userList73 = databaseProxy72.readUsers();
        databaseProxy47.writeUsers(userList73);
        databaseProxy39.writeUsers(userList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray77 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList78 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList78, equipmentArray77);
        cSVDatabaseManager76.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        main.models.Reservation[] reservationArray81 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList82 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList82, reservationArray81);
        cSVDatabaseManager76.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        databaseProxy39.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        java.util.List<main.models.User> userList86 = databaseProxy39.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager87 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList88 = cSVDatabaseManager87.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager89 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy90 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager89);
        java.util.List<main.models.User> userList91 = databaseProxy90.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager92 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy93 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager92);
        java.util.List<main.models.User> userList94 = databaseProxy93.readUsers();
        databaseProxy90.writeUsers(userList94);
        cSVDatabaseManager87.writeUsers(userList94);
        databaseProxy39.writeUsers(userList94);
        databaseProxy37.writeUsers(userList94);
        java.util.List<main.models.Equipment> equipmentList99 = databaseProxy37.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList99);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime6 = null;
        main.models.UsageData usageData7 = new main.models.UsageData("hi!", "", localDateTime6);
        usageLogger3.update(usageData7);
        systemAlert0.update(usageData7);
        main.models.UsageLogger usageLogger10 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("hi!", "", localDateTime13);
        usageLogger10.update(usageData14);
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime26 = usageData24.getRecordedAt();
        sensor18.recordUsage(usageData24);
        sensor18.setSensorId("hi!");
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("", "hi!", localDateTime32);
        sensor18.notifyObservers(usageData33);
        usageLogger10.update(usageData33);
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        main.enums.SensorStatus sensorStatus39 = null;
        sensor38.setStatus(sensorStatus39);
        main.models.UsageLogger usageLogger41 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime44 = null;
        main.models.UsageData usageData45 = new main.models.UsageData("hi!", "", localDateTime44);
        usageLogger41.update(usageData45);
        sensor38.detach((main.models.Observer) usageLogger41);
        main.enums.SensorStatus sensorStatus49 = null;
        main.models.Sensor sensor50 = new main.models.Sensor("hi!", sensorStatus49);
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        sensor50.notifyObservers(usageData54);
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("", "", localDateTime59);
        sensor50.notifyObservers(usageData60);
        sensor38.notifyObservers(usageData60);
        java.lang.String str63 = usageData60.getEquipmentId();
        usageLogger10.update(usageData60);
        systemAlert0.update(usageData60);
        java.util.List<java.lang.String> strList66 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList66);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = sensor2.getStatus();
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime14 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime15 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime26 = usageData24.getRecordedAt();
        sensor18.recordUsage(usageData24);
        sensor18.setSensorId("hi!");
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("", "hi!", localDateTime32);
        sensor18.notifyObservers(usageData33);
        main.enums.SensorStatus sensorStatus36 = null;
        main.models.Sensor sensor37 = new main.models.Sensor("hi!", sensorStatus36);
        main.models.UsageLogger usageLogger38 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList39 = usageLogger38.getRecords();
        sensor37.attach((main.models.Observer) usageLogger38);
        java.time.LocalDateTime localDateTime43 = null;
        main.models.UsageData usageData44 = new main.models.UsageData("hi!", "", localDateTime43);
        java.lang.String str45 = usageData44.getEquipmentId();
        usageLogger38.update(usageData44);
        java.time.LocalDateTime localDateTime49 = null;
        main.models.UsageData usageData50 = new main.models.UsageData("hi!", "", localDateTime49);
        usageLogger38.update(usageData50);
        sensor18.detach((main.models.Observer) usageLogger38);
        main.enums.SensorStatus sensorStatus53 = sensor18.getStatus();
        main.enums.SensorStatus sensorStatus55 = null;
        main.models.Sensor sensor56 = new main.models.Sensor("hi!", sensorStatus55);
        main.models.SystemAlert systemAlert57 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList58 = systemAlert57.getMessages();
        java.time.LocalDateTime localDateTime61 = null;
        main.models.UsageData usageData62 = new main.models.UsageData("", "hi!", localDateTime61);
        systemAlert57.update(usageData62);
        sensor56.notifyObservers(usageData62);
        sensor18.notifyObservers(usageData62);
        java.lang.String str66 = usageData62.getOperationStatus();
        sensor2.notifyObservers(usageData62);
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy19 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager18);
        java.util.List<main.models.User> userList20 = databaseProxy19.readUsers();
        main.models.User[] userArray21 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList22 = new java.util.ArrayList<main.models.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList22, userArray21);
        databaseProxy19.writeUsers((java.util.List<main.models.User>) userList22);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList22);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy27 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager26);
        main.models.User[] userArray28 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList29 = new java.util.ArrayList<main.models.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList29, userArray28);
        cSVDatabaseManager26.writeUsers((java.util.List<main.models.User>) userList29);
        java.util.List<main.models.Payment> paymentList32 = cSVDatabaseManager26.readPayments();
        databaseProxy1.writePayments(paymentList32);
        java.util.List<main.models.User> userList34 = null;
        databaseProxy1.writeUsers(userList34);
        java.util.List<main.models.Payment> paymentList36 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        java.util.List<main.models.Reservation> reservationList46 = cSVDatabaseManager37.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray53 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList54 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList54, equipmentArray53);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        main.models.Reservation[] reservationArray57 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList58 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList58, reservationArray57);
        cSVDatabaseManager52.writeReservations((java.util.List<main.models.Reservation>) reservationList58);
        cSVDatabaseManager47.writeReservations((java.util.List<main.models.Reservation>) reservationList58);
        cSVDatabaseManager37.writeReservations((java.util.List<main.models.Reservation>) reservationList58);
        java.util.List<main.models.Equipment> equipmentList63 = cSVDatabaseManager37.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy65 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager64);
        java.util.List<main.models.User> userList66 = databaseProxy65.readUsers();
        java.util.List<main.models.Reservation> reservationList67 = databaseProxy65.readReservations();
        cSVDatabaseManager37.writeReservations(reservationList67);
        databaseProxy1.writeReservations(reservationList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList67);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.User[] userArray3 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList4 = new java.util.ArrayList<main.models.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList4, userArray3);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Payment[] paymentArray12 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList13 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList13, paymentArray12);
        cSVDatabaseManager7.writePayments((java.util.List<main.models.Payment>) paymentList13);
        java.util.List<main.models.Payment> paymentList16 = cSVDatabaseManager7.readPayments();
        databaseProxy1.writePayments(paymentList16);
        java.util.List<main.models.Equipment> equipmentList18 = databaseProxy1.readEquipment();
        java.util.List<main.models.User> userList19 = databaseProxy1.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.User> userList9 = cSVDatabaseManager0.readUsers();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.DatabaseProxy databaseProxy11 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy10);
        java.util.List<main.models.Equipment> equipmentList12 = databaseProxy10.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        main.models.UsageLogger usageLogger2 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        usageLogger2.update(usageData6);
        java.lang.String str8 = usageData6.getEquipmentId();
        java.lang.String str9 = usageData6.getEquipmentId();
        systemAlert0.update(usageData6);
        java.lang.String str11 = usageData6.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        java.time.LocalDateTime localDateTime25 = usageData22.getRecordedAt();
        java.lang.String str26 = usageData22.getOperationStatus();
        sensor16.recordUsage(usageData22);
        main.enums.SensorStatus sensorStatus29 = null;
        main.models.Sensor sensor30 = new main.models.Sensor("hi!", sensorStatus29);
        main.models.UsageLogger usageLogger31 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger31.getRecords();
        sensor30.attach((main.models.Observer) usageLogger31);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        java.lang.String str38 = usageData37.getEquipmentId();
        usageLogger31.update(usageData37);
        main.enums.SensorStatus sensorStatus41 = null;
        main.models.Sensor sensor42 = new main.models.Sensor("hi!", sensorStatus41);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        sensor42.notifyObservers(usageData46);
        usageLogger31.update(usageData46);
        sensor16.attach((main.models.Observer) usageLogger31);
        java.util.List<main.models.UsageData> usageDataList51 = usageLogger31.getRecords();
        sensor2.attach((main.models.Observer) usageLogger31);
        main.enums.SensorStatus sensorStatus56 = null;
        main.models.Sensor sensor57 = new main.models.Sensor("hi!", sensorStatus56);
        sensor57.setSensorId("");
        sensor57.setSensorId("");
        java.time.LocalDateTime localDateTime62 = sensor57.getLastUpdateTime();
        main.models.UsageData usageData63 = new main.models.UsageData("", "hi!", localDateTime62);
        sensor2.setLastUpdateTime(localDateTime62);
        main.enums.SensorStatus sensorStatus66 = null;
        main.models.Sensor sensor67 = new main.models.Sensor("hi!", sensorStatus66);
        main.enums.SensorStatus sensorStatus68 = null;
        sensor67.setStatus(sensorStatus68);
        main.models.UsageLogger usageLogger70 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime73 = null;
        main.models.UsageData usageData74 = new main.models.UsageData("hi!", "", localDateTime73);
        usageLogger70.update(usageData74);
        sensor67.detach((main.models.Observer) usageLogger70);
        java.time.LocalDateTime localDateTime79 = null;
        main.models.UsageData usageData80 = new main.models.UsageData("hi!", "", localDateTime79);
        java.lang.String str81 = usageData80.getEquipmentId();
        usageLogger70.update(usageData80);
        sensor2.recordUsage(usageData80);
        main.enums.SensorStatus sensorStatus84 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus84);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        java.lang.String str14 = usageData13.getEquipmentId();
        java.time.LocalDateTime localDateTime15 = usageData13.getRecordedAt();
        java.time.LocalDateTime localDateTime16 = usageData13.getRecordedAt();
        java.lang.String str17 = usageData13.getOperationStatus();
        sensor2.recordUsage(usageData13);
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "hi!", localDateTime21);
        sensor2.recordUsage(usageData22);
        java.lang.String str24 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList1 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.Reservation[] reservationArray12 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList13 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList13, reservationArray12);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList13);
        java.util.List<main.models.Reservation> reservationList18 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        cSVDatabaseManager19.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        java.util.List<main.models.User> userList34 = cSVDatabaseManager19.readUsers();
        java.util.List<main.models.Equipment> equipmentList35 = cSVDatabaseManager19.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        main.models.Reservation[] reservationArray41 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList42 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList42, reservationArray41);
        cSVDatabaseManager36.writeReservations((java.util.List<main.models.Reservation>) reservationList42);
        main.models.CSVDatabaseManager cSVDatabaseManager45 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager45.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        java.util.List<main.models.Payment> paymentList52 = cSVDatabaseManager19.readPayments();
        cSVDatabaseManager0.writePayments(paymentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList52);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime3 = null;
        main.models.UsageData usageData4 = new main.models.UsageData("hi!", "", localDateTime3);
        usageLogger0.update(usageData4);
        main.enums.SensorStatus sensorStatus7 = null;
        main.models.Sensor sensor8 = new main.models.Sensor("hi!", sensorStatus7);
        sensor8.setSensorId("");
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("hi!", "", localDateTime13);
        java.lang.String str15 = usageData14.getEquipmentId();
        java.time.LocalDateTime localDateTime16 = usageData14.getRecordedAt();
        sensor8.recordUsage(usageData14);
        sensor8.setSensorId("hi!");
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("", "hi!", localDateTime22);
        sensor8.notifyObservers(usageData23);
        usageLogger0.update(usageData23);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        main.enums.SensorStatus sensorStatus29 = null;
        sensor28.setStatus(sensorStatus29);
        main.models.UsageLogger usageLogger31 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("hi!", "", localDateTime34);
        usageLogger31.update(usageData35);
        sensor28.detach((main.models.Observer) usageLogger31);
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        java.time.LocalDateTime localDateTime43 = null;
        main.models.UsageData usageData44 = new main.models.UsageData("hi!", "", localDateTime43);
        java.lang.String str45 = usageData44.getEquipmentId();
        sensor40.notifyObservers(usageData44);
        java.time.LocalDateTime localDateTime49 = null;
        main.models.UsageData usageData50 = new main.models.UsageData("", "", localDateTime49);
        sensor40.notifyObservers(usageData50);
        sensor28.notifyObservers(usageData50);
        java.lang.String str53 = usageData50.getEquipmentId();
        usageLogger0.update(usageData50);
        main.enums.SensorStatus sensorStatus56 = null;
        main.models.Sensor sensor57 = new main.models.Sensor("hi!", sensorStatus56);
        main.enums.SensorStatus sensorStatus58 = null;
        sensor57.setStatus(sensorStatus58);
        main.models.UsageLogger usageLogger60 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime63 = null;
        main.models.UsageData usageData64 = new main.models.UsageData("hi!", "", localDateTime63);
        usageLogger60.update(usageData64);
        sensor57.detach((main.models.Observer) usageLogger60);
        java.time.LocalDateTime localDateTime69 = null;
        main.models.UsageData usageData70 = new main.models.UsageData("hi!", "", localDateTime69);
        java.lang.String str71 = usageData70.getEquipmentId();
        usageLogger60.update(usageData70);
        usageLogger0.update(usageData70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList32 = cSVDatabaseManager17.readUsers();
        cSVDatabaseManager0.writeUsers(userList32);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        main.models.Reservation[] reservationArray39 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList40 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList40, reservationArray39);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.Payment[] paymentArray49 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList50 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList50, paymentArray49);
        cSVDatabaseManager44.writePayments((java.util.List<main.models.Payment>) paymentList50);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        java.time.LocalDateTime localDateTime11 = usageData8.getRecordedAt();
        java.lang.String str12 = usageData8.getOperationStatus();
        sensor2.recordUsage(usageData8);
        java.lang.String str14 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus18 = null;
        main.models.Sensor sensor19 = new main.models.Sensor("hi!", sensorStatus18);
        sensor19.setSensorId("");
        sensor19.setSensorId("");
        java.time.LocalDateTime localDateTime24 = sensor19.getLastUpdateTime();
        main.models.UsageData usageData25 = new main.models.UsageData("", "hi!", localDateTime24);
        sensor2.setLastUpdateTime(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        java.time.LocalDateTime localDateTime12 = usageData10.getRecordedAt();
        java.time.LocalDateTime localDateTime13 = usageData10.getRecordedAt();
        java.lang.String str14 = usageData10.getOperationStatus();
        sensor4.recordUsage(usageData10);
        main.models.SystemAlert systemAlert16 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList17 = systemAlert16.getMessages();
        java.util.List<java.lang.String> strList18 = systemAlert16.getMessages();
        main.models.UsageLogger usageLogger19 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        usageLogger19.update(usageData23);
        systemAlert16.update(usageData23);
        sensor4.notifyObservers(usageData23);
        main.enums.SensorStatus sensorStatus28 = null;
        main.models.Sensor sensor29 = new main.models.Sensor("hi!", sensorStatus28);
        main.enums.SensorStatus sensorStatus30 = null;
        sensor29.setStatus(sensorStatus30);
        main.models.UsageLogger usageLogger32 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList33 = usageLogger32.getRecords();
        java.util.List<main.models.UsageData> usageDataList34 = usageLogger32.getRecords();
        java.util.List<main.models.UsageData> usageDataList35 = usageLogger32.getRecords();
        sensor29.attach((main.models.Observer) usageLogger32);
        sensor4.attach((main.models.Observer) usageLogger32);
        main.enums.SensorStatus sensorStatus38 = sensor4.getStatus();
        java.time.LocalDateTime localDateTime39 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData40 = new main.models.UsageData("", "", localDateTime39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        java.time.LocalDateTime localDateTime12 = usageData10.getRecordedAt();
        java.time.LocalDateTime localDateTime13 = usageData10.getRecordedAt();
        systemAlert0.update(usageData10);
        java.lang.String str15 = usageData10.getOperationStatus();
        java.time.LocalDateTime localDateTime16 = usageData10.getRecordedAt();
        java.lang.String str17 = usageData10.getEquipmentId();
        java.lang.Class<?> wildcardClass18 = usageData10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList33 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        main.models.User[] userArray42 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList43 = new java.util.ArrayList<main.models.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList43, userArray42);
        cSVDatabaseManager40.writeUsers((java.util.List<main.models.User>) userList43);
        java.util.List<main.models.Payment> paymentList46 = cSVDatabaseManager40.readPayments();
        java.util.List<main.models.User> userList47 = cSVDatabaseManager40.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray49 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList50 = new java.util.ArrayList<main.models.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList50, userArray49);
        cSVDatabaseManager48.writeUsers((java.util.List<main.models.User>) userList50);
        cSVDatabaseManager40.writeUsers((java.util.List<main.models.User>) userList50);
        java.util.List<main.models.Payment> paymentList54 = cSVDatabaseManager40.readPayments();
        cSVDatabaseManager0.writePayments(paymentList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList54);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        java.util.List<main.models.User> userList13 = databaseProxy12.readUsers();
        databaseProxy9.writeUsers(userList13);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        databaseProxy9.writeUsers(userList17);
        databaseProxy1.writeUsers(userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Equipment[] equipmentArray25 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList26 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList26, equipmentArray25);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList26);
        java.util.List<main.models.User> userList29 = cSVDatabaseManager20.readUsers();
        databaseProxy1.writeUsers(userList29);
        java.util.List<main.models.Payment> paymentList31 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        cSVDatabaseManager32.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        java.util.List<main.models.User> userList47 = cSVDatabaseManager32.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray49 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList50 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList50, equipmentArray49);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList50);
        main.models.Reservation[] reservationArray53 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList54 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList54, reservationArray53);
        cSVDatabaseManager48.writeReservations((java.util.List<main.models.Reservation>) reservationList54);
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray58 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList59 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList59, equipmentArray58);
        cSVDatabaseManager57.writeEquipment((java.util.List<main.models.Equipment>) equipmentList59);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList59);
        java.util.List<main.models.User> userList63 = cSVDatabaseManager48.readUsers();
        java.util.List<main.models.Equipment> equipmentList64 = cSVDatabaseManager48.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager65 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray66 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList67 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList67, equipmentArray66);
        cSVDatabaseManager65.writeEquipment((java.util.List<main.models.Equipment>) equipmentList67);
        main.models.Reservation[] reservationArray70 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList71 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList71, reservationArray70);
        cSVDatabaseManager65.writeReservations((java.util.List<main.models.Reservation>) reservationList71);
        main.models.CSVDatabaseManager cSVDatabaseManager74 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray75 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList76 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList76, equipmentArray75);
        cSVDatabaseManager74.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        cSVDatabaseManager65.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        java.util.List<main.models.Equipment> equipmentList83 = databaseProxy1.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList83);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        main.models.UsageLogger usageLogger14 = new main.models.UsageLogger();
        sensor2.detach((main.models.Observer) usageLogger14);
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime26 = usageData24.getRecordedAt();
        java.time.LocalDateTime localDateTime27 = usageData24.getRecordedAt();
        java.lang.String str28 = usageData24.getOperationStatus();
        sensor18.recordUsage(usageData24);
        main.enums.SensorStatus sensorStatus31 = null;
        main.models.Sensor sensor32 = new main.models.Sensor("hi!", sensorStatus31);
        sensor32.setSensorId("");
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("hi!", "", localDateTime37);
        java.lang.String str39 = usageData38.getEquipmentId();
        java.time.LocalDateTime localDateTime40 = usageData38.getRecordedAt();
        java.time.LocalDateTime localDateTime41 = usageData38.getRecordedAt();
        java.lang.String str42 = usageData38.getOperationStatus();
        sensor32.recordUsage(usageData38);
        main.enums.SensorStatus sensorStatus45 = null;
        main.models.Sensor sensor46 = new main.models.Sensor("hi!", sensorStatus45);
        main.models.UsageLogger usageLogger47 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList48 = usageLogger47.getRecords();
        sensor46.attach((main.models.Observer) usageLogger47);
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("hi!", "", localDateTime52);
        java.lang.String str54 = usageData53.getEquipmentId();
        usageLogger47.update(usageData53);
        main.enums.SensorStatus sensorStatus57 = null;
        main.models.Sensor sensor58 = new main.models.Sensor("hi!", sensorStatus57);
        java.time.LocalDateTime localDateTime61 = null;
        main.models.UsageData usageData62 = new main.models.UsageData("hi!", "", localDateTime61);
        java.lang.String str63 = usageData62.getEquipmentId();
        sensor58.notifyObservers(usageData62);
        usageLogger47.update(usageData62);
        sensor32.attach((main.models.Observer) usageLogger47);
        java.util.List<main.models.UsageData> usageDataList67 = usageLogger47.getRecords();
        sensor18.attach((main.models.Observer) usageLogger47);
        main.models.SystemAlert systemAlert69 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList70 = systemAlert69.getMessages();
        java.time.LocalDateTime localDateTime73 = null;
        main.models.UsageData usageData74 = new main.models.UsageData("", "hi!", localDateTime73);
        systemAlert69.update(usageData74);
        main.models.SystemAlert systemAlert76 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList77 = systemAlert76.getMessages();
        java.time.LocalDateTime localDateTime80 = null;
        main.models.UsageData usageData81 = new main.models.UsageData("", "hi!", localDateTime80);
        systemAlert76.update(usageData81);
        systemAlert69.update(usageData81);
        java.util.List<java.lang.String> strList84 = systemAlert69.getMessages();
        sensor18.detach((main.models.Observer) systemAlert69);
        sensor2.detach((main.models.Observer) systemAlert69);
        java.util.List<java.lang.String> strList87 = systemAlert69.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!" + "'", str63.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList87);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = cSVDatabaseManager0.readEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.User> userList6 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray8 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList9 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList9, equipmentArray8);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList9);
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        main.models.Payment[] paymentArray14 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList15 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList15, paymentArray14);
        databaseProxy13.writePayments((java.util.List<main.models.Payment>) paymentList15);
        cSVDatabaseManager7.writePayments((java.util.List<main.models.Payment>) paymentList15);
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray24 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList25 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList25, equipmentArray24);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList25);
        main.models.Reservation[] reservationArray28 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList29 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList29, reservationArray28);
        cSVDatabaseManager23.writeReservations((java.util.List<main.models.Reservation>) reservationList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        java.util.List<main.models.User> userList38 = cSVDatabaseManager23.readUsers();
        java.util.List<main.models.Equipment> equipmentList39 = cSVDatabaseManager23.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray41 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList42 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList42, equipmentArray41);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
        main.models.Reservation[] reservationArray45 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList46 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList46, reservationArray45);
        cSVDatabaseManager40.writeReservations((java.util.List<main.models.Reservation>) reservationList46);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy59 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager58);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy61 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager60);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray63 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList64 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList64, equipmentArray63);
        cSVDatabaseManager62.writeEquipment((java.util.List<main.models.Equipment>) equipmentList64);
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        cSVDatabaseManager67.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        main.models.Reservation[] reservationArray72 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList73 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList73, reservationArray72);
        cSVDatabaseManager67.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        cSVDatabaseManager62.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        databaseProxy61.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        databaseProxy59.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        main.models.DatabaseProxy databaseProxy80 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.util.List<main.models.Equipment> equipmentList81 = databaseProxy80.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList81);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        java.util.List<main.models.User> userList11 = databaseProxy10.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        java.util.List<main.models.User> userList14 = databaseProxy13.readUsers();
        databaseProxy10.writeUsers(userList14);
        java.util.List<main.models.Equipment> equipmentList16 = databaseProxy10.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy18 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager17);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager19);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        main.models.Reservation[] reservationArray31 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList32 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList32, reservationArray31);
        cSVDatabaseManager26.writeReservations((java.util.List<main.models.Reservation>) reservationList32);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList32);
        databaseProxy20.writeReservations((java.util.List<main.models.Reservation>) reservationList32);
        databaseProxy18.writeReservations((java.util.List<main.models.Reservation>) reservationList32);
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        databaseProxy18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy43 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager42);
        java.util.List<main.models.User> userList44 = databaseProxy43.readUsers();
        databaseProxy18.writeUsers(userList44);
        databaseProxy10.writeUsers(userList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.Reservation[] reservationArray52 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList53 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList53, reservationArray52);
        cSVDatabaseManager47.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        databaseProxy10.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        java.util.List<main.models.User> userList57 = databaseProxy10.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList59 = cSVDatabaseManager58.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy61 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager60);
        java.util.List<main.models.User> userList62 = databaseProxy61.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy64 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager63);
        java.util.List<main.models.User> userList65 = databaseProxy64.readUsers();
        databaseProxy61.writeUsers(userList65);
        cSVDatabaseManager58.writeUsers(userList65);
        databaseProxy10.writeUsers(userList65);
        cSVDatabaseManager0.writeUsers(userList65);
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList71 = cSVDatabaseManager70.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray73 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList74 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList74, equipmentArray73);
        cSVDatabaseManager72.writeEquipment((java.util.List<main.models.Equipment>) equipmentList74);
        main.models.CSVDatabaseManager cSVDatabaseManager77 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray78 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList79 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList79, equipmentArray78);
        cSVDatabaseManager77.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        main.models.Reservation[] reservationArray82 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList83 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList83, reservationArray82);
        cSVDatabaseManager77.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        cSVDatabaseManager72.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        cSVDatabaseManager70.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        java.util.List<main.models.Reservation> reservationList88 = cSVDatabaseManager70.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList88);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        java.lang.String str6 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus8 = null;
        main.models.Sensor sensor9 = new main.models.Sensor("hi!", sensorStatus8);
        sensor9.setSensorId("");
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        java.time.LocalDateTime localDateTime17 = usageData15.getRecordedAt();
        java.time.LocalDateTime localDateTime18 = usageData15.getRecordedAt();
        java.lang.String str19 = usageData15.getOperationStatus();
        sensor9.recordUsage(usageData15);
        main.enums.SensorStatus sensorStatus22 = null;
        main.models.Sensor sensor23 = new main.models.Sensor("hi!", sensorStatus22);
        sensor23.setSensorId("");
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("hi!", "", localDateTime28);
        java.lang.String str30 = usageData29.getEquipmentId();
        java.time.LocalDateTime localDateTime31 = usageData29.getRecordedAt();
        java.time.LocalDateTime localDateTime32 = usageData29.getRecordedAt();
        java.lang.String str33 = usageData29.getOperationStatus();
        sensor23.recordUsage(usageData29);
        main.enums.SensorStatus sensorStatus36 = null;
        main.models.Sensor sensor37 = new main.models.Sensor("hi!", sensorStatus36);
        main.models.UsageLogger usageLogger38 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList39 = usageLogger38.getRecords();
        sensor37.attach((main.models.Observer) usageLogger38);
        java.time.LocalDateTime localDateTime43 = null;
        main.models.UsageData usageData44 = new main.models.UsageData("hi!", "", localDateTime43);
        java.lang.String str45 = usageData44.getEquipmentId();
        usageLogger38.update(usageData44);
        main.enums.SensorStatus sensorStatus48 = null;
        main.models.Sensor sensor49 = new main.models.Sensor("hi!", sensorStatus48);
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("hi!", "", localDateTime52);
        java.lang.String str54 = usageData53.getEquipmentId();
        sensor49.notifyObservers(usageData53);
        usageLogger38.update(usageData53);
        sensor23.attach((main.models.Observer) usageLogger38);
        java.util.List<main.models.UsageData> usageDataList58 = usageLogger38.getRecords();
        sensor9.attach((main.models.Observer) usageLogger38);
        java.time.LocalDateTime localDateTime60 = sensor9.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        sensor6.setSensorId("");
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        java.lang.String str13 = usageData12.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = usageData12.getRecordedAt();
        java.time.LocalDateTime localDateTime15 = usageData12.getRecordedAt();
        java.lang.String str16 = usageData12.getOperationStatus();
        sensor6.recordUsage(usageData12);
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = null;
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "", localDateTime25);
        java.lang.String str27 = usageData26.getEquipmentId();
        java.time.LocalDateTime localDateTime28 = usageData26.getRecordedAt();
        java.time.LocalDateTime localDateTime29 = usageData26.getRecordedAt();
        java.lang.String str30 = usageData26.getOperationStatus();
        sensor20.recordUsage(usageData26);
        main.enums.SensorStatus sensorStatus33 = null;
        main.models.Sensor sensor34 = new main.models.Sensor("hi!", sensorStatus33);
        main.models.UsageLogger usageLogger35 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList36 = usageLogger35.getRecords();
        sensor34.attach((main.models.Observer) usageLogger35);
        java.time.LocalDateTime localDateTime40 = null;
        main.models.UsageData usageData41 = new main.models.UsageData("hi!", "", localDateTime40);
        java.lang.String str42 = usageData41.getEquipmentId();
        usageLogger35.update(usageData41);
        main.enums.SensorStatus sensorStatus45 = null;
        main.models.Sensor sensor46 = new main.models.Sensor("hi!", sensorStatus45);
        java.time.LocalDateTime localDateTime49 = null;
        main.models.UsageData usageData50 = new main.models.UsageData("hi!", "", localDateTime49);
        java.lang.String str51 = usageData50.getEquipmentId();
        sensor46.notifyObservers(usageData50);
        usageLogger35.update(usageData50);
        sensor20.attach((main.models.Observer) usageLogger35);
        java.util.List<main.models.UsageData> usageDataList55 = usageLogger35.getRecords();
        sensor6.attach((main.models.Observer) usageLogger35);
        main.enums.SensorStatus sensorStatus60 = null;
        main.models.Sensor sensor61 = new main.models.Sensor("hi!", sensorStatus60);
        sensor61.setSensorId("");
        sensor61.setSensorId("");
        java.time.LocalDateTime localDateTime66 = sensor61.getLastUpdateTime();
        main.models.UsageData usageData67 = new main.models.UsageData("", "hi!", localDateTime66);
        sensor6.setLastUpdateTime(localDateTime66);
        main.enums.SensorStatus sensorStatus70 = null;
        main.models.Sensor sensor71 = new main.models.Sensor("hi!", sensorStatus70);
        main.enums.SensorStatus sensorStatus72 = null;
        sensor71.setStatus(sensorStatus72);
        main.models.UsageLogger usageLogger74 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime77 = null;
        main.models.UsageData usageData78 = new main.models.UsageData("hi!", "", localDateTime77);
        usageLogger74.update(usageData78);
        sensor71.detach((main.models.Observer) usageLogger74);
        java.time.LocalDateTime localDateTime83 = null;
        main.models.UsageData usageData84 = new main.models.UsageData("hi!", "", localDateTime83);
        java.lang.String str85 = usageData84.getEquipmentId();
        usageLogger74.update(usageData84);
        sensor6.recordUsage(usageData84);
        java.time.LocalDateTime localDateTime88 = sensor6.getLastUpdateTime();
        main.models.UsageData usageData89 = new main.models.UsageData("hi!", "", localDateTime88);
        main.models.UsageData usageData90 = new main.models.UsageData("", "hi!", localDateTime88);
        java.time.LocalDateTime localDateTime91 = usageData90.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime91);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = sensor2.getStatus();
        main.models.UsageLogger usageLogger6 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        usageLogger6.update(usageData10);
        java.util.List<main.models.UsageData> usageDataList12 = usageLogger6.getRecords();
        sensor2.detach((main.models.Observer) usageLogger6);
        java.util.List<main.models.UsageData> usageDataList14 = usageLogger6.getRecords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList14);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.util.List<main.models.User> userList5 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList7 = cSVDatabaseManager6.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList7);
        java.util.List<main.models.User> userList9 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList16);
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        java.util.List<main.models.User> userList13 = databaseProxy12.readUsers();
        databaseProxy9.writeUsers(userList13);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        databaseProxy9.writeUsers(userList17);
        databaseProxy1.writeUsers(userList17);
        java.util.List<main.models.Equipment> equipmentList20 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        java.util.List<main.models.Reservation> reservationList30 = cSVDatabaseManager21.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager31 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray32 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList33 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList33, equipmentArray32);
        cSVDatabaseManager31.writeEquipment((java.util.List<main.models.Equipment>) equipmentList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        main.models.Reservation[] reservationArray41 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList42 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList42, reservationArray41);
        cSVDatabaseManager36.writeReservations((java.util.List<main.models.Reservation>) reservationList42);
        cSVDatabaseManager31.writeReservations((java.util.List<main.models.Reservation>) reservationList42);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList42);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy48 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy50 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager49);
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.CSVDatabaseManager cSVDatabaseManager56 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray57 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList58 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList58, equipmentArray57);
        cSVDatabaseManager56.writeEquipment((java.util.List<main.models.Equipment>) equipmentList58);
        main.models.Reservation[] reservationArray61 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList62 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList62, reservationArray61);
        cSVDatabaseManager56.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        cSVDatabaseManager51.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        databaseProxy50.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        databaseProxy48.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        databaseProxy48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray73 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList74 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList74, equipmentArray73);
        cSVDatabaseManager72.writeEquipment((java.util.List<main.models.Equipment>) equipmentList74);
        main.models.CSVDatabaseManager cSVDatabaseManager77 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy78 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager77);
        main.models.Payment[] paymentArray79 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList80 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList80, paymentArray79);
        databaseProxy78.writePayments((java.util.List<main.models.Payment>) paymentList80);
        cSVDatabaseManager72.writePayments((java.util.List<main.models.Payment>) paymentList80);
        databaseProxy48.writePayments((java.util.List<main.models.Payment>) paymentList80);
        cSVDatabaseManager21.writePayments((java.util.List<main.models.Payment>) paymentList80);
        java.util.List<main.models.Reservation> reservationList86 = cSVDatabaseManager21.readReservations();
        databaseProxy1.writeReservations(reservationList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList86);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = null;
        sensor2.setStatus(sensorStatus5);
        main.models.SystemAlert systemAlert7 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList8 = systemAlert7.getMessages();
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "hi!", localDateTime11);
        systemAlert7.update(usageData12);
        sensor2.detach((main.models.Observer) systemAlert7);
        java.time.LocalDateTime localDateTime17 = null;
        main.models.UsageData usageData18 = new main.models.UsageData("hi!", "", localDateTime17);
        java.lang.String str19 = usageData18.getEquipmentId();
        java.time.LocalDateTime localDateTime20 = usageData18.getRecordedAt();
        java.time.LocalDateTime localDateTime21 = usageData18.getRecordedAt();
        java.lang.String str22 = usageData18.getOperationStatus();
        systemAlert7.update(usageData18);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        sensor28.setSensorId("");
        sensor28.setSensorId("");
        java.time.LocalDateTime localDateTime33 = sensor28.getLastUpdateTime();
        main.models.UsageData usageData34 = new main.models.UsageData("", "hi!", localDateTime33);
        systemAlert7.update(usageData34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus7 = null;
        sensor2.setStatus(sensorStatus7);
        main.enums.SensorStatus sensorStatus10 = null;
        main.models.Sensor sensor11 = new main.models.Sensor("hi!", sensorStatus10);
        sensor11.setSensorId("");
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("hi!", "", localDateTime16);
        java.lang.String str18 = usageData17.getEquipmentId();
        java.time.LocalDateTime localDateTime19 = usageData17.getRecordedAt();
        java.time.LocalDateTime localDateTime20 = usageData17.getRecordedAt();
        java.lang.String str21 = usageData17.getOperationStatus();
        sensor11.recordUsage(usageData17);
        main.enums.SensorStatus sensorStatus24 = null;
        main.models.Sensor sensor25 = new main.models.Sensor("hi!", sensorStatus24);
        sensor25.setSensorId("");
        java.time.LocalDateTime localDateTime30 = null;
        main.models.UsageData usageData31 = new main.models.UsageData("hi!", "", localDateTime30);
        java.lang.String str32 = usageData31.getEquipmentId();
        java.time.LocalDateTime localDateTime33 = usageData31.getRecordedAt();
        java.time.LocalDateTime localDateTime34 = usageData31.getRecordedAt();
        java.lang.String str35 = usageData31.getOperationStatus();
        sensor25.recordUsage(usageData31);
        main.enums.SensorStatus sensorStatus38 = null;
        main.models.Sensor sensor39 = new main.models.Sensor("hi!", sensorStatus38);
        main.models.UsageLogger usageLogger40 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList41 = usageLogger40.getRecords();
        sensor39.attach((main.models.Observer) usageLogger40);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        usageLogger40.update(usageData46);
        main.enums.SensorStatus sensorStatus50 = null;
        main.models.Sensor sensor51 = new main.models.Sensor("hi!", sensorStatus50);
        java.time.LocalDateTime localDateTime54 = null;
        main.models.UsageData usageData55 = new main.models.UsageData("hi!", "", localDateTime54);
        java.lang.String str56 = usageData55.getEquipmentId();
        sensor51.notifyObservers(usageData55);
        usageLogger40.update(usageData55);
        sensor25.attach((main.models.Observer) usageLogger40);
        java.util.List<main.models.UsageData> usageDataList60 = usageLogger40.getRecords();
        sensor11.attach((main.models.Observer) usageLogger40);
        main.enums.SensorStatus sensorStatus65 = null;
        main.models.Sensor sensor66 = new main.models.Sensor("hi!", sensorStatus65);
        sensor66.setSensorId("");
        sensor66.setSensorId("");
        java.time.LocalDateTime localDateTime71 = sensor66.getLastUpdateTime();
        main.models.UsageData usageData72 = new main.models.UsageData("", "hi!", localDateTime71);
        sensor11.setLastUpdateTime(localDateTime71);
        main.enums.SensorStatus sensorStatus75 = null;
        main.models.Sensor sensor76 = new main.models.Sensor("hi!", sensorStatus75);
        main.enums.SensorStatus sensorStatus77 = null;
        sensor76.setStatus(sensorStatus77);
        main.models.UsageLogger usageLogger79 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime82 = null;
        main.models.UsageData usageData83 = new main.models.UsageData("hi!", "", localDateTime82);
        usageLogger79.update(usageData83);
        sensor76.detach((main.models.Observer) usageLogger79);
        java.time.LocalDateTime localDateTime88 = null;
        main.models.UsageData usageData89 = new main.models.UsageData("hi!", "", localDateTime88);
        java.lang.String str90 = usageData89.getEquipmentId();
        usageLogger79.update(usageData89);
        sensor11.recordUsage(usageData89);
        java.time.LocalDateTime localDateTime93 = sensor11.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime93);
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "" + "'", str35.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!" + "'", str56.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!" + "'", str90.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime93);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        java.util.List<main.models.Reservation> reservationList9 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        cSVDatabaseManager15.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.util.List<main.models.Equipment> equipmentList26 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Payment> paymentList27 = cSVDatabaseManager0.readPayments();
        java.lang.Class<?> wildcardClass28 = paymentList27.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        sensor2.setSensorId("hi!");
        main.models.SystemAlert systemAlert8 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList9 = systemAlert8.getMessages();
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("", "hi!", localDateTime12);
        systemAlert8.update(usageData13);
        java.time.LocalDateTime localDateTime17 = null;
        main.models.UsageData usageData18 = new main.models.UsageData("hi!", "", localDateTime17);
        java.lang.String str19 = usageData18.getEquipmentId();
        java.time.LocalDateTime localDateTime20 = usageData18.getRecordedAt();
        java.time.LocalDateTime localDateTime21 = usageData18.getRecordedAt();
        systemAlert8.update(usageData18);
        sensor2.detach((main.models.Observer) systemAlert8);
        java.util.List<java.lang.String> strList24 = systemAlert8.getMessages();
        main.enums.SensorStatus sensorStatus26 = null;
        main.models.Sensor sensor27 = new main.models.Sensor("hi!", sensorStatus26);
        sensor27.setSensorId("");
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        java.lang.String str34 = usageData33.getEquipmentId();
        java.time.LocalDateTime localDateTime35 = usageData33.getRecordedAt();
        sensor27.recordUsage(usageData33);
        sensor27.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus40 = null;
        main.models.Sensor sensor41 = new main.models.Sensor("hi!", sensorStatus40);
        sensor41.setSensorId("");
        java.time.LocalDateTime localDateTime46 = null;
        main.models.UsageData usageData47 = new main.models.UsageData("hi!", "", localDateTime46);
        java.lang.String str48 = usageData47.getEquipmentId();
        java.time.LocalDateTime localDateTime49 = usageData47.getRecordedAt();
        sensor41.recordUsage(usageData47);
        sensor41.setSensorId("hi!");
        java.time.LocalDateTime localDateTime55 = null;
        main.models.UsageData usageData56 = new main.models.UsageData("", "hi!", localDateTime55);
        sensor41.notifyObservers(usageData56);
        main.enums.SensorStatus sensorStatus59 = null;
        main.models.Sensor sensor60 = new main.models.Sensor("hi!", sensorStatus59);
        main.models.UsageLogger usageLogger61 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList62 = usageLogger61.getRecords();
        sensor60.attach((main.models.Observer) usageLogger61);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        usageLogger61.update(usageData67);
        java.time.LocalDateTime localDateTime72 = null;
        main.models.UsageData usageData73 = new main.models.UsageData("hi!", "", localDateTime72);
        usageLogger61.update(usageData73);
        sensor41.detach((main.models.Observer) usageLogger61);
        sensor27.attach((main.models.Observer) usageLogger61);
        java.util.List<main.models.UsageData> usageDataList77 = usageLogger61.getRecords();
        java.time.LocalDateTime localDateTime80 = null;
        main.models.UsageData usageData81 = new main.models.UsageData("hi!", "", localDateTime80);
        java.lang.String str82 = usageData81.getEquipmentId();
        usageLogger61.update(usageData81);
        systemAlert8.update(usageData81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Reservation> reservationList9 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList11 = cSVDatabaseManager10.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager12.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        java.util.List<main.models.User> userList28 = cSVDatabaseManager10.readUsers();
        cSVDatabaseManager0.writeUsers(userList28);
        java.lang.Class<?> wildcardClass30 = cSVDatabaseManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = null;
        sensor2.setStatus(sensorStatus8);
        sensor2.setSensorId("hi!");
        java.lang.String str12 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray16 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList17 = new java.util.ArrayList<main.models.User>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList17, userArray16);
        cSVDatabaseManager15.writeUsers((java.util.List<main.models.User>) userList17);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList17);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.Reservation[] reservationArray26 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList27 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList27, reservationArray26);
        cSVDatabaseManager21.writeReservations((java.util.List<main.models.Reservation>) reservationList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.Payment[] paymentArray42 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList43 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList43, paymentArray42);
        cSVDatabaseManager37.writePayments((java.util.List<main.models.Payment>) paymentList43);
        java.util.List<main.models.Payment> paymentList46 = cSVDatabaseManager37.readPayments();
        cSVDatabaseManager0.writePayments(paymentList46);
        java.util.List<main.models.Equipment> equipmentList48 = cSVDatabaseManager0.readEquipment();
        main.models.DatabaseProxy databaseProxy49 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        main.models.Reservation[] reservationArray55 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList56 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList56, reservationArray55);
        cSVDatabaseManager50.writeReservations((java.util.List<main.models.Reservation>) reservationList56);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        java.util.List<main.models.User> userList65 = cSVDatabaseManager50.readUsers();
        java.util.List<main.models.Equipment> equipmentList66 = cSVDatabaseManager50.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        cSVDatabaseManager67.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        main.models.Reservation[] reservationArray72 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList73 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList73, reservationArray72);
        cSVDatabaseManager67.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray77 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList78 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList78, equipmentArray77);
        cSVDatabaseManager76.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        cSVDatabaseManager67.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        java.util.List<main.models.User> userList82 = cSVDatabaseManager67.readUsers();
        cSVDatabaseManager50.writeUsers(userList82);
        main.models.CSVDatabaseManager cSVDatabaseManager84 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray85 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList86 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList86, equipmentArray85);
        cSVDatabaseManager84.writeEquipment((java.util.List<main.models.Equipment>) equipmentList86);
        main.models.Reservation[] reservationArray89 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList90 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList90, reservationArray89);
        cSVDatabaseManager84.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        cSVDatabaseManager50.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        databaseProxy49.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.Equipment[] equipmentArray7 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList8 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList8, equipmentArray7);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList8);
        java.util.List<main.models.Reservation> reservationList11 = cSVDatabaseManager2.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager12.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        java.util.List<main.models.User> userList31 = databaseProxy30.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        databaseProxy30.writeUsers(userList34);
        java.util.List<main.models.Equipment> equipmentList36 = databaseProxy30.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        cSVDatabaseManager39.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        cSVDatabaseManager44.writeReservations((java.util.List<main.models.Reservation>) reservationList50);
        cSVDatabaseManager39.writeReservations((java.util.List<main.models.Reservation>) reservationList50);
        databaseProxy38.writeReservations((java.util.List<main.models.Reservation>) reservationList50);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy56 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager55);
        java.util.List<main.models.User> userList57 = databaseProxy56.readUsers();
        main.models.User[] userArray58 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList59 = new java.util.ArrayList<main.models.User>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList59, userArray58);
        databaseProxy56.writeUsers((java.util.List<main.models.User>) userList59);
        databaseProxy38.writeUsers((java.util.List<main.models.User>) userList59);
        databaseProxy30.writeUsers((java.util.List<main.models.User>) userList59);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy65 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager64);
        main.models.CSVDatabaseManager cSVDatabaseManager66 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        cSVDatabaseManager66.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray72 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList73 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList73, equipmentArray72);
        cSVDatabaseManager71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList73);
        main.models.Reservation[] reservationArray76 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList77 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList77, reservationArray76);
        cSVDatabaseManager71.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        cSVDatabaseManager66.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        databaseProxy65.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        java.util.List<main.models.Reservation> reservationList82 = databaseProxy65.readReservations();
        databaseProxy30.writeReservations(reservationList82);
        cSVDatabaseManager0.writeReservations(reservationList82);
        main.models.DatabaseProxy databaseProxy85 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList82);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        java.util.List<main.models.Reservation> reservationList9 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.Reservation[] reservationArray20 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList21 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList21, reservationArray20);
        cSVDatabaseManager15.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        java.util.List<main.models.Equipment> equipmentList26 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager27);
        java.util.List<main.models.User> userList29 = databaseProxy28.readUsers();
        java.util.List<main.models.Reservation> reservationList30 = databaseProxy28.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList30);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        main.models.Payment[] paymentArray34 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList35 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList35, paymentArray34);
        databaseProxy33.writePayments((java.util.List<main.models.Payment>) paymentList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray41 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList42 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList42, equipmentArray41);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
        main.models.CSVDatabaseManager cSVDatabaseManager45 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager45.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        main.models.Reservation[] reservationArray50 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList51 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList51, reservationArray50);
        cSVDatabaseManager45.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        cSVDatabaseManager40.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        databaseProxy39.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        databaseProxy33.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        java.util.List<main.models.Payment> paymentList57 = databaseProxy33.readPayments();
        java.util.List<main.models.Payment> paymentList58 = databaseProxy33.readPayments();
        java.util.List<main.models.Reservation> reservationList59 = databaseProxy33.readReservations();
        java.util.List<main.models.Reservation> reservationList60 = databaseProxy33.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.Payment[] paymentArray66 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList67 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList67, paymentArray66);
        cSVDatabaseManager61.writePayments((java.util.List<main.models.Payment>) paymentList67);
        java.util.List<main.models.Payment> paymentList70 = cSVDatabaseManager61.readPayments();
        java.util.List<main.models.User> userList71 = cSVDatabaseManager61.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray73 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList74 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList74, equipmentArray73);
        cSVDatabaseManager72.writeEquipment((java.util.List<main.models.Equipment>) equipmentList74);
        java.util.List<main.models.User> userList77 = cSVDatabaseManager72.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList79 = cSVDatabaseManager78.readReservations();
        cSVDatabaseManager72.writeReservations(reservationList79);
        cSVDatabaseManager61.writeReservations(reservationList79);
        databaseProxy33.writeReservations(reservationList79);
        cSVDatabaseManager0.writeReservations(reservationList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList79);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        java.util.List<main.models.User> userList15 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray18 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList19 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList19, equipmentArray18);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList19);
        main.models.Reservation[] reservationArray22 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList23 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList23, reservationArray22);
        cSVDatabaseManager17.writeReservations((java.util.List<main.models.Reservation>) reservationList23);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        cSVDatabaseManager17.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList32 = cSVDatabaseManager17.readUsers();
        cSVDatabaseManager0.writeUsers(userList32);
        java.util.List<main.models.Reservation> reservationList34 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        java.util.List<main.models.User> userList37 = databaseProxy36.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        java.util.List<main.models.User> userList40 = databaseProxy39.readUsers();
        databaseProxy36.writeUsers(userList40);
        java.util.List<main.models.Equipment> equipmentList42 = databaseProxy36.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        java.util.List<main.models.User> userList45 = databaseProxy44.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        java.util.List<main.models.User> userList48 = databaseProxy47.readUsers();
        databaseProxy44.writeUsers(userList48);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy51 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager50);
        java.util.List<main.models.User> userList52 = databaseProxy51.readUsers();
        databaseProxy44.writeUsers(userList52);
        databaseProxy36.writeUsers(userList52);
        java.util.List<main.models.Payment> paymentList55 = databaseProxy36.readPayments();
        cSVDatabaseManager0.writePayments(paymentList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList55);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("", "hi!", localDateTime16);
        sensor2.notifyObservers(usageData17);
        main.enums.SensorStatus sensorStatus20 = null;
        main.models.Sensor sensor21 = new main.models.Sensor("hi!", sensorStatus20);
        main.models.UsageLogger usageLogger22 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList23 = usageLogger22.getRecords();
        sensor21.attach((main.models.Observer) usageLogger22);
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("hi!", "", localDateTime27);
        java.lang.String str29 = usageData28.getEquipmentId();
        usageLogger22.update(usageData28);
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("hi!", "", localDateTime33);
        usageLogger22.update(usageData34);
        sensor2.detach((main.models.Observer) usageLogger22);
        main.enums.SensorStatus sensorStatus37 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        main.models.SystemAlert systemAlert41 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList42 = systemAlert41.getMessages();
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("", "hi!", localDateTime45);
        systemAlert41.update(usageData46);
        sensor40.notifyObservers(usageData46);
        sensor2.notifyObservers(usageData46);
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus57 = null;
        main.models.Sensor sensor58 = new main.models.Sensor("hi!", sensorStatus57);
        sensor58.setSensorId("");
        sensor58.setSensorId("");
        java.time.LocalDateTime localDateTime63 = sensor58.getLastUpdateTime();
        main.models.UsageData usageData64 = new main.models.UsageData("", "hi!", localDateTime63);
        main.models.UsageData usageData65 = new main.models.UsageData("hi!", "hi!", localDateTime63);
        sensor2.notifyObservers(usageData65);
        main.models.SystemAlert systemAlert67 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList68 = systemAlert67.getMessages();
        java.util.List<java.lang.String> strList69 = systemAlert67.getMessages();
        main.models.UsageLogger usageLogger70 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime73 = null;
        main.models.UsageData usageData74 = new main.models.UsageData("hi!", "", localDateTime73);
        usageLogger70.update(usageData74);
        systemAlert67.update(usageData74);
        java.lang.String str77 = usageData74.getOperationStatus();
        sensor2.recordUsage(usageData74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy3 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager2);
        main.models.CSVDatabaseManager cSVDatabaseManager4 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager4.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.Reservation[] reservationArray14 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList15 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList15, reservationArray14);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        cSVDatabaseManager4.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        databaseProxy3.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList15);
        java.util.List<main.models.Payment> paymentList21 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager22 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray23 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList24 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList24, equipmentArray23);
        cSVDatabaseManager22.writeEquipment((java.util.List<main.models.Equipment>) equipmentList24);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        cSVDatabaseManager22.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        java.util.List<main.models.Equipment> equipmentList37 = cSVDatabaseManager22.readEquipment();
        databaseProxy1.writeEquipment(equipmentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = null;
        sensor2.setStatus(sensorStatus5);
        main.models.SystemAlert systemAlert7 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList8 = systemAlert7.getMessages();
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "hi!", localDateTime11);
        systemAlert7.update(usageData12);
        sensor2.detach((main.models.Observer) systemAlert7);
        main.enums.SensorStatus sensorStatus16 = null;
        main.models.Sensor sensor17 = new main.models.Sensor("hi!", sensorStatus16);
        sensor17.setSensorId("");
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        java.lang.String str24 = usageData23.getEquipmentId();
        java.time.LocalDateTime localDateTime25 = usageData23.getRecordedAt();
        java.time.LocalDateTime localDateTime26 = usageData23.getRecordedAt();
        java.lang.String str27 = usageData23.getOperationStatus();
        sensor17.recordUsage(usageData23);
        sensor2.recordUsage(usageData23);
        main.enums.SensorStatus sensorStatus30 = null;
        sensor2.setStatus(sensorStatus30);
        java.lang.String str32 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime33 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime33);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime6 = null;
        main.models.UsageData usageData7 = new main.models.UsageData("hi!", "", localDateTime6);
        usageLogger3.update(usageData7);
        systemAlert0.update(usageData7);
        java.lang.String str10 = usageData7.getOperationStatus();
        java.lang.String str11 = usageData7.getEquipmentId();
        java.lang.String str12 = usageData7.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        java.util.List<java.lang.String> strList7 = systemAlert0.getMessages();
        main.models.SystemAlert systemAlert8 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList9 = systemAlert8.getMessages();
        java.util.List<java.lang.String> strList10 = systemAlert8.getMessages();
        main.models.UsageLogger usageLogger11 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        usageLogger11.update(usageData15);
        systemAlert8.update(usageData15);
        systemAlert0.update(usageData15);
        main.enums.SensorStatus sensorStatus20 = null;
        main.models.Sensor sensor21 = new main.models.Sensor("hi!", sensorStatus20);
        sensor21.setSensorId("");
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("hi!", "", localDateTime26);
        java.lang.String str28 = usageData27.getEquipmentId();
        java.time.LocalDateTime localDateTime29 = usageData27.getRecordedAt();
        java.time.LocalDateTime localDateTime30 = usageData27.getRecordedAt();
        java.lang.String str31 = usageData27.getOperationStatus();
        sensor21.recordUsage(usageData27);
        java.lang.String str33 = usageData27.getEquipmentId();
        systemAlert0.update(usageData27);
        java.util.List<java.lang.String> strList35 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Reservation[] reservationArray5 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList6 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList6, reservationArray5);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList6);
        java.util.List<main.models.Equipment> equipmentList9 = cSVDatabaseManager0.readEquipment();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Equipment> equipmentList11 = databaseProxy10.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList13 = cSVDatabaseManager12.readReservations();
        databaseProxy10.writeReservations(reservationList13);
        java.util.List<main.models.Equipment> equipmentList15 = databaseProxy10.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Payment[] paymentArray21 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList22 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList22, paymentArray21);
        cSVDatabaseManager16.writePayments((java.util.List<main.models.Payment>) paymentList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy26 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager25);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        cSVDatabaseManager32.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        databaseProxy26.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        databaseProxy10.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        java.lang.Class<?> wildcardClass45 = reservationList38.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        usageLogger5.update(usageData9);
        sensor2.detach((main.models.Observer) usageLogger5);
        sensor2.setSensorId("");
    }
}

