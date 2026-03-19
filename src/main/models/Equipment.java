package main.models;

import main.enums.EquipmentStatus;
import java.util.ArrayList;
import java.util.List;

public class Equipment implements Observer {
    private String equipmentId;
    private String description;
    private String location;
    private EquipmentStatus status;
    private EquipmentState state;
    private List<Sensor> sensors;

    public Equipment(String equipmentId, String description, String location, EquipmentStatus status) {
        this.equipmentId = equipmentId;
        this.description = description;
        this.location = location;
        setStatus(status);
        this.sensors = new ArrayList<>();
    }

    public void enable() {
        state.enable(this);
    }

    public void disable() {
        state.disable(this);
    }

    public void markUnderMaintenance() {
        state.markUnderMaintenance(this);
    }

    public boolean isAvailable() {
        return this.status == EquipmentStatus.Available;
    }

    public void reserve() {
        state.reserve(this);
    }

    public void setState(EquipmentState state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null.");
        }
        this.state = state;
        syncStatusFromState();
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
        this.state = switch (status) {
            case Available -> new AvailableState();
            case Reserved -> new ReservedState();
            case Disabled -> new DisabledState();
            case Maintenance -> new MaintenanceState();
        };
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

    private void syncStatusFromState() {
        if (state instanceof AvailableState) {
            status = EquipmentStatus.Available;
        } else if (state instanceof ReservedState) {
            status = EquipmentStatus.Reserved;
        } else if (state instanceof DisabledState) {
            status = EquipmentStatus.Disabled;
        } else if (state instanceof MaintenanceState) {
            status = EquipmentStatus.Maintenance;
        }
    }

    @Override
    public void update(UsageData usageData) {
        if (usageData == null) {
            return;
        }
        if (!equipmentId.equalsIgnoreCase(usageData.getEquipmentId())) {
            return;
        }
        if ("MAINTENANCE".equalsIgnoreCase(usageData.getOperationStatus())) {
            markUnderMaintenance();
        }
    }
}
