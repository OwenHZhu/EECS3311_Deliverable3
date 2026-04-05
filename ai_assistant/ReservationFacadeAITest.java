package ai_assistant;

import main.models.*;
import main.enums.PaymentMethod;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;


public class ReservationFacadeAITest {
   
    private ReservationFacade facade;

    @Before
    public void setUp() {
        facade = new ReservationFacade();
    }

    @Test
    public void displayMessage_null_returnsEmptyString() {
        assertEquals("", facade.displayMessage(null));
    }

    @Test
    public void displayMessage_valid_returnsSameMessage() {
        assertEquals("Hello", facade.displayMessage("Hello"));
    }

    @Test
    public void getAllUsers_notNull() {
        assertNotNull(facade.getAllUsers());
    }

    @Test
    public void loginUser_nullInputs_returnsNull() {
        assertNull(facade.loginUser(null, null));
    }

    @Test
    public void loginUser_invalidCredentials_returnsNull() {
        assertNull(facade.loginUser("wrong", "wrong"));
    }

    @Test
    public void registerUser_validGuest_returnsUser() {
        User user = facade.registerUser(
                "guest",
                "U123",
                "Test User",
                "test@example.com",
                "Password123!",
                "ID1",
                "EECS"
        );

        assertNotNull(user);
        assertEquals("U123", user.getUserId());
    }

    @Test
    public void registerUserAutoId_generatesUser() {
        User user = facade.registerUserAutoId(
                "guest",
                "Auto User",
                "auto@example.com",
                "Password123!",
                "ID2",
                "EECS"
        );

        assertNotNull(user);
        assertNotNull(user.getUserId());
    }

    @Test
    public void listEquipment_notEmptyAfterSeed() {
        List<Equipment> equipment = facade.listEquipment();
        assertNotNull(equipment);
        assertFalse(equipment.isEmpty());
    }

    @Test
    public void enableEquipment_invalidId_returnsFalse() {
        assertFalse(facade.enableEquipment("INVALID"));
    }

    @Test
    public void disableEquipment_invalidId_returnsFalse() {
        assertFalse(facade.disableEquipment("INVALID"));
    }

    @Test
    public void reserveReservation_invalidTimeFormat_returnsFalse() {
        boolean result = facade.reserveReservation(
                "demoGuest",
                "EQ1",
                "invalid-format",
                PaymentMethod.Credit
        );

        assertFalse(result);
    }

    @Test
    public void reserveReservation_nullInputs_throwsException() {
        assertThrows(NullPointerException.class, () ->
                facade.reserveReservation(null, "EQ1", "2025-01-01T10:00|2025-01-01T11:00", PaymentMethod.Credit)
        );
    }

    @Test
    public void reserveReservation_validInput_returnsTrue() {
        boolean result = facade.reserveReservation(
                "demoGuest",
                "EQ1",
                "2025-01-01T10:00|2025-01-01T11:00",
                PaymentMethod.Credit
        );

        assertTrue(result);
    }

    @Test
    public void listReservationsByUserId_validUser_returnsList() {
        List<Reservation> list = facade.listReservationsByUserId("demoGuest");
        assertNotNull(list);
    }

    @Test
    public void getReservationById_invalid_returnsNull() {
        assertNull(facade.getReservationById("INVALID"));
    }
    
    @Test
    public void cancelReservation_invalidId_returnsFalse() {
        boolean result = facade.cancelReservation("INVALID", LocalDateTime.now());
        assertFalse(result);
    }

    @Test
    public void extendReservation_invalidId_returnsFalse() {
        boolean result = facade.extendReservation("INVALID", LocalDateTime.now().plusHours(1));
        assertFalse(result);
    }

    @Test
    public void modifyReservation_invalidId_returnsFalse() {
        boolean result = facade.modifyReservation(
                "INVALID",
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now()
        );

        assertFalse(result);
    }

    @Test
    public void recordArrival_invalidReservation_returnsMessage() {
        String msg = facade.recordArrival("INVALID", LocalDateTime.now());
        assertEquals("Reservation not found.", msg);
    }

    @Test
    public void newReservationId_notNullAndUnique() {
        String id1 = ReservationFacade.newReservationId();
        String id2 = ReservationFacade.newReservationId();

        assertNotNull(id1);
        assertNotNull(id2);
        assertNotEquals(id1, id2);
    }
}
