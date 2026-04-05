package ai_assistant;

import main.enums.AccountStatus;
import main.models.ApprovalRequest;
import main.models.Payment;
import main.models.Reservation;
import main.models.User;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserAiTest {

    private TestUser user;

    // Concrete implementation for testing
    private static class TestUser extends User {
        public TestUser(String userId,
                        String name,
                        String email,
                        String password,
                        String idOrCertificationNumber,
                        String department,
                        AccountStatus status,
                        boolean universityAffiliated) {
            super(userId, name, email, password, idOrCertificationNumber, department, status, universityAffiliated);
        }

        @Override
        public double getHourlyRate() {
            return 25.0;
        }
    }

    @Before
    public void setUp() {
        user = new TestUser(
                "U1",
                "John Doe",
                "john@example.com",
                "Strong1!",
                "ID123",
                "CS",
                AccountStatus.Active,
                true
        );
    }

    // -------- Password Strength Tests --------

    @Test
    public void testStrongPassword() {
        assertTrue(user.isPasswordStrong());
    }

    @Test
    public void testPasswordTooShort() {
        user.setPassword("S1!");
        assertFalse(user.isPasswordStrong());
    }

    @Test
    public void testPasswordMissingUppercase() {
        user.setPassword("strong1!");
        assertFalse(user.isPasswordStrong());
    }

    @Test
    public void testPasswordMissingLowercase() {
        user.setPassword("STRONG1!");
        assertFalse(user.isPasswordStrong());
    }

    @Test
    public void testPasswordMissingDigit() {
        user.setPassword("Strong!!");
        assertFalse(user.isPasswordStrong());
    }

    @Test
    public void testPasswordMissingSymbol() {
        user.setPassword("Strong123");
        assertFalse(user.isPasswordStrong());
    }

    @Test
    public void testNullPassword() {
        user.setPassword(null);
        assertFalse(user.isPasswordStrong());
    }

    // -------- Getter & Setter Tests --------

    @Test
    public void testGettersAndSetters() {
        user.setUserId("U2");
        user.setName("Jane");
        user.setEmail("jane@example.com");
        user.setPassword("NewPass1!");
        user.setIdOrCertificationNumber("ID999");
        user.setDepartment("Math");
        user.setStatus(AccountStatus.Rejected);

        assertEquals("U2", user.getUserId());
        assertEquals("Jane", user.getName());
        assertEquals("jane@example.com", user.getEmail());
        assertEquals("NewPass1!", user.getPassword());
        assertEquals("ID999", user.getIdOrCertificationNumber());
        assertEquals("Math", user.getDepartment());
        assertEquals(AccountStatus.Rejected, user.getStatus());
    }

    // -------- University Affiliation --------

    @Test
    public void testUniversityAffiliation() {
        assertTrue(user.isUniversityAffiliated());

        TestUser nonAffiliatedUser = new TestUser(
                "U3", "Mark", "mark@test.com", "Strong1!",
                "ID777", "Bio", AccountStatus.Active, false
        );

        assertFalse(nonAffiliatedUser.isUniversityAffiliated());
    }

    // -------- Reservation Tests --------

    @Test
    public void testReservations() {
        Reservation r = null; // assuming no constructor requirements
        user.addReservation(r);

        assertEquals(1, user.getReservations().size());

        List<Reservation> newList = new ArrayList<>();
        user.setReservations(newList);

        assertEquals(newList, user.getReservations());
    }

    // -------- Payment Tests --------

    @Test
    public void testPayments() {
        Payment p = null;
        user.addPayment(p);

        assertEquals(1, user.getPayments().size());

        List<Payment> newList = new ArrayList<>();
        user.setPayments(newList);

        assertEquals(newList, user.getPayments());
    }

    // -------- ApprovalRequest Tests --------

    @Test
    public void testApprovalRequests() {
        ApprovalRequest a = null;
        user.addApprovalRequest(a);

        assertEquals(1, user.getApprovalRequests().size());

        List<ApprovalRequest> newList = new ArrayList<>();
        user.setApprovalRequests(newList);

        assertEquals(newList, user.getApprovalRequests());
    }
}