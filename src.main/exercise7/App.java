package exercise7;

import model.Employee;
import model.EmployeeFactory;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    // Вывести сотрудников, сгруппированных по первым компаниям, в которых они работали
    //		 в совокупности и выведите как отображение имя_компании: имя_сотрудника and имя_сотрудника и т.д. (всех кто там работал)
    //	Ответ:  yandex: Billy and Antony and Tom
    //            epam: Max and John
    //            netflix: Sasha
    //            ITU-T: Kevin)

    public static void main(String[] args) {

        final List<List<Employee>> allEmployees = EmployeeFactory.getAllEmployees();

        allEmployees.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(employee -> employee.getJobHistory().get(0).getEmployer()))
                .forEach((company, employee) -> System.out.println(company + " " + employee
                        .stream()
                        .map(employ -> employ.getPerson().getFirstName())
                        .collect(Collectors.joining(" and "))));


    }
}
