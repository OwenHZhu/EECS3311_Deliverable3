package main.models;

import main.enums.*;

public class HeadLabCoordinator extends User {

    public HeadLabCoordinator(String userId,
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
        return 0.0;
    }

    public LabManager createLabManager() {
        return new LabManager();
    }
}
