package ai_assistant;

import main.enums.AccountStatus;
import main.models.Faculty;
import main.models.Guest;
import main.models.Researcher;
import main.models.Student;
import main.models.User;
import main.models.UserFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryAiTest {

    private static final String USER_ID = "U1";
    private static final String NAME = "John Doe";
    private static final String EMAIL = "john@example.com";
    private static final String PASSWORD = "password";
    private static final String ID = "12345";
    private static final String DEPT = "CS";
    private static final AccountStatus STATUS = AccountStatus.Active;

    @Test
    public void testCreateStudent() {
        User user = UserFactory.createUser("student", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
        assertNotNull(user);
        assertTrue(user instanceof Student);
    }

    @Test
    public void testCreateFaculty() {
        User user = UserFactory.createUser("faculty", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
        assertNotNull(user);
        assertTrue(user instanceof Faculty);
    }

    @Test
    public void testCreateResearcher() {
        User user = UserFactory.createUser("researcher", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
        assertNotNull(user);
        assertTrue(user instanceof Researcher);
    }

    @Test
    public void testCreateGuest() {
        User user = UserFactory.createUser("guest", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
        assertNotNull(user);
        assertTrue(user instanceof Guest);
    }

    @Test
    public void testCaseInsensitiveType() {
        User user = UserFactory.createUser("StUdEnT", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
        assertNotNull(user);
        assertTrue(user instanceof Student);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNullTypeThrowsException() {
        UserFactory.createUser(null, USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
    }

    @Test
    public void testUnknownTypeThrowsException() {
        try {
            UserFactory.createUser("invalidType", USER_ID, NAME, EMAIL, PASSWORD, ID, DEPT, STATUS);
            fail("Expected IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Unknown user type"));
        }
    }
}