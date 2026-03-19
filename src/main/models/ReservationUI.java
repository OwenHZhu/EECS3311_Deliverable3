package main.models;

import main.enums.PaymentMethod;

import java.time.LocalDateTime;

public class ReservationUI {
    private final ReservationFacade facade;

    public ReservationUI() {
        this.facade = new ReservationFacade();
    }

    public ReservationFacade getFacade() {
        return facade;
    }

    public boolean reserve(String userId, String equipmentId, LocalDateTime start, LocalDateTime end, PaymentMethod method) {
        return facade.reserveReservation(userId, equipmentId, start, end, method);
    }
}

