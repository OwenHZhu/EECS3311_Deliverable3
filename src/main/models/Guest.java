package main.models;

import main.enums.*;

public class Guest extends User {

    public Guest(String userId,
                 String name,
                 String email,
                 String password,
                 String idOrCertificationNumber,
                 String department,
                 AccountStatus status) {
        super(userId, name, email, password, idOrCertificationNumber, department, status, false);
    }

    @Override
    public double getHourlyRate() {
        return 30.0;
    }
}
