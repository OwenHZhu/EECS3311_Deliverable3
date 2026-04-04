package ai_assistant;

import main.enums.SensorStatus;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SensorStatusAITest {

    @Test
    public void testEnumValuesExist() {
        SensorStatus[] values = SensorStatus.values();
        assertEquals(3, values.length);
    }

    @Test
    public void testEnumContainsActive() {
        assertEquals(SensorStatus.Active, SensorStatus.valueOf("Active"));
    }

    @Test
    public void testEnumContainsInactive() {
        assertEquals(SensorStatus.Inactive, SensorStatus.valueOf("Inactive"));
    }

    @Test
    public void testEnumContainsMaintenance() {
        assertEquals(SensorStatus.Maintenance, SensorStatus.valueOf("Maintenance"));
    }

    @Test
    public void testEnumToString() {
        assertEquals("Active", SensorStatus.Active.name());
    }

    @Test
    public void testEnumOrdinalValues() {
        assertEquals(0, SensorStatus.Active.ordinal());
        assertEquals(1, SensorStatus.Inactive.ordinal());
        assertEquals(2, SensorStatus.Maintenance.ordinal());
    }

    @Test
    public void testValueOfInvalidThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SensorStatus.valueOf("INVALID");
        });
    }

    @Test
    public void testEquality() {
        assertTrue(SensorStatus.Active == SensorStatus.Active);
    }
}
