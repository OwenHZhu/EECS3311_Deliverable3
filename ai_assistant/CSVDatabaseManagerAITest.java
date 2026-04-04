package ai_assistant;

import main.models.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class CSVDatabaseManagerAITest {

    private CSVDatabaseManager db;

    @BeforeEach
    void setup() {
        db = CSVDatabaseManager.getInstance();
        db.writeUsers(new ArrayList<>());
        db.writeEquipment(new ArrayList<>());
        db.writeReservations(new ArrayList<>());
        db.writePayments(new ArrayList<>());
    }

    @Test
    void testSingletonInstance() {
        CSVDatabaseManager db2 = CSVDatabaseManager.getInstance();
        assertSame(db, db2);
    }

    @Test
    void testReadUsersEmpty() {
        assertTrue(db.readUsers().isEmpty());
    }

    @Test
    void testWriteUsers() {
        List<User> users = new ArrayList<>();
        db.writeUsers(users);
        assertEquals(0, db.readUsers().size());
    }

    @Test
    void testWriteUsersNull() {
        db.writeUsers(null);
        assertTrue(db.readUsers().isEmpty());
    }

    @Test
    void testReadEquipmentEmpty() {
        assertTrue(db.readEquipment().isEmpty());
    }

    @Test
    void testWriteEquipmentNull() {
        db.writeEquipment(null);
        assertTrue(db.readEquipment().isEmpty());
    }

    @Test
    void testReservationsWriteAndRead() {
        db.writeReservations(new ArrayList<>());
        assertEquals(0, db.readReservations().size());
    }

    @Test
    void testPaymentsWriteAndRead() {
        db.writePayments(new ArrayList<>());
        assertEquals(0, db.readPayments().size());
    }
}
