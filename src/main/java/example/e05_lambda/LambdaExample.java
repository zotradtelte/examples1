package example.e05_lambda;

import java.util.ArrayList;

public class LambdaExample {

    /**
     * <a href="https://www.w3schools.com/java/java_lambda.asp">Java Lambda Expressions</a><br/>
     * A lambda expression is a short block of code which takes in parameters and returns a value.
     * Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
     * <img src="./img_1.png" />
     */
    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        //before
        for (var n : numbers) {
            System.out.println(n);
        }

        //after (lambda)
        numbers.forEach((n) -> System.out.println(n));

        //after (method reference)
        numbers.forEach(System.out::println);
    }
}
