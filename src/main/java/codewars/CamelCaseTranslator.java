package codewars;

public class CamelCaseTranslator {
    public static String toUnderScore(String name) {
        return name.replaceAll("(?<=[^_-])_?(?=[A-Z])|(?<=[^\\d_])_?(?=\\d)","_");
    }
}
