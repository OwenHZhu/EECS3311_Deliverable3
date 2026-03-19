package main.models;

import main.enums.*;

public class HeadLabCoordinator extends User {
    private static HeadLabCoordinator instance;

    private HeadLabCoordinator(String userId,
                               String name,
                               String email,
                               String password,
                               String idOrCertificationNumber,
                               String department,
                               AccountStatus status) {
        super(userId, name, email, password, idOrCertificationNumber, department, status, true);
    }

    public static synchronized HeadLabCoordinator getInstance(String userId,
                                                              String name,
                                                              String email,
                                                              String password,
                                                              String idOrCertificationNumber,
                                                              String department,
                                                              AccountStatus status) {
        if (instance == null) {
            instance = new HeadLabCoordinator(userId, name, email, password, idOrCertificationNumber, department, status);
        }
        return instance;
    }

    @Override
    public double getHourlyRate() {
        return 0.0;
    }

    public LabManager createLabManager() {
        return new LabManager();
    }
}
