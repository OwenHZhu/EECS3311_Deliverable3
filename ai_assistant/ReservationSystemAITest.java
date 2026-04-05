package ai_assistant;

import main.enums.*;
import main.models.*;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;


public class ReservationSystemAITest {

    private ReservationSystem system;
    private Guest guestUser;   
    private Equipment equipment;
    private LocalDateTime start;
    private LocalDateTime end;

    @Before
    public void setUp() {
        system = new ReservationSystem();

        guestUser = new Guest(
                "guest1",
                "Guest User",
                "guest1@example.com",
                "StrongPass@123",
                "ID-G1",
                "EECS",
                AccountStatus.Active
        );

        equipment = new Equipment(
                "EQ1",
                "Projector",
                "Lab A",
                EquipmentStatus.Available
        );

        system.registerUser(guestUser);
        system.addEquipment(equipment);

        start = LocalDateTime.of(2026, 4, 15, 10, 0);
        end = LocalDateTime.of(2026, 4, 15, 12, 0);
    }

    @Test
    public void registerUser_validGuest_addsUser() {
        Guest g = new Guest(
                "guest2",
                "Another Guest",
                "guest2@example.com",
                "AnotherStrong@123",
                "ID-G2",
                "EECS",
                AccountStatus.Active
        );

        User result = system.registerUser(g);

        assertNotNull(result);
        assertEquals("guest2", result.getUserId());
        assertEquals(2, system.getUsers().size());
    }

    @Test
    public void registerUser_null_throwsException() {
        assertThrows(NullPointerException.class, () -> system.registerUser(null));
    }

    @Test
    public void registerUser_duplicateEmail_throwsException() {
        Guest duplicate = new Guest(
                "guest3",
                "Duplicate Email",
                "guest1@example.com",
                "StrongAgain@123",
                "ID-G3",
                "EECS",
                AccountStatus.Active
        );

        assertThrows(IllegalArgumentException.class, () -> system.registerUser(duplicate));
    }

    @Test
    public void registerUser_weakPassword_throwsException() {
        Guest weak = new Guest(
                "guest4",
                "Weak Password User",
                "guest4@example.com",
                "weak",
                "ID-G4",
                "EECS",
                AccountStatus.Active
        );

        assertThrows(IllegalArgumentException.class, () -> system.registerUser(weak));
    }

    @Test
    public void login_validEmailAndPassword_returnsUser() {
        User result = system.login("guest1@example.com", "StrongPass@123");
        assertNotNull(result);
        assertEquals("guest1", result.getUserId());
    }

    @Test
    public void login_validUserIdAndPassword_returnsUser() {
        User result = system.login("guest1", "StrongPass@123");
        assertNotNull(result);
        assertEquals("guest1@example.com", result.getEmail());
    }

    @Test
    public void login_wrongPassword_returnsNull() {
        User result = system.login("guest1@example.com", "WrongPassword");
        assertNull(result);
    }

    @Test
    public void login_unknownUser_returnsNull() {
        User result = system.login("unknown@example.com", "StrongPass@123");
        assertNull(result);
    }

    @Test
    public void login_nullEmailOrUserId_throwsException() {
        assertThrows(NullPointerException.class, () -> system.login(null, "StrongPass@123"));
    }

    @Test
    public void login_nullPassword_throwsException() {
        assertThrows(NullPointerException.class, () -> system.login("guest1@example.com", null));
    }

    @Test
    public void addEquipment_valid_addsEquipment() {
        Equipment eq2 = new Equipment("EQ2", "Microscope", "Lab B", EquipmentStatus.Available);
        system.addEquipment(eq2);

        assertEquals(2, system.getEquipmentItems().size());
    }

    @Test
    public void addEquipment_null_throwsException() {
        assertThrows(NullPointerException.class, () -> system.addEquipment(null));
    }

    @Test
    public void addEquipment_duplicateId_throwsException() {
        Equipment duplicate = new Equipment("EQ1", "Another Projector", "Lab Z", EquipmentStatus.Available);
        assertThrows(IllegalArgumentException.class, () -> system.addEquipment(duplicate));
    }

