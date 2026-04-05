package test.java.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test601");
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
        main.models.SystemAlert systemAlert53 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList54 = systemAlert53.getMessages();
        java.util.List<java.lang.String> strList55 = systemAlert53.getMessages();
        main.models.UsageLogger usageLogger56 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        usageLogger56.update(usageData60);
        systemAlert53.update(usageData60);
        sensor41.notifyObservers(usageData60);
        sensor2.recordUsage(usageData60);
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
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "" + "'", str51.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList55);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test602");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime3 = null;
        main.models.UsageData usageData4 = new main.models.UsageData("hi!", "", localDateTime3);
        usageLogger0.update(usageData4);
        java.lang.String str6 = usageData4.getEquipmentId();
        java.lang.String str7 = usageData4.getOperationStatus();
        java.time.LocalDateTime localDateTime8 = usageData4.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test603");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        main.models.SystemAlert systemAlert6 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList7 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList8 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert6.getMessages();
        main.enums.SensorStatus sensorStatus11 = null;
        main.models.Sensor sensor12 = new main.models.Sensor("hi!", sensorStatus11);
        main.models.UsageLogger usageLogger13 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList14 = usageLogger13.getRecords();
        sensor12.attach((main.models.Observer) usageLogger13);
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("hi!", "", localDateTime18);
        java.lang.String str20 = usageData19.getEquipmentId();
        usageLogger13.update(usageData19);
        java.time.LocalDateTime localDateTime24 = null;
        main.models.UsageData usageData25 = new main.models.UsageData("hi!", "", localDateTime24);
        usageLogger13.update(usageData25);
        systemAlert6.update(usageData25);
        sensor2.attach((main.models.Observer) systemAlert6);
        main.enums.SensorStatus sensorStatus32 = null;
        main.models.Sensor sensor33 = new main.models.Sensor("hi!", sensorStatus32);
        sensor33.setSensorId("");
        java.time.LocalDateTime localDateTime38 = null;
        main.models.UsageData usageData39 = new main.models.UsageData("hi!", "", localDateTime38);
        java.lang.String str40 = usageData39.getEquipmentId();
        java.time.LocalDateTime localDateTime41 = usageData39.getRecordedAt();
        java.time.LocalDateTime localDateTime42 = usageData39.getRecordedAt();
        java.lang.String str43 = usageData39.getOperationStatus();
        sensor33.recordUsage(usageData39);
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        sensor47.setSensorId("");
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("hi!", "", localDateTime52);
        java.lang.String str54 = usageData53.getEquipmentId();
        java.time.LocalDateTime localDateTime55 = usageData53.getRecordedAt();
        java.time.LocalDateTime localDateTime56 = usageData53.getRecordedAt();
        java.lang.String str57 = usageData53.getOperationStatus();
        sensor47.recordUsage(usageData53);
        main.enums.SensorStatus sensorStatus60 = null;
        main.models.Sensor sensor61 = new main.models.Sensor("hi!", sensorStatus60);
        main.models.UsageLogger usageLogger62 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList63 = usageLogger62.getRecords();
        sensor61.attach((main.models.Observer) usageLogger62);
        java.time.LocalDateTime localDateTime67 = null;
        main.models.UsageData usageData68 = new main.models.UsageData("hi!", "", localDateTime67);
        java.lang.String str69 = usageData68.getEquipmentId();
        usageLogger62.update(usageData68);
        main.enums.SensorStatus sensorStatus72 = null;
        main.models.Sensor sensor73 = new main.models.Sensor("hi!", sensorStatus72);
        java.time.LocalDateTime localDateTime76 = null;
        main.models.UsageData usageData77 = new main.models.UsageData("hi!", "", localDateTime76);
        java.lang.String str78 = usageData77.getEquipmentId();
        sensor73.notifyObservers(usageData77);
        usageLogger62.update(usageData77);
        sensor47.attach((main.models.Observer) usageLogger62);
        java.util.List<main.models.UsageData> usageDataList82 = usageLogger62.getRecords();
        sensor33.attach((main.models.Observer) usageLogger62);
        java.time.LocalDateTime localDateTime84 = sensor33.getLastUpdateTime();
        main.models.UsageData usageData85 = new main.models.UsageData("", "hi!", localDateTime84);
        systemAlert6.update(usageData85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!" + "'", str40.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "hi!" + "'", str78.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime84);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test604");
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
        java.lang.String str16 = usageData14.getEquipmentId();
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
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test605");
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
        main.enums.SensorStatus sensorStatus25 = null;
        main.models.Sensor sensor26 = new main.models.Sensor("hi!", sensorStatus25);
        sensor26.setSensorId("");
        java.time.LocalDateTime localDateTime31 = null;
        main.models.UsageData usageData32 = new main.models.UsageData("hi!", "", localDateTime31);
        java.lang.String str33 = usageData32.getEquipmentId();
        java.time.LocalDateTime localDateTime34 = usageData32.getRecordedAt();
        sensor26.recordUsage(usageData32);
        sensor26.setSensorId("");
        main.models.UsageLogger usageLogger38 = new main.models.UsageLogger();
        sensor26.detach((main.models.Observer) usageLogger38);
        sensor2.attach((main.models.Observer) usageLogger38);
        main.enums.SensorStatus sensorStatus42 = null;
        main.models.Sensor sensor43 = new main.models.Sensor("hi!", sensorStatus42);
        java.time.LocalDateTime localDateTime46 = null;
        main.models.UsageData usageData47 = new main.models.UsageData("hi!", "", localDateTime46);
        java.lang.String str48 = usageData47.getEquipmentId();
        sensor43.notifyObservers(usageData47);
        java.time.LocalDateTime localDateTime50 = sensor43.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime50);
        main.models.UsageData usageData52 = null;
        sensor2.notifyObservers(usageData52);
        java.lang.String str54 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "hi!" + "'", str48.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!" + "'", str54.equals("hi!"));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test606");
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
        java.util.List<main.models.User> userList42 = cSVDatabaseManager27.readUsers();
        cSVDatabaseManager10.writeUsers(userList42);
        java.util.List<main.models.Reservation> reservationList44 = cSVDatabaseManager10.readReservations();
        java.util.List<main.models.Equipment> equipmentList45 = cSVDatabaseManager10.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList45);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager47.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        main.models.Reservation[] reservationArray52 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList53 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList53, reservationArray52);
        cSVDatabaseManager47.writeReservations((java.util.List<main.models.Reservation>) reservationList53);
        java.util.List<main.models.Equipment> equipmentList56 = cSVDatabaseManager47.readEquipment();
        main.models.DatabaseProxy databaseProxy57 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        java.util.List<main.models.Equipment> equipmentList58 = databaseProxy57.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList58);
        java.util.List<main.models.Payment> paymentList60 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList45);
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
        org.junit.Assert.assertNotNull(equipmentList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList60);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test607");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager7);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray15 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList16 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList16, equipmentArray15);
        cSVDatabaseManager14.writeEquipment((java.util.List<main.models.Equipment>) equipmentList16);
        main.models.Reservation[] reservationArray19 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList20 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList20, reservationArray19);
        cSVDatabaseManager14.writeReservations((java.util.List<main.models.Reservation>) reservationList20);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList20);
        databaseProxy8.writeReservations((java.util.List<main.models.Reservation>) reservationList20);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        databaseProxy8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        java.util.List<main.models.Reservation> reservationList31 = databaseProxy8.readReservations();
        databaseProxy1.writeReservations(reservationList31);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        main.models.Payment[] paymentArray40 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList41 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList41, paymentArray40);
        databaseProxy39.writePayments((java.util.List<main.models.Payment>) paymentList41);
        cSVDatabaseManager33.writePayments((java.util.List<main.models.Payment>) paymentList41);
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.Reservation[] reservationArray54 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList55 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList55, reservationArray54);
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        java.util.List<main.models.User> userList64 = cSVDatabaseManager49.readUsers();
        java.util.List<main.models.Equipment> equipmentList65 = cSVDatabaseManager49.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager66 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray67 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList68 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList68, equipmentArray67);
        cSVDatabaseManager66.writeEquipment((java.util.List<main.models.Equipment>) equipmentList68);
        main.models.Reservation[] reservationArray71 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList72 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList72, reservationArray71);
        cSVDatabaseManager66.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        main.models.CSVDatabaseManager cSVDatabaseManager75 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray76 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList77 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList77, equipmentArray76);
        cSVDatabaseManager75.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        cSVDatabaseManager66.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        java.util.List<main.models.User> userList81 = cSVDatabaseManager66.readUsers();
        cSVDatabaseManager49.writeUsers(userList81);
        java.util.List<main.models.Equipment> equipmentList83 = cSVDatabaseManager49.readEquipment();
        java.util.List<main.models.Reservation> reservationList84 = cSVDatabaseManager49.readReservations();
        cSVDatabaseManager33.writeReservations(reservationList84);
        databaseProxy1.writeReservations(reservationList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList65);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList84);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test608");
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
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        sensor40.setSensorId("");
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        java.time.LocalDateTime localDateTime48 = usageData46.getRecordedAt();
        java.time.LocalDateTime localDateTime49 = usageData46.getRecordedAt();
        java.lang.String str50 = usageData46.getOperationStatus();
        sensor40.recordUsage(usageData46);
        main.enums.SensorStatus sensorStatus55 = null;
        main.models.Sensor sensor56 = new main.models.Sensor("hi!", sensorStatus55);
        sensor56.setSensorId("");
        sensor56.setSensorId("");
        java.time.LocalDateTime localDateTime61 = sensor56.getLastUpdateTime();
        main.models.UsageData usageData62 = new main.models.UsageData("hi!", "hi!", localDateTime61);
        sensor40.setLastUpdateTime(localDateTime61);
        java.time.LocalDateTime localDateTime64 = sensor40.getLastUpdateTime();
        main.models.UsageData usageData65 = new main.models.UsageData("", "", localDateTime64);
        sensor2.notifyObservers(usageData65);
        java.time.LocalDateTime localDateTime67 = null;
        sensor2.setLastUpdateTime(localDateTime67);
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
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime64);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test609");
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
        main.enums.SensorStatus sensorStatus36 = null;
        main.models.Sensor sensor37 = new main.models.Sensor("hi!", sensorStatus36);
        sensor37.setSensorId("");
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        java.lang.String str44 = usageData43.getEquipmentId();
        java.time.LocalDateTime localDateTime45 = usageData43.getRecordedAt();
        sensor37.recordUsage(usageData43);
        sensor37.setSensorId("hi!");
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("", "hi!", localDateTime51);
        sensor37.notifyObservers(usageData52);
        main.enums.SensorStatus sensorStatus54 = sensor37.getStatus();
        main.models.SystemAlert systemAlert55 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList56 = systemAlert55.getMessages();
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("", "hi!", localDateTime59);
        systemAlert55.update(usageData60);
        main.models.SystemAlert systemAlert62 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList63 = systemAlert62.getMessages();
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("", "hi!", localDateTime66);
        systemAlert62.update(usageData67);
        systemAlert55.update(usageData67);
        sensor37.detach((main.models.Observer) systemAlert55);
        main.models.UsageLogger usageLogger71 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("hi!", "", localDateTime74);
        usageLogger71.update(usageData75);
        java.lang.String str77 = usageData75.getEquipmentId();
        systemAlert55.update(usageData75);
        main.models.SystemAlert systemAlert79 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList80 = systemAlert79.getMessages();
        java.time.LocalDateTime localDateTime83 = null;
        main.models.UsageData usageData84 = new main.models.UsageData("", "hi!", localDateTime83);
        systemAlert79.update(usageData84);
        java.time.LocalDateTime localDateTime88 = null;
        main.models.UsageData usageData89 = new main.models.UsageData("hi!", "", localDateTime88);
        java.lang.String str90 = usageData89.getEquipmentId();
        java.time.LocalDateTime localDateTime91 = usageData89.getRecordedAt();
        java.time.LocalDateTime localDateTime92 = usageData89.getRecordedAt();
        systemAlert79.update(usageData89);
        java.lang.String str94 = usageData89.getOperationStatus();
        java.time.LocalDateTime localDateTime95 = usageData89.getRecordedAt();
        systemAlert55.update(usageData89);
        sensor2.recordUsage(usageData89);
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
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "hi!" + "'", str90.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "" + "'", str94.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime95);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test610");
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
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        sensor38.setSensorId("");
        sensor38.setSensorId("");
        java.time.LocalDateTime localDateTime43 = sensor38.getLastUpdateTime();
        main.models.UsageData usageData44 = new main.models.UsageData("", "hi!", localDateTime43);
        sensor2.recordUsage(usageData44);
        main.models.UsageLogger usageLogger46 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime49 = null;
        main.models.UsageData usageData50 = new main.models.UsageData("hi!", "", localDateTime49);
        usageLogger46.update(usageData50);
        main.enums.SensorStatus sensorStatus53 = null;
        main.models.Sensor sensor54 = new main.models.Sensor("hi!", sensorStatus53);
        sensor54.setSensorId("");
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        java.lang.String str61 = usageData60.getEquipmentId();
        java.time.LocalDateTime localDateTime62 = usageData60.getRecordedAt();
        sensor54.recordUsage(usageData60);
        sensor54.setSensorId("hi!");
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("", "hi!", localDateTime68);
        sensor54.notifyObservers(usageData69);
        usageLogger46.update(usageData69);
        sensor2.recordUsage(usageData69);
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
        org.junit.Assert.assertNotNull(localDateTime43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime62);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test611");
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
        main.models.CSVDatabaseManager cSVDatabaseManager66 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy67 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager66);
        java.util.List<main.models.User> userList68 = databaseProxy67.readUsers();
        main.models.User[] userArray69 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList70 = new java.util.ArrayList<main.models.User>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList70, userArray69);
        databaseProxy67.writeUsers((java.util.List<main.models.User>) userList70);
        main.models.CSVDatabaseManager cSVDatabaseManager73 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray74 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList75 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList75, equipmentArray74);
        cSVDatabaseManager73.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        main.models.Payment[] paymentArray78 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList79 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList79, paymentArray78);
        cSVDatabaseManager73.writePayments((java.util.List<main.models.Payment>) paymentList79);
        java.util.List<main.models.Payment> paymentList82 = cSVDatabaseManager73.readPayments();
        databaseProxy67.writePayments(paymentList82);
        java.util.List<main.models.Equipment> equipmentList84 = databaseProxy67.readEquipment();
        java.util.List<main.models.Equipment> equipmentList85 = databaseProxy67.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList85);
        java.util.List<main.models.User> userList87 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList87);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test612");
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
        main.models.UsageLogger usageLogger29 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList30 = usageLogger29.getRecords();
        sensor28.attach((main.models.Observer) usageLogger29);
        main.enums.SensorStatus sensorStatus32 = null;
        sensor28.setStatus(sensorStatus32);
        main.enums.SensorStatus sensorStatus34 = sensor28.getStatus();
        main.models.UsageLogger usageLogger35 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList36 = usageLogger35.getRecords();
        sensor28.detach((main.models.Observer) usageLogger35);
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        sensor40.setSensorId("");
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        java.time.LocalDateTime localDateTime48 = usageData46.getRecordedAt();
        java.time.LocalDateTime localDateTime49 = usageData46.getRecordedAt();
        java.lang.String str50 = usageData46.getOperationStatus();
        sensor40.recordUsage(usageData46);
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
        main.enums.SensorStatus sensorStatus67 = null;
        main.models.Sensor sensor68 = new main.models.Sensor("hi!", sensorStatus67);
        main.models.UsageLogger usageLogger69 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList70 = usageLogger69.getRecords();
        sensor68.attach((main.models.Observer) usageLogger69);
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("hi!", "", localDateTime74);
        java.lang.String str76 = usageData75.getEquipmentId();
        usageLogger69.update(usageData75);
        main.enums.SensorStatus sensorStatus79 = null;
        main.models.Sensor sensor80 = new main.models.Sensor("hi!", sensorStatus79);
        java.time.LocalDateTime localDateTime83 = null;
        main.models.UsageData usageData84 = new main.models.UsageData("hi!", "", localDateTime83);
        java.lang.String str85 = usageData84.getEquipmentId();
        sensor80.notifyObservers(usageData84);
        usageLogger69.update(usageData84);
        sensor54.attach((main.models.Observer) usageLogger69);
        java.util.List<main.models.UsageData> usageDataList89 = usageLogger69.getRecords();
        sensor40.attach((main.models.Observer) usageLogger69);
        java.time.LocalDateTime localDateTime91 = sensor40.getLastUpdateTime();
        sensor28.setLastUpdateTime(localDateTime91);
        java.time.LocalDateTime localDateTime95 = null;
        main.models.UsageData usageData96 = new main.models.UsageData("hi!", "", localDateTime95);
        sensor28.recordUsage(usageData96);
        java.lang.String str98 = usageData96.getEquipmentId();
        usageLogger0.update(usageData96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "" + "'", str50.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "hi!" + "'", str85.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str98 + "' != '" + "hi!" + "'", str98.equals("hi!"));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test613");
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
        java.util.List<main.models.Equipment> equipmentList28 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        main.models.Payment[] paymentArray31 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList32 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList32, paymentArray31);
        databaseProxy30.writePayments((java.util.List<main.models.Payment>) paymentList32);
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
        databaseProxy30.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        java.util.List<main.models.Payment> paymentList54 = databaseProxy30.readPayments();
        java.util.List<main.models.Payment> paymentList55 = databaseProxy30.readPayments();
        java.util.List<main.models.Reservation> reservationList56 = databaseProxy30.readReservations();
        java.util.List<main.models.Reservation> reservationList57 = databaseProxy30.readReservations();
        databaseProxy1.writeReservations(reservationList57);
        java.util.List<main.models.User> userList59 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(equipmentList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.junit.Assert.assertNotNull(paymentList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test614");
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
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
        main.models.Payment[] paymentArray35 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList36 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList36, paymentArray35);
        databaseProxy34.writePayments((java.util.List<main.models.Payment>) paymentList36);
        cSVDatabaseManager28.writePayments((java.util.List<main.models.Payment>) paymentList36);
        main.models.Equipment[] equipmentArray40 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList41 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList41, equipmentArray40);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList41);
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
        java.util.List<main.models.Equipment> equipmentList60 = cSVDatabaseManager44.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.Reservation[] reservationArray66 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList67 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList67, reservationArray66);
        cSVDatabaseManager61.writeReservations((java.util.List<main.models.Reservation>) reservationList67);
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray71 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList72 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList72, equipmentArray71);
        cSVDatabaseManager70.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        java.util.List<main.models.Equipment> equipmentList78 = cSVDatabaseManager28.readEquipment();
        databaseProxy1.writeEquipment(equipmentList78);
        java.util.List<main.models.Equipment> equipmentList80 = databaseProxy1.readEquipment();
        java.util.List<main.models.User> userList81 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test615");
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
        main.enums.SensorStatus sensorStatus25 = null;
        main.models.Sensor sensor26 = new main.models.Sensor("hi!", sensorStatus25);
        sensor26.setSensorId("");
        java.time.LocalDateTime localDateTime31 = null;
        main.models.UsageData usageData32 = new main.models.UsageData("hi!", "", localDateTime31);
        java.lang.String str33 = usageData32.getEquipmentId();
        java.time.LocalDateTime localDateTime34 = usageData32.getRecordedAt();
        sensor26.recordUsage(usageData32);
        sensor26.setSensorId("hi!");
        java.time.LocalDateTime localDateTime40 = null;
        main.models.UsageData usageData41 = new main.models.UsageData("", "hi!", localDateTime40);
        sensor26.notifyObservers(usageData41);
        main.enums.SensorStatus sensorStatus43 = sensor26.getStatus();
        main.models.SystemAlert systemAlert44 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList45 = systemAlert44.getMessages();
        java.time.LocalDateTime localDateTime48 = null;
        main.models.UsageData usageData49 = new main.models.UsageData("", "hi!", localDateTime48);
        systemAlert44.update(usageData49);
        main.models.SystemAlert systemAlert51 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList52 = systemAlert51.getMessages();
        java.time.LocalDateTime localDateTime55 = null;
        main.models.UsageData usageData56 = new main.models.UsageData("", "hi!", localDateTime55);
        systemAlert51.update(usageData56);
        systemAlert44.update(usageData56);
        sensor26.detach((main.models.Observer) systemAlert44);
        sensor2.detach((main.models.Observer) systemAlert44);
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
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!" + "'", str33.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList52);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test616");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList3 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList4 = systemAlert0.getMessages();
        main.enums.SensorStatus sensorStatus6 = null;
        main.models.Sensor sensor7 = new main.models.Sensor("hi!", sensorStatus6);
        main.models.SystemAlert systemAlert8 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList9 = systemAlert8.getMessages();
        java.time.LocalDateTime localDateTime12 = null;
        main.models.UsageData usageData13 = new main.models.UsageData("", "hi!", localDateTime12);
        systemAlert8.update(usageData13);
        sensor7.notifyObservers(usageData13);
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = sensor20.getLastUpdateTime();
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "hi!", localDateTime25);
        sensor7.notifyObservers(usageData26);
        systemAlert0.update(usageData26);
        java.lang.String str29 = usageData26.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test617");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime6 = sensor2.getLastUpdateTime();
        main.models.SystemAlert systemAlert7 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList8 = systemAlert7.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert7.getMessages();
        java.util.List<java.lang.String> strList10 = systemAlert7.getMessages();
        sensor2.detach((main.models.Observer) systemAlert7);
        main.models.UsageLogger usageLogger12 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("hi!", "", localDateTime15);
        usageLogger12.update(usageData16);
        sensor2.detach((main.models.Observer) usageLogger12);
        main.enums.SensorStatus sensorStatus19 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus19);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test618");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = sensor2.getStatus();
        main.models.SystemAlert systemAlert6 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList7 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList8 = systemAlert6.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert6.getMessages();
        sensor2.attach((main.models.Observer) systemAlert6);
        main.enums.SensorStatus sensorStatus11 = null;
        sensor2.setStatus(sensorStatus11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test619");
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
        java.time.LocalDateTime localDateTime30 = null;
        main.models.UsageData usageData31 = new main.models.UsageData("hi!", "", localDateTime30);
        java.lang.String str32 = usageData31.getEquipmentId();
        sensor27.notifyObservers(usageData31);
        main.enums.SensorStatus sensorStatus34 = sensor27.getStatus();
        sensor27.setSensorId("hi!");
        java.lang.String str37 = sensor27.getSensorId();
        java.time.LocalDateTime localDateTime38 = sensor27.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime38);
        sensor2.setSensorId("");
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
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime38);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test620");
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
        java.util.List<main.models.Equipment> equipmentList25 = databaseProxy1.readEquipment();
        java.util.List<main.models.Equipment> equipmentList26 = databaseProxy1.readEquipment();
        java.util.List<main.models.Equipment> equipmentList27 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList27);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test621");
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
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        sensor14.setSensorId("");
        java.time.LocalDateTime localDateTime19 = null;
        main.models.UsageData usageData20 = new main.models.UsageData("hi!", "", localDateTime19);
        java.lang.String str21 = usageData20.getEquipmentId();
        java.time.LocalDateTime localDateTime22 = usageData20.getRecordedAt();
        java.time.LocalDateTime localDateTime23 = usageData20.getRecordedAt();
        java.lang.String str24 = usageData20.getOperationStatus();
        sensor14.recordUsage(usageData20);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        sensor28.setSensorId("");
        java.time.LocalDateTime localDateTime33 = null;
        main.models.UsageData usageData34 = new main.models.UsageData("hi!", "", localDateTime33);
        java.lang.String str35 = usageData34.getEquipmentId();
        java.time.LocalDateTime localDateTime36 = usageData34.getRecordedAt();
        java.time.LocalDateTime localDateTime37 = usageData34.getRecordedAt();
        java.lang.String str38 = usageData34.getOperationStatus();
        sensor28.recordUsage(usageData34);
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
        sensor28.attach((main.models.Observer) usageLogger43);
        java.util.List<main.models.UsageData> usageDataList63 = usageLogger43.getRecords();
        sensor14.attach((main.models.Observer) usageLogger43);
        java.time.LocalDateTime localDateTime65 = sensor14.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime65);
        java.time.LocalDateTime localDateTime69 = null;
        main.models.UsageData usageData70 = new main.models.UsageData("hi!", "", localDateTime69);
        sensor2.recordUsage(usageData70);
        java.time.LocalDateTime localDateTime72 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!" + "'", str35.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "" + "'", str38.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime72);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test622");
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
        java.util.List<main.models.Reservation> reservationList27 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.Reservation[] reservationArray38 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList39 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList39, reservationArray38);
        cSVDatabaseManager33.writeReservations((java.util.List<main.models.Reservation>) reservationList39);
        cSVDatabaseManager28.writeReservations((java.util.List<main.models.Reservation>) reservationList39);
        java.util.List<main.models.Equipment> equipmentList43 = cSVDatabaseManager28.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy45 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager44);
        main.models.Payment[] paymentArray46 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList47 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList47, paymentArray46);
        databaseProxy45.writePayments((java.util.List<main.models.Payment>) paymentList47);
        java.util.List<main.models.Reservation> reservationList50 = databaseProxy45.readReservations();
        cSVDatabaseManager28.writeReservations(reservationList50);
        java.util.List<main.models.Equipment> equipmentList52 = cSVDatabaseManager28.readEquipment();
        java.util.List<main.models.User> userList53 = cSVDatabaseManager28.readUsers();
        cSVDatabaseManager0.writeUsers(userList53);
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
        org.junit.Assert.assertNotNull(reservationList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.junit.Assert.assertNotNull(equipmentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList53);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test623");
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
        java.util.List<main.models.Equipment> equipmentList35 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray37 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList38 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList38, equipmentArray37);
        cSVDatabaseManager36.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList38);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        main.models.Reservation[] reservationArray47 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList48 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList48, reservationArray47);
        cSVDatabaseManager42.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray52 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList53 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList53, equipmentArray52);
        cSVDatabaseManager51.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList53);
        java.util.List<main.models.User> userList57 = cSVDatabaseManager42.readUsers();
        java.util.List<main.models.Equipment> equipmentList58 = cSVDatabaseManager42.readEquipment();
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
        cSVDatabaseManager42.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        java.util.List<main.models.User> userList76 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList77 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(equipmentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList58);
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
        org.junit.Assert.assertNotNull(userList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList77);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test624");
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
        main.enums.SensorStatus sensorStatus49 = null;
        main.models.Sensor sensor50 = new main.models.Sensor("hi!", sensorStatus49);
        sensor50.setSensorId("");
        main.enums.SensorStatus sensorStatus53 = null;
        sensor50.setStatus(sensorStatus53);
        main.models.SystemAlert systemAlert55 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList56 = systemAlert55.getMessages();
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("", "hi!", localDateTime59);
        systemAlert55.update(usageData60);
        sensor50.detach((main.models.Observer) systemAlert55);
        main.enums.SensorStatus sensorStatus64 = null;
        main.models.Sensor sensor65 = new main.models.Sensor("hi!", sensorStatus64);
        sensor65.setSensorId("");
        java.time.LocalDateTime localDateTime70 = null;
        main.models.UsageData usageData71 = new main.models.UsageData("hi!", "", localDateTime70);
        java.lang.String str72 = usageData71.getEquipmentId();
        java.time.LocalDateTime localDateTime73 = usageData71.getRecordedAt();
        java.time.LocalDateTime localDateTime74 = usageData71.getRecordedAt();
        java.lang.String str75 = usageData71.getOperationStatus();
        sensor65.recordUsage(usageData71);
        sensor50.recordUsage(usageData71);
        sensor2.recordUsage(usageData71);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "hi!" + "'", str72.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "" + "'", str75.equals(""));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test625");
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
        java.util.List<main.models.Reservation> reservationList10 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.User> userList11 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(reservationList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test626");
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
        main.enums.SensorStatus sensorStatus22 = null;
        main.models.Sensor sensor23 = new main.models.Sensor("hi!", sensorStatus22);
        sensor23.setSensorId("");
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("hi!", "", localDateTime28);
        java.lang.String str30 = usageData29.getEquipmentId();
        java.time.LocalDateTime localDateTime31 = usageData29.getRecordedAt();
        sensor23.recordUsage(usageData29);
        sensor23.setSensorId("hi!");
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("", "hi!", localDateTime37);
        sensor23.notifyObservers(usageData38);
        main.enums.SensorStatus sensorStatus40 = sensor23.getStatus();
        main.models.SystemAlert systemAlert41 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList42 = systemAlert41.getMessages();
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("", "hi!", localDateTime45);
        systemAlert41.update(usageData46);
        main.models.SystemAlert systemAlert48 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList49 = systemAlert48.getMessages();
        java.time.LocalDateTime localDateTime52 = null;
        main.models.UsageData usageData53 = new main.models.UsageData("", "hi!", localDateTime52);
        systemAlert48.update(usageData53);
        systemAlert41.update(usageData53);
        sensor23.detach((main.models.Observer) systemAlert41);
        sensor2.attach((main.models.Observer) systemAlert41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!" + "'", str30.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList49);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test627");
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
        java.util.List<main.models.Equipment> equipmentList34 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.User> userList35 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(equipmentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test628");
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
        java.util.List<main.models.User> userList28 = databaseProxy1.readUsers();
        java.util.List<main.models.Payment> paymentList29 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList29);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test629");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime3 = null;
        main.models.UsageData usageData4 = new main.models.UsageData("hi!", "", localDateTime3);
        usageLogger0.update(usageData4);
        java.lang.String str6 = usageData4.getEquipmentId();
        java.lang.String str7 = usageData4.getOperationStatus();
        java.lang.String str8 = usageData4.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test630");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        java.time.LocalDateTime localDateTime6 = sensor2.getLastUpdateTime();
        main.models.SystemAlert systemAlert7 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList8 = systemAlert7.getMessages();
        java.util.List<java.lang.String> strList9 = systemAlert7.getMessages();
        java.util.List<java.lang.String> strList10 = systemAlert7.getMessages();
        sensor2.detach((main.models.Observer) systemAlert7);
        main.models.SystemAlert systemAlert12 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList13 = systemAlert12.getMessages();
        java.util.List<java.lang.String> strList14 = systemAlert12.getMessages();
        main.models.UsageLogger usageLogger15 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime18 = null;
        main.models.UsageData usageData19 = new main.models.UsageData("hi!", "", localDateTime18);
        usageLogger15.update(usageData19);
        systemAlert12.update(usageData19);
        java.lang.String str22 = usageData19.getOperationStatus();
        java.lang.String str23 = usageData19.getEquipmentId();
        java.lang.String str24 = usageData19.getEquipmentId();
        sensor2.recordUsage(usageData19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test631");
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
        main.models.UsageLogger usageLogger19 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        usageLogger19.update(usageData23);
        main.models.SystemAlert systemAlert25 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList26 = systemAlert25.getMessages();
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("", "hi!", localDateTime29);
        systemAlert25.update(usageData30);
        usageLogger19.update(usageData30);
        sensor2.attach((main.models.Observer) usageLogger19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test632");
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
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Reservation[] reservationArray21 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList22 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList22, reservationArray21);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        java.util.List<main.models.Equipment> equipmentList25 = cSVDatabaseManager16.readEquipment();
        java.util.List<main.models.User> userList26 = cSVDatabaseManager16.readUsers();
        cSVDatabaseManager0.writeUsers(userList26);
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
        org.junit.Assert.assertNotNull(equipmentArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList26);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test633");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = null;
        sensor2.setStatus(sensorStatus8);
        main.models.SystemAlert systemAlert10 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList11 = systemAlert10.getMessages();
        java.util.List<java.lang.String> strList12 = systemAlert10.getMessages();
        java.util.List<java.lang.String> strList13 = systemAlert10.getMessages();
        sensor2.attach((main.models.Observer) systemAlert10);
        java.lang.String str15 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test634");
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
        java.util.List<main.models.Equipment> equipmentList46 = cSVDatabaseManager31.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy48 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        main.models.Payment[] paymentArray49 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList50 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList50, paymentArray49);
        databaseProxy48.writePayments((java.util.List<main.models.Payment>) paymentList50);
        java.util.List<main.models.Reservation> reservationList53 = databaseProxy48.readReservations();
        cSVDatabaseManager31.writeReservations(reservationList53);
        java.util.List<main.models.Equipment> equipmentList55 = cSVDatabaseManager31.readEquipment();
        java.util.List<main.models.User> userList56 = cSVDatabaseManager31.readUsers();
        databaseProxy1.writeUsers(userList56);
        java.util.List<main.models.Equipment> equipmentList58 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList58);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test635");
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
        java.lang.String str26 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test636");
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
        java.lang.String str91 = usageData90.getOperationStatus();
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
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test637");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        java.lang.String str9 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test638");
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
        java.time.LocalDateTime localDateTime55 = null;
        main.models.UsageData usageData56 = new main.models.UsageData("hi!", "", localDateTime55);
        java.lang.String str57 = usageData56.getEquipmentId();
        usageLogger36.update(usageData56);
        java.lang.String str59 = usageData56.getOperationStatus();
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
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "" + "'", str59.equals(""));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test639");
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
        java.util.List<main.models.Reservation> reservationList21 = cSVDatabaseManager0.readReservations();
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
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray38 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList39 = new java.util.ArrayList<main.models.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList39, userArray38);
        cSVDatabaseManager37.writeUsers((java.util.List<main.models.User>) userList39);
        cSVDatabaseManager22.writeUsers((java.util.List<main.models.User>) userList39);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        java.util.List<main.models.User> userList45 = databaseProxy44.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        java.util.List<main.models.User> userList48 = databaseProxy47.readUsers();
        databaseProxy44.writeUsers(userList48);
        java.util.List<main.models.Equipment> equipmentList50 = databaseProxy44.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager51 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy52 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager51);
        java.util.List<main.models.User> userList53 = databaseProxy52.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy55 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager54);
        java.util.List<main.models.User> userList56 = databaseProxy55.readUsers();
        databaseProxy52.writeUsers(userList56);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy59 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager58);
        java.util.List<main.models.User> userList60 = databaseProxy59.readUsers();
        databaseProxy52.writeUsers(userList60);
        databaseProxy44.writeUsers(userList60);
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray64 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList65 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList65, equipmentArray64);
        cSVDatabaseManager63.writeEquipment((java.util.List<main.models.Equipment>) equipmentList65);
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        cSVDatabaseManager63.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        java.util.List<main.models.User> userList72 = cSVDatabaseManager63.readUsers();
        databaseProxy44.writeUsers(userList72);
        java.util.List<main.models.Payment> paymentList74 = databaseProxy44.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager75 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy76 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager75);
        main.models.CSVDatabaseManager cSVDatabaseManager77 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray78 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList79 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList79, equipmentArray78);
        cSVDatabaseManager77.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        main.models.CSVDatabaseManager cSVDatabaseManager82 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray83 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList84 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList84, equipmentArray83);
        cSVDatabaseManager82.writeEquipment((java.util.List<main.models.Equipment>) equipmentList84);
        main.models.Reservation[] reservationArray87 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList88 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList88, reservationArray87);
        cSVDatabaseManager82.writeReservations((java.util.List<main.models.Reservation>) reservationList88);
        cSVDatabaseManager77.writeReservations((java.util.List<main.models.Reservation>) reservationList88);
        databaseProxy76.writeReservations((java.util.List<main.models.Reservation>) reservationList88);
        java.util.List<main.models.Equipment> equipmentList93 = databaseProxy76.readEquipment();
        databaseProxy44.writeEquipment(equipmentList93);
        cSVDatabaseManager22.writeEquipment(equipmentList93);
        cSVDatabaseManager0.writeEquipment(equipmentList93);
        java.util.List<main.models.Equipment> equipmentList97 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(reservationList21);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList97);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test640");
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
        main.models.UsageData usageData12 = null;
        sensor2.notifyObservers(usageData12);
        main.enums.SensorStatus sensorStatus14 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus16 = null;
        main.models.Sensor sensor17 = new main.models.Sensor("hi!", sensorStatus16);
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        java.lang.String str22 = usageData21.getEquipmentId();
        sensor17.notifyObservers(usageData21);
        main.enums.SensorStatus sensorStatus24 = sensor17.getStatus();
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("hi!", "", localDateTime27);
        java.lang.String str29 = usageData28.getEquipmentId();
        java.time.LocalDateTime localDateTime30 = usageData28.getRecordedAt();
        java.time.LocalDateTime localDateTime31 = usageData28.getRecordedAt();
        java.lang.String str32 = usageData28.getOperationStatus();
        sensor17.recordUsage(usageData28);
        main.models.UsageLogger usageLogger34 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("hi!", "", localDateTime37);
        usageLogger34.update(usageData38);
        main.enums.SensorStatus sensorStatus41 = null;
        main.models.Sensor sensor42 = new main.models.Sensor("hi!", sensorStatus41);
        sensor42.setSensorId("");
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("hi!", "", localDateTime47);
        java.lang.String str49 = usageData48.getEquipmentId();
        java.time.LocalDateTime localDateTime50 = usageData48.getRecordedAt();
        sensor42.recordUsage(usageData48);
        sensor42.setSensorId("hi!");
        java.time.LocalDateTime localDateTime56 = null;
        main.models.UsageData usageData57 = new main.models.UsageData("", "hi!", localDateTime56);
        sensor42.notifyObservers(usageData57);
        usageLogger34.update(usageData57);
        main.enums.SensorStatus sensorStatus61 = null;
        main.models.Sensor sensor62 = new main.models.Sensor("hi!", sensorStatus61);
        main.enums.SensorStatus sensorStatus63 = null;
        sensor62.setStatus(sensorStatus63);
        main.models.UsageLogger usageLogger65 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        usageLogger65.update(usageData69);
        sensor62.detach((main.models.Observer) usageLogger65);
        main.enums.SensorStatus sensorStatus73 = null;
        main.models.Sensor sensor74 = new main.models.Sensor("hi!", sensorStatus73);
        java.time.LocalDateTime localDateTime77 = null;
        main.models.UsageData usageData78 = new main.models.UsageData("hi!", "", localDateTime77);
        java.lang.String str79 = usageData78.getEquipmentId();
        sensor74.notifyObservers(usageData78);
        java.time.LocalDateTime localDateTime83 = null;
        main.models.UsageData usageData84 = new main.models.UsageData("", "", localDateTime83);
        sensor74.notifyObservers(usageData84);
        sensor62.notifyObservers(usageData84);
        java.lang.String str87 = usageData84.getEquipmentId();
        usageLogger34.update(usageData84);
        sensor17.detach((main.models.Observer) usageLogger34);
        sensor2.attach((main.models.Observer) usageLogger34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!" + "'", str49.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "hi!" + "'", str79.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "" + "'", str87.equals(""));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test641");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        java.lang.String str6 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus7 = null;
        sensor2.setStatus(sensorStatus7);
        main.enums.SensorStatus sensorStatus10 = null;
        main.models.Sensor sensor11 = new main.models.Sensor("hi!", sensorStatus10);
        main.models.UsageLogger usageLogger12 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList13 = usageLogger12.getRecords();
        sensor11.attach((main.models.Observer) usageLogger12);
        main.enums.SensorStatus sensorStatus15 = null;
        sensor11.setStatus(sensorStatus15);
        main.enums.SensorStatus sensorStatus17 = sensor11.getStatus();
        main.models.UsageLogger usageLogger18 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList19 = usageLogger18.getRecords();
        sensor11.detach((main.models.Observer) usageLogger18);
        main.models.UsageData usageData21 = null;
        sensor11.notifyObservers(usageData21);
        main.enums.SensorStatus sensorStatus24 = null;
        main.models.Sensor sensor25 = new main.models.Sensor("hi!", sensorStatus24);
        sensor25.setSensorId("");
        java.time.LocalDateTime localDateTime30 = null;
        main.models.UsageData usageData31 = new main.models.UsageData("hi!", "", localDateTime30);
        java.lang.String str32 = usageData31.getEquipmentId();
        java.time.LocalDateTime localDateTime33 = usageData31.getRecordedAt();
        sensor25.recordUsage(usageData31);
        sensor25.setSensorId("hi!");
        java.time.LocalDateTime localDateTime39 = null;
        main.models.UsageData usageData40 = new main.models.UsageData("", "hi!", localDateTime39);
        sensor25.notifyObservers(usageData40);
        main.enums.SensorStatus sensorStatus42 = sensor25.getStatus();
        main.models.SystemAlert systemAlert43 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList44 = systemAlert43.getMessages();
        java.time.LocalDateTime localDateTime47 = null;
        main.models.UsageData usageData48 = new main.models.UsageData("", "hi!", localDateTime47);
        systemAlert43.update(usageData48);
        main.models.SystemAlert systemAlert50 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList51 = systemAlert50.getMessages();
        java.time.LocalDateTime localDateTime54 = null;
        main.models.UsageData usageData55 = new main.models.UsageData("", "hi!", localDateTime54);
        systemAlert50.update(usageData55);
        systemAlert43.update(usageData55);
        sensor25.detach((main.models.Observer) systemAlert43);
        main.enums.SensorStatus sensorStatus60 = null;
        main.models.Sensor sensor61 = new main.models.Sensor("hi!", sensorStatus60);
        sensor61.setSensorId("");
        java.lang.String str64 = sensor61.getSensorId();
        java.time.LocalDateTime localDateTime65 = sensor61.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus67 = null;
        main.models.Sensor sensor68 = new main.models.Sensor("hi!", sensorStatus67);
        sensor68.setSensorId("");
        java.lang.String str71 = sensor68.getSensorId();
        java.time.LocalDateTime localDateTime72 = sensor68.getLastUpdateTime();
        sensor61.setLastUpdateTime(localDateTime72);
        sensor25.setLastUpdateTime(localDateTime72);
        main.enums.SensorStatus sensorStatus76 = null;
        main.models.Sensor sensor77 = new main.models.Sensor("hi!", sensorStatus76);
        sensor77.setSensorId("");
        main.models.SystemAlert systemAlert80 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList81 = systemAlert80.getMessages();
        java.time.LocalDateTime localDateTime84 = null;
        main.models.UsageData usageData85 = new main.models.UsageData("", "hi!", localDateTime84);
        systemAlert80.update(usageData85);
        java.time.LocalDateTime localDateTime89 = null;
        main.models.UsageData usageData90 = new main.models.UsageData("hi!", "", localDateTime89);
        java.lang.String str91 = usageData90.getEquipmentId();
        java.time.LocalDateTime localDateTime92 = usageData90.getRecordedAt();
        java.time.LocalDateTime localDateTime93 = usageData90.getRecordedAt();
        systemAlert80.update(usageData90);
        sensor77.attach((main.models.Observer) systemAlert80);
        sensor25.attach((main.models.Observer) systemAlert80);
        sensor11.detach((main.models.Observer) systemAlert80);
        java.util.List<java.lang.String> strList98 = systemAlert80.getMessages();
        sensor2.detach((main.models.Observer) systemAlert80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "" + "'", str64.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "" + "'", str71.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList98);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test642");
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
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "hi!", localDateTime66);
        main.models.UsageData usageData70 = new main.models.UsageData("", "hi!", localDateTime66);
        java.time.LocalDateTime localDateTime71 = usageData70.getRecordedAt();
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
        org.junit.Assert.assertNotNull(localDateTime71);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test643");
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
        main.enums.SensorStatus sensorStatus39 = null;
        main.models.Sensor sensor40 = new main.models.Sensor("hi!", sensorStatus39);
        sensor40.setSensorId("");
        main.enums.SensorStatus sensorStatus43 = null;
        sensor40.setStatus(sensorStatus43);
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        main.models.UsageLogger usageLogger48 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList49 = usageLogger48.getRecords();
        sensor47.attach((main.models.Observer) usageLogger48);
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        usageLogger48.update(usageData54);
        java.time.LocalDateTime localDateTime59 = null;
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        usageLogger48.update(usageData60);
        sensor40.detach((main.models.Observer) usageLogger48);
        main.enums.SensorStatus sensorStatus64 = null;
        main.models.Sensor sensor65 = new main.models.Sensor("hi!", sensorStatus64);
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        java.lang.String str70 = usageData69.getEquipmentId();
        sensor65.notifyObservers(usageData69);
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("", "", localDateTime74);
        sensor65.notifyObservers(usageData75);
        java.lang.String str77 = usageData75.getEquipmentId();
        sensor40.notifyObservers(usageData75);
        main.enums.SensorStatus sensorStatus80 = null;
        main.models.Sensor sensor81 = new main.models.Sensor("hi!", sensorStatus80);
        sensor81.setSensorId("");
        java.lang.String str84 = sensor81.getSensorId();
        java.time.LocalDateTime localDateTime85 = sensor81.getLastUpdateTime();
        sensor40.setLastUpdateTime(localDateTime85);
        sensor2.setLastUpdateTime(localDateTime85);
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
        org.junit.Assert.assertNotNull(usageDataList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "hi!" + "'", str70.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "" + "'", str84.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime85);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test644");
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
        main.enums.SensorStatus sensorStatus32 = null;
        sensor2.setStatus(sensorStatus32);
        main.enums.SensorStatus sensorStatus34 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus38 = null;
        main.models.Sensor sensor39 = new main.models.Sensor("hi!", sensorStatus38);
        sensor39.setSensorId("");
        java.time.LocalDateTime localDateTime44 = null;
        main.models.UsageData usageData45 = new main.models.UsageData("hi!", "", localDateTime44);
        java.lang.String str46 = usageData45.getEquipmentId();
        java.time.LocalDateTime localDateTime47 = usageData45.getRecordedAt();
        java.time.LocalDateTime localDateTime48 = usageData45.getRecordedAt();
        java.lang.String str49 = usageData45.getOperationStatus();
        sensor39.recordUsage(usageData45);
        main.enums.SensorStatus sensorStatus52 = null;
        main.models.Sensor sensor53 = new main.models.Sensor("hi!", sensorStatus52);
        sensor53.setSensorId("");
        java.time.LocalDateTime localDateTime58 = null;
        main.models.UsageData usageData59 = new main.models.UsageData("hi!", "", localDateTime58);
        java.lang.String str60 = usageData59.getEquipmentId();
        java.time.LocalDateTime localDateTime61 = usageData59.getRecordedAt();
        java.time.LocalDateTime localDateTime62 = usageData59.getRecordedAt();
        java.lang.String str63 = usageData59.getOperationStatus();
        sensor53.recordUsage(usageData59);
        main.enums.SensorStatus sensorStatus66 = null;
        main.models.Sensor sensor67 = new main.models.Sensor("hi!", sensorStatus66);
        main.models.UsageLogger usageLogger68 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList69 = usageLogger68.getRecords();
        sensor67.attach((main.models.Observer) usageLogger68);
        java.time.LocalDateTime localDateTime73 = null;
        main.models.UsageData usageData74 = new main.models.UsageData("hi!", "", localDateTime73);
        java.lang.String str75 = usageData74.getEquipmentId();
        usageLogger68.update(usageData74);
        main.enums.SensorStatus sensorStatus78 = null;
        main.models.Sensor sensor79 = new main.models.Sensor("hi!", sensorStatus78);
        java.time.LocalDateTime localDateTime82 = null;
        main.models.UsageData usageData83 = new main.models.UsageData("hi!", "", localDateTime82);
        java.lang.String str84 = usageData83.getEquipmentId();
        sensor79.notifyObservers(usageData83);
        usageLogger68.update(usageData83);
        sensor53.attach((main.models.Observer) usageLogger68);
        java.util.List<main.models.UsageData> usageDataList88 = usageLogger68.getRecords();
        sensor39.attach((main.models.Observer) usageLogger68);
        java.time.LocalDateTime localDateTime90 = sensor39.getLastUpdateTime();
        main.models.UsageData usageData91 = new main.models.UsageData("", "hi!", localDateTime90);
        sensor2.notifyObservers(usageData91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "" + "'", str49.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "" + "'", str63.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "hi!" + "'", str75.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "hi!" + "'", str84.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime90);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test645");
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
        main.enums.SensorStatus sensorStatus34 = null;
        main.models.Sensor sensor35 = new main.models.Sensor("hi!", sensorStatus34);
        sensor35.setSensorId("");
        main.enums.SensorStatus sensorStatus38 = sensor35.getStatus();
        main.models.SystemAlert systemAlert39 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList40 = systemAlert39.getMessages();
        java.util.List<java.lang.String> strList41 = systemAlert39.getMessages();
        java.util.List<java.lang.String> strList42 = systemAlert39.getMessages();
        sensor35.attach((main.models.Observer) systemAlert39);
        sensor2.detach((main.models.Observer) systemAlert39);
        java.util.List<java.lang.String> strList45 = systemAlert39.getMessages();
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
        org.junit.Assert.assertNull(sensorStatus38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList45);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test646");
        java.time.LocalDateTime localDateTime2 = null;
        main.models.UsageData usageData3 = new main.models.UsageData("hi!", "", localDateTime2);
        java.lang.String str4 = usageData3.getEquipmentId();
        java.time.LocalDateTime localDateTime5 = usageData3.getRecordedAt();
        java.time.LocalDateTime localDateTime6 = usageData3.getRecordedAt();
        java.lang.String str7 = usageData3.getOperationStatus();
        java.lang.String str8 = usageData3.getEquipmentId();
        java.lang.String str9 = usageData3.getEquipmentId();
        java.lang.String str10 = usageData3.getEquipmentId();
        java.lang.String str11 = usageData3.getOperationStatus();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test647");
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
        java.util.List<main.models.Equipment> equipmentList50 = databaseProxy49.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList50);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test648");
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
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        sensor38.setSensorId("");
        main.enums.SensorStatus sensorStatus41 = null;
        sensor38.setStatus(sensorStatus41);
        main.enums.SensorStatus sensorStatus44 = null;
        main.models.Sensor sensor45 = new main.models.Sensor("hi!", sensorStatus44);
        main.models.UsageLogger usageLogger46 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList47 = usageLogger46.getRecords();
        sensor45.attach((main.models.Observer) usageLogger46);
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        java.lang.String str53 = usageData52.getEquipmentId();
        usageLogger46.update(usageData52);
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("hi!", "", localDateTime57);
        usageLogger46.update(usageData58);
        sensor38.detach((main.models.Observer) usageLogger46);
        sensor2.detach((main.models.Observer) usageLogger46);
        main.enums.SensorStatus sensorStatus62 = null;
        sensor2.setStatus(sensorStatus62);
        main.enums.SensorStatus sensorStatus64 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus65 = null;
        sensor2.setStatus(sensorStatus65);
        java.lang.String str67 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus69 = null;
        main.models.Sensor sensor70 = new main.models.Sensor("hi!", sensorStatus69);
        main.models.UsageLogger usageLogger71 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList72 = usageLogger71.getRecords();
        sensor70.attach((main.models.Observer) usageLogger71);
        main.enums.SensorStatus sensorStatus74 = null;
        sensor70.setStatus(sensorStatus74);
        java.lang.String str76 = sensor70.getSensorId();
        main.enums.SensorStatus sensorStatus77 = null;
        sensor70.setStatus(sensorStatus77);
        java.time.LocalDateTime localDateTime79 = sensor70.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime79);
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
        org.junit.Assert.assertNotNull(usageDataList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "" + "'", str67.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime79);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test649");
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
        java.util.List<main.models.User> userList34 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList35 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList35);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test650");
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
        java.util.List<main.models.User> userList79 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList79);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test651");
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
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.CSVDatabaseManager cSVDatabaseManager24 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy25 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager24);
        main.models.Payment[] paymentArray26 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList27 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList27, paymentArray26);
        databaseProxy25.writePayments((java.util.List<main.models.Payment>) paymentList27);
        cSVDatabaseManager19.writePayments((java.util.List<main.models.Payment>) paymentList27);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList27);
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
        java.util.List<main.models.Equipment> equipmentList48 = cSVDatabaseManager32.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.Reservation[] reservationArray54 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList55 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList55, reservationArray54);
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        java.util.List<main.models.User> userList64 = cSVDatabaseManager49.readUsers();
        cSVDatabaseManager32.writeUsers(userList64);
        java.util.List<main.models.Reservation> reservationList66 = cSVDatabaseManager32.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList66);
        java.util.List<main.models.Reservation> reservationList68 = cSVDatabaseManager0.readReservations();
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
        main.models.CSVDatabaseManager cSVDatabaseManager84 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray85 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList86 = new java.util.ArrayList<main.models.User>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList86, userArray85);
        cSVDatabaseManager84.writeUsers((java.util.List<main.models.User>) userList86);
        cSVDatabaseManager69.writeUsers((java.util.List<main.models.User>) userList86);
        java.util.List<main.models.Equipment> equipmentList90 = cSVDatabaseManager69.readEquipment();
        java.util.List<main.models.Equipment> equipmentList91 = cSVDatabaseManager69.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList91);
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
        org.junit.Assert.assertNotNull(equipmentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
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
        org.junit.Assert.assertNotNull(equipmentList48);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList68);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList91);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test652");
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
        main.models.Payment[] paymentArray22 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList23 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList23, paymentArray22);
        databaseProxy21.writePayments((java.util.List<main.models.Payment>) paymentList23);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList23);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager27);
        main.models.Payment[] paymentArray29 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList30 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList30, paymentArray29);
        databaseProxy28.writePayments((java.util.List<main.models.Payment>) paymentList30);
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
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray49 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList50 = new java.util.ArrayList<main.models.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList50, userArray49);
        cSVDatabaseManager48.writeUsers((java.util.List<main.models.User>) userList50);
        cSVDatabaseManager33.writeUsers((java.util.List<main.models.User>) userList50);
        databaseProxy28.writeUsers((java.util.List<main.models.User>) userList50);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy56 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager55);
        main.models.Payment[] paymentArray57 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList58 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList58, paymentArray57);
        databaseProxy56.writePayments((java.util.List<main.models.Payment>) paymentList58);
        main.models.CSVDatabaseManager cSVDatabaseManager61 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray62 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList63 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList63, equipmentArray62);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList63);
        main.models.Reservation[] reservationArray66 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList67 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList67, reservationArray66);
        cSVDatabaseManager61.writeReservations((java.util.List<main.models.Reservation>) reservationList67);
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray71 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList72 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList72, equipmentArray71);
        cSVDatabaseManager70.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        cSVDatabaseManager61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray77 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList78 = new java.util.ArrayList<main.models.User>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList78, userArray77);
        cSVDatabaseManager76.writeUsers((java.util.List<main.models.User>) userList78);
        cSVDatabaseManager61.writeUsers((java.util.List<main.models.User>) userList78);
        databaseProxy56.writeUsers((java.util.List<main.models.User>) userList78);
        java.util.List<main.models.Payment> paymentList83 = databaseProxy56.readPayments();
        databaseProxy28.writePayments(paymentList83);
        java.util.List<main.models.Payment> paymentList85 = databaseProxy28.readPayments();
        databaseProxy1.writePayments(paymentList85);
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
        org.junit.Assert.assertNotNull(paymentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList85);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test653");
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
        sensor38.setSensorId("");
        java.lang.String str41 = sensor38.getSensorId();
        java.time.LocalDateTime localDateTime42 = sensor38.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus44 = null;
        main.models.Sensor sensor45 = new main.models.Sensor("hi!", sensorStatus44);
        sensor45.setSensorId("");
        java.lang.String str48 = sensor45.getSensorId();
        java.time.LocalDateTime localDateTime49 = sensor45.getLastUpdateTime();
        sensor38.setLastUpdateTime(localDateTime49);
        sensor2.setLastUpdateTime(localDateTime49);
        main.enums.SensorStatus sensorStatus53 = null;
        main.models.Sensor sensor54 = new main.models.Sensor("hi!", sensorStatus53);
        sensor54.setSensorId("");
        main.models.SystemAlert systemAlert57 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList58 = systemAlert57.getMessages();
        java.time.LocalDateTime localDateTime61 = null;
        main.models.UsageData usageData62 = new main.models.UsageData("", "hi!", localDateTime61);
        systemAlert57.update(usageData62);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        java.time.LocalDateTime localDateTime69 = usageData67.getRecordedAt();
        java.time.LocalDateTime localDateTime70 = usageData67.getRecordedAt();
        systemAlert57.update(usageData67);
        sensor54.attach((main.models.Observer) systemAlert57);
        sensor2.attach((main.models.Observer) systemAlert57);
        main.enums.SensorStatus sensorStatus74 = sensor2.getStatus();
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
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "" + "'", str48.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus74);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test654");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Reservation> reservationList2 = databaseProxy1.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList2);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test655");
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
        main.models.Observer observer12 = null;
        sensor2.detach(observer12);
        java.time.LocalDateTime localDateTime14 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test656");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList1 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Payment> paymentList2 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList3 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.User> userList4 = cSVDatabaseManager0.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList4);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test657");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Reservation> reservationList8 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray10 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList11 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList11, equipmentArray10);
        cSVDatabaseManager9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList11);
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray15 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList16 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList16, equipmentArray15);
        cSVDatabaseManager14.writeEquipment((java.util.List<main.models.Equipment>) equipmentList16);
        main.models.Reservation[] reservationArray19 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList20 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList20, reservationArray19);
        cSVDatabaseManager14.writeReservations((java.util.List<main.models.Reservation>) reservationList20);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList20);
        java.util.List<main.models.Equipment> equipmentList24 = cSVDatabaseManager9.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy26 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager25);
        main.models.Payment[] paymentArray27 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList28 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList28, paymentArray27);
        databaseProxy26.writePayments((java.util.List<main.models.Payment>) paymentList28);
        java.util.List<main.models.Reservation> reservationList31 = databaseProxy26.readReservations();
        cSVDatabaseManager9.writeReservations(reservationList31);
        cSVDatabaseManager0.writeReservations(reservationList31);
        java.util.List<main.models.Payment> paymentList34 = cSVDatabaseManager0.readPayments();
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
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        main.models.Equipment[] equipmentArray60 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList61 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList61, equipmentArray60);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList61);
        java.util.List<main.models.User> userList64 = cSVDatabaseManager55.readUsers();
        databaseProxy36.writeUsers(userList64);
        cSVDatabaseManager0.writeUsers(userList64);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList34);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList64);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test658");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        main.models.DatabaseProxy databaseProxy7 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy7);
        java.util.List<main.models.User> userList9 = databaseProxy7.readUsers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test659");
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
        java.util.List<main.models.Equipment> equipmentList33 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList33);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test660");
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
        main.enums.SensorStatus sensorStatus50 = null;
        main.models.Sensor sensor51 = new main.models.Sensor("hi!", sensorStatus50);
        sensor51.setSensorId("");
        java.time.LocalDateTime localDateTime56 = null;
        main.models.UsageData usageData57 = new main.models.UsageData("hi!", "", localDateTime56);
        java.lang.String str58 = usageData57.getEquipmentId();
        java.time.LocalDateTime localDateTime59 = usageData57.getRecordedAt();
        sensor51.recordUsage(usageData57);
        sensor51.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus63 = null;
        sensor51.setStatus(sensorStatus63);
        main.enums.SensorStatus sensorStatus65 = null;
        sensor51.setStatus(sensorStatus65);
        java.time.LocalDateTime localDateTime67 = sensor51.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime67);
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
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test661");
        main.enums.SensorStatus sensorStatus7 = null;
        main.models.Sensor sensor8 = new main.models.Sensor("hi!", sensorStatus7);
        sensor8.setSensorId("");
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("hi!", "", localDateTime13);
        java.lang.String str15 = usageData14.getEquipmentId();
        java.time.LocalDateTime localDateTime16 = usageData14.getRecordedAt();
        java.time.LocalDateTime localDateTime17 = usageData14.getRecordedAt();
        java.lang.String str18 = usageData14.getOperationStatus();
        sensor8.recordUsage(usageData14);
        main.enums.SensorStatus sensorStatus21 = null;
        main.models.Sensor sensor22 = new main.models.Sensor("hi!", sensorStatus21);
        sensor22.setSensorId("");
        java.time.LocalDateTime localDateTime27 = null;
        main.models.UsageData usageData28 = new main.models.UsageData("hi!", "", localDateTime27);
        java.lang.String str29 = usageData28.getEquipmentId();
        java.time.LocalDateTime localDateTime30 = usageData28.getRecordedAt();
        java.time.LocalDateTime localDateTime31 = usageData28.getRecordedAt();
        java.lang.String str32 = usageData28.getOperationStatus();
        sensor22.recordUsage(usageData28);
        main.enums.SensorStatus sensorStatus35 = null;
        main.models.Sensor sensor36 = new main.models.Sensor("hi!", sensorStatus35);
        main.models.UsageLogger usageLogger37 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList38 = usageLogger37.getRecords();
        sensor36.attach((main.models.Observer) usageLogger37);
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        java.lang.String str44 = usageData43.getEquipmentId();
        usageLogger37.update(usageData43);
        main.enums.SensorStatus sensorStatus47 = null;
        main.models.Sensor sensor48 = new main.models.Sensor("hi!", sensorStatus47);
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        java.lang.String str53 = usageData52.getEquipmentId();
        sensor48.notifyObservers(usageData52);
        usageLogger37.update(usageData52);
        sensor22.attach((main.models.Observer) usageLogger37);
        java.util.List<main.models.UsageData> usageDataList57 = usageLogger37.getRecords();
        sensor8.attach((main.models.Observer) usageLogger37);
        main.enums.SensorStatus sensorStatus62 = null;
        main.models.Sensor sensor63 = new main.models.Sensor("hi!", sensorStatus62);
        sensor63.setSensorId("");
        sensor63.setSensorId("");
        java.time.LocalDateTime localDateTime68 = sensor63.getLastUpdateTime();
        main.models.UsageData usageData69 = new main.models.UsageData("", "hi!", localDateTime68);
        sensor8.setLastUpdateTime(localDateTime68);
        main.models.UsageData usageData71 = new main.models.UsageData("", "hi!", localDateTime68);
        main.models.UsageData usageData72 = new main.models.UsageData("", "", localDateTime68);
        main.models.UsageData usageData73 = new main.models.UsageData("hi!", "", localDateTime68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime68);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test662");
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
        main.models.User[] userArray20 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList21 = new java.util.ArrayList<main.models.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList21, userArray20);
        cSVDatabaseManager18.writeUsers((java.util.List<main.models.User>) userList21);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList21);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy26 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager25);
        java.util.List<main.models.User> userList27 = databaseProxy26.readUsers();
        main.models.User[] userArray28 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList29 = new java.util.ArrayList<main.models.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList29, userArray28);
        databaseProxy26.writeUsers((java.util.List<main.models.User>) userList29);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray33 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList34 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList34, equipmentArray33);
        cSVDatabaseManager32.writeEquipment((java.util.List<main.models.Equipment>) equipmentList34);
        main.models.Payment[] paymentArray37 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList38 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList38, paymentArray37);
        cSVDatabaseManager32.writePayments((java.util.List<main.models.Payment>) paymentList38);
        java.util.List<main.models.Payment> paymentList41 = cSVDatabaseManager32.readPayments();
        databaseProxy26.writePayments(paymentList41);
        java.util.List<main.models.Equipment> equipmentList43 = databaseProxy26.readEquipment();
        java.util.List<main.models.Equipment> equipmentList44 = databaseProxy26.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager45 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy46 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager45);
        java.util.List<main.models.User> userList47 = databaseProxy46.readUsers();
        main.models.User[] userArray48 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList49 = new java.util.ArrayList<main.models.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList49, userArray48);
        databaseProxy46.writeUsers((java.util.List<main.models.User>) userList49);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy53 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager52);
        main.models.User[] userArray54 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList55 = new java.util.ArrayList<main.models.User>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList55, userArray54);
        cSVDatabaseManager52.writeUsers((java.util.List<main.models.User>) userList55);
        java.util.List<main.models.Payment> paymentList58 = cSVDatabaseManager52.readPayments();
        java.util.List<main.models.User> userList59 = cSVDatabaseManager52.readUsers();
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
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray79 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList80 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList80, equipmentArray79);
        cSVDatabaseManager78.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        databaseProxy61.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        java.util.List<main.models.User> userList84 = databaseProxy61.readUsers();
        cSVDatabaseManager52.writeUsers(userList84);
        databaseProxy46.writeUsers(userList84);
        databaseProxy26.writeUsers(userList84);
        java.util.List<main.models.User> userList88 = databaseProxy26.readUsers();
        databaseProxy1.writeUsers(userList88);
        java.util.List<main.models.User> userList90 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList90);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test663");
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
        java.lang.String str15 = usageData12.getOperationStatus();
        java.lang.String str16 = usageData12.getOperationStatus();
        java.lang.String str17 = usageData12.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test664");
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
        java.util.List<main.models.User> userList21 = databaseProxy1.readUsers();
        java.util.List<main.models.Equipment> equipmentList22 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test665");
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
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        java.util.List<main.models.Reservation> reservationList25 = cSVDatabaseManager16.readReservations();
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
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        java.util.List<main.models.Equipment> equipmentList42 = cSVDatabaseManager16.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        main.models.Reservation[] reservationArray48 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList49 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList49, reservationArray48);
        cSVDatabaseManager43.writeReservations((java.util.List<main.models.Reservation>) reservationList49);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray53 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList54 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList54, equipmentArray53);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray59 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList60 = new java.util.ArrayList<main.models.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList60, userArray59);
        cSVDatabaseManager58.writeUsers((java.util.List<main.models.User>) userList60);
        cSVDatabaseManager43.writeUsers((java.util.List<main.models.User>) userList60);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray65 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList66 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList66, equipmentArray65);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList66);
        main.models.Reservation[] reservationArray69 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList70 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList70, reservationArray69);
        cSVDatabaseManager64.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        main.models.CSVDatabaseManager cSVDatabaseManager73 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray74 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList75 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList75, equipmentArray74);
        cSVDatabaseManager73.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        cSVDatabaseManager64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList75);
        main.models.CSVDatabaseManager cSVDatabaseManager80 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray81 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList82 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList82, equipmentArray81);
        cSVDatabaseManager80.writeEquipment((java.util.List<main.models.Equipment>) equipmentList82);
        main.models.Payment[] paymentArray85 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList86 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList86, paymentArray85);
        cSVDatabaseManager80.writePayments((java.util.List<main.models.Payment>) paymentList86);
        java.util.List<main.models.Payment> paymentList89 = cSVDatabaseManager80.readPayments();
        cSVDatabaseManager43.writePayments(paymentList89);
        java.util.List<main.models.Reservation> reservationList91 = cSVDatabaseManager43.readReservations();
        cSVDatabaseManager16.writeReservations(reservationList91);
        cSVDatabaseManager0.writeReservations(reservationList91);
        java.lang.Class<?> wildcardClass94 = cSVDatabaseManager0.getClass();
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
        org.junit.Assert.assertNotNull(equipmentArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList25);
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
        org.junit.Assert.assertNotNull(equipmentList42);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test666");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray9 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList10 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList10, equipmentArray9);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList10);
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        java.util.List<main.models.Reservation> reservationList17 = cSVDatabaseManager8.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray24 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList25 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList25, equipmentArray24);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList25);
        main.models.Reservation[] reservationArray28 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList29 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList29, reservationArray28);
        cSVDatabaseManager23.writeReservations((java.util.List<main.models.Reservation>) reservationList29);
        cSVDatabaseManager18.writeReservations((java.util.List<main.models.Reservation>) reservationList29);
        cSVDatabaseManager8.writeReservations((java.util.List<main.models.Reservation>) reservationList29);
        java.util.List<main.models.Equipment> equipmentList34 = cSVDatabaseManager8.readEquipment();
        java.util.List<main.models.Payment> paymentList35 = cSVDatabaseManager8.readPayments();
        cSVDatabaseManager0.writePayments(paymentList35);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        java.util.List<main.models.Equipment> equipmentList39 = databaseProxy38.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList39);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
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
        org.junit.Assert.assertNotNull(equipmentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test667");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray9 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList10 = new java.util.ArrayList<main.models.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList10, userArray9);
        cSVDatabaseManager8.writeUsers((java.util.List<main.models.User>) userList10);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList10);
        java.util.List<main.models.Payment> paymentList14 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Payment> paymentList15 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Equipment> equipmentList16 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy18 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager17);
        java.util.List<main.models.User> userList19 = databaseProxy18.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy21 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager20);
        java.util.List<main.models.User> userList22 = databaseProxy21.readUsers();
        databaseProxy18.writeUsers(userList22);
        java.util.List<main.models.Equipment> equipmentList24 = databaseProxy18.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy26 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager25);
        java.util.List<main.models.User> userList27 = databaseProxy26.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy29 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        java.util.List<main.models.User> userList30 = databaseProxy29.readUsers();
        databaseProxy26.writeUsers(userList30);
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        databaseProxy26.writeUsers(userList34);
        databaseProxy18.writeUsers(userList34);
        java.util.List<main.models.Payment> paymentList37 = databaseProxy18.readPayments();
        java.util.List<main.models.User> userList38 = databaseProxy18.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList40 = cSVDatabaseManager39.readReservations();
        java.util.List<main.models.Payment> paymentList41 = cSVDatabaseManager39.readPayments();
        databaseProxy18.writePayments(paymentList41);
        cSVDatabaseManager0.writePayments(paymentList41);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList41);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test668");
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
        java.util.List<main.models.User> userList39 = databaseProxy1.readUsers();
        java.util.List<main.models.User> userList40 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy42 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager41);
        java.util.List<main.models.User> userList43 = databaseProxy42.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy45 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager44);
        java.util.List<main.models.User> userList46 = databaseProxy45.readUsers();
        databaseProxy42.writeUsers(userList46);
        java.util.List<main.models.Equipment> equipmentList48 = databaseProxy42.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy50 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager49);
        java.util.List<main.models.User> userList51 = databaseProxy50.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy53 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager52);
        java.util.List<main.models.User> userList54 = databaseProxy53.readUsers();
        databaseProxy50.writeUsers(userList54);
        main.models.CSVDatabaseManager cSVDatabaseManager56 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy57 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager56);
        java.util.List<main.models.User> userList58 = databaseProxy57.readUsers();
        databaseProxy50.writeUsers(userList58);
        databaseProxy42.writeUsers(userList58);
        java.util.List<main.models.Equipment> equipmentList61 = databaseProxy42.readEquipment();
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
        java.util.List<main.models.Reservation> reservationList80 = databaseProxy63.readReservations();
        databaseProxy42.writeReservations(reservationList80);
        databaseProxy1.writeReservations(reservationList80);
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
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList61);
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
        org.junit.Assert.assertNotNull(reservationList80);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test669");
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
        java.util.List<main.models.Reservation> reservationList32 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList32);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test670");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        java.lang.String str10 = sensor2.getSensorId();
        main.models.SystemAlert systemAlert11 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList12 = systemAlert11.getMessages();
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("", "hi!", localDateTime15);
        systemAlert11.update(usageData16);
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("hi!", "", localDateTime20);
        java.lang.String str22 = usageData21.getEquipmentId();
        java.time.LocalDateTime localDateTime23 = usageData21.getRecordedAt();
        java.time.LocalDateTime localDateTime24 = usageData21.getRecordedAt();
        systemAlert11.update(usageData21);
        main.enums.SensorStatus sensorStatus27 = null;
        main.models.Sensor sensor28 = new main.models.Sensor("hi!", sensorStatus27);
        sensor28.setSensorId("");
        main.enums.SensorStatus sensorStatus31 = null;
        sensor28.setStatus(sensorStatus31);
        main.models.SystemAlert systemAlert33 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList34 = systemAlert33.getMessages();
        java.time.LocalDateTime localDateTime37 = null;
        main.models.UsageData usageData38 = new main.models.UsageData("", "hi!", localDateTime37);
        systemAlert33.update(usageData38);
        sensor28.detach((main.models.Observer) systemAlert33);
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
        sensor28.recordUsage(usageData49);
        systemAlert11.update(usageData49);
        main.models.SystemAlert systemAlert57 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList58 = systemAlert57.getMessages();
        java.time.LocalDateTime localDateTime61 = null;
        main.models.UsageData usageData62 = new main.models.UsageData("", "hi!", localDateTime61);
        systemAlert57.update(usageData62);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        java.time.LocalDateTime localDateTime69 = usageData67.getRecordedAt();
        java.time.LocalDateTime localDateTime70 = usageData67.getRecordedAt();
        systemAlert57.update(usageData67);
        java.lang.String str72 = usageData67.getOperationStatus();
        systemAlert11.update(usageData67);
        sensor2.recordUsage(usageData67);
        sensor2.setSensorId("");
        java.lang.String str77 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "" + "'", str77.equals(""));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test671");
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
        main.models.DatabaseProxy databaseProxy19 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager20 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray21 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList22 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList22, equipmentArray21);
        cSVDatabaseManager20.writeEquipment((java.util.List<main.models.Equipment>) equipmentList22);
        main.models.Reservation[] reservationArray25 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList26 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList26, reservationArray25);
        cSVDatabaseManager20.writeReservations((java.util.List<main.models.Reservation>) reservationList26);
        java.util.List<main.models.User> userList29 = cSVDatabaseManager20.readUsers();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager20);
        java.util.List<main.models.User> userList31 = cSVDatabaseManager20.readUsers();
        cSVDatabaseManager0.writeUsers(userList31);
        java.util.List<main.models.User> userList33 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.User> userList34 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test672");
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
        java.lang.Class<?> wildcardClass80 = databaseProxy1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test673");
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
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        sensor38.setSensorId("");
        main.enums.SensorStatus sensorStatus41 = null;
        sensor38.setStatus(sensorStatus41);
        main.enums.SensorStatus sensorStatus44 = null;
        main.models.Sensor sensor45 = new main.models.Sensor("hi!", sensorStatus44);
        main.models.UsageLogger usageLogger46 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList47 = usageLogger46.getRecords();
        sensor45.attach((main.models.Observer) usageLogger46);
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        java.lang.String str53 = usageData52.getEquipmentId();
        usageLogger46.update(usageData52);
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("hi!", "", localDateTime57);
        usageLogger46.update(usageData58);
        sensor38.detach((main.models.Observer) usageLogger46);
        sensor2.detach((main.models.Observer) usageLogger46);
        main.enums.SensorStatus sensorStatus62 = null;
        sensor2.setStatus(sensorStatus62);
        main.models.UsageData usageData64 = null;
        sensor2.notifyObservers(usageData64);
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
        org.junit.Assert.assertNotNull(usageDataList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
    }
}

