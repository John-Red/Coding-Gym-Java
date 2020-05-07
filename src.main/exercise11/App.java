package exercise11;

import model.Employee;
import model.EmployeeFactory;

import java.util.Collection;
import java.util.List;

public class App {

    // Вывести среднюю зарплату сотрудников [Средняя зарплата всех сотрудников = 130000.0]

    public static void main(String[] args) {


        final List<List<Employee>> allEmployees = EmployeeFactory.getAllEmployees();

        double result = 0.0d;

        System.out.println("Средняя зарплата всех сотрудников = " + result);

    }
}
