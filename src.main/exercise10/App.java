package exercise10;

import model.Employee;
import model.EmployeeFactory;

import java.util.List;

public class App {

    // Вывести список всех работодателей без повторений


    public static void main(String[] args) {


        final List<List<Employee>> allEmployees = EmployeeFactory.getAllEmployees();


    }
}
