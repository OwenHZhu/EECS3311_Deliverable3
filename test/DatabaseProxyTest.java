package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import main.enums.EquipmentStatus;
import main.models.CSVDatabaseManager;
import main.models.DatabaseProxy;
import main.models.Equipment;
import main.models.Payment;
import main.models.Reservation;
import main.models.Student;
import main.models.User;

public class DatabaseProxyTest {

    private DatabaseProxy proxy;
    private CSVDatabaseManager realManager;

    @Before
    public void setUp() throws Exception {
        resetSingleton();
        realManager = CSVDatabaseManager.getInstance();
        proxy = new DatabaseProxy(realManager);
    }

    // Test 1
    @Test
    public void readUsers_delegatesToReal() {
        realManager.writeUsers(List.of(new Student("student1@yorku.ca", "Password123!")));
        assertEquals(1, proxy.readUsers().size());
    }

    // Test 2
    @Test
    public void writeUsers_delegatesToReal() {
        List<User> users = List.of(new Student("student2@yorku.ca", "Password456!"));
        proxy.writeUsers(users);
        assertEquals(1, realManager.readUsers().size());
        assertEquals("student2@yorku.ca", realManager.readUsers().get(0).getEmail());
    }

    // Test 3
    @Test
    public void readReservations_delegates() {
        Reservation r = new Reservation("Reserv1", "u1", "e1", 3);
        realManager.writeReservations(List.of(r));
        assertEquals(1, proxy.readReservations().size());
    }

    // Test 4
    @Test
    public void writeReservations_delegates() {
        Reservation r = new Reservation("Reserv2", "u2", "e2", 1);
        proxy.writeReservations(List.of(r));
        assertEquals(1, realManager.readReservations().size());
    }
    
    // Test 5
    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullManager_throwsException() {
        new DatabaseProxy(null);
    }
    
    // Test 6
    @Test
    public void readEquipment_delegates() {
        Equipment e = new Equipment("Equip01", "Scope", "Lab1", EquipmentStatus.Available);
        realManager.writeEquipment(List.of(e));
        assertEquals(1, proxy.readEquipment().size());
    }

    // Test 7
    @Test
    public void writeEquipment_delegates() {
        Equipment e = new Equipment("Equip02", "Centrifuge", "Lab2", EquipmentStatus.Available);
        proxy.writeEquipment(List.of(e));
        assertEquals(1, realManager.readEquipment().size());
        assertEquals("Equip02", realManager.readEquipment().get(0).getEquipmentId());
    }

    // Test 8
    @Test
    public void readPayments_delegates() {
        Payment p = new Payment("Pay1", 200.0, "Grant");
        realManager.writePayments(List.of(p));
        assertEquals(1, proxy.readPayments().size());
    }

    // Test 9
    @Test
    public void writePayments_delegates() {
        Payment p = new Payment("Pay2", 150.0, "Institutional");
        proxy.writePayments(List.of(p));
        assertEquals(1, realManager.readPayments().size());
    }

    // Test 10
    @Test
    public void multipleOperations_workCorrectly() {
        proxy.writeUsers(List.of(new Student("student1@yorku.ca", "Pwd1!")));
        proxy.writeEquipment(List.of(new Equipment("Equip99", "Tester", "LabX", EquipmentStatus.Available)));
        assertEquals(1, proxy.readUsers().size());
        assertEquals(1, proxy.readEquipment().size());
        assertTrue(proxy.readReservations().isEmpty());
    }

    private void resetSingleton() throws Exception {
        Field instance = CSVDatabaseManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
}
