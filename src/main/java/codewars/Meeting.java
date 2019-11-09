package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
 */
public class Meeting {
    public static String meeting(String rawString) {
        return Arrays
                .stream(rawString.toUpperCase().split(";"))
                .map(s -> s.replaceAll("(\\w+):(\\w+)","($2, $1)")).sorted()
                .collect(Collectors.joining(""));
    }

    public static void main(String[] args) {
         String s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";

        System.out.println(meeting(s));
    }
}
