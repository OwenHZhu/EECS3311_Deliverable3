package testcases;

import main.enums.*;
import main.models.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;



public class ReservationSystemTest {

	private ReservationSystem system;
    private Guest guest;
    private Equipment equipment;
    private LocalDateTime start;
    private LocalDateTime end;
    private String requestId;
    private static HeadLabCoordinator instance;
    private ApprovalStatus status;
    
    @Before
    public void setUp() {
        system = new ReservationSystem();
        

        instance = HeadLabCoordinator.getInstance(
                "head",
                "Head Lab Coordinator",
                "head@yorku.ca",
                "Head@1234",
                "HeadLab",
                "Lab",
                AccountStatus.Active
        );
        
        guest = new Guest(
                "guest1",
                "Guest 1",
                "guest1@yorku.ca",
                "Guest1@123",
                "G1",
                "EECS",
                AccountStatus.Active
        );

        requestId     = "001";
        status = ApprovalStatus.Active;
        
        equipment = new Equipment(
                "EQ1",
                "Lamp",
                "Room 1",
                EquipmentStatus.Available
        );

        system.registerUser(guest);
        system.addEquipment(equipment);

        start = LocalDateTime.of(2026, 4, 10, 11, 0);
        end = LocalDateTime.of(2026, 4, 10, 14, 0);
    }
    
    // Test 1
    @Test
    public void duplicateEmail() {
    	Guest guest = new Guest(
    			"guest2", 
    			"Guest 2", 
    			"guest1@yorku.ca", 
    			"Guest1@123", 
    			"G2",
    			"EECS",
    			AccountStatus.Active
    	);
    	    	 	
    	assertThrows(IllegalArgumentException.class, () -> system.registerUser(guest));
    		
    }
    
    // Test 2
    @Test
    public void weakPassword() {
    	Guest guest = new Guest(
    			"guest2", 
    			"Guest 2", 
    			"guest2@yorku.ca", 
    			"helloGuest", 
    			"G2",
    			"EECS",
    			AccountStatus.Active
    	);
    	    	 	
    	assertThrows(IllegalArgumentException.class, () -> system.registerUser(guest));
    	    	
    }
    
    // Test 3
    @Test
    public void userPendingApproval() {
       User user = new Faculty(   
                "faculty1",
                "Faculty 1",
                "faculty1@yorku.ca",
                "Facutly1@123",
                "F1",
                "ESSE",
                AccountStatus.Active
        );

        system.registerUser(user);

        assertEquals(AccountStatus.PendingApproval, user.getStatus());
        assertFalse(user.getApprovalRequests().isEmpty());
        assertEquals(ApprovalStatus.Pending,
                user.getApprovalRequests().get(0).getStatus());
    }
    
    
    // Test 4
    @Test
    public void reservationInvalid_EndBeforeStart() {
    	assertThrows(IllegalArgumentException.class, 
    			() -> system.createReservation(guest, equipment, end, start, PaymentMethod.Debit));
    	
    }
    
    // Test 5
    @Test
    public void successfulUserLogin() {
    	 assertEquals(guest, system.login(guest.getEmail(), guest.getPassword()));
    }
    
    // Test 6
    @Test
    public void reservationInvalid_EquipmentNotAvailable() {
    	equipment.setStatus(EquipmentStatus.Maintenance);
    	assertThrows(IllegalStateException.class, 
    			() -> system.createReservation(guest, equipment, start, end, PaymentMethod.Debit));
    }
    
    // Test 7 -> Null email + password
    @Test
    public void nullUserRegister_1() {
    	guest.setPassword(null);
    	guest.setEmail(null);
    	assertThrows(NullPointerException.class, 
    			() -> system.login(guest.getEmail(), guest.getPassword()));
    }
    
    // Test 8 -> Null email
    @Test
    public void nullUserRegister_2() {
    	guest.setEmail(null);
    	assertThrows(NullPointerException.class, 
    			() -> system.login(guest.getEmail(), guest.getPassword()));
    }
    
    // Test 9 -> Null password
    @Test
    public void nullUserRegister_3() {
    	guest.setPassword(null);
    	assertThrows(NullPointerException.class, 
    			() -> system.login(guest.getEmail(), guest.getPassword()));
    }
    
