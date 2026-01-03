package StreamsExamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PractiseQuestion {

    public static void main(String[] args) {

        // 1) Collecting names by length
        List<String> names = List.of(
                "Akash",
                "Alice",
                "Bob",
                "Annie",
                "Charlie",
                "David",
                "Amanda",
                "Brian",
                "Catherine",
                "Daniel");

        Map<Integer, List<String>> map = names.stream().collect(Collectors.groupingBy((x) -> x.length()));
        System.out.println(map);

        // 2) Counting word occuracne
        String name = "Hellow java hellow java kiddan";

        System.out.println(Arrays.stream(name.split(" ")).map(String::toLowerCase)
                .collect(Collectors.groupingBy((x) -> x, Collectors.counting())));

        // word count
        System.out.println(Arrays.stream(name.split(" ")).map(String::trim).filter((x) -> !x.equals("")).count());

        // 3) Patition even and odd Numbers

        Stream<Integer> intStream = Stream.iterate(3, x -> x + 1).limit(10);
        System.out.println(intStream.collect(Collectors.groupingBy((x) -> x % 2 == 0)));

        // 4) Summing values in maps

        Map<String, Integer> fruitPriceMap = Map.of(
                "Apple", 120,
                "Banana", 40,
                "Orange", 60,
                "Mango", 150,
                "Grapes", 90);

        System.out.println(fruitPriceMap.values().stream().reduce((x, y) -> x + y).get());

        // Creating a map from stream elements

        System.out.println(names.stream().collect(Collectors.toMap(x -> x, x -> x.length())));

        // Java Collectors mainly support grouping, partitioning, and mapping patterns
        // to transform a stream into complex data structures.
    }
}
