package FunctionalPrograming.Supplier;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        System.out.println("This is Supplier example.");

        Supplier<Integer> supplier = () -> 42;
        System.out.println("Supplied value: " + supplier.get());

    }
}
