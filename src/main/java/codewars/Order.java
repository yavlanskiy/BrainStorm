package codewars;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
                .reduce((a, b) -> a + " " + b).get();
    }

    public static void main(String[] args) {
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
    }
}
