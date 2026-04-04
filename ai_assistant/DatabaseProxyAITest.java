package ai_assistant;

import main.models.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseProxyAITest {

    private DatabaseProxy proxy;

    @BeforeEach
    void setup() {
        proxy = new DatabaseProxy(CSVDatabaseManager.getInstance());
    }

    @Test
    void testConstructorNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DatabaseProxy(null);
        });
    }

    @Test
    void testReadUsersDelegation() {
        assertNotNull(proxy.readUsers());
    }

    @Test
    void testWriteUsersDelegation() {
        proxy.writeUsers(new ArrayList<>());
        assertEquals(0, proxy.readUsers().size());
    }

    @Test
    void testReadEquipmentDelegation() {
        assertNotNull(proxy.readEquipment());
    }

    @Test
    void testWriteEquipmentDelegation() {
        proxy.writeEquipment(new ArrayList<>());
        assertEquals(0, proxy.readEquipment().size());
    }

    @Test
    void testReservationsDelegation() {
        proxy.writeReservations(new ArrayList<>());
        assertEquals(0, proxy.readReservations().size());
    }

    @Test
    void testPaymentsDelegation() {
        proxy.writePayments(new ArrayList<>());
        assertEquals(0, proxy.readPayments().size());
    }
}
