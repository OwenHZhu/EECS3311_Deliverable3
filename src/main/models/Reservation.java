package main.models;

import main.enums.*;
import java.time.Duration;
import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ReservationStatus status;
    private double depositAmount;
    private Equipment equipment;
    private User user;

    public Reservation(String reservationId,
                       LocalDateTime startTime,
                       LocalDateTime endTime,
                       ReservationStatus status,
                       double depositAmount,
                       Equipment equipment,
                       User user) {
        this.reservationId = reservationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.depositAmount = depositAmount;
        this.equipment = equipment;
        this.user = user;
    }

    public void activate() {
        if (status != ReservationStatus.Active) {
            status = ReservationStatus.Active;
        }
    }

    public void modify(LocalDateTime newStartTime, LocalDateTime newEndTime, LocalDateTime now) {
        if (now.isAfter(startTime) || now.isEqual(startTime)) {
            throw new IllegalStateException("Cannot modify after reservation start time.");
        }
        if (newStartTime == null || newEndTime == null || !newEndTime.isAfter(newStartTime)) {
            throw new IllegalArgumentException("Invalid start or end time.");
        }
        this.startTime = newStartTime;
        this.endTime = newEndTime;
    }

    public void cancel(LocalDateTime now) {
        if (now.isAfter(startTime) || now.isEqual(startTime)) {
            throw new IllegalStateException("Cannot cancel after reservation start time.");
        }
        status = ReservationStatus.Cancelled;
    }

    public void extend(LocalDateTime newEndTime) {
        if (newEndTime == null || !newEndTime.isAfter(endTime)) {
            throw new IllegalArgumentException("New end time must be after current end time.");
        }
        this.endTime = newEndTime;
    }

    public double calculateCost(double hourlyRate, LocalDateTime actualEndTime) {
        if (status == ReservationStatus.NoShow) {
            return 0.0;
        }
        LocalDateTime effectiveEnd = actualEndTime != null && actualEndTime.isAfter(startTime)
                ? actualEndTime
                : endTime;
        if (!effectiveEnd.isAfter(startTime)) {
            return 0.0;
        }
        long minutes = Duration.between(startTime, effectiveEnd).toMinutes();
        double hours = minutes / 60.0;
        if (hours <= 0) {
            return 0.0;
        }
        double totalCost = hours * hourlyRate;
        if (totalCost <= depositAmount) {
            return 0.0;
        }
        return totalCost - depositAmount;
    }

    public void checkArrival(LocalDateTime arrivalTime) {
        if (arrivalTime == null) {
            status = ReservationStatus.NoShow;
            return;
        }
        LocalDateTime latestOnTime = startTime.plusMinutes(20);
        if (arrivalTime.isAfter(latestOnTime)) {
            status = ReservationStatus.NoShow;
        } else {
            status = ReservationStatus.Active;
        }
    }

    // Getters and Setters
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}