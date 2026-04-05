package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import main.enums.SensorStatus;
import main.models.Observer;
import main.models.Sensor;
import main.models.UsageData;

public class SensorTest {

    private Sensor sensor;
    private TestObserver observer;

    // Helper observer for testing
    private static class TestObserver implements Observer {
        UsageData lastData = null;
        @Override
        public void update(UsageData usageData) {
            this.lastData = usageData;
        }
    }

    @Before
    public void setUp() {
        sensor = new Sensor("S01", SensorStatus.Active);
        observer = new TestObserver();
    }

    // Test 1
    @Test
    public void constructor_setsIdAndStatus() {
        assertEquals("S01", sensor.getSensorId());
        assertEquals(SensorStatus.Active, sensor.getStatus());
        assertNotNull(sensor.getLastUpdateTime());
    }

    // Test 2
    @Test
    public void attach_addsObserver() {
        sensor.attach(observer);
        sensor.notifyObservers(new UsageData("E01", "OK", LocalDateTime.now()));
        assertNotNull(observer.lastData);
    }

    // Test 3
    @Test(expected = IllegalArgumentException.class)
    public void attach_nullObserver_throwsException() {
        sensor.attach(null);
    }

    // Test 4
    @Test
    public void detach_removesObserver() {
        sensor.attach(observer);
        sensor.detach(observer);
        sensor.notifyObservers(new UsageData("E01", "OK", LocalDateTime.now()));
        assertNull(observer.lastData);
    }

    // Test 5
    @Test
    public void notifyObservers_sendsToAllAttached() {
        TestObserver obs2 = new TestObserver();
        sensor.attach(observer);
        sensor.attach(obs2);
        UsageData data = new UsageData("E02", "MAINTENANCE", LocalDateTime.now());
        sensor.notifyObservers(data);
        assertSame(data, observer.lastData);
        assertSame(data, obs2.lastData);
    }

    // Test 6
    @Test
    public void recordUsage_updatesTimeAndNotifies() throws InterruptedException {
        sensor.attach(observer);
        LocalDateTime before = sensor.getLastUpdateTime();
        Thread.sleep(1);
        UsageData data = new UsageData("E03", "ACTIVE", LocalDateTime.now());
        sensor.recordUsage(data);
        assertTrue(sensor.getLastUpdateTime().isAfter(before));
        assertSame(data, observer.lastData);
    }

    // Test 7
    @Test
    public void setSensorId_updatesId() {
        sensor.setSensorId("S99");
        assertEquals("S99", sensor.getSensorId());
    }

    // Test 8
    @Test
    public void setStatus_updatesStatus() {
        sensor.setStatus(SensorStatus.Maintenance);
        assertEquals(SensorStatus.Maintenance, sensor.getStatus());
    }

    // Test 9
    @Test
    public void setLastUpdateTime_updatesTime() {
        LocalDateTime newTime = LocalDateTime.of(2025, 1, 1, 12, 0);
        sensor.setLastUpdateTime(newTime);
        assertEquals(newTime, sensor.getLastUpdateTime());
    }

    // Test 10
    @Test
    public void multipleObservers_allReceiveUpdate() {
        TestObserver o1 = new TestObserver();
        TestObserver o2 = new TestObserver();
        sensor.attach(o1);
        sensor.attach(o2);
        UsageData data = new UsageData("E04", "IDLE", LocalDateTime.now());
        sensor.notifyObservers(data);
        assertSame(data, o1.lastData);
        assertSame(data, o2.lastData);
    }
  
}
