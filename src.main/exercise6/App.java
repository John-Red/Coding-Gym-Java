package exercise6;

import model.Employee;
import model.EmployeeFactory;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    // Вывести отображение сотрудников, чьи зарплаты > 150000,
    //		сгруппировав их по зарплате и указав кто из начал карьеру в яндексе
    //		(Ответ: {big zp={160000=[Billy, John], 240000=[Antony]}, from yandex=[Billy, Antony]})
    public static void main(String[] args) {

        final List<Employee> employees = EmployeeFactory.getEmployees();

        HashMap<String, Object> yandex = employees.stream().collect(Collectors.teeing(
                Collectors.filtering(employee -> employee.getSalary() > 150000,
                        Collectors.groupingBy(Employee::getPerson)),
                Collectors.filtering(emp -> "yandex".equals(emp.getJobHistory().iterator().next().getEmployer()),
                        Collectors.toList()),
                (first, second) -> {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("more than 150 000", first);
                    map.put("from yandex", second);
                    return map;
                }

        ));

        yandex.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
