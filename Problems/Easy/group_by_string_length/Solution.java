package Problems.Easy.group_by_string_length;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<String> names = List.of(
                "Akash",
                "Raj",
                "Amit",
                "John",
                "Ajay");

        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy((x) -> x.length()));
        System.out.println(result);

        Map<Integer, Long> result2 = names.stream()
                .collect(Collectors.groupingBy((x) -> x.length(), Collectors.counting()));
        System.out.println(result2);
    }

}
