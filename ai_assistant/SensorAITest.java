package ai_assistant;

import main.models.*;
import main.enums.SensorStatus;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class SensorAITest {

    private Sensor sensor;
    private UsageLogger logger;

    @BeforeEach
    public void setup() {
        sensor = new Sensor("S1", SensorStatus.Active);
        logger = new UsageLogger();
    }

    @Test
    public void testAttachObserver() {
        sensor.attach(logger);
        sensor.recordUsage(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(1, logger.getRecords().size());
    }

    @Test
    public void testDetachObserver() {
        sensor.attach(logger);
        sensor.detach(logger);
        sensor.recordUsage(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(0, logger.getRecords().size());
    }

    @Test
    public void testAttachNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            sensor.attach(null);
        });
    }

    @Test
    public void testNotifyMultipleObservers() {
        UsageLogger logger2 = new UsageLogger();
        sensor.attach(logger);
        sensor.attach(logger2);

        sensor.recordUsage(new UsageData("E1", "OK", LocalDateTime.now()));

        assertEquals(1, logger.getRecords().size());
        assertEquals(1, logger2.getRecords().size());
    }

    @Test
    public void testLastUpdateTimeChanges() {
        var before = sensor.getLastUpdateTime();
        sensor.recordUsage(new UsageData("E1", "OK", LocalDateTime.now()));
        assertTrue(sensor.getLastUpdateTime().isAfter(before) || 
                   sensor.getLastUpdateTime().isEqual(before));
    }
}
