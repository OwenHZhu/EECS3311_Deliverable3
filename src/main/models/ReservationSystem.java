package main.models;

import main.enums.AccountStatus;
import main.enums.ApprovalStatus;
import main.enums.PaymentMethod;
import main.enums.ReservationStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ReservationSystem {
    private final List<User> users = new ArrayList<>();
    private final List<Equipment> equipmentItems = new ArrayList<>();
    private final List<Reservation> reservations = new ArrayList<>();
    private final List<Payment> payments = new ArrayList<>();
    private final HeadLabCoordinator headLabCoordinator;

    public ReservationSystem() {
        this.headLabCoordinator = HeadLabCoordinator.getInstance(
                "head",
                "Head Lab Coordinator",
                "head@yorku.ca",
                "Head@1234",
                "HeadLab",
                "Lab",
                AccountStatus.Active
        );
    }

    HeadLabCoordinator getHeadLabCoordinator() {
        return headLabCoordinator;
    }

    public User registerUser(User user) {
        Objects.requireNonNull(user, "User cannot be null.");

        for (User existing : users) {
            if (existing.getEmail().equalsIgnoreCase(user.getEmail())) {
                throw new IllegalArgumentException("Email must be unique.");
            }
        }

        if (!user.isPasswordStrong()) {
            throw new IllegalArgumentException("Password does not meet strength requirements.");
        }

        if (user.isUniversityAffiliated()) {
            user.setStatus(AccountStatus.PendingApproval);
            ApprovalRequest request = new ApprovalRequest(UUID.randomUUID().toString(), ApprovalStatus.Pending);
            user.addApprovalRequest(request);
        } else {
            user.setStatus(AccountStatus.Active);
        }

        users.add(user);
        return user;
    }

    public void approveUser(User user, boolean approved) {
        if (headLabCoordinator == null || headLabCoordinator.getStatus() != AccountStatus.Active) {
            throw new IllegalStateException("Head lab coordinator must be active to approve users.");
        }

        Objects.requireNonNull(user, "User cannot be null.");

        if (!user.isUniversityAffiliated()) {
            return;
        }

        List<ApprovalRequest> requests = user.getApprovalRequests();

        if (requests.isEmpty()) {
            throw new IllegalStateException("No approval request found for user.");
        }

        ApprovalRequest latest = requests.get(requests.size() - 1);

        if (approved) {
            latest.approve();
            user.setStatus(AccountStatus.Active);
        } else {
            latest.reject();
            user.setStatus(AccountStatus.Rejected);
        }
    }

    public User login(String emailOrUserId, String password) {
        Objects.requireNonNull(emailOrUserId, "emailOrUserId cannot be null.");
        Objects.requireNonNull(password, "password cannot be null.");

        if (headLabCoordinator != null) {
            boolean idMatches = headLabCoordinator.getUserId() != null
                    && headLabCoordinator.getUserId().equalsIgnoreCase(emailOrUserId);
            boolean emailMatches = headLabCoordinator.getEmail() != null
                    && headLabCoordinator.getEmail().equalsIgnoreCase(emailOrUserId);
            if ((idMatches || emailMatches) && headLabCoordinator.getStatus() == AccountStatus.Active) {
                if (headLabCoordinator.getPassword() != null && headLabCoordinator.getPassword().equals(password)) {
                    return headLabCoordinator;
                }
            }
        }

        for (User u : users) {
            if (u.getUserId() != null && u.getUserId().equalsIgnoreCase(emailOrUserId)) {
                return authenticate(u, password);
            }
            if (u.getEmail() != null && u.getEmail().equalsIgnoreCase(emailOrUserId)) {
                return authenticate(u, password);
            }
        }
        return null;
    }

    public LabManagerUser createLabManagerAccount(HeadLabCoordinator actor,
                                                   String name,
                                                   String email,
                                                   String password,
                                                   String idOrCertificationNumber,
                                                   String department) {
        if (actor == null) {
            throw new IllegalArgumentException("actor cannot be null.");
        }
        if (headLabCoordinator == null) {
            throw new IllegalStateException("Head lab coordinator not initialized.");
        }
        if (actor != headLabCoordinator || headLabCoordinator.getStatus() != AccountStatus.Active) {
            throw new IllegalStateException("Only the active head lab coordinator can create lab manager accounts.");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be blank.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("email cannot be blank.");
        }
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("password cannot be blank.");
        }
        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("department cannot be blank.");
        }

        LabManagerUser manager = new LabManagerUser(
                UUID.randomUUID().toString(),
                name,
                email,
                password,
                idOrCertificationNumber,
                department,
                AccountStatus.Active,
                actor.createLabManager()
        );
        return (LabManagerUser) registerUser(manager);
    }

    private User authenticate(User u, String password) {
        if (u.getStatus() != AccountStatus.Active) {
            return null;
        }
        if (u.getPassword() == null) {
            return null;
        }
        if (!u.getPassword().equals(password)) {
            return null;
        }
        return u;
    }

    void loadFromDatabase(List<User> loadedUsers,
                           List<Equipment> loadedEquipment,
                           List<Reservation> loadedReservations,
                           List<Payment> loadedPayments) {
        users.clear();
        equipmentItems.clear();
        reservations.clear();
        payments.clear();

        if (loadedUsers != null) {
            users.addAll(loadedUsers);
        }
        if (loadedEquipment != null) {
            equipmentItems.addAll(loadedEquipment);
        }
        if (loadedReservations != null) {
            reservations.addAll(loadedReservations);
        }
        if (loadedPayments != null) {
            payments.addAll(loadedPayments);
        }
    }

    public List<Reservation> getReservationsForUser(String userId) {
        if (userId == null) {
            return List.of();
        }
        List<Reservation> out = new ArrayList<>();
        for (Reservation r : reservations) {
            if (r.getUser() != null && r.getUser().getUserId() != null && r.getUser().getUserId().equalsIgnoreCase(userId)) {
                out.add(r);
            }
        }
        return out;
    }

    public void addEquipment(Equipment equipment) {
        Objects.requireNonNull(equipment, "Equipment cannot be null.");

        for (Equipment existing : equipmentItems) {
            if (existing.getEquipmentId().equalsIgnoreCase(equipment.getEquipmentId())) {
                throw new IllegalArgumentException("Equipment ID must be unique.");
            }
        }

        equipmentItems.add(equipment);
    }

    public Reservation createReservation(User user,
                                         Equipment equipment,
                                         LocalDateTime startTime,
                                         LocalDateTime endTime,
                                         PaymentMethod paymentMethod) {
        Objects.requireNonNull(user, "User cannot be null.");
        Objects.requireNonNull(equipment, "Equipment cannot be null.");
        Objects.requireNonNull(startTime, "Start time cannot be null.");
        Objects.requireNonNull(endTime, "End time cannot be null.");

        if (!endTime.isAfter(startTime)) {
            throw new IllegalArgumentException("End time must be after start time.");
        }

        if (user.getStatus() != AccountStatus.Active) {
            throw new IllegalStateException("User must have an active account.");
        }

        if (!equipment.isAvailable()) {
            throw new IllegalStateException("Equipment is not available.");
        }

        if (!isEquipmentFree(equipment, startTime, endTime, null)) {
            throw new IllegalStateException("Equipment already reserved for the requested time.");
        }

        double hourlyRate = user.getHourlyRate();
        double deposit = hourlyRate;
        String reservationId = UUID.randomUUID().toString();

        Reservation reservation = new Reservation(
                reservationId,
                startTime,
                endTime,
                ReservationStatus.Active,
                deposit,
                equipment,
                user
        );

        reservations.add(reservation);
        user.addReservation(reservation);
        equipment.reserve();

        Payment depositPayment = new Payment(UUID.randomUUID().toString(), deposit, paymentMethod);
        if (!depositPayment.processPayment()) {
            throw new IllegalStateException("Deposit payment was not processed.");
        }
        payments.add(depositPayment);
        user.addPayment(depositPayment);

        return reservation;
    }

    public void cancelReservation(Reservation reservation, LocalDateTime now) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        reservation.cancel(now);
        reservation.getEquipment().enable();
    }

    public void extendReservation(Reservation reservation, LocalDateTime newEndTime) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        Objects.requireNonNull(newEndTime, "New end time cannot be null.");

        if (!isEquipmentFree(reservation.getEquipment(), reservation.getEndTime(), newEndTime, reservation)) {
            throw new IllegalStateException("Equipment is not free for the extension period.");
        }

        reservation.extend(newEndTime);
    }

    public void modifyReservation(Reservation reservation,
                                    LocalDateTime newStartTime,
                                    LocalDateTime newEndTime,
                                    LocalDateTime now) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        Objects.requireNonNull(newStartTime, "newStartTime cannot be null.");
        Objects.requireNonNull(newEndTime, "newEndTime cannot be null.");
        Objects.requireNonNull(now, "now cannot be null.");

        if (reservation.getStatus() != ReservationStatus.Active) {
            throw new IllegalStateException("Only active reservations can be modified.");
        }
        if (!isEquipmentFree(reservation.getEquipment(), newStartTime, newEndTime, reservation)) {
            throw new IllegalStateException("Equipment already reserved for the requested time.");
        }

        reservation.modify(newStartTime, newEndTime, now);
    }

    public double completeReservation(Reservation reservation, LocalDateTime actualEndTime, PaymentMethod method) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        Objects.requireNonNull(actualEndTime, "actualEndTime cannot be null.");
        Objects.requireNonNull(method, "payment method cannot be null.");

        if (reservation.getStatus() == ReservationStatus.NoShow) {
            throw new IllegalStateException("No-show reservations cannot be completed.");
        }

        double hourlyRate = reservation.getUser().getHourlyRate();
        double remaining = reservation.calculateCost(hourlyRate, actualEndTime);
        reservation.setStatus(ReservationStatus.Completed);
        reservation.getEquipment().enable();

        if (remaining > 0) {
            Payment finalPayment = new Payment(UUID.randomUUID().toString(), remaining, method);
            if (!finalPayment.processPayment()) {
                throw new IllegalStateException("Final payment was not processed.");
            }
            payments.add(finalPayment);
            reservation.getUser().addPayment(finalPayment);
        }

        return remaining;
    }

    public void recordArrival(Reservation reservation, LocalDateTime arrivalTime) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        reservation.checkArrival(arrivalTime);

        if (reservation.getStatus() == ReservationStatus.NoShow) {
            reservation.getEquipment().enable();
        }
    }

    private boolean isEquipmentFree(Equipment equipment,
                                    LocalDateTime start,
                                    LocalDateTime end,
                                    Reservation ignoring) {
        for (Reservation r : reservations) {
            if (r == ignoring) {
                continue;
            }
            if (!r.getEquipment().getEquipmentId().equalsIgnoreCase(equipment.getEquipmentId())) {
                continue;
            }
            if (r.getStatus() == ReservationStatus.Cancelled
                    || r.getStatus() == ReservationStatus.NoShow
                    || r.getStatus() == ReservationStatus.Completed) {
                continue;
            }
            // Overlap if start < otherEnd AND end > otherStart.
            // This treats end==otherStart as non-overlapping (back-to-back allowed).
            boolean overlaps = start.isBefore(r.getEndTime()) && end.isAfter(r.getStartTime());
            if (overlaps) {
                return false;
            }
        }
        
        return true;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<Equipment> getEquipmentItems() {
        return new ArrayList<>(equipmentItems);
    }

    public List<Reservation> getReservations() {
        return new ArrayList<>(reservations);
    }

    public List<Payment> getPayments() {
        return new ArrayList<>(payments);
    }
}

