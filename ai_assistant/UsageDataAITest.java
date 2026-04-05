package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Test;
import main.models.*;
import java.time.LocalDateTime;

public class UsageDataAITest {

    @Test
    public void testGetters() {
        LocalDateTime now = LocalDateTime.now();
        UsageData data = new UsageData("E1", "OK", now);

        assertEquals("E1", data.getEquipmentId());
        assertEquals("OK", data.getOperationStatus());
        assertEquals(now, data.getRecordedAt());
    }
}
