package ai_assistant;

import main.enums.ReservationStatus;
import main.models.Reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;


public class ReservationAITest { 
 
    private Reservation reservation;
    private LocalDateTime start;
    private LocalDateTime end;

    @Before
    public void setUp() {
        start = LocalDateTime.of(2026, 4, 10, 10, 0);
        end = LocalDateTime.of(2026, 4, 10, 12, 0);

        reservation = new Reservation(
                "R001",
                start,
                end,
                ReservationStatus.Active,
                20.0,
                null,
                null
        );
    }

    @Test
    public void activate_whenStatusNotActive_setsStatusToActive() {
        reservation.setStatus(ReservationStatus.Cancelled);
        reservation.activate();
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void activate_whenAlreadyActive_keepsStatusActive() {
        reservation.activate();
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void modify_beforeStart_withValidTimes_updatesStartAndEnd() {
        LocalDateTime now = start.minusHours(1);
        LocalDateTime newStart = start.plusDays(1);
        LocalDateTime newEnd = end.plusDays(1);

        reservation.modify(newStart, newEnd, now);

        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void modify_atStart_throwsIllegalStateException() {
        assertThrows(IllegalStateException.class, () ->
                reservation.modify(start.plusHours(1), end.plusHours(1), start)
        );
    }

    @Test
    public void modify_afterStart_throwsIllegalStateException() {
        assertThrows(IllegalStateException.class, () ->
                reservation.modify(start.plusHours(1), end.plusHours(1), start.plusMinutes(1))
        );
    }

    @Test
    public void modify_withNullStart_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.modify(null, end.plusHours(1), start.minusHours(1))
        );
    }

    @Test
    public void modify_withNullEnd_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.modify(start.plusHours(1), null, start.minusHours(1))
        );
    }

    @Test
    public void modify_withEndNotAfterStart_throwsIllegalArgumentException() {
        LocalDateTime newStart = start.plusDays(1);
        LocalDateTime newEnd = newStart;

        assertThrows(IllegalArgumentException.class, () ->
                reservation.modify(newStart, newEnd, start.minusHours(1))
        );
    }

    @Test
    public void cancel_beforeStart_setsStatusCancelled() {
        reservation.cancel(start.minusMinutes(1));
        assertEquals(ReservationStatus.Cancelled, reservation.getStatus());
    }

    @Test
    public void cancel_atStart_throwsIllegalStateException() {
        assertThrows(IllegalStateException.class, () ->
                reservation.cancel(start)
        );
    }

    @Test
    public void cancel_afterStart_throwsIllegalStateException() {
        assertThrows(IllegalStateException.class, () ->
                reservation.cancel(start.plusMinutes(5))
        );
    }

    @Test
    public void extend_withValidLaterTime_updatesEndTime() {
        LocalDateTime newEnd = end.plusHours(1);
        reservation.extend(newEnd);
        assertEquals(newEnd, reservation.getEndTime());
    }

    @Test
    public void extend_withNull_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.extend(null)
        );
    }

    @Test
    public void extend_withSameEndTime_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.extend(end)
        );
    }

    @Test
    public void extend_withEarlierEndTime_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                reservation.extend(end.minusMinutes(1))
        );
    }

    @Test
    public void calculateCost_whenNoShow_returnsZero() {
        reservation.setStatus(ReservationStatus.NoShow);
        double cost = reservation.calculateCost(10.0, null);
        assertEquals(0.0, cost, 0.0001);
    }

    @Test
    public void calculateCost_withNormalEndTime_returnsCostMinusDeposit() {
        double cost = reservation.calculateCost(15.0, null);
        assertEquals(10.0, cost, 0.0001); // 2 hours * 15 = 30, minus 20 deposit = 10
    }

    @Test
    public void calculateCost_withActualEndTimeAfterStart_usesActualEndTime() {
        LocalDateTime actualEnd = start.plusHours(3);
        double cost = reservation.calculateCost(10.0, actualEnd);
        assertEquals(10.0, cost, 0.0001); // 3 hours * 10 = 30, minus 20 deposit = 10
    }

    @Test
    public void calculateCost_whenTotalCostLessThanDeposit_returnsZero() {
        double cost = reservation.calculateCost(5.0, null);
        assertEquals(0.0, cost, 0.0001); // 2 hours * 5 = 10, deposit = 20
    }

    @Test
    public void calculateCost_whenActualEndNotAfterStart_fallsBackToScheduledEnd() {
        LocalDateTime actualEnd = start.minusMinutes(10);
        double cost = reservation.calculateCost(15.0, actualEnd);
        assertEquals(10.0, cost, 0.0001); // falls back to scheduled end
    }

    @Test
    public void checkArrival_withNull_setsNoShow() {
        reservation.checkArrival(null);
        assertEquals(ReservationStatus.NoShow, reservation.getStatus());
    }

    @Test
    public void checkArrival_withArrivalBefore20Minutes_setsActive() {
        reservation.checkArrival(start.plusMinutes(10));
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void checkArrival_exactly20MinutesLate_setsActive() {
        reservation.checkArrival(start.plusMinutes(20));
        assertEquals(ReservationStatus.Active, reservation.getStatus());
    }

    @Test
    public void checkArrival_after20Minutes_setsNoShow() {
        reservation.checkArrival(start.plusMinutes(21));
        assertEquals(ReservationStatus.NoShow, reservation.getStatus());
    }

    @Test
    public void gettersAndSetters_workCorrectly() {
        LocalDateTime newStart = start.plusDays(2);
        LocalDateTime newEnd = end.plusDays(2);

        reservation.setReservationId("R999");
        reservation.setStartTime(newStart);
        reservation.setEndTime(newEnd);
        reservation.setStatus(ReservationStatus.Completed);
        reservation.setDepositAmount(50.0);

        assertEquals("R999", reservation.getReservationId());
        assertEquals(newStart, reservation.getStartTime());
        assertEquals(newEnd, reservation.getEndTime());
        assertEquals(ReservationStatus.Completed, reservation.getStatus());
        assertEquals(50.0, reservation.getDepositAmount(), 0.0001);
        assertNull(reservation.getEquipment());
        assertNull(reservation.getUser());
    }
}
