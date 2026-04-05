package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;
import java.util.*;

public class DatabaseProxyAITest {

    private DatabaseProxy proxy;

    @BeforeEach
    public void setup() {
        proxy = new DatabaseProxy(CSVDatabaseManager.getInstance());
    }

    @Test
    public void testConstructorNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            new DatabaseProxy(null);
        });
    }

    @Test
    public void testReadUsersDelegation() {
        assertNotNull(proxy.readUsers());
    }

    @Test
    public void testWriteUsersDelegation() {
        proxy.writeUsers(new ArrayList<>());
        assertEquals(0, proxy.readUsers().size());
    }

    @Test
    public void testReadEquipmentDelegation() {
        assertNotNull(proxy.readEquipment());
    }

    @Test
    public void testWriteEquipmentDelegation() {
        proxy.writeEquipment(new ArrayList<>());
        assertEquals(0, proxy.readEquipment().size());
    }

    @Test
    public void testReservationsDelegation() {
        proxy.writeReservations(new ArrayList<>());
        assertEquals(0, proxy.readReservations().size());
    }

    @Test
    public void testPaymentsDelegation() {
        proxy.writePayments(new ArrayList<>());
        assertEquals(0, proxy.readPayments().size());
    }
}
