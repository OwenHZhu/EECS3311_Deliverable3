package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;
import main.enums.EquipmentStatus;
import java.time.LocalDateTime;

public class EquipmentAITest {

    private Equipment equipment;

    @Before
    public void setup() {
        equipment = new Equipment("E1", "Microscope", "Lab", EquipmentStatus.Available);
    }

    @Test
    public void testInitialAvailable() {
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testUpdateMaintenance() {
        equipment.update(new UsageData("E1", "MAINTENANCE", LocalDateTime.now()));
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void testUpdateDifferentIdIgnored() {
        equipment.update(new UsageData("E2", "MAINTENANCE", LocalDateTime.now()));
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void testUpdateNullIgnored() {
        equipment.update(null);
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void testAddSensor() {
        Sensor s = new Sensor("S1", main.enums.SensorStatus.Active);
        equipment.addSensor(s);
        assertEquals(1, equipment.getSensors().size());
    }

    @Test
    public void testSetStateNullThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            equipment.setState(null);
        });
    }
}
