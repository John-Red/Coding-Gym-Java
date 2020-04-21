package exercise3;

import model.Employee;
import model.EmployeeFactory;

import java.util.List;

public class App {

    // Вывести первых двух сотрудников как отображение Имя=Зарплата (Ответ: {Billy=160000, Max=100000})
    public static void main(String[] args) {
        final List<Employee> employees = EmployeeFactory.getEmployees();

        employees.stream()
                .limit(2)
                .forEach(employee -> System.out.println(employee.getPerson()+"="+employee.getSalary()));
    }
}
