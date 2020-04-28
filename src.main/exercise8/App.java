package exercise8;

import java.util.stream.IntStream;

public class App {

    // Через IntStream вывести в консоль числа от 0 до 100 и найти их сумму

    public static void main(String[] args) {

        int sum = IntStream.range(0,100)
                .peek(System.out::println)
                .sum();

        System.out.println(sum);


    }
}
