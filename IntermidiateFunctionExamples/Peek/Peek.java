package IntermidiateFunctionExamples.Peek;

import java.util.List;

public class Peek {

    public static void main(String[] args) {
        System.out.println("This is the Peek example.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream()
                .peek(n -> System.out.println("Processing number: " + n)) // takes a Consumer
                .forEach(System.out::println);
    }
}
