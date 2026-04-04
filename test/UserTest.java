package testcases;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.time.LocalDateTime;

import main.models.UserFactory;
import main.models.User;
import main.models.Student;
import main.models.Equipment;
import main.models.Faculty;
import main.models.Researcher;
import main.models.Reservation;
import main.models.Guest;
import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.enums.ReservationStatus;

public class UserTest {
	
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
	public void testgetStudentRate() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		assertEquals(10.0, user.getHourlyRate(), 0.001);
	}
	
	@Test
	public void testgetFacultyRate() {
		User user = new Faculty(userId, name, email, password, idNumber, department, status);
		assertEquals(15.0, user.getHourlyRate(), 0.001);
	}
	
	@Test
	public void testgetResearcherRate() {
		User user = new Researcher(userId, name, email, password, idNumber, department, status);
		assertEquals(20.0, user.getHourlyRate(), 0.001);
	}
	
	@Test
	public void testGetGuestRate() {
		User user = new Guest(userId, name, email, password, idNumber, department, status);
		assertEquals(30.0, user.getHourlyRate(), 0.001);
	}
	
	@Test
	public void testPasswordStrength() {
		User user = new Faculty(userId, name, email, "Strongpassword123!", idNumber, department, status);
		assertEquals(true, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordLength() {
		User user = new Faculty(userId, name, email, "Short1!", idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordUpper() {
		User user = new Faculty(userId, name, email, "strongpassword123!", idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordLower() {
		User user = new Faculty(userId, name, email, "STRONGPASSWORD123!", idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordDigit() {
		User user = new Faculty(userId, name, email, "Strongpassword!", idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordSymbol() {
		User user = new Faculty(userId, name, email, "Strongpassword123", idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testPasswordEmpty() {
		User user = new Faculty(userId, name, email, null, idNumber, department, status);
		assertEquals(false, user.isPasswordStrong());
	}
	
	@Test
	public void testStudentAffiliation() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		assertEquals(true, user.isUniversityAffiliated());
	}
	
	@Test
	public void testFacultyAffiliation() {
		User user = new Faculty(userId, name, email, password, idNumber, department, status);
		assertEquals(true, user.isUniversityAffiliated());
	}
	
	@Test
	public void testResearcherAffiliation() {
		User user = new Researcher(userId, name, email, password, idNumber, department, status);
		assertEquals(true, user.isUniversityAffiliated());
	}
	
	@Test
	public void testGuestAffiliation() {
		User user = new Guest(userId, name, email, password, idNumber, department, status);
		assertEquals(false, user.isUniversityAffiliated());
	}
	
	@Test
	public void testIdSetGet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setUserId("92018423");
		assertEquals("92018423", user.getUserId());
	}
	
	@Test
	public void testEmailSetGet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setEmail("Alisson123@yahool.com");
		assertEquals("Alisson123@yahool.com", user.getEmail());
	}
	
	@Test
	public void testNameSetGet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setName("Mary");
		assertEquals("Mary", user.getName());
	}
	
	@Test
	public void testIdOrCertificationNumberSetGet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setIdOrCertificationNumber("U-221");
		assertEquals("U-221", user.getIdOrCertificationNumber());
	}
	
	@Test
	public void testPasswordGetSet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setPassword("Password123!");
		assertEquals("Password123!", user.getPassword());
	}
	
	@Test
	public void testDepartmentGetSet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setDepartment("EECS");
		assertEquals("EECS", user.getDepartment());
	}

	@Test
	public void testAccountStatusGetSet() {
		User user = new Student(userId, name, email, password, idNumber, department, status);
		user.setStatus(status);
		assertEquals(status, user.getStatus());
	}
	
	@Test
	public void testAddReservationIncreasesSize() {
	    User user = new Student(userId, name, email, password, idNumber, department, status);
	    Equipment eq = new Equipment("EQ1", "Projector", "Lab A", EquipmentStatus.Available);

	    Reservation r = new Reservation("R001", LocalDateTime.of(2030, 6, 1, 10, 0), LocalDateTime.of(2030, 6, 1, 12, 0), ReservationStatus.Active, 20.0, eq, user);
	    user.addReservation(r);
	    assertEquals(1, user.getReservations().size());
	}
	

	
	
}
