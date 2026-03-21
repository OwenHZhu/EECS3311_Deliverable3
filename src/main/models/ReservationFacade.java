package main.models;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
import main.enums.PaymentMethod;
import main.enums.SensorStatus;
import main.enums.ReservationStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ReservationFacade {
    private final ReservationSystem reservationSystem;
    private final DatabaseProxy database;

    public ReservationFacade() {
        this.reservationSystem = new ReservationSystem();
        this.database = new DatabaseProxy(CSVDatabaseManager.getInstance());
        seedIfEmpty();
        loadFromDatabase();
    }

    private void seedIfEmpty() {
        List<Equipment> existingEquipment = database.readEquipment();
        List<User> existingUsers = database.readUsers();

        boolean seeded = false;
        List<Equipment> equipmentToWrite = existingEquipment;
        if (equipmentToWrite == null) {
            equipmentToWrite = new ArrayList<>();
        }

        if (equipmentToWrite.isEmpty()) {
            Equipment eq1 = new Equipment("EQ1", "Projector", "Lab A", EquipmentStatus.Available);
            Equipment eq2 = new Equipment("EQ2", "Microscope", "Lab B", EquipmentStatus.Available);
            Equipment eq3 = new Equipment("EQ3", "Oscilloscope", "Lab C", EquipmentStatus.Available);

            // Attach at least one sensor observer chain for the Observer pattern.
            Sensor s1 = new Sensor("S_EQ1_1", SensorStatus.Active);
            s1.attach(eq1);
            eq1.addSensor(s1);

            Sensor s2 = new Sensor("S_EQ2_1", SensorStatus.Active);
            s2.attach(eq2);
            eq2.addSensor(s2);

            equipmentToWrite.add(eq1);
            equipmentToWrite.add(eq2);
            equipmentToWrite.add(eq3);
            database.writeEquipment(equipmentToWrite);
            seeded = true;
        }

        if (existingUsers == null || existingUsers.isEmpty()) {
            // Demo guest account so login works without extra GUI setup.
            User demo = new Guest(
                    "demoGuest",
                    "Demo Guest",
                    "demo@example.com",
                    "DemoStrong@123",
                    "ID-DEMO",
                    "EECS",
                    AccountStatus.Active
            );

            database.writeUsers(List.of(demo));
            seeded = true;
        }

        if (seeded) {
            // Ensure other snapshots exist (empty lists are fine).
            if (database.readReservations() == null) {
                database.writeReservations(List.of());
            }
            if (database.readPayments() == null) {
                database.writePayments(List.of());
            }
        }
    }

    private void loadFromDatabase() {
        reservationSystem.loadFromDatabase(
                database.readUsers(),
                database.readEquipment(),
                database.readReservations(),
                database.readPayments()
        );
    }
    
    public List<User> getAllUsers() {
        return reservationSystem.getUsers();
    }

    public boolean reserveReservation(String userId, String equipmentId, String timeSlot, PaymentMethod method) {
        Objects.requireNonNull(userId, "userId cannot be null.");
        Objects.requireNonNull(equipmentId, "equipmentId cannot be null.");
        Objects.requireNonNull(timeSlot, "timeSlot cannot be null.");
        Objects.requireNonNull(method, "payment method cannot be null.");

        String[] parts = timeSlot.split("\\|");
        if (parts.length != 2) {
            return false;
        }

        try {
            LocalDateTime start = LocalDateTime.parse(parts[0]);
            LocalDateTime end = LocalDateTime.parse(parts[1]);
            return reserveReservation(userId, equipmentId, start, end, method);
        } catch (DateTimeParseException ex) {
            return false;
        }
    }

    public boolean reserveReservation(String userId,
                                        String equipmentId,
                                        LocalDateTime start,
                                        LocalDateTime end,
                                        PaymentMethod method) {
        User user = findUser(userId);
        Equipment equipment = findEquipment(equipmentId);
        if (user == null || equipment == null) {
            return false;
        }

        try {
            reservationSystem.createReservation(user, equipment, start, end, method);
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public boolean cancelReservation(String reservationId, LocalDateTime now) {
        Objects.requireNonNull(reservationId, "reservationId cannot be null.");
        Objects.requireNonNull(now, "now cannot be null.");
        Reservation r = findReservation(reservationId);
        if (r == null) {
            return false;
        }
        try {
            if (r.getStatus() == ReservationStatus.Cancelled) {
                return false;
            }
            reservationSystem.cancelReservation(r, now);
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }
    
    public String recordArrival(String reservationId, LocalDateTime arrivalTime) {
        Objects.requireNonNull(reservationId, "reservationId cannot be null.");
        Reservation r = findReservation(reservationId);
        if (r == null) return "Reservation not found.";
        reservationSystem.recordArrival(r, arrivalTime);
        persistSnapshot();
        if (r.getStatus() == ReservationStatus.NoShow) {
            return "LATE ARRIVAL — deposit of $" + String.format("%.2f", r.getDepositAmount()) + " is forfeited.";
        }
        return "ON TIME — deposit of $" + String.format("%.2f", r.getDepositAmount()) + " will be deducted from total.";
    }

    public boolean extendReservation(String reservationId, LocalDateTime newEndTime) {
        Objects.requireNonNull(reservationId, "reservationId cannot be null.");
        Objects.requireNonNull(newEndTime, "newEndTime cannot be null.");
        Reservation r = findReservation(reservationId);
        if (r == null) {
            return false;
        }
        try {
            reservationSystem.extendReservation(r, newEndTime);
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }
    
    
    public boolean modifyReservation(String reservationId, LocalDateTime newStart, LocalDateTime newEnd, LocalDateTime now) {
        Objects.requireNonNull(reservationId, "reservationId cannot be null.");
        Objects.requireNonNull(newStart, "newStart cannot be null.");
        Objects.requireNonNull(newEnd, "newEnd cannot be null.");
        Objects.requireNonNull(now, "now cannot be null.");
        Reservation r = findReservation(reservationId);
        if (r == null) {
            return false;
        }
        try {
            reservationSystem.modifyReservation(r, newStart, newEnd, now);
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public User loginUser(String emailOrUserId, String password) {
        if (emailOrUserId == null || password == null) {
            return null;
        }
        return reservationSystem.login(emailOrUserId, password);
    }

    public List<Equipment> listEquipment() {
        return reservationSystem.getEquipmentItems();
    }

    public List<Reservation> listReservationsByUserId(String userId) {
        return reservationSystem.getReservationsForUser(userId);
    }

    public Reservation getReservationById(String reservationId) {
        return findReservation(reservationId);
    }

    public boolean enableEquipment(String equipmentId) {
        if (!canManageEquipment()) {
            return false;
        }
        Equipment e = findEquipment(equipmentId);
        if (e == null) return false;
        try {
            e.enable();
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public boolean disableEquipment(String equipmentId) {
        if (!canManageEquipment()) {
            return false;
        }
        Equipment e = findEquipment(equipmentId);
        if (e == null) return false;
        try {
            e.disable();
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public boolean markEquipmentUnderMaintenance(String equipmentId) {
        if (!canManageEquipment()) {
            return false;
        }
        Equipment e = findEquipment(equipmentId);
        if (e == null) return false;
        try {
            e.markUnderMaintenance();
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    public boolean createLabManagerAccountFromHead(
    		String name,
            String email,
            String password,
            String idOrCertificationNumber,
            String department) {
        User actor = getCurrentUser();
        if (!(actor instanceof HeadLabCoordinator)) {
            return false;
        }
        try {
            reservationSystem.createLabManagerAccount((HeadLabCoordinator) actor,
                    name,
                    email,
                    password,
                    idOrCertificationNumber,
                    department);
            persistSnapshot();
            return true;
        } catch (RuntimeException ex) {
            return false;
        }
    }

    private boolean canManageEquipment() {
        User actor = getCurrentUser();
        return actor instanceof LabManagerUser || actor instanceof HeadLabCoordinator;
    }

    private User getCurrentUser() {
        UserSession s = AppBackend.getInstance().getSession();
        String id = s == null ? null : s.getCurrentUserId();
        if (id == null) {
            return null;
        }
        for (User u : reservationSystem.getUsers()) {
            if (u.getUserId() != null && u.getUserId().equalsIgnoreCase(id)) {
                return u;
            }
        }
        HeadLabCoordinator head = reservationSystem.getHeadLabCoordinator();
        if (head != null && head.getUserId() != null && head.getUserId().equalsIgnoreCase(id)) {
            return head;
        }
        return null;
    }

    public String displayMessage(String message) {
        return message == null ? "" : message;
    }

    public User registerUser(String userType,
                              String userId,
                              String name,
                              String email,
                              String password,
                              String idOrCertificationNumber,
                              String department) {
        AccountStatus status = "guest".equalsIgnoreCase(userType)
                ? AccountStatus.Active
                : AccountStatus.PendingApproval;
        User u = UserFactory.createUser(userType, userId, name, email, password, idOrCertificationNumber, department, status);
        User created = reservationSystem.registerUser(u);
        persistSnapshot();
        return created;
    }

    public User registerUserAutoId(String userType,
                                     String name,
                                     String email,
                                     String password,
                                     String idOrCertificationNumber,
                                     String department) {
        String userId = UUID.randomUUID().toString();
        return registerUser(userType, userId, name, email, password, idOrCertificationNumber, department);
    }

    public void approveUser(User user, boolean approved) {
        reservationSystem.approveUser(user, approved);
        persistSnapshot();
    }

    private void persistSnapshot() {
        database.writeUsers(reservationSystem.getUsers());
        database.writeEquipment(reservationSystem.getEquipmentItems());
        database.writeReservations(reservationSystem.getReservations());
        database.writePayments(reservationSystem.getPayments());
    }

    private User findUser(String userId) {
        if (userId == null) return null;
        for (User u : reservationSystem.getUsers()) {
            if (u.getUserId() != null && u.getUserId().equals(userId)) {
                return u;
            }
        }
        return null;
    }

    private Equipment findEquipment(String equipmentId) {
        if (equipmentId == null) return null;
        for (Equipment e : reservationSystem.getEquipmentItems()) {
            if (e.getEquipmentId() != null && e.getEquipmentId().equalsIgnoreCase(equipmentId)) {
                return e;
            }
        }
        return null;
    }

    private Reservation findReservation(String reservationId) {
        if (reservationId == null) return null;
        for (Reservation r : reservationSystem.getReservations()) {
            if (reservationId.equalsIgnoreCase(r.getReservationId())) {
                return r;
            }
        }
        return null;
    }

    public static String newReservationId() {
        return UUID.randomUUID().toString();
    }
}

