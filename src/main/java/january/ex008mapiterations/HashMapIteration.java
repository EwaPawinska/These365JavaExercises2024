package january.ex008mapiterations;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HashMapIteration {

    public static void main(String[] args) {
        final HashMap<String, String> practice = new HashMap<>();

        practice.put("a", "b");
        practice.put("b", "d");
        practice.put("c", "e");

        // first way to iterate
        for (Map.Entry<String, String> entry : practice.entrySet()) {
            System.out.printf("Key: %s, Value: %s%n", entry.getKey(), entry.getValue());
        }

        // 2nd way to iterate (Java 8)
        practice.forEach((key, value) -> System.out.printf("Key: %s, Value: %s%n", key, value));

        Supplier<String> supplier = () -> "abc";
        System.out.println(supplier.get());

        Predicate<String> predicate = a -> a.contains("a");
        System.out.println(predicate.test("a"));
        System.out.println(predicate.test("bb"));

        //interfejs function który zamienia String na jego długość
        Function<String, Integer> convertToLength = word -> word.length();
        System.out.println(convertToLength.apply("ABCDE"));
    }
}
