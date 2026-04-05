package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import main.enums.EquipmentStatus;
import main.models.AvailableState;
import main.models.DisabledState;
import main.models.Equipment;
import main.models.MaintenanceState;
import main.models.ReservedState;

public class EquipmentStateTest {

    private Equipment equipment;

    @Before
    public void setUp() {
        equipment = new Equipment("E1", "Microscope", "Lab A", EquipmentStatus.Available);
    }

    @Test
    public void availableState_reserve_transitionsToReserved() {
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test
    public void availableState_enable_remainsAvailable() {
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void availableState_disable_transitionsToDisabled() {
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void availableState_markUnderMaintenance_transitionsToMaintenance() {
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void reservedState_reserve_throwsIllegalState() {
        equipment.reserve();
        equipment.reserve();
    }

    @Test
    public void reservedState_enable_transitionsToAvailable() {
        equipment.reserve();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void reservedState_disable_transitionsToDisabled() {
        equipment.reserve();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void reservedState_markUnderMaintenance_transitionsToMaintenance() {
        equipment.reserve();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void reservedState_enableThenReserve_cyclesCorrectly() {
        equipment.reserve();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void disabledState_reserve_throwsIllegalState() {
        equipment.disable();
        equipment.reserve();
    }

    @Test
    public void disabledState_enable_transitionsToAvailable() {
        equipment.disable();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void disabledState_disable_remainsDisabled() {
        equipment.disable();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void disabledState_markUnderMaintenance_transitionsToMaintenance() {
        equipment.disable();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void disabledState_enableThenReserve_cyclesCorrectly() {
        equipment.disable();
        equipment.enable();
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void maintenanceState_reserve_throwsIllegalState() {
        equipment.markUnderMaintenance();
        equipment.reserve();
    }

    @Test
    public void maintenanceState_enable_transitionsToAvailable() {
        equipment.markUnderMaintenance();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void maintenanceState_disable_transitionsToDisabled() {
        equipment.markUnderMaintenance();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void maintenanceState_markUnderMaintenance_remainsMaintenance() {
        equipment.markUnderMaintenance();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void maintenanceState_enableThenReserve_cyclesCorrectly() {
        equipment.markUnderMaintenance();
        equipment.enable();
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test
    public void setState_reservedState_syncsStatusToReserved() {
        equipment.setState(new ReservedState());
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test
    public void setState_disabledState_syncsStatusToDisabled() {
        equipment.setState(new DisabledState());
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void setState_maintenanceState_syncsStatusToMaintenance() {
        equipment.setState(new MaintenanceState());
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void setState_availableState_fromMaintenance_restoresAvailability() {
        equipment.setState(new MaintenanceState());
        equipment.setState(new AvailableState());
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void fullCycle_availableReservedMaintenanceAvailable() {
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void fullCycle_availableDisabledMaintenanceAvailable() {
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }
}
