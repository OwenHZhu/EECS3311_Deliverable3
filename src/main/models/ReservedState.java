package main.models;

public class ReservedState implements EquipmentState {
    @Override
    public void reserve(Equipment equipment) {
        throw new IllegalStateException("Equipment already reserved.");
    }

    @Override
    public void enable(Equipment equipment) {
        equipment.setState(new AvailableState());
    }

    @Override
    public void disable(Equipment equipment) {
        equipment.setState(new DisabledState());
    }

    @Override
    public void markUnderMaintenance(Equipment equipment) {
        equipment.setState(new MaintenanceState());
    }
}

