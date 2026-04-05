package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import main.models.UsageData;
import main.models.UsageLogger;

public class UsageLoggerTest {

    private UsageLogger logger;

    @Before
    public void setUp() {
        logger = new UsageLogger();
    }

    // Test 1
    @Test
    public void getRecords_initiallyEmpty() {
        assertTrue(logger.getRecords().isEmpty());
    }

  
    // Test 2
    @Test
    public void update_addsUsageData() {
        UsageData data = new UsageData("Equip01", "OK", LocalDateTime.now());
        logger.update(data);
        List<UsageData> records = logger.getRecords();
        assertEquals(1, records.size());
        assertSame(data, records.get(0));
    }

    // Test 3
    @Test
    public void update_null_ignores() {
        logger.update(null);
        assertTrue(logger.getRecords().isEmpty());
    }

    // Test 4
    @Test
    public void update_multiple_addsAll() {
        UsageData d1 = new UsageData("Equip01", "A", LocalDateTime.now());
        UsageData d2 = new UsageData("Equip02", "B", LocalDateTime.now());
        logger.update(d1);
        logger.update(d2);
        assertEquals(2, logger.getRecords().size());
    }

  
    // Test 5
    @Test
    public void getRecords_returnsCopy() {
        UsageData data = new UsageData("Equip01", "OK", LocalDateTime.now());
        logger.update(data);
        List<UsageData> retrieved = logger.getRecords();
        retrieved.clear();
        assertEquals(1, logger.getRecords().size());
    }

    // Test 6
    @Test
    public void records_maintainOrder() {
        UsageData first = new UsageData("Equip01", "First", LocalDateTime.now());
        UsageData second = new UsageData("Equip02", "Second", LocalDateTime.now());
        logger.update(first);
        logger.update(second);
        List<UsageData> records = logger.getRecords();
        assertSame(first, records.get(0));
        assertSame(second, records.get(1));
    }

    // Test 7
    @Test
    public void update_duplicateData_allowsMultiple() {
        UsageData data = new UsageData("Equip01", "DUPLICATE", LocalDateTime.now());
        logger.update(data);
        logger.update(data);
        assertEquals(2, logger.getRecords().size());
    }

    // Test 8
    @Test
    public void update_manyRecords_handles() {
        for (int i = 0; i < 100; i++) {
            logger.update(new UsageData("E" + i, "OP", LocalDateTime.now()));
        }
        assertEquals(100, logger.getRecords().size());
    }

    // Test 9
    @Test
    public void update_partialNullData_adds() {
        UsageData data = new UsageData(null, null, null);
        logger.update(data);
        assertEquals(1, logger.getRecords().size());
        assertNull(logger.getRecords().get(0).getEquipmentId());
    }

    // Test 10
    @Test
    public void getRecords_returnsNewListEachTime() {
        UsageData data = new UsageData("Equip01", "OK", LocalDateTime.now());
        logger.update(data);
        List<UsageData> list1 = logger.getRecords();
        List<UsageData> list2 = logger.getRecords();
        assertNotSame(list1, list2);
        assertEquals(list1, list2);
    }
}
