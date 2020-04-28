package exercise0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {


    //Вернуть объект, содержащий массив key-value значений
    // (key = string, value - frequency), отсортированные по значению.
    // Функция countStrings(..) должна вернуть [b: 3, a: 2, c: 1]

    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[0] = "a";
        strings[1] = "b";
        strings[2] = "b";
        strings[3] = "b";
        strings[4] = "c";
        strings[5] = "a";
        System.out.println(countStrings(strings));
    }

    private static List<String> countStrings(String[] strings) {

        // Понимать как работают параметры метода Collectors.toMap
        return Arrays.stream(strings).collect(Collectors.toMap(k->k,v->1, Integer::sum))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(entry-> entry.getKey() +": " + entry.getValue())
                .collect(Collectors.toList());
    }

}
