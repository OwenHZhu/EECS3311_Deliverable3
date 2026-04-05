package testcases;

import main.models.*;
import main.enums.*;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;


public class ReservationFacadeTest {

    private ReservationFacade facade;
    private User guest;
    private LocalDateTime start;
    private LocalDateTime end;
    private Equipment eq;
    private static HeadLabCoordinator instance;


    

    @Before
    public void setUp() {
    	
    	instance = HeadLabCoordinator.getInstance(
                 "head",
                 "Head Lab Coordinator",
                 "head@yorku.ca",
                 "Head@1234",
                 "HeadLab",
                 "Lab",
                 AccountStatus.Active
         );
    	
        facade = new ReservationFacade();
        
        start = LocalDateTime.of(2026, 4, 10, 11, 0);
        end = LocalDateTime.of(2026, 4, 10, 14, 0);
        
        eq = new Equipment("2", "Board", "Room 2", EquipmentStatus.Available);
       
        
    }
    

    @Test
    public void displayMessage_1() {
        assertEquals("", facade.displayMessage(null));
    }

    @Test
    public void displayMessage_2() {
        assertEquals("Hello", facade.displayMessage("Hello"));
    }

    @Test
    public void getAllUsers_1() {
        assertNotNull(facade.getAllUsers());
    }

    @Test
    public void loginUser_1() {
        assertNull(facade.loginUser(null, null));
    }

    @Test
    public void loginUser_2() {
        assertNull(facade.loginUser("wrong", "wrong"));
    }

    @Test
    public void registerUser_1() {
    	 Guest guest = new Guest(
                 "guest1",
                 "Guest 1",
                 "guest1@yorku.ca",
                 "Guest1@123",
                 "G1",
                 "EECS",
                 AccountStatus.Active
         );

        assertNotNull(guest);
        assertEquals( "guest1", guest.getUserId());
    }

    @Test
    public void registerUser_2() {
        User guest = facade.registerUserAutoId(
        		 "Guest",
                 "Guest 1",
                 "guest1@yorku.ca",
                 "Guest1@123",
                 "G1",
                 "EECS"
              
        );

        assertNotNull(guest);
        assertNotNull(guest.getUserId());
    }

    @Test
    public void listEquipment_1() {
        List<Equipment> equipment = facade.listEquipment();
        assertNotNull(equipment);
        assertFalse(equipment.isEmpty());
    }

    @Test
    public void enableEquipment_1() {
        assertFalse(facade.enableEquipment("INVALID"));
    }

    @Test
    public void disableEquipment_1() {
        assertFalse(facade.disableEquipment("INVALID"));
    }

    @Test
    public void reserveReservation_1() {
        boolean result = facade.reserveReservation(
                "demoGuest",
                "EQ1",
                "invalid-format",
                PaymentMethod.Credit
        );

        assertFalse(result);
    }

    @Test
    public void reserveReservation_2() {
        assertThrows(NullPointerException.class, () ->
                facade.reserveReservation(null, "EQ1", "2025-01-01T10:00|2025-01-01T11:00", PaymentMethod.Credit)
        );
    }

    @Test
    public void reserveReservation_3() {
        boolean result = facade.reserveReservation(
                "demoGuest",
                "EQ1",
                "2025-01-01T10:00|2025-01-01T11:00",
                PaymentMethod.Credit
        );

        assertTrue(result);
    }

    @Test
    public void listReservationsByUserId_1() {
        List<Reservation> list = facade.listReservationsByUserId("demoGuest");
        assertNotNull(list);
    }

    @Test
    public void getReservationById_1() {
        assertNull(facade.getReservationById("INVALID"));
    }
    
    @Test
    public void cancelReservation_1() {
        boolean result = facade.cancelReservation("INVALID", LocalDateTime.now());
        assertFalse(result);
    }
    
        
    @Test
    public void cancelReservation_4() {
    	
    	 LocalDateTime start1 = LocalDateTime.of(2026, 4, 22, 10, 0);
    	 LocalDateTime end1 = LocalDateTime.of(2026, 4, 22, 11, 0);

    	 facade.reserveReservation("demoGuest", "EQ1", start1, end1, PaymentMethod.Debit);
    	 Reservation reservation = facade.listReservationsByUserId("demoGuest").get(0);
         boolean result = facade.cancelReservation(
    	        reservation.getReservationId(),
    	        start.plusMinutes(1)
    	 );

    	 assertFalse(result);
    }
    

