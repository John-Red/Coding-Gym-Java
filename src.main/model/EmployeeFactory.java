package model;

import model.Employee;
import model.JobHistory;
import model.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeFactory {
    public static List<Employee> getEmployees() {
        return
                Arrays.asList(
                        new Employee(
                                new Person("Max", "Galt", 37),
                                Arrays.asList(
                                        new JobHistory(2, "dev", "epam"),
                                        new JobHistory(1, "dev", "google")
                                ),
                                100000),
                        new Employee(
                                new Person("Billy", "Doe", 42),
                                Arrays.asList(
                                        new JobHistory(3, "qa", "yandex"),
                                        new JobHistory(1, "qa", "epam"),
                                        new JobHistory(1, "dev", "google")
                                ),
                                160000),
                        new Employee(
                                new Person("John", "White", 29),
                                Arrays.asList(
                                        new JobHistory(5, "qa", "epam"),
                                        new JobHistory(4, "dev", "yandex")
                                ),
                                160000),
                        new Employee(
                                new Person("Antony", "Green", 24),
                                Collections.singletonList(
                                        new JobHistory(40, "dev", "yandex")
                                ),
                                240000)
                );

    }

    public static List<Employee> getAnotherEmployees() {
        return
                Arrays.asList(
                        new Employee(
                                new Person("Kevin", "Mitnick", 30),
                                Arrays.asList(
                                        new JobHistory(15, "dev", "ITU-T"),
                                        new JobHistory(10, "dev", "RedHat")
                                ),
                                80000),
                        new Employee(
                                new Person("Tom", "Cold", 40),
                                Arrays.asList(
                                        new JobHistory(3, "dev", "yandex"),
                                        new JobHistory(1, "dev", "facebook")
                                ),
                                70000),
                        new Employee(
                                new Person("Sasha", "Kichev", 79),
                                Collections.singletonList(
                                        new JobHistory(40, "TeamLead", "netflix")
                                ),
                                100000)
                );

    }

    public static List<List<Employee>> getAllEmployees() {
        return Arrays.asList(getEmployees(), getAnotherEmployees());
    }
}
