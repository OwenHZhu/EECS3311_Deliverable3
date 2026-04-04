package ai_assistant;

import main.models.*;
import main.enums.EquipmentStatus;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class EquipmentAITest {

    private Equipment equipment;

    @BeforeEach
    void setup() {
        equipment = new Equipment("E1", "Microscope", "Lab", EquipmentStatus.Available);
    }

    @Test
    void testInitialAvailable() {
        assertTrue(equipment.isAvailable());
    }

    @Test
    void testUpdateMaintenance() {
        equipment.update(new UsageData("E1", "MAINTENANCE", LocalDateTime.now()));
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    void testUpdateDifferentIdIgnored() {
        equipment.update(new UsageData("E2", "MAINTENANCE", LocalDateTime.now()));
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    void testUpdateNullIgnored() {
        equipment.update(null);
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    void testAddSensor() {
        Sensor s = new Sensor("S1", main.enums.SensorStatus.Active);
        equipment.addSensor(s);
        assertEquals(1, equipment.getSensors().size());
    }

    @Test
    void testSetStateNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            equipment.setState(null);
        });
    }
}
