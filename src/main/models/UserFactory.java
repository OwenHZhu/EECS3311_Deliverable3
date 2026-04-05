package main.models;

import main.enums.AccountStatus;

public final class UserFactory {
    private UserFactory() {}

    public static User createUser(String type,
                                    String userId,
                                    String name,
                                    String email,
                                    String password,
                                    String idOrCertificationNumber,
                                    String department,
                                    AccountStatus status) {
        if (type == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (userId == null) {
            throw new IllegalArgumentException("userId cannot be null.");
        }
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null.");
        }
        if (password == null) {
            throw new IllegalArgumentException("password cannot be null.");
        }
        if (idOrCertificationNumber == null) {
            throw new IllegalArgumentException("idOrCertificationNumber cannot be null.");
        }
        return switch (type.toLowerCase()) {
            case "student" -> new Student(userId, name, email, password, idOrCertificationNumber, department, status);
            case "faculty" -> new Faculty(userId, name, email, password, idOrCertificationNumber, department, status);
            case "researcher" -> new Researcher(userId, name, email, password, idOrCertificationNumber, department, status);
            case "guest" -> new Guest(userId, name, email, password, idOrCertificationNumber, department, status);
            default -> throw new IllegalArgumentException("Unknown user type: " + type);
        };
    }
}

