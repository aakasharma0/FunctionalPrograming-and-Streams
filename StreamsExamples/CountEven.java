package StreamsExamples;

import java.util.List;

public class CountEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Traditional way to count even numbers
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of even numbers is: " + count);

        // Using Streams to count even numbers
        int evenCount = (int) numbers.stream()
                .filter((x) -> x % 2 == 0)
                .count();

        System.out.println(numbers.stream().filter((x) -> x % 2 == 0).count());

    }
}
