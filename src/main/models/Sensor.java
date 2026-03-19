package main.models;

import main.enums.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private String sensorId;
    private SensorStatus status;
    private LocalDateTime lastUpdateTime;
    private final List<Observer> observers = new ArrayList<>();

    public Sensor(String sensorId, SensorStatus status) {
        this.sensorId = sensorId;
        this.status = status;
        this.lastUpdateTime = LocalDateTime.now();
    }

    public void attach(Observer observer) {
        if (observer == null) {
            throw new IllegalArgumentException("Observer cannot be null.");
        }
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void recordUsage(UsageData usageData) {
        this.lastUpdateTime = LocalDateTime.now();
        notifyObservers(usageData);
    }

    public void notifyObservers(UsageData usageData) {
        for (Observer o : observers) {
            o.update(usageData);
        }
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
