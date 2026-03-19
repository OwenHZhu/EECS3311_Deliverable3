package main.models;

import main.enums.ApprovalStatus;

public class ApprovalRequest {
    private String requestId;
    private ApprovalStatus status;

    public ApprovalRequest(String requestId, ApprovalStatus status) {
        this.requestId = requestId;
        this.status = status;
    }

    public void submit() {
        this.status = ApprovalStatus.Pending;
    }

    public void approve() {
        this.status = ApprovalStatus.Active;
    }

    public void reject() {
        this.status = ApprovalStatus.Rejected;
    }

    // Getters and Setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ApprovalStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalStatus status) {
        this.status = status;
    }
}
