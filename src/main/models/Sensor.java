package main.models;

import main.enums.*;
import java.time.LocalDateTime;

public class Sensor {
    private String sensorId;
    private SensorStatus status;
    private LocalDateTime lastUpdateTime;

    public Sensor(String sensorId, SensorStatus status) {
        this.sensorId = sensorId;
        this.status = status;
        this.lastUpdateTime = LocalDateTime.now();
    }

    // Methods
    public void recordUsage() {
        this.lastUpdateTime = LocalDateTime.now();
    }

    public void sendUpdateToSystem() {
    }

    // Getters and Setters
    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public SensorStatus getStatus() {
        return status;
    }

    public void setStatus(SensorStatus status) {
        this.status = status;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}
