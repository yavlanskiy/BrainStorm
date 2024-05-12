package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
//        Pattern patten = Pattern.compile("\\d{3}");
//        Matcher matcher = patten.matcher("1234");
//        System.out.println("matcher = " + matcher.matches());

        String phoneNumber = "+375 (29) 898-12-13";
        String regEx = "\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}";
        boolean matches = Pattern.matches(regEx, phoneNumber);
        System.out.println("phoneNumber = " + matches);


    }
}
