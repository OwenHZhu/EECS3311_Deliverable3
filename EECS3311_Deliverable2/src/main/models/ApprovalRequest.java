package main.models;

import main.enums.*;

public class ApprovalRequest {
    private String requestId;
    private AccountStatus status;

    public ApprovalRequest(String requestId, AccountStatus status) {
        this.requestId = requestId;
        this.status = status;
    }

    // Methods
    public void submit() {
        this.status = AccountStatus.PendingApproval;
    }

    public void approve() {
        this.status = AccountStatus.Active;
    }

    public void reject() {
        this.status = AccountStatus.Suspended;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
