package main.models;

import main.enums.*;

public class HeadLabCoordinator extends User {

    public HeadLabCoordinator(String userId, String name, String email, String password, String department, AccountStatus status) {
        super(userId, name, email, password, department, status);
    }

    public LabManager createLabManager() {
        return null;
    }
}
