package ai_assistant;

import main.enums.EquipmentStatus;
import main.models.Equipment;
import main.models.LabManager;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LabManagerAiTest {

    private LabManager labManager;
    private Equipment equipment;

    @Before
    public void setUp() {
        labManager = new LabManager();

        // Start with a valid initial state
        equipment = new Equipment("E1", "Microscope", "Lab A", EquipmentStatus.Available);
    }

    @Test
    public void testAddEquipment() {
        labManager.addEquipment(equipment);
        List<Equipment> list = labManager.getManagedEquipment();

        assertEquals(1, list.size());
        assertTrue(list.contains(equipment));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddEquipment_Null() {
        labManager.addEquipment(null);
    }

    @Test
    public void testEnableEquipment() {
        labManager.enableEquipment(equipment);

        // After enabling, status should be Available
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEnableEquipment_Null() {
        labManager.enableEquipment(null);
    }

    @Test
    public void testDisableEquipment() {
        labManager.disableEquipment(equipment);

        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDisableEquipment_Null() {
        labManager.disableEquipment(null);
    }

    @Test
    public void testMarkUnderMaintenance() {
        labManager.markEquipmentUnderMaintenance(equipment);

        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMarkUnderMaintenance_Null() {
        labManager.markEquipmentUnderMaintenance(null);
    }

    @Test
    public void testGetManagedEquipment_ReturnsCopy() {
        labManager.addEquipment(equipment);

        List<Equipment> list = labManager.getManagedEquipment();
        list.clear(); // modify returned list

        // original should remain unchanged
        assertEquals(1, labManager.getManagedEquipment().size());
    }
}