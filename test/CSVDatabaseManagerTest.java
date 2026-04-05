package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import main.enums.EquipmentStatus;
import main.enums.PaymentMethod;
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
        manager.writeUsers(Arrays.asList(new Student("student1@yorku.ca", "Password123!")));
        manager.writeUsers(null);
        assertTrue(manager.readUsers().isEmpty());
    }
    
    // Test 3
    @Test
    public void writeUsers_savesAndReadsUsers() {
        List<User> users = Arrays.asList(new Student("student1@yorku.ca", "Password123!"));
        manager.writeUsers(users);
        List<User> retrieved = manager.readUsers();
        assertEquals(1, retrieved.size());
        assertEquals("student1@yorku.ca", retrieved.get(0).getEmail());
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
        manager.writeEquipment(Arrays.asList(new Equipment("Equip01", "", "", EquipmentStatus.Available)));
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
        Reservation r = new Reservation("Reserv1", "user1", "Equip01", 2);
        manager.writeReservations(Arrays.asList(r));
        assertEquals(1, manager.readReservations().size());
    }

    // Test 8
    @Test
    public void writeReservations_nullClears() {
        manager.writeReservations(Arrays.asList(new Reservation("Reserv1", "u", "e", 1)));
        manager.writeReservations(null);
        assertTrue(manager.readReservations().isEmpty());
    }

    // Test 9
    @Test
    public void writePayments_savesAndReads() {
        Payment p = new Payment("Pay1", 100.0, PaymentMethod.CREDIT);
        manager.writePayments(Arrays.asList(p));
        assertEquals(1, manager.readPayments().size());
    }

    // Test 10
    @Test
    public void writePayments_nullClears() {
        manager.writePayments(Arrays.asList(new Payment("Pay1", 50.0, PaymentMethod.DEBIT)));
        manager.writePayments(null);
        assertTrue(manager.readPayments().isEmpty());
    }

    // Test 11
    @Test
    public void writeUsers_doesNotAffectEquipment() {
        manager.writeUsers(Arrays.asList(new Student("student1@yorku.ca", "Password123!")));
        assertTrue(manager.readEquipment().isEmpty());
    }
    
    // Test 12
    @Test
    public void readUsers_returnsDefensiveCopy() {
        List<User> original = Arrays.asList(new Student("student1@yorku.ca", "Password123!"));
        manager.writeUsers(original);
        List<User> retrieved = manager.readUsers();
        retrieved.clear();
        assertEquals(1, manager.readUsers().size());
    }

    private void resetSingleton() throws Exception {
        Field instance = CSVDatabaseManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
}
