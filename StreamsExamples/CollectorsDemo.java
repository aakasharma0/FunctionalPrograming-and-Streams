package StreamsExamples;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

    public static void main(String[] args) {

        Stream<Integer> numberStream = Stream.iterate(2, x -> x + 1).limit(30);

        // 1) Collectors.toList() - collects stream elements into a List
        List<Integer> numberList = numberStream.collect(Collectors.toList());

        // 2) Collectors.toSet() - collects stream elements into a an it can used for
        // nay collections type
        HashSet<Integer> numberSet = numberList.stream().collect(Collectors.toCollection(HashSet::new));

        // 3) Collectors.joining() - joins stream elements into a single String
        Stream<String> stringStream = Stream.of("Akash", "Sharma", "is", "learning", "Java");
        String joinedString = stringStream.collect(Collectors.joining(" , "));
        System.out.println("Joined String: " + joinedString);

        // 5) Statticts collector

        IntSummaryStatistics stats = numberList.stream()
                .collect(Collectors.summarizingInt(x -> x));

        System.out.println("Count: " + stats.toString());

        // all the things like min , max , average sum are also there in stats object

        // 6 Grouping elements

        Stream<String> nameStream = Stream.of("Akash", "Alice", "Bob", "Annie", "Charlie", "David", "Amanda");

        // Below are just examples of collecitng by grouping it by deafult retune map vs
        // value map is by default the classifer which we give

        // System.out.println(nameStream.collect(Collectors.groupingBy((x) ->
        // x.length())));
        // System.out.println(nameStream.collect(Collectors.groupingBy(x ->
        // x.startsWith("A"))));

        // System.out.println(nameStream.collect(Collectors.groupingBy((x) -> x.length()
        // == 3)));

        // System.out.println(nameStream.collect(Collectors.groupingBy((x) -> x.length()
        // == 3)));

        // System.out.println(
        // nameStream.collect(Collectors.groupingBy((x) -> x.length(),
        // Collectors.toCollection(ArrayDeque::new))));

        System.out
                .println(nameStream.collect(Collectors.groupingBy(x -> x.length(), TreeMap::new, Collectors.toSet())));
        // Classifier chooses the key, downstream collector chooses the value container.
        // groupingBy ka result hota hai: Map<ClassifierType, DS>. also we give type of
        // map we want to use

        // 7) Partioning element
        // Partition into 2 elements based on predicate
        System.out.println("Demo for partitioning");

        Stream<String> stringStream2 = Stream.of("Akash", "Sharma", "jhon", "doe", "Hello", "Hi", "are", "you",
                "doing");

        // System.out.println(stringStream2.collect(Collectors.partitioningBy((x) ->
        // x.length() >= 5)));

        System.out.println(stringStream2
                .collect(Collectors.partitioningBy((x) -> x.length() >= 5, Collectors.toCollection(LinkedList::new))));

    }
}
