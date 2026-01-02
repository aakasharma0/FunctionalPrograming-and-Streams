package FunctionalPrograming.FunctionDemo;

import java.util.function.Function;

public class FunctionDemo {
    
    public static void main(String[] args) {
        Function<Integer,Integer> square =x ->x*x;
        System.out.println("Square of 5 is: "+square.apply(5));
    }
}
