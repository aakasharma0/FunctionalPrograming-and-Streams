package MeathodReference;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.forEach((x) -> System.out.println(x));

        // using method reference
        numbers.forEach(System.out::println);
        List<String> models = List.of("iPhone", "Samsung", "OnePlus", "Pixel", "Nokia", "Motorola");

        List<Mobile> mobiles = new ArrayList<>();
        models.forEach(model -> mobiles.add(new Mobile(model)));

        // using method reference to constructor
        List<Mobile> mobiles2 = mobiles.stream().map((model) -> new Mobile(model.model)).toList();

        System.out.println(mobiles2);

    }
}
