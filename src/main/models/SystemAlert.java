package main.models;

import java.util.ArrayList;
import java.util.List;

public class SystemAlert implements Observer {
    private final List<String> messages = new ArrayList<>();

    @Override
    public void update(UsageData usageData) {
        if (usageData == null) {
            return;
        }
        messages.add("Usage update for " + usageData.getEquipmentId() + ": " + usageData.getOperationStatus());
    }

    public List<String> getMessages() {
        return new ArrayList<>(messages);
    }
}

