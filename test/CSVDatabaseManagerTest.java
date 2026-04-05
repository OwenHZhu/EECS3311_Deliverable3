package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
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
import main.models.Equipment;
import main.models.Payment;
import main.models.Reservation;
import main.models.Student;
import main.models.User;

public class CSVDatabaseManagerTest {

    private CSVDatabaseManager manager;

    @Before
    public void setUp() throws Exception {
        resetSingleton();
        manager = CSVDatabaseManager.getInstance();
    }

    // Test 1
    @Test
    public void getInstance_returnsSameInstance() {
        CSVDatabaseManager another = CSVDatabaseManager.getInstance();
        assertSame(manager, another);
    }

    // Test 2
    @Test
    public void writeUsers_nullClearsUsers() {
        Student student = new Student("u1", "Test User", "test@yorku.ca", "Pass123!", "S123", "CS", AccountStatus.Active);
        manager.writeUsers(Arrays.asList(student));
        manager.writeUsers(null);
        assertTrue(manager.readUsers().isEmpty());
    }
    
    // Test 3
    @Test
    public void writeUsers_savesAndReadsUsers() {
        Student student = new Student("u1", "Test User", "test@yorku.ca", "Pass123!", "S123", "CS", AccountStatus.Active);
        manager.writeUsers(Arrays.asList(student));
        List<User> retrieved = manager.readUsers();
        assertEquals(1, retrieved.size());
        assertEquals("test@yorku.ca", retrieved.get(0).getEmail());
    }

    // Test 4
    @Test
    public void writeEquipment_savesAndReadsEquipment() {
        Equipment e = new Equipment("Equip01", "Microscope", "Lab A", EquipmentStatus.Available);
        manager.writeEquipment(Arrays.asList(e));
        List<Equipment> list = manager.readEquipment();
        assertEquals(1, list.size());
        assertEquals("Equip01", list.get(0).getEquipmentId());
    }

    // Test 5
    @Test
    public void writeEquipment_nullClears() {
        Equipment e = new Equipment("Equip01", "", "", EquipmentStatus.Available);
        manager.writeEquipment(Arrays.asList(e));
        manager.writeEquipment(null);
        assertTrue(manager.readEquipment().isEmpty());
    }
    
    // Test 6
    @Test
    public void readUsers_initiallyEmpty() {
        assertTrue(manager.readUsers().isEmpty());
    }

    // Test 7
    @Test
    public void writeReservations_savesAndReads() {
        Equipment e = new Equipment("E01", "Scope", "Lab", EquipmentStatus.Available);
        Student u = new Student("u1", "Name", "email@yorku.ca", "Pass123!", "ID", "CS", AccountStatus.Active);
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1);
        Reservation r = new Reservation("Reserv1", start, end, ReservationStatus.Active, 10.0, e, u);
        manager.writeReservations(Arrays.asList(r));
        assertEquals(1, manager.readReservations().size());
    }

    // Test 8
    @Test
    public void writeReservations_nullClears() {
        Equipment e = new Equipment("E01", "Scope", "Lab", EquipmentStatus.Available);
        Student u = new Student("u1", "Name", "email@yorku.ca", "Pass123!", "ID", "CS", AccountStatus.Active);
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = start.plusHours(1);
        Reservation r = new Reservation("Reserv1", start, end, ReservationStatus.Active, 10.0, e, u);
        manager.writeReservations(Arrays.asList(r));
        manager.writeReservations(null);
        assertTrue(manager.readReservations().isEmpty());
    }

    // Test 9
    @Test
    public void writePayments_savesAndReads() {
        Payment p = new Payment("Pay1", 100.0, PaymentMethod.Credit);
        manager.writePayments(Arrays.asList(p));
        assertEquals(1, manager.readPayments().size());
    }

    // Test 10
    @Test
    public void writePayments_nullClears() {
        Payment p = new Payment("Pay1", 50.0, PaymentMethod.Debit);
        manager.writePayments(Arrays.asList(p));
        manager.writePayments(null);
        assertTrue(manager.readPayments().isEmpty());
    }

    // Test 11
    @Test
    public void writeUsers_doesNotAffectEquipment() {
        Student student = new Student("u1", "Test User", "test@yorku.ca", "Pass123!", "S123", "CS", AccountStatus.Active);
        manager.writeUsers(Arrays.asList(student));
        assertTrue(manager.readEquipment().isEmpty());
    }
    
    // Test 12
    @Test
    public void writeEquipment_doesNotAffectUsers() {
        Equipment e = new Equipment("Equip99", "Laser", "Lab C", EquipmentStatus.Available);
        manager.writeEquipment(Arrays.asList(e));
        assertTrue(manager.readUsers().isEmpty());
    }

    private void resetSingleton() throws Exception {
        Field instance = CSVDatabaseManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
}
