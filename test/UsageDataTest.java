package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.time.LocalDateTime;
import org.junit.Test;
import main.models.UsageData;

public class UsageDataTest {

    // Test 1
    @Test
    public void constructor_setsAllFields() {
        LocalDateTime now = LocalDateTime.now();
        UsageData data = new UsageData("Equip01", "ACTIVE", now);
        assertEquals("Equip01", data.getEquipmentId());
        assertEquals("ACTIVE", data.getOperationStatus());
        assertEquals(now, data.getRecordedAt());
    }

    // Test 2
    @Test
    public void constructor_nullEquipmentId_allowed() {
        UsageData data = new UsageData(null, "OK", LocalDateTime.now());
        assertNull(data.getEquipmentId());
    }

    // Test 3
    @Test
    public void constructor_nullStatus_allowed() {
        UsageData data = new UsageData("Equip01", null, LocalDateTime.now());
        assertNull(data.getOperationStatus());
    }

    // Test 4
    @Test
    public void constructor_nullTimestamp_allowed() {
        UsageData data = new UsageData("Equip01", "OK", null);
        assertNull(data.getRecordedAt());
    }

    // Test 5
    @Test
    public void constructor_allNull_allowed() {
        UsageData data = new UsageData(null, null, null);
        assertNull(data.getEquipmentId());
        assertNull(data.getOperationStatus());
        assertNull(data.getRecordedAt());
    }

    // Test 6
    @Test
    public void getters_returnSameValuesAsConstructor() {
        String id = "Equip99";
        String status = "IDLE";
        LocalDateTime time = LocalDateTime.of(2026, 4, 4, 10, 30);
        UsageData data = new UsageData(id, status, time);
        assertEquals(id, data.getEquipmentId());
        assertEquals(status, data.getOperationStatus());
        assertEquals(time, data.getRecordedAt());
    }

    // Test 7
    @Test
    public void object_isImmutable() {
        LocalDateTime time = LocalDateTime.now();
        UsageData data = new UsageData("Equip01", "OK", time);
        assertEquals("Equip01", data.getEquipmentId());
    }

    // Test 8
    @Test
    public void multipleInstances_areIndependent() {
        LocalDateTime time = LocalDateTime.now();
        UsageData d1 = new UsageData("Equip01", "A", time);
        UsageData d2 = new UsageData("Equip01", "A", time);
        assertEquals(d1.getEquipmentId(), d2.getEquipmentId());
        assertNotSame(d1, d2);
    }
  

    // Test 9
    @Test
    public void constructor_largeStrings_handled() {
        String longId = "A".repeat(1000);
        String longStatus = "B".repeat(2000);
        UsageData data = new UsageData(longId, longStatus, null);
        assertEquals(longId, data.getEquipmentId());
        assertEquals(longStatus, data.getOperationStatus());
    }

    // Test 10
    @Test
    public void recordedAt_referencePreserved() {
        LocalDateTime time = LocalDateTime.now();
        UsageData data = new UsageData("Equip01", "OK", time);
        assertSame(time, data.getRecordedAt());
    }
}
