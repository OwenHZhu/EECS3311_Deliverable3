package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Arrays;
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
        Student s = new Student("u1", "Test", "test@yorku.ca", "Pass123!", "S123", "CS", AccountStatus.Active);
        realManager.writeUsers(Arrays.asList(s));
        assertEquals(1, proxy.readUsers().size());
    }

    // Test 2
    @Test
    public void readUsers_delegatesToReal() {
        Student s = new Student("u1", "Test", "test@yorku.ca", "Pass123!", "S123", "CS", AccountStatus.Active);
        realManager.writeUsers(Arrays.asList(s));
        assertEquals(1, proxy.readUsers().size());
    }

    // Test 3
    @Test
    public void readReservations_delegates() {
        Equipment e = new Equipment("E01", "Scope", "Lab", EquipmentStatus.Available);
        Student u = new Student("u1", "Name", "email@yorku.ca", "Pass123!", "ID", "CS", AccountStatus.Active);
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1);
        Reservation r = new Reservation("Reserv1", start, end, ReservationStatus.Active, 10.0, e, u);
        realManager.writeReservations(Arrays.asList(r));
        assertEquals(1, proxy.readReservations().size());
    }

    // Test 4
    @Test
    public void writeReservations_delegates() {
        Equipment e = new Equipment("E01", "Scope", "Lab", EquipmentStatus.Available);
        Student u = new Student("u1", "Name", "email@yorku.ca", "Pass123!", "ID", "CS", AccountStatus.Active);
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1);
        Reservation r = new Reservation("Reserv2", start, end, ReservationStatus.Active, 10.0, e, u);
        proxy.writeReservations(Arrays.asList(r));
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
        realManager.writeEquipment(Arrays.asList(e));
        assertEquals(1, proxy.readEquipment().size());
    }

    // Test 7
    @Test
    public void writeEquipment_delegates() {
        Equipment e = new Equipment("Equip02", "Centrifuge", "Lab2", EquipmentStatus.Available);
        proxy.writeEquipment(Arrays.asList(e));
        assertEquals(1, realManager.readEquipment().size());
        assertEquals("Equip02", realManager.readEquipment().get(0).getEquipmentId());
    }

    // Test 8
    @Test
    public void readPayments_delegates() {
        Payment p = new Payment("Pay1", 200.0, PaymentMethod.Grant);
        realManager.writePayments(Arrays.asList(p));
        assertEquals(1, proxy.readPayments().size());
    }

    // Test 9
    @Test
    public void writePayments_delegates() {
        Payment p = new Payment("Pay2", 150.0, PaymentMethod.Institutional);
        proxy.writePayments(Arrays.asList(p));
        assertEquals(1, realManager.readPayments().size());
    }

    // Test 10
    @Test
    public void multipleOperations_workCorrectly() {
        Student s = new Student("u1", "Test", "test@yorku.ca", "Pwd1!", "S123", "CS", AccountStatus.Active);
        proxy.writeUsers(Arrays.asList(s));
        Equipment e = new Equipment("Equip99", "Tester", "LabX", EquipmentStatus.Available);
        proxy.writeEquipment(Arrays.asList(e));
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
