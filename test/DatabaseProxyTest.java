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

    // 1. readUsers delegates
    @Test
    public void readUsers_delegatesToReal() {
        realManager.writeUsers(List.of(new Student("s1@yorku.ca", "Pass123!")));
        assertEquals(1, proxy.readUsers().size());
    }

    // 2. writeUsers delegates
    @Test
    public void writeUsers_delegatesToReal() {
        List<User> users = List.of(new Student("s2@yorku.ca", "Pass456!"));
        proxy.writeUsers(users);
        assertEquals(1, realManager.readUsers().size());
        assertEquals("s2@yorku.ca", realManager.readUsers().get(0).getEmail());
    }

    // 3. readReservations delegates
    @Test
    public void readReservations_delegates() {
        Reservation r = new Reservation("R1", "u1", "e1", 3);
        realManager.writeReservations(List.of(r));
        assertEquals(1, proxy.readReservations().size());
    }

    // 4. writeReservations delegates
    @Test
    public void writeReservations_delegates() {
        Reservation r = new Reservation("R2", "u2", "e2", 1);
        proxy.writeReservations(List.of(r));
        assertEquals(1, realManager.readReservations().size());
    }
    
    // 5. Constructor rejects null
    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullManager_throwsException() {
        new DatabaseProxy(null);
    }
    
    // 6. readEquipment delegates
    @Test
    public void readEquipment_delegates() {
        Equipment e = new Equipment("E01", "Scope", "Lab1", EquipmentStatus.Available);
        realManager.writeEquipment(List.of(e));
        assertEquals(1, proxy.readEquipment().size());
    }

    // 7. writeEquipment delegates
    @Test
    public void writeEquipment_delegates() {
        Equipment e = new Equipment("E02", "Centrifuge", "Lab2", EquipmentStatus.Available);
        proxy.writeEquipment(List.of(e));
        assertEquals(1, realManager.readEquipment().size());
        assertEquals("E02", realManager.readEquipment().get(0).getEquipmentId());
    }

    // 8. readPayments delegates
    @Test
    public void readPayments_delegates() {
        Payment p = new Payment("P1", 200.0, "Grant");
        realManager.writePayments(List.of(p));
        assertEquals(1, proxy.readPayments().size());
    }

    // 9. writePayments delegates
    @Test
    public void writePayments_delegates() {
        Payment p = new Payment("P2", 150.0, "Institutional");
        proxy.writePayments(List.of(p));
        assertEquals(1, realManager.readPayments().size());
    }

    // 10. Multiple operations work correctly
    @Test
    public void multipleOperations_workCorrectly() {
        proxy.writeUsers(List.of(new Student("s1@yorku.ca", "Pwd1!")));
        proxy.writeEquipment(List.of(new Equipment("E99", "Tester", "LabX", EquipmentStatus.Available)));
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