    @Test
    public void createReservation_validInput_createsReservation() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        assertNotNull(reservation);
        assertEquals(1, system.getReservations().size());
        assertEquals(ReservationStatus.Active, reservation.getStatus());
        assertEquals(equipment, reservation.getEquipment());
        assertEquals(guestUser, reservation.getUser());
    }

    @Test
    public void createReservation_nullUser_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.createReservation(null, equipment, start, end, PaymentMethod.Credit)
        );
    }

    @Test
    public void createReservation_nullEquipment_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.createReservation(guestUser, null, start, end, PaymentMethod.Credit)
        );
    }

    @Test
    public void createReservation_endBeforeStart_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
                system.createReservation(
                        guestUser,
                        equipment,
                        start,
                        start.minusHours(1),
                        PaymentMethod.Credit
                )
        );
    }

    @Test
    public void createReservation_sameStartAndEnd_throwsException() {
        assertThrows(IllegalArgumentException.class, () ->
                system.createReservation(
                        guestUser,
                        equipment,
                        start,
                        start,
                        PaymentMethod.Credit
                )
        );
    }

    /*
    @Test
    public void createReservation_suspendedUser_throwsException() {
        Guest suspended = new Guest(
                "guest5",
                "Inactive User",
                "inactive@example.com",
                "StrongPass@123",
                "ID-G5",
                "EECS",
                AccountStatus.Suspended
        );

        system.registerUser(suspended);

        assertThrows(IllegalStateException.class, () ->
                system.createReservation(
                		suspended,
                        equipment,
                        start.plusDays(1),
                        end.plusDays(1),
                        PaymentMethod.Credit
                )
        );
    }
    */

    @Test
    public void createReservation_unavailableEquipment_throwsException() {
        equipment.reserve();

        assertThrows(IllegalStateException.class, () ->
                system.createReservation(
                        guestUser,
                        equipment,
                        start.plusDays(1),
                        end.plusDays(1),
                        PaymentMethod.Credit
                )
        );
    }

    @Test
    public void cancelReservation_beforeStart_setsCancelledAndEnablesEquipment() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        system.cancelReservation(reservation, start.minusMinutes(30));

        assertEquals(ReservationStatus.Cancelled, reservation.getStatus());
        assertTrue(reservation.getEquipment().isAvailable());
    }

    @Test
    public void cancelReservation_nullReservation_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.cancelReservation(null, LocalDateTime.now())
        );
    }

    @Test
    public void extendReservation_validLaterTime_updatesEndTime() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        LocalDateTime newEnd = end.plusHours(1);
        system.extendReservation(reservation, newEnd);

        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void extendReservation_nullReservation_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.extendReservation(null, end.plusHours(1))
        );
    }

    @Test
    public void extendReservation_nullNewEnd_throwsException() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        assertThrows(NullPointerException.class, () ->
                system.extendReservation(reservation, null)
        );
    }

    @Test
    public void modifyReservation_validInput_updatesTimes() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        LocalDateTime newStart = start.plusDays(1);
        LocalDateTime newEnd = end.plusDays(1);
        LocalDateTime now = start.minusDays(1);

        system.modifyReservation(reservation, newStart, newEnd, now);

        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void modifyReservation_nullReservation_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.modifyReservation(null, start, end, start.minusHours(1))
        );
    }

    @Test
    public void modifyReservation_nonActiveReservation_throwsException() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );
        reservation.setStatus(ReservationStatus.Cancelled);

        assertThrows(IllegalStateException.class, () ->
                system.modifyReservation(
                        reservation,
                        start.plusDays(1),
                        end.plusDays(1),
                        start.minusDays(1)
                )
        );
    }

    @Test
    public void recordArrival_nullReservation_throwsException() {
        assertThrows(NullPointerException.class, () ->
                system.recordArrival(null, LocalDateTime.now())
        );
    }

    @Test
    public void recordArrival_lateArrival_setsNoShowAndEnablesEquipment() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        system.recordArrival(reservation, start.plusMinutes(30));

        assertEquals(ReservationStatus.NoShow, reservation.getStatus());
        assertTrue(reservation.getEquipment().isAvailable());
    }

    @Test
    public void recordArrival_onTime_setsActive() {
        Reservation reservation = system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        system.recordArrival(reservation, start.plusMinutes(10));

        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void getReservationsForUser_existingUser_returnsMatchingReservations() {
        system.createReservation(
                guestUser,
                equipment,
                start,
                end,
                PaymentMethod.Credit
        );

        List<Reservation> reservations = system.getReservationsForUser("guest1");

        assertEquals(1, reservations.size());
        assertEquals("guest1", reservations.get(0).getUser().getUserId());
    }

    @Test
    public void getReservationsForUser_null_returnsEmptyList() {
        List<Reservation> reservations = system.getReservationsForUser(null);
        assertNotNull(reservations);
        assertTrue(reservations.isEmpty());
    }

    
    @Test
    public void getters_returnCopiesNotOriginalLists() {
        List<User> users = system.getUsers();
        List<Equipment> equipmentItems = system.getEquipmentItems();

        users.clear();
        equipmentItems.clear();

        assertFalse(system.getUsers().isEmpty());
        assertFalse(system.getEquipmentItems().isEmpty());
    }
}
