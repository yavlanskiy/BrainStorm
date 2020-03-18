package codewars;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an
 * isogram. Ignore letter case.
 */
public class Isograms {
    public static boolean  isIsogram(String str) {
        int count = 1;
        char a = ' ';

        for (int i = 0; i < str.length(); i++) {
            char c  = str.toCharArray()[i];
            if (c == a) {
                ++count;
            }
        }

        return count < 2;
    }

    public static void main(String[] args) {
        isIsogram("moose");
    }
}
