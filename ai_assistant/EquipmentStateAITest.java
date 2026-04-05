package ai_assistant;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import main.models.*;
import main.enums.EquipmentStatus;

/**
 * AI-generated tests for the State Pattern.
 * Covers: AvailableState, ReservedState, DisabledState, MaintenanceState.
 */
public class EquipmentStateAITest {

    private Equipment equipment;

    @Before
    public void setup() {
        equipment = new Equipment("E1", "Oscilloscope", "Lab A", EquipmentStatus.Available);
    }

    // ── AvailableState ──────────────────────────────────────────────────────

    @Test
    public void testAvailableReserveTransitionsToReserved() {
        equipment.reserve();
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test
    public void testAvailableDisableTransitionsToDisabled() {
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void testAvailableMaintenanceTransitionsToMaintenance() {
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void testAvailableEnableIsNoOp() {
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
        assertTrue(equipment.isAvailable());
    }

    // ── ReservedState ───────────────────────────────────────────────────────

    @Test
    public void testReservedEnableTransitionsToAvailable() {
        equipment.reserve();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void testReservedDisableTransitionsToDisabled() {
        equipment.reserve();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void testReservedMaintenanceTransitionsToMaintenance() {
        equipment.reserve();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testReservedReserveThrows() {
        equipment.reserve();
        equipment.reserve();
    }

    // ── DisabledState ───────────────────────────────────────────────────────

    @Test
    public void testDisabledEnableTransitionsToAvailable() {
        equipment.disable();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void testDisabledMaintenanceTransitionsToMaintenance() {
        equipment.disable();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void testDisabledDisableIsNoOp() {
        equipment.disable();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testDisabledReserveThrows() {
        equipment.disable();
        equipment.reserve();
    }

    // ── MaintenanceState ────────────────────────────────────────────────────

    @Test
    public void testMaintenanceEnableTransitionsToAvailable() {
        equipment.markUnderMaintenance();
        equipment.enable();
        assertEquals(EquipmentStatus.Available, equipment.getStatus());
    }

    @Test
    public void testMaintenanceDisableTransitionsToDisabled() {
        equipment.markUnderMaintenance();
        equipment.disable();
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void testMaintenanceMaintenanceIsNoOp() {
        equipment.markUnderMaintenance();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testMaintenanceReserveThrows() {
        equipment.markUnderMaintenance();
        equipment.reserve();
    }

    // ── setState direct ─────────────────────────────────────────────────────

    @Test
    public void testSetStateReserved() {
        equipment.setState(new ReservedState());
        assertEquals(EquipmentStatus.Reserved, equipment.getStatus());
    }

    @Test
    public void testSetStateDisabled() {
        equipment.setState(new DisabledState());
        assertEquals(EquipmentStatus.Disabled, equipment.getStatus());
    }

    @Test
    public void testSetStateMaintenance() {
        equipment.setState(new MaintenanceState());
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }

    @Test
    public void testSetStateAvailableRestoresIsAvailable() {
        equipment.setState(new MaintenanceState());
        equipment.setState(new AvailableState());
        assertTrue(equipment.isAvailable());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateNullThrows() {
        equipment.setState(null);
    }

    // ── Full transition cycles ───────────────────────────────────────────────

    @Test
    public void testFullCycleAvailableToReservedToAvailable() {
        equipment.reserve();
        equipment.enable();
        assertTrue(equipment.isAvailable());
    }

    @Test
    public void testFullCycleAvailableToDisabledToMaintenance() {
        equipment.disable();
        equipment.markUnderMaintenance();
        assertEquals(EquipmentStatus.Maintenance, equipment.getStatus());
    }
}
