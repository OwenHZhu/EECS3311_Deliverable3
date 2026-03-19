package main.models;

import java.time.LocalDateTime;

public class UsageData {
    private final String equipmentId;
    private final String operationStatus;
    private final LocalDateTime recordedAt;

    public UsageData(String equipmentId, String operationStatus, LocalDateTime recordedAt) {
        this.equipmentId = equipmentId;
        this.operationStatus = operationStatus;
        this.recordedAt = recordedAt;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }
}

