package ai_assistant;

import main.models.*;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class SystemAlertAITest {

    private SystemAlert alert;

    @BeforeEach
    void setup() {
        alert = new SystemAlert();
    }

    @Test
    void testUpdateAddsMessage() {
        alert.update(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(1, alert.getMessages().size());
    }

    @Test
    void testUpdateNullIgnored() {
        alert.update(null);
        assertTrue(alert.getMessages().isEmpty());
    }

    @Test
    void testMessageContent() {
        alert.update(new UsageData("E1", "FAIL", LocalDateTime.now()));
        assertTrue(alert.getMessages().get(0).contains("E1"));
    }
}
