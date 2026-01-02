package FunctionalPrograming.CustomFunctionalInterface;

public class Demo {

    public static void main(String[] args) {
        Operation addition = (a, b) -> System.out.println("Addition: " + (a + b));

        Operation Subtraction = new Operation() {
            @Override
            public void operate(int a, int b) {
                System.out.println("Subtraction: " + (a - b));
            }
        };
        addition.operate(10, 5);
        Subtraction.operate(10, 5);
    }
}
