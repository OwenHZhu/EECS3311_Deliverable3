package main.models;

import java.util.List;

public interface DatabaseManager {
    List<User> readUsers();
    void writeUsers(List<User> users);

    List<Equipment> readEquipment();
    void writeEquipment(List<Equipment> equipment);

    List<Reservation> readReservations();
    void writeReservations(List<Reservation> reservations);

    List<Payment> readPayments();
    void writePayments(List<Payment> payments);
}

