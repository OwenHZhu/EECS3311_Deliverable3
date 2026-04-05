package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import main.models.SystemAlert;
import main.models.UsageData;

public class SystemAlertTest {

    private SystemAlert alert;

    @Before
    public void setUp() {
        alert = new SystemAlert();
    }

    // Test 1
    @Test
    public void getMessages_initiallyEmpty() {
        assertTrue(alert.getMessages().isEmpty());
    }

    // Test 2
    @Test
    public void update_addsMessage() {
        UsageData data = new UsageData("Equip01", "ERROR", LocalDateTime.now());
        alert.update(data);
        List<String> msgs = alert.getMessages();
        assertEquals(1, msgs.size());
        assertTrue(msgs.get(0).contains("Equip01") && msgs.get(0).contains("ERROR"));
    }

    // Test 3
    @Test
    public void update_null_ignores() {
        alert.update(null);
        assertTrue(alert.getMessages().isEmpty());
    }

    // Test 4
    @Test
    public void update_multiple_addsAll() {
        UsageData d1 = new UsageData("Equip01", "OVERHEAT", LocalDateTime.now());
        UsageData d2 = new UsageData("Equip02", "IDLE", LocalDateTime.now());
        alert.update(d1);
        alert.update(d2);
        assertEquals(2, alert.getMessages().size());
    }

    // Test 5
    @Test
    public void message_formatContainsIdAndStatus() {
        UsageData data = new UsageData("X99", "MAINTENANCE", LocalDateTime.now());
        alert.update(data);
        String msg = alert.getMessages().get(0);
        assertTrue(msg.contains("X99") && msg.contains("MAINTENANCE"));
    }

    // Test 6
    @Test
    public void getMessages_returnsCopy() {
        alert.update(new UsageData("Equip01", "WARN", LocalDateTime.now()));
        List<String> retrieved = alert.getMessages();
        retrieved.clear();
        assertEquals(1, alert.getMessages().size());
    }

    // Test 7
    @Test
    public void update_duplicateData_allowsMultiple() {
        UsageData data = new UsageData("Equip01", "ALERT", LocalDateTime.now());
        alert.update(data);
        alert.update(data);
        assertEquals(2, alert.getMessages().size());
    }

    // Test 8
    @Test
    public void update_differentEquipmentIds_separateMessages() {
        alert.update(new UsageData("Equip1", "OK", null));
        alert.update(new UsageData("Equip2", "FAIL", null));
        List<String> msgs = alert.getMessages();
        assertTrue(msgs.get(0).contains("Equip1"));
        assertTrue(msgs.get(1).contains("Equip2"));
    }

    // Test 9
    @Test
    public void update_nullOperationStatus_handles() {
        UsageData data = new UsageData("Equip01", null, LocalDateTime.now());
        alert.update(data);
        assertTrue(alert.getMessages().get(0).contains("null"));
    }

    // Test 10
    @Test
    public void update_manyMessages_handles() {
        for (int i = 0; i < 100; i++) {
            alert.update(new UsageData("E" + i, "STATUS", LocalDateTime.now()));
        }
        assertEquals(100, alert.getMessages().size());
    }
}

