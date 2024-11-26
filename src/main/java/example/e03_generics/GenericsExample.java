package example.e03_generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericsExample {

    /** <a href="https://www.baeldung.com/java-generics">The Basics of Java Generics</a>
     */
    public static void main(String[] args) {
        var list = genericMethod("1", "2", "3", "4", "5");
        System.out.println(list);
    }

    public static <T> List<T> genericMethod(T... list) {
        return Stream.of(list)
                .collect(Collectors.toList());
    }
}
