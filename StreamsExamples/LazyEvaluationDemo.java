package StreamsExamples;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> lazyStream = numbers.stream()
                .filter(x -> {
                    System.out.println("Filtering: " + x);
                    return x % 2 == 0;
                })
                .map(x -> {
                    System.out.println("Mapping: " + x);
                    return x * x;
                });
        System.out.println("Stream created, but no operations executed yet.");

        System.out.println("Invoking terminal operation...");
        lazyStream.forEach(x -> System.out.println("Final Output: " + x));

    }
}
