package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.enums.PaymentMethod;
import main.enums.ReservationStatus;
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
        User user = new Student("u1", "Alice", "alice@yorku.ca", "Pass@123", "S1", "CS", AccountStatus.Active);
        realManager.writeUsers(List.of(user));
        assertEquals(1, proxy.readUsers().size());
    }

    // Test 2
    @Test
    public void writeUsers_delegatesToReal() {
        User user = new Student("u2", "Bob", "bob@yorku.ca", "Strong@456", "S2", "Math", AccountStatus.PendingApproval);
        proxy.writeUsers(List.of(user));
        assertEquals(1, realManager.readUsers().size());
        assertEquals("bob@yorku.ca", realManager.readUsers().get(0).getEmail());
    }


    // Test 3
    @Test
    public void readReservations_delegates() {
        LocalDateTime start = LocalDateTime.of(2026, 4, 5, 10, 0);
        Reservation r = new Reservation("R101", start, start.plusHours(1), ReservationStatus.Active, 10.0, null, null);
        realManager.writeReservations(List.of(r));
        assertEquals(1, proxy.readReservations().size());
    }
 
    // Test 4
    @Test
    public void writeReservations_delegates() {
        LocalDateTime start = LocalDateTime.now();
        Reservation r = new Reservation("R102", start, start.plusHours(2), ReservationStatus.Active, 20.0, null, null);
        proxy.writeReservations(List.of(r));
        assertEquals(1, realManager.readReservations().size());
        assertEquals("R102", realManager.readReservations().get(0).getReservationId());
    }
 
    // Test 5
    @Test(expected = IllegalArgumentException.class)
    public void constructor_nullManager_throwsException() {
        new DatabaseProxy(null);
    }

    // Test 6
    @Test
    public void readEquipment_delegates() {
        Equipment e = new Equipment("E01", "Microscope", "Lab A", EquipmentStatus.Available);
        realManager.writeEquipment(List.of(e));
        assertEquals(1, proxy.readEquipment().size());
    }
 
    // Test 7
    @Test
    public void writeEquipment_delegates() {
        Equipment e = new Equipment("E02", "Centrifuge", "Lab B", EquipmentStatus.Available);
        proxy.writeEquipment(List.of(e));
        assertEquals(1, realManager.readEquipment().size());
        assertEquals("E02", realManager.readEquipment().get(0).getEquipmentId());
    }
 
    // Test 8
    @Test
    public void readPayments_delegates() {
        Payment p = new Payment("P001", 200.0, PaymentMethod.Grant);
        realManager.writePayments(List.of(p));
        assertEquals(1, proxy.readPayments().size());
    }
 
    // Test 9
    @Test
    public void writePayments_delegates() {
        Payment p = new Payment("P002", 150.0, PaymentMethod.Institutional);
        proxy.writePayments(List.of(p));
        assertEquals(1, realManager.readPayments().size());
        assertEquals(150.0, realManager.readPayments().get(0).getAmount(), 0.001);
    }


    // Test 10
    @Test
    public void multipleOperations_workCorrectly() {
        User user = new Student("u3", "Charlie", "charlie@yorku.ca", "Pwd@789", "S3", "CS", AccountStatus.Active);
        proxy.writeUsers(List.of(user));
        Equipment e = new Equipment("E99", "Tester", "LabX", EquipmentStatus.Available);
        proxy.writeEquipment(List.of(e));
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
