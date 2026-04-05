package test.java.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test501");
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
        java.util.List<java.lang.String> strList15 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList16 = systemAlert0.getMessages();
        main.enums.SensorStatus sensorStatus18 = null;
        main.models.Sensor sensor19 = new main.models.Sensor("hi!", sensorStatus18);
        main.enums.SensorStatus sensorStatus20 = null;
        sensor19.setStatus(sensorStatus20);
        main.models.UsageLogger usageLogger22 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime25 = null;
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "", localDateTime25);
        usageLogger22.update(usageData26);
        sensor19.detach((main.models.Observer) usageLogger22);
        java.util.List<main.models.UsageData> usageDataList29 = usageLogger22.getRecords();
        main.enums.SensorStatus sensorStatus31 = null;
        main.models.Sensor sensor32 = new main.models.Sensor("hi!", sensorStatus31);
        sensor32.setSensorId("");
        main.enums.SensorStatus sensorStatus36 = null;
        main.models.Sensor sensor37 = new main.models.Sensor("hi!", sensorStatus36);
        sensor37.setSensorId("");
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        java.lang.String str44 = usageData43.getEquipmentId();
        java.time.LocalDateTime localDateTime45 = usageData43.getRecordedAt();
        java.time.LocalDateTime localDateTime46 = usageData43.getRecordedAt();
        java.lang.String str47 = usageData43.getOperationStatus();
        sensor37.recordUsage(usageData43);
        main.enums.SensorStatus sensorStatus50 = null;
        main.models.Sensor sensor51 = new main.models.Sensor("hi!", sensorStatus50);
        main.models.UsageLogger usageLogger52 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList53 = usageLogger52.getRecords();
        sensor51.attach((main.models.Observer) usageLogger52);
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("hi!", "", localDateTime57);
        java.lang.String str59 = usageData58.getEquipmentId();
        usageLogger52.update(usageData58);
        main.enums.SensorStatus sensorStatus62 = null;
        main.models.Sensor sensor63 = new main.models.Sensor("hi!", sensorStatus62);
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("hi!", "", localDateTime66);
        java.lang.String str68 = usageData67.getEquipmentId();
        sensor63.notifyObservers(usageData67);
        usageLogger52.update(usageData67);
        sensor37.attach((main.models.Observer) usageLogger52);
        main.enums.SensorStatus sensorStatus73 = null;
        main.models.Sensor sensor74 = new main.models.Sensor("hi!", sensorStatus73);
        main.models.UsageLogger usageLogger75 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList76 = usageLogger75.getRecords();
        sensor74.attach((main.models.Observer) usageLogger75);
        java.time.LocalDateTime localDateTime80 = null;
        main.models.UsageData usageData81 = new main.models.UsageData("hi!", "", localDateTime80);
        java.lang.String str82 = usageData81.getEquipmentId();
        usageLogger75.update(usageData81);
        main.enums.SensorStatus sensorStatus85 = null;
        main.models.Sensor sensor86 = new main.models.Sensor("hi!", sensorStatus85);
        java.time.LocalDateTime localDateTime89 = null;
        main.models.UsageData usageData90 = new main.models.UsageData("hi!", "", localDateTime89);
        java.lang.String str91 = usageData90.getEquipmentId();
        sensor86.notifyObservers(usageData90);
        usageLogger75.update(usageData90);
        sensor37.recordUsage(usageData90);
        sensor32.recordUsage(usageData90);
        usageLogger22.update(usageData90);
        systemAlert0.update(usageData90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!" + "'", str44.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "" + "'", str47.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "hi!" + "'", str68.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "hi!" + "'", str82.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "hi!" + "'", str91.equals("hi!"));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test502");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
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
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        databaseProxy9.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        java.util.List<main.models.User> userList32 = databaseProxy9.readUsers();
        cSVDatabaseManager0.writeUsers(userList32);
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy35 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager34);
        main.models.User[] userArray36 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList37 = new java.util.ArrayList<main.models.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList37, userArray36);
        cSVDatabaseManager34.writeUsers((java.util.List<main.models.User>) userList37);
        java.util.List<main.models.Payment> paymentList40 = cSVDatabaseManager34.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy42 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager41);
        java.util.List<main.models.User> userList43 = databaseProxy42.readUsers();
        main.models.User[] userArray44 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList45 = new java.util.ArrayList<main.models.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList45, userArray44);
        databaseProxy42.writeUsers((java.util.List<main.models.User>) userList45);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray49 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList50 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList50, equipmentArray49);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList50);
        main.models.Payment[] paymentArray53 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList54 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList54, paymentArray53);
        cSVDatabaseManager48.writePayments((java.util.List<main.models.Payment>) paymentList54);
        java.util.List<main.models.Payment> paymentList57 = cSVDatabaseManager48.readPayments();
        databaseProxy42.writePayments(paymentList57);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy60 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager59);
        main.models.User[] userArray61 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList62 = new java.util.ArrayList<main.models.User>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList62, userArray61);
        cSVDatabaseManager59.writeUsers((java.util.List<main.models.User>) userList62);
        databaseProxy42.writeUsers((java.util.List<main.models.User>) userList62);
        cSVDatabaseManager34.writeUsers((java.util.List<main.models.User>) userList62);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList62);
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
        org.junit.Assert.assertNotNull(equipmentArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test503");
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
        java.time.LocalDateTime localDateTime87 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertNotNull(localDateTime87);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test504");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Equipment> equipmentList2 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList3 = databaseProxy1.readReservations();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        java.util.List<main.models.Reservation> reservationList5 = databaseProxy1.readReservations();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList5);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test505");
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
        java.lang.String str59 = usageData56.getEquipmentId();
        java.lang.String str60 = usageData56.getEquipmentId();
        java.time.LocalDateTime localDateTime61 = usageData56.getRecordedAt();
        java.lang.String str62 = usageData56.getOperationStatus();
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
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "hi!" + "'", str59.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "" + "'", str62.equals(""));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test506");
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
        java.lang.String str76 = usageData71.getOperationStatus();
        java.lang.Class<?> wildcardClass77 = usageData71.getClass();
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
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test507");
        main.enums.SensorStatus sensorStatus9 = null;
        main.models.Sensor sensor10 = new main.models.Sensor("hi!", sensorStatus9);
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("hi!", "", localDateTime13);
        java.lang.String str15 = usageData14.getEquipmentId();
        sensor10.notifyObservers(usageData14);
        main.enums.SensorStatus sensorStatus17 = sensor10.getStatus();
        main.enums.SensorStatus sensorStatus21 = null;
        main.models.Sensor sensor22 = new main.models.Sensor("hi!", sensorStatus21);
        sensor22.setSensorId("");
        sensor22.setSensorId("");
        java.time.LocalDateTime localDateTime27 = sensor22.getLastUpdateTime();
        main.models.UsageData usageData28 = new main.models.UsageData("", "hi!", localDateTime27);
        sensor10.setLastUpdateTime(localDateTime27);
        main.models.UsageData usageData30 = new main.models.UsageData("", "hi!", localDateTime27);
        main.models.UsageData usageData31 = new main.models.UsageData("", "hi!", localDateTime27);
        main.models.UsageData usageData32 = new main.models.UsageData("", "hi!", localDateTime27);
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test508");
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
        java.util.List<main.models.User> userList11 = databaseProxy10.readUsers();
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
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test509");
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
        java.util.List<main.models.Payment> paymentList18 = null;
        cSVDatabaseManager0.writePayments(paymentList18);
        java.util.List<main.models.Payment> paymentList20 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList20);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test510");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus10 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus11 = null;
        sensor2.setStatus(sensorStatus11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus10);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test511");
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
        main.models.CSVDatabaseManager cSVDatabaseManager32 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        main.models.User[] userArray34 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList35 = new java.util.ArrayList<main.models.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList35, userArray34);
        cSVDatabaseManager32.writeUsers((java.util.List<main.models.User>) userList35);
        java.util.List<main.models.Payment> paymentList38 = cSVDatabaseManager32.readPayments();
        java.util.List<main.models.Equipment> equipmentList39 = cSVDatabaseManager32.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList39);
        java.util.List<main.models.Payment> paymentList41 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList41);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test512");
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
        java.util.List<main.models.Reservation> reservationList16 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy18 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager17);
        main.models.Payment[] paymentArray19 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList20 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList20, paymentArray19);
        databaseProxy18.writePayments((java.util.List<main.models.Payment>) paymentList20);
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy24 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager23);
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray26 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList27 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList27, equipmentArray26);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList27);
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.Reservation[] reservationArray35 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList36 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList36, reservationArray35);
        cSVDatabaseManager30.writeReservations((java.util.List<main.models.Reservation>) reservationList36);
        cSVDatabaseManager25.writeReservations((java.util.List<main.models.Reservation>) reservationList36);
        databaseProxy24.writeReservations((java.util.List<main.models.Reservation>) reservationList36);
        databaseProxy18.writeReservations((java.util.List<main.models.Reservation>) reservationList36);
        java.util.List<main.models.Payment> paymentList42 = databaseProxy18.readPayments();
        java.util.List<main.models.Payment> paymentList43 = databaseProxy18.readPayments();
        java.util.List<main.models.Reservation> reservationList44 = databaseProxy18.readReservations();
        java.util.List<main.models.Reservation> reservationList45 = databaseProxy18.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.Payment[] paymentArray51 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList52 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList52, paymentArray51);
        cSVDatabaseManager46.writePayments((java.util.List<main.models.Payment>) paymentList52);
        java.util.List<main.models.Payment> paymentList55 = cSVDatabaseManager46.readPayments();
        java.util.List<main.models.User> userList56 = cSVDatabaseManager46.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray58 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList59 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList59, equipmentArray58);
        cSVDatabaseManager57.writeEquipment((java.util.List<main.models.Equipment>) equipmentList59);
        java.util.List<main.models.User> userList62 = cSVDatabaseManager57.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList64 = cSVDatabaseManager63.readReservations();
        cSVDatabaseManager57.writeReservations(reservationList64);
        cSVDatabaseManager46.writeReservations(reservationList64);
        databaseProxy18.writeReservations(reservationList64);
        cSVDatabaseManager0.writeReservations(reservationList64);
        java.util.List<main.models.Equipment> equipmentList69 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy71 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager70);
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy73 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager72);
        main.models.CSVDatabaseManager cSVDatabaseManager74 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray75 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList76 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList76, equipmentArray75);
        cSVDatabaseManager74.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        main.models.CSVDatabaseManager cSVDatabaseManager79 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray80 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList81 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList81, equipmentArray80);
        cSVDatabaseManager79.writeEquipment((java.util.List<main.models.Equipment>) equipmentList81);
        main.models.Reservation[] reservationArray84 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList85 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList85, reservationArray84);
        cSVDatabaseManager79.writeReservations((java.util.List<main.models.Reservation>) reservationList85);
        cSVDatabaseManager74.writeReservations((java.util.List<main.models.Reservation>) reservationList85);
        databaseProxy73.writeReservations((java.util.List<main.models.Reservation>) reservationList85);
        databaseProxy71.writeReservations((java.util.List<main.models.Reservation>) reservationList85);
        main.models.Equipment[] equipmentArray91 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList92 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList92, equipmentArray91);
        databaseProxy71.writeEquipment((java.util.List<main.models.Equipment>) equipmentList92);
        java.util.List<main.models.Equipment> equipmentList95 = databaseProxy71.readEquipment();
        java.util.List<main.models.Equipment> equipmentList96 = databaseProxy71.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList96);
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
        org.junit.Assert.assertNotNull(reservationList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList96);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test513");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.lang.String str5 = sensor2.getSensorId();
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus8 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus8);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test514");
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
        java.util.List<main.models.User> userList34 = databaseProxy1.readUsers();
        java.util.List<main.models.Equipment> equipmentList35 = databaseProxy1.readEquipment();
        java.util.List<main.models.Equipment> equipmentList36 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList36);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test515");
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
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
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
        databaseProxy34.writeReservations((java.util.List<main.models.Reservation>) reservationList48);
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        databaseProxy34.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        java.util.List<main.models.Reservation> reservationList58 = databaseProxy34.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList58);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
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
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList58);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test516");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.time.LocalDateTime localDateTime8 = null;
        sensor2.setLastUpdateTime(localDateTime8);
        java.time.LocalDateTime localDateTime10 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test517");
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
        java.lang.String str28 = sensor2.getSensorId();
        java.lang.String str29 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!" + "'", str29.equals("hi!"));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test518");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        java.util.List<main.models.Equipment> equipmentList8 = databaseProxy1.readEquipment();
        java.util.List<main.models.User> userList9 = databaseProxy1.readUsers();
        java.util.List<main.models.Equipment> equipmentList10 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test519");
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
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        main.models.Payment[] paymentArray42 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList43 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList43, paymentArray42);
        databaseProxy41.writePayments((java.util.List<main.models.Payment>) paymentList43);
        cSVDatabaseManager35.writePayments((java.util.List<main.models.Payment>) paymentList43);
        databaseProxy11.writePayments((java.util.List<main.models.Payment>) paymentList43);
        java.util.List<main.models.User> userList48 = databaseProxy11.readUsers();
        java.util.List<main.models.Reservation> reservationList49 = databaseProxy11.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList49);
        java.util.List<main.models.Equipment> equipmentList51 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList51);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test520");
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
        java.util.List<main.models.User> userList32 = databaseProxy31.readUsers();
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
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test521");
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
        main.models.DatabaseProxy databaseProxy61 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        main.models.Payment[] paymentArray64 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList65 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList65, paymentArray64);
        databaseProxy63.writePayments((java.util.List<main.models.Payment>) paymentList65);
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy69 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager68);
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray71 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList72 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList72, equipmentArray71);
        cSVDatabaseManager70.writeEquipment((java.util.List<main.models.Equipment>) equipmentList72);
        main.models.CSVDatabaseManager cSVDatabaseManager75 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray76 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList77 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList77, equipmentArray76);
        cSVDatabaseManager75.writeEquipment((java.util.List<main.models.Equipment>) equipmentList77);
        main.models.Reservation[] reservationArray80 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList81 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList81, reservationArray80);
        cSVDatabaseManager75.writeReservations((java.util.List<main.models.Reservation>) reservationList81);
        cSVDatabaseManager70.writeReservations((java.util.List<main.models.Reservation>) reservationList81);
        databaseProxy69.writeReservations((java.util.List<main.models.Reservation>) reservationList81);
        databaseProxy63.writeReservations((java.util.List<main.models.Reservation>) reservationList81);
        java.util.List<main.models.Payment> paymentList87 = databaseProxy63.readPayments();
        java.util.List<main.models.Payment> paymentList88 = databaseProxy63.readPayments();
        databaseProxy61.writePayments(paymentList88);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList88);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test522");
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
        java.lang.String str22 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus23 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus25 = null;
        main.models.Sensor sensor26 = new main.models.Sensor("hi!", sensorStatus25);
        main.models.UsageLogger usageLogger27 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList28 = usageLogger27.getRecords();
        sensor26.attach((main.models.Observer) usageLogger27);
        main.enums.SensorStatus sensorStatus30 = null;
        sensor26.setStatus(sensorStatus30);
        main.enums.SensorStatus sensorStatus32 = sensor26.getStatus();
        main.models.UsageLogger usageLogger33 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList34 = usageLogger33.getRecords();
        sensor26.detach((main.models.Observer) usageLogger33);
        sensor2.attach((main.models.Observer) usageLogger33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList34);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test523");
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
        java.util.List<main.models.Reservation> reservationList11 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Reservation> reservationList12 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test524");
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
        java.time.LocalDateTime localDateTime19 = null;
        sensor2.setLastUpdateTime(localDateTime19);
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
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test525");
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
        main.models.SystemAlert systemAlert53 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList54 = systemAlert53.getMessages();
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("", "hi!", localDateTime57);
        systemAlert53.update(usageData58);
        main.models.SystemAlert systemAlert60 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList61 = systemAlert60.getMessages();
        java.time.LocalDateTime localDateTime64 = null;
        main.models.UsageData usageData65 = new main.models.UsageData("", "hi!", localDateTime64);
        systemAlert60.update(usageData65);
        systemAlert53.update(usageData65);
        java.util.List<java.lang.String> strList68 = systemAlert53.getMessages();
        sensor2.detach((main.models.Observer) systemAlert53);
        java.util.List<java.lang.String> strList70 = systemAlert53.getMessages();
        java.util.List<java.lang.String> strList71 = systemAlert53.getMessages();
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
        org.junit.Assert.assertNotNull(strList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList71);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test526");
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
        java.util.List<main.models.User> userList28 = databaseProxy27.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        java.util.List<main.models.User> userList31 = databaseProxy30.readUsers();
        databaseProxy27.writeUsers(userList31);
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
        java.util.List<main.models.User> userList35 = databaseProxy34.readUsers();
        databaseProxy27.writeUsers(userList35);
        cSVDatabaseManager0.writeUsers(userList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.Equipment[] equipmentArray43 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList44 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList44, equipmentArray43);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList44);
        java.util.List<main.models.Reservation> reservationList47 = cSVDatabaseManager38.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray49 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList50 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList50, equipmentArray49);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList50);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        main.models.Reservation[] reservationArray58 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList59 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList59, reservationArray58);
        cSVDatabaseManager53.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        cSVDatabaseManager48.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy65 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager64);
        java.util.List<main.models.User> userList66 = databaseProxy65.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy68 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager67);
        java.util.List<main.models.User> userList69 = databaseProxy68.readUsers();
        databaseProxy65.writeUsers(userList69);
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy72 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager71);
        java.util.List<main.models.User> userList73 = databaseProxy72.readUsers();
        databaseProxy65.writeUsers(userList73);
        cSVDatabaseManager38.writeUsers(userList73);
        java.util.List<main.models.User> userList76 = cSVDatabaseManager38.readUsers();
        cSVDatabaseManager0.writeUsers(userList76);
        java.util.List<main.models.Payment> paymentList78 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Reservation> reservationList79 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
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
        org.junit.Assert.assertNotNull(equipmentArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList79);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test527");
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
        java.util.List<main.models.Payment> paymentList11 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Equipment> equipmentList12 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Reservation> reservationList13 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(paymentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test528");
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
        java.time.LocalDateTime localDateTime35 = usageData27.getRecordedAt();
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
        org.junit.Assert.assertNull(localDateTime35);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test529");
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
        java.util.List<main.models.Payment> paymentList20 = databaseProxy1.readPayments();
        java.util.List<main.models.Reservation> reservationList21 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(paymentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList21);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test530");
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
        java.util.List<main.models.Reservation> reservationList33 = databaseProxy31.readReservations();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy31);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        java.util.List<main.models.Reservation> reservationList44 = cSVDatabaseManager35.readReservations();
        java.util.List<main.models.Payment> paymentList45 = cSVDatabaseManager35.readPayments();
        databaseProxy34.writePayments(paymentList45);
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
        org.junit.Assert.assertNotNull(reservationList33);
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
        org.junit.Assert.assertNotNull(reservationList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList45);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test531");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.models.SystemAlert systemAlert9 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList10 = systemAlert9.getMessages();
        java.util.List<java.lang.String> strList11 = systemAlert9.getMessages();
        main.models.UsageLogger usageLogger12 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("hi!", "", localDateTime15);
        usageLogger12.update(usageData16);
        systemAlert9.update(usageData16);
        main.models.UsageLogger usageLogger19 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        usageLogger19.update(usageData23);
        main.enums.SensorStatus sensorStatus26 = null;
        main.models.Sensor sensor27 = new main.models.Sensor("hi!", sensorStatus26);
        sensor27.setSensorId("");
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        java.lang.String str34 = usageData33.getEquipmentId();
        java.time.LocalDateTime localDateTime35 = usageData33.getRecordedAt();
        sensor27.recordUsage(usageData33);
        sensor27.setSensorId("hi!");
        java.time.LocalDateTime localDateTime41 = null;
        main.models.UsageData usageData42 = new main.models.UsageData("", "hi!", localDateTime41);
        sensor27.notifyObservers(usageData42);
        usageLogger19.update(usageData42);
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        main.enums.SensorStatus sensorStatus48 = null;
        sensor47.setStatus(sensorStatus48);
        main.models.UsageLogger usageLogger50 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        usageLogger50.update(usageData54);
        sensor47.detach((main.models.Observer) usageLogger50);
        main.enums.SensorStatus sensorStatus58 = null;
        main.models.Sensor sensor59 = new main.models.Sensor("hi!", sensorStatus58);
        java.time.LocalDateTime localDateTime62 = null;
        main.models.UsageData usageData63 = new main.models.UsageData("hi!", "", localDateTime62);
        java.lang.String str64 = usageData63.getEquipmentId();
        sensor59.notifyObservers(usageData63);
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("", "", localDateTime68);
        sensor59.notifyObservers(usageData69);
        sensor47.notifyObservers(usageData69);
        java.lang.String str72 = usageData69.getEquipmentId();
        usageLogger19.update(usageData69);
        systemAlert9.update(usageData69);
        sensor2.notifyObservers(usageData69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test532");
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
        java.util.List<main.models.User> userList67 = databaseProxy1.readUsers();
        java.util.List<main.models.User> userList68 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test533");
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
        java.lang.Class<?> wildcardClass78 = reservationList72.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test534");
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
        sensor2.setSensorId("");
        java.lang.String str21 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test535");
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
        java.util.List<main.models.User> userList68 = databaseProxy1.readUsers();
        java.util.List<main.models.Payment> paymentList69 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList69);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test536");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        main.models.User[] userArray7 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList8 = new java.util.ArrayList<main.models.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList8, userArray7);
        databaseProxy6.writeUsers((java.util.List<main.models.User>) userList8);
        java.util.List<main.models.Equipment> equipmentList11 = databaseProxy6.readEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test537");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList2 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList3 = systemAlert0.getMessages();
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        sensor6.setSensorId("");
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        java.lang.String str13 = usageData12.getEquipmentId();
        java.time.LocalDateTime localDateTime14 = usageData12.getRecordedAt();
        sensor6.recordUsage(usageData12);
        sensor6.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = null;
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "", localDateTime25);
        java.lang.String str27 = usageData26.getEquipmentId();
        java.time.LocalDateTime localDateTime28 = usageData26.getRecordedAt();
        sensor20.recordUsage(usageData26);
        sensor20.setSensorId("hi!");
        java.time.LocalDateTime localDateTime34 = null;
        main.models.UsageData usageData35 = new main.models.UsageData("", "hi!", localDateTime34);
        sensor20.notifyObservers(usageData35);
        main.enums.SensorStatus sensorStatus38 = null;
        main.models.Sensor sensor39 = new main.models.Sensor("hi!", sensorStatus38);
        main.models.UsageLogger usageLogger40 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList41 = usageLogger40.getRecords();
        sensor39.attach((main.models.Observer) usageLogger40);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        usageLogger40.update(usageData46);
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        usageLogger40.update(usageData52);
        sensor20.detach((main.models.Observer) usageLogger40);
        sensor6.attach((main.models.Observer) usageLogger40);
        java.util.List<main.models.UsageData> usageDataList56 = usageLogger40.getRecords();
        main.enums.SensorStatus sensorStatus58 = null;
        main.models.Sensor sensor59 = new main.models.Sensor("hi!", sensorStatus58);
        main.models.UsageLogger usageLogger60 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList61 = usageLogger60.getRecords();
        sensor59.attach((main.models.Observer) usageLogger60);
        java.time.LocalDateTime localDateTime65 = null;
        main.models.UsageData usageData66 = new main.models.UsageData("hi!", "", localDateTime65);
        java.lang.String str67 = usageData66.getEquipmentId();
        usageLogger60.update(usageData66);
        main.enums.SensorStatus sensorStatus70 = null;
        main.models.Sensor sensor71 = new main.models.Sensor("hi!", sensorStatus70);
        java.time.LocalDateTime localDateTime74 = null;
        main.models.UsageData usageData75 = new main.models.UsageData("hi!", "", localDateTime74);
        java.lang.String str76 = usageData75.getEquipmentId();
        sensor71.notifyObservers(usageData75);
        usageLogger60.update(usageData75);
        usageLogger40.update(usageData75);
        java.lang.String str80 = usageData75.getOperationStatus();
        systemAlert0.update(usageData75);
        java.time.LocalDateTime localDateTime82 = usageData75.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!" + "'", str27.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "hi!" + "'", str67.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "hi!" + "'", str76.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "" + "'", str80.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime82);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test538");
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
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy50 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager49);
        java.util.List<main.models.User> userList51 = databaseProxy50.readUsers();
        cSVDatabaseManager34.writeUsers(userList51);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy59 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager58);
        main.models.Payment[] paymentArray60 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList61 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList61, paymentArray60);
        databaseProxy59.writePayments((java.util.List<main.models.Payment>) paymentList61);
        cSVDatabaseManager53.writePayments((java.util.List<main.models.Payment>) paymentList61);
        cSVDatabaseManager34.writePayments((java.util.List<main.models.Payment>) paymentList61);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList61);
        java.util.List<main.models.User> userList67 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test539");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        main.enums.SensorStatus sensorStatus5 = null;
        sensor4.setStatus(sensorStatus5);
        java.time.LocalDateTime localDateTime7 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData8 = new main.models.UsageData("", "hi!", localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test540");
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
        main.enums.SensorStatus sensorStatus36 = null;
        sensor2.setStatus(sensorStatus36);
        main.enums.SensorStatus sensorStatus38 = sensor2.getStatus();
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
        org.junit.Assert.assertNull(sensorStatus38);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test541");
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
        main.models.Payment[] paymentArray20 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList21 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList21, paymentArray20);
        databaseProxy19.writePayments((java.util.List<main.models.Payment>) paymentList21);
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
        databaseProxy19.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        databaseProxy1.writeReservations((java.util.List<main.models.Reservation>) reservationList37);
        main.models.CSVDatabaseManager cSVDatabaseManager44 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray45 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList46 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList46, equipmentArray45);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList46);
        java.util.List<main.models.User> userList49 = cSVDatabaseManager44.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager50 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList51 = cSVDatabaseManager50.readReservations();
        cSVDatabaseManager44.writeReservations(reservationList51);
        databaseProxy1.writeReservations(reservationList51);
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        java.util.List<main.models.User> userList59 = cSVDatabaseManager54.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager60 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList61 = cSVDatabaseManager60.readReservations();
        cSVDatabaseManager54.writeReservations(reservationList61);
        main.models.CSVDatabaseManager cSVDatabaseManager63 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy64 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager63);
        main.models.CSVDatabaseManager cSVDatabaseManager65 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy66 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager65);
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        cSVDatabaseManager67.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        main.models.CSVDatabaseManager cSVDatabaseManager72 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray73 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList74 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList74, equipmentArray73);
        cSVDatabaseManager72.writeEquipment((java.util.List<main.models.Equipment>) equipmentList74);
        main.models.Reservation[] reservationArray77 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList78 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList78, reservationArray77);
        cSVDatabaseManager72.writeReservations((java.util.List<main.models.Reservation>) reservationList78);
        cSVDatabaseManager67.writeReservations((java.util.List<main.models.Reservation>) reservationList78);
        databaseProxy66.writeReservations((java.util.List<main.models.Reservation>) reservationList78);
        databaseProxy64.writeReservations((java.util.List<main.models.Reservation>) reservationList78);
        main.models.Equipment[] equipmentArray84 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList85 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList85, equipmentArray84);
        databaseProxy64.writeEquipment((java.util.List<main.models.Equipment>) equipmentList85);
        java.util.List<main.models.Equipment> equipmentList88 = databaseProxy64.readEquipment();
        cSVDatabaseManager54.writeEquipment(equipmentList88);
        java.util.List<main.models.Payment> paymentList90 = cSVDatabaseManager54.readPayments();
        databaseProxy1.writePayments(paymentList90);
        java.util.List<main.models.User> userList92 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(paymentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
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
        org.junit.Assert.assertNotNull(reservationArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test542");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus10 = sensor2.getStatus();
        java.time.LocalDateTime localDateTime11 = sensor2.getLastUpdateTime();
        main.models.Observer observer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            sensor2.attach(observer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Observer cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test543");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.lang.String str8 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
        java.time.LocalDateTime localDateTime11 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus15 = null;
        main.models.Sensor sensor16 = new main.models.Sensor("hi!", sensorStatus15);
        sensor16.setSensorId("");
        java.time.LocalDateTime localDateTime21 = null;
        main.models.UsageData usageData22 = new main.models.UsageData("hi!", "", localDateTime21);
        java.lang.String str23 = usageData22.getEquipmentId();
        java.time.LocalDateTime localDateTime24 = usageData22.getRecordedAt();
        sensor16.recordUsage(usageData22);
        sensor16.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus29 = null;
        main.models.Sensor sensor30 = new main.models.Sensor("hi!", sensorStatus29);
        main.models.UsageLogger usageLogger31 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList32 = usageLogger31.getRecords();
        sensor30.attach((main.models.Observer) usageLogger31);
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        java.lang.String str38 = usageData37.getEquipmentId();
        usageLogger31.update(usageData37);
        java.time.LocalDateTime localDateTime42 = null;
        main.models.UsageData usageData43 = new main.models.UsageData("hi!", "", localDateTime42);
        usageLogger31.update(usageData43);
        sensor16.notifyObservers(usageData43);
        main.enums.SensorStatus sensorStatus47 = null;
        main.models.Sensor sensor48 = new main.models.Sensor("hi!", sensorStatus47);
        sensor48.setSensorId("");
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        java.time.LocalDateTime localDateTime56 = usageData54.getRecordedAt();
        sensor48.recordUsage(usageData54);
        sensor48.setSensorId("");
        sensor48.setSensorId("");
        sensor48.setSensorId("hi!");
        java.time.LocalDateTime localDateTime64 = sensor48.getLastUpdateTime();
        sensor16.setLastUpdateTime(localDateTime64);
        main.models.UsageData usageData66 = new main.models.UsageData("", "", localDateTime64);
        java.time.LocalDateTime localDateTime67 = usageData66.getRecordedAt();
        sensor2.setLastUpdateTime(localDateTime67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!" + "'", str38.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime67);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test544");
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
        java.util.List<main.models.User> userList16 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy18 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager17);
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
        databaseProxy18.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        java.util.List<main.models.User> userList37 = databaseProxy36.readUsers();
        main.models.User[] userArray38 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList39 = new java.util.ArrayList<main.models.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList39, userArray38);
        databaseProxy36.writeUsers((java.util.List<main.models.User>) userList39);
        databaseProxy18.writeUsers((java.util.List<main.models.User>) userList39);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        main.models.User[] userArray45 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList46 = new java.util.ArrayList<main.models.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList46, userArray45);
        cSVDatabaseManager43.writeUsers((java.util.List<main.models.User>) userList46);
        java.util.List<main.models.Payment> paymentList49 = cSVDatabaseManager43.readPayments();
        databaseProxy18.writePayments(paymentList49);
        java.util.List<main.models.User> userList51 = databaseProxy18.readUsers();
        java.util.List<main.models.Equipment> equipmentList52 = databaseProxy18.readEquipment();
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
        main.models.CSVDatabaseManager cSVDatabaseManager71 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy72 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager71);
        java.util.List<main.models.User> userList73 = databaseProxy72.readUsers();
        main.models.User[] userArray74 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList75 = new java.util.ArrayList<main.models.User>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList75, userArray74);
        databaseProxy72.writeUsers((java.util.List<main.models.User>) userList75);
        databaseProxy54.writeUsers((java.util.List<main.models.User>) userList75);
        main.models.CSVDatabaseManager cSVDatabaseManager79 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy80 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager79);
        java.util.List<main.models.User> userList81 = databaseProxy80.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager82 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy83 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager82);
        java.util.List<main.models.User> userList84 = databaseProxy83.readUsers();
        databaseProxy80.writeUsers(userList84);
        databaseProxy54.writeUsers(userList84);
        databaseProxy18.writeUsers(userList84);
        cSVDatabaseManager0.writeUsers(userList84);
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
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList52);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test545");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList1 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList2 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList3 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger0.getRecords();
        java.lang.Class<?> wildcardClass5 = usageLogger0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test546");
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
        java.util.List<main.models.User> userList28 = databaseProxy27.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy30 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager29);
        java.util.List<main.models.User> userList31 = databaseProxy30.readUsers();
        databaseProxy27.writeUsers(userList31);
        databaseProxy1.writeUsers(userList31);
        java.util.List<main.models.Equipment> equipmentList34 = null;
        databaseProxy1.writeEquipment(equipmentList34);
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList31);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test547");
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
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus80 = sensor2.getStatus();
        java.time.LocalDateTime localDateTime83 = null;
        main.models.UsageData usageData84 = new main.models.UsageData("hi!", "hi!", localDateTime83);
        sensor2.notifyObservers(usageData84);
        java.time.LocalDateTime localDateTime86 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertNull(sensorStatus80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime86);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test548");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.lang.String str8 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
        java.lang.Class<?> wildcardClass11 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test549");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        sensor2.setSensorId("");
        sensor2.setSensorId("");
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
        main.models.SystemAlert systemAlert30 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList31 = systemAlert30.getMessages();
        java.util.List<java.lang.String> strList32 = systemAlert30.getMessages();
        main.models.UsageLogger usageLogger33 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        usageLogger33.update(usageData37);
        systemAlert30.update(usageData37);
        sensor18.notifyObservers(usageData37);
        java.time.LocalDateTime localDateTime41 = usageData37.getRecordedAt();
        java.lang.String str42 = usageData37.getOperationStatus();
        sensor2.notifyObservers(usageData37);
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
        org.junit.Assert.assertNotNull(strList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test550");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList1 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList2 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList3 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList5 = usageLogger0.getRecords();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList5);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test551");
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
        main.models.CSVDatabaseManager cSVDatabaseManager22 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList23 = cSVDatabaseManager22.readReservations();
        java.util.List<main.models.Payment> paymentList24 = cSVDatabaseManager22.readPayments();
        databaseProxy1.writePayments(paymentList24);
        java.util.List<main.models.Reservation> reservationList26 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test552");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.User[] userArray3 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList4 = new java.util.ArrayList<main.models.User>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList4, userArray3);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList4);
        main.models.CSVDatabaseManager cSVDatabaseManager7 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy8 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager7);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager16 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray17 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList18 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList18, equipmentArray17);
        cSVDatabaseManager16.writeEquipment((java.util.List<main.models.Equipment>) equipmentList18);
        main.models.Reservation[] reservationArray21 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList22 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList22, reservationArray21);
        cSVDatabaseManager16.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        cSVDatabaseManager11.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        databaseProxy10.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        databaseProxy8.writeReservations((java.util.List<main.models.Reservation>) reservationList22);
        main.models.Equipment[] equipmentArray28 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList29 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList29, equipmentArray28);
        databaseProxy8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList29);
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
        databaseProxy8.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList76);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
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
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test553");
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
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        java.lang.String str34 = usageData33.getEquipmentId();
        sensor29.notifyObservers(usageData33);
        main.enums.SensorStatus sensorStatus36 = sensor29.getStatus();
        sensor29.setSensorId("hi!");
        java.lang.String str39 = sensor29.getSensorId();
        java.time.LocalDateTime localDateTime40 = sensor29.getLastUpdateTime();
        sensor4.setLastUpdateTime(localDateTime40);
        main.models.UsageData usageData42 = new main.models.UsageData("hi!", "", localDateTime40);
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime40);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test554");
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
        main.models.DatabaseProxy databaseProxy52 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager51);
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
        databaseProxy52.writeReservations((java.util.List<main.models.Reservation>) reservationList66);
        main.models.Equipment[] equipmentArray72 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList73 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList73, equipmentArray72);
        databaseProxy52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList73);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy77 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager76);
        main.models.Payment[] paymentArray78 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList79 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList79, paymentArray78);
        databaseProxy77.writePayments((java.util.List<main.models.Payment>) paymentList79);
        main.models.DatabaseProxy databaseProxy82 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy77);
        java.util.List<main.models.Equipment> equipmentList83 = databaseProxy77.readEquipment();
        databaseProxy52.writeEquipment(equipmentList83);
        java.util.List<main.models.Equipment> equipmentList85 = databaseProxy52.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList85);
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
        org.junit.Assert.assertNotNull(equipmentArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList85);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test555");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        sensor14.setSensorId("");
        java.time.LocalDateTime localDateTime19 = null;
        main.models.UsageData usageData20 = new main.models.UsageData("hi!", "", localDateTime19);
        java.lang.String str21 = usageData20.getEquipmentId();
        java.time.LocalDateTime localDateTime22 = usageData20.getRecordedAt();
        sensor14.recordUsage(usageData20);
        sensor14.setSensorId("hi!");
        java.time.LocalDateTime localDateTime28 = null;
        main.models.UsageData usageData29 = new main.models.UsageData("", "hi!", localDateTime28);
        sensor14.notifyObservers(usageData29);
        main.enums.SensorStatus sensorStatus32 = null;
        main.models.Sensor sensor33 = new main.models.Sensor("hi!", sensorStatus32);
        main.models.UsageLogger usageLogger34 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList35 = usageLogger34.getRecords();
        sensor33.attach((main.models.Observer) usageLogger34);
        java.time.LocalDateTime localDateTime39 = null;
        main.models.UsageData usageData40 = new main.models.UsageData("hi!", "", localDateTime39);
        java.lang.String str41 = usageData40.getEquipmentId();
        usageLogger34.update(usageData40);
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        usageLogger34.update(usageData46);
        sensor14.detach((main.models.Observer) usageLogger34);
        sensor2.attach((main.models.Observer) usageLogger34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!" + "'", str41.equals("hi!"));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test556");
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
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        cSVDatabaseManager19.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        java.util.List<main.models.User> userList28 = cSVDatabaseManager19.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        main.models.Reservation[] reservationArray34 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList35 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList35, reservationArray34);
        cSVDatabaseManager29.writeReservations((java.util.List<main.models.Reservation>) reservationList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        java.util.List<main.models.User> userList44 = cSVDatabaseManager29.readUsers();
        java.util.List<main.models.Equipment> equipmentList45 = cSVDatabaseManager29.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.Reservation[] reservationArray51 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList52 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList52, reservationArray51);
        cSVDatabaseManager46.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        java.util.List<main.models.User> userList61 = cSVDatabaseManager46.readUsers();
        cSVDatabaseManager29.writeUsers(userList61);
        java.util.List<main.models.Reservation> reservationList63 = cSVDatabaseManager29.readReservations();
        java.util.List<main.models.Equipment> equipmentList64 = cSVDatabaseManager29.readEquipment();
        cSVDatabaseManager19.writeEquipment(equipmentList64);
        databaseProxy1.writeEquipment(equipmentList64);
        java.util.List<main.models.User> userList67 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList67);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test557");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        java.lang.String str8 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus9 = null;
        sensor2.setStatus(sensorStatus9);
        main.enums.SensorStatus sensorStatus11 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus11);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test558");
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
        java.util.List<main.models.Payment> paymentList78 = null;
        cSVDatabaseManager0.writePayments(paymentList78);
        java.util.List<main.models.Equipment> equipmentList80 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList80);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test559");
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
        java.util.List<main.models.User> userList56 = cSVDatabaseManager41.readUsers();
        java.util.List<main.models.Equipment> equipmentList57 = cSVDatabaseManager41.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        main.models.Reservation[] reservationArray63 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList64 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList64, reservationArray63);
        cSVDatabaseManager58.writeReservations((java.util.List<main.models.Reservation>) reservationList64);
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray68 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList69 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList69, equipmentArray68);
        cSVDatabaseManager67.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        cSVDatabaseManager25.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        databaseProxy1.writeEquipment((java.util.List<main.models.Equipment>) equipmentList69);
        java.util.List<main.models.User> userList76 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList57);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList76);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test560");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.User> userList6 = cSVDatabaseManager0.readUsers();
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
        java.util.List<main.models.User> userList57 = cSVDatabaseManager7.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager58 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        main.models.Equipment[] equipmentArray63 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList64 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList64, equipmentArray63);
        cSVDatabaseManager58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList64);
        java.util.List<main.models.Reservation> reservationList67 = cSVDatabaseManager58.readReservations();
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
        cSVDatabaseManager58.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        cSVDatabaseManager7.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        main.models.CSVDatabaseManager cSVDatabaseManager85 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray86 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList87 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList87, equipmentArray86);
        cSVDatabaseManager85.writeEquipment((java.util.List<main.models.Equipment>) equipmentList87);
        main.models.Equipment[] equipmentArray90 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList91 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList91, equipmentArray90);
        cSVDatabaseManager85.writeEquipment((java.util.List<main.models.Equipment>) equipmentList91);
        cSVDatabaseManager7.writeEquipment((java.util.List<main.models.Equipment>) equipmentList91);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList91);
        main.models.DatabaseProxy databaseProxy96 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList6);
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
        org.junit.Assert.assertNotNull(userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test561");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        main.models.DatabaseProxy databaseProxy6 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        main.models.User[] userArray7 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList8 = new java.util.ArrayList<main.models.User>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList8, userArray7);
        databaseProxy6.writeUsers((java.util.List<main.models.User>) userList8);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy12 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager11);
        java.util.List<main.models.User> userList13 = databaseProxy12.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager14 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy15 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager14);
        java.util.List<main.models.User> userList16 = databaseProxy15.readUsers();
        databaseProxy12.writeUsers(userList16);
        java.util.List<main.models.Equipment> equipmentList18 = databaseProxy12.readEquipment();
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
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        java.util.List<main.models.User> userList39 = databaseProxy38.readUsers();
        main.models.User[] userArray40 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList41 = new java.util.ArrayList<main.models.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList41, userArray40);
        databaseProxy38.writeUsers((java.util.List<main.models.User>) userList41);
        databaseProxy20.writeUsers((java.util.List<main.models.User>) userList41);
        databaseProxy12.writeUsers((java.util.List<main.models.User>) userList41);
        databaseProxy6.writeUsers((java.util.List<main.models.User>) userList41);
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
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList60 = cSVDatabaseManager59.readReservations();
        databaseProxy57.writeReservations(reservationList60);
        java.util.List<main.models.Equipment> equipmentList62 = databaseProxy57.readEquipment();
        java.util.List<main.models.Reservation> reservationList63 = databaseProxy57.readReservations();
        databaseProxy6.writeReservations(reservationList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList63);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test562");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        main.models.DatabaseProxy databaseProxy7 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList8 = cSVDatabaseManager0.readUsers();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager10 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray11 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList12 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList12, equipmentArray11);
        cSVDatabaseManager10.writeEquipment((java.util.List<main.models.Equipment>) equipmentList12);
        main.models.Payment[] paymentArray15 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList16 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList16, paymentArray15);
        cSVDatabaseManager10.writePayments((java.util.List<main.models.Payment>) paymentList16);
        java.util.List<main.models.Payment> paymentList19 = cSVDatabaseManager10.readPayments();
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
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray36 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList37 = new java.util.ArrayList<main.models.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList37, userArray36);
        cSVDatabaseManager35.writeUsers((java.util.List<main.models.User>) userList37);
        cSVDatabaseManager20.writeUsers((java.util.List<main.models.User>) userList37);
        cSVDatabaseManager10.writeUsers((java.util.List<main.models.User>) userList37);
        java.util.List<main.models.Payment> paymentList42 = cSVDatabaseManager10.readPayments();
        java.util.List<main.models.Payment> paymentList43 = cSVDatabaseManager10.readPayments();
        databaseProxy9.writePayments(paymentList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList43);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test563");
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
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.Payment> paymentList68 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager69 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy70 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager69);
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
        databaseProxy70.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        main.models.CSVDatabaseManager cSVDatabaseManager87 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray88 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList89 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList89, equipmentArray88);
        cSVDatabaseManager87.writeEquipment((java.util.List<main.models.Equipment>) equipmentList89);
        databaseProxy70.writeEquipment((java.util.List<main.models.Equipment>) equipmentList89);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList89);
        java.util.List<main.models.Payment> paymentList94 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager69);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList94);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test564");
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
        java.util.List<main.models.Equipment> equipmentList50 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList51);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test565");
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
        cSVDatabaseManager0.writeUsers(userList50);
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
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test566");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList8 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList9 = databaseProxy1.readPayments();
        java.util.List<main.models.User> userList10 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(paymentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList10);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test567");
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
        sensor40.setSensorId("");
        java.time.LocalDateTime localDateTime45 = null;
        main.models.UsageData usageData46 = new main.models.UsageData("hi!", "", localDateTime45);
        java.lang.String str47 = usageData46.getEquipmentId();
        java.time.LocalDateTime localDateTime48 = usageData46.getRecordedAt();
        sensor40.recordUsage(usageData46);
        sensor40.setSensorId("hi!");
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
        main.enums.SensorStatus sensorStatus72 = null;
        main.models.Sensor sensor73 = new main.models.Sensor("hi!", sensorStatus72);
        main.models.UsageLogger usageLogger74 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList75 = usageLogger74.getRecords();
        sensor73.attach((main.models.Observer) usageLogger74);
        java.time.LocalDateTime localDateTime79 = null;
        main.models.UsageData usageData80 = new main.models.UsageData("hi!", "", localDateTime79);
        java.lang.String str81 = usageData80.getEquipmentId();
        usageLogger74.update(usageData80);
        java.time.LocalDateTime localDateTime85 = null;
        main.models.UsageData usageData86 = new main.models.UsageData("hi!", "", localDateTime85);
        usageLogger74.update(usageData86);
        sensor54.detach((main.models.Observer) usageLogger74);
        sensor40.attach((main.models.Observer) usageLogger74);
        java.util.List<main.models.UsageData> usageDataList90 = usageLogger74.getRecords();
        java.time.LocalDateTime localDateTime93 = null;
        main.models.UsageData usageData94 = new main.models.UsageData("hi!", "", localDateTime93);
        java.lang.String str95 = usageData94.getEquipmentId();
        usageLogger74.update(usageData94);
        java.lang.String str97 = usageData94.getEquipmentId();
        sensor2.notifyObservers(usageData94);
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
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!" + "'", str47.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!" + "'", str61.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "hi!" + "'", str81.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str95 + "' != '" + "hi!" + "'", str95.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str97 + "' != '" + "hi!" + "'", str97.equals("hi!"));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test568");
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
        main.enums.SensorStatus sensorStatus12 = sensor2.getStatus();
        java.lang.String str13 = sensor2.getSensorId();
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test569");
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
        java.util.List<main.models.Reservation> reservationList18 = databaseProxy1.readReservations();
        java.util.List<main.models.Reservation> reservationList19 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test570");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager8 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy9 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager8);
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        main.models.User[] userArray11 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList12 = new java.util.ArrayList<main.models.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList12, userArray11);
        databaseProxy9.writeUsers((java.util.List<main.models.User>) userList12);
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray16 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList17 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList17, equipmentArray16);
        cSVDatabaseManager15.writeEquipment((java.util.List<main.models.Equipment>) equipmentList17);
        main.models.Payment[] paymentArray20 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList21 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList21, paymentArray20);
        cSVDatabaseManager15.writePayments((java.util.List<main.models.Payment>) paymentList21);
        java.util.List<main.models.Payment> paymentList24 = cSVDatabaseManager15.readPayments();
        databaseProxy9.writePayments(paymentList24);
        java.util.List<main.models.Equipment> equipmentList26 = databaseProxy9.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList26);
        java.util.List<main.models.Reservation> reservationList28 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Reservation> reservationList29 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test571");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        main.enums.SensorStatus sensorStatus5 = null;
        sensor2.setStatus(sensorStatus5);
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        sensor2.notifyObservers(usageData10);
        main.enums.SensorStatus sensorStatus13 = null;
        main.models.Sensor sensor14 = new main.models.Sensor("hi!", sensorStatus13);
        main.models.UsageLogger usageLogger15 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList16 = usageLogger15.getRecords();
        sensor14.attach((main.models.Observer) usageLogger15);
        java.util.List<main.models.UsageData> usageDataList18 = usageLogger15.getRecords();
        sensor2.detach((main.models.Observer) usageLogger15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test572");
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
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.Payment> paymentList68 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Payment> paymentList69 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList69);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test573");
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
        java.lang.String str39 = sensor2.getSensorId();
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
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test574");
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
        java.util.List<main.models.Payment> paymentList20 = databaseProxy1.readPayments();
        java.util.List<main.models.Payment> paymentList21 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test575");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus9 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus10 = null;
        sensor2.setStatus(sensorStatus10);
        main.enums.SensorStatus sensorStatus12 = null;
        sensor2.setStatus(sensorStatus12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus9);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test576");
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
        databaseProxy9.writePayments((java.util.List<main.models.Payment>) paymentList41);
        java.util.List<main.models.User> userList46 = databaseProxy9.readUsers();
        java.util.List<main.models.User> userList47 = databaseProxy9.readUsers();
        java.util.List<main.models.Reservation> reservationList48 = databaseProxy9.readReservations();
        databaseProxy1.writeReservations(reservationList48);
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
        org.junit.Assert.assertNotNull(userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList48);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test577");
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
        java.util.List<main.models.Reservation> reservationList80 = databaseProxy1.readReservations();
        java.util.List<main.models.User> userList81 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(reservationList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test578");
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
        java.lang.String str76 = usageData71.getOperationStatus();
        java.lang.String str77 = usageData71.getEquipmentId();
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
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "" + "'", str76.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test579");
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
        java.util.List<main.models.Equipment> equipmentList34 = databaseProxy1.readEquipment();
        java.util.List<main.models.Equipment> equipmentList35 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList35);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test580");
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
        java.lang.String str37 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus38 = null;
        sensor2.setStatus(sensorStatus38);
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "" + "'", str37.equals(""));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test581");
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
        main.enums.SensorStatus sensorStatus73 = null;
        main.models.Sensor sensor74 = new main.models.Sensor("hi!", sensorStatus73);
        sensor74.setSensorId("");
        sensor74.setSensorId("hi!");
        java.time.LocalDateTime localDateTime79 = sensor74.getLastUpdateTime();
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
        org.junit.Assert.assertNotNull(localDateTime79);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test582");
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
        java.util.List<main.models.Reservation> reservationList41 = databaseProxy1.readReservations();
        java.util.List<main.models.Reservation> reservationList42 = databaseProxy1.readReservations();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList42);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test583");
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
        java.util.List<main.models.Equipment> equipmentList24 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.User> userList25 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList26 = null;
        cSVDatabaseManager0.writeEquipment(equipmentList26);
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
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
        org.junit.Assert.assertNotNull(equipmentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList25);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test584");
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
        java.util.List<main.models.User> userList11 = cSVDatabaseManager0.readUsers();
        java.lang.Class<?> wildcardClass12 = userList11.getClass();
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
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test585");
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
        java.time.LocalDateTime localDateTime88 = sensor53.getLastUpdateTime();
        main.models.UsageData usageData89 = new main.models.UsageData("", "hi!", localDateTime88);
        systemAlert28.update(usageData89);
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
        org.junit.Assert.assertNotNull(localDateTime88);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test586");
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
        main.models.DatabaseProxy databaseProxy29 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        java.util.List<main.models.User> userList30 = databaseProxy29.readUsers();
        main.models.User[] userArray31 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList32 = new java.util.ArrayList<main.models.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList32, userArray31);
        databaseProxy29.writeUsers((java.util.List<main.models.User>) userList32);
        databaseProxy11.writeUsers((java.util.List<main.models.User>) userList32);
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy37 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager36);
        main.models.User[] userArray38 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList39 = new java.util.ArrayList<main.models.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList39, userArray38);
        cSVDatabaseManager36.writeUsers((java.util.List<main.models.User>) userList39);
        java.util.List<main.models.Payment> paymentList42 = cSVDatabaseManager36.readPayments();
        databaseProxy11.writePayments(paymentList42);
        java.util.List<main.models.User> userList44 = databaseProxy11.readUsers();
        cSVDatabaseManager0.writeUsers(userList44);
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy47 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager46);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray49 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList50 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList50, equipmentArray49);
        cSVDatabaseManager48.writeEquipment((java.util.List<main.models.Equipment>) equipmentList50);
        main.models.CSVDatabaseManager cSVDatabaseManager53 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager53.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        main.models.Reservation[] reservationArray58 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList59 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList59, reservationArray58);
        cSVDatabaseManager53.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        cSVDatabaseManager48.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        databaseProxy47.writeReservations((java.util.List<main.models.Reservation>) reservationList59);
        main.models.CSVDatabaseManager cSVDatabaseManager64 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy65 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager64);
        java.util.List<main.models.User> userList66 = databaseProxy65.readUsers();
        main.models.User[] userArray67 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList68 = new java.util.ArrayList<main.models.User>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList68, userArray67);
        databaseProxy65.writeUsers((java.util.List<main.models.User>) userList68);
        databaseProxy47.writeUsers((java.util.List<main.models.User>) userList68);
        java.util.List<main.models.Reservation> reservationList72 = databaseProxy47.readReservations();
        java.util.List<main.models.Equipment> equipmentList73 = databaseProxy47.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList73);
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
        org.junit.Assert.assertNotNull(userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList73);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test587");
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
        main.models.CSVDatabaseManager cSVDatabaseManager19 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray20 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList21 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList21, equipmentArray20);
        cSVDatabaseManager19.writeEquipment((java.util.List<main.models.Equipment>) equipmentList21);
        main.models.Reservation[] reservationArray24 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList25 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList25, reservationArray24);
        cSVDatabaseManager19.writeReservations((java.util.List<main.models.Reservation>) reservationList25);
        java.util.List<main.models.User> userList28 = cSVDatabaseManager19.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager29 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray30 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList31 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList31, equipmentArray30);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList31);
        main.models.Reservation[] reservationArray34 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList35 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList35, reservationArray34);
        cSVDatabaseManager29.writeReservations((java.util.List<main.models.Reservation>) reservationList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        cSVDatabaseManager29.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        java.util.List<main.models.User> userList44 = cSVDatabaseManager29.readUsers();
        java.util.List<main.models.Equipment> equipmentList45 = cSVDatabaseManager29.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.Reservation[] reservationArray51 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList52 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList52, reservationArray51);
        cSVDatabaseManager46.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        main.models.CSVDatabaseManager cSVDatabaseManager55 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray56 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList57 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList57, equipmentArray56);
        cSVDatabaseManager55.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList57);
        java.util.List<main.models.User> userList61 = cSVDatabaseManager46.readUsers();
        cSVDatabaseManager29.writeUsers(userList61);
        java.util.List<main.models.Reservation> reservationList63 = cSVDatabaseManager29.readReservations();
        java.util.List<main.models.Equipment> equipmentList64 = cSVDatabaseManager29.readEquipment();
        cSVDatabaseManager19.writeEquipment(equipmentList64);
        databaseProxy1.writeEquipment(equipmentList64);
        main.models.CSVDatabaseManager cSVDatabaseManager67 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy68 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager67);
        java.util.List<main.models.User> userList69 = databaseProxy68.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy71 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager70);
        java.util.List<main.models.User> userList72 = databaseProxy71.readUsers();
        databaseProxy68.writeUsers(userList72);
        java.util.List<main.models.Equipment> equipmentList74 = databaseProxy68.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager75 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy76 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager75);
        java.util.List<main.models.User> userList77 = databaseProxy76.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy79 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager78);
        java.util.List<main.models.User> userList80 = databaseProxy79.readUsers();
        databaseProxy76.writeUsers(userList80);
        main.models.CSVDatabaseManager cSVDatabaseManager82 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy83 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager82);
        java.util.List<main.models.User> userList84 = databaseProxy83.readUsers();
        databaseProxy76.writeUsers(userList84);
        databaseProxy68.writeUsers(userList84);
        databaseProxy1.writeUsers(userList84);
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList84);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test588");
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
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.Equipment> equipmentList21 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList21);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test589");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        main.models.UsageLogger usageLogger5 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        usageLogger5.update(usageData9);
        sensor2.detach((main.models.Observer) usageLogger5);
        java.util.List<main.models.UsageData> usageDataList12 = usageLogger5.getRecords();
        java.lang.Class<?> wildcardClass13 = usageDataList12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test590");
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
        java.util.List<main.models.Reservation> reservationList63 = databaseProxy38.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList63);
        main.models.CSVDatabaseManager cSVDatabaseManager65 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy66 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager65);
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
        cSVDatabaseManager65.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        java.util.List<main.models.Reservation> reservationList84 = cSVDatabaseManager0.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager65);
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
        org.junit.Assert.assertNotNull(reservationList84);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test591");
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
        main.models.SystemAlert systemAlert53 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList54 = systemAlert53.getMessages();
        java.time.LocalDateTime localDateTime57 = null;
        main.models.UsageData usageData58 = new main.models.UsageData("", "hi!", localDateTime57);
        systemAlert53.update(usageData58);
        java.time.LocalDateTime localDateTime62 = null;
        main.models.UsageData usageData63 = new main.models.UsageData("hi!", "", localDateTime62);
        java.lang.String str64 = usageData63.getEquipmentId();
        java.time.LocalDateTime localDateTime65 = usageData63.getRecordedAt();
        java.time.LocalDateTime localDateTime66 = usageData63.getRecordedAt();
        systemAlert53.update(usageData63);
        sensor2.notifyObservers(usageData63);
        java.lang.String str69 = usageData63.getOperationStatus();
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
        org.junit.Assert.assertNotNull(strList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!" + "'", str64.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "" + "'", str69.equals(""));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test592");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.User> userList7 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Equipment> equipmentList8 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        main.models.User[] userArray11 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList12 = new java.util.ArrayList<main.models.User>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList12, userArray11);
        cSVDatabaseManager9.writeUsers((java.util.List<main.models.User>) userList12);
        java.util.List<main.models.Payment> paymentList15 = cSVDatabaseManager9.readPayments();
        java.util.List<main.models.User> userList16 = cSVDatabaseManager9.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy18 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager17);
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
        databaseProxy18.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        databaseProxy18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        java.util.List<main.models.User> userList41 = databaseProxy18.readUsers();
        cSVDatabaseManager9.writeUsers(userList41);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        java.util.List<main.models.User> userList48 = cSVDatabaseManager43.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.Reservation[] reservationArray54 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList55 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList55, reservationArray54);
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager43.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager9.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
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
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList48);
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
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test593");
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
        main.enums.SensorStatus sensorStatus63 = null;
        main.models.Sensor sensor64 = new main.models.Sensor("hi!", sensorStatus63);
        sensor64.setSensorId("");
        java.time.LocalDateTime localDateTime69 = null;
        main.models.UsageData usageData70 = new main.models.UsageData("hi!", "", localDateTime69);
        java.lang.String str71 = usageData70.getEquipmentId();
        java.time.LocalDateTime localDateTime72 = usageData70.getRecordedAt();
        java.time.LocalDateTime localDateTime73 = usageData70.getRecordedAt();
        java.lang.String str74 = usageData70.getOperationStatus();
        sensor64.recordUsage(usageData70);
        main.models.SystemAlert systemAlert76 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList77 = systemAlert76.getMessages();
        java.util.List<java.lang.String> strList78 = systemAlert76.getMessages();
        main.models.UsageLogger usageLogger79 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime82 = null;
        main.models.UsageData usageData83 = new main.models.UsageData("hi!", "", localDateTime82);
        usageLogger79.update(usageData83);
        systemAlert76.update(usageData83);
        sensor64.notifyObservers(usageData83);
        java.time.LocalDateTime localDateTime87 = usageData83.getRecordedAt();
        sensor2.recordUsage(usageData83);
        java.time.LocalDateTime localDateTime89 = usageData83.getRecordedAt();
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
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "hi!" + "'", str71.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "" + "'", str74.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime89);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test594");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        main.enums.SensorStatus sensorStatus7 = sensor4.getStatus();
        main.models.UsageLogger usageLogger8 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("hi!", "", localDateTime11);
        usageLogger8.update(usageData12);
        java.util.List<main.models.UsageData> usageDataList14 = usageLogger8.getRecords();
        sensor4.detach((main.models.Observer) usageLogger8);
        main.enums.SensorStatus sensorStatus19 = null;
        main.models.Sensor sensor20 = new main.models.Sensor("hi!", sensorStatus19);
        sensor20.setSensorId("");
        sensor20.setSensorId("");
        java.time.LocalDateTime localDateTime25 = sensor20.getLastUpdateTime();
        main.models.UsageData usageData26 = new main.models.UsageData("hi!", "hi!", localDateTime25);
        sensor4.recordUsage(usageData26);
        java.time.LocalDateTime localDateTime28 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData29 = new main.models.UsageData("", "hi!", localDateTime28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test595");
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
        java.util.List<main.models.Equipment> equipmentList10 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Equipment> equipmentList11 = null;
        cSVDatabaseManager0.writeEquipment(equipmentList11);
        java.util.List<main.models.User> userList13 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(equipmentList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test596");
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
        java.util.List<main.models.Equipment> equipmentList32 = databaseProxy1.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray34 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList35 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList35, equipmentArray34);
        cSVDatabaseManager33.writeEquipment((java.util.List<main.models.Equipment>) equipmentList35);
        main.models.CSVDatabaseManager cSVDatabaseManager38 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray39 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList40 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList40, equipmentArray39);
        cSVDatabaseManager38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList40);
        main.models.Reservation[] reservationArray43 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList44 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList44, reservationArray43);
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        cSVDatabaseManager33.writeReservations((java.util.List<main.models.Reservation>) reservationList44);
        main.models.CSVDatabaseManager cSVDatabaseManager48 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy49 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager48);
        java.util.List<main.models.User> userList50 = databaseProxy49.readUsers();
        cSVDatabaseManager33.writeUsers(userList50);
        databaseProxy1.writeUsers(userList50);
        java.util.List<main.models.Reservation> reservationList53 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(equipmentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList53);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test597");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.Payment[] paymentArray2 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList3 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList3, paymentArray2);
        databaseProxy1.writePayments((java.util.List<main.models.Payment>) paymentList3);
        java.util.List<main.models.Reservation> reservationList6 = databaseProxy1.readReservations();
        main.models.DatabaseProxy databaseProxy7 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList6);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test598");
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
        main.models.DatabaseProxy databaseProxy40 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy1);
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
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test599");
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
        main.models.DatabaseProxy databaseProxy13 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager12);
        java.util.List<main.models.User> userList14 = databaseProxy13.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
        java.util.List<main.models.User> userList17 = databaseProxy16.readUsers();
        databaseProxy13.writeUsers(userList17);
        java.util.List<main.models.Equipment> equipmentList19 = databaseProxy13.readEquipment();
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
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager38);
        java.util.List<main.models.User> userList40 = databaseProxy39.readUsers();
        main.models.User[] userArray41 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList42 = new java.util.ArrayList<main.models.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList42, userArray41);
        databaseProxy39.writeUsers((java.util.List<main.models.User>) userList42);
        databaseProxy21.writeUsers((java.util.List<main.models.User>) userList42);
        databaseProxy13.writeUsers((java.util.List<main.models.User>) userList42);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy48 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        main.models.Reservation[] reservationArray59 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList60 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList60, reservationArray59);
        cSVDatabaseManager54.writeReservations((java.util.List<main.models.Reservation>) reservationList60);
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList60);
        databaseProxy48.writeReservations((java.util.List<main.models.Reservation>) reservationList60);
        java.util.List<main.models.Reservation> reservationList65 = databaseProxy48.readReservations();
        databaseProxy13.writeReservations(reservationList65);
        java.util.List<main.models.Equipment> equipmentList67 = databaseProxy13.readEquipment();
        databaseProxy10.writeEquipment(equipmentList67);
        java.util.List<main.models.User> userList69 = databaseProxy10.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager70 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy71 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager70);
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
        databaseProxy71.writeReservations((java.util.List<main.models.Reservation>) reservationList83);
        java.util.List<main.models.Equipment> equipmentList88 = databaseProxy71.readEquipment();
        java.util.List<main.models.Payment> paymentList89 = databaseProxy71.readPayments();
        databaseProxy10.writePayments(paymentList89);
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
        org.junit.Assert.assertNotNull(userList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList19);
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
        org.junit.Assert.assertNotNull(userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
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
        org.junit.Assert.assertNotNull(reservationList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager70);
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
        org.junit.Assert.assertNotNull(equipmentList88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList89);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test600");
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
        java.util.List<main.models.User> userList29 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList29);
    }
}

