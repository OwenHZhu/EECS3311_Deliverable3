package ai_assistant;

import main.enums.SensorStatus;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class SensorStatusAITest {

    @Test
    void testEnumValuesExist() {
        SensorStatus[] values = SensorStatus.values();
        assertEquals(3, values.length);
    }

    @Test
    void testEnumContainsActive() {
        assertEquals(SensorStatus.Active, SensorStatus.valueOf("Active"));
    }

    @Test
    void testEnumContainsInactive() {
        assertEquals(SensorStatus.Inactive, SensorStatus.valueOf("Inactive"));
    }

    @Test
    void testEnumContainsMaintenance() {
        assertEquals(SensorStatus.Maintenance, SensorStatus.valueOf("Maintenance"));
    }

    @Test
    void testEnumToString() {
        assertEquals("Active", SensorStatus.Active.name());
    }

    @Test
    void testEnumOrdinalValues() {
        assertEquals(0, SensorStatus.Active.ordinal());
        assertEquals(1, SensorStatus.Inactive.ordinal());
        assertEquals(2, SensorStatus.Maintenance.ordinal());
    }

    @Test
    void testValueOfInvalidThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            SensorStatus.valueOf("INVALID");
        });
    }

    @Test
    void testEquality() {
        assertTrue(SensorStatus.Active == SensorStatus.Active);
    }
}
