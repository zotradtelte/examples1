package example.e08_gradle;

import org.apache.commons.lang3.StringUtils;

public class GradleExample {

    /** <a href="https://www.tutorialspoint.com/gradle/index.htm">Gradle Tutorial</a><br/>
     * Gradle is an open source and advanced build automation tool. It builds up on ANT, Maven and lvy repositories and supports groovy based Domain Specific Language (DSL) over the XML. In this tutorial, you will learn about different tasks, plugins with regards to gradle. Moreover, how to build a JAVA project and Groovy project with the help of gradle is also explained in detail.<br/>
     *  <img src="./img_1.png"/>
     *  <img src="./img_2.png"/>
     */
    public static void main(String[] args) {
        //https://mvnrepository.com/artifact/org.apache.commons
        var longText = "Apache Commons Lang, a package of Java utility classes for the classes that are in java.lang's hierarchy, or are considered to be so standard as to justify existence in java.lang. The code is tested using the latest revision of the JDK for supported LTS releases: 8, 11, 17 and 21 currently.";
        var shortText = StringUtils.abbreviate(longText, 100);

        System.out.println(shortText);
    }
}
