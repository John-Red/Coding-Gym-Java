package exercise1;

import model.Employee;
import model.EmployeeFactory;

import java.util.List;

public class App {

    // Вывести список персон (Ответ: [Max, Billy, John, Antony])

    public static void main(String[] args) {
        final List<Employee> employees = EmployeeFactory.getEmployees();

        employees.stream().map(Employee::getPerson).forEach(System.out::println);
    }
}
