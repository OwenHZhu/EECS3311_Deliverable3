package ai_assistant;

import main.models.*;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class UsageDataAITest {

    @Test
    void testGetters() {
        LocalDateTime now = LocalDateTime.now();
        UsageData data = new UsageData("E1", "OK", now);

        assertEquals("E1", data.getEquipmentId());
        assertEquals("OK", data.getOperationStatus());
        assertEquals(now, data.getRecordedAt());
    }
}