    // Test 10 -> not LabCoordinator create
    @Test
    public void createLabManager_1() {
    	 	
        instance.setStatus(AccountStatus.Suspended);
        assertThrows(IllegalStateException.class, 
    			() -> system.createLabManagerAccount(
    			instance, "Manager 1", "labmanager@yorku.ca", "LabManager@123", "LM1", "EECS"));    	
    }
    
    
    // Test 11 -> LabCoordinator create + Null info
    @Test
    public void createLabManager_2() {
    	
       instance.setStatus(AccountStatus.Active);
       assertThrows(IllegalArgumentException.class, 
   			() -> system.createLabManagerAccount(
   			instance, null, null, null , null, null));    	
   }
    
    @Test
    public void createLabManager_4() {
    	
       instance.setStatus(AccountStatus.Active);
       assertThrows(IllegalArgumentException.class, 
   			() -> system.createLabManagerAccount(
   			instance, "Manager 1", null, "LabManager@123", "LM1", "EECS"));    	
   }
    
    @Test
    public void createLabManager_5() {
    	
       instance.setStatus(AccountStatus.Active);
       assertThrows(IllegalArgumentException.class, 
   			() -> system.createLabManagerAccount(
   			instance, "Manager 1", "labmanager@yorku.ca", null, "LM1", "EECS"));    	
   }
    
   
    
    @Test
    public void createLabManager_7() {
    	
       instance.setStatus(AccountStatus.Active);
       assertThrows(IllegalArgumentException.class, 
   			() -> system.createLabManagerAccount(
   			instance, "Manager 1", "labmanager@yorku.ca", "LabManager@123", "LM1", null));    	
   }
    
    // Test 12 -> LabCoordinator create + full info
    @Test
    public void createLabManager_3() {
    	instance.setStatus(AccountStatus.Active);
    	LabManagerUser manager = system.createLabManagerAccount(
    			instance, 
    			"Manager 1", 
    			"labmanager@yorku.ca", 
    			"LabManager@123", 
    			"LM1", 
    			"EECS");
    	
    	assertNotNull(manager);
    	assertTrue(system.getUsers().contains(manager));
   }
    
    
    // Test 13 -> Cancel Reservation before Start
    @Test
    public void cancelReservation_1() {
        Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Debit
        );

        system.cancelReservation(reservation, start.minusMinutes(30));

