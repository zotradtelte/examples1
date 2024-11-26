package example.e07_regex;

import java.util.List;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class RegexExample {

    /**
     * <a href="https://www.w3schools.com/java/java_regex.asp">Java Regular Expressions</a><br/>
     * <a href="https://regex101.com/" >regex101.com</a><br/>
     * A regular expression is a sequence of characters that forms a search pattern. When you search for data in a text, you can use this search pattern to describe what you are searching for.
     * A regular expression can be a single character, or a more complicated pattern.
     * Regular expressions can be used to perform all types of text search and text replace operations.
     * <img src="./img_1.png" />
     * <img src="./img_2.jpg" />
     * <img src="./img_3.jpg" />
     */
    public static void main(String[] args) {
        var emails = List.of("kellie_keeling@hotmail.com",
                "enid_wolff@gmail.com",
                "jody.barrows@gmail.com",
                "darrel.cronin26@hotmail.com",
                "mathias.kuvalis90@yahoo.com",
                "gretchen35@yahoo.com",
                "clarissa_kunde63@hotmail.com",
                "maida29@gmail.com",
                "morgan97@hotmail.com",
                "vince_damore@gmail.com",
                "anya8@yahoo.com",
                "libby_schumm6@hotmail.com",
                "kari31@gmail.com",
                "myrna.ritchie@yahoo.com",
                "harmon.runte@yahoo.com",
                "brionna62@yahoo.com",
                "evalyn_oreilly69@gmail.com",
                "richard.brown@hotmail.com",
                "abe2@yahoo.com",
                "ron86@hotmail.com",

                "!%ron86@hotmail.com"
        );

        var validEmails = emails.stream()
                .filter(RegexExample::isValidEmailAddress)
                .collect(toList());

        //https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf
        System.out.printf("%nFound '%s' invalid email address(-es)%n", emails.size() - validEmails.size());
    }

    private static boolean isValidEmailAddress(String email) {
        var pattern = Pattern.compile("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", Pattern.CASE_INSENSITIVE);
        var matcher = pattern.matcher(email);
        var matchFound = matcher.find();

        if (matchFound) {
            System.out.printf("Match found '%s'%n", email);
            return true;
        } else {
            System.out.printf("Match not found '%s'%n", email);
            return false;
        }
    }
}
