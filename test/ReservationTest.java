package testcases;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.enums.ReservationStatus;
import main.models.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;


public class ReservationTest {

    private Reservation reservation;
    private LocalDateTime start;
    private LocalDateTime end;

    @Before
    public void setUp() {
        start = LocalDateTime.of(2026, 4, 10, 9, 0);
        end = LocalDateTime.of(2026, 4, 10, 11, 0);

        reservation = new Reservation(
                "R1",
                start,
                end,
                ReservationStatus.Active,
                20.0,
                null,
                null
        );
    }

    @Test
    public void activate_1() {
        reservation.activate();
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void activate_2() {
    	reservation.setStatus(ReservationStatus.Cancelled);
        reservation.activate();
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    // end before start
    @Test
    public void modify_1() {
       LocalDateTime start_n = LocalDateTime.of(2026, 4, 10, 13, 0);
       LocalDateTime end_n = LocalDateTime.of(2026, 4, 10, 14, 0);
       
       assertThrows(IllegalArgumentException.class, () ->
       reservation.modify(end_n, start_n, start.minusMinutes(30)));
    }

    // too late to modify
    @Test
    public void modify_2() {
    	LocalDateTime start_n = LocalDateTime.of(2026, 4, 10, 13, 0);
        LocalDateTime end_n = LocalDateTime.of(2026, 4, 10, 14, 0);
        
        assertThrows(IllegalStateException.class, () ->
                reservation.modify(start_n, end_n, start)
        );
    }
    
    // success
    @Test
    public void modify_3() {
    	LocalDateTime start_n = LocalDateTime.of(2026, 4, 10, 13, 0);
        LocalDateTime end_n = LocalDateTime.of(2026, 4, 10, 14, 0);    
        
        reservation.modify(start_n, end_n, start.minusMinutes(30));
        assertEquals(start_n, reservation.getStartTime());
        assertEquals(end_n, reservation.getEndTime());
     
    }

    // too late to cancel
    @Test
    public void cancel_1() {
        assertThrows(IllegalStateException.class, () ->
                reservation.cancel(start)
        );
    }
    
    // before start -> success
    @Test
    public void cancel_2() {
        reservation.cancel(start.minusMinutes(30));
        assertEquals(ReservationStatus.Cancelled, reservation.getStatus());
    }

    // extend not success cuz new end is at end
    @Test
    public void extend_1() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.extend(end)
        );
    }
    
    // success    
    @Test
    public void extend_2() {
        LocalDateTime end_n = end.plusHours(2);
        reservation.extend(end_n);
        assertEquals(end_n, reservation.getEndTime());
    }

    // no show
    @Test
    public void calculate_1() {
        reservation.setStatus(ReservationStatus.NoShow);
        double cost = reservation.calculateCost(10.0, null);
        assertEquals(0.0, cost, 0.0001);
    }

    // actual end time is not after start time
    @Test
    public void calculate_2() {
        LocalDateTime actualEnd = start;
        double cost = reservation.calculateCost(10.0, actualEnd);
        assertEquals(0.0, cost, 0.0001); // 3 hours * 10 = 30, minus 20 deposit = 10
    }

    // actual end time is less than 1hr duration
    @Test
    public void calculate_3() {
    	LocalDateTime actualEnd = start;
        double cost = reservation.calculateCost(5.0, actualEnd);
        assertEquals(0.0, cost, 0.0001);
    }
    
    // show up and calculate correct amount needed to pay
    @Test
    public void calculate_4() {
    	LocalDateTime actualEnd = end;
        double cost = reservation.calculateCost(15.0, actualEnd);
        assertEquals(10.0, cost, 0.0001); 
    }

    // null time
    @Test
    public void checkArrival_1() {
        reservation.checkArrival(null);
        assertEquals(ReservationStatus.NoShow, reservation.getStatus());
    }

    // arrive after 20 mins
    @Test
    public void checkArrival_withArrivalBefore20Minutes_setsActive() {
        reservation.checkArrival(start.plusMinutes(40));
        assertEquals(ReservationStatus.NoShow, reservation.getStatus());
    }
    
    // arrive within 20 mins
    @Test
    public void checkArrival_exactly20MinutesLate_setsActive() {
        reservation.checkArrival(start.plusMinutes(10));
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void getters() {
    	assertEquals("R1", reservation.getReservationId());
        assertEquals(start, reservation.getStartTime());
        assertEquals(end, reservation.getEndTime());
        assertEquals(ReservationStatus.Active, reservation.getStatus());
        assertEquals(20.0, reservation.getDepositAmount(), 0.0001);
        assertNull(reservation.getEquipment());
        assertNull(reservation.getUser());
    }
    
    @Test
    public void setters() {
    	LocalDateTime start_n = LocalDateTime.of(2026, 4, 11, 13, 0);
        LocalDateTime end_n = LocalDateTime.of(2026, 4, 11, 14, 0);
        Equipment EQ2 = new Equipment("R3", "LEDs", "Lab 5", EquipmentStatus.Available);
        Guest guest = new Guest(
    			"guest2", 
    			"Guest 2", 
    			"guest2@yorku.ca", 
    			"helloGuest", 
    			"G2",
    			"EECS",
    			AccountStatus.Active
    	);

        reservation.setReservationId("R2");
        reservation.setStartTime(start_n);
        reservation.setEndTime(end_n);
        reservation.setStatus(ReservationStatus.Cancelled);
        reservation.setDepositAmount(30.0);
        reservation.setEquipment(EQ2);
        reservation.setUser(guest);
        

        assertEquals("R2", reservation.getReservationId());
        assertEquals(start_n, reservation.getStartTime());
        assertEquals(end_n, reservation.getEndTime());
        assertEquals(ReservationStatus.Cancelled, reservation.getStatus());
        assertEquals(30.0, reservation.getDepositAmount(), 0.0001);
        assertEquals(EQ2, reservation.getEquipment());
        assertEquals(guest, reservation.getUser());
    }
    
    
}
