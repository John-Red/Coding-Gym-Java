package model;

import java.util.List;

public class Employee {

    private int salary;

    private Person person;

    private List<JobHistory> jobHistory;

    public Employee(Person person, List<JobHistory> jobHistory, int salary) {
        this.person = person;
        this.jobHistory = jobHistory;
        this.salary = salary;
    }

    public String toString() {
        return this.getPerson().getFirstName();
    }


    public Person getPerson() {
        return person;
    }

    public List<JobHistory> getJobHistory() {
        return jobHistory;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
