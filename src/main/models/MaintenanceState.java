package main.models;

public class MaintenanceState implements EquipmentState {
    @Override
    public void reserve(Equipment equipment) {
        throw new IllegalStateException("Equipment under maintenance.");
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
    }
}

