package codewars;

import java.util.HashMap;

/**
 * You are given an input string.
 *
 * For each symbol in the string if it's the first character occurence, replace it with a '1', else replace it with the amount of times you've already seen it...
 *
 * But will your code be performant enough?
 *
 * Examples:
 * input   =  "Hello, World!"
 * result  =  "1112111121311"
 *
 * input   =  "aaaaaaaaaaaa"
 * result  =  "123456789101112"
 */
public class JomoPipi {
    public static String numericals(String s) {
        HashMap<Character,Integer> bufferMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (bufferMap.containsKey(temp)){
                int count = bufferMap.get(temp) + 1;
                bufferMap.put(temp, count);
                stringBuilder.append(count);
            } else {
                bufferMap.put(temp,1);
                stringBuilder.append(1);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(numericals("asda sdasdf"));
    }
}
