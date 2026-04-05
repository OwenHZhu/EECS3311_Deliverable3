package test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentStateRandoopTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test001");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        java.lang.Class<?> wildcardClass1 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test002");
        main.models.ReservedState reservedState0 = new main.models.ReservedState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservedState0.disable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test003");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test004");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test005");
        main.models.ReservedState reservedState0 = new main.models.ReservedState();
        java.lang.Class<?> wildcardClass1 = reservedState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test006");
        main.models.ReservedState reservedState0 = new main.models.ReservedState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservedState0.reserve(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment already reserved.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test007");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test008");
        main.models.ReservedState reservedState0 = new main.models.ReservedState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservedState0.enable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test009");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test010");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "hi!", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test011");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "hi!", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test012");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test013");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test014");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test015");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test016");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test017");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test018");
        main.models.ReservedState reservedState0 = new main.models.ReservedState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            reservedState0.markUnderMaintenance(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test019");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test020");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test021");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test022");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test023");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test024");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test025");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test026");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test027");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        java.lang.Class<?> wildcardClass1 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test028");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test029");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test030");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test031");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test032");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        java.lang.Class<?> wildcardClass5 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test033");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test034");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        java.lang.Class<?> wildcardClass1 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test035");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test036");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test037");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test038");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test039");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test040");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test041");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test042");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test043");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test044");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test045");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test046");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        java.lang.Class<?> wildcardClass7 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test047");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test048");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test049");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test050");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test051");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        java.lang.Class<?> wildcardClass7 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test052");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test053");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test054");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test055");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test056");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test057");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test058");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test059");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test060");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        java.lang.Class<?> wildcardClass11 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test061");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test062");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        java.lang.Class<?> wildcardClass3 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test063");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test064");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test065");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        java.lang.Class<?> wildcardClass3 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test066");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test067");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test068");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test069");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test070");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test071");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        java.lang.Class<?> wildcardClass9 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test072");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("hi!", "hi!", "", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test073");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test074");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test075");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test076");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test077");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test078");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test079");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test080");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test081");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test082");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test083");
        main.enums.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            main.models.Equipment equipment4 = new main.models.Equipment("", "hi!", "hi!", equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.enums.EquipmentStatus.ordinal()\" because \"status\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test084");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        java.lang.Class<?> wildcardClass11 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test085");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test086");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test087");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        java.lang.Class<?> wildcardClass9 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test088");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        java.lang.Class<?> wildcardClass13 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test089");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test090");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test091");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        java.lang.Class<?> wildcardClass15 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test092");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test093");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test094");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test095");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        java.lang.Class<?> wildcardClass15 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test096");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test097");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test098");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        java.lang.Class<?> wildcardClass13 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test099");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test100");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test101");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test102");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test103");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test104");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test105");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        java.lang.Class<?> wildcardClass9 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test106");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test107");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        java.lang.Class<?> wildcardClass5 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test108");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test109");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test110");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test111");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        java.lang.Class<?> wildcardClass5 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test112");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        java.lang.Class<?> wildcardClass19 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test113");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test114");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test115");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test116");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test117");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test118");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test119");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        java.lang.Class<?> wildcardClass3 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test120");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        java.lang.Class<?> wildcardClass21 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test121");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test122");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test123");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test124");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test125");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test126");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        java.lang.Class<?> wildcardClass17 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test127");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test128");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test129");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        java.lang.Class<?> wildcardClass17 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test130");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test131");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test132");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test133");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        java.lang.Class<?> wildcardClass13 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test134");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        java.lang.Class<?> wildcardClass19 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test135");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        java.lang.Class<?> wildcardClass21 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test136");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test137");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test138");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        java.lang.Class<?> wildcardClass25 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test139");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        java.lang.Class<?> wildcardClass11 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test140");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test141");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        java.lang.Class<?> wildcardClass15 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test142");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test143");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test144");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test145");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test146");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        java.lang.Class<?> wildcardClass23 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test147");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test148");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test149");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test150");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test151");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test152");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test153");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test154");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test155");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test156");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test157");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test158");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test159");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test160");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        java.lang.Class<?> wildcardClass17 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test161");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test162");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        java.lang.Class<?> wildcardClass27 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test163");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test164");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test165");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test166");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test167");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test168");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test169");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        java.lang.Class<?> wildcardClass25 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test170");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test171");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test172");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test173");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test174");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        java.lang.Class<?> wildcardClass29 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test175");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test176");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test177");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test178");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test179");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        java.lang.Class<?> wildcardClass25 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test180");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test181");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test182");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        java.lang.Class<?> wildcardClass33 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test183");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test184");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        java.lang.Class<?> wildcardClass7 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test185");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test186");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test187");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test188");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        java.lang.Class<?> wildcardClass27 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test189");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test190");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test191");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test192");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test193");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test194");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test195");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test196");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test197");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test198");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test199");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test200");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test201");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        java.lang.Class<?> wildcardClass31 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test202");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test203");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        availableState0.enable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test204");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        java.lang.Class<?> wildcardClass33 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test205");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test206");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        java.lang.Class<?> wildcardClass23 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test207");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        java.lang.Class<?> wildcardClass29 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test208");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test209");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test210");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        java.lang.Class<?> wildcardClass31 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test211");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        java.lang.Class<?> wildcardClass33 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test212");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test213");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test214");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test215");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.disable(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test216");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        java.lang.Class<?> wildcardClass41 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test217");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test218");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test219");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        java.lang.Class<?> wildcardClass29 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test220");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        availableState0.enable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.reserve(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test221");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test222");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test223");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test224");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test225");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        disabledState0.disable(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test226");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.enable(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test227");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        main.models.Equipment equipment41 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test228");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        main.models.Equipment equipment41 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test229");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test230");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        main.models.Equipment equipment41 = null;
        maintenanceState0.markUnderMaintenance(equipment41);
        main.models.Equipment equipment43 = null;
        maintenanceState0.markUnderMaintenance(equipment43);
        main.models.Equipment equipment45 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.reserve(equipment45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment under maintenance.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test231");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        java.lang.Class<?> wildcardClass31 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test232");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        availableState0.enable(equipment33);
        java.lang.Class<?> wildcardClass35 = availableState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test233");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        main.models.Equipment equipment41 = null;
        maintenanceState0.markUnderMaintenance(equipment41);
        main.models.Equipment equipment43 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.disable(equipment43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test234");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        java.lang.Class<?> wildcardClass35 = maintenanceState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test235");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        disabledState0.disable(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.reserve(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Equipment disabled.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test236");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        main.models.Equipment equipment19 = null;
        disabledState0.disable(equipment19);
        main.models.Equipment equipment21 = null;
        disabledState0.disable(equipment21);
        main.models.Equipment equipment23 = null;
        disabledState0.disable(equipment23);
        main.models.Equipment equipment25 = null;
        disabledState0.disable(equipment25);
        main.models.Equipment equipment27 = null;
        disabledState0.disable(equipment27);
        main.models.Equipment equipment29 = null;
        disabledState0.disable(equipment29);
        main.models.Equipment equipment31 = null;
        disabledState0.disable(equipment31);
        main.models.Equipment equipment33 = null;
        disabledState0.disable(equipment33);
        main.models.Equipment equipment35 = null;
        disabledState0.disable(equipment35);
        main.models.Equipment equipment37 = null;
        // The following exception was thrown during execution in test generation
        try {
            disabledState0.markUnderMaintenance(equipment37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test237");
        main.models.AvailableState availableState0 = new main.models.AvailableState();
        main.models.Equipment equipment1 = null;
        availableState0.enable(equipment1);
        main.models.Equipment equipment3 = null;
        availableState0.enable(equipment3);
        main.models.Equipment equipment5 = null;
        availableState0.enable(equipment5);
        main.models.Equipment equipment7 = null;
        availableState0.enable(equipment7);
        main.models.Equipment equipment9 = null;
        availableState0.enable(equipment9);
        main.models.Equipment equipment11 = null;
        availableState0.enable(equipment11);
        main.models.Equipment equipment13 = null;
        availableState0.enable(equipment13);
        main.models.Equipment equipment15 = null;
        availableState0.enable(equipment15);
        main.models.Equipment equipment17 = null;
        availableState0.enable(equipment17);
        main.models.Equipment equipment19 = null;
        availableState0.enable(equipment19);
        main.models.Equipment equipment21 = null;
        availableState0.enable(equipment21);
        main.models.Equipment equipment23 = null;
        availableState0.enable(equipment23);
        main.models.Equipment equipment25 = null;
        availableState0.enable(equipment25);
        main.models.Equipment equipment27 = null;
        availableState0.enable(equipment27);
        main.models.Equipment equipment29 = null;
        availableState0.enable(equipment29);
        main.models.Equipment equipment31 = null;
        availableState0.enable(equipment31);
        main.models.Equipment equipment33 = null;
        availableState0.enable(equipment33);
        main.models.Equipment equipment35 = null;
        // The following exception was thrown during execution in test generation
        try {
            availableState0.markUnderMaintenance(equipment35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test238");
        main.models.MaintenanceState maintenanceState0 = new main.models.MaintenanceState();
        main.models.Equipment equipment1 = null;
        maintenanceState0.markUnderMaintenance(equipment1);
        main.models.Equipment equipment3 = null;
        maintenanceState0.markUnderMaintenance(equipment3);
        main.models.Equipment equipment5 = null;
        maintenanceState0.markUnderMaintenance(equipment5);
        main.models.Equipment equipment7 = null;
        maintenanceState0.markUnderMaintenance(equipment7);
        main.models.Equipment equipment9 = null;
        maintenanceState0.markUnderMaintenance(equipment9);
        main.models.Equipment equipment11 = null;
        maintenanceState0.markUnderMaintenance(equipment11);
        main.models.Equipment equipment13 = null;
        maintenanceState0.markUnderMaintenance(equipment13);
        main.models.Equipment equipment15 = null;
        maintenanceState0.markUnderMaintenance(equipment15);
        main.models.Equipment equipment17 = null;
        maintenanceState0.markUnderMaintenance(equipment17);
        main.models.Equipment equipment19 = null;
        maintenanceState0.markUnderMaintenance(equipment19);
        main.models.Equipment equipment21 = null;
        maintenanceState0.markUnderMaintenance(equipment21);
        main.models.Equipment equipment23 = null;
        maintenanceState0.markUnderMaintenance(equipment23);
        main.models.Equipment equipment25 = null;
        maintenanceState0.markUnderMaintenance(equipment25);
        main.models.Equipment equipment27 = null;
        maintenanceState0.markUnderMaintenance(equipment27);
        main.models.Equipment equipment29 = null;
        maintenanceState0.markUnderMaintenance(equipment29);
        main.models.Equipment equipment31 = null;
        maintenanceState0.markUnderMaintenance(equipment31);
        main.models.Equipment equipment33 = null;
        maintenanceState0.markUnderMaintenance(equipment33);
        main.models.Equipment equipment35 = null;
        maintenanceState0.markUnderMaintenance(equipment35);
        main.models.Equipment equipment37 = null;
        maintenanceState0.markUnderMaintenance(equipment37);
        main.models.Equipment equipment39 = null;
        maintenanceState0.markUnderMaintenance(equipment39);
        main.models.Equipment equipment41 = null;
        maintenanceState0.markUnderMaintenance(equipment41);
        main.models.Equipment equipment43 = null;
        // The following exception was thrown during execution in test generation
        try {
            maintenanceState0.enable(equipment43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"main.models.Equipment.setState(main.models.EquipmentState)\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EquipmentStateRandoopTest0.test239");
        main.models.DisabledState disabledState0 = new main.models.DisabledState();
        main.models.Equipment equipment1 = null;
        disabledState0.disable(equipment1);
        main.models.Equipment equipment3 = null;
        disabledState0.disable(equipment3);
        main.models.Equipment equipment5 = null;
        disabledState0.disable(equipment5);
        main.models.Equipment equipment7 = null;
        disabledState0.disable(equipment7);
        main.models.Equipment equipment9 = null;
        disabledState0.disable(equipment9);
        main.models.Equipment equipment11 = null;
        disabledState0.disable(equipment11);
        main.models.Equipment equipment13 = null;
        disabledState0.disable(equipment13);
        main.models.Equipment equipment15 = null;
        disabledState0.disable(equipment15);
        main.models.Equipment equipment17 = null;
        disabledState0.disable(equipment17);
        java.lang.Class<?> wildcardClass19 = disabledState0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

