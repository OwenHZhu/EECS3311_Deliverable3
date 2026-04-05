package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.lang.String str4 = usageData3.getEquipmentId();
        java.lang.Class<?> wildcardClass5 = usageData3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
        java.lang.Class<?> wildcardClass15 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.lang.Class<?> wildcardClass3 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("", sensorStatus1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "hi!", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
        java.lang.Class<?> wildcardClass19 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
        java.lang.Class<?> wildcardClass33 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        java.util.List<main.models.User> userList39 = databaseProxy38.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        java.util.List<main.models.User> userList42 = databaseProxy41.readUsers();
        databaseProxy38.writeUsers(userList42);
        cSVDatabaseManager0.writeUsers(userList42);
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
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
        java.lang.Class<?> wildcardClass33 = equipmentList28.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
        java.lang.String str15 = sensor2.getSensorId();
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
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.lang.String str4 = usageData3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = usageData3.getRecordedAt();
        java.time.LocalDateTime localDateTime6 = usageData3.getRecordedAt();
        java.lang.Class<?> wildcardClass7 = usageData3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
        java.lang.Class<?> wildcardClass34 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.User[] userArray3 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList4 = new java.util.ArrayList<main.models.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList4, userArray3);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager7);
        java.util.List<main.models.User> userList9 = databaseProxy8.readUsers();
        main.models.User[] userArray10 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList11 = new java.util.ArrayList<main.models.User>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList11, userArray10);
        databaseProxy8.writeUsers((java.util.List<main.models.User>) userList11);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList11);
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
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        java.lang.String str10 = usageData9.getEquipmentId();
        usageLogger3.update(usageData9);
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        java.time.LocalDateTime localDateTime17 = null;
        main.models.UsageData usageData18 = new main.models.UsageData("hi!", "", localDateTime17);
        java.lang.String str19 = usageData18.getEquipmentId();
        sensor14.notifyObservers(usageData18);
        usageLogger3.update(usageData18);
        java.lang.Class<?> wildcardClass22 = usageData18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.lang.Class<?> wildcardClass5 = equipmentList2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.models.DatabaseManager databaseManager0 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy(databaseManager0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: realManager cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger18.getRecords();
        sensor2.attach((main.models.Observer) usageLogger18);
        main.enums.SensorStatus sensorStatus35 = null;
        main.models.Sensor sensor36 = new main.models.Sensor("hi!", sensorStatus35);
        main.enums.SensorStatus sensorStatus37 = null;
        sensor36.setStatus(sensorStatus37);
        main.models.UsageLogger usageLogger39 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        usageLogger39.update(usageData43);
        sensor36.detach((main.models.Observer) usageLogger39);
        java.time.LocalDateTime localDateTime48 = null;
        main.models.UsageData usageData49 = new main.models.UsageData("hi!", "", localDateTime48);
        java.lang.String str50 = usageData49.getEquipmentId();
        usageLogger39.update(usageData49);
        usageLogger18.update(usageData49);
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
        org.junit.Assert.assertNotNull(usageDataList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
        java.lang.Class<?> wildcardClass17 = equipmentList16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.lang.String str8 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime9 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
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
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray13 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList14 = new java.util.ArrayList<main.models.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList14, userArray13);
        cSVDatabaseManager12.writeUsers((java.util.List<main.models.User>) userList14);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList14);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy7 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager6);
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray9 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList10 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList10, equipmentArray9);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList10);
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray14 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList15 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList15, equipmentArray14);
        cSVDatabaseManager13.writeEquipment((java.util.List<main.models.Equipment>) equipmentList15);
        main.models.Reservation[] reservationArray18 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList19 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList19, reservationArray18);
        cSVDatabaseManager13.writeReservations((java.util.List<main.models.Reservation>) reservationList19);
        cSVDatabaseManager8.writeReservations((java.util.List<main.models.Reservation>) reservationList19);
        databaseProxy7.writeReservations((java.util.List<main.models.Reservation>) reservationList19);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList19);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.Payment[] paymentArray30 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList31 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList31, paymentArray30);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList31);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        java.util.List<main.models.Reservation> reservationList3 = databaseProxy1.readReservations();
        java.lang.Class<?> wildcardClass4 = databaseProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Equipment> equipmentList2 = databaseProxy1.readEquipment();
        java.util.List<main.models.Payment> paymentList3 = databaseProxy1.readPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        cSVDatabaseManager39.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        databaseProxy22.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        java.util.List<main.models.Reservation> reservationList45 = databaseProxy22.readReservations();
        java.util.List<main.models.User> userList46 = databaseProxy22.readUsers();
        java.util.List<main.models.Payment> paymentList47 = databaseProxy22.readPayments();
        cSVDatabaseManager0.writePayments(paymentList47);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList47);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
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
        java.lang.Class<?> wildcardClass21 = equipmentList20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        java.lang.String str7 = usageData5.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        java.util.List<main.models.Equipment> equipmentList15 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Payment> paymentList16 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Reservation> reservationList17 = null;
        cSVDatabaseManager0.writeReservations(reservationList17);
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
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
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
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        main.models.Payment[] paymentArray45 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList46 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList46, paymentArray45);
        databaseProxy44.writePayments((java.util.List<main.models.Payment>) paymentList46);
        cSVDatabaseManager38.writePayments((java.util.List<main.models.Payment>) paymentList46);
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        main.models.Reservation[] reservationArray59 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList60 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList60, reservationArray59);
        cSVDatabaseManager54.writeReservations((java.util.List<main.models.Reservation>) reservationList60);
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray64 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList65 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList65, equipmentArray64);
        cSVDatabaseManager63.writeEquipment((java.util.List<main.models.Equipment>) equipmentList65);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList65);
        java.util.List<main.models.User> userList69 = cSVDatabaseManager54.readUsers();
        java.util.List<main.models.Equipment> equipmentList70 = cSVDatabaseManager54.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray72 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList73 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList73, equipmentArray72);
        cSVDatabaseManager71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList73);
        main.models.Reservation[] reservationArray76 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList77 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList77, reservationArray76);
        cSVDatabaseManager71.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        main.models.CSVDatabaseManager cSVDatabaseManager80 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        cSVDatabaseManager80.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        cSVDatabaseManager71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        java.util.List<main.models.User> userList88 = cSVDatabaseManager38.readUsers();
        databaseProxy1.writeUsers(userList88);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList70);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList3 = systemAlert0.getMessages();
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        main.models.UsageLogger usageLogger7 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList8 = usageLogger7.getRecords();
        sensor6.attach((main.models.Observer) usageLogger7);
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        java.lang.String str14 = usageData13.getEquipmentId();
        usageLogger7.update(usageData13);
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("hi!", "", localDateTime18);
        usageLogger7.update(usageData19);
        systemAlert0.update(usageData19);
        java.lang.Class<?> wildcardClass22 = usageData19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.lang.Class<?> wildcardClass2 = cSVDatabaseManager0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList6 = usageLogger5.getRecords();
        java.util.List<main.models.UsageData> usageDataList7 = usageLogger5.getRecords();
        java.util.List<main.models.UsageData> usageDataList8 = usageLogger5.getRecords();
        sensor2.attach((main.models.Observer) usageLogger5);
        java.lang.String str10 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        main.enums.SensorStatus sensorStatus14 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus15 = null;
        sensor2.setStatus(sensorStatus15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus14);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        java.util.List<main.models.Reservation> reservationList43 = cSVDatabaseManager34.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.Reservation[] reservationArray54 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList55 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList55, reservationArray54);
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager44.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        java.util.List<main.models.User> userList61 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
        java.util.List<java.lang.String> strList34 = systemAlert14.getMessages();
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
        org.junit.Assert.assertNotNull(strList34);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray7 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList8 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList8, equipmentArray7);
        cSVDatabaseManager6.writeEquipment((java.util.List<main.models.Equipment>) equipmentList8);
        main.models.Reservation[] reservationArray11 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList12 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList12, reservationArray11);
        cSVDatabaseManager6.writeReservations((java.util.List<main.models.Reservation>) reservationList12);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        cSVDatabaseManager6.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray22 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList23 = new java.util.ArrayList<main.models.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList23, userArray22);
        cSVDatabaseManager21.writeUsers((java.util.List<main.models.User>) userList23);
        cSVDatabaseManager6.writeUsers((java.util.List<main.models.User>) userList23);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList23);
        java.lang.Class<?> wildcardClass28 = databaseProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
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
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        main.models.Payment[] paymentArray32 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList33 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList33, paymentArray32);
        databaseProxy31.writePayments((java.util.List<main.models.Payment>) paymentList33);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList33);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList33);
        java.lang.Class<?> wildcardClass38 = paymentList33.getClass();
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
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
        java.lang.Class<?> wildcardClass14 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        sensor2.setSensorId("hi!");
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
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        main.models.SystemAlert systemAlert7 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList8 = systemAlert7.getMessages();
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "hi!", localDateTime11);
        systemAlert7.update(usageData12);
        systemAlert0.update(usageData12);
        java.lang.String str15 = usageData12.getEquipmentId();
        java.lang.String str16 = usageData12.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.time.LocalDateTime localDateTime4 = usageData3.getRecordedAt();
        java.lang.String str5 = usageData3.getOperationStatus();
        java.time.LocalDateTime localDateTime6 = usageData3.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
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
        main.enums.SensorStatus sensorStatus14 = null;
        sensor2.setStatus(sensorStatus14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        java.util.List<main.models.Equipment> equipmentList15 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy17 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager16);
        main.models.Payment[] paymentArray18 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList19 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList19, paymentArray18);
        databaseProxy17.writePayments((java.util.List<main.models.Payment>) paymentList19);
        java.util.List<main.models.Reservation> reservationList22 = databaseProxy17.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList22);
        java.lang.Class<?> wildcardClass24 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
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
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        main.models.Payment[] paymentArray32 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList33 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList33, paymentArray32);
        databaseProxy31.writePayments((java.util.List<main.models.Payment>) paymentList33);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList33);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList33);
        java.util.List<main.models.User> userList38 = databaseProxy1.readUsers();
        java.util.List<main.models.Reservation> reservationList39 = databaseProxy1.readReservations();
        java.lang.Class<?> wildcardClass40 = databaseProxy1.getClass();
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
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        sensor14.setSensorId("");
        sensor14.setSensorId("");
        java.time.LocalDateTime localDateTime19 = sensor14.getLastUpdateTime();
        main.models.UsageData usageData20 = new main.models.UsageData("", "hi!", localDateTime19);
        sensor2.setLastUpdateTime(localDateTime19);
        java.lang.Class<?> wildcardClass22 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
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
        java.util.List<main.models.Equipment> equipmentList15 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Payment> paymentList16 = cSVDatabaseManager0.readPayments();
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
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy48 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        main.models.Payment[] paymentArray49 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList50 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList50, paymentArray49);
        databaseProxy48.writePayments((java.util.List<main.models.Payment>) paymentList50);
        cSVDatabaseManager42.writePayments((java.util.List<main.models.Payment>) paymentList50);
        databaseProxy18.writePayments((java.util.List<main.models.Payment>) paymentList50);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList50);
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
        org.junit.Assert.assertNotNull(equipmentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList16);
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
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        java.lang.Class<?> wildcardClass58 = equipmentList51.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = sensor16.getLastUpdateTime();
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "hi!", localDateTime21);
        sensor2.setLastUpdateTime(localDateTime21);
        java.lang.String str24 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
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
        java.util.List<main.models.User> userList38 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime6 = sensor2.getLastUpdateTime();
        main.models.UsageLogger usageLogger7 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime10 = null;
        main.models.UsageData usageData11 = new main.models.UsageData("hi!", "", localDateTime10);
        usageLogger7.update(usageData11);
        main.enums.SensorStatus sensorStatus14 = null;
        main.models.Sensor sensor15 = new main.models.Sensor("hi!", sensorStatus14);
        sensor15.setSensorId("");
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        java.lang.String str22 = usageData21.getEquipmentId();
        java.time.LocalDateTime localDateTime23 = usageData21.getRecordedAt();
        sensor15.recordUsage(usageData21);
        sensor15.setSensorId("hi!");
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("", "hi!", localDateTime29);
        sensor15.notifyObservers(usageData30);
        usageLogger7.update(usageData30);
        sensor2.attach((main.models.Observer) usageLogger7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime23);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime8 = sensor2.getLastUpdateTime();
        main.models.UsageLogger usageLogger9 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        usageLogger9.update(usageData13);
        sensor2.attach((main.models.Observer) usageLogger9);
        main.enums.SensorStatus sensorStatus16 = null;
        sensor2.setStatus(sensorStatus16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
        java.util.List<main.models.UsageData> usageDataList40 = usageLogger23.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList40);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime3 = null;
        main.models.UsageData usageData4 = new main.models.UsageData("hi!", "", localDateTime3);
        usageLogger0.update(usageData4);
        main.models.SystemAlert systemAlert6 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList7 = systemAlert6.getMessages();
        java.time.LocalDateTime localDateTime10 = null;
        main.models.UsageData usageData11 = new main.models.UsageData("", "hi!", localDateTime10);
        systemAlert6.update(usageData11);
        usageLogger0.update(usageData11);
        java.util.List<main.models.UsageData> usageDataList14 = usageLogger0.getRecords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.lang.Class<?> wildcardClass7 = databaseProxy1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
        java.lang.Class<?> wildcardClass40 = sensor2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.time.LocalDateTime localDateTime8 = null;
        sensor2.setLastUpdateTime(localDateTime8);
        main.enums.SensorStatus sensorStatus11 = null;
        main.models.Sensor sensor12 = new main.models.Sensor("hi!", sensorStatus11);
        sensor12.setSensorId("");
        sensor12.setSensorId("");
        main.models.Observer observer17 = null;
        sensor12.detach(observer17);
        java.time.LocalDateTime localDateTime19 = sensor12.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.models.SystemAlert systemAlert5 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList6 = systemAlert5.getMessages();
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("", "hi!", localDateTime9);
        systemAlert5.update(usageData10);
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        java.time.LocalDateTime localDateTime17 = usageData15.getRecordedAt();
        java.time.LocalDateTime localDateTime18 = usageData15.getRecordedAt();
        systemAlert5.update(usageData15);
        sensor2.attach((main.models.Observer) systemAlert5);
        main.enums.SensorStatus sensorStatus22 = null;
        main.models.Sensor sensor23 = new main.models.Sensor("hi!", sensorStatus22);
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("hi!", "", localDateTime26);
        java.lang.String str28 = usageData27.getEquipmentId();
        sensor23.notifyObservers(usageData27);
        main.enums.SensorStatus sensorStatus30 = sensor23.getStatus();
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("hi!", "", localDateTime33);
        java.lang.String str35 = usageData34.getEquipmentId();
        java.time.LocalDateTime localDateTime36 = usageData34.getRecordedAt();
        java.time.LocalDateTime localDateTime37 = usageData34.getRecordedAt();
        java.lang.String str38 = usageData34.getOperationStatus();
        sensor23.recordUsage(usageData34);
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "hi!", localDateTime42);
        sensor23.recordUsage(usageData43);
        systemAlert5.update(usageData43);
        java.util.List<java.lang.String> strList46 = systemAlert5.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList46);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        main.models.Payment[] paymentArray32 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList33 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList33, paymentArray32);
        databaseProxy31.writePayments((java.util.List<main.models.Payment>) paymentList33);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList33);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList33);
        java.util.List<main.models.User> userList38 = databaseProxy1.readUsers();
        java.util.List<main.models.Reservation> reservationList39 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList40 = databaseProxy1.readPayments();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
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
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList40);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
        java.lang.Class<?> wildcardClass32 = userList27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        main.models.Payment[] paymentArray32 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList33 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList33, paymentArray32);
        databaseProxy31.writePayments((java.util.List<main.models.Payment>) paymentList33);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList33);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList33);
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
        main.models.CSVDatabaseManager cSVDatabaseManager56 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy57 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager56);
        java.util.List<main.models.User> userList58 = databaseProxy57.readUsers();
        main.models.User[] userArray59 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList60 = new java.util.ArrayList<main.models.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList60, userArray59);
        databaseProxy57.writeUsers((java.util.List<main.models.User>) userList60);
        databaseProxy39.writeUsers((java.util.List<main.models.User>) userList60);
        java.util.List<main.models.Reservation> reservationList64 = databaseProxy39.readReservations();
        java.util.List<main.models.Equipment> equipmentList65 = databaseProxy39.readEquipment();
        databaseProxy1.writeEquipment(equipmentList65);
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy68 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager67);
        main.models.User[] userArray69 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList70 = new java.util.ArrayList<main.models.User>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList70, userArray69);
        cSVDatabaseManager67.writeUsers((java.util.List<main.models.User>) userList70);
        java.util.List<main.models.Payment> paymentList73 = cSVDatabaseManager67.readPayments();
        java.util.List<main.models.User> userList74 = cSVDatabaseManager67.readUsers();
        java.util.List<main.models.Reservation> reservationList75 = cSVDatabaseManager67.readReservations();
        databaseProxy1.writeReservations(reservationList75);
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
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList75);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        main.models.Observer observer7 = null;
        sensor2.detach(observer7);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
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
        main.enums.SensorStatus sensorStatus19 = sensor2.getStatus();
        java.lang.String str20 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus21 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus22 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus22);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        main.models.UsageLogger usageLogger19 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList20 = usageLogger19.getRecords();
        sensor18.attach((main.models.Observer) usageLogger19);
        java.time.LocalDateTime localDateTime24 = null;
        main.models.UsageData usageData25 = new main.models.UsageData("hi!", "", localDateTime24);
        java.lang.String str26 = usageData25.getEquipmentId();
        usageLogger19.update(usageData25);
        main.enums.SensorStatus sensorStatus29 = null;
        main.models.Sensor sensor30 = new main.models.Sensor("hi!", sensorStatus29);
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("hi!", "", localDateTime33);
        java.lang.String str35 = usageData34.getEquipmentId();
        sensor30.notifyObservers(usageData34);
        usageLogger19.update(usageData34);
        sensor4.attach((main.models.Observer) usageLogger19);
        java.time.LocalDateTime localDateTime39 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData40 = new main.models.UsageData("", "hi!", localDateTime39);
        java.lang.String str41 = usageData40.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
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
        main.enums.SensorStatus sensorStatus37 = sensor2.getStatus();
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
        org.junit.Assert.assertNull(sensorStatus37);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus14 = null;
        sensor2.setStatus(sensorStatus14);
        main.enums.SensorStatus sensorStatus16 = null;
        sensor2.setStatus(sensorStatus16);
        java.time.LocalDateTime localDateTime18 = sensor2.getLastUpdateTime();
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus22 = null;
        main.models.Sensor sensor23 = new main.models.Sensor("hi!", sensorStatus22);
        sensor23.setSensorId("");
        sensor23.setSensorId("");
        main.models.UsageData usageData28 = null;
        sensor23.notifyObservers(usageData28);
        main.enums.SensorStatus sensorStatus33 = null;
        main.models.Sensor sensor34 = new main.models.Sensor("hi!", sensorStatus33);
        sensor34.setSensorId("");
        java.time.LocalDateTime localDateTime39 = null;
        main.models.UsageData usageData40 = new main.models.UsageData("hi!", "", localDateTime39);
        java.lang.String str41 = usageData40.getEquipmentId();
        java.time.LocalDateTime localDateTime42 = usageData40.getRecordedAt();
        java.time.LocalDateTime localDateTime43 = usageData40.getRecordedAt();
        java.lang.String str44 = usageData40.getOperationStatus();
        sensor34.recordUsage(usageData40);
        main.enums.SensorStatus sensorStatus47 = null;
        main.models.Sensor sensor48 = new main.models.Sensor("hi!", sensorStatus47);
        sensor48.setSensorId("");
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        java.time.LocalDateTime localDateTime56 = usageData54.getRecordedAt();
        java.time.LocalDateTime localDateTime57 = usageData54.getRecordedAt();
        java.lang.String str58 = usageData54.getOperationStatus();
        sensor48.recordUsage(usageData54);
        main.enums.SensorStatus sensorStatus61 = null;
        main.models.Sensor sensor62 = new main.models.Sensor("hi!", sensorStatus61);
        main.models.UsageLogger usageLogger63 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList64 = usageLogger63.getRecords();
        sensor62.attach((main.models.Observer) usageLogger63);
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        java.lang.String str70 = usageData69.getEquipmentId();
        usageLogger63.update(usageData69);
        main.enums.SensorStatus sensorStatus73 = null;
        main.models.Sensor sensor74 = new main.models.Sensor("hi!", sensorStatus73);
        java.time.LocalDateTime localDateTime77 = null;
        main.models.UsageData usageData78 = new main.models.UsageData("hi!", "", localDateTime77);
        java.lang.String str79 = usageData78.getEquipmentId();
        sensor74.notifyObservers(usageData78);
        usageLogger63.update(usageData78);
        sensor48.attach((main.models.Observer) usageLogger63);
        java.util.List<main.models.UsageData> usageDataList83 = usageLogger63.getRecords();
        sensor34.attach((main.models.Observer) usageLogger63);
        main.enums.SensorStatus sensorStatus88 = null;
        main.models.Sensor sensor89 = new main.models.Sensor("hi!", sensorStatus88);
        sensor89.setSensorId("");
        sensor89.setSensorId("");
        java.time.LocalDateTime localDateTime94 = sensor89.getLastUpdateTime();
        main.models.UsageData usageData95 = new main.models.UsageData("", "hi!", localDateTime94);
        sensor34.setLastUpdateTime(localDateTime94);
        main.models.UsageData usageData97 = new main.models.UsageData("", "", localDateTime94);
        sensor23.setLastUpdateTime(localDateTime94);
        sensor2.setLastUpdateTime(localDateTime94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "" + "'", str44.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "" + "'", str58.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime94);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.util.List<main.models.User> userList5 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList7 = cSVDatabaseManager6.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList7);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray14 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList15 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList15, equipmentArray14);
        cSVDatabaseManager13.writeEquipment((java.util.List<main.models.Equipment>) equipmentList15);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        cSVDatabaseManager18.writeReservations((java.util.List<main.models.Reservation>) reservationList24);
        cSVDatabaseManager13.writeReservations((java.util.List<main.models.Reservation>) reservationList24);
        databaseProxy12.writeReservations((java.util.List<main.models.Reservation>) reservationList24);
        databaseProxy10.writeReservations((java.util.List<main.models.Reservation>) reservationList24);
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        databaseProxy10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        java.util.List<main.models.Equipment> equipmentList34 = databaseProxy10.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList34);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
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
        databaseProxy37.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        main.models.Equipment[] equipmentArray57 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList58 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList58, equipmentArray57);
        databaseProxy37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList58);
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.CSVDatabaseManager cSVDatabaseManager66 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy67 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager66);
        main.models.Payment[] paymentArray68 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList69 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList69, paymentArray68);
        databaseProxy67.writePayments((java.util.List<main.models.Payment>) paymentList69);
        cSVDatabaseManager61.writePayments((java.util.List<main.models.Payment>) paymentList69);
        databaseProxy37.writePayments((java.util.List<main.models.Payment>) paymentList69);
        java.util.List<main.models.User> userList74 = databaseProxy37.readUsers();
        cSVDatabaseManager0.writeUsers(userList74);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
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
        org.junit.Assert.assertNotNull(equipmentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList74);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime3 = null;
        main.models.UsageData usageData4 = new main.models.UsageData("hi!", "", localDateTime3);
        usageLogger0.update(usageData4);
        main.models.UsageLogger usageLogger6 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        usageLogger6.update(usageData10);
        main.models.SystemAlert systemAlert12 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList13 = systemAlert12.getMessages();
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("", "hi!", localDateTime16);
        systemAlert12.update(usageData17);
        usageLogger6.update(usageData17);
        usageLogger0.update(usageData17);
        java.lang.String str21 = usageData17.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.time.LocalDateTime localDateTime78 = null;
        main.models.UsageData usageData79 = new main.models.UsageData("", "hi!", localDateTime78);
        usageLogger36.update(usageData79);
        java.util.List<main.models.UsageData> usageDataList81 = usageLogger36.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList81);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        main.models.User[] userArray14 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList15 = new java.util.ArrayList<main.models.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList15, userArray14);
        cSVDatabaseManager12.writeUsers((java.util.List<main.models.User>) userList15);
        java.util.List<main.models.Payment> paymentList18 = cSVDatabaseManager12.readPayments();
        java.util.List<main.models.User> userList19 = cSVDatabaseManager12.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy21 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager20);
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
        databaseProxy21.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        databaseProxy21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        java.util.List<main.models.User> userList44 = databaseProxy21.readUsers();
        cSVDatabaseManager12.writeUsers(userList44);
        cSVDatabaseManager0.writeUsers(userList44);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        sensor18.recordUsage(usageData24);
        sensor18.setSensorId("");
        main.models.UsageLogger usageLogger30 = new main.models.UsageLogger();
        sensor18.detach((main.models.Observer) usageLogger30);
        sensor2.detach((main.models.Observer) usageLogger30);
        java.time.LocalDateTime localDateTime35 = null;
        main.models.UsageData usageData36 = new main.models.UsageData("hi!", "", localDateTime35);
        java.lang.String str37 = usageData36.getEquipmentId();
        java.time.LocalDateTime localDateTime38 = usageData36.getRecordedAt();
        java.time.LocalDateTime localDateTime39 = usageData36.getRecordedAt();
        java.lang.String str40 = usageData36.getOperationStatus();
        java.lang.String str41 = usageData36.getEquipmentId();
        java.lang.String str42 = usageData36.getEquipmentId();
        usageLogger30.update(usageData36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!" + "'", str42.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
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
        main.enums.SensorStatus sensorStatus53 = null;
        main.models.Sensor sensor54 = new main.models.Sensor("hi!", sensorStatus53);
        main.enums.SensorStatus sensorStatus55 = null;
        sensor54.setStatus(sensorStatus55);
        main.models.UsageLogger usageLogger57 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime60 = null;
        main.models.UsageData usageData61 = new main.models.UsageData("hi!", "", localDateTime60);
        usageLogger57.update(usageData61);
        sensor54.detach((main.models.Observer) usageLogger57);
        main.enums.SensorStatus sensorStatus65 = null;
        main.models.Sensor sensor66 = new main.models.Sensor("hi!", sensorStatus65);
        java.time.LocalDateTime localDateTime69 = null;
        main.models.UsageData usageData70 = new main.models.UsageData("hi!", "", localDateTime69);
        java.lang.String str71 = usageData70.getEquipmentId();
        sensor66.notifyObservers(usageData70);
        java.time.LocalDateTime localDateTime75 = null;
        main.models.UsageData usageData76 = new main.models.UsageData("", "", localDateTime75);
        sensor66.notifyObservers(usageData76);
        sensor54.notifyObservers(usageData76);
        java.lang.String str79 = usageData76.getEquipmentId();
        sensor2.recordUsage(usageData76);
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
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "" + "'", str79.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
        databaseProxy11.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        databaseProxy11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager35.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.Reservation[] reservationArray56 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList57 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList57, reservationArray56);
        cSVDatabaseManager51.writeReservations((java.util.List<main.models.Reservation>) reservationList57);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager60.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.User> userList66 = cSVDatabaseManager51.readUsers();
        java.util.List<main.models.Equipment> equipmentList67 = cSVDatabaseManager51.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray69 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList70 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList70, equipmentArray69);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        main.models.Reservation[] reservationArray73 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList74 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList74, reservationArray73);
        cSVDatabaseManager68.writeReservations((java.util.List<main.models.Reservation>) reservationList74);
        main.models.CSVDatabaseManager cSVDatabaseManager77 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray78 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList79 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList79, equipmentArray78);
        cSVDatabaseManager77.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        databaseProxy11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        main.enums.SensorStatus sensorStatus16 = null;
        main.models.Sensor sensor17 = new main.models.Sensor("hi!", sensorStatus16);
        main.enums.SensorStatus sensorStatus18 = null;
        sensor17.setStatus(sensorStatus18);
        main.models.UsageLogger usageLogger20 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        usageLogger20.update(usageData24);
        sensor17.detach((main.models.Observer) usageLogger20);
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("hi!", "", localDateTime29);
        java.lang.String str31 = usageData30.getEquipmentId();
        usageLogger20.update(usageData30);
        java.util.List<main.models.UsageData> usageDataList33 = usageLogger20.getRecords();
        main.enums.SensorStatus sensorStatus35 = null;
        main.models.Sensor sensor36 = new main.models.Sensor("hi!", sensorStatus35);
        sensor36.setSensorId("");
        java.time.LocalDateTime localDateTime41 = null;
        main.models.UsageData usageData42 = new main.models.UsageData("hi!", "", localDateTime41);
        java.lang.String str43 = usageData42.getEquipmentId();
        java.time.LocalDateTime localDateTime44 = usageData42.getRecordedAt();
        sensor36.recordUsage(usageData42);
        usageLogger20.update(usageData42);
        sensor2.notifyObservers(usageData42);
        sensor2.setSensorId("hi!");
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
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime44);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
        java.util.List<main.models.Reservation> reservationList11 = null;
        cSVDatabaseManager0.writeReservations(reservationList11);
        java.util.List<main.models.User> userList13 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
        main.models.UsageLogger usageLogger33 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList34 = usageLogger33.getRecords();
        sensor32.attach((main.models.Observer) usageLogger33);
        java.time.LocalDateTime localDateTime38 = null;
        main.models.UsageData usageData39 = new main.models.UsageData("hi!", "", localDateTime38);
        java.lang.String str40 = usageData39.getEquipmentId();
        usageLogger33.update(usageData39);
        main.enums.SensorStatus sensorStatus43 = null;
        main.models.Sensor sensor44 = new main.models.Sensor("hi!", sensorStatus43);
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("hi!", "", localDateTime47);
        java.lang.String str49 = usageData48.getEquipmentId();
        sensor44.notifyObservers(usageData48);
        usageLogger33.update(usageData48);
        sensor18.attach((main.models.Observer) usageLogger33);
        java.util.List<main.models.UsageData> usageDataList53 = usageLogger33.getRecords();
        sensor4.attach((main.models.Observer) usageLogger33);
        main.enums.SensorStatus sensorStatus58 = null;
        main.models.Sensor sensor59 = new main.models.Sensor("hi!", sensorStatus58);
        sensor59.setSensorId("");
        sensor59.setSensorId("");
        java.time.LocalDateTime localDateTime64 = sensor59.getLastUpdateTime();
        main.models.UsageData usageData65 = new main.models.UsageData("", "hi!", localDateTime64);
        sensor4.setLastUpdateTime(localDateTime64);
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "hi!", localDateTime64);
        java.lang.String str68 = usageData67.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy31 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager30);
        main.models.Payment[] paymentArray32 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList33 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList33, paymentArray32);
        databaseProxy31.writePayments((java.util.List<main.models.Payment>) paymentList33);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList33);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList33);
        java.util.List<main.models.Reservation> reservationList38 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList38);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList8 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.User> userList9 = cSVDatabaseManager0.readUsers();
        main.models.User[] userArray10 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList11 = new java.util.ArrayList<main.models.User>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList11, userArray10);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList11);
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
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy19 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager18);
        java.util.List<main.models.User> userList20 = databaseProxy19.readUsers();
        main.models.User[] userArray21 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList22 = new java.util.ArrayList<main.models.User>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList22, userArray21);
        databaseProxy19.writeUsers((java.util.List<main.models.User>) userList22);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.Payment[] paymentArray30 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList31 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList31, paymentArray30);
        cSVDatabaseManager25.writePayments((java.util.List<main.models.Payment>) paymentList31);
        java.util.List<main.models.Payment> paymentList34 = cSVDatabaseManager25.readPayments();
        databaseProxy19.writePayments(paymentList34);
        databaseProxy1.writePayments(paymentList34);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
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
        org.junit.Assert.assertNotNull(paymentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList34);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger5.getRecords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = sensor20.getLastUpdateTime();
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "hi!", localDateTime25);
        sensor4.setLastUpdateTime(localDateTime25);
        java.time.LocalDateTime localDateTime28 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData29 = new main.models.UsageData("", "", localDateTime28);
        java.lang.String str30 = usageData29.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        java.time.LocalDateTime localDateTime37 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime38 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertNotNull(localDateTime37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("hi!");
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        java.time.LocalDateTime localDateTime24 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus25 = null;
        sensor2.setStatus(sensorStatus25);
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
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
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
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.Reservation[] reservationArray23 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList24 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList24, reservationArray23);
        cSVDatabaseManager18.writeReservations((java.util.List<main.models.Reservation>) reservationList24);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        java.util.List<main.models.User> userList33 = cSVDatabaseManager18.readUsers();
        java.util.List<main.models.Equipment> equipmentList34 = cSVDatabaseManager18.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager35.readUsers();
        cSVDatabaseManager18.writeUsers(userList50);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray53 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList54 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList54, equipmentArray53);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        main.models.Equipment[] equipmentArray57 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList58 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList58, equipmentArray57);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList58);
        java.util.List<main.models.Reservation> reservationList61 = cSVDatabaseManager52.readReservations();
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
        cSVDatabaseManager52.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        cSVDatabaseManager18.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList73);
        main.models.DatabaseProxy databaseProxy80 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.lang.Class<?> wildcardClass81 = databaseProxy80.getClass();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList34);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList61);
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        java.time.LocalDateTime localDateTime27 = sensor2.getLastUpdateTime();
        java.lang.Class<?> wildcardClass28 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        java.util.List<main.models.Equipment> equipmentList18 = databaseProxy1.readEquipment();
        java.util.List<main.models.Payment> paymentList19 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Reservation[] reservationArray25 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList26 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList26, reservationArray25);
        cSVDatabaseManager20.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        java.util.List<main.models.User> userList35 = cSVDatabaseManager20.readUsers();
        java.util.List<main.models.Equipment> equipmentList36 = cSVDatabaseManager20.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.Reservation[] reservationArray42 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList43 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList43, reservationArray42);
        cSVDatabaseManager37.writeReservations((java.util.List<main.models.Reservation>) reservationList43);
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        java.util.List<main.models.User> userList52 = cSVDatabaseManager37.readUsers();
        cSVDatabaseManager20.writeUsers(userList52);
        java.util.List<main.models.Reservation> reservationList54 = cSVDatabaseManager20.readReservations();
        java.util.List<main.models.Equipment> equipmentList55 = cSVDatabaseManager20.readEquipment();
        databaseProxy1.writeEquipment(equipmentList55);
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
        org.junit.Assert.assertNotNull(equipmentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList19);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList55);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        java.time.LocalDateTime localDateTime12 = usageData10.getRecordedAt();
        sensor4.recordUsage(usageData10);
        sensor4.setSensorId("hi!");
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("", "hi!", localDateTime18);
        sensor4.notifyObservers(usageData19);
        main.enums.SensorStatus sensorStatus21 = sensor4.getStatus();
        main.models.SystemAlert systemAlert22 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList23 = systemAlert22.getMessages();
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("", "hi!", localDateTime26);
        systemAlert22.update(usageData27);
        main.models.SystemAlert systemAlert29 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList30 = systemAlert29.getMessages();
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("", "hi!", localDateTime33);
        systemAlert29.update(usageData34);
        systemAlert22.update(usageData34);
        sensor4.detach((main.models.Observer) systemAlert22);
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        sensor40.setSensorId("");
        java.lang.String str43 = sensor40.getSensorId();
        java.time.LocalDateTime localDateTime44 = sensor40.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        sensor47.setSensorId("");
        java.lang.String str50 = sensor47.getSensorId();
        java.time.LocalDateTime localDateTime51 = sensor47.getLastUpdateTime();
        sensor40.setLastUpdateTime(localDateTime51);
        sensor4.setLastUpdateTime(localDateTime51);
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime51);
        java.time.LocalDateTime localDateTime55 = usageData54.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        java.time.LocalDateTime localDateTime78 = null;
        main.models.UsageData usageData79 = new main.models.UsageData("", "hi!", localDateTime78);
        usageLogger36.update(usageData79);
        java.lang.Class<?> wildcardClass81 = usageData79.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
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
        main.enums.SensorStatus sensorStatus41 = null;
        main.models.Sensor sensor42 = new main.models.Sensor("hi!", sensorStatus41);
        main.models.UsageLogger usageLogger43 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList44 = usageLogger43.getRecords();
        sensor42.attach((main.models.Observer) usageLogger43);
        java.time.LocalDateTime localDateTime48 = null;
        main.models.UsageData usageData49 = new main.models.UsageData("hi!", "", localDateTime48);
        java.lang.String str50 = usageData49.getEquipmentId();
        usageLogger43.update(usageData49);
        main.enums.SensorStatus sensorStatus53 = null;
        main.models.Sensor sensor54 = new main.models.Sensor("hi!", sensorStatus53);
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("hi!", "", localDateTime57);
        java.lang.String str59 = usageData58.getEquipmentId();
        sensor54.notifyObservers(usageData58);
        usageLogger43.update(usageData58);
        sensor2.detach((main.models.Observer) usageLogger43);
        main.enums.SensorStatus sensorStatus63 = sensor2.getStatus();
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
        org.junit.Assert.assertNotNull(usageDataList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus63);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList3 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime6 = null;
        main.models.UsageData usageData7 = new main.models.UsageData("", "", localDateTime6);
        systemAlert0.update(usageData7);
        java.lang.String str9 = usageData7.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.Reservation[] reservationArray15 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList16 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList16, reservationArray15);
        cSVDatabaseManager10.writeReservations((java.util.List<main.models.Reservation>) reservationList16);
        cSVDatabaseManager5.writeReservations((java.util.List<main.models.Reservation>) reservationList16);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList16);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
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
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = sensor18.getLastUpdateTime();
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "hi!", localDateTime23);
        sensor2.recordUsage(usageData24);
        java.time.LocalDateTime localDateTime26 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus27 = null;
        sensor2.setStatus(sensorStatus27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
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
        java.util.List<main.models.User> userList21 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager22 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy23 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager22);
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager24);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        main.models.CSVDatabaseManager cSVDatabaseManager31 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray32 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList33 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList33, equipmentArray32);
        cSVDatabaseManager31.writeEquipment((java.util.List<main.models.Equipment>) equipmentList33);
        main.models.Reservation[] reservationArray36 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList37 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList37, reservationArray36);
        cSVDatabaseManager31.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        cSVDatabaseManager26.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        databaseProxy25.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        databaseProxy23.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        databaseProxy23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy53 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager52);
        main.models.Payment[] paymentArray54 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList55 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList55, paymentArray54);
        databaseProxy53.writePayments((java.util.List<main.models.Payment>) paymentList55);
        cSVDatabaseManager47.writePayments((java.util.List<main.models.Payment>) paymentList55);
        databaseProxy23.writePayments((java.util.List<main.models.Payment>) paymentList55);
        java.util.List<main.models.User> userList60 = databaseProxy23.readUsers();
        databaseProxy1.writeUsers(userList60);
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
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
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
        java.time.LocalDateTime localDateTime84 = usageData80.getRecordedAt();
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
        org.junit.Assert.assertNull(localDateTime84);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        java.util.List<java.lang.String> strList7 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList8 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy24 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager23);
        main.models.Payment[] paymentArray25 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList26 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList26, paymentArray25);
        databaseProxy24.writePayments((java.util.List<main.models.Payment>) paymentList26);
        cSVDatabaseManager18.writePayments((java.util.List<main.models.Payment>) paymentList26);
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        main.models.Reservation[] reservationArray39 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList40 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList40, reservationArray39);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        java.util.List<main.models.User> userList49 = cSVDatabaseManager34.readUsers();
        java.util.List<main.models.Equipment> equipmentList50 = cSVDatabaseManager34.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.Reservation[] reservationArray56 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList57 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList57, reservationArray56);
        cSVDatabaseManager51.writeReservations((java.util.List<main.models.Reservation>) reservationList57);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager60.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.User> userList68 = cSVDatabaseManager18.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        main.models.Equipment[] equipmentArray74 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList75 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList75, equipmentArray74);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        java.util.List<main.models.Reservation> reservationList78 = cSVDatabaseManager69.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager79 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray80 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList81 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList81, equipmentArray80);
        cSVDatabaseManager79.writeEquipment((java.util.List<main.models.Equipment>) equipmentList81);
        main.models.CSVDatabaseManager cSVDatabaseManager84 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray85 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList86 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList86, equipmentArray85);
        cSVDatabaseManager84.writeEquipment((java.util.List<main.models.Equipment>) equipmentList86);
        main.models.Reservation[] reservationArray89 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList90 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList90, reservationArray89);
        cSVDatabaseManager84.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        cSVDatabaseManager79.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        cSVDatabaseManager69.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        cSVDatabaseManager18.writeReservations((java.util.List<main.models.Reservation>) reservationList90);
        java.util.List<main.models.User> userList96 = cSVDatabaseManager18.readUsers();
        cSVDatabaseManager0.writeUsers(userList96);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList96);
    }
}

