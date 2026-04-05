package test;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import main.models.UserFactory;
import main.models.User;
import main.models.Student;
import main.models.Faculty;
import main.models.Researcher;
import main.models.Guest;
import main.enums.AccountStatus;

public class UserFactoryTest {
	private String userId;
    private String name;
    private String email;
    private String password;
    private String idNumber;
    private String department;
    private AccountStatus status;
    
    
    @Before
    public void setUp() {
        userId     = "U001";
        name       = "John Doe";
        email      = "john@example.com";
        password   = "pass123";
        idNumber   = "12345";
        department = "Engineering";
        status     = AccountStatus.Active;
    }
    
    @Test
    public void testCreateStudent() {
        User user = UserFactory.createUser("student", userId, name, email, password, idNumber, department, status);
        assertNotNull(user);
        assertTrue(user instanceof Student);
    }
        
    @Test
    public void testCreateFaculty() {
    	User user = UserFactory.createUser("faculty", userId, name, email, password, idNumber, department, status);
    	assertNotNull(user);
    	assertTrue(user instanceof Faculty);
    }
    
    @Test 
    public void testCreateResearcher() {
    	User user = UserFactory.createUser("researcher", userId, name, email, password, idNumber, department, status);
    	assertNotNull(user);
    	assertTrue(user instanceof Researcher);
    }
    
    @Test 
    public void testCreateGuest() {
    	User user = UserFactory.createUser("guest", userId, name, email, password, idNumber, department, status);
    	assertNotNull(user);
    	assertTrue(user instanceof Guest);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyType() {
    	UserFactory.createUser(null, userId, name, email, password, idNumber, department, status);    	
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testUnknownType() {
    	UserFactory.createUser("departmentunknown", userId, name, email, password, idNumber, department, status);
    }
    
    @Test
    public void testCaps() {
    	User user = UserFactory.createUser("STUDENT", userId, name, email, password, idNumber, department, status);
    	assertNotNull(user);
    	assertTrue(user instanceof Student);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNullFields1() {
    	UserFactory.createUser("STUDENT", null, name, email, password, idNumber, department, status);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNullFields2() {
    	UserFactory.createUser("GueSt", userId, name, null, password, idNumber, department, status);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNullFields3() {
    	UserFactory.createUser("ReSeaRCHER", userId, name, email, null, idNumber, department, status);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testNullFields4() {
    	UserFactory.createUser("STUDENT", userId, name, email, password, null, department, status);
    }
    
    
}
