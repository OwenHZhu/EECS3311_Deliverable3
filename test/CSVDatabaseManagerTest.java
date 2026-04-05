
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.enums.EquipmentStatus;
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

    // 1. Singleton instance
    @Test
    public void getInstance_returnsSameInstance() {
        CSVDatabaseManager another = CSVDatabaseManager.getInstance();
        assertSame(manager, another);
    }

    // 2. Write null users clears the list
    @Test
    public void writeUsers_nullClearsUsers() {
        manager.writeUsers(List.of(new Student("s1@yorku.ca", "Pass123!")));
        manager.writeUsers(null);
        assertTrue(manager.readUsers().isEmpty());
    }
    
    // 3. Write then read users
    @Test
    public void writeUsers_savesAndReadsUsers() {
        List<User> users = List.of(new Student("s1@yorku.ca", "Pass123!"));
        manager.writeUsers(users);
        List<User> retrieved = manager.readUsers();
        assertEquals(1, retrieved.size());
        assertEquals("s1@yorku.ca", retrieved.get(0).getEmail());
    }

    // 4. Write then read equipment
    @Test
    public void writeEquipment_savesAndReadsEquipment() {
        Equipment e = new Equipment("E01", "Microscope", "Lab A", EquipmentStatus.Available);
        manager.writeEquipment(List.of(e));
        List<Equipment> list = manager.readEquipment();
        assertEquals(1, list.size());
        assertEquals("E01", list.get(0).getEquipmentId());
    }

    // 5. Write null equipment clears
    @Test
    public void writeEquipment_nullClears() {
        manager.writeEquipment(List.of(new Equipment("E01", "", "", EquipmentStatus.Available)));
        manager.writeEquipment(null);
        assertTrue(manager.readEquipment().isEmpty());
    }
    
    // 6. Read users initially empty
    @Test
    public void readUsers_initiallyEmpty() {
        assertTrue(manager.readUsers().isEmpty());
    }

    // 7. Write then read reservations
    @Test
    public void writeReservations_savesAndReads() {
        Reservation r = new Reservation("R1", "user1", "E01", 2);
        manager.writeReservations(List.of(r));
        assertEquals(1, manager.readReservations().size());
    }

    // 8. Write null reservations clears
    @Test
    public void writeReservations_nullClears() {
        manager.writeReservations(List.of(new Reservation("R1", "u", "e", 1)));
        manager.writeReservations(null);
        assertTrue(manager.readReservations().isEmpty());
    }

    // 9. Write then read payments
    @Test
    public void writePayments_savesAndReads() {
        Payment p = new Payment("P1", 100.0, "Credit");
        manager.writePayments(List.of(p));
        assertEquals(1, manager.readPayments().size());
    }

    // 10. Write null payments clears
    @Test
    public void writePayments_nullClears() {
        manager.writePayments(List.of(new Payment("P1", 50.0, "Debit")));
        manager.writePayments(null);
        assertTrue(manager.readPayments().isEmpty());
    }

    // 11. Data isolation (writing users does not affect equipment)
    @Test
    public void writeUsers_doesNotAffectEquipment() {
        manager.writeUsers(List.of(new Student("s1@yorku.ca", "Pass123!")));
        assertTrue(manager.readEquipment().isEmpty());
    }
    
    // 12. Read returns defensive copy
    @Test
    public void readUsers_returnsCopy() throws Exception {
        List<User> original = List.of(new Student("s1@yorku.ca", "Pass123!"));
        manager.writeUsers(original);
        List<User> retrieved = manager.readUsers();
        retrieved.clear();   // should not affect internal state
        assertEquals(1, manager.readUsers().size());
    }

    private void resetSingleton() throws Exception {
        Field instance = CSVDatabaseManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }
}
