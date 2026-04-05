package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;

import java.time.LocalDateTime;

public class SystemAlertAITest {

    private SystemAlert alert;

    @Before
    public void setup() {
        alert = new SystemAlert();
    }

    @Test
    public void testUpdateAddsMessage() {
        alert.update(new UsageData("E1", "OK", LocalDateTime.now()));
        assertEquals(1, alert.getMessages().size());
    }

    @Test
    public void testUpdateNullIgnored() {
        alert.update(null);
        assertTrue(alert.getMessages().isEmpty());
    }

    @Test
    public void testMessageContent() {
        alert.update(new UsageData("E1", "FAIL", LocalDateTime.now()));
        assertTrue(alert.getMessages().get(0).contains("E1"));
    }
}
