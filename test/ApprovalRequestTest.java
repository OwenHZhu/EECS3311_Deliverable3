package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.enums.ApprovalStatus;
import main.models.ApprovalRequest;
import main.models.Guest;

public class ApprovalRequestTest {
	private String requestId;
    private ApprovalStatus status;
    
    @Before
    public void setUp() {
    	requestId     = "101";
        status = ApprovalStatus.Active;
    }
    
    @Test
    public void testSubmit() {
    	ApprovalRequest request = new ApprovalRequest(requestId, status);
    	request.submit();
    	request.getStatus();
    	assertEquals(ApprovalStatus.Pending, request.getStatus());
    }
    
    @Test
    public void testApprove() {
    	ApprovalRequest request = new ApprovalRequest(requestId, status);
    	request.approve();
    	request.getStatus();
    	assertEquals(ApprovalStatus.Active, request.getStatus());
    }
    
    @Test
    public void testReject() {
    	ApprovalRequest request = new ApprovalRequest(requestId, status);
    	request.reject();
    	request.getStatus();
    	assertEquals(ApprovalStatus.Rejected, request.getStatus());
    }
    
    @Test
    public void testSetStatus() {
    	ApprovalRequest request = new ApprovalRequest(requestId, status);
    	request.setStatus(ApprovalStatus.Active);
    	request.getStatus();
    	assertEquals(ApprovalStatus.Active, request.getStatus());
    }
    
    @Test
    public void testRequestIdSetGet() {
    	ApprovalRequest request = new ApprovalRequest(requestId, status);
    	request.setRequestId("202");
    	assertEquals("202", request.getRequestId());
    }
}
