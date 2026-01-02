package FunctionalPrograming.PredicateDemo;

import java.util.function.Predicate;

public class ImplementPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0; // returns true if the number is even
    }

}
