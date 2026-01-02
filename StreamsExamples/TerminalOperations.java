package StreamsExamples;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {
        System.out.println("This is Terminal operations example.");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1) collect() - to collect the stream elements into a collection
        List<Integer> evenNumbers = numbers.stream().skip(3).collect((Collectors.toList()));

        // 2) forEach() - to perform an action for each element
        numbers.stream().forEach((x) -> System.out.println(x));

        // 3) reduce() - to combine all elements into a single result
        System.out.println(numbers.stream().reduce((x, y) -> x + y).orElse(0));

        // 4) count() - to count the number of elements at the end of the stream
        long count = numbers.stream().filter((x) -> x % 2 == 0).count();
        System.out.println("Count of even numbers: " + count);

        // 5) anyMatch ,noneMatch, allMatch : basically takes predicate and returns
        // boolean
        // short circuit methods like the condition not met it will break the circuit

        boolean anyEven = numbers.stream().anyMatch((x) -> x % 2 == 0);
        System.out.println("Is there any even number? " + anyEven);

        boolean allEven = numbers.stream().allMatch((x) -> x % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);

        boolean noneGreaterThanTen = numbers.stream().noneMatch((x) -> x >= 10);
        System.out.println("Are there no numbers greater than 10? " + noneGreaterThanTen);

        // 6) findFirst , findAny : returns optional type : short circuiting methods

        // findFirst - returns the first element in the stream
        Integer first = numbers.stream().findFirst().orElse(-1);
        System.out.println("First element is: " + first);
        // findAny - returns any element from the stream (useful in parallel streams)
        Integer any = numbers.stream().findAny().orElse(-1);
        System.out.println("Any element is: " + any);
    }
}
