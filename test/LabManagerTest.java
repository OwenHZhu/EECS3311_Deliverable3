package testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.models.Equipment;
import main.models.EquipmentState;
import main.models.LabManager;
import main.models.Student;

public class LabManagerTest {
	private LabManager labManager;
	private Equipment equipment;
	private String equipmentId;
    private String description;
    private String location;
    private EquipmentStatus status;
    @Before
    public void setUp() {
		equipmentId = "1000";
		description = "Oscilloscope";
		location = "Lassonde C";
		status = EquipmentStatus.Available;
		labManager = new LabManager();
        equipment = new Equipment(equipmentId, description, location, status);
    }
    
    @Test
    public void testAddEquipment() {
    	equipment = new Equipment("2000", "Microscope", "Lassonde B", EquipmentStatus.Available);
    	labManager.addEquipment(equipment);
    	assertTrue(equipment instanceof Equipment);
    }
    
    
    @Test
    public void testEnableEquipment() {
    	labManager.enableEquipment(equipment);
    	assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }
    
    @Test
    public void testDisableEquipment() {
    	labManager.disableEquipment(equipment);
    	assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyEquipmentEnable() {
    	labManager.disableEquipment(null);    
    }
    
    @Test
    public void testMarkEquipmentUnderMaintenance() {
    	labManager.markEquipmentUnderMaintenance(equipment);
    	assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testMaintenanceNull() {
    	labManager.markEquipmentUnderMaintenance(null);
    }
    
    @Test
    public void testGetManagedEquipment() {
    	labManager.addEquipment(equipment);
    	List<Equipment> list = labManager.getManagedEquipment();
    	assertEquals(1, list.size());
    	assertTrue(list.contains(equipment));
    }
}
