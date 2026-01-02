package FunctionalPrograming.FunctionDemo;

import java.util.concurrent.Future;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5 is: " + square.apply(5));
        Function<Integer, Integer> increment = x -> x + 1;

        // Chaninging functions
        Function<Integer, Integer> squareThenIncrement = square.andThen(increment);
        Function<Integer, Integer> squareThenIncrement2 = increment.compose(square);

        Function<Integer, Integer> doubleIt = x -> x * 2;
        System.out.println(square.andThen(increment).apply(5)); // first square then increment

    }
}
