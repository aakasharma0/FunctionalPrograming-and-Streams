package StreamsExamples.CreatingStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamDemo {

    public static void main(String[] args) {
        System.out.println("This is Creating Stream example.");

        // 1)
        // .stream method is available in collection interface
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> numberStream = numbers.stream();

        // 2)
        String[] names = { "Akash", "Sharma", "is", "a", "good", " coder" };
        Stream<String> namesStream = Arrays.stream(names);

        // 3) using Stream.of() method // take varibale number of arguments i.e
        // implemented using arrays
        Stream<Double> doubleStream = Stream.of(3.14, 1.618, 2.718, 0.5772);

        // 4) Infinite Stream if limit removed then it will be infinite
        Stream<Integer> infiniteStream = Stream.iterate(0, x -> x + 2).limit(1000); // even numbers

        // 5) using generated method

        Stream<Integer> generatedStream = Stream.generate(() -> 1);

        // random numbers stream
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);

    }
}
