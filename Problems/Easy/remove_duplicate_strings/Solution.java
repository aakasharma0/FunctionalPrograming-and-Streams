package Problems.Easy.remove_duplicate_strings;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {

        List<String> names = List.of(
                "Akash",
                "Raj",
                "Akash",
                "Amit",
                "Raj",
                "John");

        System.out.println(names.stream().distinct().collect(Collectors.toList()));

        // by deafult stremas preserve the order like they dont bother a such order is
        // natitally preserved
    }

}