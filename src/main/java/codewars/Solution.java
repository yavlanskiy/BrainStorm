package codewars;

public class Solution {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
