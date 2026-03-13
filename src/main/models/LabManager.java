package main.models;

import main.enums.EquipmentStatus;
import java.util.ArrayList;
import java.util.List;

public class LabManager {
    private final List<Equipment> managedEquipment = new ArrayList<>();

    public void addEquipment(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment cannot be null.");
        }
        managedEquipment.add(equipment);
    }

    public void enableEquipment(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment cannot be null.");
        }
        equipment.enable();
    }

    public void disableEquipment(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment cannot be null.");
        }
        equipment.disable();
    }

    public void markEquipmentUnderMaintenance(Equipment equipment) {
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment cannot be null.");
        }
        equipment.markUnderMaintenance();
    }

    public List<Equipment> getManagedEquipment() {
        return new ArrayList<>(managedEquipment);
    }
}
