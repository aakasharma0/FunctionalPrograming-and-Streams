package IntermidiateFunctionExamples.Map;

import java.util.List;

import IntermidiateFunctionExamples.Filter.PredicateDemo;

public class MapDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().filter(new PredicateDemo())
                .map(new FuntionalDemo())
                .forEach(System.out::println);
    }
}
