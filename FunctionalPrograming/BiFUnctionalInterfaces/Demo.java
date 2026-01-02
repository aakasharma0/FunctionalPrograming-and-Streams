package FunctionalPrograming.BiFUnctionalInterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Demo {

    public static void main(String[] args) {
        System.out.println("This is BiFunctional Interface example.");

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> {
            System.out.println("Sum is: " + (a + b));
        };

        biConsumer.accept(5, 10);

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println(biPredicate.test(10, 5)); // true

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("Multiplication is: " + biFunction.apply(4, 5)); // 20

        BiFunction<String, String, Integer> biFunctionConcat = (s1, s2) -> s1.length() + s2.length();
        System.out.println("Concatenation length is: " + biFunctionConcat.apply("Hello", "World")); // 10

        // below are special cases of BiFunctional interfaces and Functional interfaces
        // like
        // same type param and then same type return type

        // like used it is extesnion of the Function interface. when same type of input
        // and output we can use this
        UnaryOperator<Integer> unary = (a) -> a * a;
        System.out.println("Unary square of 5 is: " + unary.apply(5)); // 25

        // like used it is extesnion of the BiFunction interface. when same type of
        // input
        // and output we can use this
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println("Binary operator sum of 5 and 10 is: " + binaryOperator.apply(5, 10)); // 15

    }
}
