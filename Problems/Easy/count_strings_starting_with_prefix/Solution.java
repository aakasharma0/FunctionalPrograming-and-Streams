package Problems.Easy.count_strings_starting_with_prefix;

import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<String> names = List.of(
                "Akash",
                "Amit",
                "Ajay",
                "Raj",
                "Ankit",
                "John");

        System.out.println(names.stream().filter(x -> x.startsWith("A")).count());
    }
}
