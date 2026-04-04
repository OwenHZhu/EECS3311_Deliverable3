package ai_assistant;

import main.models.*;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class UsageLoggerAITest {

    private UsageLogger logger;

    @BeforeEach
    void setup() {
        logger = new UsageLogger();
    }

    @Test
    void testUpdateAddsRecord() {
        logger.update(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(1, logger.getRecords().size());
    }

    @Test
    void testUpdateNullIgnored() {
        logger.update(null);
        assertEquals(0, logger.getRecords().size());
    }

    @Test
    void testMultipleUpdates() {
        logger.update(new UsageData("E1", "OK", LocalDateTime.now()));
        logger.update(new UsageData("E2", "FAIL", LocalDateTime.now()));
        assertEquals(2, logger.getRecords().size());
    }
}
