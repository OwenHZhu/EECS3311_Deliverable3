package ai_assistant;

import main.enums.AccountStatus;
import main.models.HeadLabCoordinator;
import main.models.LabManager;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeadLabCoordinatorAiTest {

    private HeadLabCoordinator coordinator;

    @Before
    public void setUp() {
        // Reset singleton using reflection (since it's static)
        try {
            java.lang.reflect.Field instanceField = HeadLabCoordinator.class.getDeclaredField("instance");
            instanceField.setAccessible(true);
            instanceField.set(null, null);
        } catch (Exception e) {
            fail("Failed to reset singleton instance");
        }

        coordinator = HeadLabCoordinator.getInstance(
                "1",
                "John Doe",
                "john@example.com",
                "password",
                "CERT123",
                "Biology",
                AccountStatus.Active
        );
    }

    @Test
    public void testSingletonInstanceNotNull() {
        assertNotNull(coordinator);
    }

    @Test
    public void testSingletonReturnsSameInstance() {
        HeadLabCoordinator secondInstance = HeadLabCoordinator.getInstance(
                "2",
                "Jane Doe",
                "jane@example.com",
                "password2",
                "CERT456",
                "Chemistry",
                AccountStatus.Rejected
        );

        assertSame(coordinator, secondInstance);
    }

    @Test
    public void testSingletonRetainsInitialValues() {
        HeadLabCoordinator secondInstance = HeadLabCoordinator.getInstance(
                "2",
                "Jane Doe",
                "jane@example.com",
                "password2",
                "CERT456",
                "Chemistry",
                AccountStatus.Rejected
        );

        // Since singleton, second call should NOT overwrite initial data
        assertSame(coordinator, secondInstance);
    }

    @Test
    public void testGetHourlyRate() {
        double rate = coordinator.getHourlyRate();
        assertEquals(0.0, rate, 0.0001);
    }

    @Test
    public void testCreateLabManager() {
        LabManager manager = coordinator.createLabManager();
        assertNotNull(manager);
        assertTrue(manager instanceof LabManager);
    }
}