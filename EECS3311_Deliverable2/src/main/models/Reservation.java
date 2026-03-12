package main.models;

import main.enums.*;
import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private ReservationStatus status;
    private double depositAmount;
    private Equipment equipment;
    private User user;

    public Reservation(String reservationId, LocalDateTime startTime, LocalDateTime endTime,
                       ReservationStatus status, double depositAmount, Equipment equipment, User user) {
        this.reservationId = reservationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
        this.depositAmount = depositAmount;
        this.equipment = equipment;
        this.user = user;
    }

    // Methods
    public void create() {
        this.status = ReservationStatus.Active;
    }

    public void modify() {
    }

    public void cancel() {
        this.status = ReservationStatus.Cancelled;
    }

    public void extend() {
    }

    public double calculateCost() {
        return 0.0;
    }

    public void checkArrival() {
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