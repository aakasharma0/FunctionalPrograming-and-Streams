package Problems.Easy.convert_strings_to_uppercase;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        List<String> names = List.of(
                "akash",
                "amit",
                "raj",
                "john");

        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseNames);

    }
}
