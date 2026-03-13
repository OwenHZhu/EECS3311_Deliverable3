package main.models;

import main.enums.*;
import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String userId;
    private String name;
    private String email;
    private String password;
    private String idOrCertificationNumber;
    private String department;
    private AccountStatus status;
    private List<Reservation> reservations;
    private List<Payment> payments;
    private List<ApprovalRequest> approvalRequests;
    private final boolean universityAffiliated;

    public User(String userId,
                String name,
                String email,
                String password,
                String idOrCertificationNumber,
                String department,
                AccountStatus status,
                boolean universityAffiliated) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.idOrCertificationNumber = idOrCertificationNumber;
        this.department = department;
        this.status = status;
        this.universityAffiliated = universityAffiliated;
        this.reservations = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.approvalRequests = new ArrayList<>();
    }

    public abstract double getHourlyRate();

    public boolean isPasswordStrong() {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSymbol = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSymbol = true;
            }
        }
        
        return hasUpper && hasLower && hasDigit && hasSymbol;
    }

    public boolean isUniversityAffiliated() {
        return universityAffiliated;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdOrCertificationNumber() {
        return idOrCertificationNumber;
    }

    public void setIdOrCertificationNumber(String idOrCertificationNumber) {
        this.idOrCertificationNumber = idOrCertificationNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    public List<ApprovalRequest> getApprovalRequests() {
        return approvalRequests;
    }

    public void setApprovalRequests(List<ApprovalRequest> approvalRequests) {
        this.approvalRequests = approvalRequests;
    }

    public void addApprovalRequest(ApprovalRequest approvalRequest) {
        this.approvalRequests.add(approvalRequest);
    }
}