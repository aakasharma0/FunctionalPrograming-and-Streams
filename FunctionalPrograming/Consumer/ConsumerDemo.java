package FunctionalPrograming.Consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        System.out.println("This is Consumer example.");
        Consumer<Integer> consumer = (x) -> System.out.println("Value is: " + x);
        consumer.accept(10);

        Consumer<List<Integer>> printList = (list) -> {
            for (Integer number : list) {
                System.out.println(number);
            }
        };

        Consumer<String> printString = (s) -> System.out.println(s);
        Consumer<String> printStringUpperCase = printString.andThen((s) -> System.out.println(s.toUpperCase()));

        printStringUpperCase.accept("Akash sharma");

        printList.accept(List.of(1, 2, 3, 4, 5));

    }
}
