package ro.fasttrackit.homework12.exercises;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(String name, int age, String company, int salary) {
        super(name, age);
        this.company = company;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + this.getName() + '\'' +
                ", age=" + this.getAge() + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
