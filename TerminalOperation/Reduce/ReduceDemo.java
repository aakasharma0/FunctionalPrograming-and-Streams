package TerminalOperation.Reduce;

import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> li = Stream.iterate(1, x -> x + 1).limit(1000).collect(Collectors.toList());
        List<Integer> li2 = Stream.iterate(1, x -> x + 1).limit(1000).collect(Collectors.toList());

        Optional<Integer> optional = li.stream().reduce((x, y) -> x + y);

        System.out.println(optional.get());

        Integer a = li2.stream().reduce(100, (x, y) -> x + y, (x, y) -> x + y);
        // Integer aa = li2.stream().reduce(100, (x, y) -> x, (x, y) -> x + y);
        Integer aa = li2.stream().reduce(100, (x, y) -> x + y, (x, y) -> {
            System.out.println(x + " " + y);
            return x + y;

        });

        System.out.println(a + " " + aa);

        List<Integer> nums = List.of(2, 4, 6, 8);
        List<Integer> nums2 = List.of(2, 4, 6, 8);

        // product of numbers

        System.out.println(nums.stream().reduce((x, y) -> x * y).get());

        System.out.println(nums2.stream().reduce(1, (x, y) -> x * y));

        List<String> words = List.of("java", "stream", "reduce");

        // longest string

        Optional<String> ans = words.stream().reduce((x, y) -> x.length() > y.length() ? x : y);

    }
}
