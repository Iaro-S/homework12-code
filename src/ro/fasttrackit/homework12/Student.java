package ro.fasttrackit.homework12;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        student.put("mihai", 3);
        student.put("cristi", 7);
        student.put("ionut", 9);
        student.put("ana", 10);
        student.put("mihaela", 6);
        student.put("claudiu", 5);
        student.put("andreia", 8);

        System.out.println(student);
        System.out.println("Student with the highest grade: " + getMaxGrade(student));
    }

    private static String getMaxGrade(Map<String, Integer> studentGrades) {
        Map.Entry<String, Integer> maxGrade = null;
        for (Map.Entry<String, Integer> grade : studentGrades.entrySet()) {
            if (maxGrade == null || grade.getValue().compareTo(maxGrade.getValue()) > 0) {
                maxGrade = grade;
            }
        }
        return maxGrade.getKey();
    }
}

