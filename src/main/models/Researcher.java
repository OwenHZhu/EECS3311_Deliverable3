package main.models;

import main.enums.*;

public class Researcher extends User {

    public Researcher(String userId, String name, String email, String password, String department, AccountStatus status) {
        super(userId, name, email, password, department, status);
    }

    public double getHourlyRate() {
        return 0.0;
    }
}
