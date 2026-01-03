package StreamsExamples;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParrallelStream {

    public static void main(String[] args) {
        // Type of stream which enable parrallel processing of elemnts
        // Allowing multiple threads to process data simultaneously
        // This can significantly speed up operations on large datasets

        // WorkLoad divison on multiple cores of CPU

        long startTime = System.currentTimeMillis();

        List<Integer> numIntegers = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        // using simple stream (sequential)
        // List<Long> facList =
        // numIntegers.stream().map(ParrallelStream::factn).toList();

        // using parrallel stream
        List<Long> facList = numIntegers.parallelStream().map(ParrallelStream::factn).toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken in millis : " + (endTime - startTime) + " ms");

        // The work with parralle straeam should be independent and stateless to avoid
        // issues
        // They should used when there is large data set and operation is CPU intensive
        // unless it may lead to overhead and performance degradation

        // cummulative sum using sequential stream

        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cummulativeSumIntegers = numIntegers.stream().map((x) -> sum.addAndGet(x)).limit(30).toList();

        sum.set(0);
        List<Integer> cummulativeSumParrallel = numIntegers.parallelStream().map((x) -> sum.addAndGet(x)).limit(30)
                .toList();
        System.out.println("Cummulative sum using sequential stream: " + cummulativeSumIntegers);

        System.out.println("Cummulative sum using parrallel stream: " + cummulativeSumParrallel);

        // parrallel streams can be converted to sequential streams using sequential()
        // method

    }

    private static Long factn(int n) {

        if (n == 2 || n == 1) {
            return 1L;
        }
        long fact = 2;
        for (int i = 2; i < n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