        assertEquals(ReservationStatus.Cancelled, reservation.getStatus());
        assertTrue(reservation.getEquipment().isAvailable());
    }
    
    // Test 14 -> create reservation with inactive account
    @Test
    public void createReservation_1() {
    	guest.setStatus(AccountStatus.Rejected);
        assertThrows(IllegalStateException.class, () ->
        system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Debit
        ));
    }
    
    // Test 15 -> Extend Reservation 
    @Test
    public void extendReservation_1() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        LocalDateTime newEnd = end.plusHours(1);
        system.extendReservation(reservation, newEnd);

        assertEquals(newEnd, reservation.getEndTime());
    }
    
    // Test 15 -> Extend Reservation to a null time 
    @Test
    public void extendReservation_2() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        assertThrows(NullPointerException.class, () ->
    	system.extendReservation(reservation, null));
    }
    
    // Test 16 -> Modify reservation
    @Test
    public void emodifyReservation_1() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

    	LocalDateTime newStart = start.plusHours(1);
        LocalDateTime newEnd = end.plusHours(1);
    	
        system.modifyReservation(reservation, newStart, newEnd, start.minusMinutes(30));
        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }
    
    // Test -> reservation on the same equipment same time
    @Test 
    public void emodifyReservation_3() {
    	    Reservation r1 = system.createReservation(
    	            guest,
    	            equipment,
    	            start,
    	            end,
    	            PaymentMethod.Credit
    	    );

    	    equipment.enable();
    	    
    	    Reservation r2 = system.createReservation(
    	            guest,
    	            equipment,
    	            start.minusDays(1),
    	            end.minusDays(1),
    	            PaymentMethod.Credit
    	    );

    	    assertThrows(IllegalStateException.class, () ->
    	            system.modifyReservation(
    	            		r2,
    	                    start.plusMinutes(30),
    	                    end.plusMinutes(30),
    	                    start.minusMinutes(40)
    	            )
    	    );
    }
    
    // Test 18 -> Modify inactive reservation 
    @Test
    public void emodifyReservation_2() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
    	
    	reservation.setStatus(ReservationStatus.Cancelled);

    	LocalDateTime newStart = start.plusHours(1);
        LocalDateTime newEnd = end.plusHours(1);
    	               
        assertThrows(IllegalStateException.class, () ->
        system.modifyReservation(reservation, newStart, newEnd, start));
    }
    
    // Test 19 -> Login successful
    @Test
    public void login_1() {
    	assertEquals(guest, system.login(guest.getEmail(), guest.getPassword()));
    }
    
    // Test 20 -> Login failed
    @Test
    public void login_2() {
    	 assertEquals(null, system.login("ble", "ble"));
    }
    
    // Test 21 -> Login null
    @Test
    public void login_3() {
    	 assertThrows(NullPointerException.class, () ->
         system.login(null, null));
    }
    
    // Test 21 -> Login headlab
    @Test
    public void login_4() {
    	 assertEquals(instance, system.login(instance.getEmail(), instance.getPassword()));
    }
    
    // Test 22 -> Add equipment
    @Test
    public void addEquipment_1() {
    	Equipment eq2 = new Equipment(
    			"EQ2",
                "Breadboard",
                "Lab 3",
                EquipmentStatus.Available);
    	
    	system.addEquipment(eq2);
    	assertTrue(system.getEquipmentItems().contains(eq2));
    }
    
    // Test 22 -> Add duplicate equipment 
    @Test
    public void addEquipment_2() {
    	Equipment eq2 = new Equipment(
    			"EQ1",
                "Lamp",
                "Room 1",
                EquipmentStatus.Available);
    	
    	assertThrows(IllegalArgumentException.class, () ->
    	system.addEquipment(eq2));
    }
    
    // Test 23 -> get reservation for user
    @Test
    public void getReservation_1() {
    	 	
    	assertTrue(system.getReservationsForUser(guest.getUserId()).isEmpty());
    	
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
    	
    	assertTrue(!system.getReservationsForUser(guest.getUserId()).isEmpty());
    	assertEquals(reservation, system.getReservationsForUser(guest.getUserId()).get(0));
    }
    
    // Test 24 -> get reservation for null id user
    @Test
    public void getReservation_2() {
    	 	
    	assertTrue(system.getReservationsForUser(null).isEmpty());
    	
    	
    }
    
    
    // Test -> reservation on the same equipment same time
    @Test 
    public void createReservation_2() {
    	 Reservation r1 = system.createReservation(
    	            guest,
    	            equipment,
    	            start,
    	            end,
    	            PaymentMethod.Credit
    	    );

    	    equipment.enable();

    	    assertThrows(IllegalStateException.class, () ->
    	            system.createReservation(
    	                    guest,
    	                    equipment,
    	                    start.plusMinutes(30),
    	                    end.plusMinutes(30),
    	                    PaymentMethod.Credit
    	            )
    	    );
    }
    
    // -> reserve on different equipments -> check for authenticate
    @Test 
    public void createReservation_3() {
    	Equipment equipment2 = new Equipment(
                "EQ2",
                "Microscope",
                "Room 2",
                EquipmentStatus.Available
        );
        system.addEquipment(equipment2);

        Reservation r1 = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        Reservation r2 = system.createReservation(
                guest,
                equipment2,
                start.plusMinutes(30),
                end.plusMinutes(30),
                PaymentMethod.Credit
        );

        assertNotNull(r2);
        assertEquals(equipment2, r2.getEquipment());
    }
    
    // -> null user approve
    @Test
    public void approveUser_1() {
        assertThrows(NullPointerException.class, () -> system.approveUser(null, true));
    }
    
    // non-faculty user approval -> change nth
    @Test 
    public void approveUser_2() {
        Guest guest2 = new Guest(
                "guest2",
                "Guest 2",
                "guest2@yorku.ca",
                "Guest2@123",
                "G2",
                "EECS",
                AccountStatus.Active
        );

        system.registerUser(guest2);

        system.approveUser(guest2, true);

        assertEquals(AccountStatus.Active, guest2.getStatus());
        assertTrue(guest2.getApprovalRequests().isEmpty());
    }
    
    // faculty user without no approval request
    @Test
    public void approveUser_3() {
        Faculty faculty = new Faculty(
                "faculty1",
                "Faculty 1",
                "faculty1@yorku.ca",
                "Faculty1@123",
                "F1",
                "EECS",
                AccountStatus.Active
        );

        system.registerUser(faculty);
        faculty.getApprovalRequests().clear();

        assertThrows(IllegalStateException.class, () -> system.approveUser(faculty, true));
    }
    
    // -> faculty user approved -> set active
    @Test
    public void approveUser_4() {
        Faculty faculty = new Faculty(
                "faculty2",
                "Faculty 2",
                "faculty2@yorku.ca",
                "Faculty2@123",
                "F2",
                "EECS",
                AccountStatus.Active
        );

        system.registerUser(faculty);

        system.approveUser(faculty, true);

        assertEquals(AccountStatus.Active, faculty.getStatus());
        assertEquals(
                ApprovalStatus.Active,
                faculty.getApprovalRequests().get(faculty.getApprovalRequests().size() - 1).getStatus()
        );
    }
    
    // -> faculty user not approved -> rejected
    @Test
    public void approveUser_5() {
        Faculty faculty = new Faculty(
                "faculty3",
                "Faculty 3",
                "faculty3@yorku.ca",
                "Faculty3@123",
                "F3",
                "EECS",
                AccountStatus.Active
        );

        system.registerUser(faculty);

        system.approveUser(faculty, false);

        assertEquals(AccountStatus.Rejected, faculty.getStatus());
        assertEquals(
                ApprovalStatus.Rejected,
                faculty.getApprovalRequests().get(faculty.getApprovalRequests().size() - 1).getStatus()
        );
    }
    
    // no show
    @Test
    public void completeReservation_1() {
    	
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
    	
    	reservation.setStatus(ReservationStatus.NoShow);
    	assertThrows(IllegalStateException.class, () -> 
    	system.completeReservation(reservation, end, PaymentMethod.Credit));
    }
    
    @Test
    public void completeReservation_2() {
    	
      	assertThrows(NullPointerException.class, () -> 
    	system.completeReservation(null, end, PaymentMethod.Credit));
    }
    
    @Test
    public void completeReservation_3() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
      	assertThrows(NullPointerException.class, () -> 
    	system.completeReservation(reservation, null, PaymentMethod.Credit));
    }
    
    @Test
    public void completeReservation_4() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
      	assertThrows(NullPointerException.class, () -> 
    	system.completeReservation(reservation, end, null));
    }
    
    @Test
    public void completeReservation_5() {
    	Reservation reservation = system.createReservation(
                guest,
                equipment,
                start,
                end,
                PaymentMethod.Debit
        );

        double remaining = system.completeReservation(reservation, end, PaymentMethod.Debit);

        assertEquals(ReservationStatus.Completed, reservation.getStatus());
        assertTrue(reservation.getEquipment().isAvailable());
        assertTrue(remaining > 0);
    }
    
    @Test
    public void completeReservation_6() {
    	 Reservation reservation = system.createReservation(
                 guest, 
                 equipment, 
                 start, 
                 end, 
                 PaymentMethod.Debit
         );

        int paymentsBefore = system.getPayments().size();

        LocalDateTime actualEnd = end.plusHours(2);
        double remaining = system.completeReservation(reservation, actualEnd, PaymentMethod.Debit);

        assertEquals(ReservationStatus.Completed, reservation.getStatus());
        assertTrue(reservation.getEquipment().isAvailable());
        assertTrue(remaining > 0);
        assertEquals(paymentsBefore + 1, system.getPayments().size());
    }
    
    @Test
    public void completeReservation_noRemainingPayment_doesNotAddPayment() {
    	 LocalDateTime shortStart = LocalDateTime.of(2026, 4, 10, 11, 0);
    	 LocalDateTime shortEnd = LocalDateTime.of(2026, 4, 10, 12, 0);

    	 Reservation reservation = system.createReservation(
                 guest, 
                 equipment, 
                 shortStart, 
                 shortEnd, 
                 PaymentMethod.Debit
         );

    	 int paymentsBefore = system.getPayments().size();

    	 double remaining = system.completeReservation(reservation, shortEnd, PaymentMethod.Debit);

    	 assertEquals(0.0, remaining, 0.0001);
    	 assertEquals(paymentsBefore, system.getPayments().size());
    	 assertEquals(ReservationStatus.Completed, reservation.getStatus());
    	 assertTrue(reservation.getEquipment().isAvailable());
    }
    
    @Test
    public void arrivalTime_1() {
    	assertThrows(NullPointerException.class, () -> 
    	system.recordArrival(null, start)); 
    }
    
    @Test
    public void arrivalTime_2() {
    	Reservation reservation = system.createReservation(
                guest, 
                equipment, 
                start, 
                end, 
                PaymentMethod.Debit
        );
    	
    	reservation.setStatus(ReservationStatus.NoShow);
    	system.recordArrival(reservation, start.plusMinutes(30));
    	assertEquals(EquipmentStatus.Available,reservation.getEquipment().getStatus());
    }
    
    
}
