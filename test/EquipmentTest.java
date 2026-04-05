package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import main.enums.EquipmentStatus;
import main.enums.SensorStatus;
import main.models.AvailableState;
import main.models.Equipment;
import main.models.MaintenanceState;
import main.models.Sensor;
import main.models.UsageData;

public class EquipmentTest {

    private Equipment equipment;

    @Before
    public void setUp() {
        equipment = new Equipment("Equip001", "Microscope", "Lab A", EquipmentStatus.Available);
    }

    // Test 1
    @Test
    public void constructor_setsFields() {
        assertEquals("Equip001", equipment.getEquipmentId());
        assertEquals("Microscope", equipment.getDescription());
        assertEquals("Lab A", equipment.getLocation());
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    // Test 2
    @Test
    public void isAvailable_trueWhenAvailable() {
        assertTrue(equipment.isAvailable());
        equipment.reserve();
        assertFalse(equipment.isAvailable());
    }

    // Test 3
    @Test
    public void reserve_changesToReserved() {
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    // Test 4
    @Test
    public void disable_changesToDisabled() {
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
        assertFalse(equipment.isAvailable());
    }

    // Test 5
    @Test
    public void markUnderMaintenance_changesToMaintenance() {
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    // Test 6
    @Test
    public void enable_changesDisabledToAvailable() {
        equipment.disable();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    // Test 7
    @Test
    public void update_withMaintenanceStatus_setsMaintenanceState() {
        UsageData data = new UsageData("Equip001", "MAINTENANCE", null);
        equipment.update(data);
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    // Test 8
    @Test
    public void update_wrongEquipmentId_ignores() {
        UsageData data = new UsageData("WRONG_ID", "MAINTENANCE", null);
        equipment.update(data);
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    // Test 9
    @Test
    public void update_nullData_ignores() {
        equipment.update(null);
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    // Test 10
    @Test
    public void setState_changesStatusAccordingly() {
        equipment.setState(new MaintenanceState());
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
        equipment.setState(new AvailableState());
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    // Test 11
    @Test
    public void addSensor_addsToSensorsList() {
        Sensor sensor = new Sensor("Sen99", SensorStatus.Active);
        equipment.addSensor(sensor);
        assertTrue(equipment.getSensors().contains(sensor));
    }
    
    // Test 12
    @Test(expected = IllegalArgumentException.class)
    public void setState_null_throwsException() {
        equipment.setState(null);
    }   
  
}
