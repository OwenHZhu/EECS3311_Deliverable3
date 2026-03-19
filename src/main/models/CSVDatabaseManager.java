package main.models;

import java.util.ArrayList;
import java.util.List;

public final class CSVDatabaseManager implements DatabaseManager {
    private static CSVDatabaseManager instance;

    private final List<User> users = new ArrayList<>();
    private final List<Equipment> equipment = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<Payment> payments = new ArrayList<>();

    private CSVDatabaseManager() {}

    public static synchronized CSVDatabaseManager getInstance() {
        if (instance == null) {
            instance = new CSVDatabaseManager();
        }
        return instance;
    }

    @Override
    public List<User> readUsers() {
        return new ArrayList<>(users);
    }

    @Override
    public void writeUsers(List<User> users) {
        this.users.clear();
        if (users != null) {
            this.users.addAll(users);
        }
    }

    @Override
    public List<Equipment> readEquipment() {
        return new ArrayList<>(equipment);
    }

    @Override
    public void writeEquipment(List<Equipment> equipment) {
        this.equipment.clear();
        if (equipment != null) {
            this.equipment.addAll(equipment);
        }
    }

    @Override
    public List<Reservation> readReservations() {
        return new ArrayList<>(reservations);
    }

    @Override
    public void writeReservations(List<Reservation> reservations) {
        this.reservations.clear();
        if (reservations != null) {
            this.reservations.addAll(reservations);
        }
    }

    @Override
    public List<Payment> readPayments() {
        return new ArrayList<>(payments);
    }

    @Override
    public void writePayments(List<Payment> payments) {
        this.payments.clear();
        if (payments != null) {
            this.payments.addAll(payments);
        }
    }
}

