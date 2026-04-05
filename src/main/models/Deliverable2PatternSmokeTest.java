package main.models;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.enums.PaymentMethod;
import main.enums.ReservationStatus;

import java.time.LocalDateTime;

public class Deliverable3PatternSmokeTest {
    public static void main(String[] args) {
        testPasswordVerification();
        testSingletonHeadLabCoordinator();
        testApprovalWorkflow();
        testLabManagerCreation();
        testReservationOverlap();
        testCancelCutoffRule();
        testModifyConflictRule();
        testExtensionAvailability();
        testLateArrivalNoShowForfeitDeposit();
        System.out.println("All smoke tests passed.");
    }

    private static void testPasswordVerification() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ1", "Projector", "Room 1", EquipmentStatus.Available);
        system.addEquipment(eq);

        User weakStudent = new Student("U1", "Alice", "alice@example.com", "weakpw", "S123", "CS", AccountStatus.Active);
        boolean threw = false;
        try {
            system.registerUser(weakStudent);
        } catch (IllegalArgumentException ex) {
            threw = true;
        }
        assert threw : "Expected weak password to be rejected.";
    }

    private static void testSingletonHeadLabCoordinator() {
        HeadLabCoordinator a = HeadLabCoordinator.getInstance("h1", "A", "a@x.com", "Head@1234", "HL1", "Lab", AccountStatus.Active);
        HeadLabCoordinator b = HeadLabCoordinator.getInstance("h2", "B", "b@x.com", "Head@1234", "HL2", "Lab", AccountStatus.Active);
        assert a == b : "HeadLabCoordinator should be a singleton instance.";
    }

    private static void testApprovalWorkflow() {
        ReservationSystem system = new ReservationSystem();
        User s = new Student("U2", "Bob", "bob@example.com", "Strong@123", "S200", "EECS", AccountStatus.Active);
        system.registerUser(s);
        assert s.getStatus() == AccountStatus.PendingApproval : "Affiliated users should start pending approval.";

        system.approveUser(s, true);
        assert s.getStatus() == AccountStatus.Active : "Approved users should become active.";

        User s2 = new Student("U3", "Carol", "carol@example.com", "Strong@123", "S201", "EECS", AccountStatus.Active);
        system.registerUser(s2);
        system.approveUser(s2, false);
        assert s2.getStatus() == AccountStatus.Rejected : "Rejected users should be rejected/suspended.";
    }

    private static void testLabManagerCreation() {
        ReservationSystem system = new ReservationSystem();
        HeadLabCoordinator head = system.getHeadLabCoordinator();

        LabManagerUser manager = system.createLabManagerAccount(
                head,
                "Manager One",
                "mgr1@example.com",
                "Strong@123",
                "MGR-1",
                "EECS"
        );
        assert manager.getStatus() == AccountStatus.Active : "Lab managers should be active immediately.";

        User loggedIn = system.login("mgr1@example.com", "Strong@123");
        assert loggedIn instanceof LabManagerUser : "Login should return a lab manager user.";
    }

    private static void testReservationOverlap() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ2", "Microscope", "Room 2", EquipmentStatus.Available);
        system.addEquipment(eq);

        User guest = new Guest("G1", "Guest", "guest@example.com", "Strong@123", "C1", "X", AccountStatus.Active);
        system.registerUser(guest);

        LocalDateTime base = LocalDateTime.of(2026, 3, 20, 10, 0);
        system.createReservation(guest, eq, base, base.plusHours(1), PaymentMethod.Credit);

        boolean threw = false;
        try {
            system.createReservation(guest, eq, base.plusMinutes(30), base.plusHours(1).plusMinutes(30), PaymentMethod.Debit);
        } catch (RuntimeException ex) {
            threw = true;
        }
        assert threw : "Overlapping reservation should be rejected.";
    }

    private static void testCancelCutoffRule() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ3", "Oscilloscope", "Room 3", EquipmentStatus.Available);
        system.addEquipment(eq);

        User guest = new Guest("G2", "Guest2", "guest2@example.com", "Strong@123", "C2", "X", AccountStatus.Active);
        system.registerUser(guest);

        LocalDateTime base = LocalDateTime.of(2026, 3, 20, 10, 0);
        Reservation r = system.createReservation(guest, eq, base, base.plusHours(1), PaymentMethod.Credit);

        boolean threw = false;
        try {
            system.cancelReservation(r, base.plusMinutes(0));
        } catch (RuntimeException ex) {
            threw = true;
        }
        assert threw : "Cancelling at/after start time should be rejected.";
    }

    private static void testModifyConflictRule() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ4", "3D Printer", "Room 4", EquipmentStatus.Available);
        system.addEquipment(eq);

        User guest = new Guest("G3", "Guest3", "guest3@example.com", "Strong@123", "C3", "X", AccountStatus.Active);
        system.registerUser(guest);

        LocalDateTime base = LocalDateTime.of(2026, 3, 20, 10, 0);
        Reservation r1 = system.createReservation(guest, eq, base, base.plusHours(1), PaymentMethod.Credit);
        Reservation r2 = system.createReservation(guest, eq, base.plusHours(2), base.plusHours(3), PaymentMethod.Credit);

        boolean threw = false;
        try {
            // Attempt to move r1 to overlap r2
            system.modifyReservation(r1, base.plusHours(1).minusMinutes(30), base.plusHours(2).plusMinutes(30), base.minusMinutes(10));
        } catch (RuntimeException ex) {
            threw = true;
        }
        assert threw : "Modifying into an overlapping slot should be rejected.";
    }

    private static void testExtensionAvailability() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ5", "Power Supply", "Room 5", EquipmentStatus.Available);
        system.addEquipment(eq);

        User guest = new Guest("G4", "Guest4", "guest4@example.com", "Strong@123", "C4", "X", AccountStatus.Active);
        system.registerUser(guest);

        LocalDateTime base = LocalDateTime.of(2026, 3, 20, 10, 0);
        Reservation r1 = system.createReservation(guest, eq, base, base.plusHours(1), PaymentMethod.Credit);
        system.createReservation(guest, eq, base.plusHours(1), base.plusHours(2), PaymentMethod.Credit);

        boolean threw = false;
        try {
            system.extendReservation(r1, base.plusHours(2));
        } catch (RuntimeException ex) {
            threw = true;
        }
        assert threw : "Extension overlapping another reservation should be rejected.";
    }

    private static void testLateArrivalNoShowForfeitDeposit() {
        ReservationSystem system = new ReservationSystem();
        Equipment eq = new Equipment("EQ6", "Thermal Camera", "Room 6", EquipmentStatus.Available);
        system.addEquipment(eq);

        User guest = new Guest("G5", "Guest5", "guest5@example.com", "Strong@123", "C5", "X", AccountStatus.Active);
        system.registerUser(guest);

        LocalDateTime base = LocalDateTime.of(2026, 3, 20, 10, 0);
        Reservation r = system.createReservation(guest, eq, base, base.plusHours(1), PaymentMethod.Credit);

        system.recordArrival(r, base.plusMinutes(21));
        assert r.getStatus() == ReservationStatus.NoShow : "Late arrival should mark reservation as NoShow.";
        assert eq.isAvailable() : "Equipment should become available after NoShow.";
    }
}

