package example.e04_exceptions;

public class ExceptionsExample {

    /**
     * <a href="https://www.w3schools.com/java/java_try_catch.asp">Java Exceptions - Try...Catch</a>
     */
    public static void main(String[] args) {
        //This will generate an error, because myNumbers[10] does not exist.
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
    }
}
