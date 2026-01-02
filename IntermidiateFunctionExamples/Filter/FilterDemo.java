package IntermidiateFunctionExamples.Filter;

import java.util.List;

public class FilterDemo {

    public static void main(String[] args) {
        System.out.println("This is the Filter example.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(new PredicateDemo())
                .forEach(System.out::println);
    }
}
