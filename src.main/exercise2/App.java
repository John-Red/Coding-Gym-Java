package exercise2;

import model.Employee;
import model.EmployeeFactory;

import java.util.List;

public class App {

    // Вывести всех сотрудников, которые работали в EPAM (Ответ: [Max, Billy, John]
    public static void main(String[] args) {
        final List<Employee> employees = EmployeeFactory.getEmployees();

        employees.stream().filter(emp -> emp.getJobHistory()
                .stream()
                .map(job-> job.getEmployer())
                .anyMatch("epam"::equals))
                .forEach(System.out::println);
    }
}
