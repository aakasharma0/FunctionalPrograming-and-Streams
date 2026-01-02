package FunctionalPrograming.PredicateDemo;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        System.out.println("This is the Predicate example.");

        ImplementPredicate implementPredicate = new ImplementPredicate();
        System.out.println("Is 4 even? " + implementPredicate.test(4)); // true
        System.out.println("Is 7 even? " + implementPredicate.test(7));

        Predicate<String> isEmptyString = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        System.out.println("Is empty string? " + isEmptyString.test("")); // true
        System.out.println("Is empty string? " + isEmptyString.test("Hello"));

        Predicate<String> isLongerThan5 = s -> s.length() > 5;

        System.out.println("Is 'Functional' longer than 5? " + isLongerThan5.test("Functional")); // true
        System.out.println("Is 'Java' longer than 5? " + isLongerThan5.test("Java"));

    }
}
