package main.models;

import java.util.ArrayList;
import java.util.List;

public class UsageLogger implements Observer {
    private final List<UsageData> records = new ArrayList<>();

    @Override
    public void update(UsageData usageData) {
        if (usageData != null) {
            records.add(usageData);
        }
    }

    public List<UsageData> getRecords() {
        return new ArrayList<>(records);
    }
}

