package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;
import java.time.LocalDateTime;

public class UsageLoggerAITest {

    private UsageLogger logger;

    @Before
    public void setup() {
        logger = new UsageLogger();
    }

    @Test
    public void testUpdateAddsRecord() {
        logger.update(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(1, logger.getRecords().size());
    }

    @Test
    public void testUpdateNullIgnored() {
        logger.update(null);
        assertEquals(0, logger.getRecords().size());
    }

    @Test
    public void testMultipleUpdates() {
        logger.update(new UsageData("E1", "OK", LocalDateTime.now()));
        logger.update(new UsageData("E2", "FAIL", LocalDateTime.now()));
        assertEquals(2, logger.getRecords().size());
    }
}
