package IntermidiateFunctionExamples.Distinct;

import java.util.List;

public class DistinctDemo {

    public static void main(String[] args) {
        // Example code for Distinct operation can be added here
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        numbers.stream().distinct()
                .forEach(System.out::println);

    }
}
