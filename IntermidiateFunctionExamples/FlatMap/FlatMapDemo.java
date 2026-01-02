package IntermidiateFunctionExamples.FlatMap;

import java.util.List;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<List<String>> listOfLists = List.of(
                List.of("apple", "banana"),
                List.of("carrot", "date"),
                List.of("eggplant", "fig", "grape"));

        listOfLists.stream()
                .flatMap((List<String> li) -> li.stream())
                .forEach(System.out::println);
    }
}

// flatMap method is used to convert a stream of collections into a single
// stream containing all the elements of the collections.
