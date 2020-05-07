package exercise13;

import model.Employee;
import model.EmployeeFactory;
import model.Person;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class App {

    // Вывести сотрудников со стажем работы более 10 лет и вывести в формате имя -> стаж работы

    //    Antony -> 40
    //    Kevin -> 25
    //    Sasha -> 40

    public static void main(String[] args) {

        final List<List<Employee>> allEmployees = EmployeeFactory.getAllEmployees();


    }
}
