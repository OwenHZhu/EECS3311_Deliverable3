package main.models;

public interface EquipmentState {
    void reserve(Equipment equipment);
    void enable(Equipment equipment);
    void disable(Equipment equipment);
    void markUnderMaintenance(Equipment equipment);
}

