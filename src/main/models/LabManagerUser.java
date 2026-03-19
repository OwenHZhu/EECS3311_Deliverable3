package main.models;

import main.enums.AccountStatus;

public class LabManagerUser extends User {
    private final LabManager labManager;

    public LabManagerUser(String userId,
                           String name,
                           String email,
                           String password,
                           String idOrCertificationNumber,
                           String department,
                           AccountStatus status,
                           LabManager labManager) {
        super(userId, name, email, password, idOrCertificationNumber, department, status, false);
        if (labManager == null) {
            throw new IllegalArgumentException("labManager cannot be null.");
        }
        this.labManager = labManager;
    }

    @Override
    public double getHourlyRate() {
        return 0.0;
    }

    public LabManager getLabManager() {
        return labManager;
    }
}

