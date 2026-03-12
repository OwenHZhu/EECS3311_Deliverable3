package main.models;

import main.enums.*;
import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private String equipmentId;
    private String description;
    private String location;
    private EquipmentStatus status;
    private List<Sensor> sensors;

    public Equipment(String equipmentId, String description, String location, EquipmentStatus status) {
        this.equipmentId = equipmentId;
        this.description = description;
        this.location = location;
        this.status = status;
        this.sensors = new ArrayList<>();
    }

    // Methods
    public void enable() {
        this.status = EquipmentStatus.Available;
    }

    public void disable() {
        this.status = EquipmentStatus.Disabled;
    }

    public void markUnderMaintenance() {
        this.status = EquipmentStatus.Maintenance;
    }

    public boolean isAvailable(String timeSlot) {
        return this.status == EquipmentStatus.Available;
    }

    // Getters and Setters
    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public EquipmentStatus getStatus() {
        return status;
    }

    public void setStatus(EquipmentStatus status) {
        this.status = status;
    }

    public List<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }
}
