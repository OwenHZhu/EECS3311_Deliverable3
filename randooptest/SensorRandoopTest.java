package test.java.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
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
        java.lang.String str55 = usageData50.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        sensor4.notifyObservers(usageData8);
        main.enums.SensorStatus sensorStatus11 = sensor4.getStatus();
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = sensor16.getLastUpdateTime();
        main.models.UsageData usageData22 = new main.models.UsageData("", "hi!", localDateTime21);
        sensor4.setLastUpdateTime(localDateTime21);
        main.models.UsageData usageData24 = new main.models.UsageData("", "hi!", localDateTime21);
        java.lang.String str25 = usageData24.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
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
        java.lang.Class<?> wildcardClass60 = usageData55.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
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
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        cSVDatabaseManager39.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
        main.models.Reservation[] reservationArray44 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList45 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList45, reservationArray44);
        cSVDatabaseManager39.writeReservations((java.util.List<main.models.Reservation>) reservationList45);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList45);
        databaseProxy33.writeReservations((java.util.List<main.models.Reservation>) reservationList45);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy51 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager50);
        java.util.List<main.models.User> userList52 = databaseProxy51.readUsers();
        main.models.User[] userArray53 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList54 = new java.util.ArrayList<main.models.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList54, userArray53);
        databaseProxy51.writeUsers((java.util.List<main.models.User>) userList54);
        databaseProxy33.writeUsers((java.util.List<main.models.User>) userList54);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy59 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager58);
        main.models.User[] userArray60 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList61 = new java.util.ArrayList<main.models.User>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList61, userArray60);
        cSVDatabaseManager58.writeUsers((java.util.List<main.models.User>) userList61);
        java.util.List<main.models.Payment> paymentList64 = cSVDatabaseManager58.readPayments();
        databaseProxy33.writePayments(paymentList64);
        java.util.List<main.models.User> userList66 = databaseProxy33.readUsers();
        databaseProxy1.writeUsers(userList66);
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray69 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList70 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList70, equipmentArray69);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        main.models.CSVDatabaseManager cSVDatabaseManager73 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy74 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager73);
        main.models.Payment[] paymentArray75 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList76 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList76, paymentArray75);
        databaseProxy74.writePayments((java.util.List<main.models.Payment>) paymentList76);
        cSVDatabaseManager68.writePayments((java.util.List<main.models.Payment>) paymentList76);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList76);
        main.models.DatabaseProxy databaseProxy81 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
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
        main.models.DatabaseProxy databaseProxy17 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager16);
        java.util.List<main.models.User> userList18 = databaseProxy17.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager19);
        java.util.List<main.models.User> userList21 = databaseProxy20.readUsers();
        databaseProxy17.writeUsers(userList21);
        java.util.List<main.models.Equipment> equipmentList23 = databaseProxy17.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager24);
        java.util.List<main.models.User> userList26 = databaseProxy25.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager27);
        java.util.List<main.models.User> userList29 = databaseProxy28.readUsers();
        databaseProxy25.writeUsers(userList29);
        main.models.CSVDatabaseManager cSVDatabaseManager31 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy32 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager31);
        java.util.List<main.models.User> userList33 = databaseProxy32.readUsers();
        databaseProxy25.writeUsers(userList33);
        databaseProxy17.writeUsers(userList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        main.models.Equipment[] equipmentArray41 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList42 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList42, equipmentArray41);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
        java.util.List<main.models.User> userList45 = cSVDatabaseManager36.readUsers();
        databaseProxy17.writeUsers(userList45);
        cSVDatabaseManager0.writeUsers(userList45);
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
        org.junit.Assert.assertNotNull(userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
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
        java.util.List<main.models.User> userList17 = cSVDatabaseManager0.readUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
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
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
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
        java.util.List<main.models.Payment> paymentList61 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        main.models.Reservation[] reservationArray74 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList75 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList75, reservationArray74);
        cSVDatabaseManager69.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        cSVDatabaseManager64.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        databaseProxy63.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        main.models.CSVDatabaseManager cSVDatabaseManager80 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        cSVDatabaseManager80.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        databaseProxy63.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        java.util.List<main.models.Reservation> reservationList86 = databaseProxy63.readReservations();
        java.util.List<main.models.User> userList87 = databaseProxy63.readUsers();
        cSVDatabaseManager0.writeUsers(userList87);
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
        org.junit.Assert.assertNotNull(paymentList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList87);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
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
        main.enums.SensorStatus sensorStatus38 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus39 = sensor2.getStatus();
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
        org.junit.Assert.assertNull(sensorStatus38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus39);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
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
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        java.util.List<main.models.User> userList56 = cSVDatabaseManager51.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList58 = cSVDatabaseManager57.readReservations();
        cSVDatabaseManager51.writeReservations(reservationList58);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy61 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager60);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        main.models.Reservation[] reservationArray74 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList75 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList75, reservationArray74);
        cSVDatabaseManager69.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        cSVDatabaseManager64.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        databaseProxy63.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        databaseProxy61.writeReservations((java.util.List<main.models.Reservation>) reservationList75);
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        databaseProxy61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        java.util.List<main.models.Equipment> equipmentList85 = databaseProxy61.readEquipment();
        cSVDatabaseManager51.writeEquipment(equipmentList85);
        cSVDatabaseManager0.writeEquipment(equipmentList85);
        java.util.List<main.models.Equipment> equipmentList88 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
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
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList88);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
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
        java.time.LocalDateTime localDateTime84 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus88 = null;
        main.models.Sensor sensor89 = new main.models.Sensor("hi!", sensorStatus88);
        sensor89.setSensorId("");
        sensor89.setSensorId("");
        java.time.LocalDateTime localDateTime94 = sensor89.getLastUpdateTime();
        main.models.UsageData usageData95 = new main.models.UsageData("hi!", "hi!", localDateTime94);
        java.lang.String str96 = usageData95.getEquipmentId();
        sensor2.notifyObservers(usageData95);
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
        org.junit.Assert.assertNotNull(localDateTime84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str96 + "' != '" + "hi!" + "'", str96.equals("hi!"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray1 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList2 = new java.util.ArrayList<main.models.User>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList2, userArray1);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList2);
        main.models.CSVDatabaseManager cSVDatabaseManager5 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray6 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList7 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList7, equipmentArray6);
        cSVDatabaseManager5.writeEquipment((java.util.List<main.models.Equipment>) equipmentList7);
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy11 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager10);
        main.models.Payment[] paymentArray12 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList13 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList13, paymentArray12);
        databaseProxy11.writePayments((java.util.List<main.models.Payment>) paymentList13);
        cSVDatabaseManager5.writePayments((java.util.List<main.models.Payment>) paymentList13);
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager5.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
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
        java.util.List<main.models.User> userList36 = cSVDatabaseManager21.readUsers();
        java.util.List<main.models.Equipment> equipmentList37 = cSVDatabaseManager21.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        cSVDatabaseManager5.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        java.util.List<main.models.User> userList55 = cSVDatabaseManager5.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager56 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray57 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList58 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList58, equipmentArray57);
        cSVDatabaseManager56.writeEquipment((java.util.List<main.models.Equipment>) equipmentList58);
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager56.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.Reservation> reservationList65 = cSVDatabaseManager56.readReservations();
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
        cSVDatabaseManager56.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        cSVDatabaseManager5.writeReservations((java.util.List<main.models.Reservation>) reservationList77);
        java.util.List<main.models.Payment> paymentList83 = cSVDatabaseManager5.readPayments();
        cSVDatabaseManager0.writePayments(paymentList83);
        main.models.Reservation[] reservationArray85 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList86 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList86, reservationArray85);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray1);
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
        org.junit.Assert.assertNotNull(paymentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        org.junit.Assert.assertNotNull(userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList65);
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
        org.junit.Assert.assertNotNull(paymentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
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
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy50 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager49);
        main.models.Payment[] paymentArray51 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList52 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList52, paymentArray51);
        databaseProxy50.writePayments((java.util.List<main.models.Payment>) paymentList52);
        cSVDatabaseManager44.writePayments((java.util.List<main.models.Payment>) paymentList52);
        databaseProxy20.writePayments((java.util.List<main.models.Payment>) paymentList52);
        java.util.List<main.models.User> userList57 = databaseProxy20.readUsers();
        cSVDatabaseManager0.writeUsers(userList57);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy60 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager59);
        main.models.User[] userArray61 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList62 = new java.util.ArrayList<main.models.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList62, userArray61);
        cSVDatabaseManager59.writeUsers((java.util.List<main.models.User>) userList62);
        java.util.List<main.models.Payment> paymentList65 = cSVDatabaseManager59.readPayments();
        java.util.List<main.models.User> userList66 = cSVDatabaseManager59.readUsers();
        java.util.List<main.models.Equipment> equipmentList67 = cSVDatabaseManager59.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList67);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
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
        org.junit.Assert.assertNotNull(equipmentList67);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
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
        java.util.List<main.models.UsageData> usageDataList55 = usageLogger0.getRecords();
        main.models.SystemAlert systemAlert56 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList57 = systemAlert56.getMessages();
        java.util.List<java.lang.String> strList58 = systemAlert56.getMessages();
        java.util.List<java.lang.String> strList59 = systemAlert56.getMessages();
        main.enums.SensorStatus sensorStatus61 = null;
        main.models.Sensor sensor62 = new main.models.Sensor("hi!", sensorStatus61);
        main.models.UsageLogger usageLogger63 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList64 = usageLogger63.getRecords();
        sensor62.attach((main.models.Observer) usageLogger63);
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        java.lang.String str70 = usageData69.getEquipmentId();
        usageLogger63.update(usageData69);
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("hi!", "", localDateTime74);
        usageLogger63.update(usageData75);
        systemAlert56.update(usageData75);
        java.lang.String str78 = usageData75.getOperationStatus();
        usageLogger0.update(usageData75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!" + "'", str45.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
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
        java.util.List<main.models.Payment> paymentList24 = databaseProxy1.readPayments();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.util.List<main.models.Payment> paymentList26 = databaseProxy25.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
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
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        java.util.List<main.models.User> userList48 = databaseProxy1.readUsers();
        java.util.List<main.models.Equipment> equipmentList49 = databaseProxy1.readEquipment();
        java.lang.Class<?> wildcardClass50 = databaseProxy1.getClass();
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
        org.junit.Assert.assertNotNull(reservationArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
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
        java.util.List<main.models.Payment> paymentList12 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = sensor2.getStatus();
        main.models.UsageLogger usageLogger9 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList10 = usageLogger9.getRecords();
        sensor2.detach((main.models.Observer) usageLogger9);
        java.util.List<main.models.UsageData> usageDataList12 = usageLogger9.getRecords();
        java.util.List<main.models.UsageData> usageDataList13 = usageLogger9.getRecords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.SystemAlert systemAlert3 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList4 = systemAlert3.getMessages();
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("", "hi!", localDateTime7);
        systemAlert3.update(usageData8);
        sensor2.notifyObservers(usageData8);
        main.enums.SensorStatus sensorStatus14 = null;
        main.models.Sensor sensor15 = new main.models.Sensor("hi!", sensorStatus14);
        sensor15.setSensorId("");
        sensor15.setSensorId("");
        java.time.LocalDateTime localDateTime20 = sensor15.getLastUpdateTime();
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "hi!", localDateTime20);
        sensor2.notifyObservers(usageData21);
        java.lang.String str23 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        sensor6.notifyObservers(usageData10);
        main.enums.SensorStatus sensorStatus13 = sensor6.getStatus();
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = sensor18.getLastUpdateTime();
        main.models.UsageData usageData24 = new main.models.UsageData("", "hi!", localDateTime23);
        sensor6.setLastUpdateTime(localDateTime23);
        main.models.UsageData usageData26 = new main.models.UsageData("", "hi!", localDateTime23);
        main.models.UsageData usageData27 = new main.models.UsageData("", "hi!", localDateTime23);
        java.lang.String str28 = usageData27.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
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
        java.util.List<main.models.User> userList66 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList66);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
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
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus35 = null;
        main.models.Sensor sensor36 = new main.models.Sensor("hi!", sensorStatus35);
        java.time.LocalDateTime localDateTime39 = null;
        main.models.UsageData usageData40 = new main.models.UsageData("hi!", "", localDateTime39);
        java.lang.String str41 = usageData40.getEquipmentId();
        sensor36.notifyObservers(usageData40);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("", "", localDateTime45);
        sensor36.notifyObservers(usageData46);
        main.models.SystemAlert systemAlert48 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList49 = systemAlert48.getMessages();
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("", "hi!", localDateTime52);
        systemAlert48.update(usageData53);
        java.util.List<java.lang.String> strList55 = systemAlert48.getMessages();
        main.models.SystemAlert systemAlert56 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList57 = systemAlert56.getMessages();
        java.util.List<java.lang.String> strList58 = systemAlert56.getMessages();
        main.models.UsageLogger usageLogger59 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime62 = null;
        main.models.UsageData usageData63 = new main.models.UsageData("hi!", "", localDateTime62);
        usageLogger59.update(usageData63);
        systemAlert56.update(usageData63);
        systemAlert48.update(usageData63);
        sensor36.attach((main.models.Observer) systemAlert48);
        java.time.LocalDateTime localDateTime70 = null;
        main.models.UsageData usageData71 = new main.models.UsageData("", "", localDateTime70);
        sensor36.recordUsage(usageData71);
        sensor2.recordUsage(usageData71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList58);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
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
        java.util.List<main.models.User> userList10 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy17 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager16);
        main.models.Payment[] paymentArray18 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList19 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList19, paymentArray18);
        databaseProxy17.writePayments((java.util.List<main.models.Payment>) paymentList19);
        cSVDatabaseManager11.writePayments((java.util.List<main.models.Payment>) paymentList19);
        main.models.Equipment[] equipmentArray23 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList24 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList24, equipmentArray23);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList24);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        java.util.List<main.models.User> userList42 = cSVDatabaseManager27.readUsers();
        java.util.List<main.models.Equipment> equipmentList43 = cSVDatabaseManager27.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        cSVDatabaseManager44.writeReservations((java.util.List<main.models.Reservation>) reservationList50);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        java.util.List<main.models.User> userList61 = cSVDatabaseManager11.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray63 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList64 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList64, equipmentArray63);
        cSVDatabaseManager62.writeEquipment((java.util.List<main.models.Equipment>) equipmentList64);
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        cSVDatabaseManager62.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        java.util.List<main.models.Reservation> reservationList71 = cSVDatabaseManager62.readReservations();
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
        cSVDatabaseManager62.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        cSVDatabaseManager11.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        main.models.CSVDatabaseManager cSVDatabaseManager89 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy90 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager89);
        main.models.Payment[] paymentArray91 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList92 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList92, paymentArray91);
        databaseProxy90.writePayments((java.util.List<main.models.Payment>) paymentList92);
        main.models.DatabaseProxy databaseProxy95 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy90);
        java.util.List<main.models.Equipment> equipmentList96 = databaseProxy90.readEquipment();
        cSVDatabaseManager11.writeEquipment(equipmentList96);
        cSVDatabaseManager0.writeEquipment(equipmentList96);
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
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList43);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList96);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
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
        java.util.List<main.models.UsageData> usageDataList63 = usageLogger43.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList63);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
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
        java.util.List<main.models.Payment> paymentList20 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList21 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(paymentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList1 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.Reservation[] reservationArray7 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList8 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList8, reservationArray7);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList8);
        java.util.List<main.models.Equipment> equipmentList11 = cSVDatabaseManager2.readEquipment();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager2);
        java.util.List<main.models.Equipment> equipmentList13 = databaseProxy12.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList15 = cSVDatabaseManager14.readReservations();
        databaseProxy12.writeReservations(reservationList15);
        cSVDatabaseManager0.writeReservations(reservationList15);
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
        org.junit.Assert.assertNotNull(reservationArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
        java.util.List<main.models.User> userList9 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.User> userList10 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        java.util.List<main.models.User> userList20 = cSVDatabaseManager11.readUsers();
        java.util.List<main.models.Equipment> equipmentList21 = cSVDatabaseManager11.readEquipment();
        java.util.List<main.models.Equipment> equipmentList22 = cSVDatabaseManager11.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList22);
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
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        databaseProxy25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        java.util.List<main.models.Reservation> reservationList48 = databaseProxy25.readReservations();
        java.util.List<main.models.User> userList49 = databaseProxy25.readUsers();
        java.util.List<main.models.Payment> paymentList50 = databaseProxy25.readPayments();
        cSVDatabaseManager0.writePayments(paymentList50);
        java.util.List<main.models.Payment> paymentList52 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList52);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
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
        main.models.Payment[] paymentArray69 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList70 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList70, paymentArray69);
        databaseProxy68.writePayments((java.util.List<main.models.Payment>) paymentList70);
        main.models.DatabaseProxy databaseProxy73 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy68);
        java.util.List<main.models.Equipment> equipmentList74 = databaseProxy68.readEquipment();
        java.util.List<main.models.Payment> paymentList75 = databaseProxy68.readPayments();
        databaseProxy1.writePayments(paymentList75);
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
        org.junit.Assert.assertNotNull(paymentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList75);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        sensor2.setSensorId("hi!");
        java.lang.String str12 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus13 = null;
        sensor2.setStatus(sensorStatus13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
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
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        java.util.List<main.models.Reservation> reservationList60 = cSVDatabaseManager51.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.CSVDatabaseManager cSVDatabaseManager66 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        cSVDatabaseManager66.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.Reservation[] reservationArray71 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList72 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList72, reservationArray71);
        cSVDatabaseManager66.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        cSVDatabaseManager61.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        cSVDatabaseManager51.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        java.util.List<main.models.User> userList78 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList79 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList79);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
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
        databaseProxy9.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy27 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager26);
        java.util.List<main.models.User> userList28 = databaseProxy27.readUsers();
        main.models.User[] userArray29 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList30 = new java.util.ArrayList<main.models.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList30, userArray29);
        databaseProxy27.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy9.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList30);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        cSVDatabaseManager42.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        cSVDatabaseManager37.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        databaseProxy36.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        java.util.List<main.models.Reservation> reservationList53 = databaseProxy36.readReservations();
        databaseProxy1.writeReservations(reservationList53);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy56 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager55);
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy58 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager57);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        main.models.Reservation[] reservationArray69 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList70 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList70, reservationArray69);
        cSVDatabaseManager64.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        cSVDatabaseManager59.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        databaseProxy58.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        databaseProxy56.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        main.models.Equipment[] equipmentArray76 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList77 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList77, equipmentArray76);
        databaseProxy56.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        main.models.CSVDatabaseManager cSVDatabaseManager80 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        cSVDatabaseManager80.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        main.models.CSVDatabaseManager cSVDatabaseManager85 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy86 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager85);
        main.models.Payment[] paymentArray87 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList88 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList88, paymentArray87);
        databaseProxy86.writePayments((java.util.List<main.models.Payment>) paymentList88);
        cSVDatabaseManager80.writePayments((java.util.List<main.models.Payment>) paymentList88);
        databaseProxy56.writePayments((java.util.List<main.models.Payment>) paymentList88);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList88);
        java.util.List<main.models.Equipment> equipmentList94 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
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
        org.junit.Assert.assertNotNull(reservationArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList94);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
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
        java.util.List<main.models.Reservation> reservationList16 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList8 = databaseProxy1.readReservations();
        java.lang.Class<?> wildcardClass9 = databaseProxy1.getClass();
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
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList6 = usageLogger5.getRecords();
        java.util.List<main.models.UsageData> usageDataList7 = usageLogger5.getRecords();
        java.util.List<main.models.UsageData> usageDataList8 = usageLogger5.getRecords();
        sensor2.attach((main.models.Observer) usageLogger5);
        java.lang.Class<?> wildcardClass10 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
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
        sensor54.setSensorId("");
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        java.lang.String str61 = usageData60.getEquipmentId();
        java.time.LocalDateTime localDateTime62 = usageData60.getRecordedAt();
        java.time.LocalDateTime localDateTime63 = usageData60.getRecordedAt();
        java.lang.String str64 = usageData60.getOperationStatus();
        sensor54.recordUsage(usageData60);
        main.models.SystemAlert systemAlert66 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList67 = systemAlert66.getMessages();
        java.util.List<java.lang.String> strList68 = systemAlert66.getMessages();
        main.models.UsageLogger usageLogger69 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime72 = null;
        main.models.UsageData usageData73 = new main.models.UsageData("hi!", "", localDateTime72);
        usageLogger69.update(usageData73);
        systemAlert66.update(usageData73);
        sensor54.notifyObservers(usageData73);
        main.enums.SensorStatus sensorStatus78 = null;
        main.models.Sensor sensor79 = new main.models.Sensor("hi!", sensorStatus78);
        main.enums.SensorStatus sensorStatus80 = null;
        sensor79.setStatus(sensorStatus80);
        main.models.UsageLogger usageLogger82 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList83 = usageLogger82.getRecords();
        java.util.List<main.models.UsageData> usageDataList84 = usageLogger82.getRecords();
        java.util.List<main.models.UsageData> usageDataList85 = usageLogger82.getRecords();
        sensor79.attach((main.models.Observer) usageLogger82);
        sensor54.attach((main.models.Observer) usageLogger82);
        sensor2.detach((main.models.Observer) usageLogger82);
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
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList85);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        sensor2.setSensorId("hi!");
        java.lang.String str8 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus10 = null;
        main.models.Sensor sensor11 = new main.models.Sensor("hi!", sensorStatus10);
        sensor11.setSensorId("");
        main.models.SystemAlert systemAlert14 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList15 = systemAlert14.getMessages();
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("", "hi!", localDateTime18);
        systemAlert14.update(usageData19);
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime26 = usageData24.getRecordedAt();
        java.time.LocalDateTime localDateTime27 = usageData24.getRecordedAt();
        systemAlert14.update(usageData24);
        sensor11.attach((main.models.Observer) systemAlert14);
        java.util.List<java.lang.String> strList30 = systemAlert14.getMessages();
        sensor2.detach((main.models.Observer) systemAlert14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList30);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
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
        java.util.List<main.models.User> userList26 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
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
        databaseProxy9.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy27 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager26);
        java.util.List<main.models.User> userList28 = databaseProxy27.readUsers();
        main.models.User[] userArray29 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList30 = new java.util.ArrayList<main.models.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList30, userArray29);
        databaseProxy27.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy9.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList30);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        cSVDatabaseManager42.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        cSVDatabaseManager37.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        databaseProxy36.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        java.util.List<main.models.Reservation> reservationList53 = databaseProxy36.readReservations();
        databaseProxy1.writeReservations(reservationList53);
        java.util.List<main.models.Equipment> equipmentList55 = databaseProxy1.readEquipment();
        java.util.List<main.models.Payment> paymentList56 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
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
        org.junit.Assert.assertNotNull(reservationArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList56);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
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
        java.util.List<main.models.Payment> paymentList25 = databaseProxy1.readPayments();
        java.util.List<main.models.Payment> paymentList26 = databaseProxy1.readPayments();
        java.util.List<main.models.Reservation> reservationList27 = databaseProxy1.readReservations();
        java.util.List<main.models.Reservation> reservationList28 = databaseProxy1.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray35 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList36 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList36, equipmentArray35);
        cSVDatabaseManager34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList36);
        main.models.Reservation[] reservationArray39 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList40 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList40, reservationArray39);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
        cSVDatabaseManager29.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList40);
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
        org.junit.Assert.assertNotNull(paymentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
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
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
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
        java.util.List<main.models.Payment> paymentList33 = cSVDatabaseManager0.readPayments();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
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
        org.junit.Assert.assertNotNull(paymentList33);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray9 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList10 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList10, equipmentArray9);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList10);
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy14 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager13);
        main.models.Payment[] paymentArray15 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList16 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList16, paymentArray15);
        databaseProxy14.writePayments((java.util.List<main.models.Payment>) paymentList16);
        cSVDatabaseManager8.writePayments((java.util.List<main.models.Payment>) paymentList16);
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray25 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList26 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList26, equipmentArray25);
        cSVDatabaseManager24.writeEquipment((java.util.List<main.models.Equipment>) equipmentList26);
        main.models.Reservation[] reservationArray29 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList30 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList30, reservationArray29);
        cSVDatabaseManager24.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        cSVDatabaseManager24.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        java.util.List<main.models.User> userList39 = cSVDatabaseManager24.readUsers();
        java.util.List<main.models.Equipment> equipmentList40 = cSVDatabaseManager24.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        main.models.Reservation[] reservationArray46 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList47 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList47, reservationArray46);
        cSVDatabaseManager41.writeReservations((java.util.List<main.models.Reservation>) reservationList47);
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray51 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList52 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList52, equipmentArray51);
        cSVDatabaseManager50.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        cSVDatabaseManager24.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList52);
        java.util.List<main.models.User> userList58 = cSVDatabaseManager8.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        main.models.Equipment[] equipmentArray64 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList65 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList65, equipmentArray64);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList65);
        java.util.List<main.models.Reservation> reservationList68 = cSVDatabaseManager59.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray70 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList71 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList71, equipmentArray70);
        cSVDatabaseManager69.writeEquipment((java.util.List<main.models.Equipment>) equipmentList71);
        main.models.CSVDatabaseManager cSVDatabaseManager74 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray75 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList76 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList76, equipmentArray75);
        cSVDatabaseManager74.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        main.models.Reservation[] reservationArray79 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList80 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList80, reservationArray79);
        cSVDatabaseManager74.writeReservations((java.util.List<main.models.Reservation>) reservationList80);
        cSVDatabaseManager69.writeReservations((java.util.List<main.models.Reservation>) reservationList80);
        cSVDatabaseManager59.writeReservations((java.util.List<main.models.Reservation>) reservationList80);
        cSVDatabaseManager8.writeReservations((java.util.List<main.models.Reservation>) reservationList80);
        main.models.CSVDatabaseManager cSVDatabaseManager86 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray87 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList88 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList88, equipmentArray87);
        cSVDatabaseManager86.writeEquipment((java.util.List<main.models.Equipment>) equipmentList88);
        main.models.Equipment[] equipmentArray91 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList92 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList92, equipmentArray91);
        cSVDatabaseManager86.writeEquipment((java.util.List<main.models.Equipment>) equipmentList92);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList92);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
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
        sensor30.setSensorId("");
        java.time.LocalDateTime localDateTime35 = null;
        main.models.UsageData usageData36 = new main.models.UsageData("hi!", "", localDateTime35);
        java.lang.String str37 = usageData36.getEquipmentId();
        java.time.LocalDateTime localDateTime38 = usageData36.getRecordedAt();
        java.time.LocalDateTime localDateTime39 = usageData36.getRecordedAt();
        java.lang.String str40 = usageData36.getOperationStatus();
        sensor30.recordUsage(usageData36);
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
        sensor30.attach((main.models.Observer) usageLogger45);
        java.util.List<main.models.UsageData> usageDataList65 = usageLogger45.getRecords();
        sensor16.attach((main.models.Observer) usageLogger45);
        sensor2.attach((main.models.Observer) usageLogger45);
        main.enums.SensorStatus sensorStatus69 = null;
        main.models.Sensor sensor70 = new main.models.Sensor("hi!", sensorStatus69);
        sensor70.setSensorId("");
        java.time.LocalDateTime localDateTime75 = null;
        main.models.UsageData usageData76 = new main.models.UsageData("hi!", "", localDateTime75);
        java.lang.String str77 = usageData76.getEquipmentId();
        java.time.LocalDateTime localDateTime78 = usageData76.getRecordedAt();
        sensor70.recordUsage(usageData76);
        sensor70.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus82 = null;
        sensor70.setStatus(sensorStatus82);
        main.models.UsageLogger usageLogger84 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime87 = null;
        main.models.UsageData usageData88 = new main.models.UsageData("hi!", "", localDateTime87);
        usageLogger84.update(usageData88);
        main.models.SystemAlert systemAlert90 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList91 = systemAlert90.getMessages();
        java.time.LocalDateTime localDateTime94 = null;
        main.models.UsageData usageData95 = new main.models.UsageData("", "hi!", localDateTime94);
        systemAlert90.update(usageData95);
        usageLogger84.update(usageData95);
        sensor70.detach((main.models.Observer) usageLogger84);
        sensor2.detach((main.models.Observer) usageLogger84);
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "" + "'", str40.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList91);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
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
        databaseProxy9.writeReservations((java.util.List<main.models.Reservation>) reservationList21);
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy27 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager26);
        java.util.List<main.models.User> userList28 = databaseProxy27.readUsers();
        main.models.User[] userArray29 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList30 = new java.util.ArrayList<main.models.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList30, userArray29);
        databaseProxy27.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy9.writeUsers((java.util.List<main.models.User>) userList30);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList30);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        cSVDatabaseManager42.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        cSVDatabaseManager37.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        databaseProxy36.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        java.util.List<main.models.Reservation> reservationList53 = databaseProxy36.readReservations();
        databaseProxy1.writeReservations(reservationList53);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy56 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager55);
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy58 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager57);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        main.models.Reservation[] reservationArray69 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList70 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList70, reservationArray69);
        cSVDatabaseManager64.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        cSVDatabaseManager59.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        databaseProxy58.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        databaseProxy56.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        main.models.Equipment[] equipmentArray76 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList77 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList77, equipmentArray76);
        databaseProxy56.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        main.models.CSVDatabaseManager cSVDatabaseManager80 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        cSVDatabaseManager80.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        main.models.CSVDatabaseManager cSVDatabaseManager85 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy86 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager85);
        main.models.Payment[] paymentArray87 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList88 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList88, paymentArray87);
        databaseProxy86.writePayments((java.util.List<main.models.Payment>) paymentList88);
        cSVDatabaseManager80.writePayments((java.util.List<main.models.Payment>) paymentList88);
        databaseProxy56.writePayments((java.util.List<main.models.Payment>) paymentList88);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList88);
        java.util.List<main.models.Payment> paymentList94 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
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
        org.junit.Assert.assertNotNull(reservationArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList94);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.SystemAlert systemAlert3 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList4 = systemAlert3.getMessages();
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("", "hi!", localDateTime7);
        systemAlert3.update(usageData8);
        sensor2.notifyObservers(usageData8);
        main.enums.SensorStatus sensorStatus14 = null;
        main.models.Sensor sensor15 = new main.models.Sensor("hi!", sensorStatus14);
        sensor15.setSensorId("");
        sensor15.setSensorId("");
        java.time.LocalDateTime localDateTime20 = sensor15.getLastUpdateTime();
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "hi!", localDateTime20);
        sensor2.notifyObservers(usageData21);
        java.lang.String str23 = usageData21.getEquipmentId();
        java.lang.String str24 = usageData21.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
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
        main.models.DatabaseProxy databaseProxy21 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager22 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray23 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList24 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList24, equipmentArray23);
        cSVDatabaseManager22.writeEquipment((java.util.List<main.models.Equipment>) equipmentList24);
        main.models.Reservation[] reservationArray27 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList28 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList28, reservationArray27);
        cSVDatabaseManager22.writeReservations((java.util.List<main.models.Reservation>) reservationList28);
        main.models.CSVDatabaseManager cSVDatabaseManager31 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray32 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList33 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList33, equipmentArray32);
        cSVDatabaseManager31.writeEquipment((java.util.List<main.models.Equipment>) equipmentList33);
        cSVDatabaseManager22.writeEquipment((java.util.List<main.models.Equipment>) equipmentList33);
        java.util.List<main.models.User> userList37 = cSVDatabaseManager22.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        java.util.List<main.models.User> userList53 = cSVDatabaseManager38.readUsers();
        java.util.List<main.models.Equipment> equipmentList54 = cSVDatabaseManager38.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.Reservation[] reservationArray60 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList61 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList61, reservationArray60);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList61);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        cSVDatabaseManager22.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        java.util.List<main.models.User> userList72 = cSVDatabaseManager22.readUsers();
        cSVDatabaseManager0.writeUsers(userList72);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList54);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList72);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
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
        main.models.DatabaseProxy databaseProxy21 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Payment> paymentList22 = databaseProxy21.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList22);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
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
        java.lang.String str14 = usageData8.getEquipmentId();
        java.lang.String str15 = usageData8.getOperationStatus();
        java.lang.String str16 = usageData8.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
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
        main.models.SystemAlert systemAlert14 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList15 = systemAlert14.getMessages();
        java.util.List<java.lang.String> strList16 = systemAlert14.getMessages();
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        usageLogger17.update(usageData21);
        systemAlert14.update(usageData21);
        sensor2.notifyObservers(usageData21);
        main.enums.SensorStatus sensorStatus26 = null;
        main.models.Sensor sensor27 = new main.models.Sensor("hi!", sensorStatus26);
        main.enums.SensorStatus sensorStatus28 = null;
        sensor27.setStatus(sensorStatus28);
        main.models.UsageLogger usageLogger30 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList31 = usageLogger30.getRecords();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger30.getRecords();
        java.util.List<main.models.UsageData> usageDataList33 = usageLogger30.getRecords();
        sensor27.attach((main.models.Observer) usageLogger30);
        sensor2.attach((main.models.Observer) usageLogger30);
        main.enums.SensorStatus sensorStatus36 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus37 = null;
        sensor2.setStatus(sensorStatus37);
        main.enums.SensorStatus sensorStatus40 = null;
        main.models.Sensor sensor41 = new main.models.Sensor("hi!", sensorStatus40);
        sensor41.setSensorId("");
        java.time.LocalDateTime localDateTime46 = null;
        main.models.UsageData usageData47 = new main.models.UsageData("hi!", "", localDateTime46);
        java.lang.String str48 = usageData47.getEquipmentId();
        java.time.LocalDateTime localDateTime49 = usageData47.getRecordedAt();
        java.time.LocalDateTime localDateTime50 = usageData47.getRecordedAt();
        java.lang.String str51 = usageData47.getOperationStatus();
        sensor41.recordUsage(usageData47);
        java.lang.String str53 = sensor41.getSensorId();
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
        java.util.List<main.models.UsageData> usageDataList71 = usageLogger57.getRecords();
        sensor41.attach((main.models.Observer) usageLogger57);
        sensor2.attach((main.models.Observer) usageLogger57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList71);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
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
        java.util.List<main.models.Payment> paymentList16 = databaseProxy10.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
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
        java.time.LocalDateTime localDateTime81 = usageData79.getRecordedAt();
        java.time.LocalDateTime localDateTime82 = usageData79.getRecordedAt();
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
        org.junit.Assert.assertNull(localDateTime81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime82);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
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
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        java.util.List<main.models.User> userList48 = databaseProxy1.readUsers();
        java.util.List<main.models.Equipment> equipmentList49 = databaseProxy1.readEquipment();
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
        main.models.CSVDatabaseManager cSVDatabaseManager65 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy66 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager65);
        java.util.List<main.models.User> userList67 = databaseProxy66.readUsers();
        cSVDatabaseManager50.writeUsers(userList67);
        java.util.List<main.models.User> userList69 = cSVDatabaseManager50.readUsers();
        databaseProxy1.writeUsers(userList69);
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
        org.junit.Assert.assertNotNull(reservationArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList49);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
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
        java.util.List<main.models.User> userList23 = databaseProxy22.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager24);
        java.util.List<main.models.User> userList26 = databaseProxy25.readUsers();
        databaseProxy22.writeUsers(userList26);
        java.util.List<main.models.Equipment> equipmentList28 = databaseProxy22.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        java.util.List<main.models.User> userList31 = databaseProxy30.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        databaseProxy30.writeUsers(userList34);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
        java.util.List<main.models.User> userList38 = databaseProxy37.readUsers();
        databaseProxy30.writeUsers(userList38);
        databaseProxy22.writeUsers(userList38);
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager41.readUsers();
        databaseProxy22.writeUsers(userList50);
        java.util.List<main.models.Payment> paymentList52 = databaseProxy22.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy54 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager53);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager60.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        main.models.Reservation[] reservationArray65 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList66 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList66, reservationArray65);
        cSVDatabaseManager60.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        databaseProxy54.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        java.util.List<main.models.Equipment> equipmentList71 = databaseProxy54.readEquipment();
        databaseProxy22.writeEquipment(equipmentList71);
        cSVDatabaseManager0.writeEquipment(equipmentList71);
        java.util.List<main.models.User> userList74 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Payment> paymentList75 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
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
        org.junit.Assert.assertNotNull(equipmentList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList75);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
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
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.Reservation[] reservationArray33 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList34 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList34, reservationArray33);
        cSVDatabaseManager28.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray38 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList39 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList39, equipmentArray38);
        cSVDatabaseManager37.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList39);
        java.util.List<main.models.User> userList43 = cSVDatabaseManager28.readUsers();
        java.util.List<main.models.Equipment> equipmentList44 = cSVDatabaseManager28.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager45 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager45.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        main.models.Reservation[] reservationArray50 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList51 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList51, reservationArray50);
        cSVDatabaseManager45.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        cSVDatabaseManager45.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        java.util.List<main.models.User> userList60 = cSVDatabaseManager45.readUsers();
        cSVDatabaseManager28.writeUsers(userList60);
        java.util.List<main.models.Equipment> equipmentList62 = cSVDatabaseManager28.readEquipment();
        java.util.List<main.models.Reservation> reservationList63 = cSVDatabaseManager28.readReservations();
        databaseProxy1.writeReservations(reservationList63);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList44);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList63);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "", localDateTime11);
        sensor2.notifyObservers(usageData12);
        java.lang.String str14 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        java.util.List<main.models.Reservation> reservationList3 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList4 = databaseProxy1.readPayments();
        java.util.List<main.models.Equipment> equipmentList5 = databaseProxy1.readEquipment();
        java.util.List<main.models.Payment> paymentList6 = databaseProxy1.readPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus14 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus16 = null;
        main.models.Sensor sensor17 = new main.models.Sensor("hi!", sensorStatus16);
        sensor17.setSensorId("");
        java.lang.String str20 = sensor17.getSensorId();
        java.time.LocalDateTime localDateTime21 = sensor17.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus23 = null;
        main.models.Sensor sensor24 = new main.models.Sensor("hi!", sensorStatus23);
        sensor24.setSensorId("");
        java.lang.String str27 = sensor24.getSensorId();
        java.time.LocalDateTime localDateTime28 = sensor24.getLastUpdateTime();
        sensor17.setLastUpdateTime(localDateTime28);
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
        sensor46.setSensorId("");
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        java.lang.String str53 = usageData52.getEquipmentId();
        java.time.LocalDateTime localDateTime54 = usageData52.getRecordedAt();
        java.time.LocalDateTime localDateTime55 = usageData52.getRecordedAt();
        java.lang.String str56 = usageData52.getOperationStatus();
        sensor46.recordUsage(usageData52);
        main.enums.SensorStatus sensorStatus59 = null;
        main.models.Sensor sensor60 = new main.models.Sensor("hi!", sensorStatus59);
        main.models.UsageLogger usageLogger61 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList62 = usageLogger61.getRecords();
        sensor60.attach((main.models.Observer) usageLogger61);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        usageLogger61.update(usageData67);
        main.enums.SensorStatus sensorStatus71 = null;
        main.models.Sensor sensor72 = new main.models.Sensor("hi!", sensorStatus71);
        java.time.LocalDateTime localDateTime75 = null;
        main.models.UsageData usageData76 = new main.models.UsageData("hi!", "", localDateTime75);
        java.lang.String str77 = usageData76.getEquipmentId();
        sensor72.notifyObservers(usageData76);
        usageLogger61.update(usageData76);
        sensor46.attach((main.models.Observer) usageLogger61);
        java.util.List<main.models.UsageData> usageDataList81 = usageLogger61.getRecords();
        sensor32.attach((main.models.Observer) usageLogger61);
        main.enums.SensorStatus sensorStatus86 = null;
        main.models.Sensor sensor87 = new main.models.Sensor("hi!", sensorStatus86);
        sensor87.setSensorId("");
        sensor87.setSensorId("");
        java.time.LocalDateTime localDateTime92 = sensor87.getLastUpdateTime();
        main.models.UsageData usageData93 = new main.models.UsageData("", "hi!", localDateTime92);
        sensor32.setLastUpdateTime(localDateTime92);
        sensor17.setLastUpdateTime(localDateTime92);
        sensor2.setLastUpdateTime(localDateTime92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "" + "'", str56.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
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
        main.models.SystemAlert systemAlert14 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList15 = systemAlert14.getMessages();
        java.util.List<java.lang.String> strList16 = systemAlert14.getMessages();
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        usageLogger17.update(usageData21);
        systemAlert14.update(usageData21);
        sensor2.notifyObservers(usageData21);
        java.time.LocalDateTime localDateTime25 = usageData21.getRecordedAt();
        java.lang.String str26 = usageData21.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!" + "'", str26.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
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
        java.util.List<main.models.User> userList11 = databaseProxy10.readUsers();
        main.models.User[] userArray12 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList13 = new java.util.ArrayList<main.models.User>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList13, userArray12);
        databaseProxy10.writeUsers((java.util.List<main.models.User>) userList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Payment[] paymentArray21 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList22 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList22, paymentArray21);
        cSVDatabaseManager16.writePayments((java.util.List<main.models.Payment>) paymentList22);
        java.util.List<main.models.Payment> paymentList25 = cSVDatabaseManager16.readPayments();
        databaseProxy10.writePayments(paymentList25);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        java.util.List<main.models.User> userList42 = cSVDatabaseManager27.readUsers();
        java.util.List<main.models.Equipment> equipmentList43 = cSVDatabaseManager27.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.Reservation[] reservationArray49 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList50 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList50, reservationArray49);
        cSVDatabaseManager44.writeReservations((java.util.List<main.models.Reservation>) reservationList50);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        java.util.List<main.models.User> userList59 = cSVDatabaseManager44.readUsers();
        cSVDatabaseManager27.writeUsers(userList59);
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.Equipment[] equipmentArray66 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList67 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList67, equipmentArray66);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList67);
        java.util.List<main.models.Reservation> reservationList70 = cSVDatabaseManager61.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray72 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList73 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList73, equipmentArray72);
        cSVDatabaseManager71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray77 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList78 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList78, equipmentArray77);
        cSVDatabaseManager76.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        main.models.Reservation[] reservationArray81 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList82 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList82, reservationArray81);
        cSVDatabaseManager76.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        cSVDatabaseManager71.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        cSVDatabaseManager61.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        databaseProxy10.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        java.util.List<main.models.Payment> paymentList90 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
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
        org.junit.Assert.assertNotNull(paymentList25);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList43);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
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
        org.junit.Assert.assertNotNull(paymentList90);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = null;
        sensor2.setStatus(sensorStatus5);
        main.enums.SensorStatus sensorStatus8 = null;
        main.models.Sensor sensor9 = new main.models.Sensor("hi!", sensorStatus8);
        main.models.UsageLogger usageLogger10 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList11 = usageLogger10.getRecords();
        sensor9.attach((main.models.Observer) usageLogger10);
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("hi!", "", localDateTime15);
        java.lang.String str17 = usageData16.getEquipmentId();
        usageLogger10.update(usageData16);
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        usageLogger10.update(usageData22);
        sensor2.detach((main.models.Observer) usageLogger10);
        main.models.SystemAlert systemAlert25 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList26 = systemAlert25.getMessages();
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("", "hi!", localDateTime29);
        systemAlert25.update(usageData30);
        java.util.List<java.lang.String> strList32 = systemAlert25.getMessages();
        java.util.List<java.lang.String> strList33 = systemAlert25.getMessages();
        sensor2.detach((main.models.Observer) systemAlert25);
        java.util.List<java.lang.String> strList35 = systemAlert25.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        sensor4.setSensorId("");
        main.models.UsageData usageData9 = null;
        sensor4.notifyObservers(usageData9);
        main.enums.SensorStatus sensorStatus14 = null;
        main.models.Sensor sensor15 = new main.models.Sensor("hi!", sensorStatus14);
        sensor15.setSensorId("");
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        java.lang.String str22 = usageData21.getEquipmentId();
        java.time.LocalDateTime localDateTime23 = usageData21.getRecordedAt();
        java.time.LocalDateTime localDateTime24 = usageData21.getRecordedAt();
        java.lang.String str25 = usageData21.getOperationStatus();
        sensor15.recordUsage(usageData21);
        main.enums.SensorStatus sensorStatus28 = null;
        main.models.Sensor sensor29 = new main.models.Sensor("hi!", sensorStatus28);
        sensor29.setSensorId("");
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("hi!", "", localDateTime34);
        java.lang.String str36 = usageData35.getEquipmentId();
        java.time.LocalDateTime localDateTime37 = usageData35.getRecordedAt();
        java.time.LocalDateTime localDateTime38 = usageData35.getRecordedAt();
        java.lang.String str39 = usageData35.getOperationStatus();
        sensor29.recordUsage(usageData35);
        main.enums.SensorStatus sensorStatus42 = null;
        main.models.Sensor sensor43 = new main.models.Sensor("hi!", sensorStatus42);
        main.models.UsageLogger usageLogger44 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList45 = usageLogger44.getRecords();
        sensor43.attach((main.models.Observer) usageLogger44);
        java.time.LocalDateTime localDateTime49 = null;
        main.models.UsageData usageData50 = new main.models.UsageData("hi!", "", localDateTime49);
        java.lang.String str51 = usageData50.getEquipmentId();
        usageLogger44.update(usageData50);
        main.enums.SensorStatus sensorStatus54 = null;
        main.models.Sensor sensor55 = new main.models.Sensor("hi!", sensorStatus54);
        java.time.LocalDateTime localDateTime58 = null;
        main.models.UsageData usageData59 = new main.models.UsageData("hi!", "", localDateTime58);
        java.lang.String str60 = usageData59.getEquipmentId();
        sensor55.notifyObservers(usageData59);
        usageLogger44.update(usageData59);
        sensor29.attach((main.models.Observer) usageLogger44);
        java.util.List<main.models.UsageData> usageDataList64 = usageLogger44.getRecords();
        sensor15.attach((main.models.Observer) usageLogger44);
        main.enums.SensorStatus sensorStatus69 = null;
        main.models.Sensor sensor70 = new main.models.Sensor("hi!", sensorStatus69);
        sensor70.setSensorId("");
        sensor70.setSensorId("");
        java.time.LocalDateTime localDateTime75 = sensor70.getLastUpdateTime();
        main.models.UsageData usageData76 = new main.models.UsageData("", "hi!", localDateTime75);
        sensor15.setLastUpdateTime(localDateTime75);
        main.models.UsageData usageData78 = new main.models.UsageData("", "", localDateTime75);
        sensor4.setLastUpdateTime(localDateTime75);
        main.models.UsageData usageData80 = new main.models.UsageData("hi!", "", localDateTime75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "" + "'", str39.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!" + "'", str51.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime75);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        java.time.LocalDateTime localDateTime10 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "hi!", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
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
        java.util.List<main.models.Reservation> reservationList99 = databaseProxy37.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList99);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "hi!", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
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
        main.models.SystemAlert systemAlert20 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList21 = systemAlert20.getMessages();
        java.time.LocalDateTime localDateTime24 = null;
        main.models.UsageData usageData25 = new main.models.UsageData("", "hi!", localDateTime24);
        systemAlert20.update(usageData25);
        main.models.SystemAlert systemAlert27 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList28 = systemAlert27.getMessages();
        java.time.LocalDateTime localDateTime31 = null;
        main.models.UsageData usageData32 = new main.models.UsageData("", "hi!", localDateTime31);
        systemAlert27.update(usageData32);
        systemAlert20.update(usageData32);
        sensor2.detach((main.models.Observer) systemAlert20);
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        main.enums.SensorStatus sensorStatus39 = null;
        sensor38.setStatus(sensorStatus39);
        main.enums.SensorStatus sensorStatus42 = null;
        main.models.Sensor sensor43 = new main.models.Sensor("hi!", sensorStatus42);
        sensor43.setSensorId("");
        java.time.LocalDateTime localDateTime48 = null;
        main.models.UsageData usageData49 = new main.models.UsageData("hi!", "", localDateTime48);
        java.lang.String str50 = usageData49.getEquipmentId();
        java.time.LocalDateTime localDateTime51 = usageData49.getRecordedAt();
        java.time.LocalDateTime localDateTime52 = usageData49.getRecordedAt();
        java.lang.String str53 = usageData49.getOperationStatus();
        sensor43.recordUsage(usageData49);
        java.lang.String str55 = sensor43.getSensorId();
        main.enums.SensorStatus sensorStatus57 = null;
        main.models.Sensor sensor58 = new main.models.Sensor("hi!", sensorStatus57);
        main.models.UsageLogger usageLogger59 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList60 = usageLogger59.getRecords();
        sensor58.attach((main.models.Observer) usageLogger59);
        java.time.LocalDateTime localDateTime64 = null;
        main.models.UsageData usageData65 = new main.models.UsageData("hi!", "", localDateTime64);
        java.lang.String str66 = usageData65.getEquipmentId();
        usageLogger59.update(usageData65);
        java.time.LocalDateTime localDateTime70 = null;
        main.models.UsageData usageData71 = new main.models.UsageData("hi!", "", localDateTime70);
        usageLogger59.update(usageData71);
        java.util.List<main.models.UsageData> usageDataList73 = usageLogger59.getRecords();
        sensor43.attach((main.models.Observer) usageLogger59);
        sensor38.detach((main.models.Observer) usageLogger59);
        main.models.UsageLogger usageLogger76 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime79 = null;
        main.models.UsageData usageData80 = new main.models.UsageData("hi!", "", localDateTime79);
        usageLogger76.update(usageData80);
        main.models.SystemAlert systemAlert82 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList83 = systemAlert82.getMessages();
        java.time.LocalDateTime localDateTime86 = null;
        main.models.UsageData usageData87 = new main.models.UsageData("", "hi!", localDateTime86);
        systemAlert82.update(usageData87);
        usageLogger76.update(usageData87);
        sensor38.notifyObservers(usageData87);
        sensor2.recordUsage(usageData87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "" + "'", str55.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList83);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
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
        main.enums.SensorStatus sensorStatus30 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus31 = null;
        sensor2.setStatus(sensorStatus31);
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
        org.junit.Assert.assertNull(sensorStatus30);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
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
        java.util.List<main.models.Reservation> reservationList22 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList22);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
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
        java.util.List<main.models.User> userList23 = databaseProxy22.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager24);
        java.util.List<main.models.User> userList26 = databaseProxy25.readUsers();
        databaseProxy22.writeUsers(userList26);
        java.util.List<main.models.Equipment> equipmentList28 = databaseProxy22.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        java.util.List<main.models.User> userList31 = databaseProxy30.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        databaseProxy30.writeUsers(userList34);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
        java.util.List<main.models.User> userList38 = databaseProxy37.readUsers();
        databaseProxy30.writeUsers(userList38);
        databaseProxy22.writeUsers(userList38);
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        java.util.List<main.models.User> userList50 = cSVDatabaseManager41.readUsers();
        databaseProxy22.writeUsers(userList50);
        java.util.List<main.models.Payment> paymentList52 = databaseProxy22.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy54 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager53);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        cSVDatabaseManager60.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        main.models.Reservation[] reservationArray65 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList66 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList66, reservationArray65);
        cSVDatabaseManager60.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        cSVDatabaseManager55.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        databaseProxy54.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        java.util.List<main.models.Equipment> equipmentList71 = databaseProxy54.readEquipment();
        databaseProxy22.writeEquipment(equipmentList71);
        cSVDatabaseManager0.writeEquipment(equipmentList71);
        main.models.CSVDatabaseManager cSVDatabaseManager74 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray75 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList76 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList76, equipmentArray75);
        cSVDatabaseManager74.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        main.models.Reservation[] reservationArray79 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList80 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList80, reservationArray79);
        cSVDatabaseManager74.writeReservations((java.util.List<main.models.Reservation>) reservationList80);
        java.util.List<main.models.User> userList83 = cSVDatabaseManager74.readUsers();
        main.models.DatabaseProxy databaseProxy84 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager74);
        main.models.DatabaseProxy databaseProxy85 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy84);
        java.util.List<main.models.Payment> paymentList86 = databaseProxy84.readPayments();
        cSVDatabaseManager0.writePayments(paymentList86);
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
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
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
        org.junit.Assert.assertNotNull(equipmentList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList86);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
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
        java.util.List<main.models.UsageData> usageDataList53 = usageLogger36.getRecords();
        java.util.List<main.models.UsageData> usageDataList54 = usageLogger36.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList54);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
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
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus8 = null;
        sensor2.setStatus(sensorStatus8);
        java.lang.Class<?> wildcardClass10 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime8 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
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
        java.lang.String str25 = sensor13.getSensorId();
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
        java.util.List<main.models.UsageData> usageDataList43 = usageLogger29.getRecords();
        sensor13.attach((main.models.Observer) usageLogger29);
        main.enums.SensorStatus sensorStatus48 = null;
        main.models.Sensor sensor49 = new main.models.Sensor("hi!", sensorStatus48);
        sensor49.setSensorId("");
        sensor49.setSensorId("");
        java.time.LocalDateTime localDateTime54 = sensor49.getLastUpdateTime();
        main.models.UsageData usageData55 = new main.models.UsageData("", "hi!", localDateTime54);
        sensor13.recordUsage(usageData55);
        sensor2.notifyObservers(usageData55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = sensor2.getLastUpdateTime();
        java.time.LocalDateTime localDateTime8 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
        main.enums.SensorStatus sensorStatus11 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus11);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
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
        java.util.List<main.models.Payment> paymentList28 = databaseProxy1.readPayments();
        java.util.List<main.models.User> userList29 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(paymentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
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
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus30 = null;
        main.models.Sensor sensor31 = new main.models.Sensor("hi!", sensorStatus30);
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("hi!", "", localDateTime34);
        java.lang.String str36 = usageData35.getEquipmentId();
        sensor31.notifyObservers(usageData35);
        main.enums.SensorStatus sensorStatus38 = sensor31.getStatus();
        java.time.LocalDateTime localDateTime41 = null;
        main.models.UsageData usageData42 = new main.models.UsageData("hi!", "", localDateTime41);
        java.lang.String str43 = usageData42.getEquipmentId();
        java.time.LocalDateTime localDateTime44 = usageData42.getRecordedAt();
        java.time.LocalDateTime localDateTime45 = usageData42.getRecordedAt();
        java.lang.String str46 = usageData42.getOperationStatus();
        sensor31.recordUsage(usageData42);
        java.time.LocalDateTime localDateTime50 = null;
        main.models.UsageData usageData51 = new main.models.UsageData("hi!", "hi!", localDateTime50);
        sensor31.recordUsage(usageData51);
        java.lang.String str53 = usageData51.getOperationStatus();
        sensor2.recordUsage(usageData51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "" + "'", str46.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
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
        java.lang.String str55 = usageData54.getEquipmentId();
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
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
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
        java.util.List<main.models.Payment> paymentList24 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList24);
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
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test177");
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
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray54 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList55 = new java.util.ArrayList<main.models.User>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList55, userArray54);
        cSVDatabaseManager53.writeUsers((java.util.List<main.models.User>) userList55);
        cSVDatabaseManager38.writeUsers((java.util.List<main.models.User>) userList55);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        main.models.Reservation[] reservationArray64 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList65 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList65, reservationArray64);
        cSVDatabaseManager59.writeReservations((java.util.List<main.models.Reservation>) reservationList65);
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray69 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList70 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList70, equipmentArray69);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        cSVDatabaseManager59.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        main.models.CSVDatabaseManager cSVDatabaseManager75 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray76 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList77 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList77, equipmentArray76);
        cSVDatabaseManager75.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        main.models.Payment[] paymentArray80 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList81 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList81, paymentArray80);
        cSVDatabaseManager75.writePayments((java.util.List<main.models.Payment>) paymentList81);
        java.util.List<main.models.Payment> paymentList84 = cSVDatabaseManager75.readPayments();
        cSVDatabaseManager38.writePayments(paymentList84);
        java.util.List<main.models.Reservation> reservationList86 = cSVDatabaseManager38.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList86);
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
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList86);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.models.SystemAlert systemAlert6 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList7 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList8 = systemAlert6.getMessages();
        main.models.UsageLogger usageLogger9 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("hi!", "", localDateTime12);
        usageLogger9.update(usageData13);
        systemAlert6.update(usageData13);
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        sensor18.setSensorId("");
        java.time.LocalDateTime localDateTime23 = null;
        main.models.UsageData usageData24 = new main.models.UsageData("hi!", "", localDateTime23);
        java.lang.String str25 = usageData24.getEquipmentId();
        java.time.LocalDateTime localDateTime26 = usageData24.getRecordedAt();
        sensor18.recordUsage(usageData24);
        sensor18.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus31 = null;
        main.models.Sensor sensor32 = new main.models.Sensor("hi!", sensorStatus31);
        sensor32.setSensorId("");
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("hi!", "", localDateTime37);
        java.lang.String str39 = usageData38.getEquipmentId();
        java.time.LocalDateTime localDateTime40 = usageData38.getRecordedAt();
        sensor32.recordUsage(usageData38);
        sensor32.setSensorId("hi!");
        java.time.LocalDateTime localDateTime46 = null;
        main.models.UsageData usageData47 = new main.models.UsageData("", "hi!", localDateTime46);
        sensor32.notifyObservers(usageData47);
        main.enums.SensorStatus sensorStatus50 = null;
        main.models.Sensor sensor51 = new main.models.Sensor("hi!", sensorStatus50);
        main.models.UsageLogger usageLogger52 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList53 = usageLogger52.getRecords();
        sensor51.attach((main.models.Observer) usageLogger52);
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("hi!", "", localDateTime57);
        java.lang.String str59 = usageData58.getEquipmentId();
        usageLogger52.update(usageData58);
        java.time.LocalDateTime localDateTime63 = null;
        main.models.UsageData usageData64 = new main.models.UsageData("hi!", "", localDateTime63);
        usageLogger52.update(usageData64);
        sensor32.detach((main.models.Observer) usageLogger52);
        sensor18.attach((main.models.Observer) usageLogger52);
        java.util.List<main.models.UsageData> usageDataList68 = usageLogger52.getRecords();
        main.enums.SensorStatus sensorStatus70 = null;
        main.models.Sensor sensor71 = new main.models.Sensor("hi!", sensorStatus70);
        main.models.UsageLogger usageLogger72 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList73 = usageLogger72.getRecords();
        sensor71.attach((main.models.Observer) usageLogger72);
        java.time.LocalDateTime localDateTime77 = null;
        main.models.UsageData usageData78 = new main.models.UsageData("hi!", "", localDateTime77);
        java.lang.String str79 = usageData78.getEquipmentId();
        usageLogger72.update(usageData78);
        main.enums.SensorStatus sensorStatus82 = null;
        main.models.Sensor sensor83 = new main.models.Sensor("hi!", sensorStatus82);
        java.time.LocalDateTime localDateTime86 = null;
        main.models.UsageData usageData87 = new main.models.UsageData("hi!", "", localDateTime86);
        java.lang.String str88 = usageData87.getEquipmentId();
        sensor83.notifyObservers(usageData87);
        usageLogger72.update(usageData87);
        usageLogger52.update(usageData87);
        java.lang.String str92 = usageData87.getOperationStatus();
        systemAlert6.update(usageData87);
        java.time.LocalDateTime localDateTime94 = usageData87.getRecordedAt();
        usageLogger3.update(usageData87);
        java.lang.Class<?> wildcardClass96 = usageData87.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "hi!" + "'", str88.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str92 + "' != '" + "" + "'", str92.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
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
        java.util.List<main.models.Equipment> equipmentList10 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList3 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime6 = null;
        main.models.UsageData usageData7 = new main.models.UsageData("", "", localDateTime6);
        systemAlert0.update(usageData7);
        java.time.LocalDateTime localDateTime9 = usageData7.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
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
        main.enums.SensorStatus sensorStatus28 = null;
        main.models.Sensor sensor29 = new main.models.Sensor("hi!", sensorStatus28);
        sensor29.setSensorId("");
        main.enums.SensorStatus sensorStatus32 = sensor29.getStatus();
        main.models.UsageLogger usageLogger33 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        usageLogger33.update(usageData37);
        java.util.List<main.models.UsageData> usageDataList39 = usageLogger33.getRecords();
        sensor29.detach((main.models.Observer) usageLogger33);
        main.enums.SensorStatus sensorStatus44 = null;
        main.models.Sensor sensor45 = new main.models.Sensor("hi!", sensorStatus44);
        sensor45.setSensorId("");
        sensor45.setSensorId("");
        java.time.LocalDateTime localDateTime50 = sensor45.getLastUpdateTime();
        main.models.UsageData usageData51 = new main.models.UsageData("hi!", "hi!", localDateTime50);
        sensor29.recordUsage(usageData51);
        sensor2.notifyObservers(usageData51);
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
        org.junit.Assert.assertNull(sensorStatus32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager7);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.Equipment[] equipmentArray14 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList15 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList15, equipmentArray14);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList15);
        java.util.List<main.models.Reservation> reservationList18 = cSVDatabaseManager9.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray25 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList26 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList26, equipmentArray25);
        cSVDatabaseManager24.writeEquipment((java.util.List<main.models.Equipment>) equipmentList26);
        main.models.Reservation[] reservationArray29 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList30 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList30, reservationArray29);
        cSVDatabaseManager24.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        cSVDatabaseManager19.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
        java.util.List<main.models.User> userList38 = databaseProxy37.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy40 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager39);
        java.util.List<main.models.User> userList41 = databaseProxy40.readUsers();
        databaseProxy37.writeUsers(userList41);
        java.util.List<main.models.Equipment> equipmentList43 = databaseProxy37.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy45 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager44);
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        main.models.Reservation[] reservationArray56 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList57 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList57, reservationArray56);
        cSVDatabaseManager51.writeReservations((java.util.List<main.models.Reservation>) reservationList57);
        cSVDatabaseManager46.writeReservations((java.util.List<main.models.Reservation>) reservationList57);
        databaseProxy45.writeReservations((java.util.List<main.models.Reservation>) reservationList57);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        java.util.List<main.models.User> userList64 = databaseProxy63.readUsers();
        main.models.User[] userArray65 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList66 = new java.util.ArrayList<main.models.User>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList66, userArray65);
        databaseProxy63.writeUsers((java.util.List<main.models.User>) userList66);
        databaseProxy45.writeUsers((java.util.List<main.models.User>) userList66);
        databaseProxy37.writeUsers((java.util.List<main.models.User>) userList66);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy72 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager71);
        main.models.CSVDatabaseManager cSVDatabaseManager73 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray74 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList75 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList75, equipmentArray74);
        cSVDatabaseManager73.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray79 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList80 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList80, equipmentArray79);
        cSVDatabaseManager78.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        main.models.Reservation[] reservationArray83 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList84 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList84, reservationArray83);
        cSVDatabaseManager78.writeReservations((java.util.List<main.models.Reservation>) reservationList84);
        cSVDatabaseManager73.writeReservations((java.util.List<main.models.Reservation>) reservationList84);
        databaseProxy72.writeReservations((java.util.List<main.models.Reservation>) reservationList84);
        java.util.List<main.models.Reservation> reservationList89 = databaseProxy72.readReservations();
        databaseProxy37.writeReservations(reservationList89);
        cSVDatabaseManager7.writeReservations(reservationList89);
        main.models.CSVDatabaseManager cSVDatabaseManager92 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy93 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager92);
        java.util.List<main.models.Equipment> equipmentList94 = databaseProxy93.readEquipment();
        cSVDatabaseManager7.writeEquipment(equipmentList94);
        databaseProxy1.writeEquipment(equipmentList94);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
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
        org.junit.Assert.assertNotNull(reservationArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList94);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
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
        java.util.List<java.lang.String> strList16 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
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
        java.util.List<main.models.UsageData> usageDataList79 = usageLogger71.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList79);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
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
        java.util.List<main.models.Equipment> equipmentList19 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy21 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager20);
        main.models.User[] userArray22 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList23 = new java.util.ArrayList<main.models.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList23, userArray22);
        cSVDatabaseManager20.writeUsers((java.util.List<main.models.User>) userList23);
        java.util.List<main.models.Payment> paymentList26 = cSVDatabaseManager20.readPayments();
        java.util.List<main.models.User> userList27 = cSVDatabaseManager20.readUsers();
        java.util.List<main.models.Reservation> reservationList28 = cSVDatabaseManager20.readReservations();
        java.util.List<main.models.User> userList29 = cSVDatabaseManager20.readUsers();
        java.util.List<main.models.Equipment> equipmentList30 = cSVDatabaseManager20.readEquipment();
        databaseProxy1.writeEquipment(equipmentList30);
        java.util.List<main.models.Payment> paymentList32 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(equipmentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList32);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
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
        java.util.List<main.models.Payment> paymentList31 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        main.models.Reservation[] reservationArray37 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList38 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList38, reservationArray37);
        cSVDatabaseManager32.writeReservations((java.util.List<main.models.Reservation>) reservationList38);
        java.util.List<main.models.Equipment> equipmentList41 = null;
        cSVDatabaseManager32.writeEquipment(equipmentList41);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        main.models.Payment[] paymentArray45 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList46 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList46, paymentArray45);
        databaseProxy44.writePayments((java.util.List<main.models.Payment>) paymentList46);
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
        databaseProxy44.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        java.util.List<main.models.Payment> paymentList68 = databaseProxy44.readPayments();
        java.util.List<main.models.Payment> paymentList69 = databaseProxy44.readPayments();
        java.util.List<main.models.Reservation> reservationList70 = databaseProxy44.readReservations();
        cSVDatabaseManager32.writeReservations(reservationList70);
        cSVDatabaseManager0.writeReservations(reservationList70);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
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
        org.junit.Assert.assertNotNull(paymentList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList70);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
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
        main.enums.SensorStatus sensorStatus17 = null;
        main.models.Sensor sensor18 = new main.models.Sensor("hi!", sensorStatus17);
        main.models.UsageLogger usageLogger19 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList20 = usageLogger19.getRecords();
        sensor18.attach((main.models.Observer) usageLogger19);
        main.enums.SensorStatus sensorStatus22 = sensor18.getStatus();
        sensor18.setSensorId("hi!");
        java.lang.String str25 = sensor18.getSensorId();
        java.time.LocalDateTime localDateTime26 = sensor18.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
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
        java.time.LocalDateTime localDateTime54 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertNotNull(localDateTime54);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
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
        java.util.List<main.models.Reservation> reservationList37 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList37);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
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
        main.models.Reservation[] reservationArray11 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList12 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList12, reservationArray11);
        cSVDatabaseManager6.writeReservations((java.util.List<main.models.Reservation>) reservationList12);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList12);
        java.util.List<main.models.User> userList16 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(reservationArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = sensor2.getStatus();
        main.models.UsageLogger usageLogger9 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList10 = usageLogger9.getRecords();
        sensor2.detach((main.models.Observer) usageLogger9);
        java.util.List<main.models.UsageData> usageDataList12 = usageLogger9.getRecords();
        java.lang.Class<?> wildcardClass13 = usageDataList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
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
        main.models.SystemAlert systemAlert14 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList15 = systemAlert14.getMessages();
        java.util.List<java.lang.String> strList16 = systemAlert14.getMessages();
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        usageLogger17.update(usageData21);
        systemAlert14.update(usageData21);
        sensor2.notifyObservers(usageData21);
        main.enums.SensorStatus sensorStatus26 = null;
        main.models.Sensor sensor27 = new main.models.Sensor("hi!", sensorStatus26);
        main.enums.SensorStatus sensorStatus28 = null;
        sensor27.setStatus(sensorStatus28);
        main.models.UsageLogger usageLogger30 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList31 = usageLogger30.getRecords();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger30.getRecords();
        java.util.List<main.models.UsageData> usageDataList33 = usageLogger30.getRecords();
        sensor27.attach((main.models.Observer) usageLogger30);
        sensor2.attach((main.models.Observer) usageLogger30);
        java.time.LocalDateTime localDateTime36 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime36);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
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
        main.enums.SensorStatus sensorStatus65 = null;
        sensor2.setStatus(sensorStatus65);
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
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        sensor2.setSensorId("hi!");
        java.lang.String str12 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime13 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus14 = sensor2.getStatus();
        main.models.SystemAlert systemAlert15 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList16 = systemAlert15.getMessages();
        main.models.UsageLogger usageLogger17 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        usageLogger17.update(usageData21);
        java.lang.String str23 = usageData21.getEquipmentId();
        java.lang.String str24 = usageData21.getEquipmentId();
        systemAlert15.update(usageData21);
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("", "", localDateTime28);
        systemAlert15.update(usageData29);
        sensor2.attach((main.models.Observer) systemAlert15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
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
        java.util.List<main.models.Payment> paymentList65 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList65);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
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
        java.util.List<main.models.User> userList25 = cSVDatabaseManager10.readUsers();
        java.util.List<main.models.Equipment> equipmentList26 = cSVDatabaseManager10.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
        main.models.Reservation[] reservationArray32 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList33 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList33, reservationArray32);
        cSVDatabaseManager27.writeReservations((java.util.List<main.models.Reservation>) reservationList33);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        cSVDatabaseManager27.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        java.util.List<main.models.User> userList43 = cSVDatabaseManager10.readUsers();
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
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy60 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager59);
        java.util.List<main.models.User> userList61 = databaseProxy60.readUsers();
        cSVDatabaseManager44.writeUsers(userList61);
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray64 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList65 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList65, equipmentArray64);
        cSVDatabaseManager63.writeEquipment((java.util.List<main.models.Equipment>) equipmentList65);
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy69 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager68);
        main.models.Payment[] paymentArray70 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList71 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList71, paymentArray70);
        databaseProxy69.writePayments((java.util.List<main.models.Payment>) paymentList71);
        cSVDatabaseManager63.writePayments((java.util.List<main.models.Payment>) paymentList71);
        cSVDatabaseManager44.writePayments((java.util.List<main.models.Payment>) paymentList71);
        cSVDatabaseManager10.writePayments((java.util.List<main.models.Payment>) paymentList71);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList71);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test197");
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
        main.enums.SensorStatus sensorStatus54 = null;
        main.models.Sensor sensor55 = new main.models.Sensor("hi!", sensorStatus54);
        sensor55.setSensorId("");
        java.time.LocalDateTime localDateTime60 = null;
        main.models.UsageData usageData61 = new main.models.UsageData("hi!", "", localDateTime60);
        java.lang.String str62 = usageData61.getEquipmentId();
        java.time.LocalDateTime localDateTime63 = usageData61.getRecordedAt();
        sensor55.recordUsage(usageData61);
        sensor55.setSensorId("");
        main.models.UsageLogger usageLogger67 = new main.models.UsageLogger();
        sensor55.detach((main.models.Observer) usageLogger67);
        java.time.LocalDateTime localDateTime69 = sensor55.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime69);
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
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!" + "'", str62.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime69);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        sensor6.setSensorId("");
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        java.lang.String str13 = usageData12.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = usageData12.getRecordedAt();
        sensor6.recordUsage(usageData12);
        sensor6.setSensorId("");
        sensor6.setSensorId("");
        sensor6.setSensorId("hi!");
        java.time.LocalDateTime localDateTime22 = sensor6.getLastUpdateTime();
        main.models.UsageData usageData23 = new main.models.UsageData("", "hi!", localDateTime22);
        main.models.UsageData usageData24 = new main.models.UsageData("", "hi!", localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.lang.String str8 = sensor2.getSensorId();
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
        java.lang.String str23 = sensor11.getSensorId();
        main.enums.SensorStatus sensorStatus25 = null;
        main.models.Sensor sensor26 = new main.models.Sensor("hi!", sensorStatus25);
        main.models.UsageLogger usageLogger27 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList28 = usageLogger27.getRecords();
        sensor26.attach((main.models.Observer) usageLogger27);
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        java.lang.String str34 = usageData33.getEquipmentId();
        usageLogger27.update(usageData33);
        java.time.LocalDateTime localDateTime38 = null;
        main.models.UsageData usageData39 = new main.models.UsageData("hi!", "", localDateTime38);
        usageLogger27.update(usageData39);
        java.util.List<main.models.UsageData> usageDataList41 = usageLogger27.getRecords();
        sensor11.attach((main.models.Observer) usageLogger27);
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        sensor47.setSensorId("");
        sensor47.setSensorId("");
        java.time.LocalDateTime localDateTime52 = sensor47.getLastUpdateTime();
        main.models.UsageData usageData53 = new main.models.UsageData("", "hi!", localDateTime52);
        sensor11.recordUsage(usageData53);
        java.lang.String str55 = usageData53.getOperationStatus();
        sensor2.notifyObservers(usageData53);
        main.enums.SensorStatus sensorStatus57 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus57);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
        main.models.UsageData usageData7 = null;
        sensor2.notifyObservers(usageData7);
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
        main.models.UsageData usageData76 = new main.models.UsageData("", "", localDateTime73);
        sensor2.setLastUpdateTime(localDateTime73);
        java.lang.String str78 = sensor2.getSensorId();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "" + "'", str78.equals(""));
    }
}