    @Test
    public void extendReservation_1() {
        boolean result = facade.extendReservation("INVALID", LocalDateTime.now().plusHours(1));
        assertFalse(result);
    }

    @Test
    public void modifyReservation_1() {
        boolean result = facade.modifyReservation(
                "INVALID",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now()
        );

        assertFalse(result);
    }

    @Test
    public void recordArrival_1() {
        String msg = facade.recordArrival("INVALID", LocalDateTime.now());
        assertEquals("Reservation not found.", msg);
    }

    @Test
    public void newReservationId_1() {
        String id1 = ReservationFacade.newReservationId();
        String id2 = ReservationFacade.newReservationId();

        assertNotNull(id1);
        assertNotNull(id2);
        assertNotEquals(id1, id2);
    }
    
    @Test
    public void createLabManager_1() {
    	boolean result = facade.createLabManagerAccountFromHead(
    	            "Manager 1",
    	            "labmanager1@yorku.ca",
    	            "LabManager@123",
    	            "LM1",
    	            "EECS"
    	    );

    	assertFalse(result);
    
    }
    
    @Test
    public void createLabManager_2() {

    	 AppBackend.getInstance().getSession().setCurrentUser(instance);

    	 boolean result = facade.createLabManagerAccountFromHead(
    	            "",
    	            "labmanager2@yorku.ca",
    	            "LabManager@123",
    	            "LM2",
    	            "EECS"
    	    );

    	    assertFalse(result);
    
    }
    
    @Test
    public void markEquipment() {
    	AppBackend.getInstance().getSession().setCurrentUser(instance);
    	boolean created = facade.createLabManagerAccountFromHead(
                "Manager",
                "labmanager1@yorku.ca",
                "LabManager1@123",
                "LM2",
                "EECS"
        );
        assertTrue(created);

        User manager = facade.loginUser("labmanager1@yorku.ca", "LabManager1@123");
        assertNotNull(manager);

        AppBackend.getInstance().getSession().setCurrentUser(manager);

        assertTrue(facade.markEquipmentUnderMaintenance("EQ1"));
        Equipment eq = facade.listEquipment().stream()
            .filter(e -> e.getEquipmentId().equals("EQ1"))
            .findFirst().get();
        assertEquals(EquipmentStatus.Maintenance, eq.getStatus());
    
    }
    
    @Test
    public void disableEquipment() {
    	AppBackend.getInstance().getSession().setCurrentUser(instance);
    	boolean created = facade.createLabManagerAccountFromHead(
                "Manager 3",
                "labmanager3@yorku.ca",
                "LabManager3@123",
                "LM3",
                "EECS"
        );
        assertTrue(created);

        User manager = facade.loginUser("labmanager3@yorku.ca", "LabManager3@123");
        assertNotNull(manager);

        AppBackend.getInstance().getSession().setCurrentUser(manager);
                
        
        assertTrue(facade.disableEquipment("EQ1"));
        Equipment eq = facade.listEquipment().stream()
            .filter(e -> e.getEquipmentId().equals("EQ1"))
            .findFirst().get();
        assertEquals(EquipmentStatus.Disabled, eq.getStatus());
    
    }
    
    @Test
    public void enableEquipment() {
    	AppBackend.getInstance().getSession().setCurrentUser(instance);
    	boolean created = facade.createLabManagerAccountFromHead(
                "Manager 4",
                "labmanager4@yorku.ca",
                "LabManager4@123",
                "LM4",
                "EECS"
        );
        assertTrue(created);

        User manager = facade.loginUser("labmanager4@yorku.ca", "LabManager4@123");
        assertNotNull(manager);
       
        //facade.disableEquipment("EQ1");
        assertTrue(facade.enableEquipment("EQ1"));
        Equipment eq = facade.listEquipment().stream()
            .filter(e -> e.getEquipmentId().equals("EQ1"))
            .findFirst().get();
        assertEquals(EquipmentStatus.Available, eq.getStatus());
    
    }
    
    @Test
    public void approveUser() {
    	AppBackend.getInstance().getSession().setCurrentUser(instance);
    	
    	
    	User user = facade.registerUser("faculty",  "faculty1",
                "Faculty 1",
                "faculty1@yorku.ca",
                "Facutly1@123",
                "F1",
                "ESSE");
    	
    	facade.approveUser(user, true);
    	
    	assertEquals(AccountStatus.Active, user.getStatus());
    	
    }
    
    
    
   
    
       
    
}
