package exercise5;

import model.Employee;
import model.EmployeeFactory;
import model.Person;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    // Вывести отображение сотрудников с максимальной и минимальной зарплатой min=имя_сотрудника, max=имя_сотрудника
    //			Ответ({min=Max, max=Antony})

    public static void main(String[] args) {
        final List<Employee> employees = EmployeeFactory.getEmployees();

        final HashMap<String, String> collect = employees.stream().collect(
                Collectors.teeing(
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        (e1, e2) -> {
                            HashMap<String, String> map = new HashMap<>();
                            map.put("min", e1.map(Employee::getPerson).map(Person::getFirstName).orElse("not found"));
                            map.put("max", e2.map(Employee::getPerson).map(Person::getFirstName).orElse("not found"));
                            return map;
                        }));

        collect.forEach((k, v) -> System.out.println(k + "=" + v));
    }
}
