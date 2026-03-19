package main.models;

public class AvailableState implements EquipmentState {
    @Override
    public void reserve(Equipment equipment) {
        equipment.setState(new ReservedState());
    }

    @Override
    public void enable(Equipment equipment) {
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

