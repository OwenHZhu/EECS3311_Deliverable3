package randooptest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SystemAlertRandoopTest {

    public static boolean debug = false;

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test401");
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
        java.util.List<main.models.User> userList19 = cSVDatabaseManager10.readUsers();
        main.models.DatabaseProxy databaseProxy20 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager10);
        java.util.List<main.models.User> userList21 = cSVDatabaseManager10.readUsers();
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
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        java.util.List<main.models.User> userList39 = databaseProxy38.readUsers();
        cSVDatabaseManager22.writeUsers(userList39);
        cSVDatabaseManager10.writeUsers(userList39);
        cSVDatabaseManager0.writeUsers(userList39);
        java.util.List<main.models.Reservation> reservationList43 = cSVDatabaseManager0.readReservations();
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
        java.util.List<main.models.User> userList77 = cSVDatabaseManager44.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager78 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray79 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList80 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList80, equipmentArray79);
        cSVDatabaseManager78.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager44.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList80);
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
        org.junit.Assert.assertNotNull(userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList21);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList43);
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
        org.junit.Assert.assertNotNull(userList77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test402");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.Reservation[] reservationArray7 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList8 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList8, reservationArray7);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList8);
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy19 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager18);
        main.models.User[] userArray20 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList21 = new java.util.ArrayList<main.models.User>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList21, userArray20);
        cSVDatabaseManager18.writeUsers((java.util.List<main.models.User>) userList21);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test403");
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
        java.time.LocalDateTime localDateTime14 = usageData11.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test404");
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
        java.util.List<main.models.Payment> paymentList36 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Equipment> equipmentList37 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(paymentList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList37);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test405");
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
        java.util.List<java.lang.String> strList15 = systemAlert7.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test406");
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
        java.time.LocalDateTime localDateTime21 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test407");
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
        java.time.LocalDateTime localDateTime16 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus17 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus17);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test408");
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
        main.models.CSVDatabaseManager cSVDatabaseManager23 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray24 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList25 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList25, equipmentArray24);
        cSVDatabaseManager23.writeEquipment((java.util.List<main.models.Equipment>) equipmentList25);
        main.models.Payment[] paymentArray28 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList29 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList29, paymentArray28);
        cSVDatabaseManager23.writePayments((java.util.List<main.models.Payment>) paymentList29);
        java.util.List<main.models.Payment> paymentList32 = cSVDatabaseManager23.readPayments();
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
        cSVDatabaseManager23.writeUsers((java.util.List<main.models.User>) userList50);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList50);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList32);
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
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test409");
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
        java.util.List<main.models.User> userList28 = databaseProxy1.readUsers();
        java.util.List<main.models.Reservation> reservationList29 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList29);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test410");
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
        sensor2.setSensorId("hi!");
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
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test411");
        main.models.UsageLogger usageLogger0 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList1 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList2 = usageLogger0.getRecords();
        java.util.List<main.models.UsageData> usageDataList3 = usageLogger0.getRecords();
        main.enums.SensorStatus sensorStatus5 = null;
        main.models.Sensor sensor6 = new main.models.Sensor("hi!", sensorStatus5);
        java.time.LocalDateTime localDateTime9 = null;
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        sensor6.notifyObservers(usageData10);
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("", "", localDateTime15);
        sensor6.notifyObservers(usageData16);
        main.models.SystemAlert systemAlert18 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList19 = systemAlert18.getMessages();
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("", "hi!", localDateTime22);
        systemAlert18.update(usageData23);
        java.util.List<java.lang.String> strList25 = systemAlert18.getMessages();
        main.models.SystemAlert systemAlert26 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList27 = systemAlert26.getMessages();
        java.util.List<java.lang.String> strList28 = systemAlert26.getMessages();
        main.models.UsageLogger usageLogger29 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime32 = null;
        main.models.UsageData usageData33 = new main.models.UsageData("hi!", "", localDateTime32);
        usageLogger29.update(usageData33);
        systemAlert26.update(usageData33);
        systemAlert18.update(usageData33);
        sensor6.attach((main.models.Observer) systemAlert18);
        java.time.LocalDateTime localDateTime40 = null;
        main.models.UsageData usageData41 = new main.models.UsageData("", "", localDateTime40);
        sensor6.recordUsage(usageData41);
        usageLogger0.update(usageData41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList28);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test412");
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
        java.util.List<main.models.Reservation> reservationList26 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList27 = databaseProxy1.readPayments();
        java.util.List<main.models.Equipment> equipmentList28 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(reservationList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList28);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test413");
        main.enums.SensorStatus sensorStatus3 = null;
        main.models.Sensor sensor4 = new main.models.Sensor("hi!", sensorStatus3);
        sensor4.setSensorId("");
        sensor4.setSensorId("");
        java.time.LocalDateTime localDateTime9 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData10 = new main.models.UsageData("hi!", "hi!", localDateTime9);
        java.lang.String str11 = usageData10.getEquipmentId();
        java.lang.Class<?> wildcardClass12 = usageData10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test414");
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
        main.enums.SensorStatus sensorStatus64 = null;
        main.models.Sensor sensor65 = new main.models.Sensor("hi!", sensorStatus64);
        sensor65.setSensorId("");
        sensor65.setSensorId("");
        java.time.LocalDateTime localDateTime70 = sensor65.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime70);
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
        org.junit.Assert.assertNotNull(localDateTime70);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test415");
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
        java.util.List<main.models.User> userList10 = null;
        cSVDatabaseManager0.writeUsers(userList10);
        main.models.CSVDatabaseManager cSVDatabaseManager12 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray13 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList14 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList14, equipmentArray13);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList14);
        main.models.Reservation[] reservationArray17 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList18 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList18, reservationArray17);
        cSVDatabaseManager12.writeReservations((java.util.List<main.models.Reservation>) reservationList18);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray22 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList23 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList23, equipmentArray22);
        cSVDatabaseManager21.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        cSVDatabaseManager12.writeEquipment((java.util.List<main.models.Equipment>) equipmentList23);
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray28 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList29 = new java.util.ArrayList<main.models.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList29, userArray28);
        cSVDatabaseManager27.writeUsers((java.util.List<main.models.User>) userList29);
        cSVDatabaseManager12.writeUsers((java.util.List<main.models.User>) userList29);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList29);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test416");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus9 = null;
        main.models.Sensor sensor10 = new main.models.Sensor("hi!", sensorStatus9);
        java.time.LocalDateTime localDateTime13 = null;
        main.models.UsageData usageData14 = new main.models.UsageData("hi!", "", localDateTime13);
        java.lang.String str15 = usageData14.getEquipmentId();
        sensor10.notifyObservers(usageData14);
        main.enums.SensorStatus sensorStatus17 = sensor10.getStatus();
        sensor10.setSensorId("hi!");
        java.lang.String str20 = sensor10.getSensorId();
        java.time.LocalDateTime localDateTime21 = sensor10.getLastUpdateTime();
        sensor2.setLastUpdateTime(localDateTime21);
        main.enums.SensorStatus sensorStatus23 = sensor2.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus23);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test417");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Equipment[] equipmentArray5 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList6 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList6, equipmentArray5);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList6);
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
        main.models.CSVDatabaseManager cSVDatabaseManager27 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy28 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager27);
        java.util.List<main.models.User> userList29 = databaseProxy28.readUsers();
        main.models.User[] userArray30 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList31 = new java.util.ArrayList<main.models.User>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList31, userArray30);
        databaseProxy28.writeUsers((java.util.List<main.models.User>) userList31);
        databaseProxy10.writeUsers((java.util.List<main.models.User>) userList31);
        java.util.List<main.models.Reservation> reservationList35 = databaseProxy10.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList35);
        main.models.CSVDatabaseManager cSVDatabaseManager37 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager37);
        main.models.CSVDatabaseManager cSVDatabaseManager39 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy40 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager39);
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        main.models.CSVDatabaseManager cSVDatabaseManager46 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray47 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList48 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList48, equipmentArray47);
        cSVDatabaseManager46.writeEquipment((java.util.List<main.models.Equipment>) equipmentList48);
        main.models.Reservation[] reservationArray51 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList52 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList52, reservationArray51);
        cSVDatabaseManager46.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        cSVDatabaseManager41.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        databaseProxy40.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        databaseProxy38.writeReservations((java.util.List<main.models.Reservation>) reservationList52);
        main.models.Equipment[] equipmentArray58 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList59 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList59, equipmentArray58);
        databaseProxy38.writeEquipment((java.util.List<main.models.Equipment>) equipmentList59);
        main.models.CSVDatabaseManager cSVDatabaseManager62 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy63 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager62);
        main.models.Payment[] paymentArray64 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList65 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList65, paymentArray64);
        databaseProxy63.writePayments((java.util.List<main.models.Payment>) paymentList65);
        databaseProxy38.writePayments((java.util.List<main.models.Payment>) paymentList65);
        java.util.List<main.models.Equipment> equipmentList69 = databaseProxy38.readEquipment();
        cSVDatabaseManager0.writeEquipment(equipmentList69);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.junit.Assert.assertNotNull(equipmentArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList69);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test418");
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
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray77 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList78 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList78, equipmentArray77);
        cSVDatabaseManager76.writeEquipment((java.util.List<main.models.Equipment>) equipmentList78);
        main.models.Reservation[] reservationArray81 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList82 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList82, reservationArray81);
        cSVDatabaseManager76.writeReservations((java.util.List<main.models.Reservation>) reservationList82);
        java.util.List<main.models.User> userList85 = cSVDatabaseManager76.readUsers();
        main.models.DatabaseProxy databaseProxy86 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager76);
        java.util.List<main.models.Payment> paymentList87 = databaseProxy86.readPayments();
        cSVDatabaseManager0.writePayments(paymentList87);
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
        org.junit.Assert.assertNotNull(userList85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList87);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test419");
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
        java.util.List<main.models.User> userList32 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList32);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test420");
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
        main.models.DatabaseProxy databaseProxy33 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager32);
        java.util.List<main.models.User> userList34 = databaseProxy33.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        java.util.List<main.models.User> userList37 = databaseProxy36.readUsers();
        databaseProxy33.writeUsers(userList37);
        java.util.List<main.models.Equipment> equipmentList39 = databaseProxy33.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        java.util.List<main.models.User> userList42 = databaseProxy41.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        java.util.List<main.models.User> userList45 = databaseProxy44.readUsers();
        databaseProxy41.writeUsers(userList45);
        main.models.CSVDatabaseManager cSVDatabaseManager47 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy48 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager47);
        java.util.List<main.models.User> userList49 = databaseProxy48.readUsers();
        databaseProxy41.writeUsers(userList49);
        databaseProxy33.writeUsers(userList49);
        main.models.CSVDatabaseManager cSVDatabaseManager52 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray53 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList54 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList54, equipmentArray53);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList54);
        main.models.Equipment[] equipmentArray57 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList58 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList58, equipmentArray57);
        cSVDatabaseManager52.writeEquipment((java.util.List<main.models.Equipment>) equipmentList58);
        java.util.List<main.models.User> userList61 = cSVDatabaseManager52.readUsers();
        databaseProxy33.writeUsers(userList61);
        java.util.List<main.models.Payment> paymentList63 = databaseProxy33.readPayments();
        cSVDatabaseManager0.writePayments(paymentList63);
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
        org.junit.Assert.assertNotNull(userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList49);
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
        org.junit.Assert.assertNotNull(userList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList63);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test421");
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
        java.util.List<main.models.Payment> paymentList21 = cSVDatabaseManager0.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList21);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test422");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.CSVDatabaseManager cSVDatabaseManager2 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray3 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList4 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList4, equipmentArray3);
        cSVDatabaseManager2.writeEquipment((java.util.List<main.models.Equipment>) equipmentList4);
        main.models.Reservation[] reservationArray7 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList8 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList8, reservationArray7);
        cSVDatabaseManager2.writeReservations((java.util.List<main.models.Reservation>) reservationList8);
        java.util.List<main.models.Equipment> equipmentList11 = null;
        cSVDatabaseManager2.writeEquipment(equipmentList11);
        java.util.List<main.models.Reservation> reservationList13 = cSVDatabaseManager2.readReservations();
        databaseProxy1.writeReservations(reservationList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
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
        org.junit.Assert.assertNotNull(reservationList13);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test423");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        java.time.LocalDateTime localDateTime8 = null;
        main.models.UsageData usageData9 = new main.models.UsageData("hi!", "", localDateTime8);
        java.lang.String str10 = usageData9.getEquipmentId();
        usageLogger3.update(usageData9);
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        usageLogger3.update(usageData15);
        java.lang.String str17 = usageData15.getEquipmentId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test424");
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
        java.time.LocalDateTime localDateTime55 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertNotNull(localDateTime55);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test425");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus10 = null;
        main.models.Sensor sensor11 = new main.models.Sensor("hi!", sensorStatus10);
        sensor11.setSensorId("");
        main.enums.SensorStatus sensorStatus14 = sensor11.getStatus();
        main.models.SystemAlert systemAlert15 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList16 = systemAlert15.getMessages();
        java.util.List<java.lang.String> strList17 = systemAlert15.getMessages();
        java.util.List<java.lang.String> strList18 = systemAlert15.getMessages();
        sensor11.attach((main.models.Observer) systemAlert15);
        java.util.List<java.lang.String> strList20 = systemAlert15.getMessages();
        sensor2.attach((main.models.Observer) systemAlert15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test426");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        main.enums.SensorStatus sensorStatus12 = null;
        main.models.Sensor sensor13 = new main.models.Sensor("hi!", sensorStatus12);
        sensor13.setSensorId("");
        sensor13.setSensorId("");
        java.time.LocalDateTime localDateTime18 = sensor13.getLastUpdateTime();
        main.models.UsageData usageData19 = new main.models.UsageData("", "hi!", localDateTime18);
        sensor2.recordUsage(usageData19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test427");
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
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray36 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList37 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList37, equipmentArray36);
        cSVDatabaseManager35.writeEquipment((java.util.List<main.models.Equipment>) equipmentList37);
        main.models.Reservation[] reservationArray40 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList41 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList41, reservationArray40);
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList41);
        java.util.List<main.models.Equipment> equipmentList44 = null;
        cSVDatabaseManager35.writeEquipment(equipmentList44);
        java.util.List<main.models.Payment> paymentList46 = cSVDatabaseManager35.readPayments();
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
        cSVDatabaseManager35.writeReservations((java.util.List<main.models.Reservation>) reservationList60);
        java.util.List<main.models.Payment> paymentList66 = cSVDatabaseManager35.readPayments();
        databaseProxy1.writePayments(paymentList66);
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
        org.junit.Assert.assertNotNull(paymentList46);
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
        org.junit.Assert.assertNotNull(paymentList66);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test428");
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
        cSVDatabaseManager0.writeEquipment(equipmentList45);
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
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test429");
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
        main.models.DatabaseProxy databaseProxy29 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        main.models.Payment[] paymentArray30 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList31 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList31, paymentArray30);
        databaseProxy29.writePayments((java.util.List<main.models.Payment>) paymentList31);
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
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray50 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList51 = new java.util.ArrayList<main.models.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList51, userArray50);
        cSVDatabaseManager49.writeUsers((java.util.List<main.models.User>) userList51);
        cSVDatabaseManager34.writeUsers((java.util.List<main.models.User>) userList51);
        databaseProxy29.writeUsers((java.util.List<main.models.User>) userList51);
        java.util.List<main.models.Payment> paymentList56 = databaseProxy29.readPayments();
        databaseProxy1.writePayments(paymentList56);
        java.util.List<main.models.Reservation> reservationList58 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(paymentArray30);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList58);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test430");
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
        java.util.List<main.models.Payment> paymentList32 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Payment> paymentList33 = cSVDatabaseManager0.readPayments();
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
        java.util.List<main.models.User> userList66 = cSVDatabaseManager51.readUsers();
        cSVDatabaseManager34.writeUsers(userList66);
        main.models.CSVDatabaseManager cSVDatabaseManager68 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray69 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList70 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList70, equipmentArray69);
        cSVDatabaseManager68.writeEquipment((java.util.List<main.models.Equipment>) equipmentList70);
        main.models.Reservation[] reservationArray73 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList74 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList74, reservationArray73);
        cSVDatabaseManager68.writeReservations((java.util.List<main.models.Reservation>) reservationList74);
        cSVDatabaseManager34.writeReservations((java.util.List<main.models.Reservation>) reservationList74);
        java.util.List<main.models.Payment> paymentList78 = cSVDatabaseManager34.readPayments();
        java.util.List<main.models.Payment> paymentList79 = cSVDatabaseManager34.readPayments();
        cSVDatabaseManager0.writePayments(paymentList79);
        java.util.List<main.models.User> userList81 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(paymentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList33);
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
        org.junit.Assert.assertNotNull(userList66);
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
        org.junit.Assert.assertNotNull(paymentList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList81);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test431");
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
        java.util.List<main.models.Reservation> reservationList26 = databaseProxy1.readReservations();
        java.util.List<main.models.Payment> paymentList27 = databaseProxy1.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.Reservation[] reservationArray33 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList34 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList34, reservationArray33);
        cSVDatabaseManager28.writeReservations((java.util.List<main.models.Reservation>) reservationList34);
        java.util.List<main.models.Equipment> equipmentList37 = cSVDatabaseManager28.readEquipment();
        main.models.DatabaseProxy databaseProxy38 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager28);
        java.util.List<main.models.Equipment> equipmentList39 = databaseProxy38.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList41 = cSVDatabaseManager40.readReservations();
        databaseProxy38.writeReservations(reservationList41);
        java.util.List<main.models.Equipment> equipmentList43 = databaseProxy38.readEquipment();
        databaseProxy1.writeEquipment(equipmentList43);
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
        org.junit.Assert.assertNotNull(reservationList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList27);
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
        org.junit.Assert.assertNotNull(equipmentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList43);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test432");
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
        java.util.List<main.models.Reservation> reservationList26 = databaseProxy25.readReservations();
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
        org.junit.Assert.assertNotNull(reservationList26);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test433");
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
        java.util.List<java.lang.String> strList19 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList20 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test434");
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
        main.models.CSVDatabaseManager cSVDatabaseManager26 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray27 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList28 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList28, equipmentArray27);
        cSVDatabaseManager26.writeEquipment((java.util.List<main.models.Equipment>) equipmentList28);
        main.models.Reservation[] reservationArray31 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList32 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList32, reservationArray31);
        cSVDatabaseManager26.writeReservations((java.util.List<main.models.Reservation>) reservationList32);
        java.util.List<main.models.Equipment> equipmentList35 = cSVDatabaseManager26.readEquipment();
        java.util.List<main.models.Reservation> reservationList36 = cSVDatabaseManager26.readReservations();
        databaseProxy1.writeReservations(reservationList36);
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
        org.junit.Assert.assertNotNull(equipmentList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList36);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test435");
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
        java.util.List<main.models.User> userList10 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager11 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray12 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList13 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList13, equipmentArray12);
        cSVDatabaseManager11.writeEquipment((java.util.List<main.models.Equipment>) equipmentList13);
        java.util.List<main.models.User> userList16 = cSVDatabaseManager11.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager17 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList18 = cSVDatabaseManager17.readReservations();
        cSVDatabaseManager11.writeReservations(reservationList18);
        cSVDatabaseManager0.writeReservations(reservationList18);
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy22 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager21);
        java.util.List<main.models.User> userList23 = databaseProxy22.readUsers();
        java.util.List<main.models.Reservation> reservationList24 = databaseProxy22.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList24);
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
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList24);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test436");
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
        java.util.List<main.models.UsageData> usageDataList76 = usageLogger36.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList76);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test437");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Equipment> equipmentList7 = cSVDatabaseManager0.readEquipment();
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
        main.models.CSVDatabaseManager cSVDatabaseManager34 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy35 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager34);
        main.models.User[] userArray36 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList37 = new java.util.ArrayList<main.models.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList37, userArray36);
        cSVDatabaseManager34.writeUsers((java.util.List<main.models.User>) userList37);
        java.util.List<main.models.Payment> paymentList40 = cSVDatabaseManager34.readPayments();
        databaseProxy9.writePayments(paymentList40);
        java.util.List<main.models.Equipment> equipmentList42 = databaseProxy9.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray44 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList45 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList45, equipmentArray44);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList45);
        main.models.Equipment[] equipmentArray48 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList49 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList49, equipmentArray48);
        cSVDatabaseManager43.writeEquipment((java.util.List<main.models.Equipment>) equipmentList49);
        java.util.List<main.models.User> userList52 = cSVDatabaseManager43.readUsers();
        java.util.List<main.models.User> userList53 = cSVDatabaseManager43.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager54 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray55 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList56 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList56, equipmentArray55);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList56);
        main.models.Equipment[] equipmentArray59 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList60 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList60, equipmentArray59);
        cSVDatabaseManager54.writeEquipment((java.util.List<main.models.Equipment>) equipmentList60);
        java.util.List<main.models.User> userList63 = cSVDatabaseManager54.readUsers();
        java.util.List<main.models.Equipment> equipmentList64 = cSVDatabaseManager54.readEquipment();
        java.util.List<main.models.Equipment> equipmentList65 = cSVDatabaseManager54.readEquipment();
        cSVDatabaseManager43.writeEquipment(equipmentList65);
        databaseProxy9.writeEquipment(equipmentList65);
        cSVDatabaseManager0.writeEquipment(equipmentList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList65);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test438");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.enums.SensorStatus sensorStatus3 = null;
        sensor2.setStatus(sensorStatus3);
        java.time.LocalDateTime localDateTime5 = sensor2.getLastUpdateTime();
        sensor2.setSensorId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test439");
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
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy9);
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
        main.models.CSVDatabaseManager cSVDatabaseManager36 = main.models.CSVDatabaseManager.getInstance();
        main.models.User[] userArray37 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList38 = new java.util.ArrayList<main.models.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList38, userArray37);
        cSVDatabaseManager36.writeUsers((java.util.List<main.models.User>) userList38);
        cSVDatabaseManager21.writeUsers((java.util.List<main.models.User>) userList38);
        cSVDatabaseManager11.writeUsers((java.util.List<main.models.User>) userList38);
        main.models.CSVDatabaseManager cSVDatabaseManager43 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy44 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager43);
        main.models.User[] userArray45 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList46 = new java.util.ArrayList<main.models.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList46, userArray45);
        cSVDatabaseManager43.writeUsers((java.util.List<main.models.User>) userList46);
        java.util.List<main.models.Payment> paymentList49 = cSVDatabaseManager43.readPayments();
        java.util.List<main.models.Equipment> equipmentList50 = cSVDatabaseManager43.readEquipment();
        cSVDatabaseManager11.writeEquipment(equipmentList50);
        databaseProxy10.writeEquipment(equipmentList50);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList50);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test440");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus9 = null;
        main.models.Sensor sensor10 = new main.models.Sensor("hi!", sensorStatus9);
        sensor10.setSensorId("");
        java.time.LocalDateTime localDateTime15 = null;
        main.models.UsageData usageData16 = new main.models.UsageData("hi!", "", localDateTime15);
        java.lang.String str17 = usageData16.getEquipmentId();
        java.time.LocalDateTime localDateTime18 = usageData16.getRecordedAt();
        java.time.LocalDateTime localDateTime19 = usageData16.getRecordedAt();
        java.lang.String str20 = usageData16.getOperationStatus();
        sensor10.recordUsage(usageData16);
        main.enums.SensorStatus sensorStatus23 = null;
        main.models.Sensor sensor24 = new main.models.Sensor("hi!", sensorStatus23);
        sensor24.setSensorId("");
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("hi!", "", localDateTime29);
        java.lang.String str31 = usageData30.getEquipmentId();
        java.time.LocalDateTime localDateTime32 = usageData30.getRecordedAt();
        java.time.LocalDateTime localDateTime33 = usageData30.getRecordedAt();
        java.lang.String str34 = usageData30.getOperationStatus();
        sensor24.recordUsage(usageData30);
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        main.models.UsageLogger usageLogger39 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList40 = usageLogger39.getRecords();
        sensor38.attach((main.models.Observer) usageLogger39);
        java.time.LocalDateTime localDateTime44 = null;
        main.models.UsageData usageData45 = new main.models.UsageData("hi!", "", localDateTime44);
        java.lang.String str46 = usageData45.getEquipmentId();
        usageLogger39.update(usageData45);
        main.enums.SensorStatus sensorStatus49 = null;
        main.models.Sensor sensor50 = new main.models.Sensor("hi!", sensorStatus49);
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        sensor50.notifyObservers(usageData54);
        usageLogger39.update(usageData54);
        sensor24.attach((main.models.Observer) usageLogger39);
        java.util.List<main.models.UsageData> usageDataList59 = usageLogger39.getRecords();
        sensor10.attach((main.models.Observer) usageLogger39);
        main.enums.SensorStatus sensorStatus64 = null;
        main.models.Sensor sensor65 = new main.models.Sensor("hi!", sensorStatus64);
        sensor65.setSensorId("");
        sensor65.setSensorId("");
        java.time.LocalDateTime localDateTime70 = sensor65.getLastUpdateTime();
        main.models.UsageData usageData71 = new main.models.UsageData("", "hi!", localDateTime70);
        sensor10.setLastUpdateTime(localDateTime70);
        java.time.LocalDateTime localDateTime75 = null;
        main.models.UsageData usageData76 = new main.models.UsageData("hi!", "", localDateTime75);
        java.time.LocalDateTime localDateTime77 = usageData76.getRecordedAt();
        sensor10.notifyObservers(usageData76);
        sensor2.notifyObservers(usageData76);
        java.time.LocalDateTime localDateTime80 = usageData76.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "" + "'", str20.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime80);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test441");
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
        main.enums.SensorStatus sensorStatus67 = sensor2.getStatus();
        main.enums.SensorStatus sensorStatus71 = null;
        main.models.Sensor sensor72 = new main.models.Sensor("hi!", sensorStatus71);
        sensor72.setSensorId("");
        sensor72.setSensorId("");
        java.time.LocalDateTime localDateTime77 = sensor72.getLastUpdateTime();
        main.models.UsageData usageData78 = new main.models.UsageData("", "hi!", localDateTime77);
        sensor2.setLastUpdateTime(localDateTime77);
        main.enums.SensorStatus sensorStatus81 = null;
        main.models.Sensor sensor82 = new main.models.Sensor("hi!", sensorStatus81);
        java.time.LocalDateTime localDateTime85 = null;
        main.models.UsageData usageData86 = new main.models.UsageData("hi!", "", localDateTime85);
        java.lang.String str87 = usageData86.getEquipmentId();
        sensor82.notifyObservers(usageData86);
        sensor2.notifyObservers(usageData86);
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
        org.junit.Assert.assertNull(sensorStatus67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str87 + "' != '" + "hi!" + "'", str87.equals("hi!"));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test442");
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
        java.util.List<main.models.Payment> paymentList18 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList19);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test443");
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
        java.util.List<main.models.UsageData> usageDataList19 = usageLogger12.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList19);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test444");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        sensor2.setSensorId("hi!");
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
        main.enums.SensorStatus sensorStatus44 = sensor9.getStatus();
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        sensor47.setSensorId("");
        main.enums.SensorStatus sensorStatus50 = null;
        sensor47.setStatus(sensorStatus50);
        main.models.SystemAlert systemAlert52 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList53 = systemAlert52.getMessages();
        java.time.LocalDateTime localDateTime56 = null;
        main.models.UsageData usageData57 = new main.models.UsageData("", "hi!", localDateTime56);
        systemAlert52.update(usageData57);
        sensor47.detach((main.models.Observer) systemAlert52);
        main.enums.SensorStatus sensorStatus61 = null;
        main.models.Sensor sensor62 = new main.models.Sensor("hi!", sensorStatus61);
        sensor62.setSensorId("");
        java.time.LocalDateTime localDateTime67 = null;
        main.models.UsageData usageData68 = new main.models.UsageData("hi!", "", localDateTime67);
        java.lang.String str69 = usageData68.getEquipmentId();
        java.time.LocalDateTime localDateTime70 = usageData68.getRecordedAt();
        java.time.LocalDateTime localDateTime71 = usageData68.getRecordedAt();
        java.lang.String str72 = usageData68.getOperationStatus();
        sensor62.recordUsage(usageData68);
        sensor47.recordUsage(usageData68);
        sensor9.recordUsage(usageData68);
        sensor2.notifyObservers(usageData68);
        java.lang.Class<?> wildcardClass77 = usageData68.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!" + "'", str36.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "" + "'", str72.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test445");
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
        java.util.List<main.models.Reservation> reservationList34 = cSVDatabaseManager0.readReservations();
        java.util.List<main.models.Equipment> equipmentList35 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(reservationList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList35);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test446");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        main.models.User[] userArray2 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList3 = new java.util.ArrayList<main.models.User>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList3, userArray2);
        cSVDatabaseManager0.writeUsers((java.util.List<main.models.User>) userList3);
        java.util.List<main.models.Payment> paymentList6 = cSVDatabaseManager0.readPayments();
        java.util.List<main.models.Equipment> equipmentList7 = cSVDatabaseManager0.readEquipment();
        java.util.List<main.models.Reservation> reservationList8 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        main.models.Payment[] paymentArray11 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList12 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList12, paymentArray11);
        databaseProxy10.writePayments((java.util.List<main.models.Payment>) paymentList12);
        java.util.List<main.models.Reservation> reservationList15 = databaseProxy10.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList15);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test447");
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
        java.util.List<main.models.Equipment> equipmentList80 = databaseProxy1.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList80);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test448");
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
        java.util.List<main.models.Reservation> reservationList39 = cSVDatabaseManager38.readReservations();
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
        cSVDatabaseManager38.writeReservations((java.util.List<main.models.Reservation>) reservationList51);
        java.util.List<main.models.Reservation> reservationList56 = cSVDatabaseManager38.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager57 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy58 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager57);
        main.models.CSVDatabaseManager cSVDatabaseManager59 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy60 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager59);
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
        databaseProxy60.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        databaseProxy58.writeReservations((java.util.List<main.models.Reservation>) reservationList72);
        main.models.Equipment[] equipmentArray78 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList79 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList79, equipmentArray78);
        databaseProxy58.writeEquipment((java.util.List<main.models.Equipment>) equipmentList79);
        main.models.CSVDatabaseManager cSVDatabaseManager82 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray83 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList84 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList84, equipmentArray83);
        cSVDatabaseManager82.writeEquipment((java.util.List<main.models.Equipment>) equipmentList84);
        main.models.CSVDatabaseManager cSVDatabaseManager87 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy88 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager87);
        main.models.Payment[] paymentArray89 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList90 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList90, paymentArray89);
        databaseProxy88.writePayments((java.util.List<main.models.Payment>) paymentList90);
        cSVDatabaseManager82.writePayments((java.util.List<main.models.Payment>) paymentList90);
        databaseProxy58.writePayments((java.util.List<main.models.Payment>) paymentList90);
        java.util.List<main.models.User> userList95 = databaseProxy58.readUsers();
        cSVDatabaseManager38.writeUsers(userList95);
        java.util.List<main.models.Reservation> reservationList97 = cSVDatabaseManager38.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList97);
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
        org.junit.Assert.assertNotNull(reservationList39);
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
        org.junit.Assert.assertNotNull(reservationList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager59);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList97);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test449");
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
        java.util.List<main.models.Equipment> equipmentList90 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList90);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test450");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime7 = null;
        main.models.UsageData usageData8 = new main.models.UsageData("hi!", "", localDateTime7);
        java.lang.String str9 = usageData8.getEquipmentId();
        java.time.LocalDateTime localDateTime10 = usageData8.getRecordedAt();
        sensor2.recordUsage(usageData8);
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        java.time.LocalDateTime localDateTime17 = usageData15.getRecordedAt();
        java.time.LocalDateTime localDateTime18 = usageData15.getRecordedAt();
        java.lang.String str19 = usageData15.getEquipmentId();
        java.lang.String str20 = usageData15.getEquipmentId();
        sensor2.recordUsage(usageData15);
        main.models.SystemAlert systemAlert22 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList23 = systemAlert22.getMessages();
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("", "hi!", localDateTime26);
        systemAlert22.update(usageData27);
        java.util.List<java.lang.String> strList29 = systemAlert22.getMessages();
        main.models.SystemAlert systemAlert30 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList31 = systemAlert30.getMessages();
        java.util.List<java.lang.String> strList32 = systemAlert30.getMessages();
        main.models.UsageLogger usageLogger33 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime36 = null;
        main.models.UsageData usageData37 = new main.models.UsageData("hi!", "", localDateTime36);
        usageLogger33.update(usageData37);
        systemAlert30.update(usageData37);
        systemAlert22.update(usageData37);
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
        java.lang.String str55 = usageData49.getEquipmentId();
        systemAlert22.update(usageData49);
        java.lang.String str57 = usageData49.getOperationStatus();
        sensor2.notifyObservers(usageData49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "" + "'", str53.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "" + "'", str57.equals(""));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test451");
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
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy41 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager40);
        main.models.CSVDatabaseManager cSVDatabaseManager42 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy43 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager42);
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
        databaseProxy43.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        databaseProxy41.writeReservations((java.util.List<main.models.Reservation>) reservationList55);
        main.models.Equipment[] equipmentArray61 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList62 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList62, equipmentArray61);
        databaseProxy41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList62);
        java.util.List<main.models.Equipment> equipmentList65 = databaseProxy41.readEquipment();
        java.util.List<main.models.Equipment> equipmentList66 = databaseProxy41.readEquipment();
        databaseProxy1.writeEquipment(equipmentList66);
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
        org.junit.Assert.assertNotNull(userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager42);
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
        org.junit.Assert.assertNotNull(equipmentArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test452");
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
        java.util.List<main.models.User> userList51 = cSVDatabaseManager0.readUsers();
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
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test453");
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
        main.enums.SensorStatus sensorStatus52 = null;
        sensor2.setStatus(sensorStatus52);
        main.enums.SensorStatus sensorStatus55 = null;
        main.models.Sensor sensor56 = new main.models.Sensor("hi!", sensorStatus55);
        main.enums.SensorStatus sensorStatus57 = null;
        sensor56.setStatus(sensorStatus57);
        main.models.UsageLogger usageLogger59 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime62 = null;
        main.models.UsageData usageData63 = new main.models.UsageData("hi!", "", localDateTime62);
        usageLogger59.update(usageData63);
        sensor56.detach((main.models.Observer) usageLogger59);
        sensor2.detach((main.models.Observer) usageLogger59);
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
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test454");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        java.lang.String str7 = usageData6.getEquipmentId();
        sensor2.notifyObservers(usageData6);
        java.time.LocalDateTime localDateTime11 = null;
        main.models.UsageData usageData12 = new main.models.UsageData("", "", localDateTime11);
        sensor2.notifyObservers(usageData12);
        java.lang.String str14 = usageData12.getEquipmentId();
        java.time.LocalDateTime localDateTime15 = usageData12.getRecordedAt();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test455");
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
        main.enums.SensorStatus sensorStatus19 = null;
        sensor2.setStatus(sensorStatus19);
        main.enums.SensorStatus sensorStatus22 = null;
        main.models.Sensor sensor23 = new main.models.Sensor("hi!", sensorStatus22);
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("hi!", "", localDateTime26);
        java.lang.String str28 = usageData27.getEquipmentId();
        sensor23.notifyObservers(usageData27);
        main.enums.SensorStatus sensorStatus30 = sensor23.getStatus();
        main.enums.SensorStatus sensorStatus34 = null;
        main.models.Sensor sensor35 = new main.models.Sensor("hi!", sensorStatus34);
        sensor35.setSensorId("");
        sensor35.setSensorId("");
        java.time.LocalDateTime localDateTime40 = sensor35.getLastUpdateTime();
        main.models.UsageData usageData41 = new main.models.UsageData("", "hi!", localDateTime40);
        sensor23.setLastUpdateTime(localDateTime40);
        sensor2.setLastUpdateTime(localDateTime40);
        main.enums.SensorStatus sensorStatus45 = null;
        main.models.Sensor sensor46 = new main.models.Sensor("hi!", sensorStatus45);
        sensor46.setSensorId("");
        java.time.LocalDateTime localDateTime51 = null;
        main.models.UsageData usageData52 = new main.models.UsageData("hi!", "", localDateTime51);
        java.lang.String str53 = usageData52.getEquipmentId();
        java.time.LocalDateTime localDateTime54 = usageData52.getRecordedAt();
        sensor46.recordUsage(usageData52);
        sensor46.setSensorId("hi!");
        java.time.LocalDateTime localDateTime60 = null;
        main.models.UsageData usageData61 = new main.models.UsageData("", "hi!", localDateTime60);
        sensor46.notifyObservers(usageData61);
        main.enums.SensorStatus sensorStatus64 = null;
        main.models.Sensor sensor65 = new main.models.Sensor("hi!", sensorStatus64);
        main.models.UsageLogger usageLogger66 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList67 = usageLogger66.getRecords();
        sensor65.attach((main.models.Observer) usageLogger66);
        java.time.LocalDateTime localDateTime71 = null;
        main.models.UsageData usageData72 = new main.models.UsageData("hi!", "", localDateTime71);
        java.lang.String str73 = usageData72.getEquipmentId();
        usageLogger66.update(usageData72);
        java.time.LocalDateTime localDateTime77 = null;
        main.models.UsageData usageData78 = new main.models.UsageData("hi!", "", localDateTime77);
        usageLogger66.update(usageData78);
        sensor46.detach((main.models.Observer) usageLogger66);
        main.enums.SensorStatus sensorStatus81 = sensor46.getStatus();
        main.enums.SensorStatus sensorStatus83 = null;
        main.models.Sensor sensor84 = new main.models.Sensor("hi!", sensorStatus83);
        main.models.SystemAlert systemAlert85 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList86 = systemAlert85.getMessages();
        java.time.LocalDateTime localDateTime89 = null;
        main.models.UsageData usageData90 = new main.models.UsageData("", "hi!", localDateTime89);
        systemAlert85.update(usageData90);
        sensor84.notifyObservers(usageData90);
        sensor46.notifyObservers(usageData90);
        java.lang.String str94 = usageData90.getOperationStatus();
        sensor2.notifyObservers(usageData90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str94 + "' != '" + "hi!" + "'", str94.equals("hi!"));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test456");
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
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus23 = null;
        sensor2.setStatus(sensorStatus23);
        java.lang.String str25 = sensor2.getSensorId();
        sensor2.setSensorId("");
        java.time.LocalDateTime localDateTime28 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!" + "'", str25.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test457");
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
        java.util.List<main.models.Payment> paymentList67 = databaseProxy1.readPayments();
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
        org.junit.Assert.assertNotNull(paymentList67);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test458");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "hi!", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test459");
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
        java.util.List<main.models.User> userList11 = cSVDatabaseManager0.readUsers();
        java.util.List<main.models.Payment> paymentList12 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray14 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList15 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList15, equipmentArray14);
        cSVDatabaseManager13.writeEquipment((java.util.List<main.models.Equipment>) equipmentList15);
        main.models.Reservation[] reservationArray18 = new main.models.Reservation[] {};
        java.util.ArrayList<main.models.Reservation> reservationList19 = new java.util.ArrayList<main.models.Reservation>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Reservation>) reservationList19, reservationArray18);
        cSVDatabaseManager13.writeReservations((java.util.List<main.models.Reservation>) reservationList19);
        java.util.List<main.models.Equipment> equipmentList22 = cSVDatabaseManager13.readEquipment();
        main.models.DatabaseProxy databaseProxy23 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager13);
        java.util.List<main.models.Equipment> equipmentList24 = databaseProxy23.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager25 = main.models.CSVDatabaseManager.getInstance();
        java.util.List<main.models.Reservation> reservationList26 = cSVDatabaseManager25.readReservations();
        databaseProxy23.writeReservations(reservationList26);
        java.util.List<main.models.Equipment> equipmentList28 = databaseProxy23.readEquipment();
        java.util.List<main.models.Reservation> reservationList29 = databaseProxy23.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager30 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray31 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList32 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList32, equipmentArray31);
        cSVDatabaseManager30.writeEquipment((java.util.List<main.models.Equipment>) equipmentList32);
        main.models.CSVDatabaseManager cSVDatabaseManager35 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy36 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager35);
        main.models.Payment[] paymentArray37 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList38 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList38, paymentArray37);
        databaseProxy36.writePayments((java.util.List<main.models.Payment>) paymentList38);
        cSVDatabaseManager30.writePayments((java.util.List<main.models.Payment>) paymentList38);
        databaseProxy23.writePayments((java.util.List<main.models.Payment>) paymentList38);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList38);
        java.util.List<main.models.Payment> paymentList44 = cSVDatabaseManager0.readPayments();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList12);
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
        org.junit.Assert.assertNotNull(equipmentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList28);
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
        org.junit.Assert.assertNotNull(paymentArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList44);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test460");
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
        java.util.List<main.models.User> userList50 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList50);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test461");
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
        main.models.UsageLogger usageLogger65 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime68 = null;
        main.models.UsageData usageData69 = new main.models.UsageData("hi!", "", localDateTime68);
        usageLogger65.update(usageData69);
        main.enums.SensorStatus sensorStatus72 = null;
        main.models.Sensor sensor73 = new main.models.Sensor("hi!", sensorStatus72);
        sensor73.setSensorId("");
        java.time.LocalDateTime localDateTime78 = null;
        main.models.UsageData usageData79 = new main.models.UsageData("hi!", "", localDateTime78);
        java.lang.String str80 = usageData79.getEquipmentId();
        java.time.LocalDateTime localDateTime81 = usageData79.getRecordedAt();
        sensor73.recordUsage(usageData79);
        sensor73.setSensorId("hi!");
        java.time.LocalDateTime localDateTime87 = null;
        main.models.UsageData usageData88 = new main.models.UsageData("", "hi!", localDateTime87);
        sensor73.notifyObservers(usageData88);
        usageLogger65.update(usageData88);
        sensor2.detach((main.models.Observer) usageLogger65);
        java.time.LocalDateTime localDateTime92 = sensor2.getLastUpdateTime();
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
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "hi!" + "'", str80.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime92);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test462");
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
        java.util.List<main.models.User> userList10 = null;
        cSVDatabaseManager0.writeUsers(userList10);
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
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test463");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy1 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager0);
        java.util.List<main.models.User> userList2 = databaseProxy1.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager3 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy4 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager3);
        java.util.List<main.models.User> userList5 = databaseProxy4.readUsers();
        databaseProxy1.writeUsers(userList5);
        java.util.List<main.models.Equipment> equipmentList7 = databaseProxy1.readEquipment();
        java.util.List<main.models.User> userList8 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test464");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        java.util.List<main.models.User> userList5 = cSVDatabaseManager0.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager6 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy7 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager6);
        java.util.List<main.models.User> userList8 = databaseProxy7.readUsers();
        main.models.User[] userArray9 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList10 = new java.util.ArrayList<main.models.User>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList10, userArray9);
        databaseProxy7.writeUsers((java.util.List<main.models.User>) userList10);
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray14 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList15 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList15, equipmentArray14);
        cSVDatabaseManager13.writeEquipment((java.util.List<main.models.Equipment>) equipmentList15);
        main.models.Payment[] paymentArray18 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList19 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList19, paymentArray18);
        cSVDatabaseManager13.writePayments((java.util.List<main.models.Payment>) paymentList19);
        java.util.List<main.models.Payment> paymentList22 = cSVDatabaseManager13.readPayments();
        databaseProxy7.writePayments(paymentList22);
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
        java.util.List<main.models.User> userList56 = cSVDatabaseManager41.readUsers();
        cSVDatabaseManager24.writeUsers(userList56);
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
        cSVDatabaseManager24.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        databaseProxy7.writeReservations((java.util.List<main.models.Reservation>) reservationList79);
        main.models.DatabaseProxy databaseProxy86 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy7);
        java.util.List<main.models.Reservation> reservationList87 = databaseProxy86.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList87);
        java.util.List<main.models.Reservation> reservationList89 = null;
        cSVDatabaseManager0.writeReservations(reservationList89);
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
        org.junit.Assert.assertNotNull(userList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList22);
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
        org.junit.Assert.assertNotNull(userList56);
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
        org.junit.Assert.assertNotNull(reservationList87);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test465");
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
        sensor2.setSensorId("");
        java.lang.Class<?> wildcardClass31 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test466");
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
        java.time.LocalDateTime localDateTime24 = sensor4.getLastUpdateTime();
        main.models.UsageData usageData25 = new main.models.UsageData("hi!", "hi!", localDateTime24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test467");
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
        main.models.CSVDatabaseManager cSVDatabaseManager13 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy14 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager13);
        main.models.User[] userArray15 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList16 = new java.util.ArrayList<main.models.User>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList16, userArray15);
        cSVDatabaseManager13.writeUsers((java.util.List<main.models.User>) userList16);
        java.util.List<main.models.Payment> paymentList19 = cSVDatabaseManager13.readPayments();
        java.util.List<main.models.User> userList20 = cSVDatabaseManager13.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager21 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy22 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager21);
        java.util.List<main.models.User> userList23 = databaseProxy22.readUsers();
        main.models.User[] userArray24 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList25 = new java.util.ArrayList<main.models.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList25, userArray24);
        databaseProxy22.writeUsers((java.util.List<main.models.User>) userList25);
        main.models.CSVDatabaseManager cSVDatabaseManager28 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray29 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList30 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList30, equipmentArray29);
        cSVDatabaseManager28.writeEquipment((java.util.List<main.models.Equipment>) equipmentList30);
        main.models.Payment[] paymentArray33 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList34 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList34, paymentArray33);
        cSVDatabaseManager28.writePayments((java.util.List<main.models.Payment>) paymentList34);
        java.util.List<main.models.Payment> paymentList37 = cSVDatabaseManager28.readPayments();
        databaseProxy22.writePayments(paymentList37);
        java.util.List<main.models.Equipment> equipmentList39 = databaseProxy22.readEquipment();
        cSVDatabaseManager13.writeEquipment(equipmentList39);
        cSVDatabaseManager0.writeEquipment(equipmentList39);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList39);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test468");
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
        sensor2.setSensorId("hi!");
        main.enums.SensorStatus sensorStatus31 = null;
        main.models.Sensor sensor32 = new main.models.Sensor("hi!", sensorStatus31);
        java.time.LocalDateTime localDateTime35 = null;
        main.models.UsageData usageData36 = new main.models.UsageData("hi!", "", localDateTime35);
        java.lang.String str37 = usageData36.getEquipmentId();
        sensor32.notifyObservers(usageData36);
        main.enums.SensorStatus sensorStatus39 = sensor32.getStatus();
        main.enums.SensorStatus sensorStatus43 = null;
        main.models.Sensor sensor44 = new main.models.Sensor("hi!", sensorStatus43);
        sensor44.setSensorId("");
        sensor44.setSensorId("");
        java.time.LocalDateTime localDateTime49 = sensor44.getLastUpdateTime();
        main.models.UsageData usageData50 = new main.models.UsageData("", "hi!", localDateTime49);
        sensor32.setLastUpdateTime(localDateTime49);
        main.models.UsageData usageData52 = new main.models.UsageData("", "hi!", localDateTime49);
        main.models.UsageData usageData53 = new main.models.UsageData("", "hi!", localDateTime49);
        main.models.UsageData usageData54 = new main.models.UsageData("", "hi!", localDateTime49);
        sensor2.setLastUpdateTime(localDateTime49);
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
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!" + "'", str37.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime49);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test469");
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
        java.util.List<main.models.UsageData> usageDataList48 = usageLogger29.getRecords();
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
        org.junit.Assert.assertNotNull(usageDataList48);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test470");
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
        sensor2.setSensorId("hi!");
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
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test471");
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
        main.enums.SensorStatus sensorStatus67 = sensor2.getStatus();
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
        org.junit.Assert.assertNull(sensorStatus67);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test472");
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
        java.util.List<main.models.Payment> paymentList32 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager33 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
        main.models.User[] userArray35 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList36 = new java.util.ArrayList<main.models.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList36, userArray35);
        cSVDatabaseManager33.writeUsers((java.util.List<main.models.User>) userList36);
        java.util.List<main.models.Payment> paymentList39 = cSVDatabaseManager33.readPayments();
        java.util.List<main.models.User> userList40 = cSVDatabaseManager33.readUsers();
        main.models.CSVDatabaseManager cSVDatabaseManager41 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray42 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList43 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList43, equipmentArray42);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList43);
        main.models.Equipment[] equipmentArray46 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList47 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList47, equipmentArray46);
        cSVDatabaseManager41.writeEquipment((java.util.List<main.models.Equipment>) equipmentList47);
        java.util.List<main.models.Reservation> reservationList50 = cSVDatabaseManager41.readReservations();
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
        cSVDatabaseManager41.writeReservations((java.util.List<main.models.Reservation>) reservationList62);
        java.util.List<main.models.Equipment> equipmentList67 = cSVDatabaseManager41.readEquipment();
        java.util.List<main.models.Payment> paymentList68 = cSVDatabaseManager41.readPayments();
        cSVDatabaseManager33.writePayments(paymentList68);
        cSVDatabaseManager0.writePayments(paymentList68);
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
        org.junit.Assert.assertNotNull(paymentList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList40);
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
        org.junit.Assert.assertNotNull(reservationList50);
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
        org.junit.Assert.assertNotNull(equipmentList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList68);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test473");
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
        java.util.List<main.models.Equipment> equipmentList19 = databaseProxy1.readEquipment();
        java.util.List<main.models.Reservation> reservationList20 = databaseProxy1.readReservations();
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
        org.junit.Assert.assertNotNull(equipmentList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList20);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test474");
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
        java.time.LocalDateTime localDateTime16 = sensor2.getLastUpdateTime();
        main.enums.SensorStatus sensorStatus18 = null;
        main.models.Sensor sensor19 = new main.models.Sensor("hi!", sensorStatus18);
        java.time.LocalDateTime localDateTime22 = null;
        main.models.UsageData usageData23 = new main.models.UsageData("hi!", "", localDateTime22);
        java.lang.String str24 = usageData23.getEquipmentId();
        sensor19.notifyObservers(usageData23);
        main.enums.SensorStatus sensorStatus26 = sensor19.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("hi!", "", localDateTime29);
        java.lang.String str31 = usageData30.getEquipmentId();
        java.time.LocalDateTime localDateTime32 = usageData30.getRecordedAt();
        java.time.LocalDateTime localDateTime33 = usageData30.getRecordedAt();
        java.lang.String str34 = usageData30.getOperationStatus();
        sensor19.recordUsage(usageData30);
        sensor2.recordUsage(usageData30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test475");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        main.models.UsageLogger usageLogger2 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime5 = null;
        main.models.UsageData usageData6 = new main.models.UsageData("hi!", "", localDateTime5);
        usageLogger2.update(usageData6);
        java.lang.String str8 = usageData6.getEquipmentId();
        java.lang.String str9 = usageData6.getEquipmentId();
        systemAlert0.update(usageData6);
        java.util.List<java.lang.String> strList11 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test476");
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
        java.lang.String str19 = sensor2.getSensorId();
        main.enums.SensorStatus sensorStatus23 = null;
        main.models.Sensor sensor24 = new main.models.Sensor("hi!", sensorStatus23);
        sensor24.setSensorId("");
        java.time.LocalDateTime localDateTime29 = null;
        main.models.UsageData usageData30 = new main.models.UsageData("hi!", "", localDateTime29);
        java.lang.String str31 = usageData30.getEquipmentId();
        java.time.LocalDateTime localDateTime32 = usageData30.getRecordedAt();
        java.time.LocalDateTime localDateTime33 = usageData30.getRecordedAt();
        java.lang.String str34 = usageData30.getOperationStatus();
        sensor24.recordUsage(usageData30);
        main.enums.SensorStatus sensorStatus37 = null;
        main.models.Sensor sensor38 = new main.models.Sensor("hi!", sensorStatus37);
        main.models.UsageLogger usageLogger39 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList40 = usageLogger39.getRecords();
        sensor38.attach((main.models.Observer) usageLogger39);
        java.time.LocalDateTime localDateTime44 = null;
        main.models.UsageData usageData45 = new main.models.UsageData("hi!", "", localDateTime44);
        java.lang.String str46 = usageData45.getEquipmentId();
        usageLogger39.update(usageData45);
        main.enums.SensorStatus sensorStatus49 = null;
        main.models.Sensor sensor50 = new main.models.Sensor("hi!", sensorStatus49);
        java.time.LocalDateTime localDateTime53 = null;
        main.models.UsageData usageData54 = new main.models.UsageData("hi!", "", localDateTime53);
        java.lang.String str55 = usageData54.getEquipmentId();
        sensor50.notifyObservers(usageData54);
        usageLogger39.update(usageData54);
        sensor24.attach((main.models.Observer) usageLogger39);
        java.time.LocalDateTime localDateTime59 = sensor24.getLastUpdateTime();
        main.models.UsageData usageData60 = new main.models.UsageData("", "hi!", localDateTime59);
        sensor2.notifyObservers(usageData60);
        main.models.SystemAlert systemAlert62 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList63 = systemAlert62.getMessages();
        java.time.LocalDateTime localDateTime66 = null;
        main.models.UsageData usageData67 = new main.models.UsageData("", "hi!", localDateTime66);
        systemAlert62.update(usageData67);
        java.time.LocalDateTime localDateTime71 = null;
        main.models.UsageData usageData72 = new main.models.UsageData("hi!", "", localDateTime71);
        java.lang.String str73 = usageData72.getEquipmentId();
        java.time.LocalDateTime localDateTime74 = usageData72.getRecordedAt();
        java.time.LocalDateTime localDateTime75 = usageData72.getRecordedAt();
        systemAlert62.update(usageData72);
        sensor2.attach((main.models.Observer) systemAlert62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!" + "'", str31.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "hi!" + "'", str46.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!" + "'", str55.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "hi!" + "'", str73.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime75);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test477");
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
        java.lang.String str15 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test478");
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
        sensor2.setSensorId("");
        java.lang.String str34 = sensor2.getSensorId();
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
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "" + "'", str34.equals(""));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test479");
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
        java.util.List<main.models.Equipment> equipmentList81 = databaseProxy80.readEquipment();
        java.util.List<main.models.Reservation> reservationList82 = databaseProxy80.readReservations();
        java.util.List<main.models.User> userList83 = databaseProxy80.readUsers();
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
        org.junit.Assert.assertNotNull(equipmentList81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList83);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test480");
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
        main.models.UsageLogger usageLogger16 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime19 = null;
        main.models.UsageData usageData20 = new main.models.UsageData("hi!", "", localDateTime19);
        usageLogger16.update(usageData20);
        main.models.SystemAlert systemAlert22 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList23 = systemAlert22.getMessages();
        java.time.LocalDateTime localDateTime26 = null;
        main.models.UsageData usageData27 = new main.models.UsageData("", "hi!", localDateTime26);
        systemAlert22.update(usageData27);
        usageLogger16.update(usageData27);
        sensor2.detach((main.models.Observer) usageLogger16);
        main.enums.SensorStatus sensorStatus32 = null;
        main.models.Sensor sensor33 = new main.models.Sensor("hi!", sensorStatus32);
        sensor33.setSensorId("");
        main.enums.SensorStatus sensorStatus36 = sensor33.getStatus();
        main.models.UsageLogger usageLogger37 = new main.models.UsageLogger();
        java.time.LocalDateTime localDateTime40 = null;
        main.models.UsageData usageData41 = new main.models.UsageData("hi!", "", localDateTime40);
        usageLogger37.update(usageData41);
        java.util.List<main.models.UsageData> usageDataList43 = usageLogger37.getRecords();
        sensor33.detach((main.models.Observer) usageLogger37);
        main.enums.SensorStatus sensorStatus48 = null;
        main.models.Sensor sensor49 = new main.models.Sensor("hi!", sensorStatus48);
        sensor49.setSensorId("");
        sensor49.setSensorId("");
        java.time.LocalDateTime localDateTime54 = sensor49.getLastUpdateTime();
        main.models.UsageData usageData55 = new main.models.UsageData("hi!", "hi!", localDateTime54);
        sensor33.recordUsage(usageData55);
        sensor2.recordUsage(usageData55);
        java.lang.String str58 = sensor2.getSensorId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "hi!" + "'", str58.equals("hi!"));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test481");
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
        main.enums.SensorStatus sensorStatus34 = null;
        main.models.Sensor sensor35 = new main.models.Sensor("hi!", sensorStatus34);
        main.models.UsageLogger usageLogger36 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList37 = usageLogger36.getRecords();
        sensor35.attach((main.models.Observer) usageLogger36);
        java.time.LocalDateTime localDateTime41 = null;
        main.models.UsageData usageData42 = new main.models.UsageData("hi!", "", localDateTime41);
        java.lang.String str43 = usageData42.getEquipmentId();
        usageLogger36.update(usageData42);
        main.enums.SensorStatus sensorStatus46 = null;
        main.models.Sensor sensor47 = new main.models.Sensor("hi!", sensorStatus46);
        java.time.LocalDateTime localDateTime50 = null;
        main.models.UsageData usageData51 = new main.models.UsageData("hi!", "", localDateTime50);
        java.lang.String str52 = usageData51.getEquipmentId();
        sensor47.notifyObservers(usageData51);
        usageLogger36.update(usageData51);
        sensor21.attach((main.models.Observer) usageLogger36);
        java.time.LocalDateTime localDateTime56 = sensor21.getLastUpdateTime();
        main.models.UsageData usageData57 = new main.models.UsageData("", "hi!", localDateTime56);
        java.time.LocalDateTime localDateTime58 = usageData57.getRecordedAt();
        java.time.LocalDateTime localDateTime59 = usageData57.getRecordedAt();
        systemAlert0.update(usageData57);
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
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "" + "'", str31.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!" + "'", str43.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!" + "'", str52.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime59);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test482");
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
        java.time.LocalDateTime localDateTime14 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test483");
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
        java.util.List<java.lang.String> strList21 = systemAlert5.getMessages();
        java.time.LocalDateTime localDateTime24 = null;
        main.models.UsageData usageData25 = new main.models.UsageData("hi!", "", localDateTime24);
        java.time.LocalDateTime localDateTime26 = usageData25.getRecordedAt();
        java.lang.String str27 = usageData25.getOperationStatus();
        java.lang.String str28 = usageData25.getEquipmentId();
        systemAlert5.update(usageData25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "" + "'", str27.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test484");
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
        java.lang.String str32 = usageData29.getEquipmentId();
        java.lang.String str33 = usageData29.getOperationStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!" + "'", str32.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test485");
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
        main.models.User[] userArray14 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList15 = new java.util.ArrayList<main.models.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList15, userArray14);
        databaseProxy12.writeUsers((java.util.List<main.models.User>) userList15);
        main.models.CSVDatabaseManager cSVDatabaseManager18 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray19 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList20 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList20, equipmentArray19);
        cSVDatabaseManager18.writeEquipment((java.util.List<main.models.Equipment>) equipmentList20);
        main.models.Payment[] paymentArray23 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList24 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList24, paymentArray23);
        cSVDatabaseManager18.writePayments((java.util.List<main.models.Payment>) paymentList24);
        java.util.List<main.models.Payment> paymentList27 = cSVDatabaseManager18.readPayments();
        databaseProxy12.writePayments(paymentList27);
        java.util.List<main.models.Equipment> equipmentList29 = databaseProxy12.readEquipment();
        java.util.List<main.models.Equipment> equipmentList30 = databaseProxy12.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager31 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy32 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager31);
        main.models.Payment[] paymentArray33 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList34 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList34, paymentArray33);
        databaseProxy32.writePayments((java.util.List<main.models.Payment>) paymentList34);
        databaseProxy12.writePayments((java.util.List<main.models.Payment>) paymentList34);
        databaseProxy6.writePayments((java.util.List<main.models.Payment>) paymentList34);
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
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test486");
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
        java.util.List<main.models.Reservation> reservationList48 = cSVDatabaseManager0.readReservations();
        main.models.CSVDatabaseManager cSVDatabaseManager49 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray50 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList51 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList51, equipmentArray50);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList51);
        main.models.Equipment[] equipmentArray54 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList55 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList55, equipmentArray54);
        cSVDatabaseManager49.writeEquipment((java.util.List<main.models.Equipment>) equipmentList55);
        java.util.List<main.models.Reservation> reservationList58 = cSVDatabaseManager49.readReservations();
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
        cSVDatabaseManager49.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList70);
        main.models.CSVDatabaseManager cSVDatabaseManager76 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy77 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager76);
        main.models.User[] userArray78 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList79 = new java.util.ArrayList<main.models.User>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList79, userArray78);
        cSVDatabaseManager76.writeUsers((java.util.List<main.models.User>) userList79);
        java.util.List<main.models.Payment> paymentList82 = cSVDatabaseManager76.readPayments();
        java.util.List<main.models.Equipment> equipmentList83 = cSVDatabaseManager76.readEquipment();
        java.util.List<main.models.Reservation> reservationList84 = cSVDatabaseManager76.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList84);
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
        org.junit.Assert.assertNotNull(reservationList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList58);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList84);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test487");
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
        main.enums.SensorStatus sensorStatus29 = null;
        sensor2.setStatus(sensorStatus29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test488");
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
        main.enums.SensorStatus sensorStatus12 = null;
        sensor2.setStatus(sensorStatus12);
        java.time.LocalDateTime localDateTime16 = null;
        main.models.UsageData usageData17 = new main.models.UsageData("hi!", "", localDateTime16);
        java.lang.String str18 = usageData17.getEquipmentId();
        java.time.LocalDateTime localDateTime19 = usageData17.getRecordedAt();
        java.time.LocalDateTime localDateTime20 = usageData17.getRecordedAt();
        java.lang.String str21 = usageData17.getEquipmentId();
        sensor2.recordUsage(usageData17);
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
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test489");
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
        java.util.List<main.models.Equipment> equipmentList18 = cSVDatabaseManager0.readEquipment();
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
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test490");
        main.enums.SensorStatus sensorStatus1 = null;
        main.models.Sensor sensor2 = new main.models.Sensor("hi!", sensorStatus1);
        main.models.UsageLogger usageLogger3 = new main.models.UsageLogger();
        java.util.List<main.models.UsageData> usageDataList4 = usageLogger3.getRecords();
        sensor2.attach((main.models.Observer) usageLogger3);
        main.enums.SensorStatus sensorStatus6 = null;
        sensor2.setStatus(sensorStatus6);
        main.enums.SensorStatus sensorStatus8 = null;
        sensor2.setStatus(sensorStatus8);
        java.time.LocalDateTime localDateTime10 = sensor2.getLastUpdateTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test491");
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
        java.lang.String str55 = usageData51.getOperationStatus();
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
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test492");
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
        java.util.List<main.models.Payment> paymentList50 = databaseProxy1.readPayments();
        java.util.List<main.models.User> userList51 = databaseProxy1.readUsers();
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
        org.junit.Assert.assertNotNull(paymentList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test493");
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
        java.util.List<main.models.Reservation> reservationList36 = databaseProxy11.readReservations();
        java.util.List<main.models.Payment> paymentList37 = databaseProxy11.readPayments();
        cSVDatabaseManager0.writePayments(paymentList37);
        java.util.List<main.models.Payment> paymentList39 = cSVDatabaseManager0.readPayments();
        main.models.CSVDatabaseManager cSVDatabaseManager40 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray41 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList42 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList42, equipmentArray41);
        cSVDatabaseManager40.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList42);
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
        org.junit.Assert.assertNotNull(reservationList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test494");
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
        java.util.List<main.models.User> userList10 = databaseProxy9.readUsers();
        java.util.List<main.models.User> userList11 = databaseProxy9.readUsers();
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
        org.junit.Assert.assertNotNull(userList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test495");
        main.models.CSVDatabaseManager cSVDatabaseManager0 = main.models.CSVDatabaseManager.getInstance();
        main.models.Equipment[] equipmentArray1 = new main.models.Equipment[] {};
        java.util.ArrayList<main.models.Equipment> equipmentList2 = new java.util.ArrayList<main.models.Equipment>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<main.models.Equipment>) equipmentList2, equipmentArray1);
        cSVDatabaseManager0.writeEquipment((java.util.List<main.models.Equipment>) equipmentList2);
        main.models.Payment[] paymentArray5 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList6 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList6, paymentArray5);
        cSVDatabaseManager0.writePayments((java.util.List<main.models.Payment>) paymentList6);
        main.models.CSVDatabaseManager cSVDatabaseManager9 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy10 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager9);
        java.util.List<main.models.User> userList11 = databaseProxy10.readUsers();
        java.util.List<main.models.Reservation> reservationList12 = databaseProxy10.readReservations();
        cSVDatabaseManager0.writeReservations(reservationList12);
        java.util.List<main.models.Equipment> equipmentList14 = cSVDatabaseManager0.readEquipment();
        main.models.CSVDatabaseManager cSVDatabaseManager15 = main.models.CSVDatabaseManager.getInstance();
        main.models.DatabaseProxy databaseProxy16 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager15);
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
        databaseProxy16.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
        cSVDatabaseManager0.writeReservations((java.util.List<main.models.Reservation>) reservationList30);
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
        org.junit.Assert.assertNotNull(cSVDatabaseManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reservationList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cSVDatabaseManager15);
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
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test496");
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
        main.models.DatabaseProxy databaseProxy34 = new main.models.DatabaseProxy((main.models.DatabaseManager) cSVDatabaseManager33);
        main.models.Payment[] paymentArray35 = new main.models.Payment[] {};
        java.util.ArrayList<main.models.Payment> paymentList36 = new java.util.ArrayList<main.models.Payment>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<main.models.Payment>) paymentList36, paymentArray35);
        databaseProxy34.writePayments((java.util.List<main.models.Payment>) paymentList36);
        main.models.DatabaseProxy databaseProxy39 = new main.models.DatabaseProxy((main.models.DatabaseManager) databaseProxy34);
        main.models.User[] userArray40 = new main.models.User[] {};
        java.util.ArrayList<main.models.User> userList41 = new java.util.ArrayList<main.models.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<main.models.User>) userList41, userArray40);
        databaseProxy39.writeUsers((java.util.List<main.models.User>) userList41);
        databaseProxy1.writeUsers((java.util.List<main.models.User>) userList41);
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
        org.junit.Assert.assertNotNull(paymentArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test497");
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
        main.enums.SensorStatus sensorStatus35 = sensor2.getStatus();
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
        org.junit.Assert.assertNull(sensorStatus35);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test498");
        main.models.SystemAlert systemAlert0 = new main.models.SystemAlert();
        java.util.List<java.lang.String> strList1 = systemAlert0.getMessages();
        java.time.LocalDateTime localDateTime4 = null;
        main.models.UsageData usageData5 = new main.models.UsageData("", "hi!", localDateTime4);
        systemAlert0.update(usageData5);
        main.models.UsageData usageData7 = null;
        systemAlert0.update(usageData7);
        main.enums.SensorStatus sensorStatus10 = null;
        main.models.Sensor sensor11 = new main.models.Sensor("hi!", sensorStatus10);
        java.time.LocalDateTime localDateTime14 = null;
        main.models.UsageData usageData15 = new main.models.UsageData("hi!", "", localDateTime14);
        java.lang.String str16 = usageData15.getEquipmentId();
        sensor11.notifyObservers(usageData15);
        java.time.LocalDateTime localDateTime20 = null;
        main.models.UsageData usageData21 = new main.models.UsageData("", "", localDateTime20);
        sensor11.notifyObservers(usageData21);
        java.lang.String str23 = usageData21.getEquipmentId();
        systemAlert0.update(usageData21);
        java.util.List<java.lang.String> strList25 = systemAlert0.getMessages();
        java.util.List<java.lang.String> strList26 = systemAlert0.getMessages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test499");
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
        java.lang.Class<?> wildcardClass26 = sensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(sensorStatus5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(usageDataList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test500");
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
        java.time.LocalDateTime localDateTime57 = sensor22.getLastUpdateTime();
        main.models.UsageData usageData58 = new main.models.UsageData("", "hi!", localDateTime57);
        java.time.LocalDateTime localDateTime59 = usageData58.getRecordedAt();
        main.models.UsageData usageData60 = new main.models.UsageData("hi!", "", localDateTime59);
        sensor2.setLastUpdateTime(localDateTime59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
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
        org.junit.Assert.assertNotNull(localDateTime57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime59);
    }
}

