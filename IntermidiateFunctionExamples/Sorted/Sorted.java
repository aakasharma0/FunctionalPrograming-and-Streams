package IntermidiateFunctionExamples.Sorted;

import java.util.List;

public class Sorted {

    public static void main(String[] args) {
        System.out.println("This is the Sorted example.");
        List<Integer> numbers = List.of(5, 3, 8, 1, 2);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);
        numbers.stream()
                .sorted((a, b) -> b - a) // passing comparator for descending order
                .forEach(System.out::println);
    }
}
