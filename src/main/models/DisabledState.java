package main.models;

public class DisabledState implements EquipmentState {
    @Override
    public void reserve(Equipment equipment) {
        throw new IllegalStateException("Equipment disabled.");
    }

    @Override
    public void enable(Equipment equipment) {
        equipment.setState(new AvailableState());
    }

    @Override
    public void disable(Equipment equipment) {
    }

    @Override
    public void markUnderMaintenance(Equipment equipment) {
        equipment.setState(new MaintenanceState());
    }
}

