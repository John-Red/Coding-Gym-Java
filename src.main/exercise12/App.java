package exercise12;

import model.Employee;
import model.EmployeeFactory;
import model.Person;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {

    // Вывести имя сотрудника и его годовой оклад

    // [Sasha годовой оклад 1200000
    //  Max годовой оклад 1200000
    //  Tom годовой оклад 840000
    //  Billy годовой оклад 1920000
    //  Kevin годовой оклад 960000
    //  John годовой оклад 1920000
    //  Antony годовой оклад 2880000]

    public static void main(String[] args) {

        final List<List<Employee>> allEmployees = EmployeeFactory.getAllEmployees();

        final Map<Person, Integer> map = null;

        map.forEach((key,value)-> System.out.println(key + " годовой оклад " + value));
    }
}
