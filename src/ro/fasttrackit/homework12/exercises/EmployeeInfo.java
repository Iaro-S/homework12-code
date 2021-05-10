package ro.fasttrackit.homework12.exercises;

import java.util.*;

public class EmployeeInfo {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeInfo(Collection<Employee> employees) {
        if (employees != null) {
            this.employees.addAll(employees);
        }
    }

    public List<Employee> higherSalaries(int salary) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                result.add(employee);
            }
        }
        return result;
    }

    public Map<String, List<String>> personFromCompany() {
        Map<String, List<String>> result = new HashMap<>();
        for (Employee employee : employees) {
            List<String> employeeList = result.get(employee.getCompany());
            if (employeeList == null) {
                employeeList = new ArrayList<>();
            }
            employeeList.add(employee.getName());
            result.put(employee.getCompany(), employeeList);
        }
        return result;
    }

    public int sumSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String biggestSalary() {
        String result = "";
        int max = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                result = employee.getCompany();
            }
        }
        return result;
    }
}
