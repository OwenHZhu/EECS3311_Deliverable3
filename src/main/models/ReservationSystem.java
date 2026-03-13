package main.models;

import main.enums.AccountStatus;
import main.enums.EquipmentStatus;
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
    private HeadLabCoordinator headLabCoordinator;

    public void setHeadLabCoordinator(HeadLabCoordinator coordinator) {
        this.headLabCoordinator = coordinator;
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
            ApprovalRequest request = new ApprovalRequest(UUID.randomUUID().toString(), AccountStatus.PendingApproval);
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
            user.setStatus(AccountStatus.Suspended);
        }
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
        equipment.setStatus(EquipmentStatus.Reserved);

        Payment depositPayment = new Payment(UUID.randomUUID().toString(), deposit, paymentMethod);
        payments.add(depositPayment);
        user.addPayment(depositPayment);

        return reservation;
    }

    public void cancelReservation(Reservation reservation, LocalDateTime now) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        reservation.cancel(now);
        reservation.getEquipment().setStatus(EquipmentStatus.Available);
    }

    public void extendReservation(Reservation reservation, LocalDateTime newEndTime) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        Objects.requireNonNull(newEndTime, "New end time cannot be null.");

        if (!isEquipmentFree(reservation.getEquipment(), reservation.getEndTime(), newEndTime, reservation)) {
            throw new IllegalStateException("Equipment is not free for the extension period.");
        }

        reservation.extend(newEndTime);
    }

    public double completeReservation(Reservation reservation, LocalDateTime actualEndTime, PaymentMethod method) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        double hourlyRate = reservation.getUser().getHourlyRate();
        double remaining = reservation.calculateCost(hourlyRate, actualEndTime);
        reservation.setStatus(ReservationStatus.Completed);
        reservation.getEquipment().setStatus(EquipmentStatus.Available);

        if (remaining > 0) {
            Payment finalPayment = new Payment(UUID.randomUUID().toString(), remaining, method);
            payments.add(finalPayment);
            reservation.getUser().addPayment(finalPayment);
        }

        return remaining;
    }

    public void recordArrival(Reservation reservation, LocalDateTime arrivalTime) {
        Objects.requireNonNull(reservation, "Reservation cannot be null.");
        reservation.checkArrival(arrivalTime);

        if (reservation.getStatus() == ReservationStatus.NoShow) {
            reservation.getEquipment().setStatus(EquipmentStatus.Available);
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
            if (r.getStatus() == ReservationStatus.Cancelled || r.getStatus() == ReservationStatus.NoShow) {
                continue;
            }
            boolean overlaps = !end.isBefore(r.getStartTime()) && !start.isAfter(r.getEndTime());
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

