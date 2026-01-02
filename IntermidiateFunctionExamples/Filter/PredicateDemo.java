package IntermidiateFunctionExamples.Filter;

import java.util.function.Predicate;

public class PredicateDemo implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return t % 2 == 0;
    }

}
