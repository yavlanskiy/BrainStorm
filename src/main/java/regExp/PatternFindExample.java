package regExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    public static void main(String[] args) {
        String phoneNumber = "sadasdas +375 (19) 898-12-13asdadsdas +375 (30) 898-12-13 asdasdasdas" +
                "asdasdasfsaf +375 (31) 898-12-13 asdasdsd123123+375 (32) 898-12-13";
        String regEx = "\\+375 \\(\\d{2}\\) \\d{3}-\\d{2}-\\d{2}";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            System.out.println("matcher = " + matcher.group());
        }
    }
}
