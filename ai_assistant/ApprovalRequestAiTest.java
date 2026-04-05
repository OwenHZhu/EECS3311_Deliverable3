package ai_assistant;

import main.enums.ApprovalStatus;
import main.models.ApprovalRequest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApprovalRequestAiTest {

    @Test
    public void testConstructorAndGetters() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        assertEquals("req-123", request.getRequestId());
        assertEquals(ApprovalStatus.Pending, request.getStatus());
    }

    @Test
    public void testSubmitSetsStatusToPending() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Rejected);

        request.submit();

        assertEquals(ApprovalStatus.Pending, request.getStatus());
    }

    @Test
    public void testApproveSetsStatusToActive() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        request.approve();

        assertEquals(ApprovalStatus.Active, request.getStatus());
    }

    @Test
    public void testRejectSetsStatusToRejected() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        request.reject();

        assertEquals(ApprovalStatus.Rejected, request.getStatus());
    }

    @Test
    public void testSetRequestId() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        request.setRequestId("req-456");

        assertEquals("req-456", request.getRequestId());
    }

    @Test
    public void testSetStatus() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        request.setStatus(ApprovalStatus.Active);

        assertEquals(ApprovalStatus.Active, request.getStatus());
    }

    @Test
    public void testFullLifecycle() {
        ApprovalRequest request = new ApprovalRequest("req-123", ApprovalStatus.Pending);

        request.submit();
        assertEquals(ApprovalStatus.Pending, request.getStatus());

        request.approve();
        assertEquals(ApprovalStatus.Active, request.getStatus());

        request.reject();
        assertEquals(ApprovalStatus.Rejected, request.getStatus());
    }
}