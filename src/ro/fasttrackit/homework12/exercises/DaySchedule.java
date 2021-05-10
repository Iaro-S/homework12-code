package ro.fasttrackit.homework12.exercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DaySchedule {
    private final Days days;
    private final List<String> activities;

    public DaySchedule(Days days, List<String> activities) {
        this.days = days;
        this.activities = activities;
    }

    public Map<Days, List<String>> showActivities() {
        Map<Days, List<String>> result = new HashMap<>();{
        }
        return result;
    }
}
