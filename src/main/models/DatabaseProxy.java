package main.models;

import java.util.List;

public class DatabaseProxy implements DatabaseManager {
    private final DatabaseManager realManager;

    public DatabaseProxy(DatabaseManager realManager) {
        if (realManager == null) {
            throw new IllegalArgumentException("realManager cannot be null.");
        }
        this.realManager = realManager;
    }

    @Override
    public List<User> readUsers() {
        return realManager.readUsers();
    }

    @Override
    public void writeUsers(List<User> users) {
        realManager.writeUsers(users);
    }

    @Override
    public List<Equipment> readEquipment() {
        return realManager.readEquipment();
    }

    @Override
    public void writeEquipment(List<Equipment> equipment) {
        realManager.writeEquipment(equipment);
    }

    @Override
    public List<Reservation> readReservations() {
        return realManager.readReservations();
    }

    @Override
    public void writeReservations(List<Reservation> reservations) {
        realManager.writeReservations(reservations);
    }

    @Override
    public List<Payment> readPayments() {
        return realManager.readPayments();
    }

    @Override
    public void writePayments(List<Payment> payments) {
        realManager.writePayments(payments);
    }
}

