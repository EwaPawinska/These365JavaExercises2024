package january.ex007fourfunctionalinterfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FourFunctionalInterfaces {

    public static void main(String[] args) {

        System.out.println("## SUPPLIER ##");
        Supplier<String> supplier = () -> "abc";
        System.out.println(supplier.get());

        System.out.println("## CONSUMER ##");
        String name = "Adam";
        Consumer<String> consumer = a -> System.out.println("a" + a);
        consumer.accept(name);

        System.out.println("## PREDICATE ##");
        Predicate<String> predicate = a -> a.contains("a");
        System.out.println(predicate.test("a"));
        System.out.println(predicate.test("bb"));

        System.out.println("## FUNCTION (turns string into its length) ##");
        Function<String, Integer> convertToLength = String::length;
        System.out.println(convertToLength.apply("ABCDE"));
    }
}
