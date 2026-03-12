package main.models;

import main.enums.*;

public class Guest extends User {

    public Guest(String userId, String name, String email, String password, String department, AccountStatus status) {
        super(userId, name, email, password, department, status);
    }

    public double getHourlyRate() {
        return 0.0;
    }
}
