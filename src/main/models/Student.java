package main.models;

import main.enums.*;

public class Student extends User {

    public Student(String userId,
                   String name,
                   String email,
                   String password,
                   String idOrCertificationNumber,
                   String department,
                   AccountStatus status) {
        super(userId, name, email, password, idOrCertificationNumber, department, status, true);
    }

    @Override
    public double getHourlyRate() {
        return 10.0;
    }
}
