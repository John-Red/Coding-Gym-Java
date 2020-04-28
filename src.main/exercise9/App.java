package exercise9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;

public class App {

    // Создать стрим из srt файла и убрать все кроме содержания субтитров

    private static final String TIME_STAMP = "^([0-9]+:)*([0-9]+,[0-9]+ --> )([0-9]+:)*([0-9]+,[0-9]+)";
    private static final String NUMBER = "^([0-9]*)";


    public static void main(String[] args) throws IOException {

        ///      1      accumulator       2         combiner          3    accumulator            4
        //  "I did not hit" + "her,it's not true!"     +    " It's b******t!" +  " I did not hit her! I did not!"


        final StringBuilder collect = Files.lines(Paths.get("src.main\\exercise9\\The Room.srt"))
                .filter(Predicate.not(line -> line.matches(TIME_STAMP) || line.matches(NUMBER)))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);


        System.out.println(collect);

    }
}
