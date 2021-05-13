package ro.fasttrackit.homework12.exercises;

import java.util.List;

public class DaySchedule {
    private final Days days;
    private final List<String> activities;

    public DaySchedule(Days days, List<String> activities) {
        this.days = days;
        this.activities = activities;
    }
}
