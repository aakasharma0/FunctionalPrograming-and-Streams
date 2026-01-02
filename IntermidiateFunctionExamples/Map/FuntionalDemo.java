package IntermidiateFunctionExamples.Map;

import java.util.function.Function;

public class FuntionalDemo implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer t) {
        return t * 2;
    }

}