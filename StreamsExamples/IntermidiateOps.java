package StreamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermidiateOps {

    // intermidiate operations are lazy in nature
    // they are not executed until terminal operation is invoked

    // 1). filter() - used to filter elements based on a condition
    // 2). map() - used to transform elements
    // 3). sorted() - used to sort elements
    // 4). distinct() - used to remove duplicate elements
    // 5). peek() - used for debugging purposes to see the elements as they flow
    // 6) limit() - used to limit the number of elements flowing
    // 7) skip() - used to skip n elements
    // through the stream

    public static void main(String[] args) {
        List<String> names = Arrays.asList("akash", "jhon", "doe", "alice", "bob", "charlie");

        // 1)filter example

        Stream<String> namesStream = names.stream()
                .filter(name -> name.startsWith("a"));
        // its lazy so not executed until terminal operation is called

        names.stream().filter(name -> name.length() > 3)
                .forEach(System.out::println); // terminal operation to execute the stream

        // 2) map example

        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);

        // 3) sorted example

        // 3.1 natural sorting
        names.stream().sorted()
                .forEach(System.out::println);

        // 3.2 custom sorting
        names.stream().sorted((a, b) -> b.length() - a.length())
                .forEach(System.out::print);

        // 4) distinct example

        long count = names.stream().filter((x) -> x.startsWith("a")).distinct().count();
        System.out.println("Count of distinct names starting with 'a': " + count);

        // 5) limit example
        // bus is stream se 3 hi element age badhane dega
        names.stream().limit(3)
                .forEach(System.out::println);

        // 6) skip example
        // bus stream ke starting ke 3 element skip kar dega aur max 3 hi age jane dega
        // is stream se
        names.stream().skip(3).limit(3)
                .forEach(System.out::println);

    }

}
