package exercise4;

import model.Employee;
import model.EmployeeFactory;

import java.util.Comparator;
import java.util.List;

public class App {

    // Вывести сотрудников, отсортированных по возрасту (Ответ: [Antony, John, Max, Billy])
    public static void main(String[] args) {
        final List<Employee> employees = EmployeeFactory.getEmployees();

        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getPerson().getAge()))
                .forEach(System.out::println);
    }
}
